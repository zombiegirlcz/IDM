package com.revolut.feature.external_accounts.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/OpenBankingAuthAccountsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OpenBankingAuthAccountsDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<OpenBankingAuthAccountsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f72343c;
    public final String d;
    public final String e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OpenBankingAuthAccountsDestination(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OpenBankingAuthAccountsDestination[i];
        }
    }

    public OpenBankingAuthAccountsDestination(String str, String str2, String request, String clientId, String redirectUri, String str3) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        this.f72341a = str;
        this.f72342b = str2;
        this.f72343c = request;
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
        if (!(obj2 instanceof OpenBankingAuthAccountsDestination)) {
            return false;
        }
        OpenBankingAuthAccountsDestination openBankingAuthAccountsDestination = (OpenBankingAuthAccountsDestination) obj2;
        return Intrinsics.f(this.f72341a, openBankingAuthAccountsDestination.f72341a) && Intrinsics.f(this.f72342b, openBankingAuthAccountsDestination.f72342b) && Intrinsics.f(this.f72343c, openBankingAuthAccountsDestination.f72343c) && Intrinsics.f(this.d, openBankingAuthAccountsDestination.d) && Intrinsics.f(this.e, openBankingAuthAccountsDestination.e) && Intrinsics.f(this.f, openBankingAuthAccountsDestination.f);
    }

    public final int hashCode() {
        String str = this.f72341a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f72342b;
        int iC = p.a.c(p.a.c(p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f72343c), 31, this.d), 31, this.e);
        String str3 = this.f;
        return iC + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72341a);
        dest.writeString(this.f72342b);
        dest.writeString(this.f72343c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
    }
}
