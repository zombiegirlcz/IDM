package com.revolut.camerakit.client.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/camerakit/client/api/models/VideoDuration;", "Landroid/os/Parcelable;", "Fixed", "Custom", "Lcom/revolut/camerakit/client/api/models/VideoDuration$Custom;", "Lcom/revolut/camerakit/client/api/models/VideoDuration$Fixed;", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface VideoDuration extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/client/api/models/VideoDuration$Custom;", "Lcom/revolut/camerakit/client/api/models/VideoDuration;", "", "toString", "()Ljava/lang/String;", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Custom implements VideoDuration {

        @NotNull
        public static final Parcelable.Creator<Custom> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f50733a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Custom(parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Custom[i];
            }
        }

        public Custom(long j2) {
            this.f50733a = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Custom) && this.f50733a == ((Custom) obj2).f50733a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f50733a);
        }

        @Override // com.revolut.camerakit.client.api.models.VideoDuration
        /* JADX INFO: renamed from: q5, reason: from getter */
        public final long getF50734a() {
            return this.f50733a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.f50733a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/client/api/models/VideoDuration$Fixed;", "Lcom/revolut/camerakit/client/api/models/VideoDuration;", "", "toString", "()Ljava/lang/String;", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Fixed implements VideoDuration {

        @NotNull
        public static final Parcelable.Creator<Fixed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f50734a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Fixed(parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Fixed[i];
            }
        }

        public Fixed(long j2) {
            this.f50734a = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Fixed) && this.f50734a == ((Fixed) obj2).f50734a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f50734a);
        }

        @Override // com.revolut.camerakit.client.api.models.VideoDuration
        /* JADX INFO: renamed from: q5, reason: from getter */
        public final long getF50734a() {
            return this.f50734a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.f50734a);
        }
    }

    /* JADX INFO: renamed from: q5 */
    long getF50734a();
}
