package dcf;

import com.revolut.feature.terms.api.model.TermsScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f112917b;

    public /* synthetic */ a0(i0 i0Var, int i) {
        this.f112916a = i;
        this.f112917b = i0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Unit it8 = (Unit) obj2;
        switch (this.f112916a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((wbf.n) this.f112917b.f112944q).b(lbf.f.TRADING_PRO, true);
            case 1:
                Intrinsics.checkNotNullParameter(it8, "it");
                return ybl.l.b(this.f112917b.f112950y);
            case 2:
                Intrinsics.checkNotNullParameter(it8, "it");
                pre.c cVar = this.f112917b.z;
                TermsScope.INSTANCE.getClass();
                return pre.c.l(cVar, null, null, zhm.u.c(TermsScope.i), 10);
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((ou9.c) this.f112917b.A).e(du9.a.PERSONAL).x();
        }
    }
}
