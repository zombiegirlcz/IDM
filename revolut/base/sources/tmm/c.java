package tmm;

import fgm.g;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.IntUnaryOperator;
import tc7.m0;
import xmm.e;

/* JADX INFO: loaded from: classes14.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f272274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f272275b;

    static {
        char c2 = File.separatorChar;
        f272274a = new byte[0];
        System.lineSeparator();
        d.LF.getClass();
        d.CRLF.getClass();
        ThreadLocal.withInitial(new g(1));
        f272275b = ThreadLocal.withInitial(new g(2));
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void b(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        Objects.requireNonNull(inputStream, "inputStream");
        Objects.requireNonNull(outputStream, "outputStream");
        while (true) {
            int i = inputStream.read(bArr);
            if (-1 == i) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    public static byte[] c(InputStream inputStream) throws IOException {
        int i = e.f;
        final xmm.d dVar = new xmm.d();
        Charset.defaultCharset();
        Charset.defaultCharset();
        new IntUnaryOperator() { // from class: umm.a
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i2) {
                dVar.getClass();
                if (i2 <= Integer.MAX_VALUE) {
                    return i2;
                }
                throw new IllegalArgumentException(String.format("Request %,d exceeds maximum %,d", Integer.valueOf(i2), Integer.MAX_VALUE));
            }
        };
        e eVar = new e();
        xmm.c cVar = new xmm.c(new m0(4), new tjf.m0(eVar, 6));
        try {
            b(inputStream, cVar);
            byte[] bArrF = eVar.f();
            cVar.close();
            return bArrF;
        } catch (Throwable th10) {
            try {
                cVar.close();
            } catch (Throwable th11) {
                th10.addSuppressed(th11);
            }
            throw th10;
        }
    }

    public static String d(InputStream inputStream) throws IOException {
        Charset charsetDefaultCharset = Charset.defaultCharset();
        xmm.b bVar = new xmm.b();
        int i = a.f272271a;
        if (charsetDefaultCharset == null) {
            charsetDefaultCharset = Charset.defaultCharset();
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charsetDefaultCharset);
        char[] cArr = (char[]) f272275b.get();
        Arrays.fill(cArr, (char) 0);
        while (true) {
            int i2 = inputStreamReader.read(cArr);
            if (-1 == i2) {
                return bVar.f307288a.toString();
            }
            bVar.write(cArr, 0, i2);
        }
    }
}
