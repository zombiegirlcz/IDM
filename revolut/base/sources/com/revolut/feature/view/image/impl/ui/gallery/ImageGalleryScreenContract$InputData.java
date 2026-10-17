package com.revolut.feature.view.image.impl.ui.gallery;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/view/image/impl/ui/gallery/ImageGalleryScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_view_image_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ImageGalleryScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ImageGalleryScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f94825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94826b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(ImageGalleryScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new ImageGalleryScreenContract$InputData(arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ImageGalleryScreenContract$InputData[i];
        }
    }

    public ImageGalleryScreenContract$InputData(List images, int i) {
        Intrinsics.checkNotNullParameter(images, "images");
        this.f94825a = images;
        this.f94826b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ImageGalleryScreenContract$InputData)) {
            return false;
        }
        ImageGalleryScreenContract$InputData imageGalleryScreenContract$InputData = (ImageGalleryScreenContract$InputData) obj2;
        return Intrinsics.f(this.f94825a, imageGalleryScreenContract$InputData.f94825a) && this.f94826b == imageGalleryScreenContract$InputData.f94826b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f94826b) + (this.f94825a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f94825a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeInt(this.f94826b);
    }
}
