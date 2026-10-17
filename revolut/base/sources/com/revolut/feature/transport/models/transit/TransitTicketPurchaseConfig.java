package com.revolut.feature.transport.models.transit;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transport/models/transit/TransitTicketPurchaseConfig;", "Landroid/os/Parcelable;", "None", "Active", "Locked", "Lcom/revolut/feature/transport/models/transit/TransitTicketPurchaseConfig$Active;", "Lcom/revolut/feature/transport/models/transit/TransitTicketPurchaseConfig$Locked;", "Lcom/revolut/feature/transport/models/transit/TransitTicketPurchaseConfig$None;", "feature_transport_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransitTicketPurchaseConfig extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/models/transit/TransitTicketPurchaseConfig$Active;", "Lcom/revolut/feature/transport/models/transit/TransitTicketPurchaseConfig;", "", "toString", "()Ljava/lang/String;", "feature_transport_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Active implements TransitTicketPurchaseConfig {

        @NotNull
        public static final Parcelable.Creator<Active> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f92725a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Active(parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Active[i];
            }
        }

        public Active(long j2) {
            this.f92725a = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Active) && this.f92725a == ((Active) obj2).f92725a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f92725a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.f92725a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/models/transit/TransitTicketPurchaseConfig$Locked;", "Lcom/revolut/feature/transport/models/transit/TransitTicketPurchaseConfig;", "", "toString", "()Ljava/lang/String;", "feature_transport_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Locked implements TransitTicketPurchaseConfig {

        @NotNull
        public static final Parcelable.Creator<Locked> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f92726a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Locked(parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Locked[i];
            }
        }

        public Locked(long j2) {
            this.f92726a = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Locked) && this.f92726a == ((Locked) obj2).f92726a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f92726a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.f92726a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transport/models/transit/TransitTicketPurchaseConfig$None;", "Lcom/revolut/feature/transport/models/transit/TransitTicketPurchaseConfig;", "<init>", "()V", "feature_transport_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class None implements TransitTicketPurchaseConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final None f92727a = new None();

        @NotNull
        public static final Parcelable.Creator<None> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return None.f92727a;
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
}
