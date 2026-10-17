package com.revolut.feature.three_ds_verification.impl.ui.sceen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.checkout.add_money_methods.api.model.AddMoneyMethod;
import com.revolut.feature.topup_screen.api.topup_limits.TopUpLimitUiModel;
import com.revolut.feature.topup_screen.common.CardDetails;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.kompot.navigable.flow.FlowStep;
import h93.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t61.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"com/revolut/feature/three_ds_verification/impl/ui/sceen/ThreeDsVerificationScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SelectAddMoneyMethod", "TopUpWithExistingCard", "TopUpWithGooglePay", "AddNewTopUpCard", "TopUpWithNewCard", "UnverifiedOwnerLimitValueDialog", "Lcom/revolut/feature/three_ds_verification/impl/ui/sceen/ThreeDsVerificationScreenContract$ModalStep$AddNewTopUpCard;", "Lcom/revolut/feature/three_ds_verification/impl/ui/sceen/ThreeDsVerificationScreenContract$ModalStep$SelectAddMoneyMethod;", "Lcom/revolut/feature/three_ds_verification/impl/ui/sceen/ThreeDsVerificationScreenContract$ModalStep$TopUpWithExistingCard;", "Lcom/revolut/feature/three_ds_verification/impl/ui/sceen/ThreeDsVerificationScreenContract$ModalStep$TopUpWithGooglePay;", "Lcom/revolut/feature/three_ds_verification/impl/ui/sceen/ThreeDsVerificationScreenContract$ModalStep$TopUpWithNewCard;", "Lcom/revolut/feature/three_ds_verification/impl/ui/sceen/ThreeDsVerificationScreenContract$ModalStep$UnverifiedOwnerLimitValueDialog;", "feature_three_ds_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ThreeDsVerificationScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/three_ds_verification/impl/ui/sceen/ThreeDsVerificationScreenContract$ModalStep$AddNewTopUpCard;", "Lcom/revolut/feature/three_ds_verification/impl/ui/sceen/ThreeDsVerificationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_three_ds_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddNewTopUpCard implements ThreeDsVerificationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AddNewTopUpCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f90408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TopUpTarget f90409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f90410c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddNewTopUpCard((dj0.d) parcel.readSerializable(), (TopUpTarget) parcel.readParcelable(AddNewTopUpCard.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddNewTopUpCard[i];
            }
        }

        public AddNewTopUpCard(dj0.d requiredAmount, TopUpTarget topUpTarget, String str) {
            Intrinsics.checkNotNullParameter(requiredAmount, "requiredAmount");
            Intrinsics.checkNotNullParameter(topUpTarget, "topUpTarget");
            this.f90408a = requiredAmount;
            this.f90409b = topUpTarget;
            this.f90410c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AddNewTopUpCard)) {
                return false;
            }
            AddNewTopUpCard addNewTopUpCard = (AddNewTopUpCard) obj2;
            return Intrinsics.f(this.f90408a, addNewTopUpCard.f90408a) && Intrinsics.f(this.f90409b, addNewTopUpCard.f90409b) && Intrinsics.f(this.f90410c, addNewTopUpCard.f90410c);
        }

        public final int hashCode() {
            int iHashCode = (this.f90409b.hashCode() + (this.f90408a.hashCode() * 31)) * 31;
            String str = this.f90410c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90408a);
            dest.writeParcelable(this.f90409b, i);
            dest.writeString(this.f90410c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/three_ds_verification/impl/ui/sceen/ThreeDsVerificationScreenContract$ModalStep$SelectAddMoneyMethod;", "Lcom/revolut/feature/three_ds_verification/impl/ui/sceen/ThreeDsVerificationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_three_ds_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectAddMoneyMethod implements ThreeDsVerificationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SelectAddMoneyMethod> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f90411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f0 f90412b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AccountWrapper f90413c;
        public final AddMoneyMethod d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectAddMoneyMethod((dj0.d) parcel.readSerializable(), (f0) parcel.readSerializable(), (AccountWrapper) parcel.readParcelable(SelectAddMoneyMethod.class.getClassLoader()), (AddMoneyMethod) parcel.readParcelable(SelectAddMoneyMethod.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectAddMoneyMethod[i];
            }
        }

        public SelectAddMoneyMethod(dj0.d requiredAmount, f0 card, AccountWrapper targetAccount, AddMoneyMethod addMoneyMethod) {
            Intrinsics.checkNotNullParameter(requiredAmount, "requiredAmount");
            Intrinsics.checkNotNullParameter(card, "card");
            Intrinsics.checkNotNullParameter(targetAccount, "targetAccount");
            this.f90411a = requiredAmount;
            this.f90412b = card;
            this.f90413c = targetAccount;
            this.d = addMoneyMethod;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelectAddMoneyMethod)) {
                return false;
            }
            SelectAddMoneyMethod selectAddMoneyMethod = (SelectAddMoneyMethod) obj2;
            return Intrinsics.f(this.f90411a, selectAddMoneyMethod.f90411a) && Intrinsics.f(this.f90412b, selectAddMoneyMethod.f90412b) && Intrinsics.f(this.f90413c, selectAddMoneyMethod.f90413c) && Intrinsics.f(this.d, selectAddMoneyMethod.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f90413c.hashCode() + ((this.f90412b.hashCode() + (this.f90411a.hashCode() * 31)) * 31)) * 31;
            AddMoneyMethod addMoneyMethod = this.d;
            return iHashCode + (addMoneyMethod == null ? 0 : addMoneyMethod.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90411a);
            dest.writeSerializable(this.f90412b);
            dest.writeParcelable(this.f90413c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/three_ds_verification/impl/ui/sceen/ThreeDsVerificationScreenContract$ModalStep$TopUpWithExistingCard;", "Lcom/revolut/feature/three_ds_verification/impl/ui/sceen/ThreeDsVerificationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_three_ds_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TopUpWithExistingCard implements ThreeDsVerificationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TopUpWithExistingCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f90414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TopUpTarget f90416c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TopUpWithExistingCard((TopUpTarget) parcel.readParcelable(TopUpWithExistingCard.class.getClassLoader()), (dj0.d) parcel.readSerializable(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TopUpWithExistingCard[i];
            }
        }

        public TopUpWithExistingCard(TopUpTarget topUpTarget, dj0.d requiredAmount, String cardId, String str) {
            Intrinsics.checkNotNullParameter(requiredAmount, "requiredAmount");
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            Intrinsics.checkNotNullParameter(topUpTarget, "topUpTarget");
            this.f90414a = requiredAmount;
            this.f90415b = cardId;
            this.f90416c = topUpTarget;
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
            if (!(obj2 instanceof TopUpWithExistingCard)) {
                return false;
            }
            TopUpWithExistingCard topUpWithExistingCard = (TopUpWithExistingCard) obj2;
            return Intrinsics.f(this.f90414a, topUpWithExistingCard.f90414a) && Intrinsics.f(this.f90415b, topUpWithExistingCard.f90415b) && Intrinsics.f(this.f90416c, topUpWithExistingCard.f90416c) && Intrinsics.f(this.d, topUpWithExistingCard.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f90416c.hashCode() + p.a.c(this.f90414a.hashCode() * 31, 31, this.f90415b)) * 31;
            String str = this.d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90414a);
            dest.writeString(this.f90415b);
            dest.writeParcelable(this.f90416c, i);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/three_ds_verification/impl/ui/sceen/ThreeDsVerificationScreenContract$ModalStep$TopUpWithGooglePay;", "Lcom/revolut/feature/three_ds_verification/impl/ui/sceen/ThreeDsVerificationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_three_ds_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TopUpWithGooglePay implements ThreeDsVerificationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TopUpWithGooglePay> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f90417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TopUpTarget f90418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f90419c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TopUpWithGooglePay((dj0.d) parcel.readSerializable(), (TopUpTarget) parcel.readParcelable(TopUpWithGooglePay.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TopUpWithGooglePay[i];
            }
        }

        public TopUpWithGooglePay(dj0.d requiredAmount, TopUpTarget topUpTarget, String str) {
            Intrinsics.checkNotNullParameter(requiredAmount, "requiredAmount");
            Intrinsics.checkNotNullParameter(topUpTarget, "topUpTarget");
            this.f90417a = requiredAmount;
            this.f90418b = topUpTarget;
            this.f90419c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TopUpWithGooglePay)) {
                return false;
            }
            TopUpWithGooglePay topUpWithGooglePay = (TopUpWithGooglePay) obj2;
            return Intrinsics.f(this.f90417a, topUpWithGooglePay.f90417a) && Intrinsics.f(this.f90418b, topUpWithGooglePay.f90418b) && Intrinsics.f(this.f90419c, topUpWithGooglePay.f90419c);
        }

        public final int hashCode() {
            int iHashCode = (this.f90418b.hashCode() + (this.f90417a.hashCode() * 31)) * 31;
            String str = this.f90419c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90417a);
            dest.writeParcelable(this.f90418b, i);
            dest.writeString(this.f90419c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/three_ds_verification/impl/ui/sceen/ThreeDsVerificationScreenContract$ModalStep$TopUpWithNewCard;", "Lcom/revolut/feature/three_ds_verification/impl/ui/sceen/ThreeDsVerificationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_three_ds_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TopUpWithNewCard implements ThreeDsVerificationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TopUpWithNewCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f90420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CardDetails f90421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final yte.a f90422c;
        public final j d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Boolean f90423g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final TopUpTarget f90424h;
        public final String i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                dj0.d dVar = (dj0.d) parcel.readSerializable();
                CardDetails cardDetails = (CardDetails) parcel.readParcelable(TopUpWithNewCard.class.getClassLoader());
                yte.a aVarValueOf = yte.a.valueOf(parcel.readString());
                j jVar = (j) parcel.readSerializable();
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new TopUpWithNewCard(dVar, cardDetails, aVarValueOf, jVar, string, string2, boolValueOf, (TopUpTarget) parcel.readParcelable(TopUpWithNewCard.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TopUpWithNewCard[i];
            }
        }

        public TopUpWithNewCard(dj0.d requiredAmount, CardDetails cardDetails, yte.a addCardMode, j issuer, String str, String str2, Boolean bool, TopUpTarget topUpTarget, String str3) {
            Intrinsics.checkNotNullParameter(requiredAmount, "requiredAmount");
            Intrinsics.checkNotNullParameter(cardDetails, "cardDetails");
            Intrinsics.checkNotNullParameter(addCardMode, "addCardMode");
            Intrinsics.checkNotNullParameter(issuer, "issuer");
            Intrinsics.checkNotNullParameter(topUpTarget, "topUpTarget");
            this.f90420a = requiredAmount;
            this.f90421b = cardDetails;
            this.f90422c = addCardMode;
            this.d = issuer;
            this.e = str;
            this.f = str2;
            this.f90423g = bool;
            this.f90424h = topUpTarget;
            this.i = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TopUpWithNewCard)) {
                return false;
            }
            TopUpWithNewCard topUpWithNewCard = (TopUpWithNewCard) obj2;
            return Intrinsics.f(this.f90420a, topUpWithNewCard.f90420a) && Intrinsics.f(this.f90421b, topUpWithNewCard.f90421b) && this.f90422c == topUpWithNewCard.f90422c && Intrinsics.f(this.d, topUpWithNewCard.d) && Intrinsics.f(this.e, topUpWithNewCard.e) && Intrinsics.f(this.f, topUpWithNewCard.f) && Intrinsics.f(this.f90423g, topUpWithNewCard.f90423g) && Intrinsics.f(this.f90424h, topUpWithNewCard.f90424h) && Intrinsics.f(this.i, topUpWithNewCard.i);
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + ((this.f90422c.hashCode() + ((this.f90421b.hashCode() + (this.f90420a.hashCode() * 31)) * 31)) * 31)) * 31;
            String str = this.e;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.f90423g;
            int iHashCode4 = (this.f90424h.hashCode() + ((iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
            String str3 = this.i;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90420a);
            dest.writeParcelable(this.f90421b, i);
            dest.writeString(this.f90422c.name());
            dest.writeSerializable(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
            Boolean bool = this.f90423g;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool);
            }
            dest.writeParcelable(this.f90424h, i);
            dest.writeString(this.i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/three_ds_verification/impl/ui/sceen/ThreeDsVerificationScreenContract$ModalStep$UnverifiedOwnerLimitValueDialog;", "Lcom/revolut/feature/three_ds_verification/impl/ui/sceen/ThreeDsVerificationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_three_ds_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnverifiedOwnerLimitValueDialog implements ThreeDsVerificationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<UnverifiedOwnerLimitValueDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TopUpLimitUiModel f90425a;

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
            this.f90425a = limit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UnverifiedOwnerLimitValueDialog) && Intrinsics.f(this.f90425a, ((UnverifiedOwnerLimitValueDialog) obj2).f90425a);
        }

        public final int hashCode() {
            return this.f90425a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90425a, i);
        }
    }
}
