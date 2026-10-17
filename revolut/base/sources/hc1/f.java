package hc1;

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
import d67.s;
import d67.u;
import hc1.c;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f150771b;

    public /* synthetic */ f(g gVar, int i) {
        this.f150770a = i;
        this.f150771b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f150770a;
        g gVar = this.f150771b;
        switch (i) {
            case 0:
                if (((Boolean) obj2).booleanValue()) {
                    gVar.v2(c.a.f150768a);
                } else {
                    ((e) gVar.v).getClass();
                    l.j2(gVar, new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("APP_UPDATE_REQUIRED", new TextLocalisedClause(R$string.merchant_card_reader_flow_app_update_is_required_title, null, null, 14), new TextLocalisedClause(R$string.merchant_card_reader_flow_app_update_is_required_subtitle, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D122", null, null, null, 30), null), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.merchant_card_reader_flow_app_update_is_required_button_title, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, null, null, null, null, null, 2096560), null, false, false, null, 30)), null, new f(gVar, 1), 1);
                }
                break;
            default:
                u output = (u) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (Intrinsics.f(output, s.f111464a)) {
                    gVar.v2(c.b.f150769a);
                } else {
                    int i2 = jli.h.f175850a;
                }
                break;
        }
        return Unit.f186387a;
    }
}
