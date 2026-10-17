package com.revolut.feature.insurance.api.models.cfac;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/api/models/cfac/CFACClaimExpenseTransaction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACClaimExpenseTransaction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CFACClaimExpenseTransaction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f74958c;
    public final long d;
    public final d e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CFACClaimExpenseTransaction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACClaimExpenseTransaction[i];
        }
    }

    public CFACClaimExpenseTransaction(String id10, String description, String str, long j2, d claimedAmount) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(claimedAmount, "claimedAmount");
        this.f74956a = id10;
        this.f74957b = description;
        this.f74958c = str;
        this.d = j2;
        this.e = claimedAmount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACClaimExpenseTransaction)) {
            return false;
        }
        CFACClaimExpenseTransaction cFACClaimExpenseTransaction = (CFACClaimExpenseTransaction) obj2;
        return Intrinsics.f(this.f74956a, cFACClaimExpenseTransaction.f74956a) && Intrinsics.f(this.f74957b, cFACClaimExpenseTransaction.f74957b) && Intrinsics.f(this.f74958c, cFACClaimExpenseTransaction.f74958c) && this.d == cFACClaimExpenseTransaction.d && Intrinsics.f(this.e, cFACClaimExpenseTransaction.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f74956a.hashCode() * 31, 31, this.f74957b);
        String str = this.f74958c;
        return this.e.hashCode() + a0.d.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74956a);
        dest.writeString(this.f74957b);
        dest.writeString(this.f74958c);
        dest.writeLong(this.d);
        dest.writeSerializable(this.e);
    }
}
