package iaf;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInSelectedAsset;
import com.revolut.feature.trading.transfer.investments.impl.R$string;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.selected_assets.SelectedAssetsListScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.selected_assets.SelectedAssetsListScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.y;
import vkm.j2;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SelectedAssetsListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SelectedAssetsListScreen selectedAssetsListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = selectedAssetsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVar = (m) this.v.Q.getValue();
        Intrinsics.h(model);
        final r rVar = (r) mVar;
        j60.a aVar2 = rVar.f160017q;
        Intrinsics.checkNotNullParameter(model, "model");
        final Object obj3 = model.u;
        final int i = 0;
        if (Intrinsics.f(obj3, i.f160002a)) {
            SelectedAssetsListScreenContract$InputData selectedAssetsListScreenContract$InputData = rVar.o;
            TransferBroker transferBroker = selectedAssetsListScreenContract$InputData.f91602a;
            String str = selectedAssetsListScreenContract$InputData.f91603b;
            ?? r4 = ((j) ((j2) rVar.f160018r.f22677a).getValue()).f160003a;
            ArrayList arrayList = new ArrayList(r4.size());
            Iterator it8 = r4.entrySet().iterator();
            while (it8.hasNext()) {
                arrayList.add(((TransferInSelectedAsset) ((Map.Entry) it8.next()).getValue()).f91510a);
            }
            rVar.f2(rVar.e1(new r9f.b(transferBroker, str, d0.i1(arrayList))), ModalDestination.Style.POPUP.f98311a, new p(rVar, 0));
        } else if (obj3 instanceof h) {
            k kVar = rVar.f160016p;
            TransferInSelectedAsset selectedAsset = ((h) obj3).f160001a;
            ((s) kVar).getClass();
            Intrinsics.checkNotNullParameter(selectedAsset, "selectedAsset");
            rp0.l lVar = rp0.l.WINDOW;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.trading_stocks_transfer_in_actions_edit, null, null, 14);
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            int i2 = R$drawable.uikit_icn_24_pencil;
            Integer numValueOf = Integer.valueOf(R$attr.uikit_colorAccent);
            int i3 = R$attr.uikit_colorAccent_10;
            Float fValueOf = Float.valueOf(20.0f);
            List listK = v.k(new RowDelegate.Model("INSTRUMENT_EDIT_ACTION_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(companion, i2, numValueOf, i3, 10.0f, fValueOf, null, 32), null, null, false, null, false, 62), textLocalisedClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, new g(selectedAsset), null, 0, 0, 0, 0, 532676600), new RowDelegate.Model("INSTRUMENT_DELETE_ACTION_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_delete, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 10.0f, fValueOf, null, 32), null, null, false, null, false, 62), new TextLocalisedClause(R$string.trading_stocks_transfer_in_actions_delete, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, new f(selectedAsset), null, 0, 0, 0, 0, 532676600));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            aVar2.x(new y(listK, null, lVar, null, null, null, 1018));
        } else {
            final int i5 = 1;
            if (obj3 instanceof g) {
                j60.a.v(aVar2, false, new Function0() { // from class: iaf.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                TransferInSelectedAsset transferInSelectedAsset = ((g) obj3).f160000a;
                                r rVar2 = rVar;
                                rVar2.f2(rVar2.e1(new r9f.a(rVar2.o.f91602a, transferInSelectedAsset)), ModalDestination.Style.POPUP.f98311a, new p(rVar2, 1));
                                break;
                            default:
                                TransferInSelectedAsset transferInSelectedAsset2 = ((f) obj3).f159999a;
                                r rVar3 = rVar;
                                rVar3.H2(rVar3.f160018r, new i9e.a(rVar3, transferInSelectedAsset2));
                                break;
                        }
                        return Unit.f186387a;
                    }
                }, 1);
            } else if (obj3 instanceof f) {
                j60.a.v(aVar2, false, new Function0() { // from class: iaf.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                TransferInSelectedAsset transferInSelectedAsset = ((g) obj3).f160000a;
                                r rVar2 = rVar;
                                rVar2.f2(rVar2.e1(new r9f.a(rVar2.o.f91602a, transferInSelectedAsset)), ModalDestination.Style.POPUP.f98311a, new p(rVar2, 1));
                                break;
                            default:
                                TransferInSelectedAsset transferInSelectedAsset2 = ((f) obj3).f159999a;
                                r rVar3 = rVar;
                                rVar3.H2(rVar3.f160018r, new i9e.a(rVar3, transferInSelectedAsset2));
                                break;
                        }
                        return Unit.f186387a;
                    }
                }, 1);
            }
        }
        return Unit.f186387a;
    }
}
