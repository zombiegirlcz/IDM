package org.bouncycastle.jce.provider;

/* JADX INFO: loaded from: classes14.dex */
public class PKIXNameConstraintValidatorException extends Exception {
    private Throwable cause;

    public PKIXNameConstraintValidatorException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public PKIXNameConstraintValidatorException(String str, Throwable th10) {
        super(str);
        this.cause = th10;
    }
}
