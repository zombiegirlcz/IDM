package com.revolut.feature.credit.card.api.models.statement;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/api/models/statement/CreditCardInAppStatement$OutstandingBalance", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardInAppStatement$OutstandingBalance implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardInAppStatement$OutstandingBalance> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f68878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f68879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f68880c;
    public final LocalDate d;
    public final LocalDate e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CreditCardInAppStatement$ChargesBreakdown f68881g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardInAppStatement$OutstandingBalance((d) parcel.readSerializable(), (d) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : CreditCardInAppStatement$ChargesBreakdown.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardInAppStatement$OutstandingBalance[i];
        }
    }

    public CreditCardInAppStatement$OutstandingBalance(d totalAmount, d remainingBalance, LocalDate fromDate, LocalDate localDate, LocalDate localDate2, boolean z, CreditCardInAppStatement$ChargesBreakdown creditCardInAppStatement$ChargesBreakdown) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(remainingBalance, "remainingBalance");
        Intrinsics.checkNotNullParameter(fromDate, "fromDate");
        this.f68878a = totalAmount;
        this.f68879b = remainingBalance;
        this.f68880c = fromDate;
        this.d = localDate;
        this.e = localDate2;
        this.f = z;
        this.f68881g = creditCardInAppStatement$ChargesBreakdown;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardInAppStatement$OutstandingBalance)) {
            return false;
        }
        CreditCardInAppStatement$OutstandingBalance creditCardInAppStatement$OutstandingBalance = (CreditCardInAppStatement$OutstandingBalance) obj2;
        return Intrinsics.f(this.f68878a, creditCardInAppStatement$OutstandingBalance.f68878a) && Intrinsics.f(this.f68879b, creditCardInAppStatement$OutstandingBalance.f68879b) && Intrinsics.f(this.f68880c, creditCardInAppStatement$OutstandingBalance.f68880c) && Intrinsics.f(this.d, creditCardInAppStatement$OutstandingBalance.d) && Intrinsics.f(this.e, creditCardInAppStatement$OutstandingBalance.e) && this.f == creditCardInAppStatement$OutstandingBalance.f && Intrinsics.f(this.f68881g, creditCardInAppStatement$OutstandingBalance.f68881g);
    }

    public final int hashCode() {
        int iA = y.a(v7.c(this.f68878a.hashCode() * 31, 31, this.f68879b), 31, this.f68880c);
        LocalDate localDate = this.d;
        int iHashCode = (iA + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.e;
        int iC = j6.a.c((iHashCode + (localDate2 == null ? 0 : localDate2.hashCode())) * 31, 31, this.f);
        CreditCardInAppStatement$ChargesBreakdown creditCardInAppStatement$ChargesBreakdown = this.f68881g;
        return iC + (creditCardInAppStatement$ChargesBreakdown != null ? creditCardInAppStatement$ChargesBreakdown.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f68878a);
        dest.writeSerializable(this.f68879b);
        dest.writeSerializable(this.f68880c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeInt(this.f ? 1 : 0);
        CreditCardInAppStatement$ChargesBreakdown creditCardInAppStatement$ChargesBreakdown = this.f68881g;
        if (creditCardInAppStatement$ChargesBreakdown == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            creditCardInAppStatement$ChargesBreakdown.writeToParcel(dest, i);
        }
    }
}
