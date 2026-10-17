package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/CameraSource;", "Landroid/os/Parcelable;", "Front", "Back", "Unknown", "Lcom/revolut/feature/backend_flow/domain/models/CameraSource$Back;", "Lcom/revolut/feature/backend_flow/domain/models/CameraSource$Front;", "Lcom/revolut/feature/backend_flow/domain/models/CameraSource$Unknown;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CameraSource implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63332a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/CameraSource$Back;", "Lcom/revolut/feature/backend_flow/domain/models/CameraSource;", "<init>", "()V", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Back extends CameraSource {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Back f63333b = new Back();

        @NotNull
        public static final Parcelable.Creator<Back> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Back.f63333b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Back[i];
            }
        }

        private Back() {
            super("REAR");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/CameraSource$Front;", "Lcom/revolut/feature/backend_flow/domain/models/CameraSource;", "<init>", "()V", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Front extends CameraSource {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Front f63334b = new Front();

        @NotNull
        public static final Parcelable.Creator<Front> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Front.f63334b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Front[i];
            }
        }

        private Front() {
            super("FRONT");
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/CameraSource$Unknown;", "Lcom/revolut/feature/backend_flow/domain/models/CameraSource;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Unknown extends CameraSource {

        @NotNull
        public static final Parcelable.Creator<Unknown> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f63335b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Unknown(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unknown[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(String value) {
            super(value);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f63335b = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Unknown) && Intrinsics.f(this.f63335b, ((Unknown) obj2).f63335b);
        }

        public final int hashCode() {
            return this.f63335b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63335b);
        }
    }

    public CameraSource(String str) {
        this.f63332a = str;
    }
}
