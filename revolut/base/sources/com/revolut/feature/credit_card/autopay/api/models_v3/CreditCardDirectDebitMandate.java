package com.revolut.feature.credit_card.autopay.api.models_v3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nb5.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardDirectDebitMandate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardDirectDebitMandate implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardDirectDebitMandate> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f70740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f70741c;
    public final String d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardDirectDebitMandate(parcel.readString(), g.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardDirectDebitMandate[i];
        }
    }

    public CreditCardDirectDebitMandate(String mandateId, g accountNumberFormat, String accountNumber, String bankName, boolean z) {
        Intrinsics.checkNotNullParameter(mandateId, "mandateId");
        Intrinsics.checkNotNullParameter(accountNumberFormat, "accountNumberFormat");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(bankName, "bankName");
        this.f70739a = mandateId;
        this.f70740b = accountNumberFormat;
        this.f70741c = accountNumber;
        this.d = bankName;
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
        if (!(obj2 instanceof CreditCardDirectDebitMandate)) {
            return false;
        }
        CreditCardDirectDebitMandate creditCardDirectDebitMandate = (CreditCardDirectDebitMandate) obj2;
        return Intrinsics.f(this.f70739a, creditCardDirectDebitMandate.f70739a) && this.f70740b == creditCardDirectDebitMandate.f70740b && Intrinsics.f(this.f70741c, creditCardDirectDebitMandate.f70741c) && Intrinsics.f(this.d, creditCardDirectDebitMandate.d) && this.e == creditCardDirectDebitMandate.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + p.a.c(p.a.c((this.f70740b.hashCode() + (this.f70739a.hashCode() * 31)) * 31, 31, this.f70741c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70739a);
        dest.writeString(this.f70740b.name());
        dest.writeString(this.f70741c);
        dest.writeString(this.d);
        dest.writeInt(this.e ? 1 : 0);
    }
}
