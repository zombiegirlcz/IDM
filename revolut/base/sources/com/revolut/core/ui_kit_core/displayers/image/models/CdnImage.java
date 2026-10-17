package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0001\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/CdnImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "Lgz0/c;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CdnImage implements Image, gz0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f59870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f59871c;
    public final ImageTransformations d;
    public final UrlImageDrawable e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f59872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f59873h;

    @NotNull
    public static final Parcelable.Creator<CdnImage> CREATOR = new b();

    /* JADX INFO: loaded from: classes20.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CdnImage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ImageTransformations.CREATOR.createFromParcel(parcel), (UrlImageDrawable) parcel.readParcelable(CdnImage.class.getClassLoader()), (Clause) parcel.readParcelable(CdnImage.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CdnImage[i];
        }
    }

    public CdnImage(String name, String path, String extension, ImageTransformations imageTransformations, UrlImageDrawable urlImageDrawable, Clause clause, String darkVariantName, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(extension, "extension");
        Intrinsics.checkNotNullParameter(darkVariantName, "darkVariantName");
        this.f59869a = name;
        this.f59870b = path;
        this.f59871c = extension;
        this.d = imageTransformations;
        this.e = urlImageDrawable;
        this.f = clause;
        this.f59872g = darkVariantName;
        this.f59873h = z;
    }

    public static CdnImage a(CdnImage cdnImage, ImageTransformations imageTransformations) {
        String name = cdnImage.f59869a;
        String path = cdnImage.f59870b;
        String extension = cdnImage.f59871c;
        UrlImageDrawable urlImageDrawable = cdnImage.e;
        Clause clause = cdnImage.f;
        String darkVariantName = cdnImage.f59872g;
        boolean z = cdnImage.f59873h;
        cdnImage.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(extension, "extension");
        Intrinsics.checkNotNullParameter(darkVariantName, "darkVariantName");
        return new CdnImage(name, path, extension, imageTransformations, urlImageDrawable, clause, darkVariantName, z);
    }

    @Override // gz0.c
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ImageTransformations getF59998g() {
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
        if (!(obj2 instanceof CdnImage)) {
            return false;
        }
        CdnImage cdnImage = (CdnImage) obj2;
        return Intrinsics.f(this.f59869a, cdnImage.f59869a) && Intrinsics.f(this.f59870b, cdnImage.f59870b) && Intrinsics.f(this.f59871c, cdnImage.f59871c) && Intrinsics.f(this.d, cdnImage.d) && Intrinsics.f(this.e, cdnImage.e) && Intrinsics.f(this.f, cdnImage.f) && Intrinsics.f(this.f59872g, cdnImage.f59872g) && this.f59873h == cdnImage.f59873h;
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getF57818c() {
        return this.f;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f59869a.hashCode() * 31, 31, this.f59870b), 31, this.f59871c);
        ImageTransformations imageTransformations = this.d;
        int iHashCode = (iC + (imageTransformations == null ? 0 : imageTransformations.hashCode())) * 31;
        UrlImageDrawable urlImageDrawable = this.e;
        int iHashCode2 = (iHashCode + (urlImageDrawable == null ? 0 : urlImageDrawable.hashCode())) * 31;
        Clause clause = this.f;
        return Boolean.hashCode(this.f59873h) + p.a.c((iHashCode2 + (clause != null ? clause.hashCode() : 0)) * 31, 31, this.f59872g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f59869a);
        dest.writeString(this.f59870b);
        dest.writeString(this.f59871c);
        ImageTransformations imageTransformations = this.d;
        if (imageTransformations == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            imageTransformations.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeString(this.f59872g);
        dest.writeInt(this.f59873h ? 1 : 0);
    }

    public /* synthetic */ CdnImage(String str, String str2, String str3, ImageTransformations imageTransformations, UrlImageDrawable urlImageDrawable, String str4, int i) {
        this(str, str2, (i & 4) != 0 ? ".png" : str3, (i & 8) != 0 ? null : imageTransformations, (i & 16) != 0 ? UrlImageDrawable.Shimmering.INSTANCE : urlImageDrawable, null, (i & 64) != 0 ? str : str4, (i & 128) == 0);
    }
}
