package com.revolut.feature.giro.impl.ui.form;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.billers.api.model.Biller;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/giro/impl/ui/form/DirectDebitFormScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "CreateByCreditor", "Edit", "Lcom/revolut/feature/giro/impl/ui/form/DirectDebitFormScreenContract$InputData$CreateByCreditor;", "Lcom/revolut/feature/giro/impl/ui/form/DirectDebitFormScreenContract$InputData$Edit;", "feature_giro_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DirectDebitFormScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/giro/impl/ui/form/DirectDebitFormScreenContract$InputData$CreateByCreditor;", "Lcom/revolut/feature/giro/impl/ui/form/DirectDebitFormScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_giro_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateByCreditor implements DirectDebitFormScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<CreateByCreditor> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Biller f74541a;

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
            this.f74541a = creditor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CreateByCreditor) && Intrinsics.f(this.f74541a, ((CreateByCreditor) obj2).f74541a);
        }

        public final int hashCode() {
            return this.f74541a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f74541a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/giro/impl/ui/form/DirectDebitFormScreenContract$InputData$Edit;", "Lcom/revolut/feature/giro/impl/ui/form/DirectDebitFormScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_giro_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Edit implements DirectDebitFormScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Edit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmPaymentAuthorisationSummary f74542a;

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
            this.f74542a = paymentAuthorisation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Edit) && Intrinsics.f(this.f74542a, ((Edit) obj2).f74542a);
        }

        public final int hashCode() {
            return this.f74542a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f74542a, i);
        }
    }
}
