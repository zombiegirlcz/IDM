package com.revolut.core.ui_kit.internal.views;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.ViewUtils;
import com.revolut.core.ui_kit.internal.views.RingShape;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/ProgressStyle;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProgressStyle implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f56334c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f56335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f56336h;
    public final ProgressAnimation i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RingShape f56337j;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<ProgressStyle> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.ProgressStyle$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static ProgressStyle b(int i, int i2, int i3) {
            return new ProgressStyle(i, 100, i2, i2, i3, 2.0f, 2.0f, null, ViewUtils.EDGE_TO_EDGE_FLAGS);
        }

        public static /* synthetic */ ProgressStyle c(Companion companion, int i, int i2) {
            int i3 = R$attr.uikit_colorGreyTone10;
            companion.getClass();
            return b(i, i2, i3);
        }

        public final ProgressStyle a(int i) {
            return b(i, R$attr.uikit_colorBlue, R$attr.uikit_colorGreyTone10);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProgressStyle(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readInt() == 0 ? null : ProgressAnimation.CREATOR.createFromParcel(parcel), (RingShape) parcel.readParcelable(ProgressStyle.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProgressStyle[i];
        }
    }

    public ProgressStyle(int i, int i2, int i3, int i5, int i6, int i21, float f, float f4, ProgressAnimation progressAnimation, RingShape ringShape) {
        Intrinsics.checkNotNullParameter(ringShape, "ringShape");
        this.f56332a = i;
        this.f56333b = i2;
        this.f56334c = i3;
        this.d = i5;
        this.e = i6;
        this.f = i21;
        this.f56335g = f;
        this.f56336h = f4;
        this.i = progressAnimation;
        this.f56337j = ringShape;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ProgressStyle)) {
            return false;
        }
        ProgressStyle progressStyle = (ProgressStyle) obj2;
        return this.f56332a == progressStyle.f56332a && this.f56333b == progressStyle.f56333b && this.f56334c == progressStyle.f56334c && this.d == progressStyle.d && this.e == progressStyle.e && this.f == progressStyle.f && Float.compare(this.f56335g, progressStyle.f56335g) == 0 && Float.compare(this.f56336h, progressStyle.f56336h) == 0 && Intrinsics.f(this.i, progressStyle.i) && Intrinsics.f(this.f56337j, progressStyle.f56337j);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.f56336h, m72.b.b(this.f56335g, j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f56334c, j6.a.b(this.f56333b, Integer.hashCode(this.f56332a) * 31, 31), 31), 31), 31), 31), 31), 31);
        ProgressAnimation progressAnimation = this.i;
        return this.f56337j.hashCode() + ((iB + (progressAnimation == null ? 0 : progressAnimation.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f56332a);
        dest.writeInt(this.f56333b);
        dest.writeInt(this.f56334c);
        dest.writeInt(this.d);
        dest.writeInt(this.e);
        dest.writeInt(this.f);
        dest.writeFloat(this.f56335g);
        dest.writeFloat(this.f56336h);
        ProgressAnimation progressAnimation = this.i;
        if (progressAnimation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            progressAnimation.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f56337j, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ProgressStyle(int i, int i2, int i3, int i5, int i6, float f, float f4, ProgressAnimation progressAnimation, int i21) {
        RingShape ringShape;
        ProgressAnimation progressAnimation2 = (i21 & 256) != 0 ? null : progressAnimation;
        if ((i21 & 512) != 0) {
            ringShape = RingShape.Full.f56369a;
        } else {
            ringShape = RingShape.Timer.f56370a;
        }
        this(i, i2, i3, i5, 0, i6, f, f4, progressAnimation2, ringShape);
    }
}
