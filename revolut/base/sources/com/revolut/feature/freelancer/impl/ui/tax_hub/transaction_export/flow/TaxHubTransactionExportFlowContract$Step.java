package com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/flow/TaxHubTransactionExportFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Filter", "PeriodPicker", "Review", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/flow/TaxHubTransactionExportFlowContract$Step$Filter;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/flow/TaxHubTransactionExportFlowContract$Step$PeriodPicker;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/flow/TaxHubTransactionExportFlowContract$Step$Review;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TaxHubTransactionExportFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/flow/TaxHubTransactionExportFlowContract$Step$Filter;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/flow/TaxHubTransactionExportFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Filter implements TaxHubTransactionExportFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Filter> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f74390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f74391b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Filter((LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Filter[i];
            }
        }

        public Filter(LocalDate startDate, LocalDate endDate) {
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            this.f74390a = startDate;
            this.f74391b = endDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Filter)) {
                return false;
            }
            Filter filter = (Filter) obj2;
            return Intrinsics.f(this.f74390a, filter.f74390a) && Intrinsics.f(this.f74391b, filter.f74391b);
        }

        public final int hashCode() {
            return this.f74391b.hashCode() + (this.f74390a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f74390a);
            dest.writeSerializable(this.f74391b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/flow/TaxHubTransactionExportFlowContract$Step$PeriodPicker;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/flow/TaxHubTransactionExportFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PeriodPicker implements TaxHubTransactionExportFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PeriodPicker f74392a = new PeriodPicker();

        @NotNull
        public static final Parcelable.Creator<PeriodPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PeriodPicker.f74392a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PeriodPicker[i];
            }
        }

        private PeriodPicker() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/flow/TaxHubTransactionExportFlowContract$Step$Review;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/flow/TaxHubTransactionExportFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/flow/a", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Review implements TaxHubTransactionExportFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Review> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.a f74393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f74394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f74395c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Review(com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.a.valueOf(parcel.readString()), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Review[i];
            }
        }

        public Review(com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.a type, LocalDate startDate, LocalDate endDate) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            this.f74393a = type;
            this.f74394b = startDate;
            this.f74395c = endDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Review)) {
                return false;
            }
            Review review = (Review) obj2;
            return this.f74393a == review.f74393a && Intrinsics.f(this.f74394b, review.f74394b) && Intrinsics.f(this.f74395c, review.f74395c);
        }

        public final int hashCode() {
            return this.f74395c.hashCode() + y.a(this.f74393a.hashCode() * 31, 31, this.f74394b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74393a.name());
            dest.writeSerializable(this.f74394b);
            dest.writeSerializable(this.f74395c);
        }
    }
}
