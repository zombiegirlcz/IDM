package tig;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import hfg.t0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nii.g0;
import nii.h0;
import nii.j0;
import nii.m0;
import nii.u1;
import nii.w1;
import nii.y0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements b {
    public d(agg.d travelMilesFormatter) {
        Intrinsics.checkNotNullParameter(travelMilesFormatter, "travelMilesFormatter");
    }

    public final j0 a(String str, int i, t0 t0Var, boolean z) {
        return new j0((Clause) new TextLocalisedClause(R$string.miles_top_up_status_sheet_success_title, v.k(agg.d.a(t0Var, i, new Custom(new Custom.Color.Solid(R$attr.uikit_colorAccent), false, false, 254)), str), null, 12), (Clause) (z ? new TextLocalisedClause(R$string.miles_top_up_status_sheet_success_description, u.c(str), null, 12) : null), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
    }

    public final y0 b(int i, String providerName, hfg.c topUpResult, a dialogMode, t0 unit) {
        j0 j0VarA;
        m0 j0Var;
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(topUpResult, "topUpResult");
        Intrinsics.checkNotNullParameter(dialogMode, "dialogMode");
        Intrinsics.checkNotNullParameter(unit, "unit");
        int i2 = c.f271523b[topUpResult.ordinal()];
        if (i2 == 1) {
            int i3 = c.f271522a[dialogMode.ordinal()];
            if (i3 == 1) {
                j0VarA = a(providerName, i, unit, true);
            } else if (i3 == 2) {
                j0VarA = a(providerName, i, unit, false);
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j0Var = new j0((Clause) new TextLocalisedClause(R$string.miles_top_up_status_sheet_success_title, v.k(agg.d.a(unit, i, new Custom(new Custom.Color.Solid(R$attr.uikit_colorAccent), false, false, 254)), providerName), null, 12), (Clause) new TextLocalisedClause(R$string.miles_top_up_status_sheet_success_spare_change_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(2, new TextLocalisedClause(R$string.miles_top_up_status_sheet_success_spare_change_button_accept, null, null, 14), new TextLocalisedClause(R$string.miles_top_up_status_sheet_success_spare_change_button_cancel, null, null, 14)), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076);
            }
            j0Var = j0VarA;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            j0Var = new g0(new TextLocalisedClause(R$string.miles_top_up_status_sheet_pending_title, v.k(agg.d.a(unit, i, new Custom(new Custom.Color.Solid(R$attr.uikit_colorAccent), false, false, 254)), providerName), null, 12), new TextLocalisedClause(R$string.miles_top_up_status_sheet_pending_description, null, null, 14), null, null, null, null, null, null, false, null, false, null, 16380);
        }
        return new y0(null, j0Var, false, 5);
    }
}
