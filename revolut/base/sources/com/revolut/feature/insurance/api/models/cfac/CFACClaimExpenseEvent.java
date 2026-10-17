package com.revolut.feature.insurance.api.models.cfac;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/api/models/cfac/CFACClaimExpenseEvent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACClaimExpenseEvent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CFACClaimExpenseEvent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f74953b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CFACClaimExpenseEvent(parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACClaimExpenseEvent[i];
        }
    }

    public CFACClaimExpenseEvent(String purposeCode, long j2) {
        Intrinsics.checkNotNullParameter(purposeCode, "purposeCode");
        this.f74952a = purposeCode;
        this.f74953b = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACClaimExpenseEvent)) {
            return false;
        }
        CFACClaimExpenseEvent cFACClaimExpenseEvent = (CFACClaimExpenseEvent) obj2;
        return Intrinsics.f(this.f74952a, cFACClaimExpenseEvent.f74952a) && this.f74953b == cFACClaimExpenseEvent.f74953b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f74953b) + (this.f74952a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74952a);
        dest.writeLong(this.f74953b);
    }
}
