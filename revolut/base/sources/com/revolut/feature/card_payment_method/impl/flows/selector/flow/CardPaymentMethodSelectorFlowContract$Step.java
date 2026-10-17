package com.revolut.feature.card_payment_method.impl.flows.selector.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.card_payment_method.api.declaration.PaymentMethodInfoInputData;
import com.revolut.feature.card_payment_method.api.declaration.SelectPaymentMethodInputData;
import com.revolut.feature.cards.models.card.PocketWithSubaccount;
import com.revolut.kompot.navigable.flow.FlowStep;
import h93.f0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/card_payment_method/impl/flows/selector/flow/CardPaymentMethodSelectorFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Selector", "Info", "SubaccountLinkDetails", "Lcom/revolut/feature/card_payment_method/impl/flows/selector/flow/CardPaymentMethodSelectorFlowContract$Step$Info;", "Lcom/revolut/feature/card_payment_method/impl/flows/selector/flow/CardPaymentMethodSelectorFlowContract$Step$Selector;", "Lcom/revolut/feature/card_payment_method/impl/flows/selector/flow/CardPaymentMethodSelectorFlowContract$Step$SubaccountLinkDetails;", "feature_card_payment_method_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardPaymentMethodSelectorFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_payment_method/impl/flows/selector/flow/CardPaymentMethodSelectorFlowContract$Step$Info;", "Lcom/revolut/feature/card_payment_method/impl/flows/selector/flow/CardPaymentMethodSelectorFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_payment_method_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Info extends CardPaymentMethodSelectorFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Info> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentMethodInfoInputData f65283a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Info((PaymentMethodInfoInputData) parcel.readParcelable(Info.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Info[i];
            }
        }

        public Info(PaymentMethodInfoInputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f65283a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Info) && Intrinsics.f(this.f65283a, ((Info) obj2).f65283a);
        }

        public final int hashCode() {
            return this.f65283a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f65283a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_payment_method/impl/flows/selector/flow/CardPaymentMethodSelectorFlowContract$Step$Selector;", "Lcom/revolut/feature/card_payment_method/impl/flows/selector/flow/CardPaymentMethodSelectorFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_payment_method_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Selector extends CardPaymentMethodSelectorFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Selector> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SelectPaymentMethodInputData f65284a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Selector((SelectPaymentMethodInputData) parcel.readParcelable(Selector.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Selector[i];
            }
        }

        public Selector(SelectPaymentMethodInputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f65284a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Selector) && Intrinsics.f(this.f65284a, ((Selector) obj2).f65284a);
        }

        public final int hashCode() {
            return this.f65284a.f65244a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f65284a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_payment_method/impl/flows/selector/flow/CardPaymentMethodSelectorFlowContract$Step$SubaccountLinkDetails;", "Lcom/revolut/feature/card_payment_method/impl/flows/selector/flow/CardPaymentMethodSelectorFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_payment_method_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SubaccountLinkDetails extends CardPaymentMethodSelectorFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SubaccountLinkDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PocketWithSubaccount f65285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f0 f65286b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f65287c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                PocketWithSubaccount pocketWithSubaccount = (PocketWithSubaccount) j6.a.f(parcel, "parcel", SubaccountLinkDetails.class);
                f0 f0Var = (f0) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new SubaccountLinkDetails(pocketWithSubaccount, f0Var, arrayList, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubaccountLinkDetails[i];
            }
        }

        public SubaccountLinkDetails(PocketWithSubaccount pocketWithSubaccount, f0 card, List cardSubscriptions, boolean z) {
            Intrinsics.checkNotNullParameter(pocketWithSubaccount, "pocketWithSubaccount");
            Intrinsics.checkNotNullParameter(card, "card");
            Intrinsics.checkNotNullParameter(cardSubscriptions, "cardSubscriptions");
            this.f65285a = pocketWithSubaccount;
            this.f65286b = card;
            this.f65287c = cardSubscriptions;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SubaccountLinkDetails)) {
                return false;
            }
            SubaccountLinkDetails subaccountLinkDetails = (SubaccountLinkDetails) obj2;
            return Intrinsics.f(this.f65285a, subaccountLinkDetails.f65285a) && Intrinsics.f(this.f65286b, subaccountLinkDetails.f65286b) && Intrinsics.f(this.f65287c, subaccountLinkDetails.f65287c) && this.d == subaccountLinkDetails.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + p.a.d((this.f65286b.hashCode() + (this.f65285a.hashCode() * 31)) * 31, 31, this.f65287c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f65285a, i);
            dest.writeSerializable(this.f65286b);
            Iterator itV = p.a.v(this.f65287c, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    private CardPaymentMethodSelectorFlowContract$Step() {
    }
}
