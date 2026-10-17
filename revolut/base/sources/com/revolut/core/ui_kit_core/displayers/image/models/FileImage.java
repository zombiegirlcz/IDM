package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/FileImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "Lgz0/c;", "", "toString", "()Ljava/lang/String;", "Placeholder", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FileImage implements Image, gz0.c {

    @NotNull
    public static final Parcelable.Creator<FileImage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f59917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Placeholder f59918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageTransformations f59919c;
    public final Clause d;

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/FileImage$Placeholder;", "Landroid/os/Parcelable;", "DrawableResource", "Shimmering", "Lcom/revolut/core/ui_kit_core/displayers/image/models/FileImage$Placeholder$DrawableResource;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/FileImage$Placeholder$Shimmering;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Placeholder extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/FileImage$Placeholder$DrawableResource;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/FileImage$Placeholder;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DrawableResource implements Placeholder {

            @NotNull
            public static final Parcelable.Creator<DrawableResource> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f59920a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DrawableResource(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DrawableResource[i];
                }
            }

            public DrawableResource(int i) {
                this.f59920a = i;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getF59920a() {
                return this.f59920a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof DrawableResource) && this.f59920a == ((DrawableResource) obj2).f59920a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f59920a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f59920a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/FileImage$Placeholder$Shimmering;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/FileImage$Placeholder;", "<init>", "()V", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Shimmering implements Placeholder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Shimmering f59921a = new Shimmering();

            @NotNull
            public static final Parcelable.Creator<Shimmering> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Shimmering.f59921a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Shimmering[i];
                }
            }

            private Shimmering() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FileImage((File) parcel.readSerializable(), (Placeholder) parcel.readParcelable(FileImage.class.getClassLoader()), ImageTransformations.CREATOR.createFromParcel(parcel), (Clause) parcel.readParcelable(FileImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FileImage[i];
        }
    }

    public FileImage(File file, Placeholder placeholder, ImageTransformations transformations, Clause clause) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        this.f59917a = file;
        this.f59918b = placeholder;
        this.f59919c = transformations;
        this.d = clause;
    }

    @Override // gz0.c
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ImageTransformations getF59845b() {
        return this.f59919c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FileImage)) {
            return false;
        }
        FileImage fileImage = (FileImage) obj2;
        return Intrinsics.f(this.f59917a, fileImage.f59917a) && Intrinsics.f(this.f59918b, fileImage.f59918b) && Intrinsics.f(this.f59919c, fileImage.f59919c) && Intrinsics.f(this.d, fileImage.d);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getF59846c() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = this.f59917a.hashCode() * 31;
        Placeholder placeholder = this.f59918b;
        int iHashCode2 = (this.f59919c.hashCode() + ((iHashCode + (placeholder == null ? 0 : placeholder.hashCode())) * 31)) * 31;
        Clause clause = this.d;
        return iHashCode2 + (clause != null ? clause.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f59917a);
        dest.writeParcelable(this.f59918b, i);
        this.f59919c.writeToParcel(dest, i);
        dest.writeParcelable(this.d, i);
    }

    public /* synthetic */ FileImage(File file, Placeholder placeholder, ImageTransformations imageTransformations, int i) {
        this(file, (i & 2) != 0 ? null : placeholder, (i & 4) != 0 ? new ImageTransformations(null, null, null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_SOD_TAG) : imageTransformations, (Clause) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FileImage(File file, int i, ImageTransformations transformations) {
        this(file, new Placeholder.DrawableResource(i), transformations, 8);
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
    }
}
