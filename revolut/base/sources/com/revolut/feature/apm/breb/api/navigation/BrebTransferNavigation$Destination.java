package com.revolut.feature.apm.breb.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.breb.api.navigation.BrebTransferNavigation$InputData;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/revolut/feature/apm/breb/api/navigation/BrebTransferNavigation$Destination", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/apm/breb/api/navigation/BrebTransferNavigation$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_apm_breb_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BrebTransferNavigation$Destination extends InternalDestination<BrebTransferNavigation$InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<BrebTransferNavigation$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BrebTransferNavigation$InputData f61705b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BrebTransferNavigation$Destination((BrebTransferNavigation$InputData) parcel.readParcelable(BrebTransferNavigation$Destination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BrebTransferNavigation$Destination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrebTransferNavigation$Destination(BrebTransferNavigation$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f61705b = inputData;
    }

    @Override // com.revolut.kompot.common.InternalDestination
    /* JADX INFO: renamed from: b */
    public final IOData$Input getF98300a() {
        return this.f61705b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof BrebTransferNavigation$Destination) && Intrinsics.f(this.f61705b, ((BrebTransferNavigation$Destination) obj2).f61705b);
    }

    public final int hashCode() {
        return this.f61705b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f61705b, i);
    }

    public BrebTransferNavigation$Destination() {
        this(BrebTransferNavigation$InputData.Send.f61707a);
    }
}
