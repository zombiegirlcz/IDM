package me1;

import com.revolut.feature.acquiring.lite_pos.api.model.CartItem;
import gim.i;
import id1.p;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nd1.n;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.a f204597w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f204597w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f204597w, continuation, 0);
            default:
                return new g(this.f204597w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.a aVar2 = this.f204597w;
                if (i == 0) {
                    o.b(obj2);
                    n nVar = aVar2.f60796p;
                    CartItem cartItem = aVar2.o.f60794a;
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.a aVar4 = this.f204597w;
                if (i2 == 0) {
                    o.b(obj2);
                    n nVar2 = aVar4.f60796p;
                    CartItem cartItem2 = aVar4.o.f60794a;
                    CartItem cartItemA = CartItem.a(cartItem2, null, null, null, null, ((d) ((j2) aVar4.f60798r.f22677a).getValue()).f204594b, 1983);
                    this.v = 1;
                    p pVar2 = nVar2.f214305a;
                    ArrayList arrayList = pVar2.f160409c;
                    arrayList.set(arrayList.indexOf(cartItem2), cartItemA);
                    pVar2.a();
                    if (Unit.f186387a == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                aVar4.B2();
                return Unit.f186387a;
        }
    }
}
