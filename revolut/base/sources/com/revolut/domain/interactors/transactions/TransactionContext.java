package com.revolut.domain.interactors.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.interactors.transactions.Priority;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/domain/interactors/transactions/TransactionContext;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "DataSet", "TransactionData", "a", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionContext implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Priority f60265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataSet f60266b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<TransactionContext> CREATOR = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TransactionContext f60264c = new TransactionContext(null, 0 == true ? 1 : 0, 3);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/domain/interactors/transactions/TransactionContext$DataSet;", "Landroid/os/Parcelable;", "AllIncluded", "AllExcluded", "Included", "Excluded", "Lcom/revolut/domain/interactors/transactions/TransactionContext$DataSet$AllExcluded;", "Lcom/revolut/domain/interactors/transactions/TransactionContext$DataSet$AllIncluded;", "Lcom/revolut/domain/interactors/transactions/TransactionContext$DataSet$Excluded;", "Lcom/revolut/domain/interactors/transactions/TransactionContext$DataSet$Included;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface DataSet extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/domain/interactors/transactions/TransactionContext$DataSet$AllExcluded;", "Lcom/revolut/domain/interactors/transactions/TransactionContext$DataSet;", "<init>", "()V", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class AllExcluded implements DataSet {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final AllExcluded f60267a = new AllExcluded();

            @NotNull
            public static final Parcelable.Creator<AllExcluded> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return AllExcluded.f60267a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AllExcluded[i];
                }
            }

            private AllExcluded() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/domain/interactors/transactions/TransactionContext$DataSet$AllIncluded;", "Lcom/revolut/domain/interactors/transactions/TransactionContext$DataSet;", "<init>", "()V", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class AllIncluded implements DataSet {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final AllIncluded f60268a = new AllIncluded();

            @NotNull
            public static final Parcelable.Creator<AllIncluded> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return AllIncluded.f60268a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AllIncluded[i];
                }
            }

            private AllIncluded() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/interactors/transactions/TransactionContext$DataSet$Excluded;", "Lcom/revolut/domain/interactors/transactions/TransactionContext$DataSet;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Excluded implements DataSet {

            @NotNull
            public static final Parcelable.Creator<Excluded> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Set f60269a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet.add(TransactionData.valueOf(parcel.readString()));
                    }
                    return new Excluded(linkedHashSet);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Excluded[i];
                }
            }

            public Excluded(Set data) {
                Intrinsics.checkNotNullParameter(data, "data");
                this.f60269a = data;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Excluded) && Intrinsics.f(this.f60269a, ((Excluded) obj2).f60269a);
            }

            public final int hashCode() {
                return this.f60269a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itV = n.v(this.f60269a, dest);
                while (itV.hasNext()) {
                    dest.writeString(((TransactionData) itV.next()).name());
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/interactors/transactions/TransactionContext$DataSet$Included;", "Lcom/revolut/domain/interactors/transactions/TransactionContext$DataSet;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Included implements DataSet {

            @NotNull
            public static final Parcelable.Creator<Included> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Set f60270a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet.add(TransactionData.valueOf(parcel.readString()));
                    }
                    return new Included(linkedHashSet);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Included[i];
                }
            }

            public Included(Set data) {
                Intrinsics.checkNotNullParameter(data, "data");
                this.f60270a = data;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Included) && Intrinsics.f(this.f60270a, ((Included) obj2).f60270a);
            }

            public final int hashCode() {
                return this.f60270a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itV = n.v(this.f60270a, dest);
                while (itV.hasNext()) {
                    dest.writeString(((TransactionData) itV.next()).name());
                }
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/domain/interactors/transactions/TransactionContext$TransactionData;", "", "<init>", "(Ljava/lang/String;I)V", "MERCHANTS", "TRANSFER_USERS", "LOANS", "MERCHANT_PAYMENTS", "ACQUIRING_CASHBACK", "EXCLUDED_FROM_SPENDING_ANALYTICS", "HIDDEN", "RELATED_TRANSACTIONS", "CRYPTO_DEPOSIT", "DEFI_METADATA", "EXTRA_ATTRIBUTES", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TransactionData {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TransactionData[] $VALUES;
        public static final TransactionData MERCHANTS = new TransactionData("MERCHANTS", 0);
        public static final TransactionData TRANSFER_USERS = new TransactionData("TRANSFER_USERS", 1);
        public static final TransactionData LOANS = new TransactionData("LOANS", 2);
        public static final TransactionData MERCHANT_PAYMENTS = new TransactionData("MERCHANT_PAYMENTS", 3);
        public static final TransactionData ACQUIRING_CASHBACK = new TransactionData("ACQUIRING_CASHBACK", 4);
        public static final TransactionData EXCLUDED_FROM_SPENDING_ANALYTICS = new TransactionData("EXCLUDED_FROM_SPENDING_ANALYTICS", 5);
        public static final TransactionData HIDDEN = new TransactionData("HIDDEN", 6);
        public static final TransactionData RELATED_TRANSACTIONS = new TransactionData("RELATED_TRANSACTIONS", 7);
        public static final TransactionData CRYPTO_DEPOSIT = new TransactionData("CRYPTO_DEPOSIT", 8);
        public static final TransactionData DEFI_METADATA = new TransactionData("DEFI_METADATA", 9);
        public static final TransactionData EXTRA_ATTRIBUTES = new TransactionData("EXTRA_ATTRIBUTES", 10);

        private static final /* synthetic */ TransactionData[] $values() {
            return new TransactionData[]{MERCHANTS, TRANSFER_USERS, LOANS, MERCHANT_PAYMENTS, ACQUIRING_CASHBACK, EXCLUDED_FROM_SPENDING_ANALYTICS, HIDDEN, RELATED_TRANSACTIONS, CRYPTO_DEPOSIT, DEFI_METADATA, EXTRA_ATTRIBUTES};
        }

        static {
            TransactionData[] transactionDataArr$values = $values();
            $VALUES = transactionDataArr$values;
            $ENTRIES = s.n(transactionDataArr$values);
        }

        private TransactionData(String str, int i) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static TransactionData valueOf(String str) {
            return (TransactionData) Enum.valueOf(TransactionData.class, str);
        }

        public static TransactionData[] values() {
            return (TransactionData[]) $VALUES.clone();
        }
    }

    /* JADX INFO: renamed from: com.revolut.domain.interactors.transactions.TransactionContext$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static TransactionContext a() {
            return TransactionContext.f60264c;
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransactionContext((Priority) parcel.readParcelable(TransactionContext.class.getClassLoader()), (DataSet) parcel.readParcelable(TransactionContext.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransactionContext[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransactionContext() {
        this(null, 0 == true ? 1 : 0, 3);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Priority getF60265a() {
        return this.f60265a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransactionContext)) {
            return false;
        }
        TransactionContext transactionContext = (TransactionContext) obj2;
        return Intrinsics.f(this.f60265a, transactionContext.f60265a) && Intrinsics.f(this.f60266b, transactionContext.f60266b);
    }

    public final int hashCode() {
        return this.f60266b.hashCode() + (this.f60265a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f60265a, i);
        dest.writeParcelable(this.f60266b, i);
    }

    public TransactionContext(Priority priority, DataSet dataset) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(dataset, "dataset");
        this.f60265a = priority;
        this.f60266b = dataset;
    }

    public /* synthetic */ TransactionContext(Priority priority, DataSet dataSet, int i) {
        this((i & 1) != 0 ? Priority.STANDARD.f60263b : priority, (i & 2) != 0 ? DataSet.AllIncluded.f60268a : dataSet);
    }
}
