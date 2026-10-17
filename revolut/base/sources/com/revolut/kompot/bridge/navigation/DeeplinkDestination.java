package com.revolut.kompot.bridge.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.ParcelableDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/bridge/navigation/DeeplinkDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "kompot_bridge_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class DeeplinkDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<DeeplinkDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParcelableDestination f98271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParcelableDestination f98272b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeeplinkDestination((ParcelableDestination) parcel.readParcelable(DeeplinkDestination.class.getClassLoader()), (ParcelableDestination) parcel.readParcelable(DeeplinkDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeeplinkDestination[i];
        }
    }

    public DeeplinkDestination(ParcelableDestination parcelableDestination, ParcelableDestination targetDestination) {
        Intrinsics.checkNotNullParameter(targetDestination, "targetDestination");
        this.f98271a = parcelableDestination;
        this.f98272b = targetDestination;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ParcelableDestination getF98271a() {
        return this.f98271a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ParcelableDestination getF98272b() {
        return this.f98272b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeeplinkDestination)) {
            return false;
        }
        DeeplinkDestination deeplinkDestination = (DeeplinkDestination) obj2;
        return Intrinsics.f(this.f98271a, deeplinkDestination.f98271a) && Intrinsics.f(this.f98272b, deeplinkDestination.f98272b);
    }

    public final int hashCode() {
        ParcelableDestination parcelableDestination = this.f98271a;
        return this.f98272b.hashCode() + ((parcelableDestination == null ? 0 : parcelableDestination.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f98271a, i);
        dest.writeParcelable(this.f98272b, i);
    }
}
