package kuc;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.TextImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import rp0.q0;
import rp0.r0;
import rp0.u0;
import yji.n;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends n implements f {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r60.b f189777l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k67.a f189778m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final jla.h f189779n;
    public final vki.a o;

    public l(r60.b promptViewControllerExtension, k67.a gamblingBlockInteractor, jla.h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(promptViewControllerExtension, "promptViewControllerExtension");
        Intrinsics.checkNotNullParameter(gamblingBlockInteractor, "gamblingBlockInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f189777l = promptViewControllerExtension;
        this.f189778m = gamblingBlockInteractor;
        this.f189779n = productCatalogueInteractor;
        this.o = pyd.c.a(this, new e(a.f189766a));
    }

    @Override // yji.n
    public final void D2() {
        T2(new ko2.b(this, null, 6), new yi5.b(27));
    }

    @Override // yji.n
    public final void H2() {
        r60.d dVar = (r60.d) this.f189777l;
        n.l2(this, rd0.e.b(dVar.d.d()), null, new j(this, null), 3);
        n.l2(this, rd0.e.b(dVar.d.f()), null, new k(this, null), 3);
    }

    public final void Z2(boolean z) {
        u0 u0Var;
        if (z) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.gambling_block_enable_dialog_title, null, null, 14);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.gambling_block_enable_dialog_subtitle, null, null, 14);
            m70.a.c(t0.f186434a);
            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
            Clause clause = null;
            Clause clause2 = null;
            ResourceImage resourceImage2 = null;
            AnalyticsContext analyticsContext = null;
            AnalyticsContext analyticsContext2 = null;
            u0Var = new u0(textLocalisedClause, textLocalisedClause2, clause, new r0(new TextImage("", 0, 0, 0, 0, 0, 206)), clause2, resourceImage, resourceImage2, q0.HORIZONTAL, new TextLocalisedClause(com.revolut.uicomponent.R$string.common_action_yes, null, null, 14), new TextLocalisedClause(com.revolut.uicomponent.R$string.common_action_no, null, null, 14), analyticsContext, analyticsContext2, null, null, null, null, "PROMPT_ID_ENABLE_BLOCK", null, null, 33028436);
        } else {
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.gambling_block_disable_dialog_title, null, null, 14);
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.gambling_block_disable_dialog_subtitle, null, null, 14);
            m70.a.c(t0.f186434a);
            ResourceImage resourceImage3 = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
            Clause clause3 = null;
            Clause clause4 = null;
            ResourceImage resourceImage4 = null;
            AnalyticsContext analyticsContext3 = null;
            AnalyticsContext analyticsContext4 = null;
            u0Var = new u0(textLocalisedClause3, textLocalisedClause4, clause3, new r0(new TextImage("", 0, 0, 0, 0, 0, 206)), clause4, resourceImage3, resourceImage4, q0.HORIZONTAL, new TextLocalisedClause(com.revolut.uicomponent.R$string.common_action_no, null, null, 14), new TextLocalisedClause(com.revolut.uicomponent.R$string.common_action_yes, null, null, 14), analyticsContext3, analyticsContext4, null, null, null, null, "PROMPT_ID_DISABLE_BLOCK", null, null, 33028436);
        }
        ((r60.d) this.f189777l).R(u0Var);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.o;
    }
}
