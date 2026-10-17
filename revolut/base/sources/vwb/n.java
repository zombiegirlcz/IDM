package vwb;

import cli.y;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcardshome.RevPointsGiftcardsHomeScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import md6.q;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends oki.h implements i {
    public final RevPointsGiftcardsHomeScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jwb.e f292695p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final eub.i f292696q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final aub.a f292697r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final dyb.a f292698s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a29.b f292699t;
    public final i4b.f u;
    public final y v;

    public n(cli.n stateMapper, RevPointsGiftcardsHomeScreenContract$InputData inputData, jwb.e revPointsGiftcardsInteractor, eub.i revPointsOptInInteractor, aub.a revPointsOptInExtension, dyb.a kycCheckExtension, a29.b lifestyleBorderlessFooterFactory, i4b.f legalEntityContextProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsGiftcardsInteractor, "revPointsGiftcardsInteractor");
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        Intrinsics.checkNotNullParameter(revPointsOptInExtension, "revPointsOptInExtension");
        Intrinsics.checkNotNullParameter(kycCheckExtension, "kycCheckExtension");
        Intrinsics.checkNotNullParameter(lifestyleBorderlessFooterFactory, "lifestyleBorderlessFooterFactory");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        this.o = inputData;
        this.f292695p = revPointsGiftcardsInteractor;
        this.f292696q = revPointsOptInInteractor;
        this.f292697r = revPointsOptInExtension;
        this.f292698s = kycCheckExtension;
        this.f292699t = lifestyleBorderlessFooterFactory;
        this.u = legalEntityContextProvider;
        this.v = mra.d.b(this, new f(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, ((x29.b) this.f292699t).a(), null, null, new k(this, null, 1), 3);
        yji.l.a1(this, this.u.j(new q(md6.p.GIFT_CARDS, false)), null, null, new k(this, null, 2), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l2(new vmf.k(this, null, 11), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
