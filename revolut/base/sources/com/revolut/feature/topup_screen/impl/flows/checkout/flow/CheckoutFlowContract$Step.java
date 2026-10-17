package com.revolut.feature.topup_screen.impl.flows.checkout.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.topup_screen.api.descriptor.FacadeCardTopupFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.api.descriptor.GooglePayFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.api.descriptor.TopupWithNewCardFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.api.model.CheckoutContext;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.feature.topup_screen.api.topup_limits.TopUpLimitUiModel;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$InputData;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.model.CheckoutCardPlan;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.CheckoutCustomAmountScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import h30.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yte.n;
import yte.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"com/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Checkout", "Amount", "TopUpMethods", "GooglePayTopUp", "IndiaNetBankingTopUp", "IndiaUpiTopUp", "PayNowTopUp", "CardDetails", "MoveMoney", "CardTopUp", "NewCardTopUp", "PocketDetails", "UnverifiedOwnerLimitValueDialog", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step$Amount;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step$CardDetails;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step$CardTopUp;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step$Checkout;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step$GooglePayTopUp;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step$IndiaNetBankingTopUp;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step$IndiaUpiTopUp;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step$MoveMoney;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step$NewCardTopUp;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step$PayNowTopUp;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step$PocketDetails;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step$TopUpMethods;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step$UnverifiedOwnerLimitValueDialog;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CheckoutFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step$Amount;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Amount implements CheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Amount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheckoutCustomAmountScreenContract$InputData f90672a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Amount(CheckoutCustomAmountScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Amount[i];
            }
        }

        public Amount(CheckoutCustomAmountScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f90672a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Amount) && Intrinsics.f(this.f90672a, ((Amount) obj2).f90672a);
        }

        public final int hashCode() {
            return this.f90672a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f90672a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step$CardDetails;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step;", "<init>", "()V", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CardDetails implements CheckoutFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CardDetails f90673a = new CardDetails();

        @NotNull
        public static final Parcelable.Creator<CardDetails> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CardDetails.f90673a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardDetails[i];
            }
        }

        private CardDetails() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step$CardTopUp;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardTopUp implements CheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardTopUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FacadeCardTopupFlowDescriptor$InputData f90674a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardTopUp((FacadeCardTopupFlowDescriptor$InputData) parcel.readParcelable(CardTopUp.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardTopUp[i];
            }
        }

        public CardTopUp(FacadeCardTopupFlowDescriptor$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f90674a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CardTopUp) && Intrinsics.f(this.f90674a, ((CardTopUp) obj2).f90674a);
        }

        public final int hashCode() {
            return this.f90674a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90674a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step$Checkout;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Checkout implements CheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Checkout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheckoutScreenContract$InputData f90675a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Checkout(CheckoutScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Checkout[i];
            }
        }

        public Checkout(CheckoutScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f90675a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Checkout) && Intrinsics.f(this.f90675a, ((Checkout) obj2).f90675a);
        }

        public final int hashCode() {
            return this.f90675a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f90675a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step$GooglePayTopUp;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GooglePayTopUp implements CheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<GooglePayTopUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GooglePayFlowDescriptor$InputData f90676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CheckoutScreenContract$CheckoutContent$Order f90677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f90678c;
        public final CheckoutCardPlan d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                GooglePayFlowDescriptor$InputData googlePayFlowDescriptor$InputData = (GooglePayFlowDescriptor$InputData) j6.a.f(parcel, "parcel", GooglePayTopUp.class);
                CheckoutScreenContract$CheckoutContent$Order checkoutScreenContract$CheckoutContent$Order = (CheckoutScreenContract$CheckoutContent$Order) parcel.readParcelable(GooglePayTopUp.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(p.valueOf(parcel.readString()));
                    }
                }
                return new GooglePayTopUp(googlePayFlowDescriptor$InputData, checkoutScreenContract$CheckoutContent$Order, arrayList, parcel.readInt() != 0 ? CheckoutCardPlan.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GooglePayTopUp[i];
            }
        }

        public GooglePayTopUp(GooglePayFlowDescriptor$InputData inputData, CheckoutScreenContract$CheckoutContent$Order checkoutOrder, List list, CheckoutCardPlan checkoutCardPlan) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            Intrinsics.checkNotNullParameter(checkoutOrder, "checkoutOrder");
            this.f90676a = inputData;
            this.f90677b = checkoutOrder;
            this.f90678c = list;
            this.d = checkoutCardPlan;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof GooglePayTopUp)) {
                return false;
            }
            GooglePayTopUp googlePayTopUp = (GooglePayTopUp) obj2;
            return Intrinsics.f(this.f90676a, googlePayTopUp.f90676a) && Intrinsics.f(this.f90677b, googlePayTopUp.f90677b) && Intrinsics.f(this.f90678c, googlePayTopUp.f90678c) && Intrinsics.f(this.d, googlePayTopUp.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f90677b.hashCode() + (this.f90676a.hashCode() * 31)) * 31;
            List list = this.f90678c;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            CheckoutCardPlan checkoutCardPlan = this.d;
            return iHashCode2 + (checkoutCardPlan != null ? checkoutCardPlan.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90676a, i);
            dest.writeParcelable(this.f90677b, i);
            List list = this.f90678c;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = v0.a.q(dest, 1, list);
                while (itQ.hasNext()) {
                    dest.writeString(((p) itQ.next()).name());
                }
            }
            CheckoutCardPlan checkoutCardPlan = this.d;
            if (checkoutCardPlan == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                checkoutCardPlan.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step$IndiaNetBankingTopUp;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IndiaNetBankingTopUp implements CheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<IndiaNetBankingTopUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f90679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f90680b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TopUpMethodsContext f90681c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IndiaNetBankingTopUp((dj0.d) parcel.readSerializable(), parcel.readInt() != 0, (TopUpMethodsContext) parcel.readParcelable(IndiaNetBankingTopUp.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IndiaNetBankingTopUp[i];
            }
        }

        public IndiaNetBankingTopUp(dj0.d amount, boolean z, TopUpMethodsContext topUpMethodsContext, String str) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(topUpMethodsContext, "topUpMethodsContext");
            this.f90679a = amount;
            this.f90680b = z;
            this.f90681c = topUpMethodsContext;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof IndiaNetBankingTopUp)) {
                return false;
            }
            IndiaNetBankingTopUp indiaNetBankingTopUp = (IndiaNetBankingTopUp) obj2;
            return Intrinsics.f(this.f90679a, indiaNetBankingTopUp.f90679a) && this.f90680b == indiaNetBankingTopUp.f90680b && Intrinsics.f(this.f90681c, indiaNetBankingTopUp.f90681c) && Intrinsics.f(this.d, indiaNetBankingTopUp.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f90681c.hashCode() + j6.a.c(this.f90679a.hashCode() * 31, 31, this.f90680b)) * 31;
            String str = this.d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90679a);
            dest.writeInt(this.f90680b ? 1 : 0);
            dest.writeParcelable(this.f90681c, i);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step$IndiaUpiTopUp;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IndiaUpiTopUp implements CheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<IndiaUpiTopUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f90682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f90683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TopUpMethodsContext f90684c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IndiaUpiTopUp((dj0.d) parcel.readSerializable(), parcel.readInt() != 0, (TopUpMethodsContext) parcel.readParcelable(IndiaUpiTopUp.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IndiaUpiTopUp[i];
            }
        }

        public IndiaUpiTopUp(dj0.d amount, boolean z, TopUpMethodsContext topUpMethodsContext, String str) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(topUpMethodsContext, "topUpMethodsContext");
            this.f90682a = amount;
            this.f90683b = z;
            this.f90684c = topUpMethodsContext;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof IndiaUpiTopUp)) {
                return false;
            }
            IndiaUpiTopUp indiaUpiTopUp = (IndiaUpiTopUp) obj2;
            return Intrinsics.f(this.f90682a, indiaUpiTopUp.f90682a) && this.f90683b == indiaUpiTopUp.f90683b && Intrinsics.f(this.f90684c, indiaUpiTopUp.f90684c) && Intrinsics.f(this.d, indiaUpiTopUp.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f90684c.hashCode() + j6.a.c(this.f90682a.hashCode() * 31, 31, this.f90683b)) * 31;
            String str = this.d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90682a);
            dest.writeInt(this.f90683b ? 1 : 0);
            dest.writeParcelable(this.f90684c, i);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step$MoveMoney;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoveMoney implements CheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MoveMoney> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoveMoneyInputData f90685a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MoveMoney((MoveMoneyInputData) parcel.readParcelable(MoveMoney.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveMoney[i];
            }
        }

        public MoveMoney(MoveMoneyInputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f90685a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MoveMoney) && Intrinsics.f(this.f90685a, ((MoveMoney) obj2).f90685a);
        }

        public final int hashCode() {
            return this.f90685a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90685a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step$NewCardTopUp;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewCardTopUp implements CheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NewCardTopUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TopupWithNewCardFlowDescriptor$InputData f90686a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewCardTopUp((TopupWithNewCardFlowDescriptor$InputData) parcel.readParcelable(NewCardTopUp.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewCardTopUp[i];
            }
        }

        public NewCardTopUp(TopupWithNewCardFlowDescriptor$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f90686a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NewCardTopUp) && Intrinsics.f(this.f90686a, ((NewCardTopUp) obj2).f90686a);
        }

        public final int hashCode() {
            return this.f90686a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90686a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step$PayNowTopUp;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PayNowTopUp implements CheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PayNowTopUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f90687a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PayNowTopUp((dj0.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PayNowTopUp[i];
            }
        }

        public PayNowTopUp(dj0.d amountMoney) {
            Intrinsics.checkNotNullParameter(amountMoney, "amountMoney");
            this.f90687a = amountMoney;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PayNowTopUp) && Intrinsics.f(this.f90687a, ((PayNowTopUp) obj2).f90687a);
        }

        public final int hashCode() {
            return this.f90687a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90687a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step$PocketDetails;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PocketDetails implements CheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PocketDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io3.d f90688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AccountId f90689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CheckoutOrder f90690c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PocketDetails((io3.d) parcel.readSerializable(), (AccountId) parcel.readParcelable(PocketDetails.class.getClassLoader()), (CheckoutOrder) parcel.readParcelable(PocketDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PocketDetails[i];
            }
        }

        public PocketDetails(io3.d pocket, AccountId accountId, CheckoutOrder checkoutOrder) {
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(checkoutOrder, "checkoutOrder");
            this.f90688a = pocket;
            this.f90689b = accountId;
            this.f90690c = checkoutOrder;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PocketDetails)) {
                return false;
            }
            PocketDetails pocketDetails = (PocketDetails) obj2;
            return Intrinsics.f(this.f90688a, pocketDetails.f90688a) && Intrinsics.f(this.f90689b, pocketDetails.f90689b) && Intrinsics.f(this.f90690c, pocketDetails.f90690c);
        }

        public final int hashCode() {
            return this.f90690c.hashCode() + l.b(this.f90689b, this.f90688a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90688a);
            dest.writeParcelable(this.f90689b, i);
            dest.writeParcelable(this.f90690c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step$TopUpMethods;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TopUpMethods implements CheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TopUpMethods> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n f90692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TopUpTarget f90693c;
        public final List d;
        public final CheckoutContext e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                n nVarValueOf = n.valueOf(parcel.readString());
                TopUpTarget topUpTarget = (TopUpTarget) parcel.readParcelable(TopUpMethods.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(p.valueOf(parcel.readString()));
                    }
                }
                return new TopUpMethods(string, nVarValueOf, topUpTarget, arrayList, (CheckoutContext) parcel.readParcelable(TopUpMethods.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TopUpMethods[i];
            }
        }

        public TopUpMethods(String currency, n contextType, TopUpTarget topUpTarget, List list, CheckoutContext checkoutContext) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(contextType, "contextType");
            Intrinsics.checkNotNullParameter(topUpTarget, "topUpTarget");
            Intrinsics.checkNotNullParameter(checkoutContext, "checkoutContext");
            this.f90691a = currency;
            this.f90692b = contextType;
            this.f90693c = topUpTarget;
            this.d = list;
            this.e = checkoutContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TopUpMethods)) {
                return false;
            }
            TopUpMethods topUpMethods = (TopUpMethods) obj2;
            return Intrinsics.f(this.f90691a, topUpMethods.f90691a) && this.f90692b == topUpMethods.f90692b && Intrinsics.f(this.f90693c, topUpMethods.f90693c) && Intrinsics.f(this.d, topUpMethods.d) && Intrinsics.f(this.e, topUpMethods.e);
        }

        public final int hashCode() {
            int iHashCode = (this.f90693c.hashCode() + ((this.f90692b.hashCode() + (this.f90691a.hashCode() * 31)) * 31)) * 31;
            List list = this.d;
            return this.e.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90691a);
            dest.writeString(this.f90692b.name());
            dest.writeParcelable(this.f90693c, i);
            List list = this.d;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = v0.a.q(dest, 1, list);
                while (itQ.hasNext()) {
                    dest.writeString(((p) itQ.next()).name());
                }
            }
            dest.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step$UnverifiedOwnerLimitValueDialog;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnverifiedOwnerLimitValueDialog implements CheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<UnverifiedOwnerLimitValueDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TopUpLimitUiModel f90694a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnverifiedOwnerLimitValueDialog((TopUpLimitUiModel) parcel.readParcelable(UnverifiedOwnerLimitValueDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnverifiedOwnerLimitValueDialog[i];
            }
        }

        public UnverifiedOwnerLimitValueDialog(TopUpLimitUiModel limit) {
            Intrinsics.checkNotNullParameter(limit, "limit");
            this.f90694a = limit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UnverifiedOwnerLimitValueDialog) && Intrinsics.f(this.f90694a, ((UnverifiedOwnerLimitValueDialog) obj2).f90694a);
        }

        public final int hashCode() {
            return this.f90694a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90694a, i);
        }
    }
}
