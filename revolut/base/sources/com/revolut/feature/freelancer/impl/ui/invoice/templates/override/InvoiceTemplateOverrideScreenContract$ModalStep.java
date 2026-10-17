package com.revolut.feature.freelancer.impl.ui.invoice.templates.override;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u9d.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/invoice/templates/override/InvoiceTemplateOverrideScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "LanguageSelector", "TemplateSelector", "Lcom/revolut/feature/freelancer/impl/ui/invoice/templates/override/InvoiceTemplateOverrideScreenContract$ModalStep$LanguageSelector;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/templates/override/InvoiceTemplateOverrideScreenContract$ModalStep$TemplateSelector;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvoiceTemplateOverrideScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/templates/override/InvoiceTemplateOverrideScreenContract$ModalStep$LanguageSelector;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/templates/override/InvoiceTemplateOverrideScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LanguageSelector implements InvoiceTemplateOverrideScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<LanguageSelector> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f73971a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LanguageSelector(b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LanguageSelector[i];
            }
        }

        public LanguageSelector(b language) {
            Intrinsics.checkNotNullParameter(language, "language");
            this.f73971a = language;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LanguageSelector) && this.f73971a == ((LanguageSelector) obj2).f73971a;
        }

        public final int hashCode() {
            return this.f73971a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73971a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/templates/override/InvoiceTemplateOverrideScreenContract$ModalStep$TemplateSelector;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/templates/override/InvoiceTemplateOverrideScreenContract$ModalStep;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TemplateSelector implements InvoiceTemplateOverrideScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TemplateSelector f73972a = new TemplateSelector();

        @NotNull
        public static final Parcelable.Creator<TemplateSelector> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TemplateSelector.f73972a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TemplateSelector[i];
            }
        }

        private TemplateSelector() {
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
