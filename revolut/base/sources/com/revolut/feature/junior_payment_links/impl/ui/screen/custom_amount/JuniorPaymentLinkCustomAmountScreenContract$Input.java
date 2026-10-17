package com.revolut.feature.junior_payment_links.impl.ui.screen.custom_amount;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.junior_payment_links.api.model.PaymentLinkCustomAmountBundle;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_payment_links/impl/ui/screen/custom_amount/JuniorPaymentLinkCustomAmountScreenContract$Input", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_junior_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorPaymentLinkCustomAmountScreenContract$Input implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<JuniorPaymentLinkCustomAmountScreenContract$Input> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentLinkCustomAmountBundle f77096a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorPaymentLinkCustomAmountScreenContract$Input((PaymentLinkCustomAmountBundle) parcel.readParcelable(JuniorPaymentLinkCustomAmountScreenContract$Input.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorPaymentLinkCustomAmountScreenContract$Input[i];
        }
    }

    public JuniorPaymentLinkCustomAmountScreenContract$Input(PaymentLinkCustomAmountBundle initialCustomAmountBundle) {
        Intrinsics.checkNotNullParameter(initialCustomAmountBundle, "initialCustomAmountBundle");
        this.f77096a = initialCustomAmountBundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof JuniorPaymentLinkCustomAmountScreenContract$Input) && Intrinsics.f(this.f77096a, ((JuniorPaymentLinkCustomAmountScreenContract$Input) obj2).f77096a);
    }

    public final int hashCode() {
        return this.f77096a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f77096a, i);
    }
}
