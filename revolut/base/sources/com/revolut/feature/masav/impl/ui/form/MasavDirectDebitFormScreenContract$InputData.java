package com.revolut.feature.masav.impl.ui.form;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.billers.api.model.Biller;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/masav/impl/ui/form/MasavDirectDebitFormScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "CreateByCreditor", "Edit", "AdjustLimits", "Lcom/revolut/feature/masav/impl/ui/form/MasavDirectDebitFormScreenContract$InputData$AdjustLimits;", "Lcom/revolut/feature/masav/impl/ui/form/MasavDirectDebitFormScreenContract$InputData$CreateByCreditor;", "Lcom/revolut/feature/masav/impl/ui/form/MasavDirectDebitFormScreenContract$InputData$Edit;", "feature_masav_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MasavDirectDebitFormScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/masav/impl/ui/form/MasavDirectDebitFormScreenContract$InputData$AdjustLimits;", "Lcom/revolut/feature/masav/impl/ui/form/MasavDirectDebitFormScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_masav_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdjustLimits implements MasavDirectDebitFormScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<AdjustLimits> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmPaymentAuthorisationSummary f78110a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AdjustLimits((ApmPaymentAuthorisationSummary) parcel.readParcelable(AdjustLimits.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdjustLimits[i];
            }
        }

        public AdjustLimits(ApmPaymentAuthorisationSummary paymentAuthorisation) {
            Intrinsics.checkNotNullParameter(paymentAuthorisation, "paymentAuthorisation");
            this.f78110a = paymentAuthorisation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AdjustLimits) && Intrinsics.f(this.f78110a, ((AdjustLimits) obj2).f78110a);
        }

        public final int hashCode() {
            return this.f78110a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f78110a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/masav/impl/ui/form/MasavDirectDebitFormScreenContract$InputData$CreateByCreditor;", "Lcom/revolut/feature/masav/impl/ui/form/MasavDirectDebitFormScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_masav_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateByCreditor implements MasavDirectDebitFormScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<CreateByCreditor> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Biller f78111a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreateByCreditor((Biller) parcel.readParcelable(CreateByCreditor.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateByCreditor[i];
            }
        }

        public CreateByCreditor(Biller creditor) {
            Intrinsics.checkNotNullParameter(creditor, "creditor");
            this.f78111a = creditor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CreateByCreditor) && Intrinsics.f(this.f78111a, ((CreateByCreditor) obj2).f78111a);
        }

        public final int hashCode() {
            return this.f78111a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f78111a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/masav/impl/ui/form/MasavDirectDebitFormScreenContract$InputData$Edit;", "Lcom/revolut/feature/masav/impl/ui/form/MasavDirectDebitFormScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_masav_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Edit implements MasavDirectDebitFormScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Edit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmPaymentAuthorisationSummary f78112a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Edit((ApmPaymentAuthorisationSummary) parcel.readParcelable(Edit.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Edit[i];
            }
        }

        public Edit(ApmPaymentAuthorisationSummary paymentAuthorisation) {
            Intrinsics.checkNotNullParameter(paymentAuthorisation, "paymentAuthorisation");
            this.f78112a = paymentAuthorisation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Edit) && Intrinsics.f(this.f78112a, ((Edit) obj2).f78112a);
        }

        public final int hashCode() {
            return this.f78112a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f78112a, i);
        }
    }
}
