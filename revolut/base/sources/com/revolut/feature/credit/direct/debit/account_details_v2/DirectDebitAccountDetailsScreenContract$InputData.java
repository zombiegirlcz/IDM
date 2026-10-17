package com.revolut.feature.credit.direct.debit.account_details_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/direct/debit/account_details_v2/DirectDebitAccountDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_direct_debit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DirectDebitAccountDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DirectDebitAccountDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DirectDebitAccountDetailsScreenContract$AccountInfo f69880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f69881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f69882c;
    public final AnalyticsContext d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DirectDebitAccountDetailsScreenContract$InputData((DirectDebitAccountDetailsScreenContract$AccountInfo) parcel.readParcelable(DirectDebitAccountDetailsScreenContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(DirectDebitAccountDetailsScreenContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(DirectDebitAccountDetailsScreenContract$InputData.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(DirectDebitAccountDetailsScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DirectDebitAccountDetailsScreenContract$InputData[i];
        }
    }

    public DirectDebitAccountDetailsScreenContract$InputData(DirectDebitAccountDetailsScreenContract$AccountInfo accountInfo, Clause toolbarTitle, Clause toolbarDescription, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(accountInfo, "accountInfo");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(toolbarDescription, "toolbarDescription");
        this.f69880a = accountInfo;
        this.f69881b = toolbarTitle;
        this.f69882c = toolbarDescription;
        this.d = analyticsContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DirectDebitAccountDetailsScreenContract$InputData)) {
            return false;
        }
        DirectDebitAccountDetailsScreenContract$InputData directDebitAccountDetailsScreenContract$InputData = (DirectDebitAccountDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f69880a, directDebitAccountDetailsScreenContract$InputData.f69880a) && Intrinsics.f(this.f69881b, directDebitAccountDetailsScreenContract$InputData.f69881b) && Intrinsics.f(this.f69882c, directDebitAccountDetailsScreenContract$InputData.f69882c) && Intrinsics.f(this.d, directDebitAccountDetailsScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iA = p.a.a(p.a.a(this.f69880a.hashCode() * 31, 31, this.f69881b), 31, this.f69882c);
        AnalyticsContext analyticsContext = this.d;
        return iA + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f69880a, i);
        dest.writeParcelable(this.f69881b, i);
        dest.writeParcelable(this.f69882c, i);
        dest.writeParcelable(this.d, i);
    }
}
