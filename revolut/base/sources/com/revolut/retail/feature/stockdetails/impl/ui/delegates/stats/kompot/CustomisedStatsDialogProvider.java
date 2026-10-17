package com.revolut.retail.feature.stockdetails.impl.ui.delegates.stats.kompot;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId;
import com.revolut.retail.wealth.resources.R$string;
import etk.b;
import grl.k9;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lw0.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class CustomisedStatsDialogProvider {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/delegates/stats/kompot/CustomisedStatsDialogProvider$DialogContent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DialogContent implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DialogContent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f103817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f103818b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DialogContent(parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DialogContent[i];
            }
        }

        public DialogContent(int i, int i2) {
            this.f103817a = i;
            this.f103818b = i2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DialogContent)) {
                return false;
            }
            DialogContent dialogContent = (DialogContent) obj2;
            return this.f103817a == dialogContent.f103817a && this.f103818b == dialogContent.f103818b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f103818b) + (Integer.hashCode(this.f103817a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f103817a);
            dest.writeInt(this.f103818b);
        }
    }

    public static DialogContent a(AssetStatsId assetStatsId) {
        Intrinsics.checkNotNullParameter(assetStatsId, "assetStatsId");
        if (!(assetStatsId instanceof AssetStatsId.Etf)) {
            if ((assetStatsId instanceof AssetStatsId.Stocks) || (assetStatsId instanceof AssetStatsId.Bonds)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        switch (b.f129444a[((AssetStatsId.Etf) assetStatsId).ordinal()]) {
            case 1:
                return new DialogContent(R$string.wealth_details_section_stats_risk_rating_sri, R$string.wealth_details_section_stats_risk_rating_sri_description);
            case 2:
                return new DialogContent(R$string.wealth_details_section_stats_risk_rating_srri, R$string.wealth_details_section_stats_risk_rating_srri_description);
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static ActionsBottomSheetController b(DialogContent content) {
        Intrinsics.checkNotNullParameter(content, "content");
        a aVar = new a(new TextLocalisedClause(content.f103817a, null, null, 14), new TextLocalisedClause(content.f103818b, null, null, 14), null, null, false, 28);
        k9 k9Var = k9.Trading;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
    }
}
