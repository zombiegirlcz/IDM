package com.revolut.feature.freelancer.impl.ui.profile.tax.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import ds6.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/freelancer/impl/ui/profile/tax/flow/FreelancerTaxSettingsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "TaxSettings", "Vat", "TaxDates", "VatReminder", "TaxHubSettings", "Lcom/revolut/feature/freelancer/impl/ui/profile/tax/flow/FreelancerTaxSettingsFlowContract$Step$TaxDates;", "Lcom/revolut/feature/freelancer/impl/ui/profile/tax/flow/FreelancerTaxSettingsFlowContract$Step$TaxHubSettings;", "Lcom/revolut/feature/freelancer/impl/ui/profile/tax/flow/FreelancerTaxSettingsFlowContract$Step$TaxSettings;", "Lcom/revolut/feature/freelancer/impl/ui/profile/tax/flow/FreelancerTaxSettingsFlowContract$Step$Vat;", "Lcom/revolut/feature/freelancer/impl/ui/profile/tax/flow/FreelancerTaxSettingsFlowContract$Step$VatReminder;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FreelancerTaxSettingsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/tax/flow/FreelancerTaxSettingsFlowContract$Step$TaxDates;", "Lcom/revolut/feature/freelancer/impl/ui/profile/tax/flow/FreelancerTaxSettingsFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TaxDates extends FreelancerTaxSettingsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TaxDates f74056a = new TaxDates();

        @NotNull
        public static final Parcelable.Creator<TaxDates> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TaxDates.f74056a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxDates[i];
            }
        }

        private TaxDates() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/tax/flow/FreelancerTaxSettingsFlowContract$Step$TaxHubSettings;", "Lcom/revolut/feature/freelancer/impl/ui/profile/tax/flow/FreelancerTaxSettingsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxHubSettings extends FreelancerTaxSettingsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TaxHubSettings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f74057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f74058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f74059c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxHubSettings(j.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxHubSettings[i];
            }
        }

        public TaxHubSettings(j taxType, String str, boolean z) {
            Intrinsics.checkNotNullParameter(taxType, "taxType");
            this.f74057a = taxType;
            this.f74058b = str;
            this.f74059c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TaxHubSettings)) {
                return false;
            }
            TaxHubSettings taxHubSettings = (TaxHubSettings) obj2;
            return this.f74057a == taxHubSettings.f74057a && Intrinsics.f(this.f74058b, taxHubSettings.f74058b) && this.f74059c == taxHubSettings.f74059c;
        }

        public final int hashCode() {
            int iHashCode = this.f74057a.hashCode() * 31;
            String str = this.f74058b;
            return Boolean.hashCode(this.f74059c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74057a.name());
            dest.writeString(this.f74058b);
            dest.writeInt(this.f74059c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/tax/flow/FreelancerTaxSettingsFlowContract$Step$TaxSettings;", "Lcom/revolut/feature/freelancer/impl/ui/profile/tax/flow/FreelancerTaxSettingsFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TaxSettings extends FreelancerTaxSettingsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TaxSettings f74060a = new TaxSettings();

        @NotNull
        public static final Parcelable.Creator<TaxSettings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TaxSettings.f74060a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxSettings[i];
            }
        }

        private TaxSettings() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/tax/flow/FreelancerTaxSettingsFlowContract$Step$Vat;", "Lcom/revolut/feature/freelancer/impl/ui/profile/tax/flow/FreelancerTaxSettingsFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Vat extends FreelancerTaxSettingsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Vat f74061a = new Vat();

        @NotNull
        public static final Parcelable.Creator<Vat> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Vat.f74061a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Vat[i];
            }
        }

        private Vat() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/tax/flow/FreelancerTaxSettingsFlowContract$Step$VatReminder;", "Lcom/revolut/feature/freelancer/impl/ui/profile/tax/flow/FreelancerTaxSettingsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VatReminder extends FreelancerTaxSettingsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<VatReminder> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f74062a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VatReminder(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VatReminder[i];
            }
        }

        public VatReminder(String taxProfileId) {
            Intrinsics.checkNotNullParameter(taxProfileId, "taxProfileId");
            this.f74062a = taxProfileId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof VatReminder) && Intrinsics.f(this.f74062a, ((VatReminder) obj2).f74062a);
        }

        public final int hashCode() {
            return this.f74062a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74062a);
        }
    }

    private FreelancerTaxSettingsFlowContract$Step() {
    }
}
