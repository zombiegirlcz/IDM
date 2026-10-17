package com.revolut.feature.credit.card.api.models.instalment;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/instalment/CreditCardInstalmentAnticipationQuotes;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardInstalmentAnticipationQuotes implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardInstalmentAnticipationQuotes> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f68789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f68790c;
    public final d d;
    public final List e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            LocalDate localDate2 = (LocalDate) parcel.readSerializable();
            d dVar = (d) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CreditCardInstalmentAnticipationQuote.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CreditCardInstalmentAnticipationQuotes(string, localDate, localDate2, dVar, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardInstalmentAnticipationQuotes[i];
        }
    }

    public CreditCardInstalmentAnticipationQuotes(String interestRate, LocalDate currentCycleDueDate, LocalDate lastInstalmentOldDueDate, d ongoingStatementBalance, List quotes) {
        Intrinsics.checkNotNullParameter(interestRate, "interestRate");
        Intrinsics.checkNotNullParameter(currentCycleDueDate, "currentCycleDueDate");
        Intrinsics.checkNotNullParameter(lastInstalmentOldDueDate, "lastInstalmentOldDueDate");
        Intrinsics.checkNotNullParameter(ongoingStatementBalance, "ongoingStatementBalance");
        Intrinsics.checkNotNullParameter(quotes, "quotes");
        this.f68788a = interestRate;
        this.f68789b = currentCycleDueDate;
        this.f68790c = lastInstalmentOldDueDate;
        this.d = ongoingStatementBalance;
        this.e = quotes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardInstalmentAnticipationQuotes)) {
            return false;
        }
        CreditCardInstalmentAnticipationQuotes creditCardInstalmentAnticipationQuotes = (CreditCardInstalmentAnticipationQuotes) obj2;
        return Intrinsics.f(this.f68788a, creditCardInstalmentAnticipationQuotes.f68788a) && Intrinsics.f(this.f68789b, creditCardInstalmentAnticipationQuotes.f68789b) && Intrinsics.f(this.f68790c, creditCardInstalmentAnticipationQuotes.f68790c) && Intrinsics.f(this.d, creditCardInstalmentAnticipationQuotes.d) && Intrinsics.f(this.e, creditCardInstalmentAnticipationQuotes.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.c(y.a(y.a(this.f68788a.hashCode() * 31, 31, this.f68789b), 31, this.f68790c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68788a);
        dest.writeSerializable(this.f68789b);
        dest.writeSerializable(this.f68790c);
        dest.writeSerializable(this.d);
        Iterator itV = p.a.v(this.e, dest);
        while (itV.hasNext()) {
            ((CreditCardInstalmentAnticipationQuote) itV.next()).writeToParcel(dest, i);
        }
    }
}
