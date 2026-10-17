package com.revolut.feature.chooser.external_map.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/chooser/external_map/navigation/BottomChooserExternalMapDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_chooser_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BottomChooserExternalMapDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<BottomChooserExternalMapDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f65918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f65919b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BottomChooserExternalMapDestination(parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BottomChooserExternalMapDestination[i];
        }
    }

    public BottomChooserExternalMapDestination(double d, double d5) {
        this.f65918a = d;
        this.f65919b = d5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getF65918a() {
        return this.f65918a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getF65919b() {
        return this.f65919b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BottomChooserExternalMapDestination)) {
            return false;
        }
        BottomChooserExternalMapDestination bottomChooserExternalMapDestination = (BottomChooserExternalMapDestination) obj2;
        return Double.compare(this.f65918a, bottomChooserExternalMapDestination.f65918a) == 0 && Double.compare(this.f65919b, bottomChooserExternalMapDestination.f65919b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f65919b) + (Double.hashCode(this.f65918a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.f65918a);
        dest.writeDouble(this.f65919b);
    }
}
