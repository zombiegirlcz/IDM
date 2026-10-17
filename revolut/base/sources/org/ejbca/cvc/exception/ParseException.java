package org.ejbca.cvc.exception;

/* JADX INFO: loaded from: classes14.dex */
public class ParseException extends CvcException {
    private static final long serialVersionUID = 1;

    public ParseException() {
    }

    public ParseException(String str) {
        super(str);
    }

    public ParseException(Throwable th10) {
        super(th10);
    }

    public ParseException(String str, Throwable th10) {
        super(str, th10);
    }
}
