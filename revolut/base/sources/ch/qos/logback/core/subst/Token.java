package ch.qos.logback.core.subst;

import ch.qos.logback.core.CoreConstants;
import j6.a;

/* JADX INFO: loaded from: classes.dex */
public class Token {
    String payload;
    Type type;
    public static final Token START_TOKEN = new Token(Type.START, null);
    public static final Token CURLY_LEFT_TOKEN = new Token(Type.CURLY_LEFT, null);
    public static final Token CURLY_RIGHT_TOKEN = new Token(Type.CURLY_RIGHT, null);
    public static final Token DEFAULT_SEP_TOKEN = new Token(Type.DEFAULT, null);

    public enum Type {
        LITERAL,
        START,
        CURLY_LEFT,
        CURLY_RIGHT,
        DEFAULT
    }

    public Token(Type type, String str) {
        this.type = type;
        this.payload = str;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        Token token = (Token) obj2;
        if (this.type != token.type) {
            return false;
        }
        String str = this.payload;
        String str2 = token.payload;
        return str == null ? str2 == null : str.equals(str2);
    }

    public int hashCode() {
        Type type = this.type;
        int iHashCode = (type != null ? type.hashCode() : 0) * 31;
        String str = this.payload;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String strU = "Token{type=" + this.type;
        if (this.payload != null) {
            strU = a.u(v0.a.l(strU, ", payload='"), this.payload, CoreConstants.SINGLE_QUOTE_CHAR);
        }
        return strU + CoreConstants.CURLY_RIGHT;
    }
}
