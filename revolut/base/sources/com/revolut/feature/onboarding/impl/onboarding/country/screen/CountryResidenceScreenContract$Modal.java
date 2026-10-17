package com.revolut.feature.onboarding.impl.onboarding.country.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/onboarding/impl/onboarding/country/screen/CountryResidenceScreenContract$Modal", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "LanguageChangeDialog", "CountryPicker", "ContractualDocumentation", "Lcom/revolut/feature/onboarding/impl/onboarding/country/screen/CountryResidenceScreenContract$Modal$ContractualDocumentation;", "Lcom/revolut/feature/onboarding/impl/onboarding/country/screen/CountryResidenceScreenContract$Modal$CountryPicker;", "Lcom/revolut/feature/onboarding/impl/onboarding/country/screen/CountryResidenceScreenContract$Modal$LanguageChangeDialog;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CountryResidenceScreenContract$Modal extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/country/screen/CountryResidenceScreenContract$Modal$ContractualDocumentation;", "Lcom/revolut/feature/onboarding/impl/onboarding/country/screen/CountryResidenceScreenContract$Modal;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ContractualDocumentation implements CountryResidenceScreenContract$Modal {

        @NotNull
        public static final Parcelable.Creator<ContractualDocumentation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f78427a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ContractualDocumentation((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ContractualDocumentation[i];
            }
        }

        public ContractualDocumentation(b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f78427a = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ContractualDocumentation) && Intrinsics.f(this.f78427a, ((ContractualDocumentation) obj2).f78427a);
        }

        public final int hashCode() {
            return this.f78427a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78427a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/country/screen/CountryResidenceScreenContract$Modal$CountryPicker;", "Lcom/revolut/feature/onboarding/impl/onboarding/country/screen/CountryResidenceScreenContract$Modal;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CountryPicker implements CountryResidenceScreenContract$Modal {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CountryPicker f78428a = new CountryPicker();

        @NotNull
        public static final Parcelable.Creator<CountryPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CountryPicker.f78428a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CountryPicker[i];
            }
        }

        private CountryPicker() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/country/screen/CountryResidenceScreenContract$Modal$LanguageChangeDialog;", "Lcom/revolut/feature/onboarding/impl/onboarding/country/screen/CountryResidenceScreenContract$Modal;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LanguageChangeDialog implements CountryResidenceScreenContract$Modal {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LanguageChangeDialog f78429a = new LanguageChangeDialog();

        @NotNull
        public static final Parcelable.Creator<LanguageChangeDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LanguageChangeDialog.f78429a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LanguageChangeDialog[i];
            }
        }

        private LanguageChangeDialog() {
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
}
