package com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_embedded.impl.data.model.SchemeInsuranceActivateCoverageWidget;
import com.revolut.feature.insurance_embedded.impl.data.model.SchemeInsurancePortal;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/insurance_embedded/impl/ui/screen/scheme_insurance/SchemeInsuranceDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CoverageActivation", "CarClaims", "Lcom/revolut/feature/insurance_embedded/impl/ui/screen/scheme_insurance/SchemeInsuranceDetailsScreenContract$ModalStep$CarClaims;", "Lcom/revolut/feature/insurance_embedded/impl/ui/screen/scheme_insurance/SchemeInsuranceDetailsScreenContract$ModalStep$CoverageActivation;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SchemeInsuranceDetailsScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/ui/screen/scheme_insurance/SchemeInsuranceDetailsScreenContract$ModalStep$CarClaims;", "Lcom/revolut/feature/insurance_embedded/impl/ui/screen/scheme_insurance/SchemeInsuranceDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CarClaims extends SchemeInsuranceDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CarClaims> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f76145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SchemeInsurancePortal f76146b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CarClaims(parcel.createStringArrayList(), SchemeInsurancePortal.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CarClaims[i];
            }
        }

        public CarClaims(List eligibleCardsIds, SchemeInsurancePortal website) {
            Intrinsics.checkNotNullParameter(eligibleCardsIds, "eligibleCardsIds");
            Intrinsics.checkNotNullParameter(website, "website");
            this.f76145a = eligibleCardsIds;
            this.f76146b = website;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CarClaims)) {
                return false;
            }
            CarClaims carClaims = (CarClaims) obj2;
            return Intrinsics.f(this.f76145a, carClaims.f76145a) && Intrinsics.f(this.f76146b, carClaims.f76146b);
        }

        public final int hashCode() {
            return this.f76146b.hashCode() + (this.f76145a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeStringList(this.f76145a);
            this.f76146b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/ui/screen/scheme_insurance/SchemeInsuranceDetailsScreenContract$ModalStep$CoverageActivation;", "Lcom/revolut/feature/insurance_embedded/impl/ui/screen/scheme_insurance/SchemeInsuranceDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CoverageActivation extends SchemeInsuranceDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CoverageActivation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SchemeInsuranceActivateCoverageWidget f76147a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CoverageActivation(SchemeInsuranceActivateCoverageWidget.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CoverageActivation[i];
            }
        }

        public CoverageActivation(SchemeInsuranceActivateCoverageWidget widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            this.f76147a = widget;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CoverageActivation) && Intrinsics.f(this.f76147a, ((CoverageActivation) obj2).f76147a);
        }

        public final int hashCode() {
            return this.f76147a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f76147a.writeToParcel(dest, i);
        }
    }

    private SchemeInsuranceDetailsScreenContract$ModalStep() {
    }
}
