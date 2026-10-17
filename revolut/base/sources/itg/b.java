package itg;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreenContract$InputData$Legacy;
import com.revolut.feature.pincode.common.R$string;
import com.revolut.kompot.common.ModalDestination;
import d67.e;
import d67.g;
import imk.p0;
import is2.t;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import tla.d;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends dtg.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f168380l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f168381m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f168382n;

    public b(p weakPasscodeMandatoryUpgradeInteractor, d profileNavigationCommandsProvider) {
        Intrinsics.checkNotNullParameter(weakPasscodeMandatoryUpgradeInteractor, "weakPasscodeMandatoryUpgradeInteractor");
        Intrinsics.checkNotNullParameter(profileNavigationCommandsProvider, "profileNavigationCommandsProvider");
        this.f168380l = weakPasscodeMandatoryUpgradeInteractor;
        this.f168381m = profileNavigationCommandsProvider;
    }

    @Override // yji.n
    public final void H2() {
        if (od0.a.e() || od0.a.i()) {
            return;
        }
        V2(new p0(this, null, 6), new yi5.b(29));
    }

    public final void Z2() {
        FullScreenPromptScreenContract$InputData$Legacy fullScreenPromptScreenContract$InputData$LegacyA = e.a(g.Companion, new TextLocalisedClause(R$string.revolut_passcode_mandatory_update_promt_title, null, null, 14), new TextLocalisedClause(R$string.revolut_passcode_mandatory_update_promt_subtitle, null, null, 14), null, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D020", null, null, null, 30), null, null, null, null, null, new TextLocalisedClause(R$string.revolut_passcode_update_prompt_button_change_title, null, null, 14), null, true, null, null, null, false, 16726988);
        this.f168382n = true;
        N2(new FullScreenPromptScreen(fullScreenPromptScreenContract$InputData$LegacyA), ModalDestination.Style.FULLSCREEN_FADE.f98307a, new t(this, 12));
    }
}
