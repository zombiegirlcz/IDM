package com.revolut.feature.atm.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.StackDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/atm/api/navigation/AtmLimitsExceptionDestination;", "Lcom/revolut/kompot/common/StackDestination;", "feature_atm_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AtmLimitsExceptionDestination implements StackDestination {

    @NotNull
    public static final Parcelable.Creator<AtmLimitsExceptionDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransitionAnimation f63151a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AtmLimitsExceptionDestination((TransitionAnimation) parcel.readParcelable(AtmLimitsExceptionDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AtmLimitsExceptionDestination[i];
        }
    }

    public AtmLimitsExceptionDestination(TransitionAnimation transitionAnimation) {
        this.f63151a = transitionAnimation;
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final TransitionAnimation getF63152a() {
        return this.f63151a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f63151a, i);
    }

    public AtmLimitsExceptionDestination() {
        this(null);
    }
}
