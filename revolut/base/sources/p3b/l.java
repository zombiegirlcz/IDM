package p3b;

import cli.y;
import com.revolut.feature.retail.cfd.api.domain.models.CfdExposureBreakdownTarget;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okf.m;
import ox5.r;
import vkm.q;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends oki.h implements c {
    public final l4i.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o7.b f232725p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kge.d f232726q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f232727r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ybl.b f232728s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t2b.f f232729t;
    public final vii.c u;
    public final y v;

    public l(l4i.a amountConverter, o7.b cfdOpenPositionsDelegate, kge.d cfdPositionsInteractor, f inputData, ybl.b instrumentTickerInteractor, t2b.f marginQuoteProvider, h stateMapper) {
        e2b.a aVarC;
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(cfdOpenPositionsDelegate, "cfdOpenPositionsDelegate");
        Intrinsics.checkNotNullParameter(cfdPositionsInteractor, "cfdPositionsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(marginQuoteProvider, "marginQuoteProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = amountConverter;
        this.f232725p = cfdOpenPositionsDelegate;
        this.f232726q = cfdPositionsInteractor;
        this.f232727r = inputData;
        this.f232728s = instrumentTickerInteractor;
        this.f232729t = marginQuoteProvider;
        this.u = new vii.c();
        bfl.g gVar = inputData.f232714c;
        CfdExposureBreakdownTarget cfdExposureBreakdownTarget = inputData.e;
        if (cfdExposureBreakdownTarget instanceof CfdExposureBreakdownTarget.Order) {
            aVarC = u2b.c.c(((CfdExposureBreakdownTarget.Order) cfdExposureBreakdownTarget).f82100a.getF82099b());
        } else {
            if (!(cfdExposureBreakdownTarget instanceof CfdExposureBreakdownTarget.Position) && !Intrinsics.f(cfdExposureBreakdownTarget, CfdExposureBreakdownTarget.PositionsGroup.f82102a)) {
                throw new NoWhenBranchMatchedException();
            }
            aVarC = e2b.a.MARKET;
        }
        this.v = mra.d.b(this, new e(null, gVar, aVarC, cfdExposureBreakdownTarget), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, q.Q(this.u.a(Unit.f186387a, w4l.h.f294642c), new m(continuation, this, 16)), null, new r(this, continuation, 7), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
