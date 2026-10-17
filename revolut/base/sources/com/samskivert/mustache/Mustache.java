package com.samskivert.mustache;

import ch.qos.logback.core.CoreConstants;
import com.samskivert.mustache.MustacheException;
import com.samskivert.mustache.Template;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p.a;

/* JADX INFO: loaded from: classes12.dex */
public class Mustache {
    protected static final int MATCHING_END = 2;
    protected static final int MATCHING_START = 1;
    protected static final char NO_CHAR = 0;
    protected static final int TAG = 3;
    protected static final int TEXT = 0;
    protected static final TemplateLoader FAILING_LOADER = new TemplateLoader() { // from class: com.samskivert.mustache.Mustache.1
        @Override // com.samskivert.mustache.Mustache.TemplateLoader
        public Reader getTemplate(String str) {
            throw new UnsupportedOperationException("Template loading not configured");
        }
    };
    protected static final Formatter DEFAULT_FORMATTER = new Formatter() { // from class: com.samskivert.mustache.Mustache.2
        @Override // com.samskivert.mustache.Mustache.Formatter
        public String format(Object obj2) {
            return String.valueOf(obj2);
        }
    };

    public static class Accumulator {
        protected final Compiler _comp;
        protected final List<Template.Segment> _segs = new ArrayList();
        protected final boolean _topLevel;

        public Accumulator(Compiler compiler, boolean z) {
            this._comp = compiler;
            this._topLevel = z;
        }

        public static void requireNoNewlines(String str, int i) {
            if (str.indexOf(10) != -1 || str.indexOf(13) != -1) {
                throw new MustacheParseException(a.p("Invalid tag name: contains newline '", str, "'"), i);
            }
        }

        public static void requireSameName(String str, String str2, int i) {
            if (!str.equals(str2)) {
                throw new MustacheParseException(j6.a.s("Section close tag with mismatched open tag '", str2, "' != '", str, "'"), i);
            }
        }

        public Accumulator addCloseSectionSegment(String str, int i) {
            throw new MustacheParseException(a.p("Section close tag with no open tag '", str, "'"), i);
        }

        public void addFauxSegment() {
            this._segs.add(new FauxSegment());
        }

        public Accumulator addTagSegment(StringBuilder sb6, final int i) {
            String strTrim = sb6.toString().trim();
            final String strTrim2 = strTrim.substring(1).trim();
            sb6.setLength(0);
            char cCharAt = strTrim.charAt(0);
            if (cCharAt == '!') {
                this._segs.add(new FauxSegment());
                return this;
            }
            if (cCharAt == '#') {
                requireNoNewlines(strTrim, i);
                return new Accumulator(this._comp, false) { // from class: com.samskivert.mustache.Mustache.Accumulator.1
                    @Override // com.samskivert.mustache.Mustache.Accumulator
                    public Accumulator addCloseSectionSegment(String str, int i2) {
                        Accumulator.requireSameName(strTrim2, str, i2);
                        this._segs.add(new SectionSegment(this._comp, str, super.finish(), i));
                        return this;
                    }

                    @Override // com.samskivert.mustache.Mustache.Accumulator
                    public Template.Segment[] finish() {
                        throw new MustacheParseException(v0.a.i(new StringBuilder("Section missing close tag '"), strTrim2, "'"), i);
                    }
                };
            }
            if (cCharAt == '&') {
                requireNoNewlines(strTrim, i);
                this._segs.add(new VariableSegment(strTrim2, i, this._comp.formatter, Escapers.NONE));
                return this;
            }
            if (cCharAt == '/') {
                requireNoNewlines(strTrim, i);
                return addCloseSectionSegment(strTrim2, i);
            }
            if (cCharAt == '>') {
                this._segs.add(new IncludedTemplateSegment(this._comp, strTrim2));
                return this;
            }
            if (cCharAt == '^') {
                requireNoNewlines(strTrim, i);
                return new Accumulator(this._comp, false) { // from class: com.samskivert.mustache.Mustache.Accumulator.2
                    @Override // com.samskivert.mustache.Mustache.Accumulator
                    public Accumulator addCloseSectionSegment(String str, int i2) {
                        Accumulator.requireSameName(strTrim2, str, i2);
                        this._segs.add(new InvertedSegment(this._comp, str, super.finish(), i));
                        return this;
                    }

                    @Override // com.samskivert.mustache.Mustache.Accumulator
                    public Template.Segment[] finish() {
                        throw new MustacheParseException(v0.a.i(new StringBuilder("Inverted section missing close tag '"), strTrim2, "'"), i);
                    }
                };
            }
            requireNoNewlines(strTrim, i);
            List<Template.Segment> list = this._segs;
            Compiler compiler = this._comp;
            list.add(new VariableSegment(strTrim, i, compiler.formatter, compiler.escaper));
            return this;
        }

