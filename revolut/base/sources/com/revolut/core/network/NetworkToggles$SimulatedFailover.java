package com.revolut.core.network;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.toggles.models.DevelopmentOnlyFeatureDefinition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/core/network/NetworkToggles$SimulatedFailover", "Lcom/revolut/feature/toggles/models/DevelopmentOnlyFeatureDefinition;", "<init>", "()V", "core_network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NetworkToggles$SimulatedFailover extends DevelopmentOnlyFeatureDefinition {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NetworkToggles$SimulatedFailover f51445a = new NetworkToggles$SimulatedFailover();

    @NotNull
    public static final Parcelable.Creator<NetworkToggles$SimulatedFailover> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return NetworkToggles$SimulatedFailover.f51445a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NetworkToggles$SimulatedFailover[i];
        }
    }

    private NetworkToggles$SimulatedFailover() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
