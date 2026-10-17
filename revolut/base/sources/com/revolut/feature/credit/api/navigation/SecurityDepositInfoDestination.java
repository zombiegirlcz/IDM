package com.revolut.feature.credit.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/api/navigation/SecurityDepositInfoDestination;", "Lcom/revolut/feature/credit/api/navigation/CreditKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SecurityDepositInfoDestination implements CreditKompotDestination {

    @NotNull
    public static final Parcelable.Creator<SecurityDepositInfoDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66178a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SecurityDepositInfoDestination(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SecurityDepositInfoDestination[i];
        }
    }

    public SecurityDepositInfoDestination(String pocketId) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f66178a = pocketId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SecurityDepositInfoDestination) && Intrinsics.f(this.f66178a, ((SecurityDepositInfoDestination) obj2).f66178a);
    }

    /* JADX INFO: renamed from: getPocketId, reason: from getter */
    public final String getF66178a() {
        return this.f66178a;
    }

    public final int hashCode() {
        return this.f66178a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66178a);
    }
}
