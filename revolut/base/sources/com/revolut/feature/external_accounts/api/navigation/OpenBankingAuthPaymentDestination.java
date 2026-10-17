package com.revolut.feature.external_accounts.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/OpenBankingAuthPaymentDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OpenBankingAuthPaymentDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<OpenBankingAuthPaymentDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f72346c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f72347g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OpenBankingAuthPaymentDestination(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OpenBankingAuthPaymentDestination[i];
        }
    }

    public OpenBankingAuthPaymentDestination(String str, String str2, String request, String clientId, String redirectUri, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        this.f72344a = str;
        this.f72345b = str2;
        this.f72346c = request;
        this.d = clientId;
        this.e = redirectUri;
        this.f = str3;
        this.f72347g = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OpenBankingAuthPaymentDestination)) {
            return false;
        }
        OpenBankingAuthPaymentDestination openBankingAuthPaymentDestination = (OpenBankingAuthPaymentDestination) obj2;
        return Intrinsics.f(this.f72344a, openBankingAuthPaymentDestination.f72344a) && Intrinsics.f(this.f72345b, openBankingAuthPaymentDestination.f72345b) && Intrinsics.f(this.f72346c, openBankingAuthPaymentDestination.f72346c) && Intrinsics.f(this.d, openBankingAuthPaymentDestination.d) && Intrinsics.f(this.e, openBankingAuthPaymentDestination.e) && Intrinsics.f(this.f, openBankingAuthPaymentDestination.f) && this.f72347g == openBankingAuthPaymentDestination.f72347g;
    }

    public final int hashCode() {
        String str = this.f72344a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f72345b;
        int iC = p.a.c(p.a.c(p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f72346c), 31, this.d), 31, this.e);
        String str3 = this.f;
        return Boolean.hashCode(this.f72347g) + ((iC + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72344a);
        dest.writeString(this.f72345b);
        dest.writeString(this.f72346c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeInt(this.f72347g ? 1 : 0);
    }
}
