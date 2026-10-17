package com.revolut.core.ui_kit_core.displayers.image.models;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/UriImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "Lgz0/c;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UriImage implements Image, gz0.c {

    @NotNull
    public static final Parcelable.Creator<UriImage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f60014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f60015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageTransformations f60016c;
    public final Clause d;

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UriImage((Uri) parcel.readParcelable(UriImage.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? ImageTransformations.CREATOR.createFromParcel(parcel) : null, (Clause) parcel.readParcelable(UriImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UriImage[i];
        }
    }

    public UriImage(Uri url2, Integer num, ImageTransformations imageTransformations, Clause clause) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f60014a = url2;
        this.f60015b = num;
        this.f60016c = imageTransformations;
        this.d = clause;
    }

    @Override // gz0.c
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ImageTransformations getF60016c() {
        return this.f60016c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UriImage)) {
            return false;
        }
        UriImage uriImage = (UriImage) obj2;
        return Intrinsics.f(this.f60014a, uriImage.f60014a) && Intrinsics.f(this.f60015b, uriImage.f60015b) && Intrinsics.f(this.f60016c, uriImage.f60016c) && Intrinsics.f(this.d, uriImage.d);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getD() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = this.f60014a.hashCode() * 31;
        Integer num = this.f60015b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        ImageTransformations imageTransformations = this.f60016c;
        int iHashCode3 = (iHashCode2 + (imageTransformations == null ? 0 : imageTransformations.hashCode())) * 31;
        Clause clause = this.d;
        return iHashCode3 + (clause != null ? clause.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f60014a, i);
        Integer num = this.f60015b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        ImageTransformations imageTransformations = this.f60016c;
        if (imageTransformations == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            imageTransformations.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.d, i);
    }
}
