package org.jmrtd;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class PACEException extends CardServiceProtocolException {
    private static final long serialVersionUID = 8383980807753919040L;

    public PACEException(String str, int i) {
        super(str, i);
    }

    public PACEException(String str, int i, Throwable th10) {
        super(str, i, th10);
    }

    public PACEException(String str, int i, int i2) {
        super(str, i, i2);
    }

    public PACEException(String str, int i, Throwable th10, int i2) {
        super(str, i, th10, i2);
    }
}
