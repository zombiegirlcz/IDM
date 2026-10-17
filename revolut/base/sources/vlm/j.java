package vlm;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.FileAppender;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.d0;
import mmm.k;
import mmm.s0;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import ulm.f0;
import ulm.m0;
import ulm.u0;
import ulm.w0;
import ulm.x0;
import zhm.p;

/* JADX INFO: loaded from: classes14.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f290512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f290513b;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.h(timeZone);
        f290512a = timeZone;
        String name = OkHttpClient.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        f290513b = d0.g0(d0.e0(name, "okhttp3."), "Client");
    }

    public static final vif.c a(m0 m0Var) {
        Intrinsics.checkNotNullParameter(m0Var, "<this>");
        return new vif.c(m0Var, 23);
    }

    public static final void b(f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
    }

    public static final boolean c(x0 x0Var, x0 other) {
        Intrinsics.checkNotNullParameter(x0Var, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.f(x0Var.d, other.d) && x0Var.e == other.e && Intrinsics.f(x0Var.f281163a, other.f281163a);
    }

    public static final int d(String name, TimeUnit unit, long j2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j2 < 0) {
            throw new IllegalStateException(name.concat(" < 0").toString());
        }
        long millis = unit.toMillis(j2);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(name.concat(" too large").toString());
        }
        if (millis != 0 || j2 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(name.concat(" too small").toString());
    }

    public static final void e(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!Intrinsics.f(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean f(s0 s0Var) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return l(s0Var, 100);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String g(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        return m72.b.t(objArrCopyOf, objArrCopyOf.length, locale, format, "format(...)");
    }

    public static final long h(Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        String strA = response.f.a("Content-Length");
        if (strA != null) {
            byte[] bArr = h.f290508a;
            Intrinsics.checkNotNullParameter(strA, "<this>");
            try {
                return Long.parseLong(strA);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    public static final List i(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return r(elements);
    }

    public static final boolean j(Socket socket, k source) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.J();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final Charset k(k kVar, Charset charset) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(charset, "default");
        int iG2 = kVar.G2(h.f290509b);
        if (iG2 == -1) {
            return charset;
        }
        if (iG2 == 0) {
            return Charsets.UTF_8;
        }
        if (iG2 == 1) {
            return Charsets.f187887b;
        }
        if (iG2 == 2) {
            Charsets.f187886a.getClass();
            Charset charset2 = Charsets.e;
            if (charset2 != null) {
                return charset2;
            }
            Charset charsetForName = Charset.forName("UTF-32LE");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
            Charsets.e = charsetForName;
            return charsetForName;
        }
        if (iG2 == 3) {
            return Charsets.f187888c;
        }
        if (iG2 != 4) {
            throw new AssertionError();
        }
        Charsets.f187886a.getClass();
        Charset charset3 = Charsets.f;
        if (charset3 != null) {
            return charset3;
        }
        Charset charsetForName2 = Charset.forName("UTF-32BE");
        Intrinsics.checkNotNullExpressionValue(charsetForName2, "forName(...)");
        Charsets.f = charsetForName2;
        return charsetForName2;
    }

    public static final boolean l(s0 s0Var, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = s0Var.timeout().e() ? s0Var.timeout().c() - jNanoTime : Long.MAX_VALUE;
        s0Var.timeout().d(Math.min(jC, timeUnit.toNanos(i)) + jNanoTime);
        try {
            mmm.h hVar = new mmm.h();
            while (s0Var.read(hVar, FileAppender.DEFAULT_BUFFER_SIZE) != -1) {
                hVar.f();
            }
            if (jC == Long.MAX_VALUE) {
                s0Var.timeout().a();
                return true;
            }
            s0Var.timeout().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                s0Var.timeout().a();
                return false;
            }
            s0Var.timeout().d(jNanoTime + jC);
            return false;
        } catch (Throwable th10) {
            if (jC == Long.MAX_VALUE) {
                s0Var.timeout().a();
            } else {
                s0Var.timeout().d(jNanoTime + jC);
            }
            throw th10;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [vlm.i] */
    public static final i m(final String name, final boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ThreadFactory() { // from class: vlm.i
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, name);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    public static final u0 n(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ulm.s0 s0Var = new ulm.s0();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            bmm.e eVar = (bmm.e) it8.next();
            s0Var.c(eVar.f16901a.v(), eVar.f16902b.v());
        }
        return ue8.c.e(s0Var);
    }

    public static final String o(x0 x0Var, boolean z) {
        Intrinsics.checkNotNullParameter(x0Var, "<this>");
        String strL = x0Var.d;
        int i = x0Var.e;
        if (d0.J(strL, ":", false)) {
            strL = p.a.l(']', "[", strL);
        }
        if (!z) {
            w0 w0Var = x0.Companion;
            String str = x0Var.f281163a;
            w0Var.getClass();
            if (i == w0.b(str)) {
                return strL;
            }
        }
        return strL + CoreConstants.COLON_CHAR + i;
    }

    public static final List q(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return zhm.f0.f322471a;
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        Object[] array = list.toArray();
        Intrinsics.checkNotNullExpressionValue(array, "toArray(...)");
        List listUnmodifiableList = Collections.unmodifiableList(p.c(array));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(...)");
        Intrinsics.i(listUnmodifiableList, "null cannot be cast to non-null type kotlin.collections.List<T of okhttp3.internal._UtilJvmKt.toImmutableList>");
        return listUnmodifiableList;
    }

    public static final List r(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return zhm.f0.f322471a;
        }
        if (objArr.length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        List listUnmodifiableList = Collections.unmodifiableList(p.c((Object[]) objArr.clone()));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }
}
