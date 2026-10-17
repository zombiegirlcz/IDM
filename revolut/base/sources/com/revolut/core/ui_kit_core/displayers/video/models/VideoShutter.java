package com.revolut.core.ui_kit_core.displayers.video.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/video/models/VideoShutter;", "Landroid/os/Parcelable;", "<init>", "()V", "Colored", "Picture", "FadeIn", "None", "Fallback", "Lcom/revolut/core/ui_kit_core/displayers/video/models/VideoShutter$Colored;", "Lcom/revolut/core/ui_kit_core/displayers/video/models/VideoShutter$FadeIn;", "Lcom/revolut/core/ui_kit_core/displayers/video/models/VideoShutter$Fallback;", "Lcom/revolut/core/ui_kit_core/displayers/video/models/VideoShutter$None;", "Lcom/revolut/core/ui_kit_core/displayers/video/models/VideoShutter$Picture;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class VideoShutter implements Parcelable {

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/video/models/VideoShutter$Colored;", "Lcom/revolut/core/ui_kit_core/displayers/video/models/VideoShutter;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Colored extends VideoShutter {

        @NotNull
        public static final Parcelable.Creator<Colored> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Color f60093a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Colored((Color) parcel.readParcelable(Colored.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Colored[i];
            }
        }

        public Colored(Color color) {
            Intrinsics.checkNotNullParameter(color, "color");
            this.f60093a = color;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Color getF60093a() {
            return this.f60093a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Colored) && Intrinsics.f(this.f60093a, ((Colored) obj2).f60093a);
        }

        public final int hashCode() {
            return this.f60093a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f60093a, i);
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/video/models/VideoShutter$FadeIn;", "Lcom/revolut/core/ui_kit_core/displayers/video/models/VideoShutter;", "<init>", "()V", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FadeIn extends VideoShutter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FadeIn f60094a = new FadeIn();

        @NotNull
        public static final Parcelable.Creator<FadeIn> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FadeIn.f60094a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FadeIn[i];
            }
        }

        private FadeIn() {
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

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/video/models/VideoShutter$Fallback;", "Lcom/revolut/core/ui_kit_core/displayers/video/models/VideoShutter;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Fallback extends VideoShutter {

        @NotNull
        public static final Parcelable.Creator<Fallback> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Image f60095a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Fallback((Image) parcel.readParcelable(Fallback.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Fallback[i];
            }
        }

        public Fallback(Image image) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.f60095a = image;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Image getF60095a() {
            return this.f60095a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Fallback) && Intrinsics.f(this.f60095a, ((Fallback) obj2).f60095a);
        }

        public final int hashCode() {
            return this.f60095a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f60095a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/video/models/VideoShutter$None;", "Lcom/revolut/core/ui_kit_core/displayers/video/models/VideoShutter;", "<init>", "()V", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class None extends VideoShutter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final None f60096a = new None();

        @NotNull
        public static final Parcelable.Creator<None> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return None.f60096a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new None[i];
            }
        }

        private None() {
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

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/video/models/VideoShutter$Picture;", "Lcom/revolut/core/ui_kit_core/displayers/video/models/VideoShutter;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Picture extends VideoShutter {

        @NotNull
        public static final Parcelable.Creator<Picture> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Image f60097a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Picture((Image) parcel.readParcelable(Picture.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Picture[i];
            }
        }

        public Picture(Image image) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.f60097a = image;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Image getF60097a() {
            return this.f60097a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Picture) && Intrinsics.f(this.f60097a, ((Picture) obj2).f60097a);
        }

        public final int hashCode() {
            return this.f60097a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f60097a, i);
        }
    }

    private VideoShutter() {
    }
}
