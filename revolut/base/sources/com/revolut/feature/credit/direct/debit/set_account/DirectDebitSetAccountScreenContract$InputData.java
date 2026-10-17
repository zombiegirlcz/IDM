package com.revolut.feature.credit.direct.debit.set_account;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/direct/debit/set_account/DirectDebitSetAccountScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_direct_debit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DirectDebitSetAccountScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DirectDebitSetAccountScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsContext f69918b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DirectDebitSetAccountScreenContract$InputData(parcel.readString(), (AnalyticsContext) parcel.readParcelable(DirectDebitSetAccountScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DirectDebitSetAccountScreenContract$InputData[i];
        }
    }

    public DirectDebitSetAccountScreenContract$InputData(String str, AnalyticsContext analyticsContext) {
        this.f69917a = str;
        this.f69918b = analyticsContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DirectDebitSetAccountScreenContract$InputData)) {
            return false;
        }
        DirectDebitSetAccountScreenContract$InputData directDebitSetAccountScreenContract$InputData = (DirectDebitSetAccountScreenContract$InputData) obj2;
        return Intrinsics.f(this.f69917a, directDebitSetAccountScreenContract$InputData.f69917a) && Intrinsics.f(this.f69918b, directDebitSetAccountScreenContract$InputData.f69918b);
    }

    public final int hashCode() {
        String str = this.f69917a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AnalyticsContext analyticsContext = this.f69918b;
        return iHashCode + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69917a);
        dest.writeParcelable(this.f69918b, i);
    }
}
