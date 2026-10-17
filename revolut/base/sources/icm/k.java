package icm;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Logger;
import mmm.l0;

/* JADX INFO: loaded from: classes13.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f160337a = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mmm.m f160338b;

    static {
        mmm.m.Companion.getClass();
        f160338b = mmm.l.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    public static int a(l0 l0Var) {
        return (l0Var.readByte() & UnsignedBytes.MAX_VALUE) | ((l0Var.readByte() & UnsignedBytes.MAX_VALUE) << 16) | ((l0Var.readByte() & UnsignedBytes.MAX_VALUE) << 8);
    }

    public static int b(byte b4, int i, short s2) throws IOException {
        if ((b4 & 8) != 0) {
            i--;
        }
        if (s2 <= i) {
            return (short) (i - s2);
        }
        c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s2), Integer.valueOf(i));
        throw null;
    }

    public static void c(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(Locale.US, str, objArr));
    }
}
