package com.revolut.retail.feature.esim.impl.ui.screens.checkout.dialogs;

import android.os.Parcelable;
import bhj.c;
import bhj.f;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.api.model.EsimProfileScope;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.dialogs.CheckoutSuccessDialogResult;
import dej.o1;
import kotlin.jvm.internal.Intrinsics;
import l71.d;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.w1;
import nii.z;
import ynj.e;
import zhm.u;
import zjh.i;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gej.a f100935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f100936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a61.a f100937c;
    public final i d;
    public final f e;

    public a(gej.a bytesFormatter, e commonUiBuilder, a61.a dataPlanMapper, i planOfferMapper, f mobilePlanMapper, vnj.a analyticsContextBuilder) {
        Intrinsics.checkNotNullParameter(bytesFormatter, "bytesFormatter");
        Intrinsics.checkNotNullParameter(commonUiBuilder, "commonUiBuilder");
        Intrinsics.checkNotNullParameter(dataPlanMapper, "dataPlanMapper");
        Intrinsics.checkNotNullParameter(planOfferMapper, "planOfferMapper");
        Intrinsics.checkNotNullParameter(mobilePlanMapper, "mobilePlanMapper");
        Intrinsics.checkNotNullParameter(analyticsContextBuilder, "analyticsContextBuilder");
        this.f100935a = bytesFormatter;
        this.f100936b = commonUiBuilder;
        this.f100937c = dataPlanMapper;
        this.d = planOfferMapper;
        this.e = mobilePlanMapper;
    }

    public static z a() {
        return new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764);
    }

    public static j0 b(EsimProfile esimProfile, String str) {
        if (esimProfile == null || esimProfile.f100424b == o1.INSTALLED) {
            return new j0((Clause) new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_checkout_success_gifted_plan_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_checkout_success_gifted_plan_subtitle, u.c(str), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) CheckoutSuccessDialogResult.InstallationUnavailable.f100932a, (u1) new w1(6, new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_checkout_success_gifted_plan_action_got_it, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4068);
        }
        String str2 = esimProfile.f100423a;
        return new j0((Clause) new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_checkout_success_share_esim_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_checkout_success_share_esim_subtitle, u.c(str), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) new CheckoutSuccessDialogResult.ShareEsim(str2), (u1) new w1(6, new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_checkout_success_share_esim_action, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4068);
    }

    public final j0 c(EsimProfile esimProfile, c cVar, d dVar) {
        o1 o1Var;
        EsimProfileScope esimProfileScope;
        if (esimProfile == null || (o1Var = esimProfile.f100424b) == null) {
            o1Var = o1.UNKNOWN;
        }
        boolean z = o1Var == o1.READY || o1Var == o1.DOWNLOADED || o1Var == o1.UNINSTALLED;
        bhj.a aVarC = cVar.c(z ? bhj.d.READY : o1Var == o1.INSTALLED ? bhj.d.INSTALLED : bhj.d.PENDING, (esimProfile == null || (esimProfileScope = esimProfile.f100428j) == null) ? null : esimProfileScope.f100452c, dVar);
        Clause textLocalisedClause = aVarC.f15303c;
        if (textLocalisedClause == null) {
            textLocalisedClause = z ? new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_checkout_success_install_esim_button, null, null, 14) : new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.common_action_got_it, null, null, 14);
        }
        return new j0((Clause) aVarC.f15301a, aVarC.f15302b, (StatusDialogDescriptionProgress) null, (esimProfile == null || !z) ? CheckoutSuccessDialogResult.InstallationUnavailable.f100932a : new CheckoutSuccessDialogResult.InstallationAvailable(esimProfile), (u1) new w1(6, textLocalisedClause, null), false, (AnalyticsProduct) null, (esimProfile != null && textLocalisedClause.equals(new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_checkout_success_install_esim_button, null, null, 14))) ? new AnalyticsContext(vnj.a.a(esimProfile)) : null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 3940);
    }
}
