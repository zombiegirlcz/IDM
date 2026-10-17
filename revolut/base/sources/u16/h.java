package u16;

import android.os.Parcelable;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.id;
import com.revolut.core.ui_kit.delegates.kd;
import com.revolut.core.ui_kit.delegates.ld;
import com.revolut.core.ui_kit.delegates.pd;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.defi.accounts.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.defi_accounts_creation_disclaimer_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.defi_accounts_creation_disclaimer_description, null, null, 14);
        Companion.getClass();
        PromptMarketingContentDelegate.Model.Content.MediaContent mediaContent = new PromptMarketingContentDelegate.Model.Content.MediaContent(new GlyphImage(R$drawable.uikit_icn_24_crypto_brick, null, null, 6), null);
        PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.defi_accounts_creation_disclaimer_button_title, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
        id idVar = null;
        Object obj2 = null;
        Parcelable parcelable = null;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        String str = "PROMPT_CONTENT_LIST_ID";
        PromptMarketingContentDelegate.Model.BackgroundType backgroundType = null;
        pd pdVar = null;
        ld ldVar = null;
        kd kdVar = null;
        String str2 = null;
        Clause clause = null;
        PromptMarketingContentDelegate.Model.AnimationType animationType = null;
        AnimationRequest animationRequest = null;
        Object[] objArr = 0 == true ? 1 : 0;
        return new b(u.c(new PromptMarketingContentDelegate.Model(str, textLocalisedClause, textLocalisedClause2, mediaContent, backgroundType, pdVar, resourceImage, ldVar, kdVar, button, 0 == true ? 1 : 0, idVar, objArr, obj2, parcelable, null, str2, clause, animationType, animationRequest, null, 2096560)));
    }
}
