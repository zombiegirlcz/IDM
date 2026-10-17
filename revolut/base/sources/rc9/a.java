package rc9;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.blue_prompt.BluePromptContent;
import com.revolut.feature.onboarding.impl.R$string;
import com.revolut.feature.onboarding.impl.revolut_card_ready.RevolutCardReadyContract$Configuration;
import com.revolut.retail.core.navigation.FinishCommand;
import h93.f0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import phc.d;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f253234b;

    public /* synthetic */ a(c cVar, int i) {
        this.f253233a = i;
        this.f253234b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        TextLocalisedClause textLocalisedClause;
        switch (this.f253233a) {
            case 0:
                FinishCommand finishCommand = new FinishCommand(null, null, null, 7);
                c cVar = this.f253234b;
                h hVar = new h(new d(cVar, com.revolut.retail.core.navigation.a.c(finishCommand, cVar.f253239n.f78572c), 26), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            default:
                Image cardImage = (Image) obj2;
                Intrinsics.checkNotNullParameter(cardImage, "cardImage");
                c cVar2 = this.f253234b;
                RevolutCardReadyContract$Configuration revolutCardReadyContract$Configuration = cVar2.f253239n;
                AccountId accountId = revolutCardReadyContract$Configuration.f78571b;
                f0 f0Var = revolutCardReadyContract$Configuration.f78570a;
                boolean z = accountId instanceof AccountId.Joint;
                if (z && f0Var.f150112c) {
                    textLocalisedClause = new TextLocalisedClause(R$string.card_apple_wallet_joint_virtual_title, null, null, 14);
                } else if (!z || f0Var.f150112c) {
                    boolean zC = f0Var.C();
                    boolean z3 = f0Var.f150112c;
                    textLocalisedClause = (zC && z3) ? new TextLocalisedClause(R$string.card_apple_wallet_credit_virtual_title, null, null, 14) : z3 ? new TextLocalisedClause(R$string.get_virtual_card_prompt_title, null, null, 14) : new TextLocalisedClause(R$string.get_card_prompt_title, null, null, 14);
                } else {
                    textLocalisedClause = new TextLocalisedClause(R$string.card_apple_wallet_joint_title, null, null, 14);
                }
                TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
                boolean zJ = f0Var.J();
                boolean z4 = f0Var.f150112c;
                boolean z6 = zJ && cp5.c.j(cVar2.o);
                return new ks2.c(textLocalisedClause2, new TextLocalisedClause((z6 && z4) ? R$string.get_virtual_card_prompt_gpay_subtitle : z6 ? R$string.get_card_prompt_gpay_subtitle : z4 ? R$string.get_virtual_card_prompt_subtitle_no_payment_system : R$string.get_card_prompt_subtitle_no_payment_system, null, null, 14), null, new BluePromptContent.MediaContent(cardImage), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), null, new TextLocalisedClause(R$string.get_virtual_card_prompt_action, null, null, 14), null, null, null, null, null, null, null, 1048217);
        }
    }
}
