package com.revolut.feature.transport.models.user;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/models/user/TransportEligibilityState;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transport_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransportEligibilityState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransportEligibilityState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cxf.a f92737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransportTerms f92738b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransportEligibilityState(cxf.a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : TransportTerms.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransportEligibilityState[i];
        }
    }

    public TransportEligibilityState(cxf.a status, TransportTerms transportTerms) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f92737a = status;
        this.f92738b = transportTerms;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransportEligibilityState)) {
            return false;
        }
        TransportEligibilityState transportEligibilityState = (TransportEligibilityState) obj2;
        return this.f92737a == transportEligibilityState.f92737a && Intrinsics.f(this.f92738b, transportEligibilityState.f92738b);
    }

    public final int hashCode() {
        int iHashCode = this.f92737a.hashCode() * 31;
        TransportTerms transportTerms = this.f92738b;
        return iHashCode + (transportTerms == null ? 0 : transportTerms.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92737a.name());
        TransportTerms transportTerms = this.f92738b;
        if (transportTerms == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            transportTerms.writeToParcel(dest, i);
        }
    }
}
