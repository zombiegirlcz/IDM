package com.revolut.feature.freelancer.impl.ui.acquiring_order.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lr6.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/acquiring_order/details/FreelancerAcquiringOrderDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AccountRestriction", "FeeBreakdown", "ReceiptPaymentSelection", "RefundPaymentSelection", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_order/details/FreelancerAcquiringOrderDetailsScreenContract$ModalStep$AccountRestriction;", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_order/details/FreelancerAcquiringOrderDetailsScreenContract$ModalStep$FeeBreakdown;", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_order/details/FreelancerAcquiringOrderDetailsScreenContract$ModalStep$ReceiptPaymentSelection;", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_order/details/FreelancerAcquiringOrderDetailsScreenContract$ModalStep$RefundPaymentSelection;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerAcquiringOrderDetailsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/acquiring_order/details/FreelancerAcquiringOrderDetailsScreenContract$ModalStep$AccountRestriction;", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_order/details/FreelancerAcquiringOrderDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountRestriction implements FreelancerAcquiringOrderDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AccountRestriction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f73669a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountRestriction(d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountRestriction[i];
            }
        }

        public AccountRestriction(d bannerType) {
            Intrinsics.checkNotNullParameter(bannerType, "bannerType");
            this.f73669a = bannerType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AccountRestriction) && this.f73669a == ((AccountRestriction) obj2).f73669a;
        }

        public final int hashCode() {
            return this.f73669a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73669a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/acquiring_order/details/FreelancerAcquiringOrderDetailsScreenContract$ModalStep$FeeBreakdown;", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_order/details/FreelancerAcquiringOrderDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FeeBreakdown implements FreelancerAcquiringOrderDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<FeeBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f73670a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(FeeBreakdown.class, parcel, arrayList, iE, 1);
                }
                return new FeeBreakdown(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeeBreakdown[i];
            }
        }

        public FeeBreakdown(ArrayList fees) {
            Intrinsics.checkNotNullParameter(fees, "fees");
            this.f73670a = fees;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FeeBreakdown) && this.f73670a.equals(((FeeBreakdown) obj2).f73670a);
        }

        public final int hashCode() {
            return this.f73670a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f73670a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/acquiring_order/details/FreelancerAcquiringOrderDetailsScreenContract$ModalStep$ReceiptPaymentSelection;", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_order/details/FreelancerAcquiringOrderDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReceiptPaymentSelection implements FreelancerAcquiringOrderDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ReceiptPaymentSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f73671a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(ReceiptPaymentSelection.class, parcel, arrayList, iE, 1);
                }
                return new ReceiptPaymentSelection(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReceiptPaymentSelection[i];
            }
        }

        public ReceiptPaymentSelection(ArrayList receipts) {
            Intrinsics.checkNotNullParameter(receipts, "receipts");
            this.f73671a = receipts;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ReceiptPaymentSelection) && this.f73671a.equals(((ReceiptPaymentSelection) obj2).f73671a);
        }

        public final int hashCode() {
            return this.f73671a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f73671a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/acquiring_order/details/FreelancerAcquiringOrderDetailsScreenContract$ModalStep$RefundPaymentSelection;", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_order/details/FreelancerAcquiringOrderDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RefundPaymentSelection implements FreelancerAcquiringOrderDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RefundPaymentSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f73672a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(RefundPaymentSelection.class, parcel, arrayList, iE, 1);
                }
                return new RefundPaymentSelection(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RefundPaymentSelection[i];
            }
        }

        public RefundPaymentSelection(ArrayList payments) {
            Intrinsics.checkNotNullParameter(payments, "payments");
            this.f73672a = payments;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RefundPaymentSelection) && Intrinsics.f(this.f73672a, ((RefundPaymentSelection) obj2).f73672a);
        }

        public final int hashCode() {
            return this.f73672a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f73672a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }
}
