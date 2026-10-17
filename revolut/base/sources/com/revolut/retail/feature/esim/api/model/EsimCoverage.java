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
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimCoverage;", "Landroid/os/Parcelable;", "Country", "Regional", "Global", "Undefined", "Lcom/revolut/retail/feature/esim/api/model/EsimCoverage$Country;", "Lcom/revolut/retail/feature/esim/api/model/EsimCoverage$Global;", "Lcom/revolut/retail/feature/esim/api/model/EsimCoverage$Regional;", "Lcom/revolut/retail/feature/esim/api/model/EsimCoverage$Undefined;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimCoverage extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimCoverage$Country;", "Lcom/revolut/retail/feature/esim/api/model/EsimCoverage;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Country implements EsimCoverage {

        @NotNull
        public static final Parcelable.Creator<Country> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f100204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100205b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Country((b) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Country[i];
            }
        }

        public Country(b countryCode, String str) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f100204a = countryCode;
            this.f100205b = str;
        }

        @Override // com.revolut.retail.feature.esim.api.model.EsimCoverage
        /* JADX INFO: renamed from: A3 */
        public final List getF100208a() {
            return u.c(this.f100204a);
        }

        @Override // com.revolut.retail.feature.esim.api.model.EsimCoverage
        /* JADX INFO: renamed from: Y9, reason: from getter */
        public final String getF100210c() {
            return this.f100205b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Country)) {
                return false;
            }
            Country country = (Country) obj2;
            return Intrinsics.f(this.f100204a, country.f100204a) && Intrinsics.f(this.f100205b, country.f100205b);
        }

        public final int hashCode() {
            int iHashCode = this.f100204a.f297794a.hashCode() * 31;
            String str = this.f100205b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // com.revolut.retail.feature.esim.api.model.EsimCoverage
        /* JADX INFO: renamed from: m0 */
        public final EsimDataPlanCoverageCode getF100209b() {
            return new EsimDataPlanCoverageCode(this.f100204a.f297794a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f100204a);
            dest.writeString(this.f100205b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimCoverage$Global;", "Lcom/revolut/retail/feature/esim/api/model/EsimCoverage;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Global implements EsimCoverage {

        @NotNull
        public static final Parcelable.Creator<Global> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f100206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100207b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new Global(arrayList, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Global[i];
            }
        }

        public Global(List countries, String str) {
            Intrinsics.checkNotNullParameter(countries, "countries");
            this.f100206a = countries;
            this.f100207b = str;
        }

        @Override // com.revolut.retail.feature.esim.api.model.EsimCoverage
        /* JADX INFO: renamed from: A3, reason: from getter */
        public final List getF100208a() {
            return this.f100206a;
        }

        @Override // com.revolut.retail.feature.esim.api.model.EsimCoverage
        /* JADX INFO: renamed from: Y9, reason: from getter */
        public final String getF100210c() {
            return this.f100207b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Global)) {
                return false;
            }
            Global global = (Global) obj2;
            return Intrinsics.f(this.f100206a, global.f100206a) && Intrinsics.f(this.f100207b, global.f100207b);
        }

        public final int hashCode() {
            int iHashCode = this.f100206a.hashCode() * 31;
            String str = this.f100207b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // com.revolut.retail.feature.esim.api.model.EsimCoverage
        /* JADX INFO: renamed from: m0 */
        public final EsimDataPlanCoverageCode getF100209b() {
            EsimDataPlanCoverageCode.INSTANCE.getClass();
            return EsimDataPlanCoverageCode.f100231b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f100206a, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            dest.writeString(this.f100207b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimCoverage$Regional;", "Lcom/revolut/retail/feature/esim/api/model/EsimCoverage;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Regional implements EsimCoverage {

        @NotNull
        public static final Parcelable.Creator<Regional> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f100208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EsimDataPlanCoverageCode f100209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f100210c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new Regional(arrayList, EsimDataPlanCoverageCode.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Regional[i];
            }
        }

        public Regional(List countries, EsimDataPlanCoverageCode regionCode, String str) {
            Intrinsics.checkNotNullParameter(countries, "countries");
            Intrinsics.checkNotNullParameter(regionCode, "regionCode");
            this.f100208a = countries;
            this.f100209b = regionCode;
            this.f100210c = str;
        }

        @Override // com.revolut.retail.feature.esim.api.model.EsimCoverage
        /* JADX INFO: renamed from: A3, reason: from getter */
        public final List getF100208a() {
            return this.f100208a;
        }

        @Override // com.revolut.retail.feature.esim.api.model.EsimCoverage
        /* JADX INFO: renamed from: Y9, reason: from getter */
        public final String getF100210c() {
            return this.f100210c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Regional)) {
                return false;
            }
            Regional regional = (Regional) obj2;
            return Intrinsics.f(this.f100208a, regional.f100208a) && Intrinsics.f(this.f100209b, regional.f100209b) && Intrinsics.f(this.f100210c, regional.f100210c);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f100208a.hashCode() * 31, 31, this.f100209b.f100235a);
            String str = this.f100210c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // com.revolut.retail.feature.esim.api.model.EsimCoverage
        /* JADX INFO: renamed from: m0, reason: from getter */
        public final EsimDataPlanCoverageCode getF100209b() {
            return this.f100209b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f100208a, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            this.f100209b.writeToParcel(dest, i);
            dest.writeString(this.f100210c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimCoverage$Undefined;", "Lcom/revolut/retail/feature/esim/api/model/EsimCoverage;", "<init>", "()V", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Undefined implements EsimCoverage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Undefined f100211a = new Undefined();

        @NotNull
        public static final Parcelable.Creator<Undefined> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Undefined.f100211a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Undefined[i];
            }
        }

        private Undefined() {
        }

        @Override // com.revolut.retail.feature.esim.api.model.EsimCoverage
        /* JADX INFO: renamed from: A3 */
        public final List getF100208a() {
            return f0.f322471a;
        }

        @Override // com.revolut.retail.feature.esim.api.model.EsimCoverage
        /* JADX INFO: renamed from: Y9 */
        public final String getF100210c() {
            return null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.retail.feature.esim.api.model.EsimCoverage
        /* JADX INFO: renamed from: m0 */
        public final EsimDataPlanCoverageCode getF100209b() {
            return new EsimDataPlanCoverageCode("UNKNOWN");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: A3 */
    List getF100208a();

    /* JADX INFO: renamed from: Y9 */
    String getF100210c();

    /* JADX INFO: renamed from: m0 */
    EsimDataPlanCoverageCode getF100209b();
}
