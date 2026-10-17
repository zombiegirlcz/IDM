package com.revolut.feature.freelancer.impl.ui.acquiring_payment.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/acquiring_payment/details/FreelancerAcquiringPaymentDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "FeeBreakdown", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_payment/details/FreelancerAcquiringPaymentDetailsScreenContract$ModalStep$FeeBreakdown;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerAcquiringPaymentDetailsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/acquiring_payment/details/FreelancerAcquiringPaymentDetailsScreenContract$ModalStep$FeeBreakdown;", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_payment/details/FreelancerAcquiringPaymentDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FeeBreakdown implements FreelancerAcquiringPaymentDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<FeeBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f73706a;

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

        public FeeBreakdown(List fees) {
            Intrinsics.checkNotNullParameter(fees, "fees");
            this.f73706a = fees;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FeeBreakdown) && Intrinsics.f(this.f73706a, ((FeeBreakdown) obj2).f73706a);
        }

        public final int hashCode() {
            return this.f73706a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f73706a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }
}
