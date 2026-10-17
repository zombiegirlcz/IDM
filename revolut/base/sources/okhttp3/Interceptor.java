package okhttp3;

import org.jetbrains.annotations.NotNull;
import ulm.y0;
import ulm.z0;

/* JADX INFO: loaded from: classes13.dex */
public interface Interceptor {

    @NotNull
    public static final z0 Companion = z0.f281171a;

    Response intercept(y0 y0Var);
}
