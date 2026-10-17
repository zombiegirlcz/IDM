package com.revolut.feature.trading.transfer.investments.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u8f.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/api/navigation/NewTransferDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NewTransferDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<NewTransferDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f91537a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NewTransferDestination(d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NewTransferDestination[i];
        }
    }

    public NewTransferDestination() {
        this(0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d getF91537a() {
        return this.f91537a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof NewTransferDestination) && this.f91537a == ((NewTransferDestination) obj2).f91537a;
    }

    public final int hashCode() {
        return this.f91537a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91537a.name());
    }

    public NewTransferDestination(d preselectedTransferDirection) {
        Intrinsics.checkNotNullParameter(preselectedTransferDirection, "preselectedTransferDirection");
        this.f91537a = preselectedTransferDirection;
    }

    public /* synthetic */ NewTransferDestination(int i) {
        this(d.NONE);
    }
}
