package com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.InvoiceDateOption;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentSchedule;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "Type", "a", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvoicePaymentSchedule implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f73895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InvoiceDateOption f73896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InvoiceDateOption f73897c;
    public final LocalDate d;
    public final Type e;

    @NotNull
    public static final Parcelable.Creator<InvoicePaymentSchedule> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentSchedule$Type;", "Landroid/os/Parcelable;", "OneTime", "Recurring", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentSchedule$Type$OneTime;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentSchedule$Type$Recurring;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Type extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentSchedule$Type$OneTime;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentSchedule$Type;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class OneTime implements Type {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final OneTime f73898a = new OneTime();

            @NotNull
            public static final Parcelable.Creator<OneTime> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return OneTime.f73898a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OneTime[i];
                }
            }

            private OneTime() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentSchedule$Type$Recurring;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentSchedule$Type;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Recurring implements Type {

            @NotNull
            public static final Parcelable.Creator<Recurring> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f73899a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Recurring(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Recurring[i];
                }
            }

            public Recurring(boolean z) {
                this.f73899a = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Recurring) && this.f73899a == ((Recurring) obj2).f73899a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f73899a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f73899a ? 1 : 0);
            }
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvoicePaymentSchedule((LocalDate) parcel.readSerializable(), (InvoiceDateOption) parcel.readParcelable(InvoicePaymentSchedule.class.getClassLoader()), (InvoiceDateOption) parcel.readParcelable(InvoicePaymentSchedule.class.getClassLoader()), (LocalDate) parcel.readSerializable(), (Type) parcel.readParcelable(InvoicePaymentSchedule.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvoicePaymentSchedule[i];
        }
    }

    public InvoicePaymentSchedule(LocalDate issueDate, InvoiceDateOption dueDateOption, InvoiceDateOption saleDateOption, LocalDate localDate, Type type) {
        Intrinsics.checkNotNullParameter(issueDate, "issueDate");
        Intrinsics.checkNotNullParameter(dueDateOption, "dueDateOption");
        Intrinsics.checkNotNullParameter(saleDateOption, "saleDateOption");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f73895a = issueDate;
        this.f73896b = dueDateOption;
        this.f73897c = saleDateOption;
        this.d = localDate;
        this.e = type;
    }

    public static InvoicePaymentSchedule a(InvoicePaymentSchedule invoicePaymentSchedule, LocalDate localDate, InvoiceDateOption invoiceDateOption, InvoiceDateOption invoiceDateOption2, LocalDate localDate2, int i) {
        if ((i & 1) != 0) {
            localDate = invoicePaymentSchedule.f73895a;
        }
        LocalDate issueDate = localDate;
        if ((i & 2) != 0) {
            invoiceDateOption = invoicePaymentSchedule.f73896b;
        }
        InvoiceDateOption dueDateOption = invoiceDateOption;
        if ((i & 4) != 0) {
            invoiceDateOption2 = invoicePaymentSchedule.f73897c;
        }
        InvoiceDateOption saleDateOption = invoiceDateOption2;
        if ((i & 8) != 0) {
            localDate2 = invoicePaymentSchedule.d;
        }
        Type type = invoicePaymentSchedule.e;
        invoicePaymentSchedule.getClass();
        Intrinsics.checkNotNullParameter(issueDate, "issueDate");
        Intrinsics.checkNotNullParameter(dueDateOption, "dueDateOption");
        Intrinsics.checkNotNullParameter(saleDateOption, "saleDateOption");
        Intrinsics.checkNotNullParameter(type, "type");
        return new InvoicePaymentSchedule(issueDate, dueDateOption, saleDateOption, localDate2, type);
    }

    public final boolean J() {
        Type.OneTime oneTime = Type.OneTime.f73898a;
        Type type = this.e;
        if (Intrinsics.f(type, oneTime)) {
            return true;
        }
        if (type instanceof Type.Recurring) {
            return !c().isBefore(d());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean T() {
        Type type = this.e;
        return (type instanceof Type.Recurring) && ((Type.Recurring) type).f73899a;
    }

    public final boolean W(LocalDate now) {
        Intrinsics.checkNotNullParameter(now, "now");
        return (T() ? z(now) : j(now)) && e() && J();
    }

    public final LocalDate b() {
        InvoiceDateOption invoiceDateOption = this.f73896b;
        if (invoiceDateOption instanceof InvoiceDateOption.CustomDate) {
            return ((InvoiceDateOption.CustomDate) invoiceDateOption).f73893a;
        }
        LocalDate localDatePlusDays = d().plusDays(invoiceDateOption.q7());
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        return localDatePlusDays;
    }

    public final LocalDate c() {
        InvoiceDateOption invoiceDateOption = this.f73897c;
        if (invoiceDateOption instanceof InvoiceDateOption.CustomDate) {
            return ((InvoiceDateOption.CustomDate) invoiceDateOption).f73893a;
        }
        LocalDate localDatePlusDays = d().plusDays(invoiceDateOption.q7());
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        return localDatePlusDays;
    }

    public final LocalDate d() {
        LocalDate localDate;
        boolean zT = T();
        LocalDate localDate2 = this.f73895a;
        return (!zT || (localDate = this.d) == null) ? localDate2 : localDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        Type.OneTime oneTime = Type.OneTime.f73898a;
        Type type = this.e;
        if (Intrinsics.f(type, oneTime)) {
            return true;
        }
        if (type instanceof Type.Recurring) {
            return !b().isBefore(d());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvoicePaymentSchedule)) {
            return false;
        }
        InvoicePaymentSchedule invoicePaymentSchedule = (InvoicePaymentSchedule) obj2;
        return Intrinsics.f(this.f73895a, invoicePaymentSchedule.f73895a) && Intrinsics.f(this.f73896b, invoicePaymentSchedule.f73896b) && Intrinsics.f(this.f73897c, invoicePaymentSchedule.f73897c) && Intrinsics.f(this.d, invoicePaymentSchedule.d) && Intrinsics.f(this.e, invoicePaymentSchedule.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f73897c.hashCode() + ((this.f73896b.hashCode() + (this.f73895a.hashCode() * 31)) * 31)) * 31;
        LocalDate localDate = this.d;
        return this.e.hashCode() + ((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31);
    }

    public final boolean j(LocalDate now) {
        Intrinsics.checkNotNullParameter(now, "now");
        Type.OneTime oneTime = Type.OneTime.f73898a;
        Type type = this.e;
        if (Intrinsics.f(type, oneTime)) {
            return true;
        }
        if (type instanceof Type.Recurring) {
            return !this.f73895a.isBefore(now);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f73895a);
        dest.writeParcelable(this.f73896b, i);
        dest.writeParcelable(this.f73897c, i);
        dest.writeSerializable(this.d);
        dest.writeParcelable(this.e, i);
    }

    public final boolean z(LocalDate now) {
        Intrinsics.checkNotNullParameter(now, "now");
        Type.OneTime oneTime = Type.OneTime.f73898a;
        Type type = this.e;
        if (Intrinsics.f(type, oneTime)) {
            return true;
        }
        if (!(type instanceof Type.Recurring)) {
            throw new NoWhenBranchMatchedException();
        }
        LocalDate localDate = this.d;
        return (localDate == null || localDate.isBefore(now)) ? false : true;
    }
}
