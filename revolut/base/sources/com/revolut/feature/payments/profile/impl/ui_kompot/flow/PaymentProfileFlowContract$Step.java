package com.revolut.feature.payments.profile.impl.ui_kompot.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/payments/profile/impl/ui_kompot/flow/PaymentProfileFlowContract$Step", "Lcom/revolut/kompot/navigable/vc/pager/FixedIdPagerItem;", "<init>", "()V", "Details", "Scanner", "Lcom/revolut/feature/payments/profile/impl/ui_kompot/flow/PaymentProfileFlowContract$Step$Details;", "Lcom/revolut/feature/payments/profile/impl/ui_kompot/flow/PaymentProfileFlowContract$Step$Scanner;", "retail_feature_payments_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PaymentProfileFlowContract$Step implements FixedIdPagerItem {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/profile/impl/ui_kompot/flow/PaymentProfileFlowContract$Step$Details;", "Lcom/revolut/feature/payments/profile/impl/ui_kompot/flow/PaymentProfileFlowContract$Step;", "<init>", "()V", "retail_feature_payments_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Details extends PaymentProfileFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Details f79631a = new Details();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f79632b = sw9.a.CODE.getId();

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Details.f79631a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        private Details() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem, com.revolut.kompot.navigable.vc.pager.PagerItem
        /* JADX INFO: renamed from: getId */
        public final String getF64253b() {
            return f79632b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/profile/impl/ui_kompot/flow/PaymentProfileFlowContract$Step$Scanner;", "Lcom/revolut/feature/payments/profile/impl/ui_kompot/flow/PaymentProfileFlowContract$Step;", "<init>", "()V", "retail_feature_payments_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Scanner extends PaymentProfileFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Scanner f79633a = new Scanner();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f79634b = sw9.a.SCAN.getId();

        @NotNull
        public static final Parcelable.Creator<Scanner> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Scanner.f79633a;
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
        /* JADX INFO: renamed from: getId */
        public final String getF64253b() {
            return f79634b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private PaymentProfileFlowContract$Step() {
    }
}
