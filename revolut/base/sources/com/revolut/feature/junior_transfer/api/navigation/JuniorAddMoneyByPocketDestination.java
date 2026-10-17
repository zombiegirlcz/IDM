package com.revolut.feature.junior_transfer.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_transfer/api/navigation/JuniorAddMoneyByPocketDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_junior_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorAddMoneyByPocketDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<JuniorAddMoneyByPocketDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferMoneyPocket f77405b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorAddMoneyByPocketDestination(parcel.readString(), (TransferMoneyPocket) parcel.readParcelable(JuniorAddMoneyByPocketDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorAddMoneyByPocketDestination[i];
        }
    }

    public JuniorAddMoneyByPocketDestination(String pocketId, TransferMoneyPocket transferMoneyPocket) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(transferMoneyPocket, "transferMoneyPocket");
        this.f77404a = pocketId;
        this.f77405b = transferMoneyPocket;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TransferMoneyPocket getF77405b() {
        return this.f77405b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorAddMoneyByPocketDestination)) {
            return false;
        }
        JuniorAddMoneyByPocketDestination juniorAddMoneyByPocketDestination = (JuniorAddMoneyByPocketDestination) obj2;
        return Intrinsics.f(this.f77404a, juniorAddMoneyByPocketDestination.f77404a) && Intrinsics.f(this.f77405b, juniorAddMoneyByPocketDestination.f77405b);
    }

    /* JADX INFO: renamed from: getPocketId, reason: from getter */
    public final String getF77404a() {
        return this.f77404a;
    }

    public final int hashCode() {
        return this.f77405b.hashCode() + (this.f77404a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77404a);
        dest.writeParcelable(this.f77405b, i);
    }
}
