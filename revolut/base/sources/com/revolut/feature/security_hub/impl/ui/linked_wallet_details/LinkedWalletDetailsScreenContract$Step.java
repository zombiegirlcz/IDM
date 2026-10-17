package com.revolut.feature.security_hub.impl.ui.linked_wallet_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/security_hub/impl/ui/linked_wallet_details/LinkedWalletDetailsScreenContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CancelCardBottomSheet", "RemoveLinkedMerchant", "Lcom/revolut/feature/security_hub/impl/ui/linked_wallet_details/LinkedWalletDetailsScreenContract$Step$CancelCardBottomSheet;", "Lcom/revolut/feature/security_hub/impl/ui/linked_wallet_details/LinkedWalletDetailsScreenContract$Step$RemoveLinkedMerchant;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LinkedWalletDetailsScreenContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/linked_wallet_details/LinkedWalletDetailsScreenContract$Step$CancelCardBottomSheet;", "Lcom/revolut/feature/security_hub/impl/ui/linked_wallet_details/LinkedWalletDetailsScreenContract$Step;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CancelCardBottomSheet implements LinkedWalletDetailsScreenContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CancelCardBottomSheet f85594a = new CancelCardBottomSheet();

        @NotNull
        public static final Parcelable.Creator<CancelCardBottomSheet> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CancelCardBottomSheet.f85594a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelCardBottomSheet[i];
            }
        }

        private CancelCardBottomSheet() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/linked_wallet_details/LinkedWalletDetailsScreenContract$Step$RemoveLinkedMerchant;", "Lcom/revolut/feature/security_hub/impl/ui/linked_wallet_details/LinkedWalletDetailsScreenContract$Step;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoveLinkedMerchant implements LinkedWalletDetailsScreenContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RemoveLinkedMerchant f85595a = new RemoveLinkedMerchant();

        @NotNull
        public static final Parcelable.Creator<RemoveLinkedMerchant> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RemoveLinkedMerchant.f85595a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RemoveLinkedMerchant[i];
            }
        }

        private RemoveLinkedMerchant() {
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
