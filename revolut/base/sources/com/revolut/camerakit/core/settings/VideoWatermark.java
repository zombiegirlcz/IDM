package com.revolut.camerakit.core.settings;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/camerakit/core/settings/VideoWatermark;", "Landroid/os/Parcelable;", "Disabled", "Enabled", "Lcom/revolut/camerakit/core/settings/VideoWatermark$Disabled;", "Lcom/revolut/camerakit/core/settings/VideoWatermark$Enabled;", "camera_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface VideoWatermark extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/camerakit/core/settings/VideoWatermark$Disabled;", "Lcom/revolut/camerakit/core/settings/VideoWatermark;", "<init>", "()V", "camera_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Disabled implements VideoWatermark {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Disabled f50745a = new Disabled();

        @NotNull
        public static final Parcelable.Creator<Disabled> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Disabled.f50745a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Disabled[i];
            }
        }

        private Disabled() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/core/settings/VideoWatermark$Enabled;", "Lcom/revolut/camerakit/core/settings/VideoWatermark;", "", "toString", "()Ljava/lang/String;", "camera_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Enabled implements VideoWatermark {

        @NotNull
        public static final Parcelable.Creator<Enabled> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f50746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WatermarkConfig f50747b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Enabled(parcel.readString(), WatermarkConfig.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Enabled[i];
            }
        }

        public Enabled(String nonce, WatermarkConfig config) {
            Intrinsics.checkNotNullParameter(nonce, "nonce");
            Intrinsics.checkNotNullParameter(config, "config");
            this.f50746a = nonce;
            this.f50747b = config;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Enabled)) {
                return false;
            }
            Enabled enabled = (Enabled) obj2;
            return Intrinsics.f(this.f50746a, enabled.f50746a) && Intrinsics.f(this.f50747b, enabled.f50747b);
        }

        public final int hashCode() {
            return this.f50747b.hashCode() + (this.f50746a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f50746a);
            this.f50747b.writeToParcel(dest, i);
        }
    }
}
