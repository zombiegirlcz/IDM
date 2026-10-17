package com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import dx4.h3;
import dx4.k3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/refinancing_account_details/input/RefinancingAccountDetailsInputScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SingleBankSelector", "Lcom/revolut/feature/credit/application/plugins/impl/ui/refinancing_account_details/input/RefinancingAccountDetailsInputScreenContract$ModalStep$SingleBankSelector;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RefinancingAccountDetailsInputScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/refinancing_account_details/input/RefinancingAccountDetailsInputScreenContract$ModalStep$SingleBankSelector;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/refinancing_account_details/input/RefinancingAccountDetailsInputScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SingleBankSelector implements RefinancingAccountDetailsInputScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SingleBankSelector> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h3 f68270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k3 f68271b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SingleBankSelector((h3) parcel.readSerializable(), (k3) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SingleBankSelector[i];
            }
        }

        public SingleBankSelector(h3 inputDetails, k3 inputItem) {
            Intrinsics.checkNotNullParameter(inputDetails, "inputDetails");
            Intrinsics.checkNotNullParameter(inputItem, "inputItem");
            this.f68270a = inputDetails;
            this.f68271b = inputItem;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SingleBankSelector)) {
                return false;
            }
            SingleBankSelector singleBankSelector = (SingleBankSelector) obj2;
            return Intrinsics.f(this.f68270a, singleBankSelector.f68270a) && Intrinsics.f(this.f68271b, singleBankSelector.f68271b);
        }

        public final int hashCode() {
            return this.f68271b.hashCode() + (this.f68270a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68270a);
            dest.writeSerializable(this.f68271b);
        }
    }
}
