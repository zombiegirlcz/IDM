package com.revolut.feature.insurance.api.models.cfac;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/api/models/cfac/CFACClaimDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACClaimDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CFACClaimDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACClaimIds f74942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f74943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f74944c;
    public final ArrayList d;
    public final CFACClaimExpenseSummary e;
    public final CFACClaimCancellation f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f74945g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            CFACClaimIds cFACClaimIdsCreateFromParcel = CFACClaimIds.CREATOR.createFromParcel(parcel);
            long j2 = parcel.readLong();
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(CFACClaimProgress.CREATOR, parcel, arrayList, iA2, 1);
            }
            CFACClaimExpenseSummary cFACClaimExpenseSummaryCreateFromParcel = CFACClaimExpenseSummary.CREATOR.createFromParcel(parcel);
            CFACClaimCancellation cFACClaimCancellationCreateFromParcel = CFACClaimCancellation.CREATOR.createFromParcel(parcel);
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CFACClaimDetailsExpense.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new CFACClaimDetails(cFACClaimIdsCreateFromParcel, j2, string, arrayList, cFACClaimExpenseSummaryCreateFromParcel, cFACClaimCancellationCreateFromParcel, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACClaimDetails[i];
        }
    }

    public CFACClaimDetails(CFACClaimIds claimIds, long j2, String str, ArrayList statusHistory, CFACClaimExpenseSummary expenseSummary, CFACClaimCancellation cancellation, ArrayList expenses) {
        Intrinsics.checkNotNullParameter(claimIds, "claimIds");
        Intrinsics.checkNotNullParameter(statusHistory, "statusHistory");
        Intrinsics.checkNotNullParameter(expenseSummary, "expenseSummary");
        Intrinsics.checkNotNullParameter(cancellation, "cancellation");
        Intrinsics.checkNotNullParameter(expenses, "expenses");
        this.f74942a = claimIds;
        this.f74943b = j2;
        this.f74944c = str;
        this.d = statusHistory;
        this.e = expenseSummary;
        this.f = cancellation;
        this.f74945g = expenses;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACClaimDetails)) {
            return false;
        }
        CFACClaimDetails cFACClaimDetails = (CFACClaimDetails) obj2;
        return Intrinsics.f(this.f74942a, cFACClaimDetails.f74942a) && this.f74943b == cFACClaimDetails.f74943b && Intrinsics.f(this.f74944c, cFACClaimDetails.f74944c) && this.d.equals(cFACClaimDetails.d) && Intrinsics.f(this.e, cFACClaimDetails.e) && Intrinsics.f(this.f, cFACClaimDetails.f) && this.f74945g.equals(cFACClaimDetails.f74945g);
    }

    public final int hashCode() {
        int iC = d.c(this.f74942a.hashCode() * 31, 31, this.f74943b);
        String str = this.f74944c;
        return this.f74945g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (iC + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f74942a.writeToParcel(dest, i);
        dest.writeLong(this.f74943b);
        dest.writeString(this.f74944c);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((CFACClaimProgress) itY.next()).writeToParcel(dest, i);
        }
        this.e.writeToParcel(dest, i);
        this.f.writeToParcel(dest, i);
        Iterator itY2 = j6.a.y(this.f74945g, dest);
        while (itY2.hasNext()) {
            ((CFACClaimDetailsExpense) itY2.next()).writeToParcel(dest, i);
        }
    }
}
