package com.revolut.core.ui_kit.image.type.complex;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/core/ui_kit/image/type/complex/ComplexImage;", "Landroid/os/Parcelable;", "<init>", "()V", "Regular", "Overlapped", "Lottie", "Video", "Avatar", "Lcom/revolut/core/ui_kit/image/type/complex/ComplexImage$Avatar;", "Lcom/revolut/core/ui_kit/image/type/complex/ComplexImage$Lottie;", "Lcom/revolut/core/ui_kit/image/type/complex/ComplexImage$Overlapped;", "Lcom/revolut/core/ui_kit/image/type/complex/ComplexImage$Regular;", "Lcom/revolut/core/ui_kit/image/type/complex/ComplexImage$Video;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ComplexImage implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/image/type/complex/ComplexImage$Avatar;", "Lcom/revolut/core/ui_kit/image/type/complex/ComplexImage;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Avatar extends ComplexImage {

        @NotNull
        public static final Parcelable.Creator<Avatar> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AvatarModel f55833a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Avatar((AvatarModel) parcel.readParcelable(Avatar.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Avatar[i];
            }
        }

        public Avatar(AvatarModel content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.f55833a = content;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Avatar) && Intrinsics.f(this.f55833a, ((Avatar) obj2).f55833a);
        }

        public final int hashCode() {
            return this.f55833a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f55833a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/image/type/complex/ComplexImage$Lottie;", "Lcom/revolut/core/ui_kit/image/type/complex/ComplexImage;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Lottie extends ComplexImage {

        @NotNull
        public static final Parcelable.Creator<Lottie> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Image f55834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f55835b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Lottie((Image) parcel.readParcelable(Lottie.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Lottie[i];
            }
        }

        public Lottie(Image content, boolean z) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.f55834a = content;
            this.f55835b = z;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Image getF55834a() {
            return this.f55834a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Lottie)) {
                return false;
            }
            Lottie lottie = (Lottie) obj2;
            return Intrinsics.f(this.f55834a, lottie.f55834a) && this.f55835b == lottie.f55835b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f55835b) + (this.f55834a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f55834a, i);
            dest.writeInt(this.f55835b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/image/type/complex/ComplexImage$Overlapped;", "Lcom/revolut/core/ui_kit/image/type/complex/ComplexImage;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Overlapped extends ComplexImage {

        @NotNull
        public static final Parcelable.Creator<Overlapped> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f55836a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Overlapped.class, parcel, arrayList, iE, 1);
                }
                return new Overlapped(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Overlapped[i];
            }
        }

        public Overlapped(List images) {
            Intrinsics.checkNotNullParameter(images, "images");
            this.f55836a = images;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Overlapped) && Intrinsics.f(this.f55836a, ((Overlapped) obj2).f55836a);
        }

        public final int hashCode() {
            return this.f55836a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f55836a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/image/type/complex/ComplexImage$Regular;", "Lcom/revolut/core/ui_kit/image/type/complex/ComplexImage;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Regular extends ComplexImage {

        @NotNull
        public static final Parcelable.Creator<Regular> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Image f55837a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Regular((Image) parcel.readParcelable(Regular.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Regular[i];
            }
        }

        public Regular(Image content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.f55837a = content;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Image getF55837a() {
            return this.f55837a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Regular) && Intrinsics.f(this.f55837a, ((Regular) obj2).f55837a);
        }

        public final int hashCode() {
            return this.f55837a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f55837a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/image/type/complex/ComplexImage$Video;", "Lcom/revolut/core/ui_kit/image/type/complex/ComplexImage;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Video extends ComplexImage {

        @NotNull
        public static final Parcelable.Creator<Video> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.revolut.core.ui_kit_core.displayers.video.Video f55838a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Video((com.revolut.core.ui_kit_core.displayers.video.Video) parcel.readParcelable(Video.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Video[i];
            }
        }

        public Video(com.revolut.core.ui_kit_core.displayers.video.Video content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.f55838a = content;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Video) && Intrinsics.f(this.f55838a, ((Video) obj2).f55838a);
        }

        public final int hashCode() {
            return this.f55838a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f55838a, i);
        }
    }

    private ComplexImage() {
    }
}
