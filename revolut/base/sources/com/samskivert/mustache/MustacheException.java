package com.samskivert.mustache;

/* JADX INFO: loaded from: classes12.dex */
public class MustacheException extends RuntimeException {
    public MustacheException(String str) {
        super(str);
    }

    public MustacheException(Throwable th10) {
        super(th10);
    }

    public static class Context extends MustacheException {
        public final String key;
        public final int lineNo;

        public Context(String str, String str2, int i) {
            super(str);
            this.key = str2;
            this.lineNo = i;
        }

        public Context(String str, String str2, int i, Throwable th10) {
            super(str, th10);
            this.key = str2;
            this.lineNo = i;
        }
    }

    public MustacheException(String str, Throwable th10) {
        super(str, th10);
    }
}
