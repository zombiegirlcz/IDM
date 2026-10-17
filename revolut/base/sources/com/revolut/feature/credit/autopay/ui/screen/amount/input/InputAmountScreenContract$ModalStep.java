package com.revolut.feature.credit.autopay.ui.screen.amount.input;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.autopay.models.CreditAutopaySourceConfig;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/autopay/ui/screen/amount/input/InputAmountScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Picker", "Lcom/revolut/feature/credit/autopay/ui/screen/amount/input/InputAmountScreenContract$ModalStep$Picker;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InputAmountScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/autopay/ui/screen/amount/input/InputAmountScreenContract$ModalStep$Picker;", "Lcom/revolut/feature/credit/autopay/ui/screen/amount/input/InputAmountScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Picker implements InputAmountScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Picker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditAutopaySourceConfig f68606a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Picker((CreditAutopaySourceConfig) parcel.readParcelable(Picker.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Picker[i];
            }
        }

        public Picker(CreditAutopaySourceConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f68606a = config;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Picker) && Intrinsics.f(this.f68606a, ((Picker) obj2).f68606a);
        }

        public final int hashCode() {
            return this.f68606a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f68606a, i);
        }
    }
}
