package h66;

import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImageTint;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.defi.settings.impl.R$string;
import ip0.iq;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        h66.a domainState = (h66.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.crypto_defi_recovery_phrase_consent_title, null, null, 14), new TextLocalisedClause(R$string.crypto_defi_recovery_phrase_consent_subtitle, null, null, 14), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_exclamation_triangle, GlyphImageTint.WARNING.f59933a, null, 4)), null, false, 24);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_defi_recovery_phrase_consent_loss_acknowledgement_title, null, null, 14);
        boolean z = domainState.f149593a;
        boolean z3 = domainState.d;
        boolean z4 = !z3;
        iq iqVar = iq.CHECK_BUTTON;
        List listK = v.k(new InputChecklistDelegate.Model("DEFI_RECOVERY_PHRASE_LOSS_CONSENT_LIST_ID", textLocalisedClause, z, z4, null, iqVar, null, null, null, null, 0, 0, 0, 524240), new InputChecklistDelegate.Model("DEFI_RECOVERY_PHRASE_LIABILITY_CONSENT_LIST_ID", new TextLocalisedClause(R$string.crypto_defi_recovery_phrase_consent_liability_acknowledgement_title, null, null, 14), domainState.f149594b, z4, null, iqVar, null, null, null, null, 0, 0, 0, 524240), new InputChecklistDelegate.Model("DEFI_RECOVERY_PHRASE_REVOLUT_CONSENT_LIST_ID", new TextLocalisedClause(R$string.crypto_defi_recovery_phrase_consent_revolut_acknowledgement_title, null, null, 14), domainState.f149595c, z4, null, iqVar, null, null, null, null, 0, 0, 0, 524240));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.crypto_defi_recovery_phrase_consent_button_title, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "DEFI_RECOVERY_PHRASE_REVEAL_PHRASE_BUTTON_TAG", domainState.f149593a && domainState.f149594b && domainState.f149595c && !z3, null, null, 972), null, null, 55), listK, aVar);
    }
}
