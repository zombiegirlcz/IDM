package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.spending_analytics.api.models.NetWorthAccount;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.AddEditAssetContract$InputData$Mode;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.SmartEstimationAccess;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.SmartEstimationBottomSheetContract$Variant;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import h30.l;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yld.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "TotalWealth", "AddOtherAsset", "AddEditAsset", "SelectType", "AddNewOptions", "CustomAssetDetails", "CustomAssetDetailsV2", "CustomAssetHistoricalValues", "AdjustAssetValue", "SmartEstimationBottomSheet", "RemoveAssetConfirmationBottomSheet", "SmartEstimationProductArticle", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step$AddEditAsset;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step$AddNewOptions;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step$AddOtherAsset;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step$AdjustAssetValue;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step$CustomAssetDetails;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step$CustomAssetDetailsV2;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step$CustomAssetHistoricalValues;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step$RemoveAssetConfirmationBottomSheet;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step$SelectType;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step$SmartEstimationBottomSheet;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step$SmartEstimationProductArticle;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step$TotalWealth;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TotalWealthFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step$AddEditAsset;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddEditAsset extends TotalWealthFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddEditAsset> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AddEditAssetContract$InputData$Mode f87963a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddEditAsset((AddEditAssetContract$InputData$Mode) parcel.readParcelable(AddEditAsset.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddEditAsset[i];
            }
        }

        public AddEditAsset(AddEditAssetContract$InputData$Mode mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f87963a = mode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddEditAsset) && Intrinsics.f(this.f87963a, ((AddEditAsset) obj2).f87963a);
        }

        public final int hashCode() {
            return this.f87963a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87963a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step$AddNewOptions;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddNewOptions extends TotalWealthFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddNewOptions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f87964a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddNewOptions((xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddNewOptions[i];
            }
        }

        public AddNewOptions(xi0.b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f87964a = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddNewOptions) && Intrinsics.f(this.f87964a, ((AddNewOptions) obj2).f87964a);
        }

        public final int hashCode() {
            return this.f87964a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f87964a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step$AddOtherAsset;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddOtherAsset extends TotalWealthFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddOtherAsset> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f87965a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddOtherAsset((xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddOtherAsset[i];
            }
        }

        public AddOtherAsset(xi0.b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f87965a = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddOtherAsset) && Intrinsics.f(this.f87965a, ((AddOtherAsset) obj2).f87965a);
        }

        public final int hashCode() {
            return this.f87965a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f87965a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step$AdjustAssetValue;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdjustAssetValue extends TotalWealthFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AdjustAssetValue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AdjustAssetValueContract$InputData f87966a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AdjustAssetValue((AdjustAssetValueContract$InputData) parcel.readParcelable(AdjustAssetValue.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdjustAssetValue[i];
            }
        }

        public AdjustAssetValue(AdjustAssetValueContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f87966a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AdjustAssetValue) && Intrinsics.f(this.f87966a, ((AdjustAssetValue) obj2).f87966a);
        }

        public final int hashCode() {
            return this.f87966a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87966a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step$CustomAssetDetails;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomAssetDetails extends TotalWealthFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CustomAssetDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CustomAsset f87967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CustomAssetCategoryDefinition f87968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final xi0.b f87969c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomAssetDetails((CustomAsset) parcel.readParcelable(CustomAssetDetails.class.getClassLoader()), (CustomAssetCategoryDefinition) parcel.readParcelable(CustomAssetDetails.class.getClassLoader()), (xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustomAssetDetails[i];
            }
        }

        public CustomAssetDetails(CustomAsset asset, CustomAssetCategoryDefinition categoryDefinition, xi0.b currency) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            Intrinsics.checkNotNullParameter(categoryDefinition, "categoryDefinition");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f87967a = asset;
            this.f87968b = categoryDefinition;
            this.f87969c = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CustomAssetDetails)) {
                return false;
            }
            CustomAssetDetails customAssetDetails = (CustomAssetDetails) obj2;
            return Intrinsics.f(this.f87967a, customAssetDetails.f87967a) && Intrinsics.f(this.f87968b, customAssetDetails.f87968b) && Intrinsics.f(this.f87969c, customAssetDetails.f87969c);
        }

        public final int hashCode() {
            return this.f87969c.hashCode() + ((this.f87968b.hashCode() + (this.f87967a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87967a, i);
            dest.writeParcelable(this.f87968b, i);
            dest.writeSerializable(this.f87969c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step$CustomAssetDetailsV2;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomAssetDetailsV2 extends TotalWealthFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CustomAssetDetailsV2> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CustomAsset f87970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CustomAssetCategoryDefinition f87971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final xi0.b f87972c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomAssetDetailsV2((CustomAsset) parcel.readParcelable(CustomAssetDetailsV2.class.getClassLoader()), (CustomAssetCategoryDefinition) parcel.readParcelable(CustomAssetDetailsV2.class.getClassLoader()), (xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustomAssetDetailsV2[i];
            }
        }

        public CustomAssetDetailsV2(CustomAsset asset, CustomAssetCategoryDefinition categoryDefinition, xi0.b currency) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            Intrinsics.checkNotNullParameter(categoryDefinition, "categoryDefinition");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f87970a = asset;
            this.f87971b = categoryDefinition;
            this.f87972c = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CustomAssetDetailsV2)) {
                return false;
            }
            CustomAssetDetailsV2 customAssetDetailsV2 = (CustomAssetDetailsV2) obj2;
            return Intrinsics.f(this.f87970a, customAssetDetailsV2.f87970a) && Intrinsics.f(this.f87971b, customAssetDetailsV2.f87971b) && Intrinsics.f(this.f87972c, customAssetDetailsV2.f87972c);
        }

        public final int hashCode() {
            return this.f87972c.hashCode() + ((this.f87971b.hashCode() + (this.f87970a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87970a, i);
            dest.writeParcelable(this.f87971b, i);
            dest.writeSerializable(this.f87972c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step$CustomAssetHistoricalValues;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomAssetHistoricalValues extends TotalWealthFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CustomAssetHistoricalValues> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CustomAsset f87973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CustomAssetCategoryDefinition f87974b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomAssetHistoricalValues((CustomAsset) parcel.readParcelable(CustomAssetHistoricalValues.class.getClassLoader()), (CustomAssetCategoryDefinition) parcel.readParcelable(CustomAssetHistoricalValues.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustomAssetHistoricalValues[i];
            }
        }

        public CustomAssetHistoricalValues(CustomAsset asset, CustomAssetCategoryDefinition categoryDefinition) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            Intrinsics.checkNotNullParameter(categoryDefinition, "categoryDefinition");
            this.f87973a = asset;
            this.f87974b = categoryDefinition;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CustomAssetHistoricalValues)) {
                return false;
            }
            CustomAssetHistoricalValues customAssetHistoricalValues = (CustomAssetHistoricalValues) obj2;
            return Intrinsics.f(this.f87973a, customAssetHistoricalValues.f87973a) && Intrinsics.f(this.f87974b, customAssetHistoricalValues.f87974b);
        }

        public final int hashCode() {
            return this.f87974b.hashCode() + (this.f87973a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87973a, i);
            dest.writeParcelable(this.f87974b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step$RemoveAssetConfirmationBottomSheet;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RemoveAssetConfirmationBottomSheet extends TotalWealthFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RemoveAssetConfirmationBottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87976b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RemoveAssetConfirmationBottomSheet(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RemoveAssetConfirmationBottomSheet[i];
            }
        }

        public RemoveAssetConfirmationBottomSheet(String assetId, String assetName) {
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            Intrinsics.checkNotNullParameter(assetName, "assetName");
            this.f87975a = assetId;
            this.f87976b = assetName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RemoveAssetConfirmationBottomSheet)) {
                return false;
            }
            RemoveAssetConfirmationBottomSheet removeAssetConfirmationBottomSheet = (RemoveAssetConfirmationBottomSheet) obj2;
            return Intrinsics.f(this.f87975a, removeAssetConfirmationBottomSheet.f87975a) && Intrinsics.f(this.f87976b, removeAssetConfirmationBottomSheet.f87976b);
        }

        public final int hashCode() {
            return this.f87976b.hashCode() + (this.f87975a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87975a);
            dest.writeString(this.f87976b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step$SelectType;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectType extends TotalWealthFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SelectType> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f87977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f87978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dj0.d f87979c;
        public final int d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                dj0.d dVar = (dj0.d) parcel.readSerializable();
                return new SelectType(parcel.readInt(), parcel.readInt(), dVar, (dj0.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectType[i];
            }
        }

        public SelectType(int i, int i2, dj0.d assetsTotal, dj0.d liabilitiesTotal) {
            Intrinsics.checkNotNullParameter(assetsTotal, "assetsTotal");
            Intrinsics.checkNotNullParameter(liabilitiesTotal, "liabilitiesTotal");
            this.f87977a = assetsTotal;
            this.f87978b = i;
            this.f87979c = liabilitiesTotal;
            this.d = i2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelectType)) {
                return false;
            }
            SelectType selectType = (SelectType) obj2;
            return Intrinsics.f(this.f87977a, selectType.f87977a) && this.f87978b == selectType.f87978b && Intrinsics.f(this.f87979c, selectType.f87979c) && this.d == selectType.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + v7.c(j6.a.b(this.f87978b, this.f87977a.hashCode() * 31, 31), 31, this.f87979c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f87977a);
            dest.writeInt(this.f87978b);
            dest.writeSerializable(this.f87979c);
            dest.writeInt(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step$SmartEstimationBottomSheet;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SmartEstimationBottomSheet extends TotalWealthFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SmartEstimationBottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SmartEstimationBottomSheetContract$Variant f87980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f87981b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SmartEstimationBottomSheet((SmartEstimationBottomSheetContract$Variant) parcel.readParcelable(SmartEstimationBottomSheet.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SmartEstimationBottomSheet[i];
            }
        }

        public SmartEstimationBottomSheet(SmartEstimationBottomSheetContract$Variant variant, boolean z) {
            Intrinsics.checkNotNullParameter(variant, "variant");
            this.f87980a = variant;
            this.f87981b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SmartEstimationBottomSheet)) {
                return false;
            }
            SmartEstimationBottomSheet smartEstimationBottomSheet = (SmartEstimationBottomSheet) obj2;
            return Intrinsics.f(this.f87980a, smartEstimationBottomSheet.f87980a) && this.f87981b == smartEstimationBottomSheet.f87981b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f87981b) + (this.f87980a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87980a, i);
            dest.writeInt(this.f87981b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step$SmartEstimationProductArticle;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SmartEstimationProductArticle extends TotalWealthFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SmartEstimationProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductArticleParams f87982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CustomAsset f87983b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CustomAssetCategoryDefinition f87984c;
        public final xi0.b d;
        public final SmartEstimationAccess e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SmartEstimationProductArticle((ProductArticleParams) parcel.readParcelable(SmartEstimationProductArticle.class.getClassLoader()), (CustomAsset) parcel.readParcelable(SmartEstimationProductArticle.class.getClassLoader()), (CustomAssetCategoryDefinition) parcel.readParcelable(SmartEstimationProductArticle.class.getClassLoader()), (xi0.b) parcel.readSerializable(), SmartEstimationAccess.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SmartEstimationProductArticle[i];
            }
        }

        public SmartEstimationProductArticle(ProductArticleParams params, CustomAsset asset, CustomAssetCategoryDefinition categoryDefinition, xi0.b currency, SmartEstimationAccess smartEstimationAccess) {
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(asset, "asset");
            Intrinsics.checkNotNullParameter(categoryDefinition, "categoryDefinition");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(smartEstimationAccess, "smartEstimationAccess");
            this.f87982a = params;
            this.f87983b = asset;
            this.f87984c = categoryDefinition;
            this.d = currency;
            this.e = smartEstimationAccess;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SmartEstimationProductArticle)) {
                return false;
            }
            SmartEstimationProductArticle smartEstimationProductArticle = (SmartEstimationProductArticle) obj2;
            return Intrinsics.f(this.f87982a, smartEstimationProductArticle.f87982a) && Intrinsics.f(this.f87983b, smartEstimationProductArticle.f87983b) && Intrinsics.f(this.f87984c, smartEstimationProductArticle.f87984c) && Intrinsics.f(this.d, smartEstimationProductArticle.d) && Intrinsics.f(this.e, smartEstimationProductArticle.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + l.j(this.d, (this.f87984c.hashCode() + ((this.f87983b.hashCode() + (this.f87982a.hashCode() * 31)) * 31)) * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87982a, i);
            dest.writeParcelable(this.f87983b, i);
            dest.writeParcelable(this.f87984c, i);
            dest.writeSerializable(this.d);
            this.e.writeToParcel(dest, i);
        }
    }

    private TotalWealthFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step$TotalWealth;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TotalWealth extends TotalWealthFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TotalWealth> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f87985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NetWorthAccount f87986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final amd.b f87987c;
        public final amd.a d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TotalWealth(g.valueOf(parcel.readString()), (NetWorthAccount) parcel.readParcelable(TotalWealth.class.getClassLoader()), parcel.readInt() == 0 ? null : amd.b.valueOf(parcel.readString()), parcel.readInt() != 0 ? amd.a.valueOf(parcel.readString()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TotalWealth[i];
            }
        }

        public TotalWealth(g netWorthType, NetWorthAccount netWorthAccount, amd.b bVar, amd.a aVar) {
            Intrinsics.checkNotNullParameter(netWorthType, "netWorthType");
            Intrinsics.checkNotNullParameter(netWorthAccount, "netWorthAccount");
            this.f87985a = netWorthType;
            this.f87986b = netWorthAccount;
            this.f87987c = bVar;
            this.d = aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TotalWealth)) {
                return false;
            }
            TotalWealth totalWealth = (TotalWealth) obj2;
            return this.f87985a == totalWealth.f87985a && Intrinsics.f(this.f87986b, totalWealth.f87986b) && this.f87987c == totalWealth.f87987c && this.d == totalWealth.d;
        }

        public final int hashCode() {
            int iHashCode = (this.f87986b.hashCode() + (this.f87985a.hashCode() * 31)) * 31;
            amd.b bVar = this.f87987c;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            amd.a aVar = this.d;
            return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87985a.name());
            dest.writeParcelable(this.f87986b, i);
            amd.b bVar = this.f87987c;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            amd.a aVar = this.d;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
        }

        public /* synthetic */ TotalWealth(g gVar, amd.b bVar) {
            this(gVar, NetWorthAccount.Personal.f87455a, bVar, null);
        }
    }
}
