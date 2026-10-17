package com.revolut.kompot.navigable.vc.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/kompot/navigable/vc/flow/BackStackEntry;", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "S", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BackStackEntry<S extends FlowStep> implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BackStackEntry<?>> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlowStep f98434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransitionAnimation f98435b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BackStackEntry((FlowStep) parcel.readParcelable(BackStackEntry.class.getClassLoader()), (TransitionAnimation) parcel.readParcelable(BackStackEntry.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BackStackEntry[i];
        }
    }

    public BackStackEntry(FlowStep step, TransitionAnimation animation) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f98434a = step;
        this.f98435b = animation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BackStackEntry)) {
            return false;
        }
        BackStackEntry backStackEntry = (BackStackEntry) obj2;
        return Intrinsics.f(this.f98434a, backStackEntry.f98434a) && Intrinsics.f(this.f98435b, backStackEntry.f98435b);
    }

    public final int hashCode() {
        return this.f98435b.hashCode() + (this.f98434a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f98434a, i);
        dest.writeParcelable(this.f98435b, i);
    }
}
