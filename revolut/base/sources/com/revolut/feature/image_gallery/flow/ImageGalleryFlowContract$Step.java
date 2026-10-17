package com.revolut.feature.image_gallery.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/image_gallery/flow/ImageGalleryFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Gallery", "Pager", "Lcom/revolut/feature/image_gallery/flow/ImageGalleryFlowContract$Step$Gallery;", "Lcom/revolut/feature/image_gallery/flow/ImageGalleryFlowContract$Step$Pager;", "feature_image_gallery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ImageGalleryFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/image_gallery/flow/ImageGalleryFlowContract$Step$Gallery;", "Lcom/revolut/feature/image_gallery/flow/ImageGalleryFlowContract$Step;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_image_gallery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Gallery extends ImageGalleryFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Gallery f74765a = new Gallery();

        @NotNull
        public static final Parcelable.Creator<Gallery> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Gallery.f74765a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Gallery[i];
            }
        }

        private Gallery() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof Gallery);
        }

        public final int hashCode() {
            return -181297829;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/image_gallery/flow/ImageGalleryFlowContract$Step$Pager;", "Lcom/revolut/feature/image_gallery/flow/ImageGalleryFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_image_gallery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pager extends ImageGalleryFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Pager> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f74766a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pager(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pager[i];
            }
        }

        public Pager(int i) {
            this.f74766a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Pager) && this.f74766a == ((Pager) obj2).f74766a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f74766a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f74766a);
        }
    }

    private ImageGalleryFlowContract$Step() {
    }
}
