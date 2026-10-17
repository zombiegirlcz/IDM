package com.samskivert.mustache;

import com.samskivert.mustache.Mustache;
import com.samskivert.mustache.MustacheException;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.Map;
import v0.a;
import v1.c;

/* JADX INFO: loaded from: classes12.dex */
public class Template {
    protected final Mustache.Compiler _compiler;
    protected final Map<Key, Mustache.VariableFetcher> _fcache;
    protected final Segment[] _segs;
    public static final Object NO_FETCHER_FOUND = new Object();
    protected static final String DOT_NAME = ".".intern();
    protected static final String THIS_NAME = "this".intern();
    protected static final String FIRST_NAME = "-first".intern();
    protected static final String LAST_NAME = "-last".intern();
    protected static final String INDEX_NAME = "-index".intern();
    protected static Mustache.VariableFetcher NOT_FOUND_FETCHER = new Mustache.VariableFetcher() { // from class: com.samskivert.mustache.Template.2
        @Override // com.samskivert.mustache.Mustache.VariableFetcher
        public Object get(Object obj2, String str) throws Exception {
            return Template.NO_FETCHER_FOUND;
        }
    };

    public static class Context {
        public final Object data;
        public final int index;
        public final boolean onFirst;
        public final boolean onLast;
        public final Context parent;

        public Context(Object obj2, Context context, int i, boolean z, boolean z3) {
            this.data = obj2;
            this.parent = context;
            this.index = i;
            this.onFirst = z;
            this.onLast = z3;
        }

        public Context nest(Object obj2, int i, boolean z, boolean z3) {
            return new Context(obj2, this, i, z, z3);
        }
    }

    public static class Key {
        public final Class<?> cclass;
        public final String name;

        public Key(Class<?> cls, String str) {
            this.cclass = cls;
            this.name = str;
        }

        public boolean equals(Object obj2) {
            Key key = (Key) obj2;
            return key.cclass == this.cclass && key.name == this.name;
        }

        public int hashCode() {
            return this.name.hashCode() + (this.cclass.hashCode() * 31);
        }
    }

    public static abstract class Segment {
        public static void write(Writer writer, String str) {
            try {
                writer.write(str);
            } catch (IOException e) {
                throw new MustacheException(e);
            }
        }

        public abstract void execute(Template template, Context context, Writer writer);
    }

    public Template(Segment[] segmentArr, Mustache.Compiler compiler) {
        this._segs = segmentArr;
        this._compiler = compiler;
        this._fcache = compiler.collector.createFetcherCache();
    }

    public Object checkForMissing(String str, int i, boolean z, Object obj2) {
        if (obj2 != NO_FETCHER_FOUND) {
            return obj2;
        }
        if (z) {
            return null;
        }
        throw new MustacheException.Context(c.t(i, "No method or field with name '", str, "' on line "), str, i);
    }

    public Fragment createFragment(final Segment[] segmentArr, final Context context) {
        return new Fragment() { // from class: com.samskivert.mustache.Template.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.samskivert.mustache.Template.Fragment
            public Object context() {
                return context.data;
            }

            @Override // com.samskivert.mustache.Template.Fragment
            public void execute(Writer writer) {
                execute(context, writer);
            }

            @Override // com.samskivert.mustache.Template.Fragment
            public void execute(Object obj2, Writer writer) {
                execute(context.nest(obj2, 0, false, false), writer);
            }

            private void execute(Context context2, Writer writer) {
                for (Segment segment : segmentArr) {
                    segment.execute(Template.this, context2, writer);
                }
            }
        };
    }

    public String execute(Object obj2) throws MustacheException {
        StringWriter stringWriter = new StringWriter();
        execute(obj2, stringWriter);
        return stringWriter.toString();
    }

    public void executeSegs(Context context, Writer writer) throws MustacheException {
        for (Segment segment : this._segs) {
            segment.execute(this, context, writer);
        }
    }

