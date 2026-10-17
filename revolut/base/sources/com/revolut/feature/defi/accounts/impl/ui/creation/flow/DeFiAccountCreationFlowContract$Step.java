package com.revolut.feature.defi.accounts.impl.ui.creation.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/defi/accounts/impl/ui/creation/flow/DeFiAccountCreationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Disclaimer", "Confirmation", "Lcom/revolut/feature/defi/accounts/impl/ui/creation/flow/DeFiAccountCreationFlowContract$Step$Confirmation;", "Lcom/revolut/feature/defi/accounts/impl/ui/creation/flow/DeFiAccountCreationFlowContract$Step$Disclaimer;", "feature_defi_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DeFiAccountCreationFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/defi/accounts/impl/ui/creation/flow/DeFiAccountCreationFlowContract$Step$Confirmation;", "Lcom/revolut/feature/defi/accounts/impl/ui/creation/flow/DeFiAccountCreationFlowContract$Step;", "<init>", "()V", "feature_defi_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Confirmation implements DeFiAccountCreationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Confirmation f71646a = new Confirmation();

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Confirmation.f71646a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirmation[i];
            }
        }

        private Confirmation() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/defi/accounts/impl/ui/creation/flow/DeFiAccountCreationFlowContract$Step$Disclaimer;", "Lcom/revolut/feature/defi/accounts/impl/ui/creation/flow/DeFiAccountCreationFlowContract$Step;", "<init>", "()V", "feature_defi_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Disclaimer implements DeFiAccountCreationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Disclaimer f71647a = new Disclaimer();

        @NotNull
        public static final Parcelable.Creator<Disclaimer> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Disclaimer.f71647a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Disclaimer[i];
            }
        }

        private Disclaimer() {
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
