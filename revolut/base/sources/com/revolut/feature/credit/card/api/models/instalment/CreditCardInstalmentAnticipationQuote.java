package com.revolut.feature.credit.card.api.models.instalment;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/instalment/CreditCardInstalmentAnticipationQuote;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardInstalmentAnticipationQuote implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardInstalmentAnticipationQuote> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f68783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f68784c;
    public final d d;
    public final d e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f68785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f68786h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f68787j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            d dVar = (d) parcel.readSerializable();
            d dVar2 = (d) parcel.readSerializable();
            d dVar3 = (d) parcel.readSerializable();
            d dVar4 = (d) parcel.readSerializable();
            d dVar5 = (d) parcel.readSerializable();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            int iA = 0;
            while (iA != i3) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CreditCardInstalmentAnticipationDiscount.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CreditCardInstalmentAnticipationQuote(i, i2, localDate, dVar, dVar2, dVar3, dVar4, dVar5, arrayList, (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardInstalmentAnticipationQuote[i];
        }
    }

    public CreditCardInstalmentAnticipationQuote(int i, int i2, LocalDate lastInstalmentNewDueDate, d newPlanAmount, d instalmentAmount, d anticipatedAmount, d carryoverAmount, d discountAmount, ArrayList discounts, d newStatementBalance) {
        Intrinsics.checkNotNullParameter(lastInstalmentNewDueDate, "lastInstalmentNewDueDate");
        Intrinsics.checkNotNullParameter(newPlanAmount, "newPlanAmount");
        Intrinsics.checkNotNullParameter(instalmentAmount, "instalmentAmount");
        Intrinsics.checkNotNullParameter(anticipatedAmount, "anticipatedAmount");
        Intrinsics.checkNotNullParameter(carryoverAmount, "carryoverAmount");
        Intrinsics.checkNotNullParameter(discountAmount, "discountAmount");
        Intrinsics.checkNotNullParameter(discounts, "discounts");
        Intrinsics.checkNotNullParameter(newStatementBalance, "newStatementBalance");
        this.f68782a = i;
        this.f68783b = i2;
        this.f68784c = lastInstalmentNewDueDate;
        this.d = newPlanAmount;
        this.e = instalmentAmount;
        this.f = anticipatedAmount;
        this.f68785g = carryoverAmount;
        this.f68786h = discountAmount;
        this.i = discounts;
        this.f68787j = newStatementBalance;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardInstalmentAnticipationQuote)) {
            return false;
        }
        CreditCardInstalmentAnticipationQuote creditCardInstalmentAnticipationQuote = (CreditCardInstalmentAnticipationQuote) obj2;
        return this.f68782a == creditCardInstalmentAnticipationQuote.f68782a && this.f68783b == creditCardInstalmentAnticipationQuote.f68783b && Intrinsics.f(this.f68784c, creditCardInstalmentAnticipationQuote.f68784c) && Intrinsics.f(this.d, creditCardInstalmentAnticipationQuote.d) && Intrinsics.f(this.e, creditCardInstalmentAnticipationQuote.e) && Intrinsics.f(this.f, creditCardInstalmentAnticipationQuote.f) && Intrinsics.f(this.f68785g, creditCardInstalmentAnticipationQuote.f68785g) && Intrinsics.f(this.f68786h, creditCardInstalmentAnticipationQuote.f68786h) && this.i.equals(creditCardInstalmentAnticipationQuote.i) && Intrinsics.f(this.f68787j, creditCardInstalmentAnticipationQuote.f68787j);
    }

    public final int hashCode() {
        return this.f68787j.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.i, v7.c(v7.c(v7.c(v7.c(v7.c(y.a(j6.a.b(this.f68783b, Integer.hashCode(this.f68782a) * 31, 31), 31, this.f68784c), 31, this.d), 31, this.e), 31, this.f), 31, this.f68785g), 31, this.f68786h), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f68782a);
        dest.writeInt(this.f68783b);
        dest.writeSerializable(this.f68784c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f68785g);
        dest.writeSerializable(this.f68786h);
        Iterator itY = j6.a.y(this.i, dest);
        while (itY.hasNext()) {
            ((CreditCardInstalmentAnticipationDiscount) itY.next()).writeToParcel(dest, i);
        }
        dest.writeSerializable(this.f68787j);
    }
}
