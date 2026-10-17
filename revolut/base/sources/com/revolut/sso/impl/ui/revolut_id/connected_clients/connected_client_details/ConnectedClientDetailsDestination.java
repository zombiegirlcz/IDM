package com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details;

import aii.u;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.sso.api.models.OAuthUserInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/sso/impl/ui/revolut_id/connected_clients/connected_client_details/ConnectedClientDetailsDestination;", "Laii/u;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConnectedClientDetailsDestination implements u, KompotDestination {

    @NotNull
    public static final Parcelable.Creator<ConnectedClientDetailsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OAuthUserInfo.Client f106724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OAuthUserInfo.Connection f106725b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConnectedClientDetailsDestination((OAuthUserInfo.Client) parcel.readParcelable(ConnectedClientDetailsDestination.class.getClassLoader()), (OAuthUserInfo.Connection) parcel.readParcelable(ConnectedClientDetailsDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ConnectedClientDetailsDestination[i];
        }
    }

    public ConnectedClientDetailsDestination(OAuthUserInfo.Client client, OAuthUserInfo.Connection connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f106724a = client;
        this.f106725b = connection;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final OAuthUserInfo.Client getF106724a() {
        return this.f106724a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OAuthUserInfo.Connection getF106725b() {
        return this.f106725b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ConnectedClientDetailsDestination)) {
            return false;
        }
        ConnectedClientDetailsDestination connectedClientDetailsDestination = (ConnectedClientDetailsDestination) obj2;
        return Intrinsics.f(this.f106724a, connectedClientDetailsDestination.f106724a) && Intrinsics.f(this.f106725b, connectedClientDetailsDestination.f106725b);
    }

    public final int hashCode() {
        return this.f106725b.hashCode() + (this.f106724a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f106724a, i);
        dest.writeParcelable(this.f106725b, i);
    }
}
