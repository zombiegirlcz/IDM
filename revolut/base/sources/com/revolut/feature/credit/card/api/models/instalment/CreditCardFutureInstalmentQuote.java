package com.revolut.feature.credit.card.api.models.instalment;

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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/instalment/CreditCardFutureInstalmentQuote;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardFutureInstalmentQuote implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardFutureInstalmentQuote> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f68769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f68770c;
    public final d d;
    public final d e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f68771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocalDate f68772h;
    public final CreditCardInstalmentAmountBreakdown i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardFutureInstalmentQuote(parcel.readInt(), parcel.readInt(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), CreditCardInstalmentAmountBreakdown.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardFutureInstalmentQuote[i];
        }
    }

    public CreditCardFutureInstalmentQuote(int i, int i2, d newPlanAmount, d repaymentAmount, d dVar, d regularAmount, d lastAmount, LocalDate lastMaturingDate, CreditCardInstalmentAmountBreakdown lastAmountBreakdown) {
        Intrinsics.checkNotNullParameter(newPlanAmount, "newPlanAmount");
        Intrinsics.checkNotNullParameter(repaymentAmount, "repaymentAmount");
        Intrinsics.checkNotNullParameter(regularAmount, "regularAmount");
        Intrinsics.checkNotNullParameter(lastAmount, "lastAmount");
        Intrinsics.checkNotNullParameter(lastMaturingDate, "lastMaturingDate");
        Intrinsics.checkNotNullParameter(lastAmountBreakdown, "lastAmountBreakdown");
        this.f68768a = i;
        this.f68769b = i2;
        this.f68770c = newPlanAmount;
        this.d = repaymentAmount;
        this.e = dVar;
        this.f = regularAmount;
        this.f68771g = lastAmount;
        this.f68772h = lastMaturingDate;
        this.i = lastAmountBreakdown;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardFutureInstalmentQuote)) {
            return false;
        }
        CreditCardFutureInstalmentQuote creditCardFutureInstalmentQuote = (CreditCardFutureInstalmentQuote) obj2;
        return this.f68768a == creditCardFutureInstalmentQuote.f68768a && this.f68769b == creditCardFutureInstalmentQuote.f68769b && Intrinsics.f(this.f68770c, creditCardFutureInstalmentQuote.f68770c) && Intrinsics.f(this.d, creditCardFutureInstalmentQuote.d) && Intrinsics.f(this.e, creditCardFutureInstalmentQuote.e) && Intrinsics.f(this.f, creditCardFutureInstalmentQuote.f) && Intrinsics.f(this.f68771g, creditCardFutureInstalmentQuote.f68771g) && Intrinsics.f(this.f68772h, creditCardFutureInstalmentQuote.f68772h) && Intrinsics.f(this.i, creditCardFutureInstalmentQuote.i);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(j6.a.b(this.f68769b, Integer.hashCode(this.f68768a) * 31, 31), 31, this.f68770c), 31, this.d);
        d dVar = this.e;
        return this.i.hashCode() + y.a(v7.c(v7.c((iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f), 31, this.f68771g), 31, this.f68772h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f68768a);
        dest.writeInt(this.f68769b);
        dest.writeSerializable(this.f68770c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f68771g);
        dest.writeSerializable(this.f68772h);
        this.i.writeToParcel(dest, i);
    }
}
