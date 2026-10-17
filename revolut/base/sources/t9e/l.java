package t9e;

import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import tof.s9;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f268990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f268991b;

    public /* synthetic */ l(w wVar, int i) {
        this.f268990a = i;
        this.f268991b = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Flow flowF;
        switch (this.f268990a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(this.f268991b.y2(it8, m.MERCHANT));
            case 1:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(this.f268991b.y2(it9, m.SUBSCRIPTION));
            case 2:
                psg.a it10 = (psg.a) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return hj8.a.a(this.f268991b.f269010y, it10.f239485b, w4l.h.f294642c);
            default:
                qua.p pVar = (qua.p) obj2;
                Set set = pVar.G;
                if (set == null) {
                    set = h0.f322473a;
                }
                s9 s9Var = new s9(set);
                w wVar = this.f268991b;
                whf.b bVar = wVar.v;
                efm.r rVarJust = efm.r.just(s9Var);
                Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                vkm.d dVarB = rd0.e.b(nim.a.w(whf.b.a(bVar, rVarJust, null, null, null, 14), new t9b.a(2)));
                String str = pVar.L;
                if (str == null) {
                    od0.i.Companion.getClass();
                    flowF = new go.g(od0.i.f224256b, 2);
                } else {
                    flowF = mo3.a.f(nim.a.v(boh.f.e(rd0.e.b(wVar.z.b0(str)), new l(wVar, 2)), new t9b.a(1)), new t5e.j(15), new sr8.a(8), new t5e.j(16));
                }
                return nim.a.v(u0.m(dVarB, new qij.s(flowF, 25)), new e8e.t(pVar, 5));
        }
    }
}
