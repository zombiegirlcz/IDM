package com.revolut.feature.transfer_reasons.impl.ui.additional_info;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer_reasons.models.additional_info.AdditionalInfoField;
import com.revolut.feature.transfer_reasons.models.additional_info.AdditionalInfoFooter;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/transfer_reasons/impl/ui/additional_info/TransferReasonsAdditionalInfoScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AdditionalInfoDisclosure", "AdditionalInfoDropdownSelection", "Lcom/revolut/feature/transfer_reasons/impl/ui/additional_info/TransferReasonsAdditionalInfoScreenContract$ModalStep$AdditionalInfoDisclosure;", "Lcom/revolut/feature/transfer_reasons/impl/ui/additional_info/TransferReasonsAdditionalInfoScreenContract$ModalStep$AdditionalInfoDropdownSelection;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransferReasonsAdditionalInfoScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/impl/ui/additional_info/TransferReasonsAdditionalInfoScreenContract$ModalStep$AdditionalInfoDisclosure;", "Lcom/revolut/feature/transfer_reasons/impl/ui/additional_info/TransferReasonsAdditionalInfoScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdditionalInfoDisclosure implements TransferReasonsAdditionalInfoScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AdditionalInfoDisclosure> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AdditionalInfoFooter.Parameter f92377a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AdditionalInfoDisclosure((AdditionalInfoFooter.Parameter) parcel.readParcelable(AdditionalInfoDisclosure.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdditionalInfoDisclosure[i];
            }
        }

        public AdditionalInfoDisclosure(AdditionalInfoFooter.Parameter parameter) {
            Intrinsics.checkNotNullParameter(parameter, "parameter");
            this.f92377a = parameter;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AdditionalInfoDisclosure) && Intrinsics.f(this.f92377a, ((AdditionalInfoDisclosure) obj2).f92377a);
        }

        public final int hashCode() {
            return this.f92377a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f92377a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/impl/ui/additional_info/TransferReasonsAdditionalInfoScreenContract$ModalStep$AdditionalInfoDropdownSelection;", "Lcom/revolut/feature/transfer_reasons/impl/ui/additional_info/TransferReasonsAdditionalInfoScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdditionalInfoDropdownSelection implements TransferReasonsAdditionalInfoScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AdditionalInfoDropdownSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AdditionalInfoField f92378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f92379b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AdditionalInfoDropdownSelection((AdditionalInfoField) parcel.readParcelable(AdditionalInfoDropdownSelection.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdditionalInfoDropdownSelection[i];
            }
        }

        public AdditionalInfoDropdownSelection(AdditionalInfoField field, String str) {
            Intrinsics.checkNotNullParameter(field, "field");
            this.f92378a = field;
            this.f92379b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AdditionalInfoDropdownSelection)) {
                return false;
            }
            AdditionalInfoDropdownSelection additionalInfoDropdownSelection = (AdditionalInfoDropdownSelection) obj2;
            return Intrinsics.f(this.f92378a, additionalInfoDropdownSelection.f92378a) && Intrinsics.f(this.f92379b, additionalInfoDropdownSelection.f92379b);
        }

        public final int hashCode() {
            int iHashCode = this.f92378a.hashCode() * 31;
            String str = this.f92379b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f92378a, i);
            dest.writeString(this.f92379b);
        }
    }
}
