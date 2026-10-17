package com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/tax_hub/payment/assessment/TaxHubPaymentAssessmentScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "RecipientPicker", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/payment/assessment/TaxHubPaymentAssessmentScreenContract$ModalStep$RecipientPicker;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TaxHubPaymentAssessmentScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/payment/assessment/TaxHubPaymentAssessmentScreenContract$ModalStep$RecipientPicker;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/payment/assessment/TaxHubPaymentAssessmentScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RecipientPicker implements TaxHubPaymentAssessmentScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RecipientPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f74302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f74303b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                wi0.b bVar = (wi0.b) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new RecipientPicker(arrayList, bVar);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecipientPicker[i];
            }
        }

        public RecipientPicker(List taxBeneficiaries, wi0.b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(taxBeneficiaries, "taxBeneficiaries");
            this.f74302a = countryCode;
            this.f74303b = taxBeneficiaries;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RecipientPicker)) {
                return false;
            }
            RecipientPicker recipientPicker = (RecipientPicker) obj2;
            return Intrinsics.f(this.f74302a, recipientPicker.f74302a) && Intrinsics.f(this.f74303b, recipientPicker.f74303b);
        }

        public final int hashCode() {
            return this.f74303b.hashCode() + (this.f74302a.f297794a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f74302a);
            Iterator itV = p.a.v(this.f74303b, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
        }
    }
}
