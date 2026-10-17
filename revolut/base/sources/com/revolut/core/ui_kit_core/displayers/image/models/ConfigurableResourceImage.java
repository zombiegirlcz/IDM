package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/ConfigurableResourceImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConfigurableResourceImage implements Image {

    @NotNull
    public static final Parcelable.Creator<ConfigurableResourceImage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f59882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f59883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f59884c;
    public final ImageView.ScaleType d;
    public final Integer e;
    public final Float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Float f59885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f59886h;
    public final Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Clause f59887j;

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConfigurableResourceImage(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readFloat(), parcel.readInt() == 0 ? null : ImageView.ScaleType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (Clause) parcel.readParcelable(ConfigurableResourceImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ConfigurableResourceImage[i];
        }
    }

    public ConfigurableResourceImage(int i, Integer num, float f, ImageView.ScaleType scaleType, Integer num2, Float f4, Float f5, Integer num3, Integer num4, Clause clause) {
        this.f59882a = i;
        this.f59883b = num;
        this.f59884c = f;
        this.d = scaleType;
        this.e = num2;
        this.f = f4;
        this.f59885g = f5;
        this.f59886h = num3;
        this.i = num4;
        this.f59887j = clause;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ConfigurableResourceImage)) {
            return false;
        }
        ConfigurableResourceImage configurableResourceImage = (ConfigurableResourceImage) obj2;
        return this.f59882a == configurableResourceImage.f59882a && Intrinsics.f(this.f59883b, configurableResourceImage.f59883b) && Float.compare(this.f59884c, configurableResourceImage.f59884c) == 0 && this.d == configurableResourceImage.d && Intrinsics.f(this.e, configurableResourceImage.e) && Intrinsics.f(this.f, configurableResourceImage.f) && Intrinsics.f(this.f59885g, configurableResourceImage.f59885g) && Intrinsics.f(this.f59886h, configurableResourceImage.f59886h) && Intrinsics.f(this.i, configurableResourceImage.i) && Intrinsics.f(this.f59887j, configurableResourceImage.f59887j);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getD() {
        return this.f59887j;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f59882a) * 31;
        Integer num = this.f59883b;
        int iB = m72.b.b(this.f59884c, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
        ImageView.ScaleType scaleType = this.d;
        int iHashCode2 = (iB + (scaleType == null ? 0 : scaleType.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f = this.f;
        int iHashCode4 = (iHashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        Float f4 = this.f59885g;
        int iHashCode5 = (iHashCode4 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Integer num3 = this.f59886h;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.i;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Clause clause = this.f59887j;
        return iHashCode7 + (clause != null ? clause.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f59882a);
        Integer num = this.f59883b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeFloat(this.f59884c);
        ImageView.ScaleType scaleType = this.d;
        if (scaleType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(scaleType.name());
        }
        Integer num2 = this.e;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
        Float f = this.f;
        if (f == null) {
            dest.writeInt(0);
        } else {
            r6.b.p(dest, 1, f);
        }
        Float f4 = this.f59885g;
        if (f4 == null) {
            dest.writeInt(0);
        } else {
            r6.b.p(dest, 1, f4);
        }
        Integer num3 = this.f59886h;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num3);
        }
        Integer num4 = this.i;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num4);
        }
        dest.writeParcelable(this.f59887j, i);
    }

    public /* synthetic */ ConfigurableResourceImage(int i, Integer num, Float f, Float f4, int i2) {
        this(i, (i2 & 2) != 0 ? null : num, 1.0f, (i2 & 8) != 0 ? null : ImageView.ScaleType.CENTER_CROP, null, (i2 & 32) != 0 ? null : f, (i2 & 64) != 0 ? null : f4, null, null, null);
    }
}