        public void addTextSegment(StringBuilder sb6) {
            if (sb6.length() > 0) {
                this._segs.add(new StringSegment(sb6.toString(), this._segs.isEmpty() && this._topLevel));
                sb6.setLength(0);
            }
        }

        public Template.Segment[] finish() {
            List<Template.Segment> list = this._segs;
            return (Template.Segment[]) list.toArray(new Template.Segment[list.size()]);
        }
    }

    public static abstract class BlockSegment extends NamedSegment {
        protected final Template.Segment[] _segs;

        public BlockSegment(String str, Template.Segment[] segmentArr, int i) {
            super(str, i);
            this._segs = Mustache.trim(segmentArr, false);
        }

        public void executeSegs(Template template, Template.Context context, Writer writer) {
            for (Template.Segment segment : this._segs) {
                segment.execute(template, context, writer);
            }
        }

        public boolean firstLeadsBlank() {
            Template.Segment[] segmentArr = this._segs;
            if (segmentArr.length != 0) {
                Template.Segment segment = segmentArr[0];
                if (segment instanceof StringSegment) {
                    return ((StringSegment) segment).leadsBlank();
                }
            }
            return false;
        }

        public boolean lastTrailsBlank() {
            Template.Segment[] segmentArr = this._segs;
            int length = segmentArr.length - 1;
            if (segmentArr.length == 0) {
                return false;
            }
            Template.Segment segment = segmentArr[length];
            if (segment instanceof StringSegment) {
                return ((StringSegment) segment).trailsBlank();
            }
            return false;
        }

        public void trimFirstBlank() {
            Template.Segment[] segmentArr = this._segs;
            segmentArr[0] = ((StringSegment) segmentArr[0]).trimLeadBlank();
        }

        public void trimLastBlank() {
            Template.Segment[] segmentArr = this._segs;
            int length = segmentArr.length - 1;
            segmentArr[length] = ((StringSegment) segmentArr[length]).trimTrailBlank();
        }
    }

    public interface Collector {
        VariableFetcher createFetcher(Object obj2, String str);

        <K, V> Map<K, V> createFetcherCache();

        Iterator<?> toIterator(Object obj2);
    }

    public static class Compiler {
        public final Collector collector;
        public final Delims delims;
        public final boolean emptyStringIsFalse;
        public final Escaper escaper;
        public final Formatter formatter;
        public final TemplateLoader loader;
        public final boolean missingIsNull;
        public final String nullValue;
        public final boolean standardsMode;
        public final boolean strictSections;
        public final boolean zeroIsFalse;

        public Compiler(boolean z, boolean z3, String str, boolean z4, boolean z6, boolean z11, Formatter formatter, Escaper escaper, TemplateLoader templateLoader, Collector collector, Delims delims) {
            this.standardsMode = z;
            this.strictSections = z3;
            this.nullValue = str;
            this.missingIsNull = z4;
            this.emptyStringIsFalse = z6;
            this.zeroIsFalse = z11;
            this.formatter = formatter;
            this.escaper = escaper;
            this.loader = templateLoader;
            this.collector = collector;
            this.delims = delims;
        }

