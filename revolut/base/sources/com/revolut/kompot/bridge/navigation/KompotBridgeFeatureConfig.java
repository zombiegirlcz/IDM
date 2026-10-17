package com.revolut.kompot.bridge.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotFeatureConfig;", "kompot_bridge_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public class KompotBridgeFeatureConfig implements KompotFeatureConfig {

    @NotNull
    public static final Parcelable.Creator<KompotBridgeFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityAnimation f98273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParcelableDestination f98274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f98275c;
    public final Integer d;
    public final int e;
    public final boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Integer num;
            int i;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ActivityAnimation activityAnimation = (ActivityAnimation) parcel.readParcelable(KompotBridgeFeatureConfig.class.getClassLoader());
            ParcelableDestination parcelableDestination = (ParcelableDestination) parcel.readParcelable(KompotBridgeFeatureConfig.class.getClassLoader());
            boolean z4 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z3 = true;
                num = numValueOf;
                i = i2;
            } else {
                num = numValueOf;
                i = i2;
                z3 = z;
            }
            return new KompotBridgeFeatureConfig(activityAnimation, parcelableDestination, z4, num, i, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new KompotBridgeFeatureConfig[i];
        }
    }

    public KompotBridgeFeatureConfig(ActivityAnimation activityAnimation, ParcelableDestination destination, boolean z, Integer num, int i, boolean z3) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f98273a = activityAnimation;
        this.f98274b = destination;
        this.f98275c = z;
        this.d = num;
        this.e = i;
        this.f = z3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public ActivityAnimation getF98273a() {
        return this.f98273a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public int getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public Integer getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!getClass().equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig");
        KompotBridgeFeatureConfig kompotBridgeFeatureConfig = (KompotBridgeFeatureConfig) obj2;
        return Intrinsics.f(getF98273a(), kompotBridgeFeatureConfig.getF98273a()) && Intrinsics.f(this.f98274b, kompotBridgeFeatureConfig.f98274b) && this.f98275c == kompotBridgeFeatureConfig.f98275c && Intrinsics.f(getD(), kompotBridgeFeatureConfig.getD()) && getE() == kompotBridgeFeatureConfig.getE() && this.f == kompotBridgeFeatureConfig.f;
    }

    public int hashCode() {
        ActivityAnimation f98273a = getF98273a();
        int iC = j6.a.c((this.f98274b.hashCode() + ((f98273a != null ? f98273a.hashCode() : 0) * 31)) * 31, 31, this.f98275c);
        Integer d = getD();
        return Boolean.hashCode(this.f) + ((getE() + ((iC + (d != null ? d.intValue() : 0)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f98273a, i);
        dest.writeParcelable(this.f98274b, i);
        dest.writeInt(this.f98275c ? 1 : 0);
        Integer num = this.d;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeInt(this.e);
        dest.writeInt(this.f ? 1 : 0);
    }

    public /* synthetic */ KompotBridgeFeatureConfig(ActivityAnimation activityAnimation, ParcelableDestination parcelableDestination, boolean z, Integer num, int i, int i2) {
        this((i2 & 1) != 0 ? null : activityAnimation, parcelableDestination, (i2 & 4) != 0 ? true : z, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? 0 : i, (i2 & 32) == 0);
    }
}
