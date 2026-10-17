package com.revolut.kompot.common.transition;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/common/transition/CardZoomTransitionAnimation;", "Lcom/revolut/kompot/navigable/TransitionAnimation$Custom;", "", "toString", "()Ljava/lang/String;", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardZoomTransitionAnimation implements TransitionAnimation.Custom {

    @NotNull
    public static final Parcelable.Creator<CardZoomTransitionAnimation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98357b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardZoomTransitionAnimation(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardZoomTransitionAnimation[i];
        }
    }

    public CardZoomTransitionAnimation(String smallCardItemId, String bigCardItemId) {
        Intrinsics.checkNotNullParameter(smallCardItemId, "smallCardItemId");
        Intrinsics.checkNotNullParameter(bigCardItemId, "bigCardItemId");
        this.f98356a = smallCardItemId;
        this.f98357b = bigCardItemId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardZoomTransitionAnimation)) {
            return false;
        }
        CardZoomTransitionAnimation cardZoomTransitionAnimation = (CardZoomTransitionAnimation) obj2;
        return Intrinsics.f(this.f98356a, cardZoomTransitionAnimation.f98356a) && Intrinsics.f(this.f98357b, cardZoomTransitionAnimation.f98357b);
    }

    public final int hashCode() {
        return this.f98357b.hashCode() + (this.f98356a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98356a);
        dest.writeString(this.f98357b);
    }
}
