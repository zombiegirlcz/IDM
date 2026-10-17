package com.revolut.feature.onboarding.countries.restriction.api.disclaimer;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/onboarding/countries/restriction/api/disclaimer/CountryOfResidenceRevolutXDisclaimerFactory$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_onboarding_countries_restriction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CountryOfResidenceRevolutXDisclaimerFactory$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CountryOfResidenceRevolutXDisclaimerFactory$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f78250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f78251b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(CountryOfResidenceRevolutXDisclaimerFactory$InputData.class, parcel, arrayList, iE, 1);
            }
            return new CountryOfResidenceRevolutXDisclaimerFactory$InputData(arrayList, bVar);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CountryOfResidenceRevolutXDisclaimerFactory$InputData[i];
        }
    }

    public CountryOfResidenceRevolutXDisclaimerFactory$InputData(List companies, b countryResidence) {
        Intrinsics.checkNotNullParameter(countryResidence, "countryResidence");
        Intrinsics.checkNotNullParameter(companies, "companies");
        this.f78250a = countryResidence;
        this.f78251b = companies;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CountryOfResidenceRevolutXDisclaimerFactory$InputData)) {
            return false;
        }
        CountryOfResidenceRevolutXDisclaimerFactory$InputData countryOfResidenceRevolutXDisclaimerFactory$InputData = (CountryOfResidenceRevolutXDisclaimerFactory$InputData) obj2;
        return Intrinsics.f(this.f78250a, countryOfResidenceRevolutXDisclaimerFactory$InputData.f78250a) && Intrinsics.f(this.f78251b, countryOfResidenceRevolutXDisclaimerFactory$InputData.f78251b);
    }

    public final int hashCode() {
        return this.f78251b.hashCode() + (this.f78250a.f297794a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f78250a);
        Iterator itV = p.a.v(this.f78251b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
