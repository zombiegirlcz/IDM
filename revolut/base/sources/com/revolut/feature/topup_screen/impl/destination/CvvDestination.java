package com.revolut.feature.topup_screen.impl.destination;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/destination/CvvDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CvvDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CvvDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f90585b;

    /* JADX INFO: loaded from: classes8.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CvvDestination(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CvvDestination[i];
        }
    }

    public CvvDestination(String cardId, boolean z) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f90584a = cardId;
        this.f90585b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CvvDestination)) {
            return false;
        }
        CvvDestination cvvDestination = (CvvDestination) obj2;
        return Intrinsics.f(this.f90584a, cvvDestination.f90584a) && this.f90585b == cvvDestination.f90585b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f90585b) + (this.f90584a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f90584a);
        dest.writeInt(this.f90585b ? 1 : 0);
    }
}
