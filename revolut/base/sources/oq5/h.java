package oq5;

import android.view.View;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingaddprovider.CryptoAddressHostingAddProviderController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import om4.t3;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ View v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CryptoAddressHostingAddProviderController f227750w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(View view, CryptoAddressHostingAddProviderController cryptoAddressHostingAddProviderController, Continuation continuation) {
        super(2, continuation);
        this.v = view;
        this.f227750w = cryptoAddressHostingAddProviderController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, this.f227750w, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        kli.c.c(this.v, false);
        b bVarE3 = this.f227750w.d();
        String id10 = model.f52519a;
        i iVar = (i) bVarE3;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        iVar.H2(iVar.o, new t3(id10, 4));
        return Unit.f186387a;
    }
}
