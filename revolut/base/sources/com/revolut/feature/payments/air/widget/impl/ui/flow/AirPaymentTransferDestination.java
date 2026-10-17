package com.revolut.feature.payments.air.widget.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.air.widget.impl.model.PaymentWidget;
import com.revolut.feature.payments.air.widget.impl.ui.chat.ResolvedRecipient;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/air/widget/impl/ui/flow/AirPaymentTransferDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AirPaymentTransferDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<AirPaymentTransferDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentWidget f79125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResolvedRecipient f79126b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AirPaymentTransferDestination(PaymentWidget.CREATOR.createFromParcel(parcel), (ResolvedRecipient) parcel.readParcelable(AirPaymentTransferDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AirPaymentTransferDestination[i];
        }
    }

    public AirPaymentTransferDestination(PaymentWidget widget, ResolvedRecipient recipient) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f79125a = widget;
        this.f79126b = recipient;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AirPaymentTransferDestination)) {
            return false;
        }
        AirPaymentTransferDestination airPaymentTransferDestination = (AirPaymentTransferDestination) obj2;
        return Intrinsics.f(this.f79125a, airPaymentTransferDestination.f79125a) && Intrinsics.f(this.f79126b, airPaymentTransferDestination.f79126b);
    }

    public final int hashCode() {
        return this.f79126b.hashCode() + (this.f79125a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f79125a.writeToParcel(dest, i);
        dest.writeParcelable(this.f79126b, i);
    }
}
