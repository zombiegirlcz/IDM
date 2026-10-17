package com.revolut.feature.pix.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/pix/api/navigation/PixAutomaticoNavigation$Destination", "Lcom/revolut/feature/pix/api/navigation/PixNavigation$Destination;", "Lcom/revolut/feature/pix/api/navigation/PixAutomaticoNavigation$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixAutomaticoNavigation$Destination extends PixNavigation$Destination<PixAutomaticoNavigation$InputData> implements KompotDestination {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final PixAutomaticoNavigation$Destination f80501c = new PixAutomaticoNavigation$Destination();

    @NotNull
    public static final Parcelable.Creator<PixAutomaticoNavigation$Destination> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return PixAutomaticoNavigation$Destination.f80501c;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixAutomaticoNavigation$Destination[i];
        }
    }

    private PixAutomaticoNavigation$Destination() {
        super(PixAutomaticoNavigation$InputData.f80502a);
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
