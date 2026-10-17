package j53;

import aw0.db;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.card_personalisation.generation.impl.R$string;
import com.revolut.feature.card_personalisation.generation.impl.ui.generation.CustomisationImageGenerationControllerContract$ImageGenerationLimitReached;
import com.revolut.feature.card_personalisation.generation.impl.ui.generation.CustomisationImageGenerationControllerContract$ImageGenerationRejected;
import com.youTransactor.uCube.rpc.Constants;
import ip0.ck0;
import ip0.yj0;
import ip0.zj;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import mx0.b4;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class t implements cli.n {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c90.c f171489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f171490b;

    public t(c90.c uiResources, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f171489a = uiResources;
        this.f171490b = featureToggleInteractor;
    }

    public static m a(Throwable th10) {
        boolean z = th10 instanceof CustomisationImageGenerationControllerContract$ImageGenerationLimitReached;
        return new m(u.c(new FullScreenStateDelegate.Model("ERROR_LIST_ID", z ? new TextLocalisedClause(R$string.card_personalisation_generation_error_limit_title, null, null, 14) : th10 instanceof CustomisationImageGenerationControllerContract$ImageGenerationRejected ? new TextLocalisedClause(R$string.card_personalisation_generation_error_rejected_title, null, null, 14) : new TextLocalisedClause(R$string.card_personalisation_generation_error_generic_title, null, null, 14), z ? new TextLocalisedClause(R$string.card_personalisation_generation_error_limit_subtitle, null, null, 14) : th10 instanceof CustomisationImageGenerationControllerContract$ImageGenerationRejected ? new TextLocalisedClause(R$string.card_personalisation_generation_error_rejected_subtitle_with_link, u.c(new TextLocalisedClause(R$string.card_personalisation_generation_error_rejected_subtitle_link, null, new Click(30, (Integer) null, (Object) null, "GUIDELINES_CLICK_ID", false), 10)), null, 12) : new TextLocalisedClause(R$string.card_personalisation_generation_error_generic_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), z ? null : new l6(12, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1984)), f0.f322471a, false, false, false);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        l domainState = (l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (domainState instanceof i) {
            i iVar = (i) domainState;
            String str = iVar.f171466a;
            List listC = u.c(new TextDelegate.Model("PROMPT_MESSAGE_LIST_ID", new TextLocalisedClause(R$string.card_personalisation_generation_state_idle_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, db.EMPHASIS1, false, null, Constants.TAG_SUPPORTED_LOCALE_LIST), 10), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2036));
            f0 f0Var = f0.f322471a;
            return new m(listC, f0Var, (str != null ? str.length() : 0) < 3 ? f0Var : u.c(b4.SEND_MESSAGE), true, false, false, false, iVar.f171467b, iVar.f171468c ? str : null, !iVar.d ? f0Var : (List) iii.c.f(iVar.e, new j3f.d(13), new j0g.b(21), new i6j.q(26)));
        }
        if (domainState instanceof k) {
            k kVar = (k) domainState;
            return (m) iii.c.f(t1.t(kVar.f171471b, kVar.f171472c), new iyi.i(this, 19), new j0g.b(this, 22), new i6j.q(this, 27));
        }
        if (domainState instanceof j) {
            return a(((j) domainState).f171469a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
