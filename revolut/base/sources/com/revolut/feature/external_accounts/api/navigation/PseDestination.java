package com.revolut.feature.external_accounts.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/PseDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PseDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<PseDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f72353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f72355c;
    public final TopUpMethodsContext d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PseDestination((d) parcel.readSerializable(), parcel.readString(), parcel.readString(), (TopUpMethodsContext) parcel.readParcelable(PseDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PseDestination[i];
        }
    }

    public PseDestination(d amount, String str, String str2, TopUpMethodsContext topUpMethodsContext) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(topUpMethodsContext, "topUpMethodsContext");
        this.f72353a = amount;
        this.f72354b = str;
        this.f72355c = str2;
        this.d = topUpMethodsContext;
    }

    /* JADX INFO: renamed from: Z0, reason: from getter */
    public final d getF72353a() {
        return this.f72353a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF72355c() {
        return this.f72355c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TopUpMethodsContext getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PseDestination)) {
            return false;
        }
        PseDestination pseDestination = (PseDestination) obj2;
        return Intrinsics.f(this.f72353a, pseDestination.f72353a) && Intrinsics.f(this.f72354b, pseDestination.f72354b) && Intrinsics.f(this.f72355c, pseDestination.f72355c) && Intrinsics.f(this.d, pseDestination.d);
    }

    /* JADX INFO: renamed from: getPocketId, reason: from getter */
    public final String getF72354b() {
        return this.f72354b;
    }

    public final int hashCode() {
        int iHashCode = this.f72353a.hashCode() * 31;
        String str = this.f72354b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f72355c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f72353a);
        dest.writeString(this.f72354b);
        dest.writeString(this.f72355c);
        dest.writeParcelable(this.d, i);
    }
}
