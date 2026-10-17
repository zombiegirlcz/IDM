package gcd;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import ecd.a3;
import ecd.d3;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f142413w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f142413w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f142413w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f142413w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        g gVar = this.f142413w;
        switch (i) {
            case 0:
                d dVar = (d) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                a3 a3Var = (a3) j6.a.k(a3.class, gVar.f142416c, g.b(dVar));
                if (a3Var != null) {
                    return d8l.d.A(a3Var);
                }
                return null;
            default:
                String str = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                d3 d3Var = (d3) j6.a.k(d3.class, gVar.f142416c, g.a(str));
                if (d3Var == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(d3Var, "<this>");
                SavingsProductData savingsProductData = new SavingsProductData(fcd.c.a(d3Var.f124513a), fcd.a.c(d3Var.f124514b));
                fcd.b.a(savingsProductData);
                return savingsProductData;
        }
    }
}
