package com.revolut.camerakit.client.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/camerakit/client/api/models/AnimationType;", "Landroid/os/Parcelable;", "Scanning", "Tilting", "None", "Lcom/revolut/camerakit/client/api/models/AnimationType$None;", "Lcom/revolut/camerakit/client/api/models/AnimationType$Scanning;", "Lcom/revolut/camerakit/client/api/models/AnimationType$Tilting;", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AnimationType extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/camerakit/client/api/models/AnimationType$None;", "Lcom/revolut/camerakit/client/api/models/AnimationType;", "<init>", "()V", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class None implements AnimationType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final None f50690a = new None();

        @NotNull
        public static final Parcelable.Creator<None> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return None.f50690a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/camerakit/client/api/models/AnimationType$Scanning;", "Lcom/revolut/camerakit/client/api/models/AnimationType;", "<init>", "()V", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Scanning implements AnimationType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Scanning f50691a = new Scanning();

        @NotNull
        public static final Parcelable.Creator<Scanning> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Scanning.f50691a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Scanning[i];
            }
        }

        private Scanning() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/camerakit/client/api/models/AnimationType$Tilting;", "Lcom/revolut/camerakit/client/api/models/AnimationType;", "<init>", "()V", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Tilting implements AnimationType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Tilting f50692a = new Tilting();

        @NotNull
        public static final Parcelable.Creator<Tilting> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Tilting.f50692a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Tilting[i];
            }
        }

        private Tilting() {
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
}
