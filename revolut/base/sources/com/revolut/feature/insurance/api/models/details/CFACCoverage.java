package com.revolut.feature.insurance.api.models.details;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/api/models/details/CFACCoverage;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACCoverage implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CFACCoverage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACCoverageType f74981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74982b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CFACCoverage(CFACCoverageType.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACCoverage[i];
        }
    }

    public CFACCoverage(CFACCoverageType type, String description) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f74981a = type;
        this.f74982b = description;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACCoverage)) {
            return false;
        }
        CFACCoverage cFACCoverage = (CFACCoverage) obj2;
        return this.f74981a == cFACCoverage.f74981a && Intrinsics.f(this.f74982b, cFACCoverage.f74982b);
    }

    public final int hashCode() {
        return this.f74982b.hashCode() + (this.f74981a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f74981a.writeToParcel(dest, i);
        dest.writeString(this.f74982b);
    }
}
