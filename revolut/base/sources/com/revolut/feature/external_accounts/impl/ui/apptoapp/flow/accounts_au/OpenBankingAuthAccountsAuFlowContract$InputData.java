package com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts_au;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/apptoapp/flow/accounts_au/OpenBankingAuthAccountsAuFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OpenBankingAuthAccountsAuFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<OpenBankingAuthAccountsAuFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72500b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OpenBankingAuthAccountsAuFlowContract$InputData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OpenBankingAuthAccountsAuFlowContract$InputData[i];
        }
    }

    public OpenBankingAuthAccountsAuFlowContract$InputData(String requestUri, String clientId) {
        Intrinsics.checkNotNullParameter(requestUri, "requestUri");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        this.f72499a = requestUri;
        this.f72500b = clientId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OpenBankingAuthAccountsAuFlowContract$InputData)) {
            return false;
        }
        OpenBankingAuthAccountsAuFlowContract$InputData openBankingAuthAccountsAuFlowContract$InputData = (OpenBankingAuthAccountsAuFlowContract$InputData) obj2;
        return Intrinsics.f(this.f72499a, openBankingAuthAccountsAuFlowContract$InputData.f72499a) && Intrinsics.f(this.f72500b, openBankingAuthAccountsAuFlowContract$InputData.f72500b);
    }

    public final int hashCode() {
        return this.f72500b.hashCode() + (this.f72499a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72499a);
        dest.writeString(this.f72500b);
    }
}