        public Template compile(String str) {
            return compile(new StringReader(str));
        }

        public String computeNullValue(String str) {
            String str2 = this.nullValue;
            if (str2 == null) {
                return null;
            }
            return str2.replace("{{name}}", str);
        }

        public Compiler defaultValue(String str) {
            return new Compiler(this.standardsMode, this.strictSections, str, true, this.emptyStringIsFalse, this.zeroIsFalse, this.formatter, this.escaper, this.loader, this.collector, this.delims);
        }

        public Compiler emptyStringIsFalse(boolean z) {
            return new Compiler(this.standardsMode, this.strictSections, this.nullValue, this.missingIsNull, z, this.zeroIsFalse, this.formatter, this.escaper, this.loader, this.collector, this.delims);
        }

        public Compiler escapeHTML(boolean z) {
            return withEscaper(z ? Escapers.HTML : Escapers.NONE);
        }

        public boolean isFalsey(Object obj2) {
            if (this.emptyStringIsFalse && "".equals(obj2)) {
                return true;
            }
            return this.zeroIsFalse && (obj2 instanceof Number) && ((Number) obj2).longValue() == 0;
        }

        public Compiler nullValue(String str) {
            return new Compiler(this.standardsMode, this.strictSections, str, false, this.emptyStringIsFalse, this.zeroIsFalse, this.formatter, this.escaper, this.loader, this.collector, this.delims);
        }

        public Compiler standardsMode(boolean z) {
            return new Compiler(z, this.strictSections, this.nullValue, this.missingIsNull, this.emptyStringIsFalse, this.zeroIsFalse, this.formatter, this.escaper, this.loader, this.collector, this.delims);
        }

        public Compiler strictSections(boolean z) {
            return new Compiler(this.standardsMode, z, this.nullValue, this.missingIsNull, this.emptyStringIsFalse, this.zeroIsFalse, this.formatter, this.escaper, this.loader, this.collector, this.delims);
        }

        public Compiler withCollector(Collector collector) {
            return new Compiler(this.standardsMode, this.strictSections, this.nullValue, this.missingIsNull, this.emptyStringIsFalse, this.zeroIsFalse, this.formatter, this.escaper, this.loader, collector, this.delims);
        }

        public Compiler withDelims(String str) {
            return new Compiler(this.standardsMode, this.strictSections, this.nullValue, this.missingIsNull, this.emptyStringIsFalse, this.zeroIsFalse, this.formatter, this.escaper, this.loader, this.collector, new Delims().updateDelims(str));
        }

        public Compiler withEscaper(Escaper escaper) {
            return new Compiler(this.standardsMode, this.strictSections, this.nullValue, this.missingIsNull, this.emptyStringIsFalse, this.zeroIsFalse, this.formatter, escaper, this.loader, this.collector, this.delims);
        }

        public Compiler withFormatter(Formatter formatter) {
            return new Compiler(this.standardsMode, this.strictSections, this.nullValue, this.missingIsNull, this.emptyStringIsFalse, this.zeroIsFalse, formatter, this.escaper, this.loader, this.collector, this.delims);
        }

        public Compiler withLoader(TemplateLoader templateLoader) {
            return new Compiler(this.standardsMode, this.strictSections, this.nullValue, this.missingIsNull, this.emptyStringIsFalse, this.zeroIsFalse, this.formatter, this.escaper, templateLoader, this.collector, this.delims);
        }

        public Compiler zeroIsFalse(boolean z) {
            return new Compiler(this.standardsMode, this.strictSections, this.nullValue, this.missingIsNull, this.emptyStringIsFalse, z, this.formatter, this.escaper, this.loader, this.collector, this.delims);
        }

        public Template compile(Reader reader) {
            return Mustache.compile(reader, this);
        }
    }

    public static class Delims {
        public char start1 = CoreConstants.CURLY_LEFT;
        public char end1 = CoreConstants.CURLY_RIGHT;
        public char start2 = CoreConstants.CURLY_LEFT;
        public char end2 = CoreConstants.CURLY_RIGHT;

