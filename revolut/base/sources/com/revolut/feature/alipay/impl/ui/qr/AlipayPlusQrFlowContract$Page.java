package com.revolut.feature.alipay.impl.ui.qr;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/alipay/impl/ui/qr/AlipayPlusQrFlowContract$Page", "Lcom/revolut/kompot/navigable/vc/pager/FixedIdPagerItem;", "<init>", "()V", "Scanner", "ShowCode", "Lcom/revolut/feature/alipay/impl/ui/qr/AlipayPlusQrFlowContract$Page$Scanner;", "Lcom/revolut/feature/alipay/impl/ui/qr/AlipayPlusQrFlowContract$Page$ShowCode;", "feature_alipay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AlipayPlusQrFlowContract$Page implements FixedIdPagerItem {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/alipay/impl/ui/qr/AlipayPlusQrFlowContract$Page$Scanner;", "Lcom/revolut/feature/alipay/impl/ui/qr/AlipayPlusQrFlowContract$Page;", "<init>", "()V", "feature_alipay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Scanner extends AlipayPlusQrFlowContract$Page {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Scanner f61071a = new Scanner();

        @NotNull
        public static final Parcelable.Creator<Scanner> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Scanner.f61071a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Scanner[i];
            }
        }

        private Scanner() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem, com.revolut.kompot.navigable.vc.pager.PagerItem
        public final String getId() {
            return "SCAN_TO_PAY";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/alipay/impl/ui/qr/AlipayPlusQrFlowContract$Page$ShowCode;", "Lcom/revolut/feature/alipay/impl/ui/qr/AlipayPlusQrFlowContract$Page;", "<init>", "()V", "feature_alipay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowCode extends AlipayPlusQrFlowContract$Page {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowCode f61072a = new ShowCode();

        @NotNull
        public static final Parcelable.Creator<ShowCode> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowCode.f61072a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowCode[i];
            }
        }

        private ShowCode() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem, com.revolut.kompot.navigable.vc.pager.PagerItem
        public final String getId() {
            return "SHOW_CODE";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private AlipayPlusQrFlowContract$Page() {
    }
}
