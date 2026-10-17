package com.revolut.core.ui_kit_core.displayers.image.decorator.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/decorator/models/CircleImageDecorator;", "", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CircleImageDecorator implements Image {

    @NotNull
    public static final Parcelable.Creator<CircleImageDecorator> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f59813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Float f59814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f59815c;
    public final float d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f59816g;

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CircleImageDecorator((Image) parcel.readParcelable(CircleImageDecorator.class.getClassLoader()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CircleImageDecorator[i];
        }
    }

    public CircleImageDecorator(Image image, Float f, float f4, float f5, int i, int i2) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f59813a = image;
        this.f59814b = f;
        this.f59815c = f4;
        this.d = f5;
        this.e = i;
        this.f = i2;
        this.f59816g = image.getF60005c();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CircleImageDecorator)) {
            return false;
        }
        CircleImageDecorator circleImageDecorator = (CircleImageDecorator) obj2;
        return Intrinsics.f(this.f59813a, circleImageDecorator.f59813a) && Intrinsics.f(this.f59814b, circleImageDecorator.f59814b) && Float.compare(this.f59815c, circleImageDecorator.f59815c) == 0 && Float.compare(this.d, circleImageDecorator.d) == 0 && this.e == circleImageDecorator.e && this.f == circleImageDecorator.f;
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getF60005c() {
        return this.f59816g;
    }

    public final int hashCode() {
        int iHashCode = this.f59813a.hashCode() * 31;
        Float f = this.f59814b;
        return Integer.hashCode(this.f) + j6.a.b(this.e, b.b(this.d, b.b(this.f59815c, (iHashCode + (f == null ? 0 : f.hashCode())) * 31, 31), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f59813a, i);
        Float f = this.f59814b;
        if (f == null) {
            dest.writeInt(0);
        } else {
            r6.b.p(dest, 1, f);
        }
        dest.writeFloat(this.f59815c);
        dest.writeFloat(this.d);
        dest.writeInt(this.e);
        dest.writeInt(this.f);
    }

    public /* synthetic */ CircleImageDecorator(Image image, Float f, float f4, int i, int i2, int i3) {
        this(image, (i3 & 2) != 0 ? null : f, (i3 & 4) != 0 ? 0.0f : f4, (i3 & 8) == 0 ? 2.0f : BitmapDescriptorFactory.HUE_RED, (i3 & 16) != 0 ? R$attr.uikit_colorTransparent : i, (i3 & 32) != 0 ? R$attr.uikit_colorTransparent : i2);
    }
}
