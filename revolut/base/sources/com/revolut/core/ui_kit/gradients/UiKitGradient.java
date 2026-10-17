package com.revolut.core.ui_kit.gradients;

import android.graphics.drawable.GradientDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_resources.R$attr;
import hx7.e;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/gradients/UiKitGradient;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UiKitGradient implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UiKitGradient> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f55827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f55828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GradientDrawable.Orientation f55829c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UiKitGradient(parcel.createIntArray(), parcel.createFloatArray(), GradientDrawable.Orientation.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UiKitGradient[i];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UiKitGradient f55830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final UiKitGradient f55831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final UiKitGradient f55832c;
        public static final UiKitGradient d = new UiKitGradient(new int[]{R$attr.uikit_colorPlanPrivateDark, R$attr.uikit_colorPlanPrivateLight}, new float[]{0.2f, 0.8f}, GradientDrawable.Orientation.TOP_BOTTOM);
        public static final UiKitGradient e = new UiKitGradient(new int[]{R$attr.uikit_colorPlanUltraDark, R$attr.uikit_colorPlanUltraLight, R$attr.uikit_colorPlanUltraMid, R$attr.uikit_colorPlanUltraLightBlue}, new float[]{0.2f, 0.5f, 0.8f, 1.0f}, GradientDrawable.Orientation.BL_TR);

        static {
            GradientDrawable.Orientation orientation = null;
            int i = 4;
            f55830a = new UiKitGradient(new int[]{R$attr.uikit_colorPlanPremiumDark, R$attr.uikit_colorPlanPremiumLight}, new float[]{0.5f, 1.0f}, orientation, i);
            f55831b = new UiKitGradient(new int[]{R$attr.uikit_colorPlanMetalDark, R$attr.uikit_colorPlanMetalLight}, new float[]{0.4f, 1.0f}, orientation, i);
            f55832c = new UiKitGradient(new int[]{R$attr.uikit_colorPlanUltraDark, R$attr.uikit_colorPlanUltraLight}, new float[]{0.3f, 1.0f}, orientation, i);
        }

        private b() {
        }
    }

    public UiKitGradient(int[] colorsAttrs, float[] fArr, GradientDrawable.Orientation orientation) {
        Intrinsics.checkNotNullParameter(colorsAttrs, "colorsAttrs");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.f55827a = colorsAttrs;
        this.f55828b = fArr;
        this.f55829c = orientation;
        if (fArr == null || fArr.length == colorsAttrs.length) {
            return;
        }
        e.h(new IllegalArgumentException("color and positions must be of equal length"));
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float[] getF55828b() {
        return this.f55828b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final GradientDrawable.Orientation getF55829c() {
        return this.f55829c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!UiKitGradient.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.gradients.UiKitGradient");
        UiKitGradient uiKitGradient = (UiKitGradient) obj2;
        return Arrays.equals(this.f55827a, uiKitGradient.f55827a) && Arrays.equals(this.f55828b, uiKitGradient.f55828b) && this.f55829c == uiKitGradient.f55829c;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f55827a) * 31;
        float[] fArr = this.f55828b;
        return this.f55829c.hashCode() + ((iHashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeIntArray(this.f55827a);
        dest.writeFloatArray(this.f55828b);
        dest.writeString(this.f55829c.name());
    }

    public /* synthetic */ UiKitGradient(int[] iArr, float[] fArr, GradientDrawable.Orientation orientation, int i) {
        this(iArr, (i & 2) != 0 ? null : fArr, (i & 4) != 0 ? GradientDrawable.Orientation.TL_BR : orientation);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UiKitGradient(int i, int i2, int i3) {
        this(i, i2);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TL_BR;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UiKitGradient(int i, int i2) {
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TL_BR;
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this(new int[]{i, i2}, (float[]) null, orientation);
    }
}
