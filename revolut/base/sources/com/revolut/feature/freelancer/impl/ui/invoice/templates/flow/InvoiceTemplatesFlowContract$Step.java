package com.revolut.feature.freelancer.impl.ui.invoice.templates.flow;

import android.os.Parcel;
import android.os.Parcelable;
import bz6.d;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/invoice/templates/flow/InvoiceTemplatesFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "TemplateDetails", "TemplatesList", "VatNumberSettings", "Lcom/revolut/feature/freelancer/impl/ui/invoice/templates/flow/InvoiceTemplatesFlowContract$Step$TemplateDetails;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/templates/flow/InvoiceTemplatesFlowContract$Step$TemplatesList;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/templates/flow/InvoiceTemplatesFlowContract$Step$VatNumberSettings;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvoiceTemplatesFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/templates/flow/InvoiceTemplatesFlowContract$Step$TemplateDetails;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/templates/flow/InvoiceTemplatesFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TemplateDetails implements InvoiceTemplatesFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TemplateDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InvoiceTemplate f73963a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TemplateDetails((InvoiceTemplate) parcel.readParcelable(TemplateDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TemplateDetails[i];
            }
        }

        public TemplateDetails(InvoiceTemplate invoiceTemplate) {
            this.f73963a = invoiceTemplate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TemplateDetails) && Intrinsics.f(this.f73963a, ((TemplateDetails) obj2).f73963a);
        }

        public final int hashCode() {
            InvoiceTemplate invoiceTemplate = this.f73963a;
            if (invoiceTemplate == null) {
                return 0;
            }
            return invoiceTemplate.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73963a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/templates/flow/InvoiceTemplatesFlowContract$Step$TemplatesList;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/templates/flow/InvoiceTemplatesFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TemplatesList implements InvoiceTemplatesFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TemplatesList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f73964a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TemplatesList(d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TemplatesList[i];
            }
        }

        public TemplatesList(d mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f73964a = mode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TemplatesList) && this.f73964a == ((TemplatesList) obj2).f73964a;
        }

        public final int hashCode() {
            return this.f73964a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73964a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/templates/flow/InvoiceTemplatesFlowContract$Step$VatNumberSettings;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/templates/flow/InvoiceTemplatesFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class VatNumberSettings implements InvoiceTemplatesFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final VatNumberSettings f73965a = new VatNumberSettings();

        @NotNull
        public static final Parcelable.Creator<VatNumberSettings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return VatNumberSettings.f73965a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VatNumberSettings[i];
            }
        }

        private VatNumberSettings() {
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
