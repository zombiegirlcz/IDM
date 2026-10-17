package deb;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.retail.restaurants.impl.ui.customerdetails.CustomerDetailsScreen;
import dcl.m0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CustomerDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CustomerDetailsScreen customerDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = customerDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVarE3 = this.v.d();
        Intrinsics.h(textData);
        com.revolut.feature.retail.restaurants.impl.ui.customerdetails.a aVar2 = (com.revolut.feature.retail.restaurants.impl.ui.customerdetails.a) kVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(textData, "textData");
        aVar2.H2(aVar2.f82846r, new m0(textData, aVar2, 10));
        return Unit.f186387a;
    }
}
