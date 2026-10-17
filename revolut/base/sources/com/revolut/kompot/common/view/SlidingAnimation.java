package com.revolut.kompot.common.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.TransitionAnimation;
import dy0.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qo0.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/kompot/common/view/SlidingAnimation;", "Lcom/revolut/kompot/navigable/TransitionAnimation$ViewDelegated;", "Lqo0/f;", "", "toString", "()Ljava/lang/String;", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SlidingAnimation implements TransitionAnimation.ViewDelegated, f {

    @NotNull
    public static final Parcelable.Creator<SlidingAnimation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f98374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f98375c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SlidingAnimation(parcel.readInt(), o.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SlidingAnimation[i];
        }
    }

    public SlidingAnimation(int i, o direction, boolean z) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.f98373a = i;
        this.f98374b = direction;
        this.f98375c = z;
    }

    @Override // qo0.f
    public final boolean E0() {
        return true;
    }

    @Override // com.revolut.kompot.navigable.TransitionAnimation.ViewDelegated
    /* JADX INFO: renamed from: b0, reason: from getter */
    public final int getF98373a() {
        return this.f98373a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SlidingAnimation)) {
            return false;
        }
        SlidingAnimation slidingAnimation = (SlidingAnimation) obj2;
        return this.f98373a == slidingAnimation.f98373a && this.f98374b == slidingAnimation.f98374b && this.f98375c == slidingAnimation.f98375c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f98375c) + ((this.f98374b.hashCode() + (Integer.hashCode(this.f98373a) * 31)) * 31);
    }

    @Override // com.revolut.kompot.navigable.TransitionAnimation
    /* JADX INFO: renamed from: m3 */
    public final boolean getD() {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f98373a);
        dest.writeString(this.f98374b.name());
        dest.writeInt(this.f98375c ? 1 : 0);
    }
}
