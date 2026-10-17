package com.revolut.feature.credit.loan.api.models.rev10;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanDocuments;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanDocuments implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LoanDocuments> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f70156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f70157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f70158c;
    public final List d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(LoanDocument.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int iA3 = 0;
            while (iA3 != i2) {
                iA3 = org.bouncycastle.jcajce.provider.digest.a.a(LoanDocument.CREATOR, parcel, arrayList2, iA3, 1);
            }
            int i3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i3);
            int iA4 = 0;
            while (iA4 != i3) {
                iA4 = org.bouncycastle.jcajce.provider.digest.a.a(LoanDocument.CREATOR, parcel, arrayList3, iA4, 1);
            }
            int i5 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i5);
            while (iA != i5) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(LoanDocument.CREATOR, parcel, arrayList4, iA, 1);
            }
            return new LoanDocuments(arrayList, arrayList2, arrayList3, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanDocuments[i];
        }
    }

    public LoanDocuments(List fullPaymentReceipts, ArrayList partialPaymentReceipts, List certificates, List permissions) {
        Intrinsics.checkNotNullParameter(fullPaymentReceipts, "fullPaymentReceipts");
        Intrinsics.checkNotNullParameter(partialPaymentReceipts, "partialPaymentReceipts");
        Intrinsics.checkNotNullParameter(certificates, "certificates");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.f70156a = fullPaymentReceipts;
        this.f70157b = partialPaymentReceipts;
        this.f70158c = certificates;
        this.d = permissions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoanDocuments)) {
            return false;
        }
        LoanDocuments loanDocuments = (LoanDocuments) obj2;
        return Intrinsics.f(this.f70156a, loanDocuments.f70156a) && this.f70157b.equals(loanDocuments.f70157b) && Intrinsics.f(this.f70158c, loanDocuments.f70158c) && Intrinsics.f(this.d, loanDocuments.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f70157b, this.f70156a.hashCode() * 31, 31), 31, this.f70158c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f70156a, dest);
        while (itV.hasNext()) {
            ((LoanDocument) itV.next()).writeToParcel(dest, i);
        }
        Iterator itY = j6.a.y(this.f70157b, dest);
        while (itY.hasNext()) {
            ((LoanDocument) itY.next()).writeToParcel(dest, i);
        }
        Iterator itV2 = p.a.v(this.f70158c, dest);
        while (itV2.hasNext()) {
            ((LoanDocument) itV2.next()).writeToParcel(dest, i);
        }
        Iterator itV3 = p.a.v(this.d, dest);
        while (itV3.hasNext()) {
            ((LoanDocument) itV3.next()).writeToParcel(dest, i);
        }
    }
}
