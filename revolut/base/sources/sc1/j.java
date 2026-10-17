package sc1;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.card_reader.ui.api.R$string;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f261615b;

    public /* synthetic */ j(l lVar, int i) {
        this.f261614a = i;
        this.f261615b = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f261614a) {
            case 0:
                kii.c cVar = new kii.c(null, new TextLocalisedClause(R$string.merchant_card_reader_location_services_disabled_title, null, null, 14), new TextLocalisedClause(R$string.merchant_card_reader_location_services_disabled_message, null, null, 14), new TextLocalisedClause(R$string.merchant_card_reader_action_go_to_settings, null, null, 14), new TextLocalisedClause(R$string.merchant_card_reader_location_services_disabled_negative_action, null, null, 14), null, false, 849);
                l lVar = this.f261615b;
                zii.i.t(lVar, lVar.z2(cVar), new i(lVar, 2), null, 14);
                break;
            case 1:
                l lVar2 = this.f261615b;
                lVar2.A.getClass();
                yji.l.j2(lVar2, new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(R$string.merchant_card_reader_scanning_location_services_permission_title, null, null, 14), new TextLocalisedClause(R$string.merchant_card_reader_scanning_location_services_permission_description_denied, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D161", null, null, null, 30), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.merchant_card_reader_action_go_to_settings, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, 65368)), null, new i(lVar2, 4), 1);
                break;
            case 2:
                l lVar3 = this.f261615b;
                lVar3.A.getClass();
                yji.l.j2(lVar3, new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(R$string.merchant_card_reader_flow_nearby_devices_permission_title, null, null, 14), new TextLocalisedClause(R$string.merchant_card_reader_flow_nearby_devices_permission_required_subtitle, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D162", null, null, null, 30), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.merchant_card_reader_action_go_to_settings, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, 65368)), null, new i(lVar3, 3), 1);
                break;
            case 3:
                l lVar4 = this.f261615b;
                lVar4.A.getClass();
                yji.l.j2(lVar4, new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(R$string.merchant_card_reader_scanning_location_services_permission_title, null, null, 14), new TextLocalisedClause(R$string.merchant_card_reader_scanning_location_services_permission_description, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D160", null, null, null, 30), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.merchant_card_reader_scanning_prompt_scan_again, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, 65368)), null, new i(lVar4, 5), 1);
                break;
            case 4:
                l lVar5 = this.f261615b;
                lVar5.A.getClass();
                yji.l.j2(lVar5, new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(R$string.merchant_card_reader_scanning_location_services_turned_off_title, null, null, 14), new TextLocalisedClause(R$string.merchant_card_reader_scanning_location_services_turned_off_description, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D160", null, null, null, 30), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.merchant_card_reader_scanning_prompt_scan_again, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, 65368)), null, new i(lVar5, 6), 1);
                break;
            case 5:
                l lVar6 = this.f261615b;
                lVar6.A.getClass();
                yji.l.j2(lVar6, new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(R$string.merchant_card_reader_flow_bluetooth_powered_off_title, null, null, 14), new TextLocalisedClause(R$string.merchant_card_reader_scanning_bluetooth_powered_off_prompt_description, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D159", null, null, null, 30), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, 65368)), null, new i(lVar6, 9), 1);
                break;
            case 6:
                this.f261615b.D2(false);
                break;
            default:
                this.f261615b.D2(false);
                break;
        }
        return Unit.f186387a;
    }
}
