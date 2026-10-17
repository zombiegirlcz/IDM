package com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.model.CheckoutOrderFeeBreakdown;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/bottom_sheet/CheckoutBottomSheetInput;", "Landroid/os/Parcelable;", "<init>", "()V", "CancelOrder", "TopUpMethodFee", "PreKycLearnMore", "PlanPriceBreakdown", "CardPriceBreakdown", "DeliveryPriceBreakdown", "CardCustomisationPriceBreakdown", "CreditPlanFee", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/bottom_sheet/CheckoutBottomSheetInput$CancelOrder;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/bottom_sheet/CheckoutBottomSheetInput$CardCustomisationPriceBreakdown;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/bottom_sheet/CheckoutBottomSheetInput$CardPriceBreakdown;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/bottom_sheet/CheckoutBottomSheetInput$CreditPlanFee;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/bottom_sheet/CheckoutBottomSheetInput$DeliveryPriceBreakdown;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/bottom_sheet/CheckoutBottomSheetInput$PlanPriceBreakdown;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/bottom_sheet/CheckoutBottomSheetInput$PreKycLearnMore;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/bottom_sheet/CheckoutBottomSheetInput$TopUpMethodFee;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CheckoutBottomSheetInput implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/bottom_sheet/CheckoutBottomSheetInput$CancelOrder;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/bottom_sheet/CheckoutBottomSheetInput;", "<init>", "()V", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CancelOrder extends CheckoutBottomSheetInput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CancelOrder f90731a = new CancelOrder();

        @NotNull
        public static final Parcelable.Creator<CancelOrder> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CancelOrder.f90731a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelOrder[i];
            }
        }

        private CancelOrder() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/bottom_sheet/CheckoutBottomSheetInput$CardCustomisationPriceBreakdown;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/bottom_sheet/CheckoutBottomSheetInput;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardCustomisationPriceBreakdown extends CheckoutBottomSheetInput {

        @NotNull
        public static final Parcelable.Creator<CardCustomisationPriceBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheckoutOrderFeeBreakdown f90732a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardCustomisationPriceBreakdown(CheckoutOrderFeeBreakdown.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardCustomisationPriceBreakdown[i];
            }
        }

        public CardCustomisationPriceBreakdown(CheckoutOrderFeeBreakdown feeBreakdown) {
            Intrinsics.checkNotNullParameter(feeBreakdown, "feeBreakdown");
            this.f90732a = feeBreakdown;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CardCustomisationPriceBreakdown) && Intrinsics.f(this.f90732a, ((CardCustomisationPriceBreakdown) obj2).f90732a);
        }

        public final int hashCode() {
            return this.f90732a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f90732a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/bottom_sheet/CheckoutBottomSheetInput$CardPriceBreakdown;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/bottom_sheet/CheckoutBottomSheetInput;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardPriceBreakdown extends CheckoutBottomSheetInput {

        @NotNull
        public static final Parcelable.Creator<CardPriceBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f90733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CheckoutOrderFeeBreakdown f90734b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardPriceBreakdown((Clause) parcel.readParcelable(CardPriceBreakdown.class.getClassLoader()), CheckoutOrderFeeBreakdown.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardPriceBreakdown[i];
            }
        }

        public CardPriceBreakdown(Clause cardTitle, CheckoutOrderFeeBreakdown feeBreakdown) {
            Intrinsics.checkNotNullParameter(cardTitle, "cardTitle");
            Intrinsics.checkNotNullParameter(feeBreakdown, "feeBreakdown");
            this.f90733a = cardTitle;
            this.f90734b = feeBreakdown;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardPriceBreakdown)) {
                return false;
            }
            CardPriceBreakdown cardPriceBreakdown = (CardPriceBreakdown) obj2;
            return Intrinsics.f(this.f90733a, cardPriceBreakdown.f90733a) && Intrinsics.f(this.f90734b, cardPriceBreakdown.f90734b);
        }

        public final int hashCode() {
            return this.f90734b.hashCode() + (this.f90733a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90733a, i);
            this.f90734b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/bottom_sheet/CheckoutBottomSheetInput$CreditPlanFee;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/bottom_sheet/CheckoutBottomSheetInput;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreditPlanFee extends CheckoutBottomSheetInput {

        @NotNull
        public static final Parcelable.Creator<CreditPlanFee> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f90735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f90736b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreditPlanFee((Clause) parcel.readParcelable(CreditPlanFee.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditPlanFee[i];
            }
        }

        public CreditPlanFee(Clause planName, boolean z) {
            Intrinsics.checkNotNullParameter(planName, "planName");
            this.f90735a = planName;
            this.f90736b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreditPlanFee)) {
                return false;
            }
            CreditPlanFee creditPlanFee = (CreditPlanFee) obj2;
            return Intrinsics.f(this.f90735a, creditPlanFee.f90735a) && this.f90736b == creditPlanFee.f90736b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f90736b) + (this.f90735a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90735a, i);
            dest.writeInt(this.f90736b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/bottom_sheet/CheckoutBottomSheetInput$DeliveryPriceBreakdown;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/bottom_sheet/CheckoutBottomSheetInput;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeliveryPriceBreakdown extends CheckoutBottomSheetInput {

        @NotNull
        public static final Parcelable.Creator<DeliveryPriceBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f90737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CheckoutOrderFeeBreakdown f90738b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeliveryPriceBreakdown((Clause) parcel.readParcelable(DeliveryPriceBreakdown.class.getClassLoader()), CheckoutOrderFeeBreakdown.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeliveryPriceBreakdown[i];
            }
        }

        public DeliveryPriceBreakdown(Clause deliveryTitle, CheckoutOrderFeeBreakdown feeBreakdown) {
            Intrinsics.checkNotNullParameter(deliveryTitle, "deliveryTitle");
            Intrinsics.checkNotNullParameter(feeBreakdown, "feeBreakdown");
            this.f90737a = deliveryTitle;
            this.f90738b = feeBreakdown;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DeliveryPriceBreakdown)) {
                return false;
            }
            DeliveryPriceBreakdown deliveryPriceBreakdown = (DeliveryPriceBreakdown) obj2;
            return Intrinsics.f(this.f90737a, deliveryPriceBreakdown.f90737a) && Intrinsics.f(this.f90738b, deliveryPriceBreakdown.f90738b);
        }

        public final int hashCode() {
            return this.f90738b.hashCode() + (this.f90737a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90737a, i);
            this.f90738b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/bottom_sheet/CheckoutBottomSheetInput$PlanPriceBreakdown;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/bottom_sheet/CheckoutBottomSheetInput;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanPriceBreakdown extends CheckoutBottomSheetInput {

        @NotNull
        public static final Parcelable.Creator<PlanPriceBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f90739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CheckoutOrderFeeBreakdown f90740b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanPriceBreakdown((Clause) parcel.readParcelable(PlanPriceBreakdown.class.getClassLoader()), CheckoutOrderFeeBreakdown.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanPriceBreakdown[i];
            }
        }

        public PlanPriceBreakdown(Clause planTitle, CheckoutOrderFeeBreakdown feeBreakdown) {
            Intrinsics.checkNotNullParameter(planTitle, "planTitle");
            Intrinsics.checkNotNullParameter(feeBreakdown, "feeBreakdown");
            this.f90739a = planTitle;
            this.f90740b = feeBreakdown;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanPriceBreakdown)) {
                return false;
            }
            PlanPriceBreakdown planPriceBreakdown = (PlanPriceBreakdown) obj2;
            return Intrinsics.f(this.f90739a, planPriceBreakdown.f90739a) && Intrinsics.f(this.f90740b, planPriceBreakdown.f90740b);
        }

        public final int hashCode() {
            return this.f90740b.hashCode() + (this.f90739a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90739a, i);
            this.f90740b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/bottom_sheet/CheckoutBottomSheetInput$PreKycLearnMore;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/bottom_sheet/CheckoutBottomSheetInput;", "<init>", "()V", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PreKycLearnMore extends CheckoutBottomSheetInput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PreKycLearnMore f90741a = new PreKycLearnMore();

        @NotNull
        public static final Parcelable.Creator<PreKycLearnMore> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PreKycLearnMore.f90741a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PreKycLearnMore[i];
            }
        }

        private PreKycLearnMore() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/bottom_sheet/CheckoutBottomSheetInput$TopUpMethodFee;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/bottom_sheet/CheckoutBottomSheetInput;", "<init>", "()V", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TopUpMethodFee extends CheckoutBottomSheetInput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TopUpMethodFee f90742a = new TopUpMethodFee();

        @NotNull
        public static final Parcelable.Creator<TopUpMethodFee> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TopUpMethodFee.f90742a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TopUpMethodFee[i];
            }
        }

        private TopUpMethodFee() {
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

    private CheckoutBottomSheetInput() {
    }
}
