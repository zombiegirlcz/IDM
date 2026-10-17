package com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.repayment_method;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.kompot.common.IOData$Input;
import ft3.h1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okl.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/sepa_direct_debit/repayment_method/SepaDirectDebitRepaymentMethodContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SepaDirectDebitRepaymentMethodContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SepaDirectDebitRepaymentMethodContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f68357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f68358c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SepaDirectDebitRepaymentMethodContract$InputData(parcel.readString(), (h1) parcel.readSerializable(), ((AnalyticsContext) parcel.readParcelable(SepaDirectDebitRepaymentMethodContract$InputData.class.getClassLoader())).f50296a);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SepaDirectDebitRepaymentMethodContract$InputData[i];
        }
    }

    public SepaDirectDebitRepaymentMethodContract$InputData(String str, h1 productPayload, w0 w0Var) {
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        this.f68356a = str;
        this.f68357b = productPayload;
        this.f68358c = w0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SepaDirectDebitRepaymentMethodContract$InputData)) {
            return false;
        }
        SepaDirectDebitRepaymentMethodContract$InputData sepaDirectDebitRepaymentMethodContract$InputData = (SepaDirectDebitRepaymentMethodContract$InputData) obj2;
        return Intrinsics.f(this.f68356a, sepaDirectDebitRepaymentMethodContract$InputData.f68356a) && Intrinsics.f(this.f68357b, sepaDirectDebitRepaymentMethodContract$InputData.f68357b) && Intrinsics.f(this.f68358c, sepaDirectDebitRepaymentMethodContract$InputData.f68358c);
    }

    public final int hashCode() {
        String str = this.f68356a;
        return AnalyticsContext.a(this.f68358c) + ((this.f68357b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68356a);
        dest.writeSerializable(this.f68357b);
        m.x(this.f68358c, dest, i);
    }
}
