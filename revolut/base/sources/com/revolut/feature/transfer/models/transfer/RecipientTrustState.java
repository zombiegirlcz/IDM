package com.revolut.feature.transfer.models.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transfer/models/transfer/RecipientTrustState;", "Landroid/os/Parcelable;", "Unknown", "Trusted", "Untrusted", "Lcom/revolut/feature/transfer/models/transfer/RecipientTrustState$Trusted;", "Lcom/revolut/feature/transfer/models/transfer/RecipientTrustState$Unknown;", "Lcom/revolut/feature/transfer/models/transfer/RecipientTrustState$Untrusted;", "feature_transfer_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RecipientTrustState extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transfer/models/transfer/RecipientTrustState$Trusted;", "Lcom/revolut/feature/transfer/models/transfer/RecipientTrustState;", "<init>", "()V", "feature_transfer_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Trusted implements RecipientTrustState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Trusted f92301a = new Trusted();

        @NotNull
        public static final Parcelable.Creator<Trusted> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Trusted.f92301a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Trusted[i];
            }
        }

        private Trusted() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transfer/models/transfer/RecipientTrustState$Unknown;", "Lcom/revolut/feature/transfer/models/transfer/RecipientTrustState;", "<init>", "()V", "feature_transfer_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Unknown implements RecipientTrustState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unknown f92302a = new Unknown();

        @NotNull
        public static final Parcelable.Creator<Unknown> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unknown.f92302a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unknown[i];
            }
        }

        private Unknown() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transfer/models/transfer/RecipientTrustState$Untrusted;", "Lcom/revolut/feature/transfer/models/transfer/RecipientTrustState;", "<init>", "()V", "feature_transfer_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Untrusted implements RecipientTrustState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Untrusted f92303a = new Untrusted();

        @NotNull
        public static final Parcelable.Creator<Untrusted> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Untrusted.f92303a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Untrusted[i];
            }
        }

        private Untrusted() {
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
