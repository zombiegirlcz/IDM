package duc;

import android.graphics.Bitmap;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.BitmapImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.TextImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cards_core.R$string;
import h93.f0;
import hx7.l;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        Media textImage;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.card_click_to_pay_add_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.card_click_to_pay_add_subtitle, null, null, 14);
        Bitmap bitmap = (Bitmap) domainState.f117961b.getContent();
        if (bitmap != null) {
            textImage = new BitmapImage(bitmap, false, (ImageTransformations) null, 14);
        } else {
            m70.a.c(t0.f186434a);
            textImage = new TextImage("", 0, 0, 0, 0, 0, 206);
        }
        PromptMarketingContentDelegate.Model.Content.MediaContent mediaContent = new PromptMarketingContentDelegate.Model.Content.MediaContent(textImage, null);
        PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.card_click_to_pay_add_button, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_click2pay, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, (String) null, 52);
        f0 f0Var = domainState.f117960a;
        f0Var.getClass();
        return new h(u.c(new PromptMarketingContentDelegate.Model("PROMPT_ID", textLocalisedClause, textLocalisedClause2, mediaContent, null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, button, null, null, new PromptMarketingContentDelegate.Model.Footer(new HtmlLocalisedClause(l.j().get(f0Var.f150114h.f13640b) == e93.b.VISA ? R$string.card_click_to_pay_disclaimer_visa : R$string.card_click_to_pay_disclaimer_mastercard, (List) null, (Integer) null, (Object) null, 30)), null, null, null, null, null, null, null, null, 2092464)));
    }
}
