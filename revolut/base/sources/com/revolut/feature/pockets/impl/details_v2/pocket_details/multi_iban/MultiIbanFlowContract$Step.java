package com.revolut.feature.pockets.impl.details_v2.pocket_details.multi_iban;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/pockets/impl/details_v2/pocket_details/multi_iban/MultiIbanFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "VirtualIbanBottomSheet", "PurposeSelection", "Lcom/revolut/feature/pockets/impl/details_v2/pocket_details/multi_iban/MultiIbanFlowContract$Step$PurposeSelection;", "Lcom/revolut/feature/pockets/impl/details_v2/pocket_details/multi_iban/MultiIbanFlowContract$Step$VirtualIbanBottomSheet;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MultiIbanFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pockets/impl/details_v2/pocket_details/multi_iban/MultiIbanFlowContract$Step$PurposeSelection;", "Lcom/revolut/feature/pockets/impl/details_v2/pocket_details/multi_iban/MultiIbanFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PurposeSelection extends MultiIbanFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PurposeSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f80868a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PurposeSelection((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PurposeSelection[i];
            }
        }

        public PurposeSelection(b selectedCountryCode) {
            Intrinsics.checkNotNullParameter(selectedCountryCode, "selectedCountryCode");
            this.f80868a = selectedCountryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PurposeSelection) && Intrinsics.f(this.f80868a, ((PurposeSelection) obj2).f80868a);
        }

        public final int hashCode() {
            return this.f80868a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f80868a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pockets/impl/details_v2/pocket_details/multi_iban/MultiIbanFlowContract$Step$VirtualIbanBottomSheet;", "Lcom/revolut/feature/pockets/impl/details_v2/pocket_details/multi_iban/MultiIbanFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VirtualIbanBottomSheet extends MultiIbanFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<VirtualIbanBottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f80869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f80870b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VirtualIbanBottomSheet((b) parcel.readSerializable(), (xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VirtualIbanBottomSheet[i];
            }
        }

        public VirtualIbanBottomSheet(b countryCode, xi0.b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f80869a = currency;
            this.f80870b = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof VirtualIbanBottomSheet)) {
                return false;
            }
            VirtualIbanBottomSheet virtualIbanBottomSheet = (VirtualIbanBottomSheet) obj2;
            return Intrinsics.f(this.f80869a, virtualIbanBottomSheet.f80869a) && Intrinsics.f(this.f80870b, virtualIbanBottomSheet.f80870b);
        }

        public final int hashCode() {
            return this.f80870b.f297794a.hashCode() + (this.f80869a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f80869a);
            dest.writeSerializable(this.f80870b);
        }
    }

    private MultiIbanFlowContract$Step() {
    }
}
