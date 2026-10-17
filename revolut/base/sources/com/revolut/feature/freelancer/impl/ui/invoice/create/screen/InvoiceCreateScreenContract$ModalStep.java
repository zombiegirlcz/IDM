package com.revolut.feature.freelancer.impl.ui.invoice.create.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceItemPayload;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplateOverride;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/invoice/create/screen/InvoiceCreateScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ItemTaxRate", "ItemUnit", "Preview", "TemplateOverride", "VatPrompt", "Lcom/revolut/feature/freelancer/impl/ui/invoice/create/screen/InvoiceCreateScreenContract$ModalStep$ItemTaxRate;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/create/screen/InvoiceCreateScreenContract$ModalStep$ItemUnit;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/create/screen/InvoiceCreateScreenContract$ModalStep$Preview;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/create/screen/InvoiceCreateScreenContract$ModalStep$TemplateOverride;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/create/screen/InvoiceCreateScreenContract$ModalStep$VatPrompt;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvoiceCreateScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/create/screen/InvoiceCreateScreenContract$ModalStep$ItemTaxRate;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/create/screen/InvoiceCreateScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ItemTaxRate implements InvoiceCreateScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ItemTaxRate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FreelancerInvoiceItemPayload f73830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f73831b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                FreelancerInvoiceItemPayload freelancerInvoiceItemPayload = (FreelancerInvoiceItemPayload) j6.a.f(parcel, "parcel", ItemTaxRate.class);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(ItemTaxRate.class, parcel, arrayList, iE, 1);
                }
                return new ItemTaxRate(freelancerInvoiceItemPayload, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ItemTaxRate[i];
            }
        }

        public ItemTaxRate(FreelancerInvoiceItemPayload item, List taxRates) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(taxRates, "taxRates");
            this.f73830a = item;
            this.f73831b = taxRates;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ItemTaxRate)) {
                return false;
            }
            ItemTaxRate itemTaxRate = (ItemTaxRate) obj2;
            return Intrinsics.f(this.f73830a, itemTaxRate.f73830a) && Intrinsics.f(this.f73831b, itemTaxRate.f73831b);
        }

        public final int hashCode() {
            return this.f73831b.hashCode() + (this.f73830a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73830a, i);
            Iterator itV = p.a.v(this.f73831b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/create/screen/InvoiceCreateScreenContract$ModalStep$ItemUnit;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/create/screen/InvoiceCreateScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ItemUnit implements InvoiceCreateScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ItemUnit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FreelancerInvoiceItemPayload f73832a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ItemUnit((FreelancerInvoiceItemPayload) parcel.readParcelable(ItemUnit.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ItemUnit[i];
            }
        }

        public ItemUnit(FreelancerInvoiceItemPayload item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f73832a = item;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ItemUnit) && Intrinsics.f(this.f73832a, ((ItemUnit) obj2).f73832a);
        }

        public final int hashCode() {
            return this.f73832a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73832a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/create/screen/InvoiceCreateScreenContract$ModalStep$Preview;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/create/screen/InvoiceCreateScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Preview implements InvoiceCreateScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Preview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73833a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Preview(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Preview[i];
            }
        }

        public Preview(String invoiceId) {
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            this.f73833a = invoiceId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Preview) && Intrinsics.f(this.f73833a, ((Preview) obj2).f73833a);
        }

        public final int hashCode() {
            return this.f73833a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73833a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/create/screen/InvoiceCreateScreenContract$ModalStep$TemplateOverride;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/create/screen/InvoiceCreateScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TemplateOverride implements InvoiceCreateScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TemplateOverride> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InvoiceTemplate f73834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InvoiceTemplateOverride f73835b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TemplateOverride((InvoiceTemplate) parcel.readParcelable(TemplateOverride.class.getClassLoader()), (InvoiceTemplateOverride) parcel.readParcelable(TemplateOverride.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TemplateOverride[i];
            }
        }

        public TemplateOverride(InvoiceTemplate template, InvoiceTemplateOverride invoiceTemplateOverride) {
            Intrinsics.checkNotNullParameter(template, "template");
            this.f73834a = template;
            this.f73835b = invoiceTemplateOverride;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TemplateOverride)) {
                return false;
            }
            TemplateOverride templateOverride = (TemplateOverride) obj2;
            return Intrinsics.f(this.f73834a, templateOverride.f73834a) && Intrinsics.f(this.f73835b, templateOverride.f73835b);
        }

        public final int hashCode() {
            int iHashCode = this.f73834a.hashCode() * 31;
            InvoiceTemplateOverride invoiceTemplateOverride = this.f73835b;
            return iHashCode + (invoiceTemplateOverride == null ? 0 : invoiceTemplateOverride.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73834a, i);
            dest.writeParcelable(this.f73835b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/create/screen/InvoiceCreateScreenContract$ModalStep$VatPrompt;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/create/screen/InvoiceCreateScreenContract$ModalStep;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class VatPrompt implements InvoiceCreateScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final VatPrompt f73836a = new VatPrompt();

        @NotNull
        public static final Parcelable.Creator<VatPrompt> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return VatPrompt.f73836a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VatPrompt[i];
            }
        }

        private VatPrompt() {
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
