package com.revolut.feature.unified_transactions.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ofm.q;
import org.jetbrains.annotations.NotNull;
import skg.b;
import skg.c;
import tof.a3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/unified_transactions/models/UnifiedTransaction;", "Landroid/os/Parcelable;", "Standard", "Invest", "Lcom/revolut/feature/unified_transactions/models/UnifiedTransaction$Invest;", "Lcom/revolut/feature/unified_transactions/models/UnifiedTransaction$Standard;", "feature_unified_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface UnifiedTransaction extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/unified_transactions/models/UnifiedTransaction$Invest;", "Lcom/revolut/feature/unified_transactions/models/UnifiedTransaction;", "", "toString", "()Ljava/lang/String;", "feature_unified_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Invest implements UnifiedTransaction {

        @NotNull
        public static final Parcelable.Creator<Invest> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InvestTransaction f94571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f94572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f94573c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Invest((InvestTransaction) parcel.readParcelable(Invest.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Invest[i];
            }
        }

        public Invest(InvestTransaction transaction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            this.f94571a = transaction;
            this.f94572b = transaction.V1().getId();
            this.f94573c = q.o(transaction.V1());
        }

        @Override // com.revolut.feature.unified_transactions.models.UnifiedTransaction
        public final c A1() {
            return new skg.a(this.f94572b);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Invest) && Intrinsics.f(this.f94571a, ((Invest) obj2).f94571a);
        }

        @Override // com.revolut.feature.unified_transactions.models.UnifiedTransaction
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF94575b() {
            return this.f94572b;
        }

        public final int hashCode() {
            return this.f94571a.hashCode();
        }

        @Override // com.revolut.feature.unified_transactions.models.UnifiedTransaction
        /* JADX INFO: renamed from: o6, reason: from getter */
        public final long getF94576c() {
            return this.f94573c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f94571a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/unified_transactions/models/UnifiedTransaction$Standard;", "Lcom/revolut/feature/unified_transactions/models/UnifiedTransaction;", "", "toString", "()Ljava/lang/String;", "feature_unified_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Standard implements UnifiedTransaction {

        @NotNull
        public static final Parcelable.Creator<Standard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a3 f94574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f94575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f94576c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Standard((a3) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Standard[i];
            }
        }

        public Standard(a3 transaction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            this.f94574a = transaction;
            this.f94575b = transaction.f272579a;
            this.f94576c = transaction.f272593h.getMillis();
        }

        @Override // com.revolut.feature.unified_transactions.models.UnifiedTransaction
        public final c A1() {
            return new b(this.f94575b);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Standard) && Intrinsics.f(this.f94574a, ((Standard) obj2).f94574a);
        }

        @Override // com.revolut.feature.unified_transactions.models.UnifiedTransaction
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF94575b() {
            return this.f94575b;
        }

        public final int hashCode() {
            return this.f94574a.hashCode();
        }

        @Override // com.revolut.feature.unified_transactions.models.UnifiedTransaction
        /* JADX INFO: renamed from: o6, reason: from getter */
        public final long getF94576c() {
            return this.f94576c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f94574a);
        }
    }

    c A1();

    /* JADX INFO: renamed from: getId */
    String getF94575b();

    /* JADX INFO: renamed from: o6 */
    long getF94576c();
}
