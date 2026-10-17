package oq5;

import android.view.View;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingaddprovider.CryptoAddressHostingAddProviderContract$WalletTypeModalStep;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingaddprovider.CryptoAddressHostingAddProviderController;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ View v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CryptoAddressHostingAddProviderController f227749w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(View view, CryptoAddressHostingAddProviderController cryptoAddressHostingAddProviderController, Continuation continuation) {
        super(2, continuation);
        this.v = view;
        this.f227749w = cryptoAddressHostingAddProviderController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, this.f227749w, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        kli.c.c(this.v, false);
        b bVarE3 = this.f227749w.d();
        String id10 = model.f52708a;
        i iVar = (i) bVarE3;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        if (Intrinsics.f(id10, "ADDRESS_HOSTING_ADD_PROVIDER_SUBHEADER_ID")) {
            oki.h.v2(iVar.f227751p, CryptoAddressHostingAddProviderContract$WalletTypeModalStep.f71308a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
