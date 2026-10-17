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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/instalment/CreditCardInstalmentAnticipationDiscount;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardInstalmentAnticipationDiscount implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardInstalmentAnticipationDiscount> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f68778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f68779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f68780c;
    public final LocalDate d;
    public final d e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f68781g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardInstalmentAnticipationDiscount((LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardInstalmentAnticipationDiscount[i];
        }
    }

    public CreditCardInstalmentAnticipationDiscount(LocalDate oldMaturingDate, LocalDate newMaturingDate, LocalDate oldDueDate, LocalDate newDueDate, d anticipatedAmount, d carryoverAmount, d discountAmount) {
        Intrinsics.checkNotNullParameter(oldMaturingDate, "oldMaturingDate");
        Intrinsics.checkNotNullParameter(newMaturingDate, "newMaturingDate");
        Intrinsics.checkNotNullParameter(oldDueDate, "oldDueDate");
        Intrinsics.checkNotNullParameter(newDueDate, "newDueDate");
        Intrinsics.checkNotNullParameter(anticipatedAmount, "anticipatedAmount");
        Intrinsics.checkNotNullParameter(carryoverAmount, "carryoverAmount");
        Intrinsics.checkNotNullParameter(discountAmount, "discountAmount");
        this.f68778a = oldMaturingDate;
        this.f68779b = newMaturingDate;
        this.f68780c = oldDueDate;
        this.d = newDueDate;
        this.e = anticipatedAmount;
        this.f = carryoverAmount;
        this.f68781g = discountAmount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardInstalmentAnticipationDiscount)) {
            return false;
        }
        CreditCardInstalmentAnticipationDiscount creditCardInstalmentAnticipationDiscount = (CreditCardInstalmentAnticipationDiscount) obj2;
        return Intrinsics.f(this.f68778a, creditCardInstalmentAnticipationDiscount.f68778a) && Intrinsics.f(this.f68779b, creditCardInstalmentAnticipationDiscount.f68779b) && Intrinsics.f(this.f68780c, creditCardInstalmentAnticipationDiscount.f68780c) && Intrinsics.f(this.d, creditCardInstalmentAnticipationDiscount.d) && Intrinsics.f(this.e, creditCardInstalmentAnticipationDiscount.e) && Intrinsics.f(this.f, creditCardInstalmentAnticipationDiscount.f) && Intrinsics.f(this.f68781g, creditCardInstalmentAnticipationDiscount.f68781g);
    }

    public final int hashCode() {
        return this.f68781g.hashCode() + v7.c(v7.c(y.a(y.a(y.a(this.f68778a.hashCode() * 31, 31, this.f68779b), 31, this.f68780c), 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f68778a);
        dest.writeSerializable(this.f68779b);
        dest.writeSerializable(this.f68780c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f68781g);
    }
}
