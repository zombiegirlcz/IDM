package com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/apptoapp/flow/accounts/OpenBankingAuthAccountsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OpenBankingAuthAccountsFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<OpenBankingAuthAccountsFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f72492c;
    public final String d;
    public final String e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OpenBankingAuthAccountsFlowContract$InputData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OpenBankingAuthAccountsFlowContract$InputData[i];
        }
    }

    public OpenBankingAuthAccountsFlowContract$InputData(String str, String str2, String request, String clientId, String redirectUri, String str3) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        this.f72490a = str;
        this.f72491b = str2;
        this.f72492c = request;
        this.d = clientId;
        this.e = redirectUri;
        this.f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OpenBankingAuthAccountsFlowContract$InputData)) {
            return false;
        }
        OpenBankingAuthAccountsFlowContract$InputData openBankingAuthAccountsFlowContract$InputData = (OpenBankingAuthAccountsFlowContract$InputData) obj2;
        return Intrinsics.f(this.f72490a, openBankingAuthAccountsFlowContract$InputData.f72490a) && Intrinsics.f(this.f72491b, openBankingAuthAccountsFlowContract$InputData.f72491b) && Intrinsics.f(this.f72492c, openBankingAuthAccountsFlowContract$InputData.f72492c) && Intrinsics.f(this.d, openBankingAuthAccountsFlowContract$InputData.d) && Intrinsics.f(this.e, openBankingAuthAccountsFlowContract$InputData.e) && Intrinsics.f(this.f, openBankingAuthAccountsFlowContract$InputData.f);
    }

    public final int hashCode() {
        String str = this.f72490a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f72491b;
        int iC = p.a.c(p.a.c(p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f72492c), 31, this.d), 31, this.e);
        String str3 = this.f;
        return iC + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72490a);
        dest.writeString(this.f72491b);
        dest.writeString(this.f72492c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
    }
}
