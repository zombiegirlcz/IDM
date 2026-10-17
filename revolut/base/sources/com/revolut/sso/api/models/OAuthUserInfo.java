package com.revolut.sso.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0005\u0006\u0007\b\t\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/revolut/sso/api/models/OAuthUserInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "ConnectedClient", "Client", "Connection", "Scope", "a", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OAuthUserInfo implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f105947a;

    @NotNull
    public static final Parcelable.Creator<OAuthUserInfo> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/api/models/OAuthUserInfo$Client;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Client implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105949b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105950c;
        public final String d;
        public final String e;

        @NotNull
        public static final Parcelable.Creator<Client> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Client(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Client[i];
            }
        }

        public Client(String id10, String name, String iconUrl, String str, String str2) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
            this.f105948a = id10;
            this.f105949b = name;
            this.f105950c = iconUrl;
            this.d = str;
            this.e = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Client)) {
                return false;
            }
            Client client = (Client) obj2;
            return Intrinsics.f(this.f105948a, client.f105948a) && Intrinsics.f(this.f105949b, client.f105949b) && Intrinsics.f(this.f105950c, client.f105950c) && Intrinsics.f(this.d, client.d) && Intrinsics.f(this.e, client.e);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.f105948a.hashCode() * 31, 31, this.f105949b), 31, this.f105950c);
            String str = this.d;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105948a);
            dest.writeString(this.f105949b);
            dest.writeString(this.f105950c);
            dest.writeString(this.d);
            dest.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/api/models/OAuthUserInfo$ConnectedClient;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConnectedClient implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Client f105951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f105952b;

        @NotNull
        public static final Parcelable.Creator<ConnectedClient> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Client clientCreateFromParcel = Client.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Connection.CREATOR, parcel, arrayList, iA, 1);
                }
                return new ConnectedClient(clientCreateFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConnectedClient[i];
            }
        }

        public ConnectedClient(Client client, ArrayList connections) {
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(connections, "connections");
            this.f105951a = client;
            this.f105952b = connections;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ConnectedClient)) {
                return false;
            }
            ConnectedClient connectedClient = (ConnectedClient) obj2;
            return Intrinsics.f(this.f105951a, connectedClient.f105951a) && this.f105952b.equals(connectedClient.f105952b);
        }

        public final int hashCode() {
            return this.f105952b.hashCode() + (this.f105951a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f105951a.writeToParcel(dest, i);
            Iterator itY = j6.a.y(this.f105952b, dest);
            while (itY.hasNext()) {
                ((Connection) itY.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/api/models/OAuthUserInfo$Connection;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Connection implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f105954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f105955c;

        @NotNull
        public static final Parcelable.Creator<Connection> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Scope.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Connection(parcel.readLong(), string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Connection[i];
            }
        }

        public Connection(long j2, String accountId, ArrayList scopes) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(scopes, "scopes");
            this.f105953a = accountId;
            this.f105954b = scopes;
            this.f105955c = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Connection)) {
                return false;
            }
            Connection connection = (Connection) obj2;
            return Intrinsics.f(this.f105953a, connection.f105953a) && this.f105954b.equals(connection.f105954b) && this.f105955c == connection.f105955c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f105955c) + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105954b, this.f105953a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105953a);
            Iterator itY = j6.a.y(this.f105954b, dest);
            while (itY.hasNext()) {
                ((Scope) itY.next()).writeToParcel(dest, i);
            }
            dest.writeLong(this.f105955c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/api/models/OAuthUserInfo$Scope;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Scope implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105957b;

        @NotNull
        public static final Parcelable.Creator<Scope> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Scope(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Scope[i];
            }
        }

        public Scope(String id10, String name) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            this.f105956a = id10;
            this.f105957b = name;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Scope)) {
                return false;
            }
            Scope scope = (Scope) obj2;
            return Intrinsics.f(this.f105956a, scope.f105956a) && Intrinsics.f(this.f105957b, scope.f105957b);
        }

        public final int hashCode() {
            return this.f105957b.hashCode() + (this.f105956a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105956a);
            dest.writeString(this.f105957b);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(ConnectedClient.CREATOR, parcel, arrayList, iA, 1);
            }
            return new OAuthUserInfo(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OAuthUserInfo[i];
        }
    }

    public OAuthUserInfo(ArrayList connectedClients) {
        Intrinsics.checkNotNullParameter(connectedClients, "connectedClients");
        this.f105947a = connectedClients;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof OAuthUserInfo) && this.f105947a.equals(((OAuthUserInfo) obj2).f105947a);
    }

    public final int hashCode() {
        return this.f105947a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f105947a, dest);
        while (itY.hasNext()) {
            ((ConnectedClient) itY.next()).writeToParcel(dest, i);
        }
    }
}
