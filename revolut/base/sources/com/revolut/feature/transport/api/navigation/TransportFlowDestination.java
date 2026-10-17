package com.revolut.feature.transport.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transport.api.navigation.TransportStartType;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/transport/api/navigation/TransportFlowDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/transport/api/navigation/TransportFlowInputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_transport_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransportFlowDestination extends InternalDestination<TransportFlowInputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<TransportFlowDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransportStartType f92496b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransportFlowDestination((TransportStartType) parcel.readParcelable(TransportFlowDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransportFlowDestination[i];
        }
    }

    public TransportFlowDestination() {
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
        return (obj2 instanceof TransportFlowDestination) && Intrinsics.f(this.f92496b, ((TransportFlowDestination) obj2).f92496b);
    }

    public final int hashCode() {
        return this.f92496b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f92496b, i);
    }

    public /* synthetic */ TransportFlowDestination(int i) {
        this(TransportStartType.Hub.Transit.f92499a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportFlowDestination(TransportStartType startType) {
        super(new TransportFlowInputData(startType));
        Intrinsics.checkNotNullParameter(startType, "startType");
        this.f92496b = startType;
    }
}
