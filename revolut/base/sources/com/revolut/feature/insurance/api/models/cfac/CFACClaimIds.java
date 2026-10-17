package com.revolut.feature.insurance.api.models.cfac;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/api/models/cfac/CFACClaimIds;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACClaimIds implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CFACClaimIds> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74960b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CFACClaimIds(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACClaimIds[i];
        }
    }

    public CFACClaimIds(String internalId, String str) {
        Intrinsics.checkNotNullParameter(internalId, "internalId");
        this.f74959a = internalId;
        this.f74960b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACClaimIds)) {
            return false;
        }
        CFACClaimIds cFACClaimIds = (CFACClaimIds) obj2;
        return Intrinsics.f(this.f74959a, cFACClaimIds.f74959a) && Intrinsics.f(this.f74960b, cFACClaimIds.f74960b);
    }

    public final int hashCode() {
        int iHashCode = this.f74959a.hashCode() * 31;
        String str = this.f74960b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74959a);
        dest.writeString(this.f74960b);
    }
}
