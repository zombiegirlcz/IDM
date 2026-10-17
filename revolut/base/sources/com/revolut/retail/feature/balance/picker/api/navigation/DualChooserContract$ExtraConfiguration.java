package com.revolut.retail.feature.balance.picker.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/balance/picker/api/navigation/DualChooserContract$ExtraConfiguration", "Landroid/os/Parcelable;", "ShowDisclaimerForSavings", "CountryProfilesEnabled", "DeFiCurrencies", "Lcom/revolut/retail/feature/balance/picker/api/navigation/DualChooserContract$ExtraConfiguration$CountryProfilesEnabled;", "Lcom/revolut/retail/feature/balance/picker/api/navigation/DualChooserContract$ExtraConfiguration$DeFiCurrencies;", "Lcom/revolut/retail/feature/balance/picker/api/navigation/DualChooserContract$ExtraConfiguration$ShowDisclaimerForSavings;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DualChooserContract$ExtraConfiguration extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/navigation/DualChooserContract$ExtraConfiguration$CountryProfilesEnabled;", "Lcom/revolut/retail/feature/balance/picker/api/navigation/DualChooserContract$ExtraConfiguration;", "<init>", "()V", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CountryProfilesEnabled implements DualChooserContract$ExtraConfiguration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CountryProfilesEnabled f99487a = new CountryProfilesEnabled();

        @NotNull
        public static final Parcelable.Creator<CountryProfilesEnabled> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CountryProfilesEnabled.f99487a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CountryProfilesEnabled[i];
            }
        }

        private CountryProfilesEnabled() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/navigation/DualChooserContract$ExtraConfiguration$DeFiCurrencies;", "Lcom/revolut/retail/feature/balance/picker/api/navigation/DualChooserContract$ExtraConfiguration;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeFiCurrencies implements DualChooserContract$ExtraConfiguration {

        @NotNull
        public static final Parcelable.Creator<DeFiCurrencies> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wk5.a f99488a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeFiCurrencies(wk5.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeFiCurrencies[i];
            }
        }

        public DeFiCurrencies(wk5.a chain) {
            Intrinsics.checkNotNullParameter(chain, "chain");
            this.f99488a = chain;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DeFiCurrencies) && this.f99488a == ((DeFiCurrencies) obj2).f99488a;
        }

        public final int hashCode() {
            return this.f99488a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99488a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/navigation/DualChooserContract$ExtraConfiguration$ShowDisclaimerForSavings;", "Lcom/revolut/retail/feature/balance/picker/api/navigation/DualChooserContract$ExtraConfiguration;", "<init>", "()V", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowDisclaimerForSavings implements DualChooserContract$ExtraConfiguration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowDisclaimerForSavings f99489a = new ShowDisclaimerForSavings();

        @NotNull
        public static final Parcelable.Creator<ShowDisclaimerForSavings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowDisclaimerForSavings.f99489a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowDisclaimerForSavings[i];
            }
        }

        private ShowDisclaimerForSavings() {
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
