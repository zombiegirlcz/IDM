package com.revolut.core.ui_kit_core.displayers.image.transformation;

import android.os.Parcel;
import android.os.Parcelable;
import gz0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/transformation/ImageTransformations;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "gz0/b", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ImageTransformations implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ImageTransformations> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f60063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ShapeTransformation f60064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CustomColors f60065c;
    public final b d;
    public final Integer e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f60066g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ImageTransformations(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (ShapeTransformation) parcel.readParcelable(ImageTransformations.class.getClassLoader()), parcel.readInt() == 0 ? null : CustomColors.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ImageTransformations[i];
        }
    }

    public ImageTransformations() {
        this(null, null, null, null, null, null, null, CertificateBody.profileType);
    }

    public static ImageTransformations a(ImageTransformations imageTransformations, CircleTransformation circleTransformation, CustomColors customColors, b bVar, int i) {
        Integer num = imageTransformations.f60063a;
        ShapeTransformation shapeTransformation = circleTransformation;
        if ((i & 2) != 0) {
            shapeTransformation = imageTransformations.f60064b;
        }
        ShapeTransformation shapeTransformation2 = shapeTransformation;
        if ((i & 4) != 0) {
            customColors = imageTransformations.f60065c;
        }
        CustomColors customColors2 = customColors;
        if ((i & 8) != 0) {
            bVar = imageTransformations.d;
        }
        Integer num2 = imageTransformations.e;
        Integer num3 = imageTransformations.f;
        Integer num4 = imageTransformations.f60066g;
        imageTransformations.getClass();
        return new ImageTransformations(num, shapeTransformation2, customColors2, bVar, num2, num3, num4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ImageTransformations)) {
            return false;
        }
        ImageTransformations imageTransformations = (ImageTransformations) obj2;
        return Intrinsics.f(this.f60063a, imageTransformations.f60063a) && Intrinsics.f(this.f60064b, imageTransformations.f60064b) && Intrinsics.f(this.f60065c, imageTransformations.f60065c) && this.d == imageTransformations.d && Intrinsics.f(this.e, imageTransformations.e) && Intrinsics.f(this.f, imageTransformations.f) && Intrinsics.f(this.f60066g, imageTransformations.f60066g);
    }

    public final int hashCode() {
        Integer num = this.f60063a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        ShapeTransformation shapeTransformation = this.f60064b;
        int iHashCode2 = (iHashCode + (shapeTransformation == null ? 0 : shapeTransformation.hashCode())) * 31;
        CustomColors customColors = this.f60065c;
        int iHashCode3 = (iHashCode2 + (customColors == null ? 0 : customColors.hashCode())) * 31;
        b bVar = this.d;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f60066g;
        return iHashCode6 + (num4 != null ? num4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.f60063a;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeParcelable(this.f60064b, i);
        CustomColors customColors = this.f60065c;
        if (customColors == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            customColors.writeToParcel(dest, i);
        }
        b bVar = this.d;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        Integer num2 = this.e;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
        Integer num3 = this.f;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num3);
        }
        Integer num4 = this.f60066g;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num4);
        }
    }

    public ImageTransformations(Integer num, ShapeTransformation shapeTransformation, CustomColors customColors, b bVar, Integer num2, Integer num3, Integer num4) {
        this.f60063a = num;
        this.f60064b = shapeTransformation;
        this.f60065c = customColors;
        this.d = bVar;
        this.e = num2;
        this.f = num3;
        this.f60066g = num4;
    }

    public /* synthetic */ ImageTransformations(Integer num, ShapeTransformation shapeTransformation, CustomColors customColors, b bVar, Integer num2, Integer num3, Integer num4, int i) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : shapeTransformation, (i & 4) != 0 ? null : customColors, (i & 8) != 0 ? null : bVar, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : num4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ImageTransformations(CircleTransformation circleTransformation, boolean z, boolean z3, Integer num, Integer num2, Integer num3, int i) {
        b bVar;
        CircleTransformation circleTransformation2 = (i & 2) != 0 ? null : circleTransformation;
        z = (i & 4) != 0 ? false : z;
        boolean z4 = (i & 8) == 0;
        z3 = (i & 32) != 0 ? true : z3;
        Integer num4 = (i & 64) != 0 ? null : num;
        Integer num5 = (i & 128) != 0 ? null : num2;
        Integer num6 = (i & 256) != 0 ? null : num3;
        if (z4) {
            bVar = b.FitCenter;
        } else if (z) {
            bVar = b.CenterCrop;
        } else if (z3) {
            bVar = b.CenterInside;
        } else {
            bVar = b.Undefined;
        }
        this(null, circleTransformation2, null, bVar, num4, num5, num6, 4);
    }
}
