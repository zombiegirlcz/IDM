package com.revolut.domain.models.beneficiary;

import android.os.Parcel;
import android.os.Parcelable;
import f5j.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/beneficiary/BeneficiaryRouteDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BeneficiaryRouteDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BeneficiaryRouteDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BeneficiaryDetails f60287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f60288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f60289c;
    public final String d;
    public final Boolean e;
    public final Boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f60290g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BeneficiaryDetails beneficiaryDetailsCreateFromParcel = BeneficiaryDetails.CREATOR.createFromParcel(parcel);
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            t tVarValueOf = parcel.readInt() == 0 ? null : t.valueOf(parcel.readString());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? true : z);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                boolValueOf2 = Boolean.valueOf(z);
            }
            return new BeneficiaryRouteDetails(beneficiaryDetailsCreateFromParcel, z3, tVarValueOf, string, boolValueOf, boolValueOf2, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BeneficiaryRouteDetails[i];
        }
    }

    public BeneficiaryRouteDetails(BeneficiaryDetails beneficiaryDetails, boolean z, t tVar, String str, Boolean bool, Boolean bool2, Integer num) {
        Intrinsics.checkNotNullParameter(beneficiaryDetails, "beneficiaryDetails");
        this.f60287a = beneficiaryDetails;
        this.f60288b = z;
        this.f60289c = tVar;
        this.d = str;
        this.e = bool;
        this.f = bool2;
        this.f60290g = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BeneficiaryRouteDetails)) {
            return false;
        }
        BeneficiaryRouteDetails beneficiaryRouteDetails = (BeneficiaryRouteDetails) obj2;
        return Intrinsics.f(this.f60287a, beneficiaryRouteDetails.f60287a) && this.f60288b == beneficiaryRouteDetails.f60288b && this.f60289c == beneficiaryRouteDetails.f60289c && Intrinsics.f(this.d, beneficiaryRouteDetails.d) && Intrinsics.f(this.e, beneficiaryRouteDetails.e) && Intrinsics.f(this.f, beneficiaryRouteDetails.f) && Intrinsics.f(this.f60290g, beneficiaryRouteDetails.f60290g);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f60287a.hashCode() * 31, 31, this.f60288b);
        t tVar = this.f60289c;
        int iHashCode = (iC + (tVar == null ? 0 : tVar.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.f60290g;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f60287a.writeToParcel(dest, i);
        dest.writeInt(this.f60288b ? 1 : 0);
        t tVar = this.f60289c;
        if (tVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(tVar.name());
        }
        dest.writeString(this.d);
        Boolean bool = this.e;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        Boolean bool2 = this.f;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool2);
        }
        Integer num = this.f60290g;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }
}
