package com.revolut.feature.junior_transfer.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_transfer/api/navigation/JuniorBlockInboundTransferNavigation$Destination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_junior_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorBlockInboundTransferNavigation$Destination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<JuniorBlockInboundTransferNavigation$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorBlockInboundTransferNavigation$Junior f77406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JuniorBlockInboundTransferNavigation$Mode f77407b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorBlockInboundTransferNavigation$Destination(JuniorBlockInboundTransferNavigation$Junior.CREATOR.createFromParcel(parcel), (JuniorBlockInboundTransferNavigation$Mode) parcel.readParcelable(JuniorBlockInboundTransferNavigation$Destination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorBlockInboundTransferNavigation$Destination[i];
        }
    }

    public JuniorBlockInboundTransferNavigation$Destination(JuniorBlockInboundTransferNavigation$Junior junior, JuniorBlockInboundTransferNavigation$Mode mode) {
        Intrinsics.checkNotNullParameter(junior, "junior");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f77406a = junior;
        this.f77407b = mode;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final JuniorBlockInboundTransferNavigation$Junior getF77406a() {
        return this.f77406a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final JuniorBlockInboundTransferNavigation$Mode getF77407b() {
        return this.f77407b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorBlockInboundTransferNavigation$Destination)) {
            return false;
        }
        JuniorBlockInboundTransferNavigation$Destination juniorBlockInboundTransferNavigation$Destination = (JuniorBlockInboundTransferNavigation$Destination) obj2;
        return Intrinsics.f(this.f77406a, juniorBlockInboundTransferNavigation$Destination.f77406a) && Intrinsics.f(this.f77407b, juniorBlockInboundTransferNavigation$Destination.f77407b);
    }

    public final int hashCode() {
        return this.f77407b.hashCode() + (this.f77406a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f77406a.writeToParcel(dest, i);
        dest.writeParcelable(this.f77407b, i);
    }
}
