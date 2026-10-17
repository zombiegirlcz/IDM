package com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.bank_transfer.models.PaymentVendor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:.\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./\u0082\u0001.0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]¨\u0006^À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "Landroid/os/Parcelable;", "AddNewRecipient", "FavoritePaymentVendor", "AllPaymentVendors", "BankRecipient", "AddBankRecipient", "AddMobileWalletRecipient", "CardRecipient", "AddCardRecipient", "CheckRecipient", "AddCheckRecipient", "NewCryptoAddress", "AddNewCryptoAddress", "Group", "CreateGroup", "AddContact", "AddFriend", "SearchAddFriend", "Remittance", "PaymentLink", "PermissionContact", "CharityDonation", "CharityList", "QrCode", "ApmAani", "ApmBizum", "ApmBlik", "ApmBreb", "ApmIris", "ApmMultibanco", "ApmMultibancoViaVerde", "ApmPayId", "ApmPix", "ApmQvik", "ApmQvikSecId", "ApmSpin", "ApmUpi", "ApmWero", "PayBillsTaxes", "PhoneTopUps", "ApmBillsBpay", "ApmBillsF24", "ApmBillsPagoPA", "ApmPostalCheck", "GiroDirectDebits", "MasavDirectDebits", "Alipay", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$AddBankRecipient;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$AddCardRecipient;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$AddCheckRecipient;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$AddContact;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$AddFriend;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$AddMobileWalletRecipient;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$AddNewCryptoAddress;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$AddNewRecipient;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$Alipay;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$AllPaymentVendors;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmAani;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmBillsBpay;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmBillsF24;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmBillsPagoPA;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmBizum;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmBlik;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmBreb;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmIris;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmMultibanco;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmMultibancoViaVerde;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmPayId;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmPix;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmPostalCheck;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmQvik;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmQvikSecId;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmSpin;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmUpi;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmWero;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$BankRecipient;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$CardRecipient;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$CharityDonation;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$CharityList;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$CheckRecipient;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$CreateGroup;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$FavoritePaymentVendor;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$GiroDirectDebits;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$Group;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$MasavDirectDebits;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$NewCryptoAddress;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$PayBillsTaxes;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$PaymentLink;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$PermissionContact;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$PhoneTopUps;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$QrCode;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$Remittance;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$SearchAddFriend;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WhoToTransferActionItem extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$AddBankRecipient;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddBankRecipient implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddBankRecipient f80057a = new AddBankRecipient();

        @NotNull
        public static final Parcelable.Creator<AddBankRecipient> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddBankRecipient.f80057a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddBankRecipient[i];
            }
        }

        private AddBankRecipient() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$AddCardRecipient;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddCardRecipient implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddCardRecipient f80058a = new AddCardRecipient();

        @NotNull
        public static final Parcelable.Creator<AddCardRecipient> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddCardRecipient.f80058a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddCardRecipient[i];
            }
        }

        private AddCardRecipient() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$AddCheckRecipient;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddCheckRecipient implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddCheckRecipient f80059a = new AddCheckRecipient();

        @NotNull
        public static final Parcelable.Creator<AddCheckRecipient> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddCheckRecipient.f80059a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddCheckRecipient[i];
            }
        }

        private AddCheckRecipient() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$AddContact;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddContact implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddContact f80060a = new AddContact();

        @NotNull
        public static final Parcelable.Creator<AddContact> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddContact.f80060a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddContact[i];
            }
        }

        private AddContact() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$AddFriend;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddFriend implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddFriend f80061a = new AddFriend();

        @NotNull
        public static final Parcelable.Creator<AddFriend> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddFriend.f80061a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddFriend[i];
            }
        }

        private AddFriend() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$AddMobileWalletRecipient;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddMobileWalletRecipient implements WhoToTransferActionItem {

        @NotNull
        public static final Parcelable.Creator<AddMobileWalletRecipient> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentVendor f80062a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddMobileWalletRecipient((PaymentVendor) parcel.readParcelable(AddMobileWalletRecipient.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddMobileWalletRecipient[i];
            }
        }

        public AddMobileWalletRecipient(PaymentVendor paymentVendor) {
            Intrinsics.checkNotNullParameter(paymentVendor, "paymentVendor");
            this.f80062a = paymentVendor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddMobileWalletRecipient) && Intrinsics.f(this.f80062a, ((AddMobileWalletRecipient) obj2).f80062a);
        }

        public final int hashCode() {
            return this.f80062a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80062a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$AddNewCryptoAddress;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddNewCryptoAddress implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddNewCryptoAddress f80063a = new AddNewCryptoAddress();

        @NotNull
        public static final Parcelable.Creator<AddNewCryptoAddress> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddNewCryptoAddress.f80063a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddNewCryptoAddress[i];
            }
        }

        private AddNewCryptoAddress() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$AddNewRecipient;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddNewRecipient implements WhoToTransferActionItem {

        @NotNull
        public static final Parcelable.Creator<AddNewRecipient> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f80064a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(AddNewRecipient.class, parcel, arrayList, iE, 1);
                }
                return new AddNewRecipient(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddNewRecipient[i];
            }
        }

        public AddNewRecipient(List actionItems) {
            Intrinsics.checkNotNullParameter(actionItems, "actionItems");
            this.f80064a = actionItems;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddNewRecipient) && Intrinsics.f(this.f80064a, ((AddNewRecipient) obj2).f80064a);
        }

        public final int hashCode() {
            return this.f80064a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f80064a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$Alipay;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Alipay implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Alipay f80065a = new Alipay();

        @NotNull
        public static final Parcelable.Creator<Alipay> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Alipay.f80065a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Alipay[i];
            }
        }

        private Alipay() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$AllPaymentVendors;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AllPaymentVendors implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AllPaymentVendors f80066a = new AllPaymentVendors();

        @NotNull
        public static final Parcelable.Creator<AllPaymentVendors> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AllPaymentVendors.f80066a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AllPaymentVendors[i];
            }
        }

        private AllPaymentVendors() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmAani;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmAani implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmAani f80067a = new ApmAani();

        @NotNull
        public static final Parcelable.Creator<ApmAani> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmAani.f80067a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmAani[i];
            }
        }

        private ApmAani() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmBillsBpay;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmBillsBpay implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmBillsBpay f80068a = new ApmBillsBpay();

        @NotNull
        public static final Parcelable.Creator<ApmBillsBpay> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmBillsBpay.f80068a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmBillsBpay[i];
            }
        }

        private ApmBillsBpay() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmBillsF24;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmBillsF24 implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmBillsF24 f80069a = new ApmBillsF24();

        @NotNull
        public static final Parcelable.Creator<ApmBillsF24> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmBillsF24.f80069a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmBillsF24[i];
            }
        }

        private ApmBillsF24() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmBillsPagoPA;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmBillsPagoPA implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmBillsPagoPA f80070a = new ApmBillsPagoPA();

        @NotNull
        public static final Parcelable.Creator<ApmBillsPagoPA> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmBillsPagoPA.f80070a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmBillsPagoPA[i];
            }
        }

        private ApmBillsPagoPA() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmBizum;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmBizum implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmBizum f80071a = new ApmBizum();

        @NotNull
        public static final Parcelable.Creator<ApmBizum> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmBizum.f80071a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmBizum[i];
            }
        }

        private ApmBizum() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmBlik;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmBlik implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmBlik f80072a = new ApmBlik();

        @NotNull
        public static final Parcelable.Creator<ApmBlik> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmBlik.f80072a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmBlik[i];
            }
        }

        private ApmBlik() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmBreb;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmBreb implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmBreb f80073a = new ApmBreb();

        @NotNull
        public static final Parcelable.Creator<ApmBreb> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmBreb.f80073a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmBreb[i];
            }
        }

        private ApmBreb() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmIris;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmIris implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmIris f80074a = new ApmIris();

        @NotNull
        public static final Parcelable.Creator<ApmIris> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmIris.f80074a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmIris[i];
            }
        }

        private ApmIris() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmMultibanco;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmMultibanco implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmMultibanco f80075a = new ApmMultibanco();

        @NotNull
        public static final Parcelable.Creator<ApmMultibanco> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmMultibanco.f80075a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmMultibanco[i];
            }
        }

        private ApmMultibanco() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmMultibancoViaVerde;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmMultibancoViaVerde implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmMultibancoViaVerde f80076a = new ApmMultibancoViaVerde();

        @NotNull
        public static final Parcelable.Creator<ApmMultibancoViaVerde> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmMultibancoViaVerde.f80076a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmMultibancoViaVerde[i];
            }
        }

        private ApmMultibancoViaVerde() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmPayId;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmPayId implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmPayId f80077a = new ApmPayId();

        @NotNull
        public static final Parcelable.Creator<ApmPayId> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmPayId.f80077a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmPayId[i];
            }
        }

        private ApmPayId() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmPix;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmPix implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmPix f80078a = new ApmPix();

        @NotNull
        public static final Parcelable.Creator<ApmPix> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmPix.f80078a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmPix[i];
            }
        }

        private ApmPix() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmPostalCheck;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmPostalCheck implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmPostalCheck f80079a = new ApmPostalCheck();

        @NotNull
        public static final Parcelable.Creator<ApmPostalCheck> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmPostalCheck.f80079a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmPostalCheck[i];
            }
        }

        private ApmPostalCheck() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmQvik;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmQvik implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmQvik f80080a = new ApmQvik();

        @NotNull
        public static final Parcelable.Creator<ApmQvik> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmQvik.f80080a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmQvik[i];
            }
        }

        private ApmQvik() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmQvikSecId;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmQvikSecId implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmQvikSecId f80081a = new ApmQvikSecId();

        @NotNull
        public static final Parcelable.Creator<ApmQvikSecId> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmQvikSecId.f80081a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmQvikSecId[i];
            }
        }

        private ApmQvikSecId() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmSpin;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmSpin implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmSpin f80082a = new ApmSpin();

        @NotNull
        public static final Parcelable.Creator<ApmSpin> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmSpin.f80082a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmSpin[i];
            }
        }

        private ApmSpin() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmUpi;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmUpi implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmUpi f80083a = new ApmUpi();

        @NotNull
        public static final Parcelable.Creator<ApmUpi> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmUpi.f80083a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmUpi[i];
            }
        }

        private ApmUpi() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$ApmWero;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmWero implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmWero f80084a = new ApmWero();

        @NotNull
        public static final Parcelable.Creator<ApmWero> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmWero.f80084a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmWero[i];
            }
        }

        private ApmWero() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$BankRecipient;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BankRecipient implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BankRecipient f80085a = new BankRecipient();

        @NotNull
        public static final Parcelable.Creator<BankRecipient> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BankRecipient.f80085a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BankRecipient[i];
            }
        }

        private BankRecipient() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$CardRecipient;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CardRecipient implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CardRecipient f80086a = new CardRecipient();

        @NotNull
        public static final Parcelable.Creator<CardRecipient> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CardRecipient.f80086a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardRecipient[i];
            }
        }

        private CardRecipient() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$CharityDonation;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CharityDonation implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CharityDonation f80087a = new CharityDonation();

        @NotNull
        public static final Parcelable.Creator<CharityDonation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CharityDonation.f80087a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CharityDonation[i];
            }
        }

        private CharityDonation() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$CharityList;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CharityList implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CharityList f80088a = new CharityList();

        @NotNull
        public static final Parcelable.Creator<CharityList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CharityList.f80088a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CharityList[i];
            }
        }

        private CharityList() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$CheckRecipient;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CheckRecipient implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CheckRecipient f80089a = new CheckRecipient();

        @NotNull
        public static final Parcelable.Creator<CheckRecipient> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CheckRecipient.f80089a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CheckRecipient[i];
            }
        }

        private CheckRecipient() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$CreateGroup;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreateGroup implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreateGroup f80090a = new CreateGroup();

        @NotNull
        public static final Parcelable.Creator<CreateGroup> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreateGroup.f80090a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateGroup[i];
            }
        }

        private CreateGroup() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$FavoritePaymentVendor;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FavoritePaymentVendor implements WhoToTransferActionItem {

        @NotNull
        public static final Parcelable.Creator<FavoritePaymentVendor> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentVendor f80091a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FavoritePaymentVendor((PaymentVendor) parcel.readParcelable(FavoritePaymentVendor.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FavoritePaymentVendor[i];
            }
        }

        public FavoritePaymentVendor(PaymentVendor paymentVendor) {
            Intrinsics.checkNotNullParameter(paymentVendor, "paymentVendor");
            this.f80091a = paymentVendor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FavoritePaymentVendor) && Intrinsics.f(this.f80091a, ((FavoritePaymentVendor) obj2).f80091a);
        }

        public final int hashCode() {
            return this.f80091a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80091a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$GiroDirectDebits;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GiroDirectDebits implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GiroDirectDebits f80092a = new GiroDirectDebits();

        @NotNull
        public static final Parcelable.Creator<GiroDirectDebits> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiroDirectDebits.f80092a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiroDirectDebits[i];
            }
        }

        private GiroDirectDebits() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$Group;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Group implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Group f80093a = new Group();

        @NotNull
        public static final Parcelable.Creator<Group> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Group.f80093a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Group[i];
            }
        }

        private Group() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$MasavDirectDebits;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MasavDirectDebits implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MasavDirectDebits f80094a = new MasavDirectDebits();

        @NotNull
        public static final Parcelable.Creator<MasavDirectDebits> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MasavDirectDebits.f80094a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MasavDirectDebits[i];
            }
        }

        private MasavDirectDebits() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$NewCryptoAddress;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NewCryptoAddress implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewCryptoAddress f80095a = new NewCryptoAddress();

        @NotNull
        public static final Parcelable.Creator<NewCryptoAddress> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NewCryptoAddress.f80095a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewCryptoAddress[i];
            }
        }

        private NewCryptoAddress() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$PayBillsTaxes;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PayBillsTaxes implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PayBillsTaxes f80096a = new PayBillsTaxes();

        @NotNull
        public static final Parcelable.Creator<PayBillsTaxes> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PayBillsTaxes.f80096a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PayBillsTaxes[i];
            }
        }

        private PayBillsTaxes() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$PaymentLink;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PaymentLink implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PaymentLink f80097a = new PaymentLink();

        @NotNull
        public static final Parcelable.Creator<PaymentLink> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PaymentLink.f80097a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentLink[i];
            }
        }

        private PaymentLink() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$PermissionContact;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PermissionContact implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PermissionContact f80098a = new PermissionContact();

        @NotNull
        public static final Parcelable.Creator<PermissionContact> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PermissionContact.f80098a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PermissionContact[i];
            }
        }

        private PermissionContact() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$PhoneTopUps;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PhoneTopUps implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PhoneTopUps f80099a = new PhoneTopUps();

        @NotNull
        public static final Parcelable.Creator<PhoneTopUps> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PhoneTopUps.f80099a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PhoneTopUps[i];
            }
        }

        private PhoneTopUps() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$QrCode;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class QrCode implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final QrCode f80100a = new QrCode();

        @NotNull
        public static final Parcelable.Creator<QrCode> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return QrCode.f80100a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QrCode[i];
            }
        }

        private QrCode() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$Remittance;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Remittance implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Remittance f80101a = new Remittance();

        @NotNull
        public static final Parcelable.Creator<Remittance> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Remittance.f80101a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Remittance[i];
            }
        }

        private Remittance() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem$SearchAddFriend;", "Lcom/revolut/feature/payments/who_to_transfer/impl/common/transfer_action/WhoToTransferActionItem;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SearchAddFriend implements WhoToTransferActionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SearchAddFriend f80102a = new SearchAddFriend();

        @NotNull
        public static final Parcelable.Creator<SearchAddFriend> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SearchAddFriend.f80102a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SearchAddFriend[i];
            }
        }

        private SearchAddFriend() {
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
