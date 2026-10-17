package oe1;

import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.EditCustomProductScreen;
import ip0.u8;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import obg.q;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EditCustomProductScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(EditCustomProductScreen editCustomProductScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = editCustomProductScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            case 2:
                return new d(this.v, continuation, 2);
            default:
                return new d(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((u8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EditCustomProductScreen editCustomProductScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.a) editCustomProductScreen.d()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.a aVar3 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.a) editCustomProductScreen.d();
                aVar3.getClass();
                aVar3.l2(new l(aVar3, null, 1), new yi5.b(26));
                break;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.a aVar5 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.a) editCustomProductScreen.d();
                aVar5.H2(aVar5.f60807s, new q(16));
                break;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.a aVar7 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.a) editCustomProductScreen.d();
                aVar7.H2(aVar7.f60807s, new q(17));
                break;
        }
        return Unit.f186387a;
    }
}
