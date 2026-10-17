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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/instalment/CreditCardInstalmentChangeTermQuote;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "CurrentInstalment", "UpdatedInstalment", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardInstalmentChangeTermQuote implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardInstalmentChangeTermQuote> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CurrentInstalment f68791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f68792b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/instalment/CreditCardInstalmentChangeTermQuote$CurrentInstalment;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrentInstalment implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CurrentInstalment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f68793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f68794b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f68795c;
        public final d d;
        public final Double e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CurrentInstalment((d) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrentInstalment[i];
            }
        }

        public CurrentInstalment(d dueAmount, LocalDate dueDate, d estimatedInterest, d totalToRepay, Double d) {
            Intrinsics.checkNotNullParameter(dueAmount, "dueAmount");
            Intrinsics.checkNotNullParameter(dueDate, "dueDate");
            Intrinsics.checkNotNullParameter(estimatedInterest, "estimatedInterest");
            Intrinsics.checkNotNullParameter(totalToRepay, "totalToRepay");
            this.f68793a = dueAmount;
            this.f68794b = dueDate;
            this.f68795c = estimatedInterest;
            this.d = totalToRepay;
            this.e = d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CurrentInstalment)) {
                return false;
            }
            CurrentInstalment currentInstalment = (CurrentInstalment) obj2;
            return Intrinsics.f(this.f68793a, currentInstalment.f68793a) && Intrinsics.f(this.f68794b, currentInstalment.f68794b) && Intrinsics.f(this.f68795c, currentInstalment.f68795c) && Intrinsics.f(this.d, currentInstalment.d) && Intrinsics.f(this.e, currentInstalment.e);
        }

        public final int hashCode() {
            int iC = v7.c(v7.c(y.a(this.f68793a.hashCode() * 31, 31, this.f68794b), 31, this.f68795c), 31, this.d);
            Double d = this.e;
            return iC + (d == null ? 0 : d.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68793a);
            dest.writeSerializable(this.f68794b);
            dest.writeSerializable(this.f68795c);
            dest.writeSerializable(this.d);
            Double d = this.e;
            if (d == null) {
                dest.writeInt(0);
            } else {
                org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/instalment/CreditCardInstalmentChangeTermQuote$UpdatedInstalment;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpdatedInstalment implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UpdatedInstalment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f68796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f68797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f68798c;
        public final d d;
        public final d e;
        public final d f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpdatedInstalment(parcel.readInt(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpdatedInstalment[i];
            }
        }

        public UpdatedInstalment(int i, d totalToRepay, d monthlyPrincipal, d estimatedInterest, d nextDueAmount, d dVar) {
            Intrinsics.checkNotNullParameter(totalToRepay, "totalToRepay");
            Intrinsics.checkNotNullParameter(monthlyPrincipal, "monthlyPrincipal");
            Intrinsics.checkNotNullParameter(estimatedInterest, "estimatedInterest");
            Intrinsics.checkNotNullParameter(nextDueAmount, "nextDueAmount");
            this.f68796a = i;
            this.f68797b = totalToRepay;
            this.f68798c = monthlyPrincipal;
            this.d = estimatedInterest;
            this.e = nextDueAmount;
            this.f = dVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UpdatedInstalment)) {
                return false;
            }
            UpdatedInstalment updatedInstalment = (UpdatedInstalment) obj2;
            return this.f68796a == updatedInstalment.f68796a && Intrinsics.f(this.f68797b, updatedInstalment.f68797b) && Intrinsics.f(this.f68798c, updatedInstalment.f68798c) && Intrinsics.f(this.d, updatedInstalment.d) && Intrinsics.f(this.e, updatedInstalment.e) && Intrinsics.f(this.f, updatedInstalment.f);
        }

        public final int hashCode() {
            int iC = v7.c(v7.c(v7.c(v7.c(Integer.hashCode(this.f68796a) * 31, 31, this.f68797b), 31, this.f68798c), 31, this.d), 31, this.e);
            d dVar = this.f;
            return iC + (dVar == null ? 0 : dVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f68796a);
            dest.writeSerializable(this.f68797b);
            dest.writeSerializable(this.f68798c);
            dest.writeSerializable(this.d);
            dest.writeSerializable(this.e);
            dest.writeSerializable(this.f);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            CurrentInstalment currentInstalmentCreateFromParcel = CurrentInstalment.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(UpdatedInstalment.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CreditCardInstalmentChangeTermQuote(currentInstalmentCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardInstalmentChangeTermQuote[i];
        }
    }

    public CreditCardInstalmentChangeTermQuote(CurrentInstalment current, ArrayList updatedInstalments) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(updatedInstalments, "updatedInstalments");
        this.f68791a = current;
        this.f68792b = updatedInstalments;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardInstalmentChangeTermQuote)) {
            return false;
        }
        CreditCardInstalmentChangeTermQuote creditCardInstalmentChangeTermQuote = (CreditCardInstalmentChangeTermQuote) obj2;
        return Intrinsics.f(this.f68791a, creditCardInstalmentChangeTermQuote.f68791a) && this.f68792b.equals(creditCardInstalmentChangeTermQuote.f68792b);
    }

    public final int hashCode() {
        return this.f68792b.hashCode() + (this.f68791a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f68791a.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.f68792b, dest);
        while (itY.hasNext()) {
            ((UpdatedInstalment) itY.next()).writeToParcel(dest, i);
        }
    }
}
