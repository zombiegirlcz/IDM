package nyb;

import com.revolut.feature.terms.api.model.Terms;
import e7l.g;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import m1c.r0;
import m1c.x0;
import wim.z;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f220809b;

    public /* synthetic */ l(o oVar, int i) {
        this.f220808a = i;
        this.f220809b = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f220808a) {
            case 0:
                x0 state = (x0) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                o oVar = this.f220809b;
                ufm.i iVar = new ufm.i(oVar.e.a(), new ny7.j(new nvg.b0(state, oVar, 10), 22), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return iVar;
            case 1:
                od0.i planTermsToAccept = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(planTermsToAccept, "planTermsToAccept");
                return planTermsToAccept.d() ? pre.c.b(this.f220809b.f220821b, ((Terms) planTermsToAccept.c()).f90355a) : efm.b.n(new IllegalStateException("No terms found for requested scope"));
            case 2:
                Boolean it8 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                pfm.z zVarO = m70.a.g(((ik3.c) this.f220809b.i).l(g.b.f123407a, w4l.h.f294642c), null, null, 3).map(new ny7.j(new m(2), 25)).firstOrError().o(Boolean.FALSE);
                Intrinsics.checkNotNullExpressionValue(zVarO, "onErrorReturnItem(...)");
                return zVarO.w();
            case 3:
                Boolean it9 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                final jxb.l lVar = (jxb.l) this.f220809b.f220820a;
                lVar.getClass();
                final int i = 0;
                pfm.n nVar = new pfm.n(new Callable() { // from class: jxb.i
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        switch (i) {
                            case 0:
                                l lVar2 = lVar;
                                synchronized (lVar2) {
                                    lVar2.f179125b.G(Boolean.TRUE, "REV_POINTS_AUTO_OPT_IN_TAB_STORAGE_KEY", z.d(o0.b(Boolean.TYPE)));
                                }
                                return Unit.f186387a;
                            default:
                                return (Boolean) lVar.f179125b.v0(Boolean.FALSE, "REV_POINTS_AUTO_OPT_IN_TAB_STORAGE_KEY", Boolean.TYPE);
                        }
                    }
                }, 1);
                Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
                return new rfm.e(efm.k.g(Boolean.TRUE), te0.w.g0(nVar), 0);
            case 4:
                Boolean it10 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return this.f220809b.e(false).w();
            default:
                r0 it11 = (r0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                final jxb.l lVar2 = (jxb.l) this.f220809b.f220820a;
                lVar2.getClass();
                final int i2 = 1;
                ufm.c cVar = new ufm.c(new Callable() { // from class: jxb.i
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        switch (i2) {
                            case 0:
                                l lVar22 = lVar2;
                                synchronized (lVar22) {
                                    lVar22.f179125b.G(Boolean.TRUE, "REV_POINTS_AUTO_OPT_IN_TAB_STORAGE_KEY", z.d(o0.b(Boolean.TYPE)));
                                }
                                return Unit.f186387a;
                            default:
                                return (Boolean) lVar2.f179125b.v0(Boolean.FALSE, "REV_POINTS_AUTO_OPT_IN_TAB_STORAGE_KEY", Boolean.TYPE);
                        }
                    }
                }, 2);
                Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                return te0.w.i0(cVar).w();
        }
    }
}
