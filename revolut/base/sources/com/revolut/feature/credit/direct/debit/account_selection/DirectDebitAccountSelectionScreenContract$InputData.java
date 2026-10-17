package com.revolut.feature.credit.direct.debit.account_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/direct/debit/account_selection/DirectDebitAccountSelectionScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_direct_debit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DirectDebitAccountSelectionScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DirectDebitAccountSelectionScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f69888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsContext f69889c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DirectDebitAccountSelectionScreenContract$InputData(parcel.readString(), parcel.readInt() != 0, (AnalyticsContext) parcel.readParcelable(DirectDebitAccountSelectionScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DirectDebitAccountSelectionScreenContract$InputData[i];
        }
    }

    public DirectDebitAccountSelectionScreenContract$InputData(String str, boolean z, AnalyticsContext analyticsContext) {
        this.f69887a = str;
        this.f69888b = z;
        this.f69889c = analyticsContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DirectDebitAccountSelectionScreenContract$InputData)) {
            return false;
        }
        DirectDebitAccountSelectionScreenContract$InputData directDebitAccountSelectionScreenContract$InputData = (DirectDebitAccountSelectionScreenContract$InputData) obj2;
        return Intrinsics.f(this.f69887a, directDebitAccountSelectionScreenContract$InputData.f69887a) && this.f69888b == directDebitAccountSelectionScreenContract$InputData.f69888b && Intrinsics.f(this.f69889c, directDebitAccountSelectionScreenContract$InputData.f69889c);
    }

    public final int hashCode() {
        String str = this.f69887a;
        int iC = j6.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f69888b);
        AnalyticsContext analyticsContext = this.f69889c;
        return iC + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69887a);
        dest.writeInt(this.f69888b ? 1 : 0);
        dest.writeParcelable(this.f69889c, i);
    }

    public /* synthetic */ DirectDebitAccountSelectionScreenContract$InputData(String str, AnalyticsContext analyticsContext, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) == 0, (i & 4) != 0 ? null : analyticsContext);
    }
}
