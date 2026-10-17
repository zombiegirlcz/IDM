package com.revolut.feature.insurance_credit.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_credit/api/navigation/InsuranceCreditNavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_insurance_credit_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InsuranceCreditNavigationDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<InsuranceCreditNavigationDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Facility f75731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75733c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InsuranceCreditNavigationDestination((Facility) parcel.readParcelable(InsuranceCreditNavigationDestination.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InsuranceCreditNavigationDestination[i];
        }
    }

    public InsuranceCreditNavigationDestination(Facility facility, String policyId, String str) {
        Intrinsics.checkNotNullParameter(facility, "facility");
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        this.f75731a = facility;
        this.f75732b = policyId;
        this.f75733c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InsuranceCreditNavigationDestination)) {
            return false;
        }
        InsuranceCreditNavigationDestination insuranceCreditNavigationDestination = (InsuranceCreditNavigationDestination) obj2;
        return Intrinsics.f(this.f75731a, insuranceCreditNavigationDestination.f75731a) && Intrinsics.f(this.f75732b, insuranceCreditNavigationDestination.f75732b) && Intrinsics.f(this.f75733c, insuranceCreditNavigationDestination.f75733c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f75731a.hashCode() * 31, 31, this.f75732b);
        String str = this.f75733c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f75731a, i);
        dest.writeString(this.f75732b);
        dest.writeString(this.f75733c);
    }
}
