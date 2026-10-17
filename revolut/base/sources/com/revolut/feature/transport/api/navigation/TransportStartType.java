package com.revolut.feature.transport.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transport/api/navigation/TransportStartType;", "Landroid/os/Parcelable;", "Hub", "Lcom/revolut/feature/transport/api/navigation/TransportStartType$Hub;", "feature_transport_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransportStartType extends Parcelable {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transport/api/navigation/TransportStartType$Hub;", "Lcom/revolut/feature/transport/api/navigation/TransportStartType;", "Transit", "Ticket", "Lcom/revolut/feature/transport/api/navigation/TransportStartType$Hub$Ticket;", "Lcom/revolut/feature/transport/api/navigation/TransportStartType$Hub$Transit;", "feature_transport_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Hub extends TransportStartType {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transport/api/navigation/TransportStartType$Hub$Ticket;", "Lcom/revolut/feature/transport/api/navigation/TransportStartType$Hub;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/transport/api/navigation/a", "feature_transport_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Ticket implements Hub {

            @NotNull
            public static final Parcelable.Creator<Ticket> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.revolut.feature.transport.api.navigation.a f92498a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Ticket(com.revolut.feature.transport.api.navigation.a.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Ticket[i];
                }
            }

            public Ticket() {
                this(0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Ticket) && this.f92498a == ((Ticket) obj2).f92498a;
            }

            public final int hashCode() {
                return this.f92498a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f92498a.name());
            }

            public Ticket(com.revolut.feature.transport.api.navigation.a toastType) {
                Intrinsics.checkNotNullParameter(toastType, "toastType");
                this.f92498a = toastType;
            }

            public /* synthetic */ Ticket(int i) {
                this(com.revolut.feature.transport.api.navigation.a.NONE);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transport/api/navigation/TransportStartType$Hub$Transit;", "Lcom/revolut/feature/transport/api/navigation/TransportStartType$Hub;", "<init>", "()V", "feature_transport_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Transit implements Hub {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Transit f92499a = new Transit();

            @NotNull
            public static final Parcelable.Creator<Transit> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Transit.f92499a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Transit[i];
                }
            }

            private Transit() {
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
}
