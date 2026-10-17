package e07;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.acquiring.card_reader.ui.api.navigation.CardReaderTipsSettingsDestination$TipsSettingsBridge;
import com.revolut.feature.freelancer.common.models.FreelancerProfileSettings;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import com.revolut.feature.freelancer.impl.ui.profile.FreelancerProfileFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.profile.details.FreelancerProfileScreen;
import com.revolut.feature.referrals.shared.ui.api.navigation.ReferralsBizFeatureConfig;
import com.revolut.feature.shared.branding.api.destination.BrandingParams;
import com.revolut.feature.shared.branding.api.destination.BrandingSharedDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerProfileScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(FreelancerProfileScreen freelancerProfileScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerProfileScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVarG3 = this.v.T2();
        String listId = model.f53228a;
        j jVar = (j) gVarG3;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Object[] objArr = 0;
        switch (listId.hashCode()) {
            case -1446805080:
                if (listId.equals("ITEM_ID_MERCHANT_TERMS")) {
                    jVar.v2(new f(FreelancerProfileFlowContract$Step.MerchantTerms.f74020a, (FreelancerProfileSettings) ((e) jVar.t2()).f121440a.getContent()));
                }
                break;
            case -1412644893:
                if (listId.equals("ITEM_ID_PRO_ACCOUNT")) {
                    FreelancerProfileSettings freelancerProfileSettings = (FreelancerProfileSettings) ((e) jVar.t2()).f121440a.getContent();
                    od0.i iVar = (od0.i) ((e) jVar.t2()).f121442c.getContent();
                    jVar.v2(new f(new FreelancerProfileFlowContract$Step.Account(freelancerProfileSettings, iVar != null ? (FreelancerTaxProfile) iVar.f224257a : null), (FreelancerProfileSettings) ((e) jVar.t2()).f121440a.getContent()));
                }
                break;
            case -1166886771:
                if (listId.equals("ITEM_ID_INVOICE_SETTINGS")) {
                    jVar.v2(new f(FreelancerProfileFlowContract$Step.InvoiceSettings.f74019a, null));
                }
                break;
            case -755712397:
                if (listId.equals("ITEM_ID_BRANDING")) {
                    jVar.C1(new BrandingSharedDestination(new BrandingSharedDestination.InputData(BrandingParams.RetailBrandingParams.f86062a)));
                }
                break;
            case -194446191:
                if (listId.equals("ITEM_ID_VAT")) {
                    jVar.v2(new f(FreelancerProfileFlowContract$Step.Vat.f74028a, (FreelancerProfileSettings) ((e) jVar.t2()).f121440a.getContent()));
                }
                break;
            case -42848185:
                if (listId.equals("ITEM_ID_INVITE_TO_PRO")) {
                    jVar.C1(new ReferralsBizFeatureConfig.InviteCampaignHomeNavigationDestination(false, false, null, null, 14));
                }
                break;
            case 145103729:
                if (listId.equals("ITEM_ID_ACCOUNT_CLOSURE")) {
                    jVar.n2(new i(jVar, objArr == true ? 1 : 0, 1), new whi.b(6));
                }
                break;
            case 189642229:
                if (listId.equals("ITEM_ID_TIPPING")) {
                    jVar.C1(new BridgeDestination(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) CardReaderTipsSettingsDestination$TipsSettingsBridge.f60614b, false, (Integer) null, 0, 61))));
                }
                break;
            case 2113930497:
                if (listId.equals("ITEM_ID_TAXES")) {
                    jVar.v2(new f(FreelancerProfileFlowContract$Step.Taxes.f74025a, (FreelancerProfileSettings) ((e) jVar.t2()).f121440a.getContent()));
                }
                break;
        }
        return Unit.f186387a;
    }
}
