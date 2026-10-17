package com.revolut.camerakit.ui.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/ui/models/Guideline;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "camera_kit_ui_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Guideline implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Guideline> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f50824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f50825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f50826c;
    public final float d;
    public final float e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Guideline(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Guideline[i];
        }
    }

    public Guideline(float f, float f4, float f5, float f6, float f32) {
        this.f50824a = f;
        this.f50825b = f4;
        this.f50826c = f5;
        this.d = f6;
        this.e = f32;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Guideline)) {
            return false;
        }
        Guideline guideline = (Guideline) obj2;
        return Float.compare(this.f50824a, guideline.f50824a) == 0 && Float.compare(this.f50825b, guideline.f50825b) == 0 && Float.compare(this.f50826c, guideline.f50826c) == 0 && Float.compare(this.d, guideline.d) == 0 && Float.compare(this.e, guideline.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + b.b(this.d, b.b(this.f50826c, b.b(this.f50825b, Float.hashCode(this.f50824a) * 31, 31), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeFloat(this.f50824a);
        dest.writeFloat(this.f50825b);
        dest.writeFloat(this.f50826c);
        dest.writeFloat(this.d);
        dest.writeFloat(this.e);
    }

    public /* synthetic */ Guideline(float f, float f4, float f5, float f6) {
        this(f, f4, f5, f6, 8.0f);
    }
}
