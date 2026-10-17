package com.revolut.feature.credit.card.impl.ui.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardDialogModel;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CreditLimitDecrease", "CreditCardLimits", "CreditCards", "CreditLimitDecreaseIneligible", "OverdueStateExplainer", "Dialog", "DueDate", "DisplayAmount", "NothingToRepay", "CommonError", "Terminated", "PostTerminationPlan", "LimitExceeded", "Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep$CommonError;", "Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep$CreditCardLimits;", "Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep$CreditCards;", "Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep$CreditLimitDecrease;", "Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep$CreditLimitDecreaseIneligible;", "Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep$Dialog;", "Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep$DisplayAmount;", "Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep$DueDate;", "Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep$LimitExceeded;", "Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep$NothingToRepay;", "Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep$OverdueStateExplainer;", "Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep$PostTerminationPlan;", "Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep$Terminated;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardDetailsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep$CommonError;", "Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CommonError implements CreditCardDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CommonError f69222a = new CommonError();

        @NotNull
        public static final Parcelable.Creator<CommonError> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CommonError.f69222a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CommonError[i];
            }
        }

        private CommonError() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep$CreditCardLimits;", "Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreditCardLimits implements CreditCardDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreditCardLimits f69223a = new CreditCardLimits();

        @NotNull
        public static final Parcelable.Creator<CreditCardLimits> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreditCardLimits.f69223a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditCardLimits[i];
            }
        }

        private CreditCardLimits() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep$CreditCards;", "Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreditCards implements CreditCardDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreditCards f69224a = new CreditCards();

        @NotNull
        public static final Parcelable.Creator<CreditCards> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreditCards.f69224a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditCards[i];
            }
        }

        private CreditCards() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep$CreditLimitDecrease;", "Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreditLimitDecrease implements CreditCardDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CreditLimitDecrease> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f69225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f69226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f69227c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreditLimitDecrease((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditLimitDecrease[i];
            }
        }

        public CreditLimitDecrease(d minCreditLimit, d maxCreditLimit, d nonSelectableMinCreditLimit) {
            Intrinsics.checkNotNullParameter(minCreditLimit, "minCreditLimit");
            Intrinsics.checkNotNullParameter(maxCreditLimit, "maxCreditLimit");
            Intrinsics.checkNotNullParameter(nonSelectableMinCreditLimit, "nonSelectableMinCreditLimit");
            this.f69225a = minCreditLimit;
            this.f69226b = maxCreditLimit;
            this.f69227c = nonSelectableMinCreditLimit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreditLimitDecrease)) {
                return false;
            }
            CreditLimitDecrease creditLimitDecrease = (CreditLimitDecrease) obj2;
            return Intrinsics.f(this.f69225a, creditLimitDecrease.f69225a) && Intrinsics.f(this.f69226b, creditLimitDecrease.f69226b) && Intrinsics.f(this.f69227c, creditLimitDecrease.f69227c);
        }

        public final int hashCode() {
            return this.f69227c.hashCode() + v7.c(this.f69225a.hashCode() * 31, 31, this.f69226b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69225a);
            dest.writeSerializable(this.f69226b);
            dest.writeSerializable(this.f69227c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep$CreditLimitDecreaseIneligible;", "Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreditLimitDecreaseIneligible implements CreditCardDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreditLimitDecreaseIneligible f69228a = new CreditLimitDecreaseIneligible();

        @NotNull
        public static final Parcelable.Creator<CreditLimitDecreaseIneligible> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreditLimitDecreaseIneligible.f69228a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditLimitDecreaseIneligible[i];
            }
        }

        private CreditLimitDecreaseIneligible() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep$Dialog;", "Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Dialog implements CreditCardDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Dialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCardDialogModel f69229a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Dialog((CreditCardDialogModel) parcel.readParcelable(Dialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Dialog[i];
            }
        }

        public Dialog(CreditCardDialogModel dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            this.f69229a = dialog;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Dialog) && Intrinsics.f(this.f69229a, ((Dialog) obj2).f69229a);
        }

        public final int hashCode() {
            return this.f69229a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f69229a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep$DisplayAmount;", "Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DisplayAmount implements CreditCardDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DisplayAmount f69230a = new DisplayAmount();

        @NotNull
        public static final Parcelable.Creator<DisplayAmount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DisplayAmount.f69230a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DisplayAmount[i];
            }
        }

        private DisplayAmount() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep$DueDate;", "Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DueDate implements CreditCardDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DueDate f69231a = new DueDate();

        @NotNull
        public static final Parcelable.Creator<DueDate> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DueDate.f69231a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DueDate[i];
            }
        }

        private DueDate() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep$LimitExceeded;", "Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LimitExceeded implements CreditCardDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<LimitExceeded> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f69233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f69234c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LimitExceeded((d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LimitExceeded[i];
            }
        }

        public LimitExceeded(d amount, d totalLimit, String facilityId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(totalLimit, "totalLimit");
            this.f69232a = facilityId;
            this.f69233b = amount;
            this.f69234c = totalLimit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LimitExceeded)) {
                return false;
            }
            LimitExceeded limitExceeded = (LimitExceeded) obj2;
            return Intrinsics.f(this.f69232a, limitExceeded.f69232a) && Intrinsics.f(this.f69233b, limitExceeded.f69233b) && Intrinsics.f(this.f69234c, limitExceeded.f69234c);
        }

        public final int hashCode() {
            return this.f69234c.hashCode() + v7.c(this.f69232a.hashCode() * 31, 31, this.f69233b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69232a);
            dest.writeSerializable(this.f69233b);
            dest.writeSerializable(this.f69234c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep$NothingToRepay;", "Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NothingToRepay implements CreditCardDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NothingToRepay f69235a = new NothingToRepay();

        @NotNull
        public static final Parcelable.Creator<NothingToRepay> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NothingToRepay.f69235a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NothingToRepay[i];
            }
        }

        private NothingToRepay() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep$OverdueStateExplainer;", "Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OverdueStateExplainer implements CreditCardDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<OverdueStateExplainer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f69237b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f69238c;
        public final CreditCardDetailsScreenContract$OverdueDialogType d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OverdueStateExplainer(parcel.readString(), (d) parcel.readSerializable(), (b) parcel.readSerializable(), (CreditCardDetailsScreenContract$OverdueDialogType) parcel.readParcelable(OverdueStateExplainer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OverdueStateExplainer[i];
            }
        }

        public OverdueStateExplainer(String facilityId, d amount, b countryCode, CreditCardDetailsScreenContract$OverdueDialogType dialogType) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(dialogType, "dialogType");
            this.f69236a = facilityId;
            this.f69237b = amount;
            this.f69238c = countryCode;
            this.d = dialogType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OverdueStateExplainer)) {
                return false;
            }
            OverdueStateExplainer overdueStateExplainer = (OverdueStateExplainer) obj2;
            return Intrinsics.f(this.f69236a, overdueStateExplainer.f69236a) && Intrinsics.f(this.f69237b, overdueStateExplainer.f69237b) && Intrinsics.f(this.f69238c, overdueStateExplainer.f69238c) && Intrinsics.f(this.d, overdueStateExplainer.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.c(v7.c(this.f69236a.hashCode() * 31, 31, this.f69237b), 31, this.f69238c.f297794a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69236a);
            dest.writeSerializable(this.f69237b);
            dest.writeSerializable(this.f69238c);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep$PostTerminationPlan;", "Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PostTerminationPlan implements CreditCardDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PostTerminationPlan> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69239a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PostTerminationPlan(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PostTerminationPlan[i];
            }
        }

        public PostTerminationPlan(String planId) {
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f69239a = planId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PostTerminationPlan) && Intrinsics.f(this.f69239a, ((PostTerminationPlan) obj2).f69239a);
        }

        public final int hashCode() {
            return this.f69239a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69239a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep$Terminated;", "Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Terminated implements CreditCardDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Terminated> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f69240a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Terminated((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Terminated[i];
            }
        }

        public Terminated(d amount) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.f69240a = amount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Terminated) && Intrinsics.f(this.f69240a, ((Terminated) obj2).f69240a);
        }

        public final int hashCode() {
            return this.f69240a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69240a);
        }
    }
}
