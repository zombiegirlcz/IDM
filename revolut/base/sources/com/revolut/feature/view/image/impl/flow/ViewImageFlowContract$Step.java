package com.revolut.feature.view.image.impl.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.view.image.core.BaseViewImageContract$InputData;
import com.revolut.feature.view.image.impl.ui.gallery.ImageGalleryScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/view/image/impl/flow/ViewImageFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PreviewImage", "ImageGallery", "Lcom/revolut/feature/view/image/impl/flow/ViewImageFlowContract$Step$ImageGallery;", "Lcom/revolut/feature/view/image/impl/flow/ViewImageFlowContract$Step$PreviewImage;", "feature_view_image_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ViewImageFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/view/image/impl/flow/ViewImageFlowContract$Step$ImageGallery;", "Lcom/revolut/feature/view/image/impl/flow/ViewImageFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_view_image_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ImageGallery extends ViewImageFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ImageGallery> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageGalleryScreenContract$InputData f94822a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ImageGallery(ImageGalleryScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ImageGallery[i];
            }
        }

        public ImageGallery(ImageGalleryScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f94822a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ImageGallery) && Intrinsics.f(this.f94822a, ((ImageGallery) obj2).f94822a);
        }

        public final int hashCode() {
            return this.f94822a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f94822a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/view/image/impl/flow/ViewImageFlowContract$Step$PreviewImage;", "Lcom/revolut/feature/view/image/impl/flow/ViewImageFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_view_image_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PreviewImage extends ViewImageFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PreviewImage> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaseViewImageContract$InputData f94823a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PreviewImage((BaseViewImageContract$InputData) parcel.readParcelable(PreviewImage.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PreviewImage[i];
            }
        }

        public PreviewImage(BaseViewImageContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f94823a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PreviewImage) && Intrinsics.f(this.f94823a, ((PreviewImage) obj2).f94823a);
        }

        public final int hashCode() {
            return this.f94823a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f94823a, i);
        }
    }

    private ViewImageFlowContract$Step() {
    }
}
