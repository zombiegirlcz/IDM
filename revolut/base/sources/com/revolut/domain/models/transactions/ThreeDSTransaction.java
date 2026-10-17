package com.revolut.domain.models.transactions;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/transactions/ThreeDSTransaction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ThreeDSTransaction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ThreeDSTransaction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f60535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f60536c;
    public final long d;
    public final PaymentSystem e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f60537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f60538h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f60539j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f60540l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f60541m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CardholderType f60542n;
    public final InsufficientFunds o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f60543p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f60544q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f60545r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f60546s;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            long j5 = parcel.readLong();
            PaymentSystem paymentSystemValueOf = PaymentSystem.valueOf(parcel.readString());
            long j16 = parcel.readLong();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            CardholderType cardholderTypeValueOf = CardholderType.valueOf(parcel.readString());
            InsufficientFunds insufficientFundsCreateFromParcel = parcel.readInt() == 0 ? null : InsufficientFunds.CREATOR.createFromParcel(parcel);
            String string9 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(DeclineReason.CREATOR, parcel, arrayList, iA, 1);
                i = i;
                j2 = j2;
            }
            return new ThreeDSTransaction(string, j2, j3, j5, paymentSystemValueOf, j16, string2, string3, string4, string5, string6, string7, string8, cardholderTypeValueOf, insufficientFundsCreateFromParcel, string9, arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ThreeDSTransaction[i];
        }
    }

    public ThreeDSTransaction(String id10, long j2, long j3, long j5, PaymentSystem paymentSystem, long j16, String currency, String str, String str2, String str3, String merchantName, String cardholderId, String cardId, CardholderType cardholderType, InsufficientFunds insufficientFunds, String str4, List declineReasons, String str5, String str6) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(paymentSystem, "paymentSystem");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(cardholderType, "cardholderType");
        Intrinsics.checkNotNullParameter(declineReasons, "declineReasons");
        this.f60534a = id10;
        this.f60535b = j2;
        this.f60536c = j3;
        this.d = j5;
        this.e = paymentSystem;
        this.f = j16;
        this.f60537g = currency;
        this.f60538h = str;
        this.i = str2;
        this.f60539j = str3;
        this.k = merchantName;
        this.f60540l = cardholderId;
        this.f60541m = cardId;
        this.f60542n = cardholderType;
        this.o = insufficientFunds;
        this.f60543p = str4;
        this.f60544q = declineReasons;
        this.f60545r = str5;
        this.f60546s = str6;
    }

    public static ThreeDSTransaction a(ThreeDSTransaction threeDSTransaction) {
        String id10 = threeDSTransaction.f60534a;
        long j2 = threeDSTransaction.f60535b;
        long j3 = threeDSTransaction.f60536c;
        long j5 = threeDSTransaction.d;
        PaymentSystem paymentSystem = threeDSTransaction.e;
        long j16 = threeDSTransaction.f;
        String currency = threeDSTransaction.f60537g;
        String str = threeDSTransaction.f60538h;
        String str2 = threeDSTransaction.i;
        String str3 = threeDSTransaction.f60539j;
        String merchantName = threeDSTransaction.k;
        String cardholderId = threeDSTransaction.f60540l;
        String cardId = threeDSTransaction.f60541m;
        CardholderType cardholderType = threeDSTransaction.f60542n;
        String str4 = threeDSTransaction.f60543p;
        List declineReasons = threeDSTransaction.f60544q;
        String str5 = threeDSTransaction.f60545r;
        String str6 = threeDSTransaction.f60546s;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(paymentSystem, "paymentSystem");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(cardholderType, "cardholderType");
        Intrinsics.checkNotNullParameter(declineReasons, "declineReasons");
        return new ThreeDSTransaction(id10, j2, j3, j5, paymentSystem, j16, currency, str, str2, str3, merchantName, cardholderId, cardId, cardholderType, null, str4, declineReasons, str5, str6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ThreeDSTransaction)) {
            return false;
        }
        ThreeDSTransaction threeDSTransaction = (ThreeDSTransaction) obj2;
        return Intrinsics.f(this.f60534a, threeDSTransaction.f60534a) && this.f60535b == threeDSTransaction.f60535b && this.f60536c == threeDSTransaction.f60536c && this.d == threeDSTransaction.d && this.e == threeDSTransaction.e && this.f == threeDSTransaction.f && Intrinsics.f(this.f60537g, threeDSTransaction.f60537g) && Intrinsics.f(this.f60538h, threeDSTransaction.f60538h) && Intrinsics.f(this.i, threeDSTransaction.i) && Intrinsics.f(this.f60539j, threeDSTransaction.f60539j) && Intrinsics.f(this.k, threeDSTransaction.k) && Intrinsics.f(this.f60540l, threeDSTransaction.f60540l) && Intrinsics.f(this.f60541m, threeDSTransaction.f60541m) && this.f60542n == threeDSTransaction.f60542n && Intrinsics.f(this.o, threeDSTransaction.o) && Intrinsics.f(this.f60543p, threeDSTransaction.f60543p) && Intrinsics.f(this.f60544q, threeDSTransaction.f60544q) && Intrinsics.f(this.f60545r, threeDSTransaction.f60545r) && Intrinsics.f(this.f60546s, threeDSTransaction.f60546s);
    }

    public final int hashCode() {
        int iC = p.a.c(d.c((this.e.hashCode() + d.c(d.c(d.c(this.f60534a.hashCode() * 31, 31, this.f60535b), 31, this.f60536c), 31, this.d)) * 31, 31, this.f), 31, this.f60537g);
        String str = this.f60538h;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f60539j;
        int iHashCode3 = (this.f60542n.hashCode() + p.a.c(p.a.c(p.a.c((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.k), 31, this.f60540l), 31, this.f60541m)) * 31;
        InsufficientFunds insufficientFunds = this.o;
        int iHashCode4 = (iHashCode3 + (insufficientFunds == null ? 0 : insufficientFunds.hashCode())) * 31;
        String str4 = this.f60543p;
        int iD = p.a.d((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f60544q);
        String str5 = this.f60545r;
        int iHashCode5 = (iD + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f60546s;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60534a);
        dest.writeLong(this.f60535b);
        dest.writeLong(this.f60536c);
        dest.writeLong(this.d);
        dest.writeString(this.e.name());
        dest.writeLong(this.f);
        dest.writeString(this.f60537g);
        dest.writeString(this.f60538h);
        dest.writeString(this.i);
        dest.writeString(this.f60539j);
        dest.writeString(this.k);
        dest.writeString(this.f60540l);
        dest.writeString(this.f60541m);
        dest.writeString(this.f60542n.name());
        InsufficientFunds insufficientFunds = this.o;
        if (insufficientFunds == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            insufficientFunds.writeToParcel(dest, i);
        }
        dest.writeString(this.f60543p);
        Iterator itV = p.a.v(this.f60544q, dest);
        while (itV.hasNext()) {
            ((DeclineReason) itV.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.f60545r);
        dest.writeString(this.f60546s);
    }
}
