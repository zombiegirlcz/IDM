package yr4;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.core.ui.bottom_sheet.BottomSheet;
import com.revolut.feature.credit.core.ui.bottom_sheet.action.ActionsBottomSheetController;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    public g(bp4.e localizationProvider) {
        Intrinsics.checkNotNullParameter(localizationProvider, "localizationProvider");
    }

    public static ActionsBottomSheetController b() {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_card_instalment_management_dialog_remaining_amount_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_card_instalment_management_dialog_remaining_amount_description_v2, null, null, 14);
        BottomSheet.ActionBlock.SingleAction singleAction = new BottomSheet.ActionBlock.SingleAction(new BottomSheet.ActionBlockItem(new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), BottomSheet.ActionStyle.Accent.f69824a), null);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return BottomSheet.a(textLocalisedClause, textLocalisedClause2, null, null, singleAction, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, 76);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.feature.credit.core.ui.bottom_sheet.action.ActionsBottomSheetController a(dj0.d r26, dj0.d r27, dj0.d r28, java.lang.String r29, java.time.LocalDate r30, java.time.LocalDate r31, wi0.b r32) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yr4.g.a(dj0.d, dj0.d, dj0.d, java.lang.String, java.time.LocalDate, java.time.LocalDate, wi0.b):com.revolut.feature.credit.core.ui.bottom_sheet.action.ActionsBottomSheetController");
    }
}
