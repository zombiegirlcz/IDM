package uc4;

import android.os.Parcelable;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.application.plugins.api.models.config.KontomatikPopupScreenConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.popup.KontomatikPopupScreenContract$InputData;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import ip0.v7;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.l0;
import nii.m0;
import nii.u1;
import nii.w1;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import rp0.m;
import rp0.t;
import u7k.f0;
import yji.l;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends jki.g implements e {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f278985p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final KontomatikPopupScreenContract$InputData f278986q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final jki.j f278987r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j60.a bottomDialogExtension, KontomatikPopupScreenContract$InputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f278985p = bottomDialogExtension;
        this.f278986q = inputData;
        this.f278987r = jki.j.f175191a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yji.l
    public final void I1() {
        m0 j0Var;
        j60.a aVar = this.f278985p;
        LargeActionButtonDelegate.Model model = null;
        l.a1(this, rd0.e.b(aVar.E()), null, null, new f0(this, 0 == true ? 1 : 0, 19), 3);
        KontomatikPopupScreenContract$InputData kontomatikPopupScreenContract$InputData = this.f278986q;
        ju3.g gVar = kontomatikPopupScreenContract$InputData.f67817b;
        KontomatikPopupScreenConfig kontomatikPopupScreenConfig = kontomatikPopupScreenContract$InputData.f67816a;
        int i = g.f278983a[gVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ju3.f fVar = kontomatikPopupScreenConfig.e;
            KontomatikPopupScreenConfig.Button button = kontomatikPopupScreenConfig.d;
            KontomatikPopupScreenConfig.Button button2 = kontomatikPopupScreenConfig.f66363c;
            int i2 = g.f278984b[fVar.ordinal()];
            if (i2 == 1) {
                j0Var = new j0(kontomatikPopupScreenConfig.f66361a, kontomatikPopupScreenConfig.f66362b, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(2, button2.f66364a, button != null ? button.f66364a : null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076);
            } else if (i2 == 2) {
                j0Var = new l0(kontomatikPopupScreenConfig.f66361a, kontomatikPopupScreenConfig.f66362b, null, button2.f66364a, button != null ? button.f66364a : null, null, false, null, 996);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j0Var = new z(kontomatikPopupScreenConfig.f66361a, kontomatikPopupScreenConfig.f66362b, button2.f66364a, button != null ? button.f66364a : null, null, null, false, null, null, null, null, null, null, 32724);
            }
            l.a1(this, X1(new y0(null, j0Var, false, 5)), null, null, new h(this, null), 3);
            return;
        }
        m.b bVar = m.Companion;
        t tVar = new t(kontomatikPopupScreenConfig.f66361a, kontomatikPopupScreenConfig.f66362b, null, 28);
        w0 w0VarM = v7.m(kontomatikPopupScreenContract$InputData.f67818c, AnalyticsContext.INSTANCE);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ID_BUTTON_PRIMARY", LargeActionButton.ButtonStyle.f58725a, null, kontomatikPopupScreenConfig.f66363c.f66364a, false, null, null, null, null, 1000);
        int i3 = R$attr.uikit_dp24;
        int i5 = R$attr.uikit_dp16;
        KontomatikPopupScreenConfig.Button button3 = kontomatikPopupScreenConfig.d;
        yp0.b.l(model2, i3, button3 == null ? i3 : R$attr.uikit_dp0, i5, i5, null, false, 48);
        if (button3 != null) {
            LargeActionButtonDelegate.Model model3 = new LargeActionButtonDelegate.Model("ID_BUTTON_SECONDARY", LargeActionButton.ButtonStyle.f58726b, null, button3.f66364a, false, null, null, null, null, 1000);
            int i6 = R$attr.uikit_dp16;
            yp0.b.l(model3, i6, R$attr.uikit_dp24, i6, i6, null, false, 48);
            model = model3;
        }
        LargeActionButtonDelegate.Model[] elements = {model2, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        aVar.x(dy4.b.b(bVar, kotlin.collections.d.L(elements), tVar, null, null, new AnalyticsContext(w0VarM), null, 764));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f278987r;
    }
}
