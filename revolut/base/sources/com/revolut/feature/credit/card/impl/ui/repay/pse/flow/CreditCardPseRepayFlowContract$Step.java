package com.revolut.feature.credit.card.impl.ui.repay.pse.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/credit/card/impl/ui/repay/pse/flow/CreditCardPseRepayFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "SelectAmount", "InstalmentHub", "Pse", "Lcom/revolut/feature/credit/card/impl/ui/repay/pse/flow/CreditCardPseRepayFlowContract$Step$InstalmentHub;", "Lcom/revolut/feature/credit/card/impl/ui/repay/pse/flow/CreditCardPseRepayFlowContract$Step$Pse;", "Lcom/revolut/feature/credit/card/impl/ui/repay/pse/flow/CreditCardPseRepayFlowContract$Step$SelectAmount;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditCardPseRepayFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay/pse/flow/CreditCardPseRepayFlowContract$Step$InstalmentHub;", "Lcom/revolut/feature/credit/card/impl/ui/repay/pse/flow/CreditCardPseRepayFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InstalmentHub extends CreditCardPseRepayFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InstalmentHub> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69596a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InstalmentHub(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InstalmentHub[i];
            }
        }

        public InstalmentHub(String facilityId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            this.f69596a = facilityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InstalmentHub) && Intrinsics.f(this.f69596a, ((InstalmentHub) obj2).f69596a);
        }

        public final int hashCode() {
            return this.f69596a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69596a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay/pse/flow/CreditCardPseRepayFlowContract$Step$Pse;", "Lcom/revolut/feature/credit/card/impl/ui/repay/pse/flow/CreditCardPseRepayFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pse extends CreditCardPseRepayFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Pse> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f69597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f69598b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pse((d) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pse[i];
            }
        }

        public Pse(d amount, String pocketId) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
            this.f69597a = amount;
            this.f69598b = pocketId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Pse)) {
                return false;
            }
            Pse pse2 = (Pse) obj2;
            return Intrinsics.f(this.f69597a, pse2.f69597a) && Intrinsics.f(this.f69598b, pse2.f69598b);
        }

        public final int hashCode() {
            return this.f69598b.hashCode() + (this.f69597a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69597a);
            dest.writeString(this.f69598b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay/pse/flow/CreditCardPseRepayFlowContract$Step$SelectAmount;", "Lcom/revolut/feature/credit/card/impl/ui/repay/pse/flow/CreditCardPseRepayFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectAmount extends CreditCardPseRepayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectAmount f69599a = new SelectAmount();

        @NotNull
        public static final Parcelable.Creator<SelectAmount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectAmount.f69599a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectAmount[i];
            }
        }

        private SelectAmount() {
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

    private CreditCardPseRepayFlowContract$Step() {
    }
}
