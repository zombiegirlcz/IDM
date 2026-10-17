package xia;

import com.revolut.feature.pro.onboarding.impl.data.network.ProPostActivationFlowService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import ue0.c;
import wtc.b0;
import x0f.g;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProPostActivationFlowService f306315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f306316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f306317c;
    public final x4l.c d;

    public b(ProPostActivationFlowService api2, j memoryCache, c storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f306315a = api2;
        this.f306316b = memoryCache;
        this.f306317c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new b0(this, continuation, 7), new xe7.a(this, 9), new x2g.b(this, 29), new g(this, continuation, 18), new wa7.j(this, continuation, 11));
    }
}
