package com.revolut.domain.models.beneficiary;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/beneficiary/BeneficiaryDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BeneficiaryDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BeneficiaryDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f60284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f60286c;
    public final String d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(BankFieldDefinition.CREATOR, parcel, arrayList, iA, 1);
            }
            return new BeneficiaryDetails(parcel.readString(), parcel.readString(), parcel.readString(), arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BeneficiaryDetails[i];
        }
    }

    public BeneficiaryDetails(String str, String str2, String str3, ArrayList bankFields, boolean z) {
        Intrinsics.checkNotNullParameter(bankFields, "bankFields");
        this.f60284a = bankFields;
        this.f60285b = str;
        this.f60286c = str2;
        this.d = str3;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BeneficiaryDetails)) {
            return false;
        }
        BeneficiaryDetails beneficiaryDetails = (BeneficiaryDetails) obj2;
        return this.f60284a.equals(beneficiaryDetails.f60284a) && Intrinsics.f(this.f60285b, beneficiaryDetails.f60285b) && Intrinsics.f(this.f60286c, beneficiaryDetails.f60286c) && Intrinsics.f(this.d, beneficiaryDetails.d) && this.e == beneficiaryDetails.e;
    }

    public final int hashCode() {
        int iHashCode = this.f60284a.hashCode() * 31;
        String str = this.f60285b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f60286c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f60284a, dest);
        while (itY.hasNext()) {
            ((BankFieldDefinition) itY.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.f60285b);
        dest.writeString(this.f60286c);
        dest.writeString(this.d);
        dest.writeInt(this.e ? 1 : 0);
    }
}
