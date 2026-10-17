package com.revolut.feature.pix.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/revolut/feature/pix/api/navigation/PixAreaNavigation$Destination", "Lcom/revolut/feature/pix/api/navigation/PixNavigation$Destination;", "Lcom/revolut/feature/pix/api/navigation/PixAreaNavigation$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixAreaNavigation$Destination extends PixNavigation$Destination<PixAreaNavigation$InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<PixAreaNavigation$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PixAreaNavigation$InputData f80495c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PixAreaNavigation$Destination(PixAreaNavigation$InputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixAreaNavigation$Destination[i];
        }
    }

    public PixAreaNavigation$Destination() {
        this(0);
    }

    @Override // com.revolut.feature.pix.api.navigation.PixNavigation$Destination, com.revolut.kompot.common.InternalDestination
    /* JADX INFO: renamed from: b */
    public final IOData$Input getF80510b() {
        return this.f80495c;
    }

    @Override // com.revolut.feature.pix.api.navigation.PixNavigation$Destination
    /* JADX INFO: renamed from: c */
    public final PixNavigation$InputData getF98300a() {
        return this.f80495c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PixAreaNavigation$Destination) && Intrinsics.f(this.f80495c, ((PixAreaNavigation$Destination) obj2).f80495c);
    }

    public final int hashCode() {
        return this.f80495c.f80496a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f80495c.writeToParcel(dest, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PixAreaNavigation$Destination(PixAreaNavigation$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f80495c = inputData;
    }

    public /* synthetic */ PixAreaNavigation$Destination(int i) {
        this(new PixAreaNavigation$InputData(0));
    }
}
