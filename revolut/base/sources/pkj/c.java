package pkj;

import cli.y;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer.EsimMobilePlanNumberTransferScreen;
import dej.q0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EsimMobilePlanNumberTransferScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(EsimMobilePlanNumberTransferScreen esimMobilePlanNumberTransferScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = esimMobilePlanNumberTransferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EsimMobilePlanNumberTransferScreen esimMobilePlanNumberTransferScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((k) esimMobilePlanNumberTransferScreen.R.getValue()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar = (k) esimMobilePlanNumberTransferScreen.R.getValue();
                y yVar = kVar.f237208r;
                z80.b bVar = kVar.f237207q;
                q0 q0Var = ((e) ((j2) yVar.f22677a).getValue()).f237197a;
                if (q0Var != null) {
                    wi0.b bVar2 = q0Var.f113624c;
                    String str = q0Var.f113622a;
                    if (bVar.k(str, bVar2.f297794a)) {
                        kVar.C2(new g(bVar.a(str, bVar2.f297794a, yk0.b.E164), kVar.o.f101256b));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
