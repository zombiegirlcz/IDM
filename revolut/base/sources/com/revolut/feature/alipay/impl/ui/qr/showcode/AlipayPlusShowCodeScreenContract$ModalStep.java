package com.revolut.feature.alipay.impl.ui.qr.showcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/alipay/impl/ui/qr/showcode/AlipayPlusShowCodeScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Barcode", "QrCode", "Lcom/revolut/feature/alipay/impl/ui/qr/showcode/AlipayPlusShowCodeScreenContract$ModalStep$Barcode;", "Lcom/revolut/feature/alipay/impl/ui/qr/showcode/AlipayPlusShowCodeScreenContract$ModalStep$QrCode;", "feature_alipay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AlipayPlusShowCodeScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/alipay/impl/ui/qr/showcode/AlipayPlusShowCodeScreenContract$ModalStep$Barcode;", "Lcom/revolut/feature/alipay/impl/ui/qr/showcode/AlipayPlusShowCodeScreenContract$ModalStep;", "<init>", "()V", "feature_alipay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Barcode implements AlipayPlusShowCodeScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Barcode f61079a = new Barcode();

        @NotNull
        public static final Parcelable.Creator<Barcode> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Barcode.f61079a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Barcode[i];
            }
        }

        private Barcode() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/alipay/impl/ui/qr/showcode/AlipayPlusShowCodeScreenContract$ModalStep$QrCode;", "Lcom/revolut/feature/alipay/impl/ui/qr/showcode/AlipayPlusShowCodeScreenContract$ModalStep;", "<init>", "()V", "feature_alipay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class QrCode implements AlipayPlusShowCodeScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final QrCode f61080a = new QrCode();

        @NotNull
        public static final Parcelable.Creator<QrCode> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return QrCode.f61080a;
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
