package zp2;

import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.domain.SwitchOutReview;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.obligated_products.SwitchOutObligatedProductsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import up2.u;
import vkm.j2;
import yhm.o;
import yji.l;
import zfd.s;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SwitchOutObligatedProductsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(SwitchOutObligatedProductsScreen switchOutObligatedProductsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = switchOutObligatedProductsScreen;
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

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SwitchOutObligatedProductsScreen switchOutObligatedProductsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((i) switchOutObligatedProductsScreen.O.getValue()).C2(e.f324164a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) switchOutObligatedProductsScreen.O.getValue();
                u uVar = iVar.o;
                SwitchOutReview switchOutReview = ((d) ((j2) iVar.f324167p.f22677a).getValue()).f324163a;
                uVar.getClass();
                l.a1(iVar, iVar.X1(u.a(switchOutReview)), null, null, new s(iVar, (Continuation) null, 23), 3);
                break;
        }
        return Unit.f186387a;
    }
}
