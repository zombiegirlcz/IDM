package com.revolut.feature.insurance.api.models.details;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ti7.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/api/models/details/CFACInsuranceDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACInsuranceDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CFACInsuranceDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f74989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CFACInsurer f74990c;
    public final CFACClaimProperties d;
    public final ArrayList e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            b bVarValueOf = b.valueOf(parcel.readString());
            CFACInsurer cFACInsurerCreateFromParcel = CFACInsurer.CREATOR.createFromParcel(parcel);
            CFACClaimProperties cFACClaimPropertiesCreateFromParcel = CFACClaimProperties.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CFACProductDetails.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CFACInsuranceDetails(string, bVarValueOf, cFACInsurerCreateFromParcel, cFACClaimPropertiesCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACInsuranceDetails[i];
        }
    }

    public CFACInsuranceDetails(String id10, b state, CFACInsurer insurer, CFACClaimProperties claimProperties, ArrayList productDetails) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(insurer, "insurer");
        Intrinsics.checkNotNullParameter(claimProperties, "claimProperties");
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        this.f74988a = id10;
        this.f74989b = state;
        this.f74990c = insurer;
        this.d = claimProperties;
        this.e = productDetails;
    }

    public final CFACProductDetails a(dl7.b subtypeInfo) {
        Intrinsics.checkNotNullParameter(subtypeInfo, "subtypeInfo");
        dl7.a subtype = subtypeInfo.f115711a;
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        for (CFACProductDetails cFACProductDetails : this.e) {
            if (cFACProductDetails.f75001c.f115711a == subtype) {
                return cFACProductDetails;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACInsuranceDetails)) {
            return false;
        }
        CFACInsuranceDetails cFACInsuranceDetails = (CFACInsuranceDetails) obj2;
        return Intrinsics.f(this.f74988a, cFACInsuranceDetails.f74988a) && this.f74989b == cFACInsuranceDetails.f74989b && Intrinsics.f(this.f74990c, cFACInsuranceDetails.f74990c) && Intrinsics.f(this.d, cFACInsuranceDetails.d) && this.e.equals(cFACInsuranceDetails.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f74990c.hashCode() + ((this.f74989b.hashCode() + (this.f74988a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74988a);
        dest.writeString(this.f74989b.name());
        this.f74990c.writeToParcel(dest, i);
        this.d.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.e, dest);
        while (itY.hasNext()) {
            ((CFACProductDetails) itY.next()).writeToParcel(dest, i);
        }
    }
}
