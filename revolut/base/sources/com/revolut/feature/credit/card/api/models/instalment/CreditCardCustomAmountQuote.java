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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/instalment/CreditCardCustomAmountQuote;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "InstalmentDetails", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardCustomAmountQuote implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardCustomAmountQuote> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstalmentDetails f68761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f68762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f68763c;
    public final d d;
    public final d e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/instalment/CreditCardCustomAmountQuote$InstalmentDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InstalmentDetails implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InstalmentDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f68764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f68765b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f68766c;
        public final LocalDate d;
        public final d e;
        public final CreditCardInstalmentAmountBreakdown f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditCardInstalmentAmountBreakdown f68767g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                d dVar = (d) parcel.readSerializable();
                d dVar2 = (d) parcel.readSerializable();
                LocalDate localDate = (LocalDate) parcel.readSerializable();
                LocalDate localDate2 = (LocalDate) parcel.readSerializable();
                d dVar3 = (d) parcel.readSerializable();
                Parcelable.Creator<CreditCardInstalmentAmountBreakdown> creator = CreditCardInstalmentAmountBreakdown.CREATOR;
                return new InstalmentDetails(dVar, dVar2, localDate, localDate2, dVar3, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InstalmentDetails[i];
            }
        }

        public InstalmentDetails(d regularAmount, d lastAmount, LocalDate nextMaturingDate, LocalDate lastMaturingDate, d instalmentAmountDifference, CreditCardInstalmentAmountBreakdown firstAmountBreakdown, CreditCardInstalmentAmountBreakdown lastAmountBreakdown) {
            Intrinsics.checkNotNullParameter(regularAmount, "regularAmount");
            Intrinsics.checkNotNullParameter(lastAmount, "lastAmount");
            Intrinsics.checkNotNullParameter(nextMaturingDate, "nextMaturingDate");
            Intrinsics.checkNotNullParameter(lastMaturingDate, "lastMaturingDate");
            Intrinsics.checkNotNullParameter(instalmentAmountDifference, "instalmentAmountDifference");
            Intrinsics.checkNotNullParameter(firstAmountBreakdown, "firstAmountBreakdown");
            Intrinsics.checkNotNullParameter(lastAmountBreakdown, "lastAmountBreakdown");
            this.f68764a = regularAmount;
            this.f68765b = lastAmount;
            this.f68766c = nextMaturingDate;
            this.d = lastMaturingDate;
            this.e = instalmentAmountDifference;
            this.f = firstAmountBreakdown;
            this.f68767g = lastAmountBreakdown;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InstalmentDetails)) {
                return false;
            }
            InstalmentDetails instalmentDetails = (InstalmentDetails) obj2;
            return Intrinsics.f(this.f68764a, instalmentDetails.f68764a) && Intrinsics.f(this.f68765b, instalmentDetails.f68765b) && Intrinsics.f(this.f68766c, instalmentDetails.f68766c) && Intrinsics.f(this.d, instalmentDetails.d) && Intrinsics.f(this.e, instalmentDetails.e) && Intrinsics.f(this.f, instalmentDetails.f) && Intrinsics.f(this.f68767g, instalmentDetails.f68767g);
        }

        public final int hashCode() {
            return this.f68767g.hashCode() + ((this.f.hashCode() + v7.c(y.a(y.a(v7.c(this.f68764a.hashCode() * 31, 31, this.f68765b), 31, this.f68766c), 31, this.d), 31, this.e)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68764a);
            dest.writeSerializable(this.f68765b);
            dest.writeSerializable(this.f68766c);
            dest.writeSerializable(this.d);
            dest.writeSerializable(this.e);
            this.f.writeToParcel(dest, i);
            this.f68767g.writeToParcel(dest, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardCustomAmountQuote(parcel.readInt() == 0 ? null : InstalmentDetails.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable(), parcel.readInt(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardCustomAmountQuote[i];
        }
    }

    public CreditCardCustomAmountQuote(InstalmentDetails instalmentDetails, d dVar, int i, d previousRegularAmount, d previousLastAmount) {
        Intrinsics.checkNotNullParameter(previousRegularAmount, "previousRegularAmount");
        Intrinsics.checkNotNullParameter(previousLastAmount, "previousLastAmount");
        this.f68761a = instalmentDetails;
        this.f68762b = dVar;
        this.f68763c = i;
        this.d = previousRegularAmount;
        this.e = previousLastAmount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardCustomAmountQuote)) {
            return false;
        }
        CreditCardCustomAmountQuote creditCardCustomAmountQuote = (CreditCardCustomAmountQuote) obj2;
        return Intrinsics.f(this.f68761a, creditCardCustomAmountQuote.f68761a) && Intrinsics.f(this.f68762b, creditCardCustomAmountQuote.f68762b) && this.f68763c == creditCardCustomAmountQuote.f68763c && Intrinsics.f(this.d, creditCardCustomAmountQuote.d) && Intrinsics.f(this.e, creditCardCustomAmountQuote.e);
    }

    public final int hashCode() {
        InstalmentDetails instalmentDetails = this.f68761a;
        int iHashCode = (instalmentDetails == null ? 0 : instalmentDetails.hashCode()) * 31;
        d dVar = this.f68762b;
        return this.e.hashCode() + v7.c(j6.a.b(this.f68763c, (iHashCode + (dVar != null ? dVar.hashCode() : 0)) * 31, 31), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        InstalmentDetails instalmentDetails = this.f68761a;
        if (instalmentDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            instalmentDetails.writeToParcel(dest, i);
        }
        dest.writeSerializable(this.f68762b);
        dest.writeInt(this.f68763c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
    }
}
