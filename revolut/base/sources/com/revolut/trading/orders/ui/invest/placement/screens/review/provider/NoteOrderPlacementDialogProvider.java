package com.revolut.trading.orders.ui.invest.placement.screens.review.provider;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.e;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.common.ui.R$string;
import grl.k9;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class NoteOrderPlacementDialogProvider {

    @NotNull
    public static final a Companion = new a();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/review/provider/NoteOrderPlacementDialogProvider$NoteFeeBreakdownItemInfoParcel;", "Landroid/os/Parcelable;", "DistributionFee", "CustodyFee", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/provider/NoteOrderPlacementDialogProvider$NoteFeeBreakdownItemInfoParcel$CustodyFee;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/provider/NoteOrderPlacementDialogProvider$NoteFeeBreakdownItemInfoParcel$DistributionFee;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface NoteFeeBreakdownItemInfoParcel extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/review/provider/NoteOrderPlacementDialogProvider$NoteFeeBreakdownItemInfoParcel$CustodyFee;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/provider/NoteOrderPlacementDialogProvider$NoteFeeBreakdownItemInfoParcel;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CustodyFee implements NoteFeeBreakdownItemInfoParcel {

            @NotNull
            public static final Parcelable.Creator<CustodyFee> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BigDecimal f106993a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CustodyFee((BigDecimal) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CustodyFee[i];
                }
            }

            public CustodyFee(BigDecimal bigDecimal) {
                this.f106993a = bigDecimal;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof CustodyFee) && Intrinsics.f(this.f106993a, ((CustodyFee) obj2).f106993a);
            }

            public final int hashCode() {
                BigDecimal bigDecimal = this.f106993a;
                if (bigDecimal == null) {
                    return 0;
                }
                return bigDecimal.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f106993a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/review/provider/NoteOrderPlacementDialogProvider$NoteFeeBreakdownItemInfoParcel$DistributionFee;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/provider/NoteOrderPlacementDialogProvider$NoteFeeBreakdownItemInfoParcel;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DistributionFee implements NoteFeeBreakdownItemInfoParcel {

            @NotNull
            public static final Parcelable.Creator<DistributionFee> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BigDecimal f106994a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DistributionFee((BigDecimal) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DistributionFee[i];
                }
            }

            public DistributionFee(BigDecimal bigDecimal) {
                this.f106994a = bigDecimal;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof DistributionFee) && Intrinsics.f(this.f106994a, ((DistributionFee) obj2).f106994a);
            }

            public final int hashCode() {
                BigDecimal bigDecimal = this.f106994a;
                if (bigDecimal == null) {
                    return 0;
                }
                return bigDecimal.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f106994a);
            }
        }
    }

    public static final class a {
        private a() {
        }
    }

    public static ActionsBottomSheetController a(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        lw0.a aVar = new lw0.a(textLocalisedClause, textLocalisedClause2, null, null, false, 28);
        e eVar = new e(false, null, null, new n6(new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
        k9 k9Var = k9.Trading;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
    }
}
