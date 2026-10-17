package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "Lgz0/c;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class QrCodeImage implements Image, gz0.c {

    @NotNull
    public static final Parcelable.Creator<QrCodeImage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[][] f59992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final QrCodeAppearance f59993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final QrCodeImageDrawable f59994c;
    public final ImageTransformations d;
    public final Clause e;

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            int[][] iArr = new int[i][];
            for (int i2 = 0; i2 != i; i2++) {
                iArr[i2] = parcel.createIntArray();
            }
            return new QrCodeImage(iArr, QrCodeAppearance.CREATOR.createFromParcel(parcel), (QrCodeImageDrawable) parcel.readParcelable(QrCodeImage.class.getClassLoader()), parcel.readInt() == 0 ? null : ImageTransformations.CREATOR.createFromParcel(parcel), (Clause) parcel.readParcelable(QrCodeImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QrCodeImage[i];
        }
    }

    public QrCodeImage(int[][] imageMatrix, QrCodeAppearance appearance, QrCodeImageDrawable qrCodeImageDrawable, ImageTransformations imageTransformations, Clause clause) {
        Intrinsics.checkNotNullParameter(imageMatrix, "imageMatrix");
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        this.f59992a = imageMatrix;
        this.f59993b = appearance;
        this.f59994c = qrCodeImageDrawable;
        this.d = imageTransformations;
        this.e = clause;
    }

    @Override // gz0.c
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ImageTransformations getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!QrCodeImage.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage");
        QrCodeImage qrCodeImage = (QrCodeImage) obj2;
        return n.b(this.f59992a, qrCodeImage.f59992a) && Intrinsics.f(this.f59993b, qrCodeImage.f59993b) && Intrinsics.f(this.d, qrCodeImage.d);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getF59856b() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = (this.f59993b.hashCode() + (Arrays.deepHashCode(this.f59992a) * 31)) * 31;
        ImageTransformations imageTransformations = this.d;
        return iHashCode + (imageTransformations != null ? imageTransformations.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int[][] iArr = this.f59992a;
        int length = iArr.length;
        dest.writeInt(length);
        for (int i2 = 0; i2 != length; i2++) {
            dest.writeIntArray(iArr[i2]);
        }
        this.f59993b.writeToParcel(dest, i);
        dest.writeParcelable(this.f59994c, i);
        ImageTransformations imageTransformations = this.d;
        if (imageTransformations == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            imageTransformations.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.e, i);
    }

    public /* synthetic */ QrCodeImage(int[][] iArr, QrCodeAppearance qrCodeAppearance, QrCodeImageDrawable.Shimmering.Companion companion, ImageTransformations imageTransformations, int i) {
        this(iArr, qrCodeAppearance, (i & 4) != 0 ? null : companion, (i & 8) != 0 ? null : imageTransformations, (Clause) null);
    }
}
