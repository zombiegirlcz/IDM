package et6;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 {

    @NotNull
    public static final s0 Companion = new s0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr6.g f129328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f129329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gr6.i f129330c;

    public t0(gr6.g freelancerBrandingInteractor, h1 freelancerInteractor, gr6.i freelancerCurrencyInteractor) {
        Intrinsics.checkNotNullParameter(freelancerBrandingInteractor, "freelancerBrandingInteractor");
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        Intrinsics.checkNotNullParameter(freelancerCurrencyInteractor, "freelancerCurrencyInteractor");
        this.f129328a = freelancerBrandingInteractor;
        this.f129329b = freelancerInteractor;
        this.f129330c = freelancerCurrencyInteractor;
    }

    public static akg.n b(t0 t0Var) {
        return nim.a.v(rd0.e.b(t0Var.f129329b.c()), new w(4));
    }

    public final vkm.d a() {
        return rd0.e.b(((q0) this.f129328a).f129306a.f9518b.f(Unit.f186387a, true));
    }
}
