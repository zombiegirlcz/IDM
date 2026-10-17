package zx7;

import efm.d0;
import ix7.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kx7.n0;
import kx7.y0;
import te0.w;
import zul.l0;
import zw7.v0;
import zw7.w0;
import zw7.x0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f326067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f326068b;

    public /* synthetic */ a(c cVar, int i) {
        this.f326067a = i;
        this.f326068b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f326067a) {
            case 0:
                Intrinsics.checkNotNullParameter((f) obj2, "<unused var>");
                c cVar = this.f326068b;
                l lVar = cVar.f326071c;
                ufm.c cVarN = w.N(((s) lVar).z0());
                s sVar = (s) lVar;
                ufm.i iVar = new ufm.i(w.N(sVar.y0()), new zx0.b(new l0(10), 10), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                pfm.a aVar = new pfm.a(w.J0(cVarN, iVar, w.N(sVar.x0()), w.N(sVar.e.getValue(sVar, s.f326088g[3]))), new zx0.b(new a(cVar, 1), 11), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return aVar;
            default:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                String str = (String) hVar.f288433a;
                List list = (List) hVar.f288434b;
                String policyId = (String) hVar.f288435c;
                List list2 = (List) hVar.d;
                Intrinsics.h(list);
                List<w0> list3 = list;
                ArrayList reasonFeedbacks = new ArrayList(zhm.w.t(list3, 10));
                for (w0 w0Var : list3) {
                    reasonFeedbacks.add(new x0(w0Var.f325859a, (str.length() <= 0 || w0Var.f325859a != v0.OTHER) ? null : str));
                }
                c cVar2 = this.f326068b;
                fx7.f fVar = cVar2.f326070b;
                Intrinsics.checkNotNullParameter(policyId, "policyId");
                Intrinsics.checkNotNullParameter(reasonFeedbacks, "reasonFeedbacks");
                y0 y0Var = (y0) fVar.f138760a;
                y0Var.getClass();
                Intrinsics.checkNotNullParameter(policyId, "policyId");
                Intrinsics.checkNotNullParameter(reasonFeedbacks, "reasonFeedbacks");
                d0<t> d0VarCancelPolicy = y0Var.f190501a.cancelPolicy(policyId, hx7.q.k0(reasonFeedbacks, y0Var.d.a()));
                ksb.a aVar2 = new ksb.a(new n0(y0Var, 6), 19);
                d0VarCancelPolicy.getClass();
                ufm.i iVar2 = new ufm.i(d0VarCancelPolicy, aVar2, 0);
                Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                return new pfm.a(w.i0(iVar2), new zx0.b(new zp5.f(cVar2, list2, 21), 9), 4);
        }
    }
}
