package com.revolut.core.ui_kit.storiesdelegates;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/storiesdelegates/StoryColours;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoryColours implements Parcelable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final StoryColours f58276l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f58278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f58279c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f58280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f58281h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f58282j;
    public final int k;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<StoryColours> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.storiesdelegates.StoryColours$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoryColours(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoryColours[i];
        }
    }

    static {
        int i = R$attr.uikit_colorWhite;
        f58276l = new StoryColours(i, i, i, R$attr.uikit_colorWhite_30, i, i, i, i, R$attr.uikit_colorBlack, i, R$attr.uikit_colorWhite_20);
    }

    public StoryColours(int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32, int i33, int i43, int i59) {
        this.f58277a = i;
        this.f58278b = i2;
        this.f58279c = i3;
        this.d = i5;
        this.e = i6;
        this.f = i21;
        this.f58280g = i22;
        this.f58281h = i32;
        this.i = i33;
        this.f58282j = i43;
        this.k = i59;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoryColours)) {
            return false;
        }
        StoryColours storyColours = (StoryColours) obj2;
        return this.f58277a == storyColours.f58277a && this.f58278b == storyColours.f58278b && this.f58279c == storyColours.f58279c && this.d == storyColours.d && this.e == storyColours.e && this.f == storyColours.f && this.f58280g == storyColours.f58280g && this.f58281h == storyColours.f58281h && this.i == storyColours.i && this.f58282j == storyColours.f58282j && this.k == storyColours.k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.k) + j6.a.b(this.f58282j, j6.a.b(this.i, j6.a.b(this.f58281h, j6.a.b(this.f58280g, j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f58279c, j6.a.b(this.f58278b, Integer.hashCode(this.f58277a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f58277a);
        dest.writeInt(this.f58278b);
        dest.writeInt(this.f58279c);
        dest.writeInt(this.d);
        dest.writeInt(this.e);
        dest.writeInt(this.f);
        dest.writeInt(this.f58280g);
        dest.writeInt(this.f58281h);
        dest.writeInt(this.i);
        dest.writeInt(this.f58282j);
        dest.writeInt(this.k);
    }
}
