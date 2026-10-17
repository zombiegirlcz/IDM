package com.revolut.feature.insurance.api.models.details;

import android.os.Parcel;
import android.os.Parcelable;
import dl7.b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/api/models/details/CFACProductDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACProductDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CFACProductDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CFACProductSummary f75000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f75001c;
    public final ArrayList d;
    public final CFACReimbursement e;
    public final CFACReimbursement f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            CFACProductSummary cFACProductSummaryCreateFromParcel = CFACProductSummary.CREATOR.createFromParcel(parcel);
            b bVar = (b) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CFACCoverage.CREATOR, parcel, arrayList, iA, 1);
            }
            Parcelable.Creator<CFACReimbursement> creator = CFACReimbursement.CREATOR;
            return new CFACProductDetails(string, cFACProductSummaryCreateFromParcel, bVar, arrayList, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACProductDetails[i];
        }
    }

    public CFACProductDetails(String storyTemplateId, CFACProductSummary productSummary, b subtypeInfo, ArrayList coverages, CFACReimbursement docProofReimbursement, CFACReimbursement noProofReimbursement) {
        Intrinsics.checkNotNullParameter(storyTemplateId, "storyTemplateId");
        Intrinsics.checkNotNullParameter(productSummary, "productSummary");
        Intrinsics.checkNotNullParameter(subtypeInfo, "subtypeInfo");
        Intrinsics.checkNotNullParameter(coverages, "coverages");
        Intrinsics.checkNotNullParameter(docProofReimbursement, "docProofReimbursement");
        Intrinsics.checkNotNullParameter(noProofReimbursement, "noProofReimbursement");
        this.f74999a = storyTemplateId;
        this.f75000b = productSummary;
        this.f75001c = subtypeInfo;
        this.d = coverages;
        this.e = docProofReimbursement;
        this.f = noProofReimbursement;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACProductDetails)) {
            return false;
        }
        CFACProductDetails cFACProductDetails = (CFACProductDetails) obj2;
        return Intrinsics.f(this.f74999a, cFACProductDetails.f74999a) && Intrinsics.f(this.f75000b, cFACProductDetails.f75000b) && Intrinsics.f(this.f75001c, cFACProductDetails.f75001c) && this.d.equals(cFACProductDetails.d) && Intrinsics.f(this.e, cFACProductDetails.e) && Intrinsics.f(this.f, cFACProductDetails.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (this.f75001c.hashCode() + ((this.f75000b.hashCode() + (this.f74999a.hashCode() * 31)) * 31)) * 31, 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74999a);
        this.f75000b.writeToParcel(dest, i);
        dest.writeSerializable(this.f75001c);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((CFACCoverage) itY.next()).writeToParcel(dest, i);
        }
        this.e.writeToParcel(dest, i);
        this.f.writeToParcel(dest, i);
    }
}
