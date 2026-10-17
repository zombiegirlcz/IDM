package u03;

import efm.r;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;
import tx0.p4;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f276042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj8.a f276043b;

    public c(wsg.n walletsInteractor, hj8.a juniorProfileInteractor) {
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        this.f276042a = walletsInteractor;
        this.f276043b = juniorProfileInteractor;
    }

    public final r a(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        return ue0.e.H(m70.a.g(nim.a.w(pd.b.r(this.f276042a.b0(card.u), new p4(this, 9)), new tyg.g(13)), null, null, 3), h0.f322473a, new tyg.g(14));
    }
}
