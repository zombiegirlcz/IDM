package com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.details.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ql4.j;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/card/impl/ui/instalment/post_purchase/details/flow/CreditCardPostPurchaseDetailsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Details", "Edit", "Repay", "Lcom/revolut/feature/credit/card/impl/ui/instalment/post_purchase/details/flow/CreditCardPostPurchaseDetailsFlowContract$Step$Details;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/post_purchase/details/flow/CreditCardPostPurchaseDetailsFlowContract$Step$Edit;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/post_purchase/details/flow/CreditCardPostPurchaseDetailsFlowContract$Step$Repay;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardPostPurchaseDetailsFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/post_purchase/details/flow/CreditCardPostPurchaseDetailsFlowContract$Step$Details;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/post_purchase/details/flow/CreditCardPostPurchaseDetailsFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Details implements CreditCardPostPurchaseDetailsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Details f69414a = new Details();

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Details.f69414a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        private Details() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/post_purchase/details/flow/CreditCardPostPurchaseDetailsFlowContract$Step$Edit;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/post_purchase/details/flow/CreditCardPostPurchaseDetailsFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Edit implements CreditCardPostPurchaseDetailsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Edit f69415a = new Edit();

        @NotNull
        public static final Parcelable.Creator<Edit> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Edit.f69415a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Edit[i];
            }
        }

        private Edit() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/post_purchase/details/flow/CreditCardPostPurchaseDetailsFlowContract$Step$Repay;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/post_purchase/details/flow/CreditCardPostPurchaseDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Repay implements CreditCardPostPurchaseDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Repay> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f69416a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(j.valueOf(parcel.readString()));
                }
                return new Repay(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Repay[i];
            }
        }

        public Repay(ArrayList repaymentMethods) {
            Intrinsics.checkNotNullParameter(repaymentMethods, "repaymentMethods");
            this.f69416a = repaymentMethods;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Repay) && this.f69416a.equals(((Repay) obj2).f69416a);
        }

        public final int hashCode() {
            return this.f69416a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f69416a, dest);
            while (itY.hasNext()) {
                dest.writeString(((j) itY.next()).name());
            }
        }
    }
}
