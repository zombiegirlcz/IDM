package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.parser.TokenStream;
import ch.qos.logback.core.pattern.util.AsIsEscapeUtil;
import ch.qos.logback.core.pattern.util.IEscapeUtil;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class OptionTokenizer {
    private static final int EXPECTING_STATE = 0;
    private static final int QUOTED_COLLECTING_STATE = 2;
    private static final int RAW_COLLECTING_STATE = 1;
    final IEscapeUtil escapeUtil;
    final String pattern;
    final int patternLength;
    char quoteChar;
    int state;
    final TokenStream tokenStream;

    public OptionTokenizer(TokenStream tokenStream) {
        this(tokenStream, new AsIsEscapeUtil());
    }

    public void emitOptionToken(List<Token> list, List<String> list2) {
        list.add(new Token(1006, list2));
        this.tokenStream.state = TokenStream.TokenizerState.LITERAL_STATE;
    }

    public void escape(String str, StringBuffer stringBuffer) {
        TokenStream tokenStream = this.tokenStream;
        int i = tokenStream.pointer;
        if (i < this.patternLength) {
            String str2 = this.pattern;
            tokenStream.pointer = i + 1;
            this.escapeUtil.escape(str, stringBuffer, str2.charAt(i), this.tokenStream.pointer);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        r1.add(r0.toString().trim());
        emitOptionToken(r10, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void tokenize(char r9, java.util.List<ch.qos.logback.core.pattern.parser.Token> r10) throws ch.qos.logback.core.spi.ScanException {
        /*
            r8 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        La:
            ch.qos.logback.core.pattern.parser.TokenStream r2 = r8.tokenStream
            int r2 = r2.pointer
            int r3 = r8.patternLength
            r4 = 125(0x7d, float:1.75E-43)
            r5 = 1
            if (r2 >= r3) goto L9e
            int r2 = r8.state
            r3 = 44
            r6 = 2
            if (r2 == 0) goto L61
            r7 = 0
            if (r2 == r5) goto L44
            if (r2 == r6) goto L23
            goto L8b
        L23:
            char r2 = r8.quoteChar
            if (r9 != r2) goto L34
            java.lang.String r9 = r0.toString()
        L2b:
            r1.add(r9)
            r0.setLength(r7)
            r8.state = r7
            goto L8b
        L34:
            r3 = 92
            if (r9 != r3) goto L40
            java.lang.String r9 = java.lang.String.valueOf(r2)
            r8.escape(r9, r0)
            goto L8b
        L40:
            r0.append(r9)
            goto L8b
        L44:
            if (r9 == r3) goto L58
            if (r9 == r4) goto L49
            goto L40
        L49:
            java.lang.String r9 = r0.toString()
            java.lang.String r9 = r9.trim()
            r1.add(r9)
            r8.emitOptionToken(r10, r1)
            return
        L58:
            java.lang.String r9 = r0.toString()
            java.lang.String r9 = r9.trim()
            goto L2b
        L61:
            r2 = 9
            if (r9 == r2) goto L8b
            r2 = 10
            if (r9 == r2) goto L8b
            r2 = 13
            if (r9 == r2) goto L8b
            r2 = 32
            if (r9 == r2) goto L8b
            r2 = 34
            if (r9 == r2) goto L87
            r2 = 39
            if (r9 == r2) goto L87
            if (r9 == r3) goto L8b
            if (r9 == r4) goto L83
            r0.append(r9)
            r8.state = r5
            goto L8b
        L83:
            r8.emitOptionToken(r10, r1)
            return
        L87:
            r8.state = r6
            r8.quoteChar = r9
        L8b:
            java.lang.String r9 = r8.pattern
            ch.qos.logback.core.pattern.parser.TokenStream r2 = r8.tokenStream
            int r2 = r2.pointer
            char r9 = r9.charAt(r2)
            ch.qos.logback.core.pattern.parser.TokenStream r2 = r8.tokenStream
            int r3 = r2.pointer
            int r3 = r3 + r5
            r2.pointer = r3
            goto La
        L9e:
            java.lang.String r2 = "Unexpected end of pattern string in OptionTokenizer"
            if (r9 != r4) goto Lb3
            int r9 = r8.state
            if (r9 != 0) goto Laa
            r8.emitOptionToken(r10, r1)
            return
        Laa:
            if (r9 != r5) goto Lad
            goto L49
        Lad:
            ch.qos.logback.core.spi.ScanException r9 = new ch.qos.logback.core.spi.ScanException
            r9.<init>(r2)
            throw r9
        Lb3:
            ch.qos.logback.core.spi.ScanException r9 = new ch.qos.logback.core.spi.ScanException
            r9.<init>(r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.qos.logback.core.pattern.parser.OptionTokenizer.tokenize(char, java.util.List):void");
    }

    public OptionTokenizer(TokenStream tokenStream, IEscapeUtil iEscapeUtil) {
        this.state = 0;
        this.tokenStream = tokenStream;
        this.pattern = tokenStream.pattern;
        this.patternLength = tokenStream.patternLength;
        this.escapeUtil = iEscapeUtil;
    }
}
