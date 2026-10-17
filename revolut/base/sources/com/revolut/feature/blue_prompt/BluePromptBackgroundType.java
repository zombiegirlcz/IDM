package com.revolut.feature.blue_prompt;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/blue_prompt/BluePromptBackgroundType;", "Landroid/os/Parcelable;", "<init>", "()V", "Default", "Dialog", "Image", "Lcom/revolut/feature/blue_prompt/BluePromptBackgroundType$Default;", "Lcom/revolut/feature/blue_prompt/BluePromptBackgroundType$Dialog;", "Lcom/revolut/feature/blue_prompt/BluePromptBackgroundType$Image;", "feature_blue_prompt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BluePromptBackgroundType implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/blue_prompt/BluePromptBackgroundType$Default;", "Lcom/revolut/feature/blue_prompt/BluePromptBackgroundType;", "<init>", "()V", "feature_blue_prompt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Default extends BluePromptBackgroundType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Default f64278a = new Default();

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Default.f64278a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        private Default() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/blue_prompt/BluePromptBackgroundType$Dialog;", "Lcom/revolut/feature/blue_prompt/BluePromptBackgroundType;", "<init>", "()V", "feature_blue_prompt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Dialog extends BluePromptBackgroundType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Dialog f64279a = new Dialog();

        @NotNull
        public static final Parcelable.Creator<Dialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Dialog.f64279a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Dialog[i];
            }
        }

        private Dialog() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/blue_prompt/BluePromptBackgroundType$Image;", "Lcom/revolut/feature/blue_prompt/BluePromptBackgroundType;", "", "toString", "()Ljava/lang/String;", "feature_blue_prompt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Image extends BluePromptBackgroundType {

        @NotNull
        public static final Parcelable.Creator<Image> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.revolut.core.ui_kit_core.displayers.image.Image f64280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f64281b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Image((com.revolut.core.ui_kit_core.displayers.image.Image) parcel.readParcelable(Image.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Image[i];
            }
        }

        public Image(com.revolut.core.ui_kit_core.displayers.image.Image image, boolean z) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.f64280a = image;
            this.f64281b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Image)) {
                return false;
            }
            Image image = (Image) obj2;
            return Intrinsics.f(this.f64280a, image.f64280a) && this.f64281b == image.f64281b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f64281b) + (this.f64280a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f64280a, i);
            dest.writeInt(this.f64281b ? 1 : 0);
        }
    }

    private BluePromptBackgroundType() {
    }
}
