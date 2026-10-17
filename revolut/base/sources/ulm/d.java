package ulm;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface d {

    @NotNull
    public static final c Companion = c.f281068a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f281081a = new b();

    static {
        ah.a defaultDns = h0.G1;
        Intrinsics.checkNotNullParameter(defaultDns, "defaultDns");
    }

    j1 a(t1 t1Var, Response response);
}
