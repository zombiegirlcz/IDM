package oe1;

import cli.y;
import com.revolut.feature.acquiring.lite_pos.api.model.CartItem;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.EditCustomProductScreenContract$InputData;
import id1.p;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.d0;
import kotlinx.coroutines.CoroutineScope;
import nd1.n;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.a f224519w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f224519w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f224519w, continuation, 0);
            default:
                return new l(this.f224519w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.a aVar2 = this.f224519w;
                if (i == 0) {
                    o.b(obj2);
                    n nVar = aVar2.f60805q;
                    CartItem cartItem = aVar2.o.f60800a;
                    this.v = 1;
                    p pVar = nVar.f214305a;
                    pVar.f160409c.remove(cartItem);
                    pVar.a();
                    if (Unit.f186387a == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                aVar2.B2();
                return Unit.f186387a;
            default:
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.a aVar3 = this.f224519w;
                EditCustomProductScreenContract$InputData editCustomProductScreenContract$InputData = aVar3.o;
                y yVar = aVar3.f60807s;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    CartItem cartItem2 = editCustomProductScreenContract$InputData.f60800a;
                    dj0.d dVar = new dj0.d(((g) ((j2) yVar.f22677a).getValue()).f224509c, ((g) ((j2) yVar.f22677a).getValue()).f224507a);
                    String str = ((g) ((j2) yVar.f22677a).getValue()).d;
                    if (d0.W(str)) {
                        str = null;
                    }
                    CartItem cartItemA = CartItem.a(cartItem2, null, dVar, str, ((g) ((j2) yVar.f22677a).getValue()).e, ((g) ((j2) yVar.f22677a).getValue()).f, 1927);
                    n nVar2 = aVar3.f60805q;
                    CartItem cartItem3 = editCustomProductScreenContract$InputData.f60800a;
                    this.v = 1;
                    p pVar2 = nVar2.f214305a;
                    ArrayList arrayList = pVar2.f160409c;
                    arrayList.set(arrayList.indexOf(cartItem3), cartItemA);
                    pVar2.a();
                    if (Unit.f186387a == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                aVar3.B2();
                return Unit.f186387a;
        }
    }
}
