package com.revolut.camerakit.client.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/revolut/camerakit/client/api/models/HintMessage;", "Landroid/os/Parcelable;", "QrCode", "Face", "DocumentFront", "DocumentBack", "DocumentFrontTilt", "ActiveLiveness", "Processing", "Empty", "Lcom/revolut/camerakit/client/api/models/HintMessage$ActiveLiveness;", "Lcom/revolut/camerakit/client/api/models/HintMessage$DocumentBack;", "Lcom/revolut/camerakit/client/api/models/HintMessage$DocumentFront;", "Lcom/revolut/camerakit/client/api/models/HintMessage$DocumentFrontTilt;", "Lcom/revolut/camerakit/client/api/models/HintMessage$Empty;", "Lcom/revolut/camerakit/client/api/models/HintMessage$Face;", "Lcom/revolut/camerakit/client/api/models/HintMessage$Processing;", "Lcom/revolut/camerakit/client/api/models/HintMessage$QrCode;", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface HintMessage extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/client/api/models/HintMessage$ActiveLiveness;", "Lcom/revolut/camerakit/client/api/models/HintMessage;", "", "toString", "()Ljava/lang/String;", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActiveLiveness implements HintMessage {

        @NotNull
        public static final Parcelable.Creator<ActiveLiveness> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f50719a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ActiveLiveness(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActiveLiveness[i];
            }
        }

        public ActiveLiveness(String textToSay) {
            Intrinsics.checkNotNullParameter(textToSay, "textToSay");
            this.f50719a = textToSay;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ActiveLiveness) && Intrinsics.f(this.f50719a, ((ActiveLiveness) obj2).f50719a);
        }

        public final int hashCode() {
            return this.f50719a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f50719a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/camerakit/client/api/models/HintMessage$DocumentBack;", "Lcom/revolut/camerakit/client/api/models/HintMessage;", "<init>", "()V", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DocumentBack implements HintMessage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DocumentBack f50720a = new DocumentBack();

        @NotNull
        public static final Parcelable.Creator<DocumentBack> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DocumentBack.f50720a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentBack[i];
            }
        }

        private DocumentBack() {
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/camerakit/client/api/models/HintMessage$DocumentFront;", "Lcom/revolut/camerakit/client/api/models/HintMessage;", "Default", "Passport", "Lcom/revolut/camerakit/client/api/models/HintMessage$DocumentFront$Default;", "Lcom/revolut/camerakit/client/api/models/HintMessage$DocumentFront$Passport;", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface DocumentFront extends HintMessage {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/camerakit/client/api/models/HintMessage$DocumentFront$Default;", "Lcom/revolut/camerakit/client/api/models/HintMessage$DocumentFront;", "<init>", "()V", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Default implements DocumentFront {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Default f50721a = new Default();

            @NotNull
            public static final Parcelable.Creator<Default> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Default.f50721a;
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/camerakit/client/api/models/HintMessage$DocumentFront$Passport;", "Lcom/revolut/camerakit/client/api/models/HintMessage$DocumentFront;", "<init>", "()V", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Passport implements DocumentFront {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Passport f50722a = new Passport();

            @NotNull
            public static final Parcelable.Creator<Passport> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Passport.f50722a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Passport[i];
                }
            }

            private Passport() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/camerakit/client/api/models/HintMessage$DocumentFrontTilt;", "Lcom/revolut/camerakit/client/api/models/HintMessage;", "<init>", "()V", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DocumentFrontTilt implements HintMessage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DocumentFrontTilt f50723a = new DocumentFrontTilt();

        @NotNull
        public static final Parcelable.Creator<DocumentFrontTilt> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DocumentFrontTilt.f50723a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentFrontTilt[i];
            }
        }

        private DocumentFrontTilt() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/camerakit/client/api/models/HintMessage$Empty;", "Lcom/revolut/camerakit/client/api/models/HintMessage;", "<init>", "()V", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Empty implements HintMessage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Empty f50724a = new Empty();

        @NotNull
        public static final Parcelable.Creator<Empty> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Empty.f50724a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Empty[i];
            }
        }

        private Empty() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/camerakit/client/api/models/HintMessage$Face;", "Lcom/revolut/camerakit/client/api/models/HintMessage;", "<init>", "()V", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Face implements HintMessage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Face f50725a = new Face();

        @NotNull
        public static final Parcelable.Creator<Face> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Face.f50725a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Face[i];
            }
        }

        private Face() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/camerakit/client/api/models/HintMessage$Processing;", "Lcom/revolut/camerakit/client/api/models/HintMessage;", "<init>", "()V", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Processing implements HintMessage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Processing f50726a = new Processing();

        @NotNull
        public static final Parcelable.Creator<Processing> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Processing.f50726a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Processing[i];
            }
        }

        private Processing() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/camerakit/client/api/models/HintMessage$QrCode;", "Lcom/revolut/camerakit/client/api/models/HintMessage;", "<init>", "()V", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class QrCode implements HintMessage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final QrCode f50727a = new QrCode();

        @NotNull
        public static final Parcelable.Creator<QrCode> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return QrCode.f50727a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QrCode[i];
            }
        }

        private QrCode() {
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
