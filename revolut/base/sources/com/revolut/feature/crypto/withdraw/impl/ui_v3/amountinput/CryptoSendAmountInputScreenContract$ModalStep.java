package com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review.CryptoWithdrawToAddressReviewContract$BlockchainWithFee;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.bottom_sheet.limit_exceeded.CryptoSendLimitExceededBottomSheetControllerContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.balance.picker.api.navigation.DualChooserContract$InputData;
import ehe.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"com/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "NetworkPicker", "MindTheNetwork", "DualChooser", "BalanceChooser", "ActivatePocket", "AddressBelongsToYou", "AdditionalInfoRequired", "ThousandEuroLimitExceeded", "LimitExceeded", "MeshValidation", "ScaValidation", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep$ActivatePocket;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep$AdditionalInfoRequired;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep$AddressBelongsToYou;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep$BalanceChooser;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep$DualChooser;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep$LimitExceeded;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep$MeshValidation;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep$MindTheNetwork;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep$NetworkPicker;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep$ScaValidation;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep$ThousandEuroLimitExceeded;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoSendAmountInputScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep$ActivatePocket;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActivatePocket implements CryptoSendAmountInputScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ActivatePocket> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io3.d f71243a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ActivatePocket((io3.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActivatePocket[i];
            }
        }

        public ActivatePocket(io3.d pocket) {
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            this.f71243a = pocket;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ActivatePocket) && Intrinsics.f(this.f71243a, ((ActivatePocket) obj2).f71243a);
        }

        public final int hashCode() {
            return this.f71243a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f71243a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep$AdditionalInfoRequired;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdditionalInfoRequired implements CryptoSendAmountInputScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AdditionalInfoRequired> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CryptoAddress f71244a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AdditionalInfoRequired((CryptoAddress) parcel.readParcelable(AdditionalInfoRequired.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdditionalInfoRequired[i];
            }
        }

        public AdditionalInfoRequired(CryptoAddress beneficiary) {
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.f71244a = beneficiary;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AdditionalInfoRequired) && Intrinsics.f(this.f71244a, ((AdditionalInfoRequired) obj2).f71244a);
        }

        public final int hashCode() {
            return this.f71244a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f71244a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep$AddressBelongsToYou;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddressBelongsToYou implements CryptoSendAmountInputScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AddressBelongsToYou> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71245a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddressBelongsToYou(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddressBelongsToYou[i];
            }
        }

        public AddressBelongsToYou(String beneficiaryId) {
            Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
            this.f71245a = beneficiaryId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddressBelongsToYou) && Intrinsics.f(this.f71245a, ((AddressBelongsToYou) obj2).f71245a);
        }

        public final int hashCode() {
            return this.f71245a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71245a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep$BalanceChooser;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BalanceChooser implements CryptoSendAmountInputScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BalanceChooser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f71246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f71247b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                xi0.b bVar = (xi0.b) parcel.readSerializable();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iA = 0;
                while (iA != i) {
                    iA = o.a(parcel, linkedHashSet, iA, 1);
                }
                return new BalanceChooser(linkedHashSet, bVar);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BalanceChooser[i];
            }
        }

        public BalanceChooser(Set supportedCurrencies, xi0.b pocketCurrency) {
            Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
            Intrinsics.checkNotNullParameter(supportedCurrencies, "supportedCurrencies");
            this.f71246a = pocketCurrency;
            this.f71247b = supportedCurrencies;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BalanceChooser)) {
                return false;
            }
            BalanceChooser balanceChooser = (BalanceChooser) obj2;
            return Intrinsics.f(this.f71246a, balanceChooser.f71246a) && Intrinsics.f(this.f71247b, balanceChooser.f71247b);
        }

        public final int hashCode() {
            return this.f71247b.hashCode() + (this.f71246a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f71246a);
            Iterator itV = n.v(this.f71247b, dest);
            while (itV.hasNext()) {
                dest.writeString((String) itV.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep$DualChooser;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DualChooser implements CryptoSendAmountInputScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DualChooser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DualChooserContract$InputData f71248a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DualChooser((DualChooserContract$InputData) parcel.readParcelable(DualChooser.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DualChooser[i];
            }
        }

        public DualChooser(DualChooserContract$InputData input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f71248a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DualChooser) && Intrinsics.f(this.f71248a, ((DualChooser) obj2).f71248a);
        }

        public final int hashCode() {
            return this.f71248a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f71248a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep$LimitExceeded;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LimitExceeded implements CryptoSendAmountInputScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<LimitExceeded> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CryptoSendLimitExceededBottomSheetControllerContract$InputData f71249a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LimitExceeded(CryptoSendLimitExceededBottomSheetControllerContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LimitExceeded[i];
            }
        }

        public LimitExceeded(CryptoSendLimitExceededBottomSheetControllerContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f71249a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LimitExceeded) && Intrinsics.f(this.f71249a, ((LimitExceeded) obj2).f71249a);
        }

        public final int hashCode() {
            return this.f71249a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f71249a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep$MeshValidation;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MeshValidation implements CryptoSendAmountInputScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<MeshValidation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71250a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MeshValidation(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MeshValidation[i];
            }
        }

        public MeshValidation(String counterpartyId) {
            Intrinsics.checkNotNullParameter(counterpartyId, "counterpartyId");
            this.f71250a = counterpartyId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MeshValidation) && Intrinsics.f(this.f71250a, ((MeshValidation) obj2).f71250a);
        }

        public final int hashCode() {
            return this.f71250a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71250a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep$MindTheNetwork;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MindTheNetwork implements CryptoSendAmountInputScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<MindTheNetwork> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f71251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wk5.a f71252b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MindTheNetwork(wk5.a.valueOf(parcel.readString()), (xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MindTheNetwork[i];
            }
        }

        public MindTheNetwork(wk5.a blockchain, xi0.b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(blockchain, "blockchain");
            this.f71251a = currency;
            this.f71252b = blockchain;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MindTheNetwork)) {
                return false;
            }
            MindTheNetwork mindTheNetwork = (MindTheNetwork) obj2;
            return Intrinsics.f(this.f71251a, mindTheNetwork.f71251a) && this.f71252b == mindTheNetwork.f71252b;
        }

        public final int hashCode() {
            return this.f71252b.hashCode() + (this.f71251a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f71251a);
            dest.writeString(this.f71252b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep$NetworkPicker;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NetworkPicker implements CryptoSendAmountInputScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<NetworkPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wk5.a f71253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f71254b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                wk5.a aVarValueOf = wk5.a.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(CryptoWithdrawToAddressReviewContract$BlockchainWithFee.CREATOR, parcel, arrayList, iA, 1);
                }
                return new NetworkPicker(arrayList, aVarValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NetworkPicker[i];
            }
        }

        public NetworkPicker(List availableBlockchainsWithFees, wk5.a selectedBlockchain) {
            Intrinsics.checkNotNullParameter(selectedBlockchain, "selectedBlockchain");
            Intrinsics.checkNotNullParameter(availableBlockchainsWithFees, "availableBlockchainsWithFees");
            this.f71253a = selectedBlockchain;
            this.f71254b = availableBlockchainsWithFees;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NetworkPicker)) {
                return false;
            }
            NetworkPicker networkPicker = (NetworkPicker) obj2;
            return this.f71253a == networkPicker.f71253a && Intrinsics.f(this.f71254b, networkPicker.f71254b);
        }

        public final int hashCode() {
            return this.f71254b.hashCode() + (this.f71253a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71253a.name());
            Iterator itV = p.a.v(this.f71254b, dest);
            while (itV.hasNext()) {
                ((CryptoWithdrawToAddressReviewContract$BlockchainWithFee) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep$ScaValidation;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ScaValidation implements CryptoSendAmountInputScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ScaValidation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71255a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ScaValidation(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ScaValidation[i];
            }
        }

        public ScaValidation(String legalEntityId) {
            Intrinsics.checkNotNullParameter(legalEntityId, "legalEntityId");
            this.f71255a = legalEntityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ScaValidation) && Intrinsics.f(this.f71255a, ((ScaValidation) obj2).f71255a);
        }

        public final int hashCode() {
            return this.f71255a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71255a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep$ThousandEuroLimitExceeded;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$ModalStep;", "<init>", "()V", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ThousandEuroLimitExceeded implements CryptoSendAmountInputScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ThousandEuroLimitExceeded f71256a = new ThousandEuroLimitExceeded();

        @NotNull
        public static final Parcelable.Creator<ThousandEuroLimitExceeded> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ThousandEuroLimitExceeded.f71256a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ThousandEuroLimitExceeded[i];
            }
        }

        private ThousandEuroLimitExceeded() {
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
