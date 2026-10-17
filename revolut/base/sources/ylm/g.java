package ylm;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public abstract class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f314763a = new e();

    public static void a(ulm.w connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public static void b(Call call, ulm.w connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public static void c(s connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
    }
}
