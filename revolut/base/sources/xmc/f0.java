package xmc;

import com.revolut.feature.robo.impl.ui.screen.acknowledgement.AgreementsScreenContract$Input;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f0 extends jki.g implements l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AgreementsScreenContract$Input f307131p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hd.r f307132q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final qmc.b f307133r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ybl.o f307134s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vii.c f307135t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(AgreementsScreenContract$Input input, y mapper, hd.r documentsInteractor, qmc.b roboContextProvider, ybl.o tradingStatementsInteractor) {
        super(mapper);
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(documentsInteractor, "documentsInteractor");
        Intrinsics.checkNotNullParameter(roboContextProvider, "roboContextProvider");
        Intrinsics.checkNotNullParameter(tradingStatementsInteractor, "tradingStatementsInteractor");
        this.f307131p = input;
        this.f307132q = documentsInteractor;
        this.f307133r = roboContextProvider;
        this.f307134s = tradingStatementsInteractor;
        this.f307135t = new vii.c();
    }

    @Override // yji.l
    public final void I1() {
        Unit unit = Unit.f186387a;
        vii.c cVar = this.f307135t;
        w4l.h hVar = w4l.h.f294642c;
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(cVar.a(unit, hVar), new a0(0, continuation, this)), null, null, null, 7);
        yji.l.a1(this, vkm.q.Q(cVar.a(unit, hVar), new a0(1, continuation, this)), null, null, null, 7);
    }

    @Override // od0.f
    public final void accept(Object obj2) {
        i action = (i) obj2;
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof g) {
            x2(new xe7.a(this, action));
            return;
        }
        if (!(action instanceof f)) {
            if (action instanceof e) {
                v2(k.f307141a);
                return;
            } else {
                if (!(action instanceof h)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f307135t.b(Unit.f186387a);
                return;
            }
        }
        zmc.l lVar = ((f) action).f307130a;
        Continuation continuation = null;
        if (lVar instanceof zmc.k) {
            String str = ((zmc.k) lVar).f323452a;
            if (kotlin.text.a0.y(kotlin.text.d0.A0('#', kotlin.text.d0.A0('?', str)), ".pdf", true)) {
                l2(new xec.c0(this, str, continuation, 27), new yi5.b(26));
                return;
            } else {
                C1(new ExternalDestination.Browser(str, null));
                return;
            }
        }
        if (!(lVar instanceof zmc.i)) {
            throw new NoWhenBranchMatchedException();
        }
        if (z.f307157a[((zmc.i) lVar).f323451a.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        l2(new xb4.e(this, continuation, 7), new yi5.b(26));
    }

    @Override // jki.g
    public final jki.i r2() {
        return new j(null, null, null);
    }
}
