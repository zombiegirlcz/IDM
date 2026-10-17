package com.revolut.kompot.bridge.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.feature.SingleActivityReadyFeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhi.b;
import yhm.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/kompot/bridge/navigation/KompotOverlayFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/SingleActivityReadyFeatureConfig;", "", "toString", "()Ljava/lang/String;", "kompot_bridge_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class KompotOverlayFeatureConfig implements KompotFeatureConfig, SingleActivityReadyFeatureConfig {

    @NotNull
    public static final Parcelable.Creator<KompotOverlayFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParcelableDestination f98277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f98278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f98279c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new KompotOverlayFeatureConfig((ParcelableDestination) parcel.readParcelable(KompotOverlayFeatureConfig.class.getClassLoader()), b.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new KompotOverlayFeatureConfig[i];
        }
    }

    public KompotOverlayFeatureConfig(ParcelableDestination destination, b overlayStyle, Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(overlayStyle, "overlayStyle");
        this.f98277a = destination;
        this.f98278b = overlayStyle;
        this.f98279c = num;
        this.d = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof KompotOverlayFeatureConfig)) {
            return false;
        }
        KompotOverlayFeatureConfig kompotOverlayFeatureConfig = (KompotOverlayFeatureConfig) obj2;
        return Intrinsics.f(this.f98277a, kompotOverlayFeatureConfig.f98277a) && this.f98278b == kompotOverlayFeatureConfig.f98278b && Intrinsics.f(this.f98279c, kompotOverlayFeatureConfig.f98279c) && this.d == kompotOverlayFeatureConfig.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f98278b.hashCode() + (this.f98277a.hashCode() * 31)) * 31;
        Integer num = this.f98279c;
        return Boolean.hashCode(this.d) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f98277a, i);
        dest.writeString(this.f98278b.name());
        Integer num = this.f98279c;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeInt(this.d ? 1 : 0);
    }

    public /* synthetic */ KompotOverlayFeatureConfig(ParcelableDestination parcelableDestination, b bVar, Integer num, int i) {
        this(parcelableDestination, bVar, (i & 4) != 0 ? null : num, false);
    }
}
