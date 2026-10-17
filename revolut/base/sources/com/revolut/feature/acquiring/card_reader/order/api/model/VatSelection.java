package com.revolut.feature.acquiring.card_reader.order.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/order/api/model/VatSelection;", "Landroid/os/Parcelable;", "<init>", "()V", "NotRegistered", "Optional", "Registered", "Lcom/revolut/feature/acquiring/card_reader/order/api/model/VatSelection$NotRegistered;", "Lcom/revolut/feature/acquiring/card_reader/order/api/model/VatSelection$Optional;", "Lcom/revolut/feature/acquiring/card_reader/order/api/model/VatSelection$Registered;", "feature_acquiring_card_reader_order_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class VatSelection implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/order/api/model/VatSelection$NotRegistered;", "Lcom/revolut/feature/acquiring/card_reader/order/api/model/VatSelection;", "<init>", "()V", "feature_acquiring_card_reader_order_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NotRegistered extends VatSelection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotRegistered f60584a = new NotRegistered();

        @NotNull
        public static final Parcelable.Creator<NotRegistered> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NotRegistered.f60584a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotRegistered[i];
            }
        }

        private NotRegistered() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/order/api/model/VatSelection$Optional;", "Lcom/revolut/feature/acquiring/card_reader/order/api/model/VatSelection;", "<init>", "()V", "feature_acquiring_card_reader_order_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Optional extends VatSelection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Optional f60585a = new Optional();

        @NotNull
        public static final Parcelable.Creator<Optional> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Optional.f60585a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Optional[i];
            }
        }

        private Optional() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/order/api/model/VatSelection$Registered;", "Lcom/revolut/feature/acquiring/card_reader/order/api/model/VatSelection;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_card_reader_order_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Registered extends VatSelection {

        @NotNull
        public static final Parcelable.Creator<Registered> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60586a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Registered(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Registered[i];
            }
        }

        public Registered(String vatNumber) {
            Intrinsics.checkNotNullParameter(vatNumber, "vatNumber");
            this.f60586a = vatNumber;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Registered) && Intrinsics.f(this.f60586a, ((Registered) obj2).f60586a);
        }

        public final int hashCode() {
            return this.f60586a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60586a);
        }
    }

    private VatSelection() {
    }
}
