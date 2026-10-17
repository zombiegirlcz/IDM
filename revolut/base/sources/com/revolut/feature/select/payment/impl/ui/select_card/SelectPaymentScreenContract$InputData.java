package com.revolut.feature.select.payment.impl.ui.select_card;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t61.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/select/payment/impl/ui/select_card/SelectPaymentScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_select_payment_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectPaymentScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SelectPaymentScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f85820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f85821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsContext f85822c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelectPaymentScreenContract$InputData((g) parcel.readSerializable(), parcel.readInt() != 0, (AnalyticsContext) parcel.readParcelable(SelectPaymentScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectPaymentScreenContract$InputData[i];
        }
    }

    public SelectPaymentScreenContract$InputData(g selectedExternalCard, boolean z, AnalyticsContext analyticsContext, boolean z3) {
        Intrinsics.checkNotNullParameter(selectedExternalCard, "selectedExternalCard");
        this.f85820a = selectedExternalCard;
        this.f85821b = z;
        this.f85822c = analyticsContext;
        this.d = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SelectPaymentScreenContract$InputData)) {
            return false;
        }
        SelectPaymentScreenContract$InputData selectPaymentScreenContract$InputData = (SelectPaymentScreenContract$InputData) obj2;
        return Intrinsics.f(this.f85820a, selectPaymentScreenContract$InputData.f85820a) && this.f85821b == selectPaymentScreenContract$InputData.f85821b && Intrinsics.f(this.f85822c, selectPaymentScreenContract$InputData.f85822c) && this.d == selectPaymentScreenContract$InputData.d;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f85820a.hashCode() * 31, 31, this.f85821b);
        AnalyticsContext analyticsContext = this.f85822c;
        return Boolean.hashCode(this.d) + ((iC + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f85820a);
        dest.writeInt(this.f85821b ? 1 : 0);
        dest.writeParcelable(this.f85822c, i);
        dest.writeInt(this.d ? 1 : 0);
    }
}
