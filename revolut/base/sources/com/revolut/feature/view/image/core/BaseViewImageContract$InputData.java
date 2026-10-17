package com.revolut.feature.view.image.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/view/image/core/BaseViewImageContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "Remote", "Local", "Lcom/revolut/feature/view/image/core/BaseViewImageContract$InputData$Local;", "Lcom/revolut/feature/view/image/core/BaseViewImageContract$InputData$Remote;", "feature_view_image_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseViewImageContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/view/image/core/BaseViewImageContract$InputData$Local;", "Lcom/revolut/feature/view/image/core/BaseViewImageContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_view_image_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Local extends BaseViewImageContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Local> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f94812a;

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
            this.f94812a = file;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Local) && Intrinsics.f(this.f94812a, ((Local) obj2).f94812a);
        }

        public final int hashCode() {
            return this.f94812a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f94812a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/view/image/core/BaseViewImageContract$InputData$Remote;", "Lcom/revolut/feature/view/image/core/BaseViewImageContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_view_image_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Remote extends BaseViewImageContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Remote> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final File f94814b;

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
            this.f94813a = remoteUrl;
            this.f94814b = file;
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
            return Intrinsics.f(this.f94813a, remote.f94813a) && Intrinsics.f(this.f94814b, remote.f94814b);
        }

        public final int hashCode() {
            int iHashCode = this.f94813a.hashCode() * 31;
            File file = this.f94814b;
            return iHashCode + (file == null ? 0 : file.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94813a);
            dest.writeSerializable(this.f94814b);
        }
    }

    private BaseViewImageContract$InputData() {
    }
}
