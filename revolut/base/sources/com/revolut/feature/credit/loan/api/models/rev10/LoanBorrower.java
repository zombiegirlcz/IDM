package com.revolut.feature.credit.loan.api.models.rev10;

import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanBorrower;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "PaymentSource", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanBorrower implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LoanBorrower> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f70139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f70140c;
    public final String d;
    public final PaymentSource e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanBorrower$PaymentSource;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/credit/loan/api/models/rev10/b", "com/revolut/feature/credit/loan/api/models/rev10/c", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentSource implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PaymentSource> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f70141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f70142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f70143c;
        public final String d;
        public final xi0.b e;
        public final LoanRepaymentAccountDetails f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentSource(c.valueOf(parcel.readString()), b.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (xi0.b) parcel.readSerializable(), parcel.readInt() == 0 ? null : LoanRepaymentAccountDetails.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentSource[i];
            }
        }

        public PaymentSource(c type, b state, String sourceId, String str, xi0.b currency, LoanRepaymentAccountDetails loanRepaymentAccountDetails) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f70141a = type;
            this.f70142b = state;
            this.f70143c = sourceId;
            this.d = str;
            this.e = currency;
            this.f = loanRepaymentAccountDetails;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PaymentSource)) {
                return false;
            }
            PaymentSource paymentSource = (PaymentSource) obj2;
            return this.f70141a == paymentSource.f70141a && this.f70142b == paymentSource.f70142b && Intrinsics.f(this.f70143c, paymentSource.f70143c) && Intrinsics.f(this.d, paymentSource.d) && Intrinsics.f(this.e, paymentSource.e) && Intrinsics.f(this.f, paymentSource.f);
        }

        public final int hashCode() {
            int iC = p.a.c((this.f70142b.hashCode() + (this.f70141a.hashCode() * 31)) * 31, 31, this.f70143c);
            String str = this.d;
            int iJ = l.j(this.e, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
            LoanRepaymentAccountDetails loanRepaymentAccountDetails = this.f;
            return iJ + (loanRepaymentAccountDetails != null ? loanRepaymentAccountDetails.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70141a.name());
            dest.writeString(this.f70142b.name());
            dest.writeString(this.f70143c);
            dest.writeString(this.d);
            dest.writeSerializable(this.e);
            LoanRepaymentAccountDetails loanRepaymentAccountDetails = this.f;
            if (loanRepaymentAccountDetails == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                loanRepaymentAccountDetails.writeToParcel(dest, i);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoanBorrower(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), PaymentSource.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanBorrower[i];
        }
    }

    public LoanBorrower(String clientId, int i, String str, String str2, PaymentSource paymentSource) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(paymentSource, "paymentSource");
        this.f70138a = clientId;
        this.f70139b = i;
        this.f70140c = str;
        this.d = str2;
        this.e = paymentSource;
    }

    public static LoanBorrower a(LoanBorrower loanBorrower, int i) {
        String clientId = loanBorrower.f70138a;
        String str = loanBorrower.f70140c;
        String str2 = loanBorrower.d;
        PaymentSource paymentSource = loanBorrower.e;
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(paymentSource, "paymentSource");
        return new LoanBorrower(clientId, i, str, str2, paymentSource);
    }

    public final String b() {
        String str;
        String str2 = this.f70140c;
        if (str2 != null && !d0.W(str2) && (str = this.d) != null && !d0.W(str)) {
            return com.google.android.gms.internal.mlkit_vision_face.a.o(str2, " ", str);
        }
        m70.a.c(t0.f186434a);
        return "";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoanBorrower)) {
            return false;
        }
        LoanBorrower loanBorrower = (LoanBorrower) obj2;
        return Intrinsics.f(this.f70138a, loanBorrower.f70138a) && this.f70139b == loanBorrower.f70139b && Intrinsics.f(this.f70140c, loanBorrower.f70140c) && Intrinsics.f(this.d, loanBorrower.d) && Intrinsics.f(this.e, loanBorrower.e);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f70139b, this.f70138a.hashCode() * 31, 31);
        String str = this.f70140c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70138a);
        dest.writeInt(this.f70139b);
        dest.writeString(this.f70140c);
        dest.writeString(this.d);
        this.e.writeToParcel(dest, i);
    }
}
