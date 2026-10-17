package com.revolut.feature.credit.application.plugins.impl.ui.waiting_list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ft3.j1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/waiting_list/WaitingListFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WaitingListFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WaitingListFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f68517a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WaitingListFlowContract$InputData(j1.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WaitingListFlowContract$InputData[i];
        }
    }

    public WaitingListFlowContract$InputData(j1 productType) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        this.f68517a = productType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68517a.name());
    }
}
