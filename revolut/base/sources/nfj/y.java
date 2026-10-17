package nfj;

import com.revolut.retail.feature.esim.impl.network.EsimGiftingService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class y {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f215070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimGiftingService f215071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f215072c;
    public final tsk.t d;
    public final x4l.c e;

    public y(ne0.j memoryCache, EsimGiftingService esimGiftingService, ue0.c storage, tsk.t esimUsernameHasher) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(esimGiftingService, "esimGiftingService");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(esimUsernameHasher, "esimUsernameHasher");
        this.f215070a = memoryCache;
        this.f215071b = esimGiftingService;
        this.f215072c = storage;
        this.d = esimUsernameHasher;
        Continuation continuation = null;
        this.e = new x4l.c(new mtj.k(this, continuation, 12), new l(this, 2), new n8i.e(this, 17), new mqc.p(2, 10, continuation), new i(3, 1, continuation));
    }
}
