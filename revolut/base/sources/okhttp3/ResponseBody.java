package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import kotlin.jvm.internal.Intrinsics;
import mmm.k;
import mmm.m;
import org.jetbrains.annotations.NotNull;
import ulm.b1;
import ulm.q1;
import ulm.s1;
import vlm.h;
import vlm.j;
import yhm.d;
import yhm.f;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ResponseBody implements Closeable {

    @NotNull
    public static final s1 Companion = new s1();

    @NotNull
    public static final ResponseBody EMPTY = s1.c(m.d, null);
    private Reader reader;

    @NotNull
    public static final ResponseBody create(@NotNull String str, b1 b1Var) {
        Companion.getClass();
        return s1.a(str, b1Var);
    }

    @NotNull
    public final InputStream byteStream() {
        return source().Z9();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    @NotNull
    public final m byteString() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(p.a.m(jContentLength, "Cannot buffer entire body for content length: "));
        }
        k kVarSource = source();
        m th10 = null;
        try {
            m mVarX4 = kVarSource.x4();
            try {
                kVarSource.close();
            } catch (Throwable th11) {
                th10 = th11;
            }
            th = th10;
            th10 = mVarX4;
        } catch (Throwable th12) {
            th = th12;
            if (kVarSource != null) {
                try {
                    kVarSource.close();
                } catch (Throwable th13) {
                    f.a(th, th13);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int iD = th10.d();
        if (jContentLength == -1 || jContentLength == iD) {
            return th10;
        }
        throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iD + ") disagree");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    @NotNull
    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(p.a.m(jContentLength, "Cannot buffer entire body for content length: "));
        }
        k kVarSource = source();
        byte[] th10 = null;
        try {
            byte[] bArrH3 = kVarSource.H3();
            try {
                kVarSource.close();
            } catch (Throwable th11) {
                th10 = th11;
            }
            th = th10;
            th10 = bArrH3;
        } catch (Throwable th12) {
            th = th12;
            if (kVarSource != null) {
                try {
                    kVarSource.close();
                } catch (Throwable th13) {
                    f.a(th, th13);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th10.length;
        if (jContentLength == -1 || jContentLength == length) {
            return th10;
        }
        throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
    }

    @NotNull
    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        q1 q1Var = new q1(source(), vlm.b.a(contentType()));
        this.reader = q1Var;
        return q1Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        h.f(source());
    }

    public abstract long contentLength();

    public abstract b1 contentType();

    public abstract k source();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    @NotNull
    public final String string() throws IOException {
        k kVarSource = source();
        String th10 = null;
        try {
            String strM4 = kVarSource.m4(j.k(kVarSource, vlm.b.a(contentType())));
            try {
                kVarSource.close();
            } catch (Throwable th11) {
                th10 = th11;
            }
            th = th10;
            th10 = strM4;
        } catch (Throwable th12) {
            th = th12;
            if (kVarSource != null) {
                try {
                    kVarSource.close();
                } catch (Throwable th13) {
                    f.a(th, th13);
                }
            }
        }
        if (th == 0) {
            return th10;
        }
        throw th;
    }

    @NotNull
    public static final ResponseBody create(@NotNull k kVar, b1 b1Var, long j2) {
        Companion.getClass();
        return s1.b(kVar, b1Var, j2);
    }

    @NotNull
    public static final ResponseBody create(@NotNull m mVar, b1 b1Var) {
        Companion.getClass();
        return s1.c(mVar, b1Var);
    }

    @NotNull
    @d
    public static final ResponseBody create(b1 b1Var, long j2, @NotNull k content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return s1.b(content, b1Var, j2);
    }

    @NotNull
    @d
    public static final ResponseBody create(b1 b1Var, @NotNull m content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return s1.c(content, b1Var);
    }

    @NotNull
    public static final ResponseBody create(@NotNull byte[] bArr, b1 b1Var) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        mmm.h hVar = new mmm.h();
        hVar.m3801write(bArr);
        return s1.b(hVar, b1Var, bArr.length);
    }

    @NotNull
    @d
    public static final ResponseBody create(b1 b1Var, @NotNull String content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return s1.a(content, b1Var);
    }

    @NotNull
    @d
    public static final ResponseBody create(b1 b1Var, @NotNull byte[] content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(content, "<this>");
        mmm.h hVar = new mmm.h();
        hVar.m3801write(content);
        return s1.b(hVar, b1Var, content.length);
    }
}
