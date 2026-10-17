package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/models/MaskedImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "", "toString", "()Ljava/lang/String;", "MaskType", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MaskedImage implements Image {

    @NotNull
    public static final Parcelable.Creator<MaskedImage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f57816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaskType f57817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f57818c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/models/MaskedImage$MaskType;", "Landroid/os/Parcelable;", "Circle", "Lcom/revolut/core/ui_kit/models/MaskedImage$MaskType$Circle;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface MaskType extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/MaskedImage$MaskType$Circle;", "Lcom/revolut/core/ui_kit/models/MaskedImage$MaskType;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Circle implements MaskType {

            @NotNull
            public static final Parcelable.Creator<Circle> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final float f57819a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final float f57820b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Circle(parcel.readFloat(), parcel.readFloat());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Circle[i];
                }
            }

            public Circle(float f, float f4) {
                this.f57819a = f;
                this.f57820b = f4;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Circle)) {
                    return false;
                }
                Circle circle = (Circle) obj2;
                return Float.compare(this.f57819a, circle.f57819a) == 0 && Float.compare(this.f57820b, circle.f57820b) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.f57820b) + (Float.hashCode(this.f57819a) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeFloat(this.f57819a);
                dest.writeFloat(this.f57820b);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MaskedImage((Image) parcel.readParcelable(MaskedImage.class.getClassLoader()), (MaskType) parcel.readParcelable(MaskedImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MaskedImage[i];
        }
    }

    public MaskedImage(Image image, MaskType maskType) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(maskType, "maskType");
        this.f57816a = image;
        this.f57817b = maskType;
        this.f57818c = image.getF57818c();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MaskedImage)) {
            return false;
        }
        MaskedImage maskedImage = (MaskedImage) obj2;
        return Intrinsics.f(this.f57816a, maskedImage.f57816a) && Intrinsics.f(this.f57817b, maskedImage.f57817b);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getF57818c() {
        return this.f57818c;
    }

    public final int hashCode() {
        return this.f57817b.hashCode() + (this.f57816a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f57816a, i);
        dest.writeParcelable(this.f57817b, i);
    }
}
