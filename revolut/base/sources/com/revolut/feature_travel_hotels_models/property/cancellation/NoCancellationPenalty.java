package com.revolut.feature_travel_hotels_models.property.cancellation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/cancellation/NoCancellationPenalty;", "Lcom/revolut/feature_travel_hotels_models/property/cancellation/CancelPenalties;", "Landroid/os/Parcelable;", "<init>", "()V", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NoCancellationPenalty extends CancelPenalties implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NoCancellationPenalty f98082a = new NoCancellationPenalty();

    @NotNull
    public static final Parcelable.Creator<NoCancellationPenalty> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return NoCancellationPenalty.f98082a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NoCancellationPenalty[i];
        }
    }

    private NoCancellationPenalty() {
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
