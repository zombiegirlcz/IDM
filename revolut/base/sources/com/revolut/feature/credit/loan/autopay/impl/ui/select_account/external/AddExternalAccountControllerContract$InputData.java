package com.revolut.feature.credit.loan.autopay.impl.ui.select_account.external;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/loan/autopay/impl/ui/select_account/external/AddExternalAccountControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_autopay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddExternalAccountControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AddExternalAccountControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f70293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsContext f70294c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AddExternalAccountControllerContract$InputData(parcel.readString(), parcel.readInt() != 0, (AnalyticsContext) parcel.readParcelable(AddExternalAccountControllerContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddExternalAccountControllerContract$InputData[i];
        }
    }

    public AddExternalAccountControllerContract$InputData(String userName, boolean z, AnalyticsContext analyticsContext, boolean z3) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        this.f70292a = userName;
        this.f70293b = z;
        this.f70294c = analyticsContext;
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
        if (!(obj2 instanceof AddExternalAccountControllerContract$InputData)) {
            return false;
        }
        AddExternalAccountControllerContract$InputData addExternalAccountControllerContract$InputData = (AddExternalAccountControllerContract$InputData) obj2;
        return Intrinsics.f(this.f70292a, addExternalAccountControllerContract$InputData.f70292a) && this.f70293b == addExternalAccountControllerContract$InputData.f70293b && Intrinsics.f(this.f70294c, addExternalAccountControllerContract$InputData.f70294c) && this.d == addExternalAccountControllerContract$InputData.d;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f70292a.hashCode() * 31, 31, this.f70293b);
        AnalyticsContext analyticsContext = this.f70294c;
        return Boolean.hashCode(this.d) + ((iC + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70292a);
        dest.writeInt(this.f70293b ? 1 : 0);
        dest.writeParcelable(this.f70294c, i);
        dest.writeInt(this.d ? 1 : 0);
    }
}
