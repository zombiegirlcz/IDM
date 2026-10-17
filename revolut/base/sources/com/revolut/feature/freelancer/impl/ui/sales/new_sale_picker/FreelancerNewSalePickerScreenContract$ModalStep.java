package com.revolut.feature.freelancer.impl.ui.sales.new_sale_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import k27.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/sales/new_sale_picker/FreelancerNewSalePickerScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "MorePaymentOptions", "Lcom/revolut/feature/freelancer/impl/ui/sales/new_sale_picker/FreelancerNewSalePickerScreenContract$ModalStep$MorePaymentOptions;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerNewSalePickerScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/sales/new_sale_picker/FreelancerNewSalePickerScreenContract$ModalStep$MorePaymentOptions;", "Lcom/revolut/feature/freelancer/impl/ui/sales/new_sale_picker/FreelancerNewSalePickerScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MorePaymentOptions implements FreelancerNewSalePickerScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<MorePaymentOptions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f74163a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(f.valueOf(parcel.readString()));
                }
                return new MorePaymentOptions(linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MorePaymentOptions[i];
            }
        }

        public MorePaymentOptions(Set paymentOptions) {
            Intrinsics.checkNotNullParameter(paymentOptions, "paymentOptions");
            this.f74163a = paymentOptions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MorePaymentOptions) && Intrinsics.f(this.f74163a, ((MorePaymentOptions) obj2).f74163a);
        }

        public final int hashCode() {
            return this.f74163a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f74163a, dest);
            while (itV.hasNext()) {
                dest.writeString(((f) itV.next()).name());
            }
        }
    }
}