        private static String errmsg(String str) {
            return a.p("Invalid delimiter configuration '", str, "'. Must be of the form {{=1 2=}} or {{=12 34=}} where 1, 2, 3 and 4 are delimiter chars.");
        }

        public Delims copy() {
            Delims delims = new Delims();
            delims.start1 = this.start1;
            delims.start2 = this.start2;
            delims.end1 = this.end1;
            delims.end2 = this.end2;
            return delims;
        }

        public boolean isStaches() {
            return this.start1 == '{' && this.start2 == '{' && this.end1 == '}' && this.end2 == '}';
        }

        public Delims updateDelims(String str) {
            String[] strArrSplit = str.split(" ");
            if (strArrSplit.length != 2) {
                throw new MustacheException(errmsg(str));
            }
            int length = strArrSplit[0].length();
            if (length == 1) {
                this.start1 = strArrSplit[0].charAt(0);
                this.start2 = (char) 0;
            } else {
                if (length != 2) {
                    throw new MustacheException(errmsg(str));
                }
                this.start1 = strArrSplit[0].charAt(0);
                this.start2 = strArrSplit[0].charAt(1);
            }
            int length2 = strArrSplit[1].length();
            if (length2 == 1) {
                this.end1 = strArrSplit[1].charAt(0);
                this.end2 = (char) 0;
                return this;
            }
            if (length2 != 2) {
                throw new MustacheException(errmsg(str));
            }
            this.end1 = strArrSplit[1].charAt(0);
            this.end2 = strArrSplit[1].charAt(1);
            return this;
        }
    }

    public interface Escaper {
        String escape(String str);
    }

    public static class FauxSegment extends Template.Segment {
        @Override // com.samskivert.mustache.Template.Segment
        public void execute(Template template, Template.Context context, Writer writer) {
        }

        public String toString() {
            return "Faux";
        }
    }

    public interface Formatter {
        String format(Object obj2);
    }

    public static class IncludedTemplateSegment extends Template.Segment {
        protected final Compiler _comp;
        protected final String _name;
        protected Template _template;

        public IncludedTemplateSegment(Compiler compiler, String str) {
            this._comp = compiler;
            this._name = str;
        }

