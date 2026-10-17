package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimDataPlanOption;", "Landroid/os/Parcelable;", "CountryOption", "RegionalOption", "GlobalOption", "Lcom/revolut/retail/feature/esim/api/model/EsimDataPlanOption$CountryOption;", "Lcom/revolut/retail/feature/esim/api/model/EsimDataPlanOption$GlobalOption;", "Lcom/revolut/retail/feature/esim/api/model/EsimDataPlanOption$RegionalOption;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimDataPlanOption extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimDataPlanOption$CountryOption;", "Lcom/revolut/retail/feature/esim/api/model/EsimDataPlanOption;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CountryOption implements EsimDataPlanOption {

        @NotNull
        public static final Parcelable.Creator<CountryOption> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f100238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f100239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f100240c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CountryOption(parcel.readInt(), (b) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CountryOption[i];
            }
        }

        public CountryOption(int i, b coverageCountry, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(coverageCountry, "coverageCountry");
            this.f100238a = coverageCountry;
            this.f100239b = i;
            this.f100240c = z;
            this.d = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CountryOption)) {
                return false;
            }
            CountryOption countryOption = (CountryOption) obj2;
            return Intrinsics.f(this.f100238a, countryOption.f100238a) && this.f100239b == countryOption.f100239b && this.f100240c == countryOption.f100240c && this.d == countryOption.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + j6.a.c(j6.a.b(this.f100239b, this.f100238a.f297794a.hashCode() * 31, 31), 31, this.f100240c);
        }

        @Override // com.revolut.retail.feature.esim.api.model.EsimDataPlanOption
        /* JADX INFO: renamed from: l1 */
        public final List getF100245b() {
            return u.c(this.f100238a);
        }

        @Override // com.revolut.retail.feature.esim.api.model.EsimDataPlanOption
        /* JADX INFO: renamed from: m0 */
        public final EsimDataPlanCoverageCode getF100244a() {
            return new EsimDataPlanCoverageCode(this.f100238a.f297794a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f100238a);
            dest.writeInt(this.f100239b);
            dest.writeInt(this.f100240c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimDataPlanOption$GlobalOption;", "Lcom/revolut/retail/feature/esim/api/model/EsimDataPlanOption;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GlobalOption implements EsimDataPlanOption {

        @NotNull
        public static final Parcelable.Creator<GlobalOption> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimDataPlanCoverageCode f100241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f100242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f100243c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                EsimDataPlanCoverageCode esimDataPlanCoverageCodeCreateFromParcel = EsimDataPlanCoverageCode.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new GlobalOption(esimDataPlanCoverageCodeCreateFromParcel, arrayList, parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GlobalOption[i];
            }
        }

        public GlobalOption(EsimDataPlanCoverageCode coverageCode, List coverageCountries, int i) {
            Intrinsics.checkNotNullParameter(coverageCode, "coverageCode");
            Intrinsics.checkNotNullParameter(coverageCountries, "coverageCountries");
            this.f100241a = coverageCode;
            this.f100242b = coverageCountries;
            this.f100243c = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof GlobalOption)) {
                return false;
            }
            GlobalOption globalOption = (GlobalOption) obj2;
            return Intrinsics.f(this.f100241a, globalOption.f100241a) && Intrinsics.f(this.f100242b, globalOption.f100242b) && this.f100243c == globalOption.f100243c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f100243c) + p.a.d(this.f100241a.f100235a.hashCode() * 31, 31, this.f100242b);
        }

        @Override // com.revolut.retail.feature.esim.api.model.EsimDataPlanOption
        /* JADX INFO: renamed from: l1, reason: from getter */
        public final List getF100245b() {
            return this.f100242b;
        }

        @Override // com.revolut.retail.feature.esim.api.model.EsimDataPlanOption
        /* JADX INFO: renamed from: m0, reason: from getter */
        public final EsimDataPlanCoverageCode getF100244a() {
            return this.f100241a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f100241a.writeToParcel(dest, i);
            Iterator itV = p.a.v(this.f100242b, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            dest.writeInt(this.f100243c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimDataPlanOption$RegionalOption;", "Lcom/revolut/retail/feature/esim/api/model/EsimDataPlanOption;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RegionalOption implements EsimDataPlanOption {

        @NotNull
        public static final Parcelable.Creator<RegionalOption> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimDataPlanCoverageCode f100244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f100245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f100246c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                EsimDataPlanCoverageCode esimDataPlanCoverageCodeCreateFromParcel = EsimDataPlanCoverageCode.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new RegionalOption(esimDataPlanCoverageCodeCreateFromParcel, arrayList, parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RegionalOption[i];
            }
        }

        public RegionalOption(EsimDataPlanCoverageCode coverageCode, List coverageCountries, int i) {
            Intrinsics.checkNotNullParameter(coverageCode, "coverageCode");
            Intrinsics.checkNotNullParameter(coverageCountries, "coverageCountries");
            this.f100244a = coverageCode;
            this.f100245b = coverageCountries;
            this.f100246c = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RegionalOption)) {
                return false;
            }
            RegionalOption regionalOption = (RegionalOption) obj2;
            return Intrinsics.f(this.f100244a, regionalOption.f100244a) && Intrinsics.f(this.f100245b, regionalOption.f100245b) && this.f100246c == regionalOption.f100246c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f100246c) + p.a.d(this.f100244a.f100235a.hashCode() * 31, 31, this.f100245b);
        }

        @Override // com.revolut.retail.feature.esim.api.model.EsimDataPlanOption
        /* JADX INFO: renamed from: l1, reason: from getter */
        public final List getF100245b() {
            return this.f100245b;
        }

        @Override // com.revolut.retail.feature.esim.api.model.EsimDataPlanOption
        /* JADX INFO: renamed from: m0, reason: from getter */
        public final EsimDataPlanCoverageCode getF100244a() {
            return this.f100244a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f100244a.writeToParcel(dest, i);
            Iterator itV = p.a.v(this.f100245b, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            dest.writeInt(this.f100246c);
        }
    }

    /* JADX INFO: renamed from: l1 */
    List getF100245b();

    /* JADX INFO: renamed from: m0 */
    EsimDataPlanCoverageCode getF100244a();
}
