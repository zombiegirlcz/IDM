package com.revolut.feature.credit.card.impl.ui.statement.transactions.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/card/impl/ui/statement/transactions/flow/CreditCardTransactionsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Transactions", "StatementFinancing", "PrePurchase", "PostPurchase", "Lcom/revolut/feature/credit/card/impl/ui/statement/transactions/flow/CreditCardTransactionsFlowContract$Step$PostPurchase;", "Lcom/revolut/feature/credit/card/impl/ui/statement/transactions/flow/CreditCardTransactionsFlowContract$Step$PrePurchase;", "Lcom/revolut/feature/credit/card/impl/ui/statement/transactions/flow/CreditCardTransactionsFlowContract$Step$StatementFinancing;", "Lcom/revolut/feature/credit/card/impl/ui/statement/transactions/flow/CreditCardTransactionsFlowContract$Step$Transactions;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardTransactionsFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement/transactions/flow/CreditCardTransactionsFlowContract$Step$PostPurchase;", "Lcom/revolut/feature/credit/card/impl/ui/statement/transactions/flow/CreditCardTransactionsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PostPurchase implements CreditCardTransactionsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PostPurchase> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f69714b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PostPurchase(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PostPurchase[i];
            }
        }

        public PostPurchase(String facilityId, String planId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f69713a = facilityId;
            this.f69714b = planId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PostPurchase)) {
                return false;
            }
            PostPurchase postPurchase = (PostPurchase) obj2;
            return Intrinsics.f(this.f69713a, postPurchase.f69713a) && Intrinsics.f(this.f69714b, postPurchase.f69714b);
        }

        public final int hashCode() {
            return this.f69714b.hashCode() + (this.f69713a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69713a);
            dest.writeString(this.f69714b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement/transactions/flow/CreditCardTransactionsFlowContract$Step$PrePurchase;", "Lcom/revolut/feature/credit/card/impl/ui/statement/transactions/flow/CreditCardTransactionsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PrePurchase implements CreditCardTransactionsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PrePurchase> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f69716b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PrePurchase(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrePurchase[i];
            }
        }

        public PrePurchase(String facilityId, String planId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f69715a = facilityId;
            this.f69716b = planId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PrePurchase)) {
                return false;
            }
            PrePurchase prePurchase = (PrePurchase) obj2;
            return Intrinsics.f(this.f69715a, prePurchase.f69715a) && Intrinsics.f(this.f69716b, prePurchase.f69716b);
        }

        public final int hashCode() {
            return this.f69716b.hashCode() + (this.f69715a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69715a);
            dest.writeString(this.f69716b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement/transactions/flow/CreditCardTransactionsFlowContract$Step$StatementFinancing;", "Lcom/revolut/feature/credit/card/impl/ui/statement/transactions/flow/CreditCardTransactionsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StatementFinancing implements CreditCardTransactionsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<StatementFinancing> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f69718b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StatementFinancing(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StatementFinancing[i];
            }
        }

        public StatementFinancing(String facilityId, String planId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f69717a = facilityId;
            this.f69718b = planId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof StatementFinancing)) {
                return false;
            }
            StatementFinancing statementFinancing = (StatementFinancing) obj2;
            return Intrinsics.f(this.f69717a, statementFinancing.f69717a) && Intrinsics.f(this.f69718b, statementFinancing.f69718b);
        }

        public final int hashCode() {
            return this.f69718b.hashCode() + (this.f69717a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69717a);
            dest.writeString(this.f69718b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement/transactions/flow/CreditCardTransactionsFlowContract$Step$Transactions;", "Lcom/revolut/feature/credit/card/impl/ui/statement/transactions/flow/CreditCardTransactionsFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Transactions implements CreditCardTransactionsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Transactions f69719a = new Transactions();

        @NotNull
        public static final Parcelable.Creator<Transactions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Transactions.f69719a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transactions[i];
            }
        }

        private Transactions() {
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
}
