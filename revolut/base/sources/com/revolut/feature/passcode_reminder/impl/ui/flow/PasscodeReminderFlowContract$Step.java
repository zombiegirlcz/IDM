package com.revolut.feature.passcode_reminder.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/passcode_reminder/impl/ui/flow/PasscodeReminderFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ChangePasscodeDialog", "EnterPasscode", "ChangePasscode", "ForgotPassword", "Lcom/revolut/feature/passcode_reminder/impl/ui/flow/PasscodeReminderFlowContract$Step$ChangePasscode;", "Lcom/revolut/feature/passcode_reminder/impl/ui/flow/PasscodeReminderFlowContract$Step$ChangePasscodeDialog;", "Lcom/revolut/feature/passcode_reminder/impl/ui/flow/PasscodeReminderFlowContract$Step$EnterPasscode;", "Lcom/revolut/feature/passcode_reminder/impl/ui/flow/PasscodeReminderFlowContract$Step$ForgotPassword;", "feature_passcode_reminder_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PasscodeReminderFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/passcode_reminder/impl/ui/flow/PasscodeReminderFlowContract$Step$ChangePasscode;", "Lcom/revolut/feature/passcode_reminder/impl/ui/flow/PasscodeReminderFlowContract$Step;", "<init>", "()V", "feature_passcode_reminder_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChangePasscode implements PasscodeReminderFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChangePasscode f78646a = new ChangePasscode();

        @NotNull
        public static final Parcelable.Creator<ChangePasscode> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChangePasscode.f78646a;
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

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/passcode_reminder/impl/ui/flow/PasscodeReminderFlowContract$Step$ChangePasscodeDialog;", "Lcom/revolut/feature/passcode_reminder/impl/ui/flow/PasscodeReminderFlowContract$Step;", "<init>", "()V", "feature_passcode_reminder_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChangePasscodeDialog implements PasscodeReminderFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChangePasscodeDialog f78647a = new ChangePasscodeDialog();

        @NotNull
        public static final Parcelable.Creator<ChangePasscodeDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChangePasscodeDialog.f78647a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangePasscodeDialog[i];
            }
        }

        private ChangePasscodeDialog() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/passcode_reminder/impl/ui/flow/PasscodeReminderFlowContract$Step$EnterPasscode;", "Lcom/revolut/feature/passcode_reminder/impl/ui/flow/PasscodeReminderFlowContract$Step;", "<init>", "()V", "feature_passcode_reminder_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EnterPasscode implements PasscodeReminderFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EnterPasscode f78648a = new EnterPasscode();

        @NotNull
        public static final Parcelable.Creator<EnterPasscode> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EnterPasscode.f78648a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EnterPasscode[i];
            }
        }

        private EnterPasscode() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/passcode_reminder/impl/ui/flow/PasscodeReminderFlowContract$Step$ForgotPassword;", "Lcom/revolut/feature/passcode_reminder/impl/ui/flow/PasscodeReminderFlowContract$Step;", "<init>", "()V", "feature_passcode_reminder_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ForgotPassword implements PasscodeReminderFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ForgotPassword f78649a = new ForgotPassword();

        @NotNull
        public static final Parcelable.Creator<ForgotPassword> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ForgotPassword.f78649a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ForgotPassword[i];
            }
        }

        private ForgotPassword() {
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
