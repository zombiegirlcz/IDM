package com.revolut.feature.insurance.api.models.cfac;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/api/models/cfac/CFACClaimExpenseCancellation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACClaimExpenseCancellation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CFACClaimExpenseCancellation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f74949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f74951c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            long j2 = parcel.readLong();
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CFACClaimCancellationFile.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CFACClaimExpenseCancellation(j2, string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACClaimExpenseCancellation[i];
        }
    }

    public CFACClaimExpenseCancellation(long j2, String cancellerCode, ArrayList documents) {
        Intrinsics.checkNotNullParameter(cancellerCode, "cancellerCode");
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f74949a = j2;
        this.f74950b = cancellerCode;
        this.f74951c = documents;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACClaimExpenseCancellation)) {
            return false;
        }
        CFACClaimExpenseCancellation cFACClaimExpenseCancellation = (CFACClaimExpenseCancellation) obj2;
        return this.f74949a == cFACClaimExpenseCancellation.f74949a && Intrinsics.f(this.f74950b, cFACClaimExpenseCancellation.f74950b) && this.f74951c.equals(cFACClaimExpenseCancellation.f74951c);
    }

    public final int hashCode() {
        return this.f74951c.hashCode() + p.a.c(Long.hashCode(this.f74949a) * 31, 31, this.f74950b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f74949a);
        dest.writeString(this.f74950b);
        Iterator itY = j6.a.y(this.f74951c, dest);
        while (itY.hasNext()) {
            ((CFACClaimCancellationFile) itY.next()).writeToParcel(dest, i);
        }
    }
}
