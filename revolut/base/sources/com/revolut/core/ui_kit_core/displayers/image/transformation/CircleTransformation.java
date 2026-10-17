package com.revolut.core.ui_kit_core.displayers.image.transformation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r6.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/transformation/CircleTransformation;", "Lcom/revolut/core/ui_kit_core/displayers/image/transformation/ShapeTransformation;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CircleTransformation extends ShapeTransformation {

    @NotNull
    public static final Parcelable.Creator<CircleTransformation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f60057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f60058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f60059c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CircleTransformation(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CircleTransformation[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CircleTransformation() {
        this((Float) null, (Integer) (0 == true ? 1 : 0), false, 15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CircleTransformation)) {
            return false;
        }
        CircleTransformation circleTransformation = (CircleTransformation) obj2;
        return Intrinsics.f(this.f60057a, circleTransformation.f60057a) && Intrinsics.f(this.f60058b, circleTransformation.f60058b) && this.f60059c == circleTransformation.f60059c && this.d == circleTransformation.d;
    }

    public final int hashCode() {
        Float f = this.f60057a;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Integer num = this.f60058b;
        return Boolean.hashCode(this.d) + j6.a.c((iHashCode + (num != null ? num.hashCode() : 0)) * 31, 31, this.f60059c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Float f = this.f60057a;
        if (f == null) {
            dest.writeInt(0);
        } else {
            b.p(dest, 1, f);
        }
        Integer num = this.f60058b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeInt(this.f60059c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
    }

    public CircleTransformation(Float f, Integer num, boolean z, boolean z3) {
        this.f60057a = f;
        this.f60058b = num;
        this.f60059c = z;
        this.d = z3;
    }

    public /* synthetic */ CircleTransformation(Float f, Integer num, boolean z, int i) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : num, (i & 4) == 0, (i & 8) != 0 ? true : z);
    }
}
