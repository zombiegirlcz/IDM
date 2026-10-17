package com.revolut.feature.insurance.api.models.details;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/api/models/details/CFACReimbursement;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACReimbursement implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CFACReimbursement> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f75007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CFACReimbursementLimits f75008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CFACExcess f75009c;
    public final ArrayList d;
    public final ArrayList e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CFACClaimFlowMode f75010g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            long j2 = parcel.readLong();
            CFACReimbursementLimits cFACReimbursementLimitsCreateFromParcel = CFACReimbursementLimits.CREATOR.createFromParcel(parcel);
            CFACExcess cFACExcessCreateFromParcel = CFACExcess.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(CFACCancellationReason.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CFACDocument.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new CFACReimbursement(j2, cFACReimbursementLimitsCreateFromParcel, cFACExcessCreateFromParcel, arrayList, arrayList2, parcel.createStringArrayList(), (CFACClaimFlowMode) parcel.readParcelable(CFACReimbursement.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACReimbursement[i];
        }
    }

    public CFACReimbursement(long j2, CFACReimbursementLimits limits, CFACExcess excessPayable, ArrayList eligibleCancellationReasons, ArrayList documents, List remarks, CFACClaimFlowMode claimFlowMode) {
        Intrinsics.checkNotNullParameter(limits, "limits");
        Intrinsics.checkNotNullParameter(excessPayable, "excessPayable");
        Intrinsics.checkNotNullParameter(eligibleCancellationReasons, "eligibleCancellationReasons");
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(remarks, "remarks");
        Intrinsics.checkNotNullParameter(claimFlowMode, "claimFlowMode");
        this.f75007a = j2;
        this.f75008b = limits;
        this.f75009c = excessPayable;
        this.d = eligibleCancellationReasons;
        this.e = documents;
        this.f = remarks;
        this.f75010g = claimFlowMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACReimbursement)) {
            return false;
        }
        CFACReimbursement cFACReimbursement = (CFACReimbursement) obj2;
        return this.f75007a == cFACReimbursement.f75007a && Intrinsics.f(this.f75008b, cFACReimbursement.f75008b) && Intrinsics.f(this.f75009c, cFACReimbursement.f75009c) && this.d.equals(cFACReimbursement.d) && this.e.equals(cFACReimbursement.e) && Intrinsics.f(this.f, cFACReimbursement.f) && Intrinsics.f(this.f75010g, cFACReimbursement.f75010g);
    }

    public final int hashCode() {
        return this.f75010g.hashCode() + p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (this.f75009c.hashCode() + ((this.f75008b.hashCode() + (Long.hashCode(this.f75007a) * 31)) * 31)) * 31, 31), 31), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f75007a);
        this.f75008b.writeToParcel(dest, i);
        this.f75009c.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((CFACCancellationReason) itY.next()).writeToParcel(dest, i);
        }
        Iterator itY2 = j6.a.y(this.e, dest);
        while (itY2.hasNext()) {
            ((CFACDocument) itY2.next()).writeToParcel(dest, i);
        }
        dest.writeStringList(this.f);
        dest.writeParcelable(this.f75010g, i);
    }
}
