package com.revolut.feature.view.image.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/feature/view/image/api/navigation/ViewImageDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/view/image/api/navigation/ViewImageDestination$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InputData", "feature_view_image_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class ViewImageDestination extends InternalDestination<InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<ViewImageDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputData f94806b;

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/view/image/api/navigation/ViewImageDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "Remote", "Local", "Gallery", "Lcom/revolut/feature/view/image/api/navigation/ViewImageDestination$InputData$Gallery;", "Lcom/revolut/feature/view/image/api/navigation/ViewImageDestination$InputData$Local;", "Lcom/revolut/feature/view/image/api/navigation/ViewImageDestination$InputData$Remote;", "feature_view_image_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class InputData implements IOData$Input {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/view/image/api/navigation/ViewImageDestination$InputData$Gallery;", "Lcom/revolut/feature/view/image/api/navigation/ViewImageDestination$InputData;", "", "toString", "()Ljava/lang/String;", "feature_view_image_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @d
        public static final /* data */ class Gallery extends InputData {

            @NotNull
            public static final Parcelable.Creator<Gallery> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f94807a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f94808b;

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
                this.f94807a = images;
                this.f94808b = i;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getF94807a() {
                return this.f94807a;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final int getF94808b() {
                return this.f94808b;
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
                return Intrinsics.f(this.f94807a, gallery.f94807a) && this.f94808b == gallery.f94808b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f94808b) + (this.f94807a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itV = p.a.v(this.f94807a, dest);
                while (itV.hasNext()) {
                    dest.writeParcelable((Parcelable) itV.next(), i);
                }
                dest.writeInt(this.f94808b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/view/image/api/navigation/ViewImageDestination$InputData$Local;", "Lcom/revolut/feature/view/image/api/navigation/ViewImageDestination$InputData;", "", "toString", "()Ljava/lang/String;", "feature_view_image_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @d
        public static final /* data */ class Local extends InputData {

            @NotNull
            public static final Parcelable.Creator<Local> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final File f94809a;

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
                this.f94809a = file;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final File getF94809a() {
                return this.f94809a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Local) && Intrinsics.f(this.f94809a, ((Local) obj2).f94809a);
            }

            public final int hashCode() {
                return this.f94809a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f94809a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/view/image/api/navigation/ViewImageDestination$InputData$Remote;", "Lcom/revolut/feature/view/image/api/navigation/ViewImageDestination$InputData;", "", "toString", "()Ljava/lang/String;", "feature_view_image_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @d
        public static final /* data */ class Remote extends InputData {

            @NotNull
            public static final Parcelable.Creator<Remote> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f94810a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final File f94811b;

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
                this.f94810a = remoteUrl;
                this.f94811b = file;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final File getF94811b() {
                return this.f94811b;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF94810a() {
                return this.f94810a;
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
                return Intrinsics.f(this.f94810a, remote.f94810a) && Intrinsics.f(this.f94811b, remote.f94811b);
            }

            public final int hashCode() {
                int iHashCode = this.f94810a.hashCode() * 31;
                File file = this.f94811b;
                return iHashCode + (file == null ? 0 : file.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f94810a);
                dest.writeSerializable(this.f94811b);
            }
        }

        private InputData() {
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ViewImageDestination((InputData) parcel.readParcelable(ViewImageDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ViewImageDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewImageDestination(InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f94806b = inputData;
    }

    @Override // com.revolut.kompot.common.InternalDestination
    /* JADX INFO: renamed from: b */
    public final IOData$Input getF80510b() {
        return this.f94806b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ViewImageDestination) && Intrinsics.f(this.f94806b, ((ViewImageDestination) obj2).f94806b);
    }

    public final int hashCode() {
        return this.f94806b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94806b, i);
    }
}
