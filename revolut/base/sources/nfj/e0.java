package nfj;

import com.revolut.retail.feature.esim.impl.network.EsimInstructionsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class e0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimInstructionsService f214935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f214936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f214937c;
    public final gte.a d;
    public final x4l.c e;

    public e0(EsimInstructionsService api2, ne0.j memoryCache, ue0.c storage, gte.a featureToggle) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(featureToggle, "featureToggle");
        this.f214935a = api2;
        this.f214936b = memoryCache;
        this.f214937c = storage;
        this.d = featureToggle;
        Continuation continuation = null;
        this.e = new x4l.c(new mtj.k(this, continuation, 14), new l(this, 4), new n8i.e(this, 19), new naf.j(this, continuation, 12), new lp6.g(this, continuation, 24));
    }

    public static String a(d0 d0Var) {
        return j6.a.q("INSTRUCTIONS_KEY_", d0Var.f214934a);
    }
}
