package com.revolut.feature.retail.salary_account.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/api/navigation/VerifyEmploymentDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_account_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VerifyEmploymentDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<VerifyEmploymentDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82965b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VerifyEmploymentDestination(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VerifyEmploymentDestination[i];
        }
    }

    public VerifyEmploymentDestination(String str, String str2) {
        this.f82964a = str;
        this.f82965b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof VerifyEmploymentDestination)) {
            return false;
        }
        VerifyEmploymentDestination verifyEmploymentDestination = (VerifyEmploymentDestination) obj2;
        return Intrinsics.f(this.f82964a, verifyEmploymentDestination.f82964a) && Intrinsics.f(this.f82965b, verifyEmploymentDestination.f82965b);
    }

    public final int hashCode() {
        String str = this.f82964a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f82965b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82964a);
        dest.writeString(this.f82965b);
    }

    public VerifyEmploymentDestination() {
        this(null, null);
    }
}
