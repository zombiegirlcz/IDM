package ajk;

import aw0.g;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import igk.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f5587a;

    public b(ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f5587a = userInteractor;
    }

    public final ActionsBottomSheetController a(AnalyticsProduct analyticsProduct, Function0 onConfirmed) {
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        Intrinsics.checkNotNullParameter(onConfirmed, "onConfirmed");
        ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(R$string.external_navigation_sheet_title, null, null, 14), new TextLocalisedClause(R$string.external_navigation_sheet_subtitle, null, null, 14), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_exclamation_triangle, null, null, 6)), null, false, 24), new g(new n6(new TextLocalisedClause(R$string.external_navigation_sheet_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.external_navigation_sheet_action_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25), analyticsProduct, null, null, 24));
        ac1.b block = new ac1.b(3, onConfirmed);
        Intrinsics.checkNotNullParameter(block, "block");
        actionsBottomSheetController.H = block;
        return actionsBottomSheetController;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ajk.a
            if (r0 == 0) goto L13
            r0 = r7
            ajk.a r0 = (ajk.a) r0
            int r1 = r0.f5586w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5586w = r1
            goto L18
        L13:
            ajk.a r0 = new ajk.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f5586w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r7)
            goto L4a
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            java.lang.String r7 = "http"
            boolean r6 = kotlin.text.a0.H(r6, r7, r3)
            if (r6 == 0) goto L53
            ang.f r6 = r5.f5587a
            efm.d0 r6 = r6.f(r3)
            r0.f5586w = r4
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            do3.n r7 = (do3.n) r7
            boolean r6 = te0.w.V(r7)
            if (r6 == 0) goto L53
            r3 = r4
        L53:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ajk.b.b(java.lang.String, gim.c):java.lang.Object");
    }
}
