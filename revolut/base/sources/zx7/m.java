package zx7;

import com.revolut.core.extensions.rx.BreadcrumbException;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import zc0.x2;
import zhm.f0;
import zul.l0;
import zw7.v0;
import zw7.w0;
import zw7.y0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f326080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f326081b;

    public /* synthetic */ m(q qVar, int i) {
        this.f326080a = i;
        this.f326081b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        efm.r rVarF;
        switch (this.f326080a) {
            case 0:
                q qVar = this.f326081b;
                l lVar = qVar.f326086c;
                fx7.f fVar = qVar.d;
                y0 type = (y0) obj2;
                Intrinsics.checkNotNullParameter(type, "type");
                int i = n.f326082a[type.ordinal()];
                if (i == 1) {
                    String policyId = (String) ((s) lVar).x0().get();
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(policyId, "policyId");
                    kx7.y0 y0Var = (kx7.y0) fVar.f138760a;
                    y0Var.getClass();
                    Intrinsics.checkNotNullParameter(policyId, "policyId");
                    rVarF = ((w4l.f) y0Var.f190505h.getValue()).f(policyId, true);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String policyId2 = (String) ((s) lVar).x0().get();
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(policyId2, "policyId");
                    kx7.y0 y0Var2 = (kx7.y0) fVar.f138760a;
                    y0Var2.getClass();
                    Intrinsics.checkNotNullParameter(policyId2, "policyId");
                    rVarF = ((w4l.f) y0Var2.i.getValue()).f(policyId2, true);
                }
                ifm.b bVar = qVar.f326085b;
                efm.r rVarSkipWhile = rVarF.skipWhile(new zx0.b(new l0(11), 13));
                Intrinsics.checkNotNullExpressionValue(rVarSkipWhile, "skipWhile(...)");
                efm.b bVarSwitchMapCompletable = ue0.e.E(m70.a.g(mo3.a.n(rVarSkipWhile), null, new zs4.d(14), 1), f0.f322471a).switchMapCompletable(new zx0.b(new m(qVar, 1), 14));
                Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
                vfg.p pVar = new vfg.p(new x2(new BreadcrumbException(), 15));
                bVarSwitchMapCompletable.getClass();
                pfm.a aVar = new pfm.a(bVarSwitchMapCompletable, pVar, 2);
                Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                ofm.h hVarW = aVar.w(new wl3.e(9, p.f326084a), o.f326083a);
                Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                w.j0(bVar, hVarW);
                return Unit.f186387a;
            default:
                List reasons = (List) obj2;
                Intrinsics.checkNotNullParameter(reasons, "reasons");
                List<w0> list = reasons;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (w0 w0Var : list) {
                    arrayList.add(new by7.h(w0Var, false, w0Var.f325859a == v0.OTHER));
                }
                return w.z0(((s) this.f326081b.f326086c).y0(), arrayList);
        }
    }
}