        @Override // com.samskivert.mustache.Template.Segment
        public void execute(Template template, Template.Context context, Writer writer) {
            if (this._template == null) {
                Reader template2 = null;
                try {
                    try {
                        template2 = this._comp.loader.getTemplate(this._name);
                        this._template = this._comp.compile(template2);
                        if (template2 != null) {
                            try {
                                template2.close();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    } catch (Exception e2) {
                        if (e2 instanceof RuntimeException) {
                            throw ((RuntimeException) e2);
                        }
                        throw new MustacheException("Unable to load template: " + this._name, e2);
                    }
                } catch (Throwable th10) {
                    if (template2 != null) {
                        try {
                            template2.close();
                        } catch (IOException e4) {
                            throw new RuntimeException(e4);
                        }
                    }
                    throw th10;
                }
            }
            this._template.executeSegs(context, writer);
        }
    }

    public static class InvertedSegment extends BlockSegment {
        protected final Compiler _comp;

        public InvertedSegment(Compiler compiler, String str, Template.Segment[] segmentArr, int i) {
            super(str, segmentArr, i);
            this._comp = compiler;
        }

        @Override // com.samskivert.mustache.Template.Segment
        public void execute(Template template, Template.Context context, Writer writer) {
            Object sectionValue = template.getSectionValue(context, this._name, this._line);
            Iterator<?> iterator = this._comp.collector.toIterator(sectionValue);
            if (iterator != null) {
                if (iterator.hasNext()) {
                    return;
                }
                executeSegs(template, context, writer);
            } else if (sectionValue instanceof Boolean) {
                if (((Boolean) sectionValue).booleanValue()) {
                    return;
                }
                executeSegs(template, context, writer);
            } else if (sectionValue instanceof InvertibleLambda) {
                try {
                    ((InvertibleLambda) sectionValue).executeInverse(template.createFragment(this._segs, context), writer);
                } catch (IOException e) {
                    throw new MustacheException(e);
                }
            } else if (this._comp.isFalsey(sectionValue)) {
                executeSegs(template, context, writer);
            }
        }

        public String toString() {
            return "Inverted(" + this._name + ":" + this._line + "): " + Arrays.toString(this._segs);
        }
    }

    public interface InvertibleLambda extends Lambda {
        void executeInverse(Template.Fragment fragment, Writer writer) throws IOException;
    }

    public interface Lambda {
        void execute(Template.Fragment fragment, Writer writer) throws IOException;
    }

    public static abstract class NamedSegment extends Template.Segment {
        protected final int _line;
        protected final String _name;

        public NamedSegment(String str, int i) {
            this._name = str.intern();
            this._line = i;
        }
    }

    public static class Parser {
        Accumulator accum;
        final Delims delims;
        Reader source;
        final StringBuilder text = new StringBuilder();
        int state = 0;
        int line = 1;
        int column = 0;
        int tagStartColumn = -1;

        public Parser(Compiler compiler) {
            this.accum = new Accumulator(compiler, true);
            this.delims = compiler.delims.copy();
        }

        public int nextChar() {
            try {
                return this.source.read();
            } catch (IOException e) {
                throw new MustacheException(e);
            }
        }

        public Accumulator parse(Reader reader) {
            this.source = reader;
            while (true) {
                int iNextChar = nextChar();
                if (iNextChar == -1) {
                    break;
                }
                char c2 = (char) iNextChar;
                this.column++;
                parseChar(c2);
                if (c2 == '\n') {
                    this.column = 0;
                    this.line++;
                }
            }
            int i = this.state;
            if (i == 1) {
                this.text.append(this.delims.start1);
            } else if (i == 2) {
                Mustache.restoreStartTag(this.text, this.delims);
                this.text.append(this.delims.end1);
            } else if (i == 3) {
                Mustache.restoreStartTag(this.text, this.delims);
            }
            this.accum.addTextSegment(this.text);
            return this.accum;
        }

        public void parseChar(char c2) {
            int i = this.state;
            if (i == 0) {
                Delims delims = this.delims;
                if (c2 != delims.start1) {
                    this.text.append(c2);
                    return;
                }
                this.state = 1;
                this.tagStartColumn = this.column;
                if (delims.start2 == 0) {
                    parseChar((char) 0);
                    return;
                }
                return;
            }
            if (i == 1) {
                Delims delims2 = this.delims;
                if (c2 == delims2.start2) {
                    this.accum.addTextSegment(this.text);
                    this.state = 3;
                    return;
                } else {
                    this.text.append(delims2.start1);
                    this.state = 0;
                    parseChar(c2);
                    return;
                }
            }
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                Delims delims3 = this.delims;
                if (c2 == delims3.end1) {
                    this.state = 2;
                    if (delims3.end2 == 0) {
                        parseChar((char) 0);
                        return;
                    }
                    return;
                }
                if (c2 != delims3.start1 || this.text.length() <= 0 || this.text.charAt(0) == '!') {
                    this.text.append(c2);
                    return;
                }
                Mustache.restoreStartTag(this.text, this.delims);
                this.accum.addTextSegment(this.text);
                this.tagStartColumn = this.column;
                if (this.delims.start2 != 0) {
                    this.state = 1;
                    return;
                } else {
                    this.accum.addTextSegment(this.text);
                    this.state = 3;
                    return;
                }
            }
            Delims delims4 = this.delims;
            if (c2 != delims4.end2) {
                this.text.append(delims4.end1);
                this.state = 3;
                parseChar(c2);
                return;
            }
            if (this.text.charAt(0) == '=') {
                Delims delims5 = this.delims;
                StringBuilder sb6 = this.text;
                delims5.updateDelims(sb6.substring(1, sb6.length() - 1));
                this.text.setLength(0);
                this.accum.addFauxSegment();
            } else {
                if (this.delims.isStaches() && this.text.charAt(0) == this.delims.start1) {
                    int iNextChar = nextChar();
                    if (iNextChar != 125) {
                        throw new MustacheParseException("Invalid triple-mustache tag: {{" + ((Object) this.text) + "}}" + (iNextChar == -1 ? "" : String.valueOf((char) iNextChar)), this.line);
                    }
                    this.text.replace(0, 1, "&");
                }
                this.accum = this.accum.addTagSegment(this.text, this.line);
            }
            this.state = 0;
        }
    }

