package com.revolut.feature.apm.wero.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.wero.api.navigation.WeroNavigation$StartType;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/revolut/feature/apm/wero/api/navigation/WeroNavigation$Destination", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/apm/wero/api/navigation/WeroNavigation$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_apm_wero_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WeroNavigation$Destination extends InternalDestination<WeroNavigation$InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<WeroNavigation$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeroNavigation$StartType f63017b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WeroNavigation$Destination((WeroNavigation$StartType) parcel.readParcelable(WeroNavigation$Destination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WeroNavigation$Destination[i];
        }
    }

    public WeroNavigation$Destination() {
        this(WeroNavigation$StartType.Area.f63019a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof WeroNavigation$Destination) && Intrinsics.f(this.f63017b, ((WeroNavigation$Destination) obj2).f63017b);
    }

    public final int hashCode() {
        return this.f63017b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f63017b, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeroNavigation$Destination(WeroNavigation$StartType startType) {
        super(new WeroNavigation$InputData(startType));
        Intrinsics.checkNotNullParameter(startType, "startType");
        this.f63017b = startType;
    }
}
