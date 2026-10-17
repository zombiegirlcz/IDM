package z0m;

import android.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f318646a;

    public static final void a(String tag2, String msg, Object... args) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        if (f318646a >= 2) {
            String tag3 = "SnowplowTracker->" + tag2;
            String msg2 = c(msg, Arrays.copyOf(args, args.length));
            Intrinsics.checkNotNullParameter(tag3, "tag");
            Intrinsics.checkNotNullParameter(msg2, "msg");
            Log.d(tag3, msg2);
        }
    }

    public static final void b(String tag2, String msg, Object... args) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        if (f318646a >= 1) {
            String tag3 = "SnowplowTracker->" + tag2;
            String msg2 = c(msg, Arrays.copyOf(args, args.length));
            Intrinsics.checkNotNullParameter(tag3, "tag");
            Intrinsics.checkNotNullParameter(msg2, "msg");
            Log.e(tag3, msg2);
        }
    }

    public static String c(String str, Object... objArr) {
        StringBuilder sb6 = new StringBuilder();
        String name = Thread.currentThread().getName();
        Intrinsics.checkNotNullExpressionValue(name, "currentThread().name");
        sb6.append(name);
        sb6.append('|');
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        sb6.append(str2);
        return sb6.toString();
    }

    public static final void d(String tag2, String msg, Object... args) {
        Throwable th10;
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        b(tag2, msg, Arrays.copyOf(args, args.length));
        try {
            int length = args.length;
            int i = 0;
            while (true) {
                th10 = null;
                if (i >= length) {
                    break;
                }
                Object obj2 = args[i];
                if (!Throwable.class.isInstance(obj2)) {
                    i++;
                } else if (obj2 instanceof Throwable) {
                    th10 = (Throwable) obj2;
                }
            }
            f1m.k kVar = new f1m.k(tag2, c(msg, Arrays.copyOf(args, args.length)), th10);
            HashMap map = new HashMap();
            map.put("event", kVar);
            a1m.d.b("SnowplowTrackerDiagnostic", map);
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue("j", "TAG");
            e("j", "Error logger can't report the error: " + e, new Object[0]);
        }
    }

    public static final void e(String tag2, String msg, Object... args) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        if (f318646a >= 3) {
            String tag3 = "SnowplowTracker->" + tag2;
            String msg2 = c(msg, Arrays.copyOf(args, args.length));
            Intrinsics.checkNotNullParameter(tag3, "tag");
            Intrinsics.checkNotNullParameter(msg2, "msg");
            Log.v(tag3, msg2);
        }
    }
}
