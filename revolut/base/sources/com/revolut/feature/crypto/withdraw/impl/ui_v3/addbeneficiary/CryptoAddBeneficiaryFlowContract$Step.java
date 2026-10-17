package com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/CryptoAddBeneficiaryFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Restricted", "CreateBeneficiary", "Address", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/CryptoAddBeneficiaryFlowContract$Step$Address;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/CryptoAddBeneficiaryFlowContract$Step$CreateBeneficiary;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/CryptoAddBeneficiaryFlowContract$Step$Restricted;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoAddBeneficiaryFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/CryptoAddBeneficiaryFlowContract$Step$Address;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/CryptoAddBeneficiaryFlowContract$Step;", "<init>", "()V", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Address implements CryptoAddBeneficiaryFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Address f71214a = new Address();

        @NotNull
        public static final Parcelable.Creator<Address> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Address.f71214a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Address[i];
            }
        }

        private Address() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/CryptoAddBeneficiaryFlowContract$Step$CreateBeneficiary;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/CryptoAddBeneficiaryFlowContract$Step;", "<init>", "()V", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreateBeneficiary implements CryptoAddBeneficiaryFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreateBeneficiary f71215a = new CreateBeneficiary();

        @NotNull
        public static final Parcelable.Creator<CreateBeneficiary> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreateBeneficiary.f71215a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateBeneficiary[i];
            }
        }

        private CreateBeneficiary() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/CryptoAddBeneficiaryFlowContract$Step$Restricted;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/CryptoAddBeneficiaryFlowContract$Step;", "<init>", "()V", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Restricted implements CryptoAddBeneficiaryFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Restricted f71216a = new Restricted();

        @NotNull
        public static final Parcelable.Creator<Restricted> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Restricted.f71216a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Restricted[i];
            }
        }

        private Restricted() {
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
