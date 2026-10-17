package com.revolut.feature.pay_with_smile.impl.ui.settings;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/pay_with_smile/impl/ui/settings/PayWithSmileSettingsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ChangePasscode", "ConfirmOptOut", "Lcom/revolut/feature/pay_with_smile/impl/ui/settings/PayWithSmileSettingsScreenContract$ModalStep$ChangePasscode;", "Lcom/revolut/feature/pay_with_smile/impl/ui/settings/PayWithSmileSettingsScreenContract$ModalStep$ConfirmOptOut;", "feature_pay_with_smile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PayWithSmileSettingsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/pay_with_smile/impl/ui/settings/PayWithSmileSettingsScreenContract$ModalStep$ChangePasscode;", "Lcom/revolut/feature/pay_with_smile/impl/ui/settings/PayWithSmileSettingsScreenContract$ModalStep;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_pay_with_smile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChangePasscode implements PayWithSmileSettingsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChangePasscode f78981a = new ChangePasscode();

        @NotNull
        public static final Parcelable.Creator<ChangePasscode> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChangePasscode.f78981a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangePasscode[i];
            }
        }

        private ChangePasscode() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof ChangePasscode);
        }

        public final int hashCode() {
            return 13181643;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/pay_with_smile/impl/ui/settings/PayWithSmileSettingsScreenContract$ModalStep$ConfirmOptOut;", "Lcom/revolut/feature/pay_with_smile/impl/ui/settings/PayWithSmileSettingsScreenContract$ModalStep;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_pay_with_smile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmOptOut implements PayWithSmileSettingsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConfirmOptOut f78982a = new ConfirmOptOut();

        @NotNull
        public static final Parcelable.Creator<ConfirmOptOut> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ConfirmOptOut.f78982a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmOptOut[i];
            }
        }

        private ConfirmOptOut() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof ConfirmOptOut);
        }

        public final int hashCode() {
            return 793677150;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
