package com.revolut.feature.crypto.remittance.impl.ui.error;

import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class CryptoEmtStatusViewModelFactoryImpl implements wj5.a {

    @NotNull
    public static final a Companion = new a();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/remittance/impl/ui/error/CryptoEmtStatusViewModelFactoryImpl$Parcel;", "Landroid/os/Parcelable;", "<init>", "()V", "feature_crypto_remittance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Parcel implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Parcel f70971a = new Parcel();

        @NotNull
        public static final Parcelable.Creator<Parcel> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(android.os.Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Parcel.f70971a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Parcel[i];
            }
        }

        private Parcel() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    public static final class a {
        private a() {
        }
    }
}
