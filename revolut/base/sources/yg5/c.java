package yg5;

import com.revolut.core.ui_kit.models.spinner_picker.SpinnerPickerItemDelegateModel;
import com.revolut.feature.crypto.gift.asset.impl.ui.screen.claim.CryptoGiftAssetClaimScreen;
import com.revolut.feature.exchange.models.BuyFundingCurrencyPrefill;
import com.revolut.retail.feature.crypto.asset_details.api.navigation.CryptoAssetDetailsFeatureConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yed.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CryptoGiftAssetClaimScreen f313521w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CryptoGiftAssetClaimScreen cryptoGiftAssetClaimScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f313521w = cryptoGiftAssetClaimScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f313521w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f313521w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((SpinnerPickerItemDelegateModel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        xi0.b bVarA;
        int i = this.u;
        CryptoGiftAssetClaimScreen cryptoGiftAssetClaimScreen = this.f313521w;
        switch (i) {
            case 0:
                List selectedAssets = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarE3 = cryptoGiftAssetClaimScreen.e3();
                Intrinsics.h(selectedAssets);
                u uVar = (u) kVarE3;
                uVar.getClass();
                Intrinsics.checkNotNullParameter(selectedAssets, "selectedAssets");
                ArrayList arrayList = new ArrayList();
                Iterator it8 = selectedAssets.iterator();
                while (it8.hasNext()) {
                    Object obj3 = ((SpinnerPickerItemDelegateModel) it8.next()).d;
                    ug5.c cVar = obj3 instanceof ug5.c ? (ug5.c) obj3 : null;
                    if (cVar == null) {
                        bVarA = null;
                    } else {
                        xi0.a aVar2 = xi0.b.Companion;
                        String str = cVar.f279933a;
                        aVar2.getClass();
                        bVarA = xi0.a.a(str);
                    }
                    if (bVarA != null) {
                        arrayList.add(bVarA);
                    }
                }
                uVar.H2(uVar.f313545w, new g0(arrayList.isEmpty() ? d.f313522a : new e(arrayList), 6));
                break;
            default:
                SpinnerPickerItemDelegateModel item = (SpinnerPickerItemDelegateModel) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarE32 = cryptoGiftAssetClaimScreen.e3();
                Intrinsics.h(item);
                u uVar2 = (u) kVarE32;
                uVar2.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                Object obj4 = item.d;
                ug5.c cVar2 = obj4 instanceof ug5.c ? (ug5.c) obj4 : null;
                if (cVar2 != null) {
                    xi0.a aVar4 = xi0.b.Companion;
                    String str2 = cVar2.f279933a;
                    aVar4.getClass();
                    uVar2.C1(new CryptoAssetDetailsFeatureConfig.AssetDetailsDestination(xi0.a.a(str2), (BuyFundingCurrencyPrefill) null, 6));
                }
                break;
        }
        return Unit.f186387a;
    }
}
