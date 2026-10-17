package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetFieldDefinition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_edit_asset/AddEditAssetContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CountryPicker", "CurrencyPicker", "OptionsBottomSheet", "DatePicker", "SmartEstimationProductArticle", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_edit_asset/AddEditAssetContract$ModalStep$CountryPicker;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_edit_asset/AddEditAssetContract$ModalStep$CurrencyPicker;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_edit_asset/AddEditAssetContract$ModalStep$DatePicker;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_edit_asset/AddEditAssetContract$ModalStep$OptionsBottomSheet;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_edit_asset/AddEditAssetContract$ModalStep$SmartEstimationProductArticle;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AddEditAssetContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_edit_asset/AddEditAssetContract$ModalStep$CountryPicker;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_edit_asset/AddEditAssetContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CountryPicker extends AddEditAssetContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CountryPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87912a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CountryPicker(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CountryPicker[i];
            }
        }

        public CountryPicker(String fieldName) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            this.f87912a = fieldName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CountryPicker) && Intrinsics.f(this.f87912a, ((CountryPicker) obj2).f87912a);
        }

        public final int hashCode() {
            return this.f87912a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87912a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_edit_asset/AddEditAssetContract$ModalStep$CurrencyPicker;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_edit_asset/AddEditAssetContract$ModalStep;", "<init>", "()V", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CurrencyPicker extends AddEditAssetContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CurrencyPicker f87913a = new CurrencyPicker();

        @NotNull
        public static final Parcelable.Creator<CurrencyPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CurrencyPicker.f87913a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrencyPicker[i];
            }
        }

        private CurrencyPicker() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_edit_asset/AddEditAssetContract$ModalStep$DatePicker;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_edit_asset/AddEditAssetContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DatePicker extends AddEditAssetContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DatePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CustomAssetFieldDefinition f87914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final jrd.a f87915b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DatePicker((CustomAssetFieldDefinition) parcel.readParcelable(DatePicker.class.getClassLoader()), jrd.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DatePicker[i];
            }
        }

        public DatePicker(CustomAssetFieldDefinition fieldDefinition, jrd.a mode) {
            Intrinsics.checkNotNullParameter(fieldDefinition, "fieldDefinition");
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f87914a = fieldDefinition;
            this.f87915b = mode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DatePicker)) {
                return false;
            }
            DatePicker datePicker = (DatePicker) obj2;
            return Intrinsics.f(this.f87914a, datePicker.f87914a) && this.f87915b == datePicker.f87915b;
        }

        public final int hashCode() {
            return this.f87915b.hashCode() + (this.f87914a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87914a, i);
            dest.writeString(this.f87915b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_edit_asset/AddEditAssetContract$ModalStep$OptionsBottomSheet;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_edit_asset/AddEditAssetContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OptionsBottomSheet extends AddEditAssetContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<OptionsBottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CustomAssetFieldDefinition f87916a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OptionsBottomSheet((CustomAssetFieldDefinition) parcel.readParcelable(OptionsBottomSheet.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OptionsBottomSheet[i];
            }
        }

        public OptionsBottomSheet(CustomAssetFieldDefinition fieldDefinition) {
            Intrinsics.checkNotNullParameter(fieldDefinition, "fieldDefinition");
            this.f87916a = fieldDefinition;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OptionsBottomSheet) && Intrinsics.f(this.f87916a, ((OptionsBottomSheet) obj2).f87916a);
        }

        public final int hashCode() {
            return this.f87916a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87916a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_edit_asset/AddEditAssetContract$ModalStep$SmartEstimationProductArticle;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_edit_asset/AddEditAssetContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SmartEstimationProductArticle extends AddEditAssetContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SmartEstimationProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductArticleParams f87917a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SmartEstimationProductArticle((ProductArticleParams) parcel.readParcelable(SmartEstimationProductArticle.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SmartEstimationProductArticle[i];
            }
        }

        public SmartEstimationProductArticle(ProductArticleParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.f87917a = params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SmartEstimationProductArticle) && Intrinsics.f(this.f87917a, ((SmartEstimationProductArticle) obj2).f87917a);
        }

        public final int hashCode() {
            return this.f87917a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87917a, i);
        }
    }

    private AddEditAssetContract$ModalStep() {
    }
}
