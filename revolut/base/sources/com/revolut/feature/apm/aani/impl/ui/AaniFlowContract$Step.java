package com.revolut.feature.apm.aani.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.aani.impl.model.DataForRegistration;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/apm/aani/impl/ui/AaniFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ProductArticle", "Confirmation", "NewContact", "PendingPayment", "Lcom/revolut/feature/apm/aani/impl/ui/AaniFlowContract$Step$Confirmation;", "Lcom/revolut/feature/apm/aani/impl/ui/AaniFlowContract$Step$NewContact;", "Lcom/revolut/feature/apm/aani/impl/ui/AaniFlowContract$Step$PendingPayment;", "Lcom/revolut/feature/apm/aani/impl/ui/AaniFlowContract$Step$ProductArticle;", "feature_apm_aani_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AaniFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/aani/impl/ui/AaniFlowContract$Step$Confirmation;", "Lcom/revolut/feature/apm/aani/impl/ui/AaniFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_aani_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirmation extends AaniFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DataForRegistration f61127a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Confirmation(DataForRegistration.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirmation[i];
            }
        }

        public Confirmation(DataForRegistration dataForRegistration) {
            Intrinsics.checkNotNullParameter(dataForRegistration, "dataForRegistration");
            this.f61127a = dataForRegistration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Confirmation) && Intrinsics.f(this.f61127a, ((Confirmation) obj2).f61127a);
        }

        public final int hashCode() {
            return this.f61127a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f61127a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/aani/impl/ui/AaniFlowContract$Step$NewContact;", "Lcom/revolut/feature/apm/aani/impl/ui/AaniFlowContract$Step;", "<init>", "()V", "feature_apm_aani_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NewContact extends AaniFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewContact f61128a = new NewContact();

        @NotNull
        public static final Parcelable.Creator<NewContact> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NewContact.f61128a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewContact[i];
            }
        }

        private NewContact() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/aani/impl/ui/AaniFlowContract$Step$PendingPayment;", "Lcom/revolut/feature/apm/aani/impl/ui/AaniFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_aani_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PendingPayment extends AaniFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PendingPayment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmPaymentAuthorisationSummary f61129a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PendingPayment((ApmPaymentAuthorisationSummary) parcel.readParcelable(PendingPayment.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PendingPayment[i];
            }
        }

        public PendingPayment(ApmPaymentAuthorisationSummary pendingPayment) {
            Intrinsics.checkNotNullParameter(pendingPayment, "pendingPayment");
            this.f61129a = pendingPayment;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PendingPayment) && Intrinsics.f(this.f61129a, ((PendingPayment) obj2).f61129a);
        }

        public final int hashCode() {
            return this.f61129a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f61129a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/aani/impl/ui/AaniFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/apm/aani/impl/ui/AaniFlowContract$Step;", "<init>", "()V", "feature_apm_aani_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProductArticle extends AaniFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductArticle f61130a = new ProductArticle();

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProductArticle.f61130a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticle[i];
            }
        }

        private ProductArticle() {
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

    private AaniFlowContract$Step() {
    }
}
