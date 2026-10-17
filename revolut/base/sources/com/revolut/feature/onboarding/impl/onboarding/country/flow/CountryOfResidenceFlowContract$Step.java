package com.revolut.feature.onboarding.impl.onboarding.country.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"com/revolut/feature/onboarding/impl/onboarding/country/flow/CountryOfResidenceFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Country", "JuniorGraduationCountryChange", "Disclaimer", "NavigateToRetailApp", "OnboardingNotAvailableForCountry", "IndiaAppRedirection", "Lcom/revolut/feature/onboarding/impl/onboarding/country/flow/CountryOfResidenceFlowContract$Step$Country;", "Lcom/revolut/feature/onboarding/impl/onboarding/country/flow/CountryOfResidenceFlowContract$Step$Disclaimer;", "Lcom/revolut/feature/onboarding/impl/onboarding/country/flow/CountryOfResidenceFlowContract$Step$IndiaAppRedirection;", "Lcom/revolut/feature/onboarding/impl/onboarding/country/flow/CountryOfResidenceFlowContract$Step$JuniorGraduationCountryChange;", "Lcom/revolut/feature/onboarding/impl/onboarding/country/flow/CountryOfResidenceFlowContract$Step$NavigateToRetailApp;", "Lcom/revolut/feature/onboarding/impl/onboarding/country/flow/CountryOfResidenceFlowContract$Step$OnboardingNotAvailableForCountry;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CountryOfResidenceFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/country/flow/CountryOfResidenceFlowContract$Step$Country;", "Lcom/revolut/feature/onboarding/impl/onboarding/country/flow/CountryOfResidenceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Country extends CountryOfResidenceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Country> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f78404a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Country.class, parcel, arrayList, iE, 1);
                }
                return new Country(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Country[i];
            }
        }

        public Country(List companies) {
            Intrinsics.checkNotNullParameter(companies, "companies");
            this.f78404a = companies;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Country) && Intrinsics.f(this.f78404a, ((Country) obj2).f78404a);
        }

        public final int hashCode() {
            return this.f78404a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f78404a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/country/flow/CountryOfResidenceFlowContract$Step$Disclaimer;", "Lcom/revolut/feature/onboarding/impl/onboarding/country/flow/CountryOfResidenceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Disclaimer extends CountryOfResidenceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Disclaimer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f78405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t89.a f78406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f78407c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                wi0.b bVar = (wi0.b) parcel.readSerializable();
                t89.a aVarValueOf = t89.a.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Disclaimer.class, parcel, arrayList, iE, 1);
                }
                return new Disclaimer(bVar, aVarValueOf, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Disclaimer[i];
            }
        }

        public Disclaimer(wi0.b countryResidence, t89.a countryTerms, List companies) {
            Intrinsics.checkNotNullParameter(countryResidence, "countryResidence");
            Intrinsics.checkNotNullParameter(countryTerms, "countryTerms");
            Intrinsics.checkNotNullParameter(companies, "companies");
            this.f78405a = countryResidence;
            this.f78406b = countryTerms;
            this.f78407c = companies;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Disclaimer)) {
                return false;
            }
            Disclaimer disclaimer = (Disclaimer) obj2;
            return Intrinsics.f(this.f78405a, disclaimer.f78405a) && this.f78406b == disclaimer.f78406b && Intrinsics.f(this.f78407c, disclaimer.f78407c);
        }

        public final int hashCode() {
            return this.f78407c.hashCode() + ((this.f78406b.hashCode() + (this.f78405a.f297794a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78405a);
            dest.writeString(this.f78406b.name());
            Iterator itV = p.a.v(this.f78407c, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/country/flow/CountryOfResidenceFlowContract$Step$IndiaAppRedirection;", "Lcom/revolut/feature/onboarding/impl/onboarding/country/flow/CountryOfResidenceFlowContract$Step;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IndiaAppRedirection extends CountryOfResidenceFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final IndiaAppRedirection f78408a = new IndiaAppRedirection();

        @NotNull
        public static final Parcelable.Creator<IndiaAppRedirection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IndiaAppRedirection.f78408a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IndiaAppRedirection[i];
            }
        }

        private IndiaAppRedirection() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/country/flow/CountryOfResidenceFlowContract$Step$JuniorGraduationCountryChange;", "Lcom/revolut/feature/onboarding/impl/onboarding/country/flow/CountryOfResidenceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JuniorGraduationCountryChange extends CountryOfResidenceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<JuniorGraduationCountryChange> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f78409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t89.a f78410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f78411c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                wi0.b bVar = (wi0.b) parcel.readSerializable();
                t89.a aVarValueOf = t89.a.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(JuniorGraduationCountryChange.class, parcel, arrayList, iE, 1);
                }
                return new JuniorGraduationCountryChange(bVar, aVarValueOf, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JuniorGraduationCountryChange[i];
            }
        }

        public JuniorGraduationCountryChange(wi0.b countryOfResidence, t89.a countryTerms, List companies) {
            Intrinsics.checkNotNullParameter(countryOfResidence, "countryOfResidence");
            Intrinsics.checkNotNullParameter(countryTerms, "countryTerms");
            Intrinsics.checkNotNullParameter(companies, "companies");
            this.f78409a = countryOfResidence;
            this.f78410b = countryTerms;
            this.f78411c = companies;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof JuniorGraduationCountryChange)) {
                return false;
            }
            JuniorGraduationCountryChange juniorGraduationCountryChange = (JuniorGraduationCountryChange) obj2;
            return Intrinsics.f(this.f78409a, juniorGraduationCountryChange.f78409a) && this.f78410b == juniorGraduationCountryChange.f78410b && Intrinsics.f(this.f78411c, juniorGraduationCountryChange.f78411c);
        }

        public final int hashCode() {
            return this.f78411c.hashCode() + ((this.f78410b.hashCode() + (this.f78409a.f297794a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78409a);
            dest.writeString(this.f78410b.name());
            Iterator itV = p.a.v(this.f78411c, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/country/flow/CountryOfResidenceFlowContract$Step$NavigateToRetailApp;", "Lcom/revolut/feature/onboarding/impl/onboarding/country/flow/CountryOfResidenceFlowContract$Step;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NavigateToRetailApp extends CountryOfResidenceFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NavigateToRetailApp f78412a = new NavigateToRetailApp();

        @NotNull
        public static final Parcelable.Creator<NavigateToRetailApp> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NavigateToRetailApp.f78412a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NavigateToRetailApp[i];
            }
        }

        private NavigateToRetailApp() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/country/flow/CountryOfResidenceFlowContract$Step$OnboardingNotAvailableForCountry;", "Lcom/revolut/feature/onboarding/impl/onboarding/country/flow/CountryOfResidenceFlowContract$Step;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OnboardingNotAvailableForCountry extends CountryOfResidenceFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnboardingNotAvailableForCountry f78413a = new OnboardingNotAvailableForCountry();

        @NotNull
        public static final Parcelable.Creator<OnboardingNotAvailableForCountry> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OnboardingNotAvailableForCountry.f78413a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OnboardingNotAvailableForCountry[i];
            }
        }

        private OnboardingNotAvailableForCountry() {
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

    private CountryOfResidenceFlowContract$Step() {
    }
}