    public static class SectionSegment extends BlockSegment {
        protected final Compiler _comp;

        public SectionSegment(Compiler compiler, String str, Template.Segment[] segmentArr, int i) {
            super(str, segmentArr, i);
            this._comp = compiler;
        }

        @Override // com.samskivert.mustache.Template.Segment
        public void execute(Template template, Template.Context context, Writer writer) {
            Object sectionValue = template.getSectionValue(context, this._name, this._line);
            Iterator<?> iterator = this._comp.collector.toIterator(sectionValue);
            if (iterator != null) {
                int i = 0;
                while (iterator.hasNext()) {
                    Object next = iterator.next();
                    boolean z = i == 0;
                    i++;
                    executeSegs(template, context.nest(next, i, z, true ^ iterator.hasNext()), writer);
                }
                return;
            }
            if (sectionValue instanceof Boolean) {
                if (((Boolean) sectionValue).booleanValue()) {
                    executeSegs(template, context, writer);
                }
            } else if (sectionValue instanceof Lambda) {
                try {
                    ((Lambda) sectionValue).execute(template.createFragment(this._segs, context), writer);
                } catch (IOException e) {
                    throw new MustacheException(e);
                }
            } else {
                if (this._comp.isFalsey(sectionValue)) {
                    return;
                }
                executeSegs(template, context.nest(sectionValue, 0, false, false), writer);
            }
        }

        public String toString() {
            return "Section(" + this._name + ":" + this._line + "): " + Arrays.toString(this._segs);
        }
    }

    public static class StringSegment extends Template.Segment {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        protected final int _leadBlank;
        protected final String _text;
        protected final int _trailBlank;

        public StringSegment(String str, boolean z) {
            this(str, blankPos(str, true, z), blankPos(str, false, z));
        }

        private static int blankPos(String str, boolean z, boolean z3) {
            int length = str.length();
            if (!z) {
                length = -1;
            }
            int i = z ? 1 : -1;
            for (int i2 = z ? 0 : length - 1; i2 != length; i2 += i) {
                char cCharAt = str.charAt(i2);
                if (cCharAt == '\n') {
                    return z ? i2 : i2 + 1;
                }
                if (!Character.isWhitespace(cCharAt)) {
                    return -1;
                }
            }
            return (z || !z3) ? -1 : 0;
        }

        @Override // com.samskivert.mustache.Template.Segment
        public void execute(Template template, Template.Context context, Writer writer) {
            Template.Segment.write(writer, this._text);
        }

        public boolean leadsBlank() {
            return this._leadBlank != -1;
        }

        public String toString() {
            return "Text(" + this._text.replace("\r", "\\r").replace("\n", "\\n") + ")" + this._leadBlank + "/" + this._trailBlank;
        }

        public boolean trailsBlank() {
            return this._trailBlank != -1;
        }

        public StringSegment trimLeadBlank() {
            int i = this._leadBlank;
            if (i == -1) {
                return this;
            }
            int i2 = i + 1;
            int i3 = this._trailBlank;
            return new StringSegment(this._text.substring(i2), -1, i3 == -1 ? -1 : i3 - i2);
        }

        public StringSegment trimTrailBlank() {
            int i = this._trailBlank;
            return i == -1 ? this : new StringSegment(this._text.substring(0, i), this._leadBlank, -1);
        }

