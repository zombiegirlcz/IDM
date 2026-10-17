package com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/onboarding/impl/onboarding/waiting_list/awaiting/WaitingListAwaitingScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WaitingListAwaitingScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WaitingListAwaitingScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f78499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rbl.a f78500b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WaitingListAwaitingScreenContract$InputData((b) parcel.readSerializable(), rbl.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WaitingListAwaitingScreenContract$InputData[i];
        }
    }

    public WaitingListAwaitingScreenContract$InputData(b country, rbl.a backNavigationType) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        this.f78499a = country;
        this.f78500b = backNavigationType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WaitingListAwaitingScreenContract$InputData)) {
            return false;
        }
        WaitingListAwaitingScreenContract$InputData waitingListAwaitingScreenContract$InputData = (WaitingListAwaitingScreenContract$InputData) obj2;
        return Intrinsics.f(this.f78499a, waitingListAwaitingScreenContract$InputData.f78499a) && this.f78500b == waitingListAwaitingScreenContract$InputData.f78500b;
    }

    public final int hashCode() {
        return this.f78500b.hashCode() + (this.f78499a.f297794a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f78499a);
        dest.writeString(this.f78500b.name());
    }
}
