package com.revolut.feature.freelancer.impl.ui.invoice.settings.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Branding", "EmailMessage", "General", "PaymentMethods", "PaymentSchedule", "RecurringPaymentSchedule", "Reminders", "Settings", "Templates", "Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlowContract$Step$Branding;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlowContract$Step$EmailMessage;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlowContract$Step$General;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlowContract$Step$PaymentMethods;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlowContract$Step$PaymentSchedule;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlowContract$Step$RecurringPaymentSchedule;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlowContract$Step$Reminders;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlowContract$Step$Settings;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlowContract$Step$Templates;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvoiceSettingsFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlowContract$Step$Branding;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Branding implements InvoiceSettingsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Branding f73923a = new Branding();

        @NotNull
        public static final Parcelable.Creator<Branding> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Branding.f73923a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Branding[i];
            }
        }

        private Branding() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlowContract$Step$EmailMessage;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EmailMessage implements InvoiceSettingsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EmailMessage f73924a = new EmailMessage();

        @NotNull
        public static final Parcelable.Creator<EmailMessage> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EmailMessage.f73924a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EmailMessage[i];
            }
        }

        private EmailMessage() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlowContract$Step$General;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class General implements InvoiceSettingsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final General f73925a = new General();

        @NotNull
        public static final Parcelable.Creator<General> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return General.f73925a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new General[i];
            }
        }

        private General() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlowContract$Step$PaymentMethods;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PaymentMethods implements InvoiceSettingsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PaymentMethods f73926a = new PaymentMethods();

        @NotNull
        public static final Parcelable.Creator<PaymentMethods> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PaymentMethods.f73926a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentMethods[i];
            }
        }

        private PaymentMethods() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlowContract$Step$PaymentSchedule;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PaymentSchedule implements InvoiceSettingsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PaymentSchedule f73927a = new PaymentSchedule();

        @NotNull
        public static final Parcelable.Creator<PaymentSchedule> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PaymentSchedule.f73927a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentSchedule[i];
            }
        }

        private PaymentSchedule() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlowContract$Step$RecurringPaymentSchedule;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RecurringPaymentSchedule implements InvoiceSettingsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RecurringPaymentSchedule f73928a = new RecurringPaymentSchedule();

        @NotNull
        public static final Parcelable.Creator<RecurringPaymentSchedule> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RecurringPaymentSchedule.f73928a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecurringPaymentSchedule[i];
            }
        }

        private RecurringPaymentSchedule() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlowContract$Step$Reminders;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Reminders implements InvoiceSettingsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Reminders f73929a = new Reminders();

        @NotNull
        public static final Parcelable.Creator<Reminders> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Reminders.f73929a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Reminders[i];
            }
        }

        private Reminders() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlowContract$Step$Settings;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Settings implements InvoiceSettingsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Settings f73930a = new Settings();

        @NotNull
        public static final Parcelable.Creator<Settings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Settings.f73930a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Settings[i];
            }
        }

        private Settings() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlowContract$Step$Templates;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Templates implements InvoiceSettingsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Templates f73931a = new Templates();

        @NotNull
        public static final Parcelable.Creator<Templates> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Templates.f73931a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Templates[i];
            }
        }

        private Templates() {
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
