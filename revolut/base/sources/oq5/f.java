package oq5;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingaddprovider.CryptoAddressHostingAddProviderController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import om4.t3;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoAddressHostingAddProviderController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CryptoAddressHostingAddProviderController cryptoAddressHostingAddProviderController, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoAddressHostingAddProviderController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVarE3 = this.v.d();
        String text = textData.f52598b.toString();
        i iVar = (i) bVarE3;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        iVar.H2(iVar.o, new t3(text, 5));
        return Unit.f186387a;
    }
}
