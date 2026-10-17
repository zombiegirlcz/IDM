package com.revolut.feature.credit.card.impl.ui.instalment.details.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ql4.j;
import ql4.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/credit/card/impl/ui/instalment/details/flow/CreditCardInstalmentDetailsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "StatementFinancing", "PrePurchase", "PostPurchase", "Repay", "Lcom/revolut/feature/credit/card/impl/ui/instalment/details/flow/CreditCardInstalmentDetailsFlowContract$Step$PostPurchase;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/details/flow/CreditCardInstalmentDetailsFlowContract$Step$PrePurchase;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/details/flow/CreditCardInstalmentDetailsFlowContract$Step$Repay;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/details/flow/CreditCardInstalmentDetailsFlowContract$Step$StatementFinancing;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditCardInstalmentDetailsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/details/flow/CreditCardInstalmentDetailsFlowContract$Step$PostPurchase;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/details/flow/CreditCardInstalmentDetailsFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PostPurchase extends CreditCardInstalmentDetailsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PostPurchase f69355a = new PostPurchase();

        @NotNull
        public static final Parcelable.Creator<PostPurchase> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PostPurchase.f69355a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PostPurchase[i];
            }
        }

        private PostPurchase() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/details/flow/CreditCardInstalmentDetailsFlowContract$Step$PrePurchase;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/details/flow/CreditCardInstalmentDetailsFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PrePurchase extends CreditCardInstalmentDetailsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PrePurchase f69356a = new PrePurchase();

        @NotNull
        public static final Parcelable.Creator<PrePurchase> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PrePurchase.f69356a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrePurchase[i];
            }
        }

        private PrePurchase() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/details/flow/CreditCardInstalmentDetailsFlowContract$Step$Repay;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/details/flow/CreditCardInstalmentDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Repay extends CreditCardInstalmentDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Repay> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v f69357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f69358b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                v vVarValueOf = v.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(j.valueOf(parcel.readString()));
                }
                return new Repay(vVarValueOf, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Repay[i];
            }
        }

        public Repay(v instalmentType, List repaymentMethods) {
            Intrinsics.checkNotNullParameter(instalmentType, "instalmentType");
            Intrinsics.checkNotNullParameter(repaymentMethods, "repaymentMethods");
            this.f69357a = instalmentType;
            this.f69358b = repaymentMethods;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Repay)) {
                return false;
            }
            Repay repay = (Repay) obj2;
            return this.f69357a == repay.f69357a && Intrinsics.f(this.f69358b, repay.f69358b);
        }

        public final int hashCode() {
            return this.f69358b.hashCode() + (this.f69357a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69357a.name());
            Iterator itV = p.a.v(this.f69358b, dest);
            while (itV.hasNext()) {
                dest.writeString(((j) itV.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/details/flow/CreditCardInstalmentDetailsFlowContract$Step$StatementFinancing;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/details/flow/CreditCardInstalmentDetailsFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StatementFinancing extends CreditCardInstalmentDetailsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StatementFinancing f69359a = new StatementFinancing();

        @NotNull
        public static final Parcelable.Creator<StatementFinancing> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StatementFinancing.f69359a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StatementFinancing[i];
            }
        }

        private StatementFinancing() {
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

    private CreditCardInstalmentDetailsFlowContract$Step() {
    }
}
