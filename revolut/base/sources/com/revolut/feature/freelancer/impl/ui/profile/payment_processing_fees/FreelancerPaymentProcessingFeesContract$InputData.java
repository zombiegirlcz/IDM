package com.revolut.feature.freelancer.impl.ui.profile.payment_processing_fees;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/profile/payment_processing_fees/FreelancerPaymentProcessingFeesContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerPaymentProcessingFeesContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FreelancerPaymentProcessingFeesContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f74053a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(as6.a.valueOf(parcel.readString()));
            }
            return new FreelancerPaymentProcessingFeesContract$InputData(linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerPaymentProcessingFeesContract$InputData[i];
        }
    }

    public FreelancerPaymentProcessingFeesContract$InputData() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof FreelancerPaymentProcessingFeesContract$InputData) && Intrinsics.f(this.f74053a, ((FreelancerPaymentProcessingFeesContract$InputData) obj2).f74053a);
    }

    public final int hashCode() {
        return this.f74053a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f74053a, dest);
        while (itV.hasNext()) {
            dest.writeString(((as6.a) itV.next()).name());
        }
    }

    public FreelancerPaymentProcessingFeesContract$InputData(Set includedGroupTypes) {
        Intrinsics.checkNotNullParameter(includedGroupTypes, "includedGroupTypes");
        this.f74053a = includedGroupTypes;
    }

    public /* synthetic */ FreelancerPaymentProcessingFeesContract$InputData(int i) {
        this(d0.i1(as6.a.a()));
    }
}
