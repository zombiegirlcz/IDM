package com.revolut.feature.atm.impl.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.StackDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/atm/impl/navigation/AtmsMapFlowDestination;", "Lcom/revolut/kompot/common/StackDestination;", "", "toString", "()Ljava/lang/String;", "feature_atm_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AtmsMapFlowDestination implements StackDestination {

    @NotNull
    public static final Parcelable.Creator<AtmsMapFlowDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransitionAnimation f63154a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AtmsMapFlowDestination((TransitionAnimation) parcel.readParcelable(AtmsMapFlowDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AtmsMapFlowDestination[i];
        }
    }

    public AtmsMapFlowDestination(TransitionAnimation transitionAnimation) {
        this.f63154a = transitionAnimation;
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final TransitionAnimation getF63154a() {
        return this.f63154a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof AtmsMapFlowDestination) && Intrinsics.f(this.f63154a, ((AtmsMapFlowDestination) obj2).f63154a);
    }

    public final int hashCode() {
        TransitionAnimation transitionAnimation = this.f63154a;
        if (transitionAnimation == null) {
            return 0;
        }
        return transitionAnimation.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f63154a, i);
    }

    public AtmsMapFlowDestination() {
        this(null);
    }
}
