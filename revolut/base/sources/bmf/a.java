package bmf;

import android.os.Parcelable;
import aw0.e;
import aw0.f;
import aw0.g;
import aw0.h;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public interface a {
    static ActionsBottomSheetController a(a aVar, TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause primaryButtonTitle, LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton, TextLocalisedClause secondaryButtonTitle, LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2, int i) {
        LargeActionButton.ButtonStyle.DefaultFilledButton primaryButtonStyle = (i & 16) != 0 ? LargeActionButton.ButtonStyle.f58726b : defaultFilledButton;
        LargeActionButton.ButtonStyle.DefaultFilledButton secondaryButtonStyle = (i & 128) != 0 ? LargeActionButton.ButtonStyle.f58725a : defaultFilledButton2;
        k9 k9Var = k9.Transaction;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        AnalyticsProduct.Retail analyticsProduct = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        ((b) aVar).getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButtonTitle, "primaryButtonTitle");
        Intrinsics.checkNotNullParameter(primaryButtonStyle, "primaryButtonStyle");
        Intrinsics.checkNotNullParameter(secondaryButtonTitle, "secondaryButtonTitle");
        Intrinsics.checkNotNullParameter(secondaryButtonStyle, "secondaryButtonStyle");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        return new ActionsBottomSheetController(new dii.a(new lw0.a(title, description, null, null, false, 28), new h(false, new n6(primaryButtonTitle, primaryButtonStyle, null, null, false, null, null, 1016), new n6(secondaryButtonTitle, secondaryButtonStyle, null, null, false, null, null, 1016), null, null, null, 121), analyticsProduct, null, null, 24));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static ActionsBottomSheetController b(a aVar, TextLocalisedClause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause primaryButtonTitle, ResourceImage resourceImage, TextLocalisedClause secondaryButtonTitle, ResourceImage resourceImage2, int i) {
        ResourceImage resourceImage3 = (i & 8) != 0 ? null : resourceImage;
        LargeActionButton.ButtonStyle.DefaultFilledButton primaryButtonStyle = LargeActionButton.ButtonStyle.f58726b;
        ResourceImage resourceImage4 = (i & 64) == 0 ? resourceImage2 : null;
        LargeActionButton.ButtonStyle.DefaultFilledButton secondaryButtonStyle = LargeActionButton.ButtonStyle.f58725a;
        k9 k9Var = k9.Transaction;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        AnalyticsProduct.Retail analyticsProduct = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        ((b) aVar).getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(primaryButtonTitle, "primaryButtonTitle");
        Intrinsics.checkNotNullParameter(primaryButtonStyle, "primaryButtonStyle");
        Intrinsics.checkNotNullParameter(secondaryButtonTitle, "secondaryButtonTitle");
        Intrinsics.checkNotNullParameter(secondaryButtonStyle, "secondaryButtonStyle");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        return new ActionsBottomSheetController(new dii.a(new lw0.a(title, textLocalisedClause, null, null, false, 28), new g(new n6(primaryButtonTitle, primaryButtonStyle, resourceImage3, null, false, null, null, 1016), new n6(secondaryButtonTitle, secondaryButtonStyle, resourceImage4, null, false, null, null, 1016), (Clause) null, (f) null, 25), analyticsProduct, 0 == true ? 1 : 0, null, 24));
    }

    static ActionsBottomSheetController c(a aVar, Clause title, Clause description, TextLocalisedClause buttonTitle, LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton, AnalyticsProduct.Retail retail, int i) {
        AnalyticsProduct.Retail analyticsProduct;
        LargeActionButton.ButtonStyle.DefaultFilledButton buttonStyle = (i & 16) != 0 ? LargeActionButton.ButtonStyle.f58725a : defaultFilledButton;
        if ((i & 32) != 0) {
            k9 k9Var = k9.Transaction;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            analyticsProduct = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        } else {
            analyticsProduct = retail;
        }
        ((b) aVar).getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        return new ActionsBottomSheetController(new dii.a(new lw0.a(title, description, null, null, false, 28), new e(false, null, null, new n6(buttonTitle, buttonStyle, null, null, false, null, null, 1016), null, null, 55), analyticsProduct, null, null, 24));
    }
}