    public Object getCompoundValue(Context context, String str, int i, boolean z) {
        String[] strArrSplit = str.split("\\.");
        Object value = getValue(context, strArrSplit[0].intern(), i, z);
        for (int i2 = 1; i2 < strArrSplit.length; i2++) {
            if (value == NO_FETCHER_FOUND) {
                if (z) {
                    return null;
                }
                throw new MustacheException.Context(a.i(a.k(i, "Missing context for compound variable '", str, "' on line ", ". '"), strArrSplit[i2 - 1], "' was not found."), str, i);
            }
            if (value == null) {
                return null;
            }
            value = getValueIn(value, strArrSplit[i2].intern(), i);
        }
        return checkForMissing(str, i, z, value);
    }

    public Object getSectionValue(Context context, String str, int i) {
        Object value = getValue(context, str, i, !this._compiler.strictSections);
        return value == null ? Collections.EMPTY_LIST : value;
    }

    public Object getValue(Context context, String str, int i, boolean z) {
        if (str == FIRST_NAME) {
            return Boolean.valueOf(context.onFirst);
        }
        if (str == LAST_NAME) {
            return Boolean.valueOf(context.onLast);
        }
        if (str == INDEX_NAME) {
            return Integer.valueOf(context.index);
        }
        if (this._compiler.standardsMode) {
            return checkForMissing(str, i, z, getValueIn(context.data, str, i));
        }
        for (Context context2 = context; context2 != null; context2 = context2.parent) {
            Object valueIn = getValueIn(context2.data, str, i);
            if (valueIn != NO_FETCHER_FOUND) {
                return valueIn;
            }
        }
        String str2 = DOT_NAME;
        return (str == str2 || str.indexOf(str2) == -1) ? checkForMissing(str, i, z, NO_FETCHER_FOUND) : getCompoundValue(context, str, i, z);
    }

    public Object getValueIn(Object obj2, String str, int i) {
        Mustache.VariableFetcher variableFetcherCreateFetcher;
        if (obj2 == null) {
            throw new NullPointerException(c.t(i, "Null context for variable '", str, "' on line "));
        }
        Key key = new Key(obj2.getClass(), str);
        Mustache.VariableFetcher variableFetcher = this._fcache.get(key);
        if (variableFetcher != null) {
            try {
                return variableFetcher.get(obj2, str);
            } catch (Exception unused) {
                variableFetcherCreateFetcher = this._compiler.collector.createFetcher(obj2, key.name);
            }
        } else {
            variableFetcherCreateFetcher = this._compiler.collector.createFetcher(obj2, key.name);
        }
        if (variableFetcherCreateFetcher == null) {
            variableFetcherCreateFetcher = NOT_FOUND_FETCHER;
        }
        try {
            Object obj3 = variableFetcherCreateFetcher.get(obj2, str);
            this._fcache.put(key, variableFetcherCreateFetcher);
            return obj3;
        } catch (Exception e) {
            throw new MustacheException.Context(c.t(i, "Failure fetching variable '", str, "' on line "), str, i, e);
        }
    }

    public Object getValueOrDefault(Context context, String str, int i) {
        Object value = getValue(context, str, i, this._compiler.missingIsNull);
        return value == null ? this._compiler.computeNullValue(str) : value;
    }

    public abstract class Fragment {
        public Fragment() {
        }

        public abstract Object context();

        public String execute() {
            StringWriter stringWriter = new StringWriter();
            execute((Writer) stringWriter);
            return stringWriter.toString();
        }

        public abstract void execute(Writer writer);

        public abstract void execute(Object obj2, Writer writer);

        public String execute(Object obj2) {
            StringWriter stringWriter = new StringWriter();
            execute(obj2, stringWriter);
            return stringWriter.toString();
        }
    }

    public void execute(Object obj2, Writer writer) throws MustacheException {
        executeSegs(new Context(obj2, null, 0, false, false), writer);
    }

    public void execute(Object obj2, Object obj3, Writer writer) throws MustacheException {
        executeSegs(new Context(obj2, new Context(obj3, null, 0, false, false), 0, false, false), writer);
    }
}
