package com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import ip0.v7;
import java.math.BigDecimal;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/card/impl/ui/instalment/post_purchase/update/term/CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "EstimatedInterestInfo", "EstimatedDailyInterestInfo", "SelectTerm", "Confirm", "Lcom/revolut/feature/credit/card/impl/ui/instalment/post_purchase/update/term/CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep$Confirm;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/post_purchase/update/term/CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep$EstimatedDailyInterestInfo;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/post_purchase/update/term/CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep$EstimatedInterestInfo;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/post_purchase/update/term/CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep$SelectTerm;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/post_purchase/update/term/CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep$Confirm;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/post_purchase/update/term/CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirm implements CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Confirm> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f69421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f69422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f69423c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Confirm((d) parcel.readSerializable(), (d) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirm[i];
            }
        }

        public Confirm(d selectedDueAmount, d currentDueAmount, LocalDate dueDate) {
            Intrinsics.checkNotNullParameter(dueDate, "dueDate");
            Intrinsics.checkNotNullParameter(selectedDueAmount, "selectedDueAmount");
            Intrinsics.checkNotNullParameter(currentDueAmount, "currentDueAmount");
            this.f69421a = dueDate;
            this.f69422b = selectedDueAmount;
            this.f69423c = currentDueAmount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Confirm)) {
                return false;
            }
            Confirm confirm = (Confirm) obj2;
            return Intrinsics.f(this.f69421a, confirm.f69421a) && Intrinsics.f(this.f69422b, confirm.f69422b) && Intrinsics.f(this.f69423c, confirm.f69423c);
        }

        public final int hashCode() {
            return this.f69423c.hashCode() + v7.c(this.f69421a.hashCode() * 31, 31, this.f69422b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69421a);
            dest.writeSerializable(this.f69422b);
            dest.writeSerializable(this.f69423c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/post_purchase/update/term/CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep$EstimatedDailyInterestInfo;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/post_purchase/update/term/CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EstimatedDailyInterestInfo implements CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EstimatedDailyInterestInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f69424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigDecimal f69425b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EstimatedDailyInterestInfo((d) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EstimatedDailyInterestInfo[i];
            }
        }

        public EstimatedDailyInterestInfo(d dailyInterest, BigDecimal bigDecimal) {
            Intrinsics.checkNotNullParameter(dailyInterest, "dailyInterest");
            this.f69424a = dailyInterest;
            this.f69425b = bigDecimal;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EstimatedDailyInterestInfo)) {
                return false;
            }
            EstimatedDailyInterestInfo estimatedDailyInterestInfo = (EstimatedDailyInterestInfo) obj2;
            return Intrinsics.f(this.f69424a, estimatedDailyInterestInfo.f69424a) && Intrinsics.f(this.f69425b, estimatedDailyInterestInfo.f69425b);
        }

        public final int hashCode() {
            int iHashCode = this.f69424a.hashCode() * 31;
            BigDecimal bigDecimal = this.f69425b;
            return iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69424a);
            dest.writeSerializable(this.f69425b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/post_purchase/update/term/CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep$EstimatedInterestInfo;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/post_purchase/update/term/CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EstimatedInterestInfo implements CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EstimatedInterestInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f69426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigDecimal f69427b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EstimatedInterestInfo((d) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EstimatedInterestInfo[i];
            }
        }

        public EstimatedInterestInfo(d estimatedInterest, BigDecimal bigDecimal) {
            Intrinsics.checkNotNullParameter(estimatedInterest, "estimatedInterest");
            this.f69426a = estimatedInterest;
            this.f69427b = bigDecimal;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EstimatedInterestInfo)) {
                return false;
            }
            EstimatedInterestInfo estimatedInterestInfo = (EstimatedInterestInfo) obj2;
            return Intrinsics.f(this.f69426a, estimatedInterestInfo.f69426a) && Intrinsics.f(this.f69427b, estimatedInterestInfo.f69427b);
        }

        public final int hashCode() {
            int iHashCode = this.f69426a.hashCode() * 31;
            BigDecimal bigDecimal = this.f69427b;
            return iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69426a);
            dest.writeSerializable(this.f69427b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/post_purchase/update/term/CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep$SelectTerm;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/post_purchase/update/term/CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectTerm implements CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectTerm f69428a = new SelectTerm();

        @NotNull
        public static final Parcelable.Creator<SelectTerm> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectTerm.f69428a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectTerm[i];
            }
        }

        private SelectTerm() {
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
