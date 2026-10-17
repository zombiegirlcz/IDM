package com.revolut.feature.transfer.models.tracking;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transfer/models/tracking/TransferAppSource;", "Landroid/os/Parcelable;", "BANK_TRANSFER", "DEFAULT", "USERNAME", "PAYMENT_LINK", "AIR_WIDGET", "Lcom/revolut/feature/transfer/models/tracking/TransferAppSource$AIR_WIDGET;", "Lcom/revolut/feature/transfer/models/tracking/TransferAppSource$BANK_TRANSFER;", "Lcom/revolut/feature/transfer/models/tracking/TransferAppSource$DEFAULT;", "Lcom/revolut/feature/transfer/models/tracking/TransferAppSource$PAYMENT_LINK;", "Lcom/revolut/feature/transfer/models/tracking/TransferAppSource$USERNAME;", "feature_transfer_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransferAppSource extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/models/tracking/TransferAppSource$AIR_WIDGET;", "Lcom/revolut/feature/transfer/models/tracking/TransferAppSource;", "", "toString", "()Ljava/lang/String;", "feature_transfer_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AIR_WIDGET implements TransferAppSource {

        @NotNull
        public static final Parcelable.Creator<AIR_WIDGET> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92296a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AIR_WIDGET(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AIR_WIDGET[i];
            }
        }

        public AIR_WIDGET(String paymentWidgetId) {
            Intrinsics.checkNotNullParameter(paymentWidgetId, "paymentWidgetId");
            this.f92296a = paymentWidgetId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AIR_WIDGET) && Intrinsics.f(this.f92296a, ((AIR_WIDGET) obj2).f92296a);
        }

        @Override // com.revolut.feature.transfer.models.tracking.TransferAppSource
        public final String getKey() {
            return "PAYMENT_WIDGET";
        }

        public final int hashCode() {
            return this.f92296a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92296a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transfer/models/tracking/TransferAppSource$BANK_TRANSFER;", "Lcom/revolut/feature/transfer/models/tracking/TransferAppSource;", "<init>", "()V", "feature_transfer_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BANK_TRANSFER implements TransferAppSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BANK_TRANSFER f92297a = new BANK_TRANSFER();

        @NotNull
        public static final Parcelable.Creator<BANK_TRANSFER> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BANK_TRANSFER.f92297a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BANK_TRANSFER[i];
            }
        }

        private BANK_TRANSFER() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.transfer.models.tracking.TransferAppSource
        public final String getKey() {
            return "BANK_TRANSFER";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transfer/models/tracking/TransferAppSource$DEFAULT;", "Lcom/revolut/feature/transfer/models/tracking/TransferAppSource;", "<init>", "()V", "feature_transfer_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DEFAULT implements TransferAppSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DEFAULT f92298a = new DEFAULT();

        @NotNull
        public static final Parcelable.Creator<DEFAULT> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DEFAULT.f92298a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DEFAULT[i];
            }
        }

        private DEFAULT() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.transfer.models.tracking.TransferAppSource
        public final String getKey() {
            return "DEFAULT";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transfer/models/tracking/TransferAppSource$PAYMENT_LINK;", "Lcom/revolut/feature/transfer/models/tracking/TransferAppSource;", "<init>", "()V", "feature_transfer_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PAYMENT_LINK implements TransferAppSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PAYMENT_LINK f92299a = new PAYMENT_LINK();

        @NotNull
        public static final Parcelable.Creator<PAYMENT_LINK> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PAYMENT_LINK.f92299a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PAYMENT_LINK[i];
            }
        }

        private PAYMENT_LINK() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.transfer.models.tracking.TransferAppSource
        public final String getKey() {
            return "PAYMENT_LINK";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transfer/models/tracking/TransferAppSource$USERNAME;", "Lcom/revolut/feature/transfer/models/tracking/TransferAppSource;", "<init>", "()V", "feature_transfer_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class USERNAME implements TransferAppSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final USERNAME f92300a = new USERNAME();

        @NotNull
        public static final Parcelable.Creator<USERNAME> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return USERNAME.f92300a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new USERNAME[i];
            }
        }

        private USERNAME() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.transfer.models.tracking.TransferAppSource
        public final String getKey() {
            return "USERNAME";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    String getKey();
}
