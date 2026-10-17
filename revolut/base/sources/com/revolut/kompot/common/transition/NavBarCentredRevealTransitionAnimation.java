package com.revolut.kompot.common.transition;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/common/transition/NavBarCentredRevealTransitionAnimation;", "Lcom/revolut/kompot/navigable/TransitionAnimation$Custom;", "", "toString", "()Ljava/lang/String;", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NavBarCentredRevealTransitionAnimation implements TransitionAnimation.Custom {

    @NotNull
    public static final Parcelable.Creator<NavBarCentredRevealTransitionAnimation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f98361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f98362c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NavBarCentredRevealTransitionAnimation(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NavBarCentredRevealTransitionAnimation[i];
        }
    }

    public NavBarCentredRevealTransitionAnimation(int i, int i2, int i3) {
        this.f98360a = i;
        this.f98361b = i2;
        this.f98362c = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NavBarCentredRevealTransitionAnimation)) {
            return false;
        }
        NavBarCentredRevealTransitionAnimation navBarCentredRevealTransitionAnimation = (NavBarCentredRevealTransitionAnimation) obj2;
        return this.f98360a == navBarCentredRevealTransitionAnimation.f98360a && this.f98361b == navBarCentredRevealTransitionAnimation.f98361b && this.f98362c == navBarCentredRevealTransitionAnimation.f98362c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f98362c) + j6.a.b(this.f98361b, Integer.hashCode(this.f98360a) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f98360a);
        dest.writeInt(this.f98361b);
        dest.writeInt(this.f98362c);
    }
}
