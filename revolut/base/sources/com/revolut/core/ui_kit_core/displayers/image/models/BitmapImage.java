package com.revolut.core.ui_kit_core.displayers.image.models;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/BitmapImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "Lgz0/c;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BitmapImage implements Image, gz0.c {

    @NotNull
    public static final Parcelable.Creator<BitmapImage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f59847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f59848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageTransformations f59849c;
    public final Clause d;

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BitmapImage((Bitmap) parcel.readParcelable(BitmapImage.class.getClassLoader()), parcel.readInt() != 0, ImageTransformations.CREATOR.createFromParcel(parcel), (Clause) parcel.readParcelable(BitmapImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BitmapImage[i];
        }
    }

    public BitmapImage(Bitmap bitmap, boolean z, ImageTransformations transformations, Clause clause) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        this.f59847a = bitmap;
        this.f59848b = z;
        this.f59849c = transformations;
        this.d = clause;
    }

    @Override // gz0.c
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ImageTransformations getF59849c() {
        return this.f59849c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BitmapImage)) {
            return false;
        }
        BitmapImage bitmapImage = (BitmapImage) obj2;
        return Intrinsics.f(this.f59847a, bitmapImage.f59847a) && this.f59848b == bitmapImage.f59848b && Intrinsics.f(this.f59849c, bitmapImage.f59849c) && Intrinsics.f(this.d, bitmapImage.d);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getD() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f59849c.hashCode() + j6.a.c(this.f59847a.hashCode() * 31, 31, this.f59848b)) * 31;
        Clause clause = this.d;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f59847a, i);
        dest.writeInt(this.f59848b ? 1 : 0);
        this.f59849c.writeToParcel(dest, i);
        dest.writeParcelable(this.d, i);
    }

    public /* synthetic */ BitmapImage(Bitmap bitmap, boolean z, ImageTransformations imageTransformations, int i) {
        this(bitmap, (i & 2) != 0 ? true : z, (i & 4) != 0 ? new ImageTransformations(null, null, null, gz0.b.CenterInside, null, null, null, LDSFile.EF_SOD_TAG) : imageTransformations, (Clause) null);
    }
}
