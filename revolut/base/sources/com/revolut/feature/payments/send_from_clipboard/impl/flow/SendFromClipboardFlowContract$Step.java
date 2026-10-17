package com.revolut.feature.payments.send_from_clipboard.impl.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/payments/send_from_clipboard/impl/flow/SendFromClipboardFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Selection", "Lcom/revolut/feature/payments/send_from_clipboard/impl/flow/SendFromClipboardFlowContract$Step$Selection;", "feature_payments_send_from_clipboard_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SendFromClipboardFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/payments/send_from_clipboard/impl/flow/SendFromClipboardFlowContract$Step$Selection;", "Lcom/revolut/feature/payments/send_from_clipboard/impl/flow/SendFromClipboardFlowContract$Step;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_payments_send_from_clipboard_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Selection extends SendFromClipboardFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Selection f79712a = new Selection();

        @NotNull
        public static final Parcelable.Creator<Selection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Selection.f79712a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Selection[i];
            }
        }

        private Selection() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof Selection);
        }

        public final int hashCode() {
            return 1757134089;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private SendFromClipboardFlowContract$Step() {
    }
}
