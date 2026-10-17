package com.revolut.feature.credit.card.impl.ui.instalment.create;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import ehe.n;
import io3.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Create", "CreateWithTransactions", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$InputData$Create;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$InputData$CreateWithTransactions;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InstalmentFlowContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$InputData$Create;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Create implements InstalmentFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Create> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l f69321b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Create(parcel.readString(), l.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Create[i];
            }
        }

        public Create(String facilityId, l pocketType) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(pocketType, "pocketType");
            this.f69320a = facilityId;
            this.f69321b = pocketType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Create)) {
                return false;
            }
            Create create = (Create) obj2;
            return Intrinsics.f(this.f69320a, create.f69320a) && this.f69321b == create.f69321b;
        }

        public final int hashCode() {
            return this.f69321b.hashCode() + (this.f69320a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69320a);
            dest.writeString(this.f69321b.name());
        }

        @Override // com.revolut.feature.credit.card.impl.ui.instalment.create.InstalmentFlowContract$InputData
        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getF69322a() {
            return this.f69320a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$InputData$CreateWithTransactions;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "TransactionType", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateWithTransactions implements InstalmentFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<CreateWithTransactions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f69323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TransactionType f69324c;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$InputData$CreateWithTransactions$TransactionType;", "Landroid/os/Parcelable;", "Credit", "Debit", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$InputData$CreateWithTransactions$TransactionType$Credit;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$InputData$CreateWithTransactions$TransactionType$Debit;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class TransactionType implements Parcelable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f69325a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final l f69326b;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$InputData$CreateWithTransactions$TransactionType$Credit;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$InputData$CreateWithTransactions$TransactionType;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Credit extends TransactionType {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final Credit f69327c = new Credit();

                @NotNull
                public static final Parcelable.Creator<Credit> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Credit.f69327c;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Credit[i];
                    }
                }

                private Credit() {
                    super(null, l.CREDIT);
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

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$InputData$CreateWithTransactions$TransactionType$Debit;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$InputData$CreateWithTransactions$TransactionType;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Debit extends TransactionType {

                @NotNull
                public static final Parcelable.Creator<Debit> CREATOR = new a();

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final d f69328c;

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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Debit(d transactionAmount) {
                    super(transactionAmount, l.CURRENT);
                    Intrinsics.checkNotNullParameter(transactionAmount, "transactionAmount");
                    this.f69328c = transactionAmount;
                }

                @Override // com.revolut.feature.credit.card.impl.ui.instalment.create.InstalmentFlowContract.InputData.CreateWithTransactions.TransactionType
                /* JADX INFO: renamed from: a, reason: from getter */
                public final d getF69325a() {
                    return this.f69328c;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Debit) && Intrinsics.f(this.f69328c, ((Debit) obj2).f69328c);
                }

                public final int hashCode() {
                    return this.f69328c.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeSerializable(this.f69328c);
                }
            }

            public TransactionType(d dVar, l lVar) {
                this.f69325a = dVar;
                this.f69326b = lVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public d getF69325a() {
                return this.f69325a;
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
                return new CreateWithTransactions(string, linkedHashSet, (TransactionType) parcel.readParcelable(CreateWithTransactions.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateWithTransactions[i];
            }
        }

        public CreateWithTransactions(String facilityId, Set transactionIds, TransactionType transactionType) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
            Intrinsics.checkNotNullParameter(transactionType, "transactionType");
            this.f69322a = facilityId;
            this.f69323b = transactionIds;
            this.f69324c = transactionType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreateWithTransactions)) {
                return false;
            }
            CreateWithTransactions createWithTransactions = (CreateWithTransactions) obj2;
            return Intrinsics.f(this.f69322a, createWithTransactions.f69322a) && Intrinsics.f(this.f69323b, createWithTransactions.f69323b) && Intrinsics.f(this.f69324c, createWithTransactions.f69324c);
        }

        public final int hashCode() {
            return this.f69324c.hashCode() + p.a.f(this.f69322a.hashCode() * 31, 31, this.f69323b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69322a);
            Iterator itV = n.v(this.f69323b, dest);
            while (itV.hasNext()) {
                dest.writeString((String) itV.next());
            }
            dest.writeParcelable(this.f69324c, i);
        }

        @Override // com.revolut.feature.credit.card.impl.ui.instalment.create.InstalmentFlowContract$InputData
        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getF69322a() {
            return this.f69322a;
        }
    }

    /* JADX INFO: renamed from: y */
    String getF69322a();
}
