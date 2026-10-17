package com.revolut.feature.apm.core.ui.api.navigation;

import aii.q;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.ParcelableControllerDescriptor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/apm/core/ui/api/navigation/PaymentsBreakdownNavigation$Descriptor", "Lcom/revolut/kompot/common/ParcelableControllerDescriptor;", "Laii/q;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentsBreakdownNavigation$Descriptor implements ParcelableControllerDescriptor<q> {

    @NotNull
    public static final Parcelable.Creator<PaymentsBreakdownNavigation$Descriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentsBreakdownNavigation$InputData f62305a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentsBreakdownNavigation$Descriptor(PaymentsBreakdownNavigation$InputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentsBreakdownNavigation$Descriptor[i];
        }
    }

    public PaymentsBreakdownNavigation$Descriptor(PaymentsBreakdownNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f62305a = inputData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PaymentsBreakdownNavigation$Descriptor) && Intrinsics.f(this.f62305a, ((PaymentsBreakdownNavigation$Descriptor) obj2).f62305a);
    }

    public final int hashCode() {
        return this.f62305a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f62305a.writeToParcel(dest, i);
    }
}
