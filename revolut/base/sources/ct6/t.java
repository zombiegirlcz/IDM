package ct6;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$plurals;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import et6.h1;
import et6.l3;
import grl.k9;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lr6.x;
import nii.l0;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements jr6.m {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr6.h f108646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l3 f108647b;

    public t(h1 freelancerInteractor, gr6.h freelancerCashbackInteractor, l3 freelancerSettlementSettingsInteractor, wv6.a freelancerCashbackUpsellClauseFactory) {
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        Intrinsics.checkNotNullParameter(freelancerCashbackInteractor, "freelancerCashbackInteractor");
        Intrinsics.checkNotNullParameter(freelancerSettlementSettingsInteractor, "freelancerSettlementSettingsInteractor");
        Intrinsics.checkNotNullParameter(freelancerCashbackUpsellClauseFactory, "freelancerCashbackUpsellClauseFactory");
        this.f108646a = freelancerCashbackInteractor;
        this.f108647b = freelancerSettlementSettingsInteractor;
    }

    public static eii.c d(TextLocalisedClause textLocalisedClause, x xVar) {
        boolean z = false;
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.freelancer_settlement_unlock_progress_breakdown_title, null, null, 14), textLocalisedClause, null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.freelancer_settlement_unlock_progress_breakdown_common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        int i = xVar.f199420a;
        dj0.d dVar = xVar.d;
        dj0.d dVar2 = xVar.f199422c;
        int i2 = xVar.f199421b;
        int i3 = 6;
        List<RowDelegate.Model> listK = zhm.v.k(new RowDelegate.Model("ID_CUSTOM_PAYMENTS_INFO", new RowDelegate.Model.MainImage.Image24(i(i >= i2), z, z, i3), new TextLocalisedQuantityClause(R$plurals.freelancer_settlement_unlock_progress_breakdown_step_payments_title, Integer.valueOf(i2), (List) null, (Style) null, 28), null, 0, new TextLocalisedQuantityClause(R$plurals.freelancer_settlement_unlock_progress_breakdown_step_payments_subtitle, Integer.valueOf(xVar.f199420a), (List) null, (Style) null, 28), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("ID_TOTAL_VALUE_INFO", new RowDelegate.Model.MainImage.Image24(i(dVar2.compareTo(dVar) >= 0), z, z, i3), new TextLocalisedClause(R$string.freelancer_settlement_unlock_progress_breakdown_step_volume_title, zhm.u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, 0, new TextLocalisedClause(R$string.freelancer_settlement_unlock_progress_breakdown_step_volume_subtitle, zhm.u.c(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
        ArrayList arrayList = new ArrayList(zhm.w.t(listK, 10));
        for (RowDelegate.Model model : listK) {
            arrayList.add(new eii.l(model.f53230c, model.f, model.f53229b, false, false, (RowDelegate.Model.c) null, (Object) null, 488));
        }
        k9 k9Var = k9.Freelancer;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new eii.c(aVar, eVar, arrayList, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null);
    }

    public static ResourceImage i(boolean z) {
        return z ? new ResourceImage(R$drawable.uikit_icn_24_check_success, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreen), (List) null, (ImageTransformations) null, (Clause) null, 246) : new ResourceImage(R$drawable.uikit_icn_24_check_success, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
    }

    public static int j(x xVar) {
        int i = xVar.f199420a >= xVar.f199421b ? 1 : 0;
        return xVar.f199422c.compareTo(xVar.d) >= 0 ? i + 1 : i;
    }

    public final z b() {
        return new z(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x012f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r26) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ct6.t.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ct6.r
            if (r0 == 0) goto L13
            r0 = r7
            ct6.r r0 = (ct6.r) r0
            int r1 = r0.f108644w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f108644w = r1
            goto L18
        L13:
            ct6.r r0 = new ct6.r
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f108644w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r7)
            goto L4e
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L30:
            yhm.o.b(r7)
            et6.l3 r7 = r6.f108647b
            w4l.j r2 = w4l.j.f294644c
            vkm.d r7 = r7.a(r2)
            ct6.o r2 = new ct6.o
            r5 = 0
            r2.<init>(r5)
            jhi.b r7 = mo3.a.g(r7, r3, r2, r4)
            r0.f108644w = r4
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            lr6.w r7 = (lr6.w) r7
            lr6.x r7 = r7.f199419b
            com.revolut.core.ui_kit.models.TextLocalisedClause r0 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.freelancer.impl.R$string.freelancer_settlement_unlock_progress_breakdown_subtitle_in_person
            r2 = 14
            r0.<init>(r1, r3, r3, r2)
            if (r7 == 0) goto L62
            eii.c r7 = d(r0, r7)
            return r7
        L62:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ct6.t.e(gim.c):java.lang.Object");
    }

    public final y0 f(String nextAvailableNumber) {
        Intrinsics.checkNotNullParameter(nextAvailableNumber, "nextAvailableNumber");
        return new y0("ID_INVOICE_NUMBER_TAKEN_DIALOG", new l0(new TextLocalisedClause(R$string.freelancer_sale_invoice_number_prompt_unavailable_number_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_sale_invoice_number_prompt_unavailable_number_subtitle, zhm.u.c(nextAvailableNumber), null, 12), null, new TextLocalisedClause(R$string.freelancer_sale_invoice_number_prompt_unavailable_number_action_use_available_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_sale_invoice_number_prompt_unavailable_number_action_cancel_title, null, null, 14), null, false, null, 996), false, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ct6.s
            if (r0 == 0) goto L13
            r0 = r7
            ct6.s r0 = (ct6.s) r0
            int r1 = r0.f108645w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f108645w = r1
            goto L18
        L13:
            ct6.s r0 = new ct6.s
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f108645w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r7)
            goto L4f
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L30:
            yhm.o.b(r7)
            et6.l3 r7 = r6.f108647b
            w4l.j r2 = w4l.j.f294644c
            vkm.d r7 = r7.a(r2)
            clk.b r2 = new clk.b
            r5 = 29
            r2.<init>(r5)
            jhi.b r7 = mo3.a.g(r7, r3, r2, r4)
            r0.f108645w = r4
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            lr6.w r7 = (lr6.w) r7
            lr6.x r7 = r7.f199418a
            com.revolut.core.ui_kit.models.TextLocalisedClause r0 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.freelancer.impl.R$string.freelancer_settlement_unlock_progress_breakdown_subtitle_online
            r2 = 14
            r0.<init>(r1, r3, r3, r2)
            eii.c r7 = d(r0, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ct6.t.g(gim.c):java.lang.Object");
    }

    public final ActionsBottomSheetController h() {
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.freelancer_tax_sorter_prompt_set_up_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_tax_sorter_prompt_set_up_subtitle, null, null, 14), null, null, false, 28);
        aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(R$string.freelancer_tax_sorter_prompt_set_up_action_set_up_now, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.freelancer_tax_sorter_prompt_set_up_action_not_now, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
        k9 k9Var = k9.Freelancer;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
    }
}
