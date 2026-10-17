package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home;

import aii.m;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import com.revolut.retail.feature.api.custom_assets.models.ValueHistoryEntry;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0007\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0007\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/home/TotalWealthContract$Events", "Laii/m;", "Landroid/os/Parcelable;", "<init>", "()V", "ShowAddNewOptions", "NavigateToAddOtherAsset", "NavigateToCustomAssetDetails", "NavigateToEditAsset", "AdjustCurrentValue", "AdjustHistoricalValue", "NavigateToHistoricalValues", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/home/TotalWealthContract$Events$AdjustCurrentValue;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/home/TotalWealthContract$Events$AdjustHistoricalValue;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/home/TotalWealthContract$Events$NavigateToAddOtherAsset;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/home/TotalWealthContract$Events$NavigateToCustomAssetDetails;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/home/TotalWealthContract$Events$NavigateToEditAsset;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/home/TotalWealthContract$Events$NavigateToHistoricalValues;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/home/TotalWealthContract$Events$ShowAddNewOptions;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TotalWealthContract$Events extends m implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/home/TotalWealthContract$Events$AdjustCurrentValue;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/home/TotalWealthContract$Events;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdjustCurrentValue extends TotalWealthContract$Events {

        @NotNull
        public static final Parcelable.Creator<AdjustCurrentValue> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f88004b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f88005c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AdjustCurrentValue((d) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdjustCurrentValue[i];
            }
        }

        public AdjustCurrentValue(d currentValue, String assetId, boolean z) {
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            Intrinsics.checkNotNullParameter(currentValue, "currentValue");
            this.f88004b = assetId;
            this.f88005c = currentValue;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AdjustCurrentValue)) {
                return false;
            }
            AdjustCurrentValue adjustCurrentValue = (AdjustCurrentValue) obj2;
            return Intrinsics.f(this.f88004b, adjustCurrentValue.f88004b) && Intrinsics.f(this.f88005c, adjustCurrentValue.f88005c) && this.d == adjustCurrentValue.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + v7.c(this.f88004b.hashCode() * 31, 31, this.f88005c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88004b);
            dest.writeSerializable(this.f88005c);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/home/TotalWealthContract$Events$AdjustHistoricalValue;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/home/TotalWealthContract$Events;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdjustHistoricalValue extends TotalWealthContract$Events {

        @NotNull
        public static final Parcelable.Creator<AdjustHistoricalValue> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f88006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ValueHistoryEntry f88007c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AdjustHistoricalValue(parcel.readString(), (ValueHistoryEntry) parcel.readParcelable(AdjustHistoricalValue.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdjustHistoricalValue[i];
            }
        }

        public AdjustHistoricalValue(String assetId, ValueHistoryEntry entry) {
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            Intrinsics.checkNotNullParameter(entry, "entry");
            this.f88006b = assetId;
            this.f88007c = entry;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AdjustHistoricalValue)) {
                return false;
            }
            AdjustHistoricalValue adjustHistoricalValue = (AdjustHistoricalValue) obj2;
            return Intrinsics.f(this.f88006b, adjustHistoricalValue.f88006b) && Intrinsics.f(this.f88007c, adjustHistoricalValue.f88007c);
        }

        public final int hashCode() {
            return this.f88007c.hashCode() + (this.f88006b.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88006b);
            dest.writeParcelable(this.f88007c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/home/TotalWealthContract$Events$NavigateToAddOtherAsset;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/home/TotalWealthContract$Events;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NavigateToAddOtherAsset extends TotalWealthContract$Events {

        @NotNull
        public static final Parcelable.Creator<NavigateToAddOtherAsset> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f88008b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NavigateToAddOtherAsset((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NavigateToAddOtherAsset[i];
            }
        }

        public NavigateToAddOtherAsset(b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f88008b = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NavigateToAddOtherAsset) && Intrinsics.f(this.f88008b, ((NavigateToAddOtherAsset) obj2).f88008b);
        }

        public final int hashCode() {
            return this.f88008b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f88008b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/home/TotalWealthContract$Events$NavigateToCustomAssetDetails;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/home/TotalWealthContract$Events;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NavigateToCustomAssetDetails extends TotalWealthContract$Events {

        @NotNull
        public static final Parcelable.Creator<NavigateToCustomAssetDetails> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CustomAsset f88009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CustomAssetCategoryDefinition f88010c;
        public final b d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NavigateToCustomAssetDetails((CustomAsset) parcel.readParcelable(NavigateToCustomAssetDetails.class.getClassLoader()), (CustomAssetCategoryDefinition) parcel.readParcelable(NavigateToCustomAssetDetails.class.getClassLoader()), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NavigateToCustomAssetDetails[i];
            }
        }

        public NavigateToCustomAssetDetails(CustomAsset asset, CustomAssetCategoryDefinition categoryDefinition, b baseCurrency) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            Intrinsics.checkNotNullParameter(categoryDefinition, "categoryDefinition");
            Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
            this.f88009b = asset;
            this.f88010c = categoryDefinition;
            this.d = baseCurrency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NavigateToCustomAssetDetails)) {
                return false;
            }
            NavigateToCustomAssetDetails navigateToCustomAssetDetails = (NavigateToCustomAssetDetails) obj2;
            return Intrinsics.f(this.f88009b, navigateToCustomAssetDetails.f88009b) && Intrinsics.f(this.f88010c, navigateToCustomAssetDetails.f88010c) && Intrinsics.f(this.d, navigateToCustomAssetDetails.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f88010c.hashCode() + (this.f88009b.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f88009b, i);
            dest.writeParcelable(this.f88010c, i);
            dest.writeSerializable(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/home/TotalWealthContract$Events$NavigateToHistoricalValues;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/home/TotalWealthContract$Events;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NavigateToHistoricalValues extends TotalWealthContract$Events {

        @NotNull
        public static final Parcelable.Creator<NavigateToHistoricalValues> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CustomAsset f88013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CustomAssetCategoryDefinition f88014c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NavigateToHistoricalValues((CustomAsset) parcel.readParcelable(NavigateToHistoricalValues.class.getClassLoader()), (CustomAssetCategoryDefinition) parcel.readParcelable(NavigateToHistoricalValues.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NavigateToHistoricalValues[i];
            }
        }

        public NavigateToHistoricalValues(CustomAsset asset, CustomAssetCategoryDefinition categoryDefinition) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            Intrinsics.checkNotNullParameter(categoryDefinition, "categoryDefinition");
            this.f88013b = asset;
            this.f88014c = categoryDefinition;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NavigateToHistoricalValues)) {
                return false;
            }
            NavigateToHistoricalValues navigateToHistoricalValues = (NavigateToHistoricalValues) obj2;
            return Intrinsics.f(this.f88013b, navigateToHistoricalValues.f88013b) && Intrinsics.f(this.f88014c, navigateToHistoricalValues.f88014c);
        }

        public final int hashCode() {
            return this.f88014c.hashCode() + (this.f88013b.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f88013b, i);
            dest.writeParcelable(this.f88014c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/home/TotalWealthContract$Events$ShowAddNewOptions;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/home/TotalWealthContract$Events;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowAddNewOptions extends TotalWealthContract$Events {

        @NotNull
        public static final Parcelable.Creator<ShowAddNewOptions> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f88015b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowAddNewOptions((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowAddNewOptions[i];
            }
        }

        public ShowAddNewOptions(b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f88015b = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowAddNewOptions) && Intrinsics.f(this.f88015b, ((ShowAddNewOptions) obj2).f88015b);
        }

        public final int hashCode() {
            return this.f88015b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f88015b);
        }
    }

    private TotalWealthContract$Events() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/home/TotalWealthContract$Events$NavigateToEditAsset;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/home/TotalWealthContract$Events;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NavigateToEditAsset extends TotalWealthContract$Events {

        @NotNull
        public static final Parcelable.Creator<NavigateToEditAsset> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CustomAsset f88011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CustomAssetCategoryDefinition f88012c;
        public final Boolean d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                CustomAsset customAsset = (CustomAsset) parcel.readParcelable(NavigateToEditAsset.class.getClassLoader());
                CustomAssetCategoryDefinition customAssetCategoryDefinition = (CustomAssetCategoryDefinition) parcel.readParcelable(NavigateToEditAsset.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NavigateToEditAsset(customAsset, customAssetCategoryDefinition, boolValueOf, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NavigateToEditAsset[i];
            }
        }

        public NavigateToEditAsset(CustomAsset asset, CustomAssetCategoryDefinition categoryDefinition, Boolean bool, boolean z) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            Intrinsics.checkNotNullParameter(categoryDefinition, "categoryDefinition");
            this.f88011b = asset;
            this.f88012c = categoryDefinition;
            this.d = bool;
            this.e = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NavigateToEditAsset)) {
                return false;
            }
            NavigateToEditAsset navigateToEditAsset = (NavigateToEditAsset) obj2;
            return Intrinsics.f(this.f88011b, navigateToEditAsset.f88011b) && Intrinsics.f(this.f88012c, navigateToEditAsset.f88012c) && Intrinsics.f(this.d, navigateToEditAsset.d) && this.e == navigateToEditAsset.e;
        }

        public final int hashCode() {
            int iHashCode = (this.f88012c.hashCode() + (this.f88011b.hashCode() * 31)) * 31;
            Boolean bool = this.d;
            return Boolean.hashCode(this.e) + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f88011b, i);
            dest.writeParcelable(this.f88012c, i);
            Boolean bool = this.d;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool);
            }
            dest.writeInt(this.e ? 1 : 0);
        }

        public /* synthetic */ NavigateToEditAsset(CustomAsset customAsset, CustomAssetCategoryDefinition customAssetCategoryDefinition, int i) {
            this(customAsset, customAssetCategoryDefinition, null, (i & 8) == 0);
        }
    }
}
