package gom;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class d {

    @NotNull
    private final ThreadLocal<String> explicitTag = new ThreadLocal<>();

    public final void a(int i, Throwable th10, String str, Object... objArr) {
        String tag$timber_release = getTag$timber_release();
        if (isLoggable(tag$timber_release, i)) {
            if (str != null && str.length() != 0) {
                if (objArr.length != 0) {
                    str = formatMessage(str, objArr);
                }
                if (th10 != null) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append((Object) str);
                    sb6.append('\n');
                    StringWriter stringWriter = new StringWriter(256);
                    PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
                    th10.printStackTrace(printWriter);
                    printWriter.flush();
                    String string = stringWriter.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "sw.toString()");
                    sb6.append(string);
                    str = sb6.toString();
                }
            } else {
                if (th10 == null) {
                    return;
                }
                StringWriter stringWriter2 = new StringWriter(256);
                PrintWriter printWriter2 = new PrintWriter((Writer) stringWriter2, false);
                th10.printStackTrace(printWriter2);
                printWriter2.flush();
                str = stringWriter2.toString();
                Intrinsics.checkNotNullExpressionValue(str, "sw.toString()");
            }
            log(i, tag$timber_release, str, th10);
        }
    }

    public void d(String str, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(3, null, str, Arrays.copyOf(args, args.length));
    }

    public void e(String str, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(6, null, str, Arrays.copyOf(args, args.length));
    }

    @NotNull
    public String formatMessage(@NotNull String message, @NotNull Object[] args) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(args, "args");
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        return a0.d.v(objArrCopyOf, objArrCopyOf.length, message, "java.lang.String.format(this, *args)");
    }

    public final /* synthetic */ ThreadLocal getExplicitTag$timber_release() {
        return this.explicitTag;
    }

    public /* synthetic */ String getTag$timber_release() {
        String str = this.explicitTag.get();
        if (str != null) {
            this.explicitTag.remove();
        }
        return str;
    }

    public void i(String str, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(4, null, str, Arrays.copyOf(args, args.length));
    }

    @yhm.d
    public boolean isLoggable(int i) {
        return true;
    }

    public abstract void log(int i, String str, String str2, Throwable th10);

    public void log(int i, String str, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(i, null, str, Arrays.copyOf(args, args.length));
    }

    public void v(String str, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(2, null, str, Arrays.copyOf(args, args.length));
    }

    public void w(String str, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(5, null, str, Arrays.copyOf(args, args.length));
    }

    public void wtf(String str, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(7, null, str, Arrays.copyOf(args, args.length));
    }

    public void d(Throwable th10, String str, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(3, th10, str, Arrays.copyOf(args, args.length));
    }

    public void e(Throwable th10, String str, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(6, th10, str, Arrays.copyOf(args, args.length));
    }

    public void i(Throwable th10, String str, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(4, th10, str, Arrays.copyOf(args, args.length));
    }

    public boolean isLoggable(String str, int i) {
        return isLoggable(i);
    }

    public void log(int i, Throwable th10, String str, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(i, th10, str, Arrays.copyOf(args, args.length));
    }

    public void v(Throwable th10, String str, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(2, th10, str, Arrays.copyOf(args, args.length));
    }

    public void w(Throwable th10, String str, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(5, th10, str, Arrays.copyOf(args, args.length));
    }

    public void wtf(Throwable th10, String str, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(7, th10, str, Arrays.copyOf(args, args.length));
    }

    public void d(Throwable th10) {
        a(3, th10, null, new Object[0]);
    }

    public void e(Throwable th10) {
        a(6, th10, null, new Object[0]);
    }

    public void i(Throwable th10) {
        a(4, th10, null, new Object[0]);
    }

    public void log(int i, Throwable th10) {
        a(i, th10, null, new Object[0]);
    }

    public void v(Throwable th10) {
        a(2, th10, null, new Object[0]);
    }

    public void w(Throwable th10) {
        a(5, th10, null, new Object[0]);
    }

    public void wtf(Throwable th10) {
        a(7, th10, null, new Object[0]);
    }
}
