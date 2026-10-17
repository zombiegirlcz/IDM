package com.revolut.feature.onboarding.impl.onboarding.country.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/onboarding/impl/onboarding/country/screen/CountryResidenceScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CountryResidenceScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CountryResidenceScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f78424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t89.a f78425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f78426c;
    public final rbl.a d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            t89.a aVarValueOf = t89.a.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(CountryResidenceScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new CountryResidenceScreenContract$InputData(bVar, aVarValueOf, arrayList, rbl.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CountryResidenceScreenContract$InputData[i];
        }
    }

    public CountryResidenceScreenContract$InputData(b countryCode, t89.a countryTerms, List companies, rbl.a backNavigationType) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(countryTerms, "countryTerms");
        Intrinsics.checkNotNullParameter(companies, "companies");
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        this.f78424a = countryCode;
        this.f78425b = countryTerms;
        this.f78426c = companies;
        this.d = backNavigationType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CountryResidenceScreenContract$InputData)) {
            return false;
        }
        CountryResidenceScreenContract$InputData countryResidenceScreenContract$InputData = (CountryResidenceScreenContract$InputData) obj2;
        return Intrinsics.f(this.f78424a, countryResidenceScreenContract$InputData.f78424a) && this.f78425b == countryResidenceScreenContract$InputData.f78425b && Intrinsics.f(this.f78426c, countryResidenceScreenContract$InputData.f78426c) && this.d == countryResidenceScreenContract$InputData.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d((this.f78425b.hashCode() + (this.f78424a.f297794a.hashCode() * 31)) * 31, 31, this.f78426c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f78424a);
        dest.writeString(this.f78425b.name());
        Iterator itV = p.a.v(this.f78426c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeString(this.d.name());
    }
}