        public StringSegment(String str, int i, int i2) {
            this._text = str;
            this._leadBlank = i;
            this._trailBlank = i2;
        }
    }

    public interface TemplateLoader {
        Reader getTemplate(String str) throws Exception;
    }

    public interface VariableFetcher {
        Object get(Object obj2, String str) throws Exception;
    }

    public static class VariableSegment extends NamedSegment {
        protected final Escaper _escaper;
        protected final Formatter _formatter;

        public VariableSegment(String str, int i, Formatter formatter, Escaper escaper) {
            super(str, i);
            this._formatter = formatter;
            this._escaper = escaper;
        }

        @Override // com.samskivert.mustache.Template.Segment
        public void execute(Template template, Template.Context context, Writer writer) {
            Object valueOrDefault = template.getValueOrDefault(context, this._name, this._line);
            if (valueOrDefault != null) {
                Template.Segment.write(writer, this._escaper.escape(this._formatter.format(valueOrDefault)));
                return;
            }
            throw new MustacheException.Context("No key, method or field with name '" + this._name + "' on line " + this._line, this._name, this._line);
        }

        public String toString() {
            StringBuilder sb6 = new StringBuilder("Var(");
            sb6.append(this._name);
            sb6.append(":");
            return j6.a.v(sb6, ")", this._line);
        }
    }

    private Mustache() {
    }

    public static boolean allowsWhitespace(char c2) {
        return c2 == '=' || c2 == '!';
    }

    public static Template compile(Reader reader, Compiler compiler) {
        return new Template(trim(new Parser(compiler).parse(reader).finish(), true), compiler);
    }

    public static Compiler compiler() {
        return new Compiler(false, false, null, false, false, false, DEFAULT_FORMATTER, Escapers.HTML, FAILING_LOADER, new DefaultCollector(), new Delims());
    }

    public static void restoreStartTag(StringBuilder sb6, Delims delims) {
        sb6.insert(0, delims.start1);
        char c2 = delims.start2;
        if (c2 != 0) {
            sb6.insert(1, c2);
        }
    }

    public static Template.Segment[] trim(Template.Segment[] segmentArr, boolean z) {
        int length = segmentArr.length;
        int i = 0;
        while (i < length) {
            Template.Segment segment = segmentArr[i];
            Template.Segment segment2 = i > 0 ? segmentArr[i - 1] : null;
            Template.Segment segment3 = i < length + (-1) ? segmentArr[i + 1] : null;
            StringSegment stringSegment = segment2 instanceof StringSegment ? (StringSegment) segment2 : null;
            StringSegment stringSegment2 = segment3 instanceof StringSegment ? (StringSegment) segment3 : null;
            boolean z3 = true;
            boolean z4 = (segment2 == null && z) || (stringSegment != null && stringSegment.trailsBlank());
            if ((segment3 != null || !z) && (stringSegment2 == null || !stringSegment2.leadsBlank())) {
                z3 = false;
            }
            if (segment instanceof BlockSegment) {
                BlockSegment blockSegment = (BlockSegment) segment;
                if (z4 && blockSegment.firstLeadsBlank()) {
                    if (segment2 != null) {
                        segmentArr[i - 1] = stringSegment.trimTrailBlank();
                    }
                    blockSegment.trimFirstBlank();
                }
                if (z3 && blockSegment.lastTrailsBlank()) {
                    blockSegment.trimLastBlank();
                    if (segment3 != null) {
                        segmentArr[i + 1] = stringSegment2.trimLeadBlank();
                    }
                }
            } else if ((segment instanceof FauxSegment) && z4 && z3) {
                if (segment2 != null) {
                    segmentArr[i - 1] = stringSegment.trimTrailBlank();
                }
                if (segment3 != null) {
                    segmentArr[i + 1] = stringSegment2.trimLeadBlank();
                }
            }
            i++;
        }
        return segmentArr;
    }
}
