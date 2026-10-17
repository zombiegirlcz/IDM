package com.revolut.shared.feature.wealth.ui_kit.models.image;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/shared/feature/wealth/ui_kit/models/image/RoundedRectImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_shared_wealth_ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RoundedRectImage implements Image {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f105360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f105361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f105362c;
    public final float d;
    public final Color e;
    public final Clause f;

    @NotNull
    private static final a Companion = new a();

    @NotNull
    public static final Parcelable.Creator<RoundedRectImage> CREATOR = new b();

    public static final class a {
        private a() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RoundedRectImage((Image) parcel.readParcelable(RoundedRectImage.class.getClassLoader()), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), (Color) parcel.readParcelable(RoundedRectImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RoundedRectImage[i];
        }
    }

    public RoundedRectImage(Image image, float f, float f4, float f5, Color backgroundColor) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.f105360a = image;
        this.f105361b = f;
        this.f105362c = f4;
        this.d = f5;
        this.e = backgroundColor;
        this.f = image.getF59887j();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RoundedRectImage)) {
            return false;
        }
        RoundedRectImage roundedRectImage = (RoundedRectImage) obj2;
        return Intrinsics.f(this.f105360a, roundedRectImage.f105360a) && Float.compare(this.f105361b, roundedRectImage.f105361b) == 0 && Float.compare(this.f105362c, roundedRectImage.f105362c) == 0 && Float.compare(this.d, roundedRectImage.d) == 0 && Intrinsics.f(this.e, roundedRectImage.e);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getF59887j() {
        return this.f;
    }

    public final int hashCode() {
        return this.e.hashCode() + m72.b.b(this.d, m72.b.b(this.f105362c, m72.b.b(this.f105361b, this.f105360a.hashCode() * 31, 31), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f105360a, i);
        dest.writeFloat(this.f105361b);
        dest.writeFloat(this.f105362c);
        dest.writeFloat(this.d);
        dest.writeParcelable(this.e, i);
    }
}
