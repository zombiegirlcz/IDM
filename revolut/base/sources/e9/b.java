package e9;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.core.n;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes16.dex */
public abstract class b extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f123818b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f123819c = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f123820a;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(-2147483648L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(2147483647L);
        BigInteger bigIntegerValueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        BigInteger bigIntegerValueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        new BigDecimal(bigIntegerValueOf3);
        new BigDecimal(bigIntegerValueOf4);
        new BigDecimal(bigIntegerValueOf);
        new BigDecimal(bigIntegerValueOf2);
    }

    public static String f(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", Integer.valueOf(length));
    }

    public final void g(String str) {
        throw new JsonParseException(this, str);
    }

    public final void h(String str) {
        throw new JsonEOFException(this, j6.a.q("Unexpected end-of-input", str));
    }

    public abstract String i();

    public final void j() {
        throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", f(i()), Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    public final void k() {
        throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of long (%d - %s)", f(i()), Long.MIN_VALUE, Long.MAX_VALUE));
    }
}
