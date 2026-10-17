package com.revolut.feature.pay_later.impl.ui.help;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.core.ui.bottom_sheet.list.CreditBottomSheetListItemsController;
import com.revolut.feature.credit.help.api.dialog_factory.GetHelpDialogFactory$Result;
import grl.k9;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ux4.k;
import wi0.b;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class PayLaterGetHelpDialogFactory implements g15.a {

    @NotNull
    public static final a Companion = new a();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_later/impl/ui/help/PayLaterGetHelpDialogFactory$CancelContract;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancelContract implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CancelContract> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f78876a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancelContract((k) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelContract[i];
            }
        }

        public CancelContract(k creditFacility) {
            Intrinsics.checkNotNullParameter(creditFacility, "creditFacility");
            this.f78876a = creditFacility;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CancelContract) && Intrinsics.f(this.f78876a, ((CancelContract) obj2).f78876a);
        }

        public final int hashCode() {
            return this.f78876a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78876a);
        }
    }

    public static final class a {
        private a() {
        }
    }

    public static LayeredImage b(int i) {
        return LayeredImage.Companion.a(LayeredImage.INSTANCE, i, new Color.Solid(R$attr.uikit_colorAccentNeutral), new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorAccentNeutral), 0.1f), 8.0f, Float.valueOf(24.0f), 32);
    }

    @Override // g15.a
    public final CreditBottomSheetListItemsController a(k creditFacility, String str, b countryCode) {
        Intrinsics.checkNotNullParameter(creditFacility, "creditFacility");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.credit_card_details_dialog_help_title, null, null, 14), null, null, null, false, 30);
        List listK = v.k(new RowDelegate.Model("id-credit-help", new RowDelegate.Model.MainImage.Image40(b(R$drawable.uikit_icn_24_help_chat), null, null, false, null, false, 60), new TextLocalisedClause(R$string.credit_card_details_dialog_help_credit_help, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, new GetHelpDialogFactory$Result.Faq(str), null, 0, 0, 0, 0, 532676600), new RowDelegate.Model("id-financial-difficulties", new RowDelegate.Model.MainImage.Image40(b(R$drawable.uikit_icn_24_coins), null, null, false, null, false, 60), d.o(countryCode) ? new TextLocalisedClause(R$string.credit_support_financial_difficulties_co_title, null, null, 14) : new TextLocalisedClause(R$string.credit_support_financial_difficulties_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, new GetHelpDialogFactory$Result.FinancialDifficulties(creditFacility), null, 0, 0, 0, 0, 532676600), new RowDelegate.Model("id-cancel-contract", new RowDelegate.Model.MainImage.Image40(b(R$drawable.uikit_icn_24_reverted), null, null, false, null, false, 60), new TextLocalisedClause(R$string.credit_pay_later_get_help_cancel_pay_later, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, new CancelContract(creditFacility), null, 0, 0, 0, 0, 532676600));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("id-action-cancel", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.credit_common_cancel, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model, R$attr.uikit_dp16, 0, 0, 0, 14);
        ArrayList arrayListF0 = d0.F0(model, listK);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new CreditBottomSheetListItemsController(new cy4.a(aVar, arrayListF0, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)));
    }
}
