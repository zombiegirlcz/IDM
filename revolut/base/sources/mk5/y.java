package mk5;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.crypto_deposits.api.models.CryptoDepositAddress;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RowDelegate.Model f206206w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a aVar, RowDelegate.Model model, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f206206w = model;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new y(this.v, this.f206206w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((y) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        RowDelegate.Model model = this.f206206w;
        com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a aVar2 = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            xi0.a aVar3 = xi0.b.Companion;
            String str = model.f53228a;
            aVar3.getClass();
            xi0.b bVarA = xi0.a.a(str);
            efm.r rVarX = new ufm.i(eda.f.a(aVar2.f70966w, bVarA, null, null, 6), new mhd.c(new mk3.c(7), 20), 1).x();
            Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
            efm.r rVarFlatMap = te0.w.l(rVarX, m70.a.g(nim.a.w(mo3.a.n(aVar2.v.a(bVarA)), new i5f.g(25, bVarA)), null, null, 3)).flatMap(new mhd.c(new r(aVar2, 0), 15));
            Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
            efm.r rVarG = m70.a.g(rVarFlatMap, null, null, 3);
            this.u = 1;
            obj2 = nim.a.c(rVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        aVar2.C2(new vj5.f(model.f53228a, ((CryptoDepositAddress) obj2).f100038b));
        return Unit.f186387a;
    }
}
