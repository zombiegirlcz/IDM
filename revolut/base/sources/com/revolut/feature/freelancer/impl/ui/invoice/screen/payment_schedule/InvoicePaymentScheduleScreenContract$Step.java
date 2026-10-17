package com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import fy6.p;
import fy6.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "fy6/q", "fy6/p", "IssueDatePicker", "NextDatePicker", "DueDatePicker", "SaleDatePicker", "EndDatePicker", "DueDateOptionPicker", "SaleDateOptionPicker", "LimitOptionPicker", "RepeatPeriodPicker", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$Step$DueDateOptionPicker;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$Step$DueDatePicker;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$Step$EndDatePicker;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$Step$IssueDatePicker;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$Step$LimitOptionPicker;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$Step$NextDatePicker;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$Step$RepeatPeriodPicker;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$Step$SaleDateOptionPicker;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$Step$SaleDatePicker;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvoicePaymentScheduleScreenContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$Step$DueDateOptionPicker;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$Step;", "Lfy6/p;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DueDateOptionPicker implements InvoicePaymentScheduleScreenContract$Step, p {

        @NotNull
        public static final Parcelable.Creator<DueDateOptionPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InvoicePaymentScheduleScreenContract$ScheduleTab f73905a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DueDateOptionPicker((InvoicePaymentScheduleScreenContract$ScheduleTab) parcel.readParcelable(DueDateOptionPicker.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DueDateOptionPicker[i];
            }
        }

        public DueDateOptionPicker(InvoicePaymentScheduleScreenContract$ScheduleTab selectedTab) {
            Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
            this.f73905a = selectedTab;
        }

        @Override // fy6.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final InvoicePaymentScheduleScreenContract$ScheduleTab getF73912a() {
            return this.f73905a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DueDateOptionPicker) && Intrinsics.f(this.f73905a, ((DueDateOptionPicker) obj2).f73905a);
        }

        public final int hashCode() {
            return this.f73905a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73905a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$Step$DueDatePicker;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$Step;", "Lfy6/q;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DueDatePicker implements InvoicePaymentScheduleScreenContract$Step, q {

        @NotNull
        public static final Parcelable.Creator<DueDatePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InvoicePaymentScheduleScreenContract$ScheduleTab f73906a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DueDatePicker((InvoicePaymentScheduleScreenContract$ScheduleTab) parcel.readParcelable(DueDatePicker.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DueDatePicker[i];
            }
        }

        public DueDatePicker(InvoicePaymentScheduleScreenContract$ScheduleTab selectedTab) {
            Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
            this.f73906a = selectedTab;
        }

        @Override // fy6.q
        /* JADX INFO: renamed from: a, reason: from getter */
        public final InvoicePaymentScheduleScreenContract$ScheduleTab getF73913a() {
            return this.f73906a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DueDatePicker) && Intrinsics.f(this.f73906a, ((DueDatePicker) obj2).f73906a);
        }

        public final int hashCode() {
            return this.f73906a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73906a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$Step$EndDatePicker;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$Step;", "Lfy6/q;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EndDatePicker implements InvoicePaymentScheduleScreenContract$Step, q {

        @NotNull
        public static final Parcelable.Creator<EndDatePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InvoicePaymentScheduleScreenContract$ScheduleTab f73907a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EndDatePicker((InvoicePaymentScheduleScreenContract$ScheduleTab) parcel.readParcelable(EndDatePicker.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EndDatePicker[i];
            }
        }

        public EndDatePicker(InvoicePaymentScheduleScreenContract$ScheduleTab selectedTab) {
            Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
            this.f73907a = selectedTab;
        }

        @Override // fy6.q
        /* JADX INFO: renamed from: a, reason: from getter */
        public final InvoicePaymentScheduleScreenContract$ScheduleTab getF73913a() {
            return this.f73907a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EndDatePicker) && Intrinsics.f(this.f73907a, ((EndDatePicker) obj2).f73907a);
        }

        public final int hashCode() {
            return this.f73907a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73907a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$Step$IssueDatePicker;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$Step;", "Lfy6/q;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IssueDatePicker implements InvoicePaymentScheduleScreenContract$Step, q {

        @NotNull
        public static final Parcelable.Creator<IssueDatePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InvoicePaymentScheduleScreenContract$ScheduleTab f73908a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IssueDatePicker((InvoicePaymentScheduleScreenContract$ScheduleTab) parcel.readParcelable(IssueDatePicker.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IssueDatePicker[i];
            }
        }

        public IssueDatePicker(InvoicePaymentScheduleScreenContract$ScheduleTab selectedTab) {
            Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
            this.f73908a = selectedTab;
        }

        @Override // fy6.q
        /* JADX INFO: renamed from: a, reason: from getter */
        public final InvoicePaymentScheduleScreenContract$ScheduleTab getF73913a() {
            return this.f73908a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof IssueDatePicker) && Intrinsics.f(this.f73908a, ((IssueDatePicker) obj2).f73908a);
        }

        public final int hashCode() {
            return this.f73908a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73908a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$Step$LimitOptionPicker;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LimitOptionPicker implements InvoicePaymentScheduleScreenContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LimitOptionPicker f73909a = new LimitOptionPicker();

        @NotNull
        public static final Parcelable.Creator<LimitOptionPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LimitOptionPicker.f73909a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LimitOptionPicker[i];
            }
        }

        private LimitOptionPicker() {
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$Step$NextDatePicker;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$Step;", "Lfy6/q;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NextDatePicker implements InvoicePaymentScheduleScreenContract$Step, q {

        @NotNull
        public static final Parcelable.Creator<NextDatePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InvoicePaymentScheduleScreenContract$ScheduleTab f73910a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NextDatePicker((InvoicePaymentScheduleScreenContract$ScheduleTab) parcel.readParcelable(NextDatePicker.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NextDatePicker[i];
            }
        }

        public NextDatePicker(InvoicePaymentScheduleScreenContract$ScheduleTab selectedTab) {
            Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
            this.f73910a = selectedTab;
        }

        @Override // fy6.q
        /* JADX INFO: renamed from: a, reason: from getter */
        public final InvoicePaymentScheduleScreenContract$ScheduleTab getF73913a() {
            return this.f73910a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NextDatePicker) && Intrinsics.f(this.f73910a, ((NextDatePicker) obj2).f73910a);
        }

        public final int hashCode() {
            return this.f73910a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73910a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$Step$RepeatPeriodPicker;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RepeatPeriodPicker implements InvoicePaymentScheduleScreenContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RepeatPeriodPicker f73911a = new RepeatPeriodPicker();

        @NotNull
        public static final Parcelable.Creator<RepeatPeriodPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RepeatPeriodPicker.f73911a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RepeatPeriodPicker[i];
            }
        }

        private RepeatPeriodPicker() {
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$Step$SaleDateOptionPicker;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$Step;", "Lfy6/p;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SaleDateOptionPicker implements InvoicePaymentScheduleScreenContract$Step, p {

        @NotNull
        public static final Parcelable.Creator<SaleDateOptionPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InvoicePaymentScheduleScreenContract$ScheduleTab f73912a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SaleDateOptionPicker((InvoicePaymentScheduleScreenContract$ScheduleTab) parcel.readParcelable(SaleDateOptionPicker.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SaleDateOptionPicker[i];
            }
        }

        public SaleDateOptionPicker(InvoicePaymentScheduleScreenContract$ScheduleTab selectedTab) {
            Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
            this.f73912a = selectedTab;
        }

        @Override // fy6.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final InvoicePaymentScheduleScreenContract$ScheduleTab getF73912a() {
            return this.f73912a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SaleDateOptionPicker) && Intrinsics.f(this.f73912a, ((SaleDateOptionPicker) obj2).f73912a);
        }

        public final int hashCode() {
            return this.f73912a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73912a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$Step$SaleDatePicker;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$Step;", "Lfy6/q;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SaleDatePicker implements InvoicePaymentScheduleScreenContract$Step, q {

        @NotNull
        public static final Parcelable.Creator<SaleDatePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InvoicePaymentScheduleScreenContract$ScheduleTab f73913a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SaleDatePicker((InvoicePaymentScheduleScreenContract$ScheduleTab) parcel.readParcelable(SaleDatePicker.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SaleDatePicker[i];
            }
        }

        public SaleDatePicker(InvoicePaymentScheduleScreenContract$ScheduleTab selectedTab) {
            Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
            this.f73913a = selectedTab;
        }

        @Override // fy6.q
        /* JADX INFO: renamed from: a, reason: from getter */
        public final InvoicePaymentScheduleScreenContract$ScheduleTab getF73913a() {
            return this.f73913a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SaleDatePicker) && Intrinsics.f(this.f73913a, ((SaleDatePicker) obj2).f73913a);
        }

        public final int hashCode() {
            return this.f73913a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73913a, i);
        }
    }
}
