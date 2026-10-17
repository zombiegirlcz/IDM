package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/trading/transfer/investments/impl/ui/transfer_out_create_revamp/screens/review/TransferOutReviewScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "FeesBreakdown", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_out_create_revamp/screens/review/TransferOutReviewScreenContract$ModalStep$FeesBreakdown;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TransferOutReviewScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_out_create_revamp/screens/review/TransferOutReviewScreenContract$ModalStep$FeesBreakdown;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_out_create_revamp/screens/review/TransferOutReviewScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FeesBreakdown extends TransferOutReviewScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<FeesBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f91644a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new FeesBreakdown(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeesBreakdown[i];
            }
        }

        public FeesBreakdown(ArrayList fees) {
            Intrinsics.checkNotNullParameter(fees, "fees");
            this.f91644a = fees;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FeesBreakdown) && this.f91644a.equals(((FeesBreakdown) obj2).f91644a);
        }

        public final int hashCode() {
            return this.f91644a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f91644a, dest);
            while (itY.hasNext()) {
                dest.writeSerializable((Serializable) itY.next());
            }
        }
    }

    private TransferOutReviewScreenContract$ModalStep() {
    }
}
