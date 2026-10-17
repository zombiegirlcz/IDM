package com.revolut.feature.in_app_calls.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/in_app_calls/domain/AudioRoute;", "Landroid/os/Parcelable;", "<init>", "()V", "Earpiece", "Speaker", "Bluetooth", "WiredHeadset", "Lcom/revolut/feature/in_app_calls/domain/AudioRoute$Bluetooth;", "Lcom/revolut/feature/in_app_calls/domain/AudioRoute$Earpiece;", "Lcom/revolut/feature/in_app_calls/domain/AudioRoute$Speaker;", "Lcom/revolut/feature/in_app_calls/domain/AudioRoute$WiredHeadset;", "feature_in_app_calls_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AudioRoute implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/in_app_calls/domain/AudioRoute$Bluetooth;", "Lcom/revolut/feature/in_app_calls/domain/AudioRoute;", "", "toString", "()Ljava/lang/String;", "feature_in_app_calls_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Bluetooth extends AudioRoute {

        @NotNull
        public static final Parcelable.Creator<Bluetooth> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f74797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f74798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f74799c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Bluetooth(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Bluetooth[i];
            }
        }

        public Bluetooth(String str, Integer num, String str2) {
            this.f74797a = str;
            this.f74798b = str2;
            this.f74799c = num;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Bluetooth)) {
                return false;
            }
            Bluetooth bluetooth = (Bluetooth) obj2;
            return Intrinsics.f(this.f74797a, bluetooth.f74797a) && Intrinsics.f(this.f74798b, bluetooth.f74798b) && Intrinsics.f(this.f74799c, bluetooth.f74799c);
        }

        public final int hashCode() {
            String str = this.f74797a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f74798b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.f74799c;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74797a);
            dest.writeString(this.f74798b);
            Integer num = this.f74799c;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/in_app_calls/domain/AudioRoute$Earpiece;", "Lcom/revolut/feature/in_app_calls/domain/AudioRoute;", "<init>", "()V", "feature_in_app_calls_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Earpiece extends AudioRoute {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Earpiece f74800a = new Earpiece();

        @NotNull
        public static final Parcelable.Creator<Earpiece> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Earpiece.f74800a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Earpiece[i];
            }
        }

        private Earpiece() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/in_app_calls/domain/AudioRoute$Speaker;", "Lcom/revolut/feature/in_app_calls/domain/AudioRoute;", "<init>", "()V", "feature_in_app_calls_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Speaker extends AudioRoute {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Speaker f74801a = new Speaker();

        @NotNull
        public static final Parcelable.Creator<Speaker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Speaker.f74801a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Speaker[i];
            }
        }

        private Speaker() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/in_app_calls/domain/AudioRoute$WiredHeadset;", "Lcom/revolut/feature/in_app_calls/domain/AudioRoute;", "<init>", "()V", "feature_in_app_calls_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WiredHeadset extends AudioRoute {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WiredHeadset f74802a = new WiredHeadset();

        @NotNull
        public static final Parcelable.Creator<WiredHeadset> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WiredHeadset.f74802a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WiredHeadset[i];
            }
        }

        private WiredHeadset() {
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

    private AudioRoute() {
    }
}
