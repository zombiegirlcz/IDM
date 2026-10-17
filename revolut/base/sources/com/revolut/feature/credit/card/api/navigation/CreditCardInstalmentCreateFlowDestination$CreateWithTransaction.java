package com.revolut.feature.credit.card.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/card/api/navigation/CreditCardInstalmentCreateFlowDestination$CreateWithTransaction", "", "", "toString", "()Ljava/lang/String;", "TransactionType", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardInstalmentCreateFlowDestination$CreateWithTransaction implements CreditCardKompotDestination {

    @NotNull
    public static final Parcelable.Creator<CreditCardInstalmentCreateFlowDestination$CreateWithTransaction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f68930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransactionType f68931c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardInstalmentCreateFlowDestination$CreateWithTransaction$TransactionType;", "Landroid/os/Parcelable;", "Credit", "Debit", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardInstalmentCreateFlowDestination$CreateWithTransaction$TransactionType$Credit;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardInstalmentCreateFlowDestination$CreateWithTransaction$TransactionType$Debit;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface TransactionType extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardInstalmentCreateFlowDestination$CreateWithTransaction$TransactionType$Credit;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardInstalmentCreateFlowDestination$CreateWithTransaction$TransactionType;", "<init>", "()V", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Credit implements TransactionType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Credit f68932a = new Credit();

            @NotNull
            public static final Parcelable.Creator<Credit> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Credit.f68932a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Credit[i];
                }
            }

            private Credit() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardInstalmentCreateFlowDestination$CreateWithTransaction$TransactionType$Debit;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardInstalmentCreateFlowDestination$CreateWithTransaction$TransactionType;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Debit implements TransactionType {

            @NotNull
            public static final Parcelable.Creator<Debit> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f68933a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Debit((d) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Debit[i];
                }
            }

            public Debit(d transactionAmount) {
                Intrinsics.checkNotNullParameter(transactionAmount, "transactionAmount");
                this.f68933a = transactionAmount;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Debit) && Intrinsics.f(this.f68933a, ((Debit) obj2).f68933a);
            }

            public final int hashCode() {
                return this.f68933a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f68933a);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iA = 0;
            while (iA != i) {
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            return new CreditCardInstalmentCreateFlowDestination$CreateWithTransaction(string, linkedHashSet, (TransactionType) parcel.readParcelable(CreditCardInstalmentCreateFlowDestination$CreateWithTransaction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardInstalmentCreateFlowDestination$CreateWithTransaction[i];
        }
    }

    public CreditCardInstalmentCreateFlowDestination$CreateWithTransaction(String facilityId, Set transactionIds, TransactionType transactionType) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        this.f68929a = facilityId;
        this.f68930b = transactionIds;
        this.f68931c = transactionType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardInstalmentCreateFlowDestination$CreateWithTransaction)) {
            return false;
        }
        CreditCardInstalmentCreateFlowDestination$CreateWithTransaction creditCardInstalmentCreateFlowDestination$CreateWithTransaction = (CreditCardInstalmentCreateFlowDestination$CreateWithTransaction) obj2;
        return Intrinsics.f(this.f68929a, creditCardInstalmentCreateFlowDestination$CreateWithTransaction.f68929a) && Intrinsics.f(this.f68930b, creditCardInstalmentCreateFlowDestination$CreateWithTransaction.f68930b) && Intrinsics.f(this.f68931c, creditCardInstalmentCreateFlowDestination$CreateWithTransaction.f68931c);
    }

    public final int hashCode() {
        return this.f68931c.hashCode() + p.a.f(this.f68929a.hashCode() * 31, 31, this.f68930b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68929a);
        Iterator itV = n.v(this.f68930b, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
        dest.writeParcelable(this.f68931c, i);
    }
}
