package com.revolut.feature.insurance.api.models.details;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/api/models/details/CFACClaimProperties;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACClaimProperties implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CFACClaimProperties> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACClaimTransactions f74973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f74974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f74975c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            CFACClaimTransactions cFACClaimTransactionsCreateFromParcel = CFACClaimTransactions.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(CFACPaymentPurpose.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CFACPaymentCanceller.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new CFACClaimProperties(cFACClaimTransactionsCreateFromParcel, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACClaimProperties[i];
        }
    }

    public CFACClaimProperties(CFACClaimTransactions transactions, ArrayList availablePaymentPurposes, ArrayList availablePaymentCancellers) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(availablePaymentPurposes, "availablePaymentPurposes");
        Intrinsics.checkNotNullParameter(availablePaymentCancellers, "availablePaymentCancellers");
        this.f74973a = transactions;
        this.f74974b = availablePaymentPurposes;
        this.f74975c = availablePaymentCancellers;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACClaimProperties)) {
            return false;
        }
        CFACClaimProperties cFACClaimProperties = (CFACClaimProperties) obj2;
        return Intrinsics.f(this.f74973a, cFACClaimProperties.f74973a) && this.f74974b.equals(cFACClaimProperties.f74974b) && this.f74975c.equals(cFACClaimProperties.f74975c);
    }

    public final int hashCode() {
        return this.f74975c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f74974b, this.f74973a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f74973a.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.f74974b, dest);
        while (itY.hasNext()) {
            ((CFACPaymentPurpose) itY.next()).writeToParcel(dest, i);
        }
        Iterator itY2 = j6.a.y(this.f74975c, dest);
        while (itY2.hasNext()) {
            ((CFACPaymentCanceller) itY2.next()).writeToParcel(dest, i);
        }
    }
}
