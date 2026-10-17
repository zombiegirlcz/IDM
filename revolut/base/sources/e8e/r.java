package e8e;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rp0.g1;
import rp0.k1;
import zhm.a1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f123649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f123650c;

    public /* synthetic */ r(x xVar, Set set, int i) {
        this.f123648a = i;
        this.f123649b = xVar;
        this.f123650c = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f123648a) {
            case 0:
                aii.q it8 = (aii.q) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                x xVar = this.f123649b;
                xVar.x2(new r(xVar, this.f123650c, 1));
                g1 g1Var = xVar.v;
                xVar.f123663w.getClass();
                ((k1) g1Var).d(c7e.b.a());
                return Unit.f186387a;
            default:
                m updateState = (m) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return m.a(updateState, null, a1.k(((m) this.f123649b.t2()).f123644c, this.f123650c), null, null, 59);
        }
    }
}
