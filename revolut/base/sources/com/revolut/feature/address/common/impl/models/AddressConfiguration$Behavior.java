package com.revolut.feature.address.common.impl.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/address/common/impl/models/AddressConfiguration$Behavior", "Landroid/os/Parcelable;", "Default", "Dropdown", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$Behavior$Default;", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$Behavior$Dropdown;", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AddressConfiguration$Behavior extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$Behavior$Default;", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$Behavior;", "<init>", "()V", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Default implements AddressConfiguration$Behavior {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Default f61038a = new Default();

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Default.f61038a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$Behavior$Dropdown;", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$Behavior;", "<init>", "()V", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Dropdown implements AddressConfiguration$Behavior {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Dropdown f61039a = new Dropdown();

        @NotNull
        public static final Parcelable.Creator<Dropdown> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Dropdown.f61039a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Dropdown[i];
            }
        }

        private Dropdown() {
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
