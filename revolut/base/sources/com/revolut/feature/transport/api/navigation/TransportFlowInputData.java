package com.revolut.feature.transport.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transport.api.navigation.TransportStartType;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/api/navigation/TransportFlowInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_transport_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransportFlowInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransportFlowInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransportStartType f92497a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransportFlowInputData((TransportStartType) parcel.readParcelable(TransportFlowInputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransportFlowInputData[i];
        }
    }

    public TransportFlowInputData(TransportStartType startType) {
        Intrinsics.checkNotNullParameter(startType, "startType");
        this.f92497a = startType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof TransportFlowInputData) && Intrinsics.f(this.f92497a, ((TransportFlowInputData) obj2).f92497a);
    }

    public final int hashCode() {
        return this.f92497a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f92497a, i);
    }

    public TransportFlowInputData() {
        this(TransportStartType.Hub.Transit.f92499a);
    }
}
