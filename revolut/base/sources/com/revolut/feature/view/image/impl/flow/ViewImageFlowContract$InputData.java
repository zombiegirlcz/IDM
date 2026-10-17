package com.revolut.feature.view.image.impl.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/view/image/impl/flow/ViewImageFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "Remote", "Local", "Gallery", "Lcom/revolut/feature/view/image/impl/flow/ViewImageFlowContract$InputData$Gallery;", "Lcom/revolut/feature/view/image/impl/flow/ViewImageFlowContract$InputData$Local;", "Lcom/revolut/feature/view/image/impl/flow/ViewImageFlowContract$InputData$Remote;", "feature_view_image_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ViewImageFlowContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/view/image/impl/flow/ViewImageFlowContract$InputData$Gallery;", "Lcom/revolut/feature/view/image/impl/flow/ViewImageFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_view_image_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Gallery extends ViewImageFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Gallery> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f94817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f94818b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Gallery.class, parcel, arrayList, iE, 1);
                }
                return new Gallery(arrayList, parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Gallery[i];
            }
        }

        public Gallery(List images, int i) {
            Intrinsics.checkNotNullParameter(images, "images");
            this.f94817a = images;
            this.f94818b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Gallery)) {
                return false;
            }
            Gallery gallery = (Gallery) obj2;
            return Intrinsics.f(this.f94817a, gallery.f94817a) && this.f94818b == gallery.f94818b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f94818b) + (this.f94817a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f94817a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeInt(this.f94818b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/view/image/impl/flow/ViewImageFlowContract$InputData$Local;", "Lcom/revolut/feature/view/image/impl/flow/ViewImageFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_view_image_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Local extends ViewImageFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Local> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f94819a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Local((File) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Local[i];
            }
        }

        public Local(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            this.f94819a = file;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Local) && Intrinsics.f(this.f94819a, ((Local) obj2).f94819a);
        }

        public final int hashCode() {
            return this.f94819a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f94819a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/view/image/impl/flow/ViewImageFlowContract$InputData$Remote;", "Lcom/revolut/feature/view/image/impl/flow/ViewImageFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_view_image_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Remote extends ViewImageFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Remote> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final File f94821b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Remote((File) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Remote[i];
            }
        }

        public Remote(File file, String remoteUrl) {
            Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
            this.f94820a = remoteUrl;
            this.f94821b = file;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Remote)) {
                return false;
            }
            Remote remote = (Remote) obj2;
            return Intrinsics.f(this.f94820a, remote.f94820a) && Intrinsics.f(this.f94821b, remote.f94821b);
        }

        public final int hashCode() {
            int iHashCode = this.f94820a.hashCode() * 31;
            File file = this.f94821b;
            return iHashCode + (file == null ? 0 : file.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94820a);
            dest.writeSerializable(this.f94821b);
        }
    }

    private ViewImageFlowContract$InputData() {
    }
}
