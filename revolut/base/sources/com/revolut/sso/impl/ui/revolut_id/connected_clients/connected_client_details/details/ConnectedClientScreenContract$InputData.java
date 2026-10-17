package com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.sso.api.models.OAuthUserInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/sso/impl/ui/revolut_id/connected_clients/connected_client_details/details/ConnectedClientScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConnectedClientScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ConnectedClientScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OAuthUserInfo.Client f106732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OAuthUserInfo.Connection f106733b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConnectedClientScreenContract$InputData((OAuthUserInfo.Client) parcel.readParcelable(ConnectedClientScreenContract$InputData.class.getClassLoader()), (OAuthUserInfo.Connection) parcel.readParcelable(ConnectedClientScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ConnectedClientScreenContract$InputData[i];
        }
    }

    public ConnectedClientScreenContract$InputData(OAuthUserInfo.Client client, OAuthUserInfo.Connection connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f106732a = client;
        this.f106733b = connection;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ConnectedClientScreenContract$InputData)) {
            return false;
        }
        ConnectedClientScreenContract$InputData connectedClientScreenContract$InputData = (ConnectedClientScreenContract$InputData) obj2;
        return Intrinsics.f(this.f106732a, connectedClientScreenContract$InputData.f106732a) && Intrinsics.f(this.f106733b, connectedClientScreenContract$InputData.f106733b);
    }

    public final int hashCode() {
        return this.f106733b.hashCode() + (this.f106732a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f106732a, i);
        dest.writeParcelable(this.f106733b, i);
    }
}
