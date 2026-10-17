package lpe;

import aw0.h;
import aw0.i;
import aw0.m6;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1l.a f198995a;

    public d(e1l.a errorHelper) {
        Intrinsics.checkNotNullParameter(errorHelper, "errorHelper");
        this.f198995a = errorHelper;
    }

    public static ActionsBottomSheetController a(Clause clause, Clause clause2, Clause clause3, Clause clause4, AnalyticsProduct analyticsProduct) {
        i hVar;
        lw0.a aVar = new lw0.a(clause, clause2, null, null, false, 28);
        if (clause4 == null) {
            hVar = new aw0.e(false, null, null, m6.c(n6.Companion, clause3, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
        } else {
            m6 m6Var = n6.Companion;
            hVar = new h(false, m6.c(m6Var, clause3, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, clause4, LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
        }
        return new ActionsBottomSheetController(new dii.a(aVar, hVar, analyticsProduct, null, null, 24));
    }

    public static y0 c(wi0.b countryCode, ipe.e product, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        if (c.f198994a[product.ordinal()] == 1) {
            return new y0("STATUS_DIALOG_ID", new z(new TextLocalisedClause(R$string.tin_flow_savings_not_eligible_title, null, null, 14), new TextLocalisedClause(R$string.tin_flow_savings_not_eligible_subtitle, u.c(new CountryClause(countryCode, null)), null, 12), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, null, null, false, analyticsProduct, null, null, null, null, null, 32244), false, 4);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final nii.y0 b(java.lang.Throwable r19, boolean r20) {
        /*
            r18 = this;
            r0 = r19
            java.lang.String r1 = "error"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            nii.y0 r2 = new nii.y0
            nii.z r3 = new nii.z
            r4 = r18
            e1l.a r5 = r4.f198995a
            sf0.h r6 = r5.f122001c
            v60.e r5 = r5.f122000b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            boolean r7 = r0 instanceof java.lang.IllegalStateException
            r8 = 14
            r9 = 0
            if (r7 == 0) goto L25
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r7 = com.revolut.feature.tax_residency.impl.R$string.tin_flow_error_title
            r5.<init>(r7, r9, r9, r8)
            goto L4e
        L25:
            com.revolut.core.error.data.model.ServerError r7 = r6.a(r0)
            if (r7 == 0) goto L39
            int r7 = r7.f51362a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            ao0.a r5 = (ao0.a) r5
            v60.c r5 = r5.b(r7)
            if (r5 != 0) goto L3e
        L39:
            v60.b r5 = new v60.b
            r5.<init>()
        L3e:
            com.revolut.core.ui_kit.models.TextLocalisedClause r10 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            java.lang.String r11 = r5.a()
            boolean r14 = r5 instanceof v60.c
            r15 = 14
            r12 = 0
            r13 = 0
            r10.<init>(r11, r12, r13, r14, r15)
            r5 = r10
        L4e:
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            if (r20 == 0) goto L56
            r10 = 2131961942(0x7f132856, float:1.9560595E38)
            goto L58
        L56:
            int r10 = com.revolut.retail.common.ui.R$string.common_action_got_it
        L58:
            r7.<init>(r10, r9, r9, r8)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            nii.y r15 = new nii.y
            java.lang.Class r1 = r0.getClass()
            kotlin.jvm.internal.p0 r8 = kotlin.jvm.internal.o0.f186429a
            kotlin.reflect.KClass r1 = r8.b(r1)
            java.lang.String r1 = r1.m()
            java.lang.String r8 = r0.getMessage()
            java.lang.String r10 = ": "
            java.lang.String r1 = com.google.android.gms.internal.mlkit_vision_face.a.o(r1, r10, r8)
            com.revolut.core.error.data.model.ServerError r0 = r6.a(r0)
            if (r0 == 0) goto L84
            int r0 = r0.f51362a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
        L84:
            r15.<init>(r1, r9)
            r16 = 0
            r17 = 24566(0x5ff6, float:3.4424E-41)
            r4 = r5
            r5 = 0
            r6 = r7
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = 0
            r1 = 4
            java.lang.String r4 = "STATUS_DIALOG_ID"
            r2.<init>(r4, r3, r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: lpe.d.b(java.lang.Throwable, boolean):nii.y0");
    }
}
