package com.revolut.feature.credit.card.impl.ui.credit_limit_cap;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.api.models.credit_limit_cap.CreditLimitCapImpact;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"com/revolut/feature/credit/card/impl/ui/credit_limit_cap/CreditLimitCapChangeScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "LimitManagement", "AvailableLessThanZero", "AvailableToSpend", "ImpactedCardholders", "LimitDecreaseSheet", "CreditLimitDecreaseIneligibleExplainer", "Lcom/revolut/feature/credit/card/impl/ui/credit_limit_cap/CreditLimitCapChangeScreenContract$ModalStep$AvailableLessThanZero;", "Lcom/revolut/feature/credit/card/impl/ui/credit_limit_cap/CreditLimitCapChangeScreenContract$ModalStep$AvailableToSpend;", "Lcom/revolut/feature/credit/card/impl/ui/credit_limit_cap/CreditLimitCapChangeScreenContract$ModalStep$CreditLimitDecreaseIneligibleExplainer;", "Lcom/revolut/feature/credit/card/impl/ui/credit_limit_cap/CreditLimitCapChangeScreenContract$ModalStep$ImpactedCardholders;", "Lcom/revolut/feature/credit/card/impl/ui/credit_limit_cap/CreditLimitCapChangeScreenContract$ModalStep$LimitDecreaseSheet;", "Lcom/revolut/feature/credit/card/impl/ui/credit_limit_cap/CreditLimitCapChangeScreenContract$ModalStep$LimitManagement;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditLimitCapChangeScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/credit_limit_cap/CreditLimitCapChangeScreenContract$ModalStep$AvailableLessThanZero;", "Lcom/revolut/feature/credit/card/impl/ui/credit_limit_cap/CreditLimitCapChangeScreenContract$ModalStep;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AvailableLessThanZero extends CreditLimitCapChangeScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AvailableLessThanZero f69174a = new AvailableLessThanZero();

        @NotNull
        public static final Parcelable.Creator<AvailableLessThanZero> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AvailableLessThanZero.f69174a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AvailableLessThanZero[i];
            }
        }

        private AvailableLessThanZero() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/credit_limit_cap/CreditLimitCapChangeScreenContract$ModalStep$AvailableToSpend;", "Lcom/revolut/feature/credit/card/impl/ui/credit_limit_cap/CreditLimitCapChangeScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AvailableToSpend extends CreditLimitCapChangeScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AvailableToSpend> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f69175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f69176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f69177c;
        public final d d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AvailableToSpend((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AvailableToSpend[i];
            }
        }

        public AvailableToSpend(d creditCardLimit, d spent, d available, d maxCap) {
            Intrinsics.checkNotNullParameter(creditCardLimit, "creditCardLimit");
            Intrinsics.checkNotNullParameter(spent, "spent");
            Intrinsics.checkNotNullParameter(available, "available");
            Intrinsics.checkNotNullParameter(maxCap, "maxCap");
            this.f69175a = creditCardLimit;
            this.f69176b = spent;
            this.f69177c = available;
            this.d = maxCap;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AvailableToSpend)) {
                return false;
            }
            AvailableToSpend availableToSpend = (AvailableToSpend) obj2;
            return Intrinsics.f(this.f69175a, availableToSpend.f69175a) && Intrinsics.f(this.f69176b, availableToSpend.f69176b) && Intrinsics.f(this.f69177c, availableToSpend.f69177c) && Intrinsics.f(this.d, availableToSpend.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + v7.c(v7.c(this.f69175a.hashCode() * 31, 31, this.f69176b), 31, this.f69177c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69175a);
            dest.writeSerializable(this.f69176b);
            dest.writeSerializable(this.f69177c);
            dest.writeSerializable(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/credit_limit_cap/CreditLimitCapChangeScreenContract$ModalStep$CreditLimitDecreaseIneligibleExplainer;", "Lcom/revolut/feature/credit/card/impl/ui/credit_limit_cap/CreditLimitCapChangeScreenContract$ModalStep;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreditLimitDecreaseIneligibleExplainer extends CreditLimitCapChangeScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreditLimitDecreaseIneligibleExplainer f69178a = new CreditLimitDecreaseIneligibleExplainer();

        @NotNull
        public static final Parcelable.Creator<CreditLimitDecreaseIneligibleExplainer> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreditLimitDecreaseIneligibleExplainer.f69178a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditLimitDecreaseIneligibleExplainer[i];
            }
        }

        private CreditLimitDecreaseIneligibleExplainer() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/credit_limit_cap/CreditLimitCapChangeScreenContract$ModalStep$ImpactedCardholders;", "Lcom/revolut/feature/credit/card/impl/ui/credit_limit_cap/CreditLimitCapChangeScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ImpactedCardholders extends CreditLimitCapChangeScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ImpactedCardholders> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditLimitCapImpact f69179a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ImpactedCardholders((CreditLimitCapImpact) parcel.readParcelable(ImpactedCardholders.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ImpactedCardholders[i];
            }
        }

        public ImpactedCardholders(CreditLimitCapImpact impactedCardholders) {
            Intrinsics.checkNotNullParameter(impactedCardholders, "impactedCardholders");
            this.f69179a = impactedCardholders;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ImpactedCardholders) && Intrinsics.f(this.f69179a, ((ImpactedCardholders) obj2).f69179a);
        }

        public final int hashCode() {
            return this.f69179a.f68720a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f69179a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/credit_limit_cap/CreditLimitCapChangeScreenContract$ModalStep$LimitDecreaseSheet;", "Lcom/revolut/feature/credit/card/impl/ui/credit_limit_cap/CreditLimitCapChangeScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LimitDecreaseSheet extends CreditLimitCapChangeScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<LimitDecreaseSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f69180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f69181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f69182c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LimitDecreaseSheet((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LimitDecreaseSheet[i];
            }
        }

        public LimitDecreaseSheet(d maxCreditLimit, d minCreditLimit, d nonSelectableMinCreditLimit) {
            Intrinsics.checkNotNullParameter(maxCreditLimit, "maxCreditLimit");
            Intrinsics.checkNotNullParameter(minCreditLimit, "minCreditLimit");
            Intrinsics.checkNotNullParameter(nonSelectableMinCreditLimit, "nonSelectableMinCreditLimit");
            this.f69180a = maxCreditLimit;
            this.f69181b = minCreditLimit;
            this.f69182c = nonSelectableMinCreditLimit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LimitDecreaseSheet)) {
                return false;
            }
            LimitDecreaseSheet limitDecreaseSheet = (LimitDecreaseSheet) obj2;
            return Intrinsics.f(this.f69180a, limitDecreaseSheet.f69180a) && Intrinsics.f(this.f69181b, limitDecreaseSheet.f69181b) && Intrinsics.f(this.f69182c, limitDecreaseSheet.f69182c);
        }

        public final int hashCode() {
            return this.f69182c.hashCode() + v7.c(this.f69180a.hashCode() * 31, 31, this.f69181b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69180a);
            dest.writeSerializable(this.f69181b);
            dest.writeSerializable(this.f69182c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/credit_limit_cap/CreditLimitCapChangeScreenContract$ModalStep$LimitManagement;", "Lcom/revolut/feature/credit/card/impl/ui/credit_limit_cap/CreditLimitCapChangeScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LimitManagement extends CreditLimitCapChangeScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<LimitManagement> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f69183a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LimitManagement(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LimitManagement[i];
            }
        }

        public LimitManagement(boolean z) {
            this.f69183a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LimitManagement) && this.f69183a == ((LimitManagement) obj2).f69183a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f69183a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f69183a ? 1 : 0);
        }
    }

    private CreditLimitCapChangeScreenContract$ModalStep() {
    }
}
