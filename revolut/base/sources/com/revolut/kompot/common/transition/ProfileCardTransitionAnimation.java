package com.revolut.kompot.common.transition;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.utils.ParcelableViewTarget;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/kompot/common/transition/ProfileCardTransitionAnimation;", "Lcom/revolut/kompot/navigable/TransitionAnimation$Custom;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProfileCardTransitionAnimation implements TransitionAnimation.Custom {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParcelableViewTarget f98363a;

    @NotNull
    public static final Parcelable.Creator<ProfileCardTransitionAnimation> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProfileCardTransitionAnimation((ParcelableViewTarget) parcel.readParcelable(ProfileCardTransitionAnimation.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProfileCardTransitionAnimation[i];
        }
    }

    public ProfileCardTransitionAnimation(ParcelableViewTarget avatarKey) {
        Intrinsics.checkNotNullParameter(avatarKey, "avatarKey");
        this.f98363a = avatarKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ProfileCardTransitionAnimation) && Intrinsics.f(this.f98363a, ((ProfileCardTransitionAnimation) obj2).f98363a);
    }

    public final int hashCode() {
        return this.f98363a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f98363a, i);
    }
}
