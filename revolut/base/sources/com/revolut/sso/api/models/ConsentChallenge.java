package com.revolut.sso.api.models;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.identity.auth.domain.model.IndividualIdentityId;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/sso/api/models/ConsentChallenge;", "Landroid/os/Parcelable;", "App", "Qr", "Client", "Device", "Operation", "Lcom/revolut/sso/api/models/ConsentChallenge$App;", "Lcom/revolut/sso/api/models/ConsentChallenge$Qr;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ConsentChallenge extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/api/models/ConsentChallenge$App;", "Lcom/revolut/sso/api/models/ConsentChallenge;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class App implements ConsentChallenge {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f105895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f105896c;
        public final String d;
        public final Device e;
        public final Client f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Operation f105897g;

        @NotNull
        public static final Parcelable.Creator<App> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new App(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), Device.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Client.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Operation.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new App[i];
            }
        }

        public App(String id10, long j2, long j3, String hint, Device device, Client client, Operation operation) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(hint, "hint");
            Intrinsics.checkNotNullParameter(device, "device");
            this.f105894a = id10;
            this.f105895b = j2;
            this.f105896c = j3;
            this.d = hint;
            this.e = device;
            this.f = client;
            this.f105897g = operation;
        }

        @Override // com.revolut.sso.api.models.ConsentChallenge
        /* JADX INFO: renamed from: Q0, reason: from getter */
        public final Operation getF105927g() {
            return this.f105897g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof App)) {
                return false;
            }
            App app = (App) obj2;
            return Intrinsics.f(this.f105894a, app.f105894a) && this.f105895b == app.f105895b && this.f105896c == app.f105896c && Intrinsics.f(this.d, app.d) && Intrinsics.f(this.e, app.e) && Intrinsics.f(this.f, app.f) && Intrinsics.f(this.f105897g, app.f105897g);
        }

        @Override // com.revolut.sso.api.models.ConsentChallenge
        /* JADX INFO: renamed from: f6, reason: from getter */
        public final long getF105925b() {
            return this.f105895b;
        }

        @Override // com.revolut.sso.api.models.ConsentChallenge
        /* JADX INFO: renamed from: getCreatedAt, reason: from getter */
        public final long getF105926c() {
            return this.f105896c;
        }

        @Override // com.revolut.sso.api.models.ConsentChallenge
        /* JADX INFO: renamed from: getDevice, reason: from getter */
        public final Device getE() {
            return this.e;
        }

        @Override // com.revolut.sso.api.models.ConsentChallenge
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF105924a() {
            return this.f105894a;
        }

        public final int hashCode() {
            int iHashCode = (this.e.hashCode() + p.a.c(d.c(d.c(this.f105894a.hashCode() * 31, 31, this.f105895b), 31, this.f105896c), 31, this.d)) * 31;
            Client client = this.f;
            int iHashCode2 = (iHashCode + (client == null ? 0 : client.hashCode())) * 31;
            Operation operation = this.f105897g;
            return iHashCode2 + (operation != null ? operation.hashCode() : 0);
        }

        @Override // com.revolut.sso.api.models.ConsentChallenge
        /* JADX INFO: renamed from: j4, reason: from getter */
        public final Client getF() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105894a);
            dest.writeLong(this.f105895b);
            dest.writeLong(this.f105896c);
            dest.writeString(this.d);
            this.e.writeToParcel(dest, i);
            Client client = this.f;
            if (client == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                client.writeToParcel(dest, i);
            }
            Operation operation = this.f105897g;
            if (operation == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                operation.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/api/models/ConsentChallenge$Client;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Client implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105899b;

        @NotNull
        public static final Parcelable.Creator<Client> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Client(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Client[i];
            }
        }

        public Client(String str, String str2) {
            this.f105898a = str;
            this.f105899b = str2;
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
            return Intrinsics.f(this.f105898a, client.f105898a) && Intrinsics.f(this.f105899b, client.f105899b);
        }

        public final int hashCode() {
            String str = this.f105898a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f105899b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105898a);
            dest.writeString(this.f105899b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/sso/api/models/ConsentChallenge$Device;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "Location", "a", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Device implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Location f105902c;

        @NotNull
        public static final Parcelable.Creator<Device> CREATOR = new b();

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/sso/api/models/ConsentChallenge$Device$Location;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "com/revolut/sso/api/models/b", "a", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Location implements Parcelable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.revolut.sso.api.models.b f105903a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f105904b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Double f105905c;
            public final Double d;

            @NotNull
            public static final Parcelable.Creator<Location> CREATOR = new b();

            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Location(parcel.readInt() == 0 ? null : com.revolut.sso.api.models.b.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Location[i];
                }
            }

            public Location(com.revolut.sso.api.models.b bVar, String str, Double d, Double d5) {
                this.f105903a = bVar;
                this.f105904b = str;
                this.f105905c = d;
                this.d = d5;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Location)) {
                    return false;
                }
                Location location = (Location) obj2;
                return this.f105903a == location.f105903a && Intrinsics.f(this.f105904b, location.f105904b) && Intrinsics.f(this.f105905c, location.f105905c) && Intrinsics.f(this.d, location.d);
            }

            public final int hashCode() {
                com.revolut.sso.api.models.b bVar = this.f105903a;
                int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
                String str = this.f105904b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                Double d = this.f105905c;
                int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
                Double d5 = this.d;
                return iHashCode3 + (d5 != null ? d5.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                com.revolut.sso.api.models.b bVar = this.f105903a;
                if (bVar == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(bVar.name());
                }
                dest.writeString(this.f105904b);
                Double d = this.f105905c;
                if (d == null) {
                    dest.writeInt(0);
                } else {
                    org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
                }
                Double d5 = this.d;
                if (d5 == null) {
                    dest.writeInt(0);
                } else {
                    org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d5);
                }
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Device(parcel.readString(), parcel.readString(), Location.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Device[i];
            }
        }

        public Device(String name, String str, Location location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            this.f105900a = name;
            this.f105901b = str;
            this.f105902c = location;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Device)) {
                return false;
            }
            Device device = (Device) obj2;
            return Intrinsics.f(this.f105900a, device.f105900a) && Intrinsics.f(this.f105901b, device.f105901b) && Intrinsics.f(this.f105902c, device.f105902c);
        }

        public final int hashCode() {
            int iHashCode = this.f105900a.hashCode() * 31;
            String str = this.f105901b;
            return this.f105902c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105900a);
            dest.writeString(this.f105901b);
            this.f105902c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/sso/api/models/ConsentChallenge$Operation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "Property", "a", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Operation implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105908c;
        public final List d;

        @NotNull
        public static final Parcelable.Creator<Operation> CREATOR = new b();

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/api/models/ConsentChallenge$Operation$Property;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Property implements Parcelable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105909a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f105910b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105911c;

            @NotNull
            public static final Parcelable.Creator<Property> CREATOR = new b();

            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Property(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Property[i];
                }
            }

            public Property(String name, String str, String value) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                this.f105909a = name;
                this.f105910b = str;
                this.f105911c = value;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Property)) {
                    return false;
                }
                Property property = (Property) obj2;
                return Intrinsics.f(this.f105909a, property.f105909a) && Intrinsics.f(this.f105910b, property.f105910b) && Intrinsics.f(this.f105911c, property.f105911c);
            }

            public final int hashCode() {
                int iHashCode = this.f105909a.hashCode() * 31;
                String str = this.f105910b;
                return this.f105911c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105909a);
                dest.writeString(this.f105910b);
                dest.writeString(this.f105911c);
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Property.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Operation(string, string2, string3, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Operation[i];
            }
        }

        public Operation(String title, String subtitle, String str, List properties) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(properties, "properties");
            this.f105906a = title;
            this.f105907b = subtitle;
            this.f105908c = str;
            this.d = properties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Operation)) {
                return false;
            }
            Operation operation = (Operation) obj2;
            return Intrinsics.f(this.f105906a, operation.f105906a) && Intrinsics.f(this.f105907b, operation.f105907b) && Intrinsics.f(this.f105908c, operation.f105908c) && Intrinsics.f(this.d, operation.d);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f105906a.hashCode() * 31, 31, this.f105907b);
            String str = this.f105908c;
            return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105906a);
            dest.writeString(this.f105907b);
            dest.writeString(this.f105908c);
            Iterator itV = p.a.v(this.d, dest);
            while (itV.hasNext()) {
                ((Property) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/sso/api/models/ConsentChallenge$Qr;", "Lcom/revolut/sso/api/models/ConsentChallenge;", "Personal", "Delegated", "Lcom/revolut/sso/api/models/ConsentChallenge$Qr$Delegated;", "Lcom/revolut/sso/api/models/ConsentChallenge$Qr$Personal;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Qr extends ConsentChallenge {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/sso/api/models/ConsentChallenge$Qr$Delegated;", "Lcom/revolut/sso/api/models/ConsentChallenge$Qr;", "", "toString", "()Ljava/lang/String;", "Companion", "Selection", "Details", "a", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Delegated implements Qr {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105912a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f105913b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f105914c;
            public final String d;
            public final Device e;
            public final Client f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final Operation f105915g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final Selection f105916h;
            public final Details i;

            @NotNull
            public static final Parcelable.Creator<Delegated> CREATOR = new b();

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/sso/api/models/ConsentChallenge$Qr$Delegated$Details;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "Action", "a", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Details implements Parcelable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Action f105917a;

                @NotNull
                public static final Parcelable.Creator<Details> CREATOR = new b();

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/api/models/ConsentChallenge$Qr$Delegated$Details$Action;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class Action implements Parcelable {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final String f105918a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final String f105919b;

                    @NotNull
                    public static final Parcelable.Creator<Action> CREATOR = new b();

                    public static final class b implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new Action(parcel.readString(), parcel.readString());
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new Action[i];
                        }
                    }

                    public Action(String label, String deepLink) {
                        Intrinsics.checkNotNullParameter(label, "label");
                        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
                        this.f105918a = label;
                        this.f105919b = deepLink;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if (!(obj2 instanceof Action)) {
                            return false;
                        }
                        Action action = (Action) obj2;
                        return Intrinsics.f(this.f105918a, action.f105918a) && Intrinsics.f(this.f105919b, action.f105919b);
                    }

                    public final int hashCode() {
                        return this.f105919b.hashCode() + (this.f105918a.hashCode() * 31);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int i) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeString(this.f105918a);
                        dest.writeString(this.f105919b);
                    }
                }

                public static final class b implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Details(parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Details[i];
                    }
                }

                public Details(Action action) {
                    this.f105917a = action;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Details) && Intrinsics.f(this.f105917a, ((Details) obj2).f105917a);
                }

                public final int hashCode() {
                    Action action = this.f105917a;
                    if (action == null) {
                        return 0;
                    }
                    return action.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    Action action = this.f105917a;
                    if (action == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        action.writeToParcel(dest, i);
                    }
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/sso/api/models/ConsentChallenge$Qr$Delegated$Selection;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "Identity", "a", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Selection implements Parcelable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ArrayList f105920a;

                @NotNull
                public static final Parcelable.Creator<Selection> CREATOR = new b();

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/api/models/ConsentChallenge$Qr$Delegated$Selection$Identity;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class Identity implements Parcelable {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final String f105921a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final String f105922b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final String f105923c;

                    @NotNull
                    public static final Parcelable.Creator<Identity> CREATOR = new b();

                    public static final class b implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            String str = ((IndividualIdentityId) parcel.readParcelable(Identity.class.getClassLoader())).f74763a;
                            RegisteredIdentityId registeredIdentityId = (RegisteredIdentityId) parcel.readParcelable(Identity.class.getClassLoader());
                            return new Identity(str, registeredIdentityId != null ? registeredIdentityId.f74764a : null, parcel.readString());
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new Identity[i];
                        }
                    }

                    public Identity(String identityId, String str, String name) {
                        Intrinsics.checkNotNullParameter(identityId, "identityId");
                        Intrinsics.checkNotNullParameter(name, "name");
                        this.f105921a = identityId;
                        this.f105922b = str;
                        this.f105923c = name;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final boolean equals(java.lang.Object r5) {
                        /*
                            r4 = this;
                            r0 = 1
                            if (r4 != r5) goto L4
                            return r0
                        L4:
                            boolean r1 = r5 instanceof com.revolut.sso.api.models.ConsentChallenge.Qr.Delegated.Selection.Identity
                            r2 = 0
                            if (r1 != 0) goto La
                            return r2
                        La:
                            com.revolut.sso.api.models.ConsentChallenge$Qr$Delegated$Selection$Identity r5 = (com.revolut.sso.api.models.ConsentChallenge.Qr.Delegated.Selection.Identity) r5
                            java.lang.String r1 = r4.f105921a
                            java.lang.String r3 = r5.f105921a
                            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                            if (r1 != 0) goto L17
                            return r2
                        L17:
                            java.lang.String r1 = r5.f105922b
                            java.lang.String r3 = r4.f105922b
                            if (r3 != 0) goto L23
                            if (r1 != 0) goto L21
                            r1 = r0
                            goto L2a
                        L21:
                            r1 = r2
                            goto L2a
                        L23:
                            if (r1 != 0) goto L26
                            goto L21
                        L26:
                            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
                        L2a:
                            if (r1 != 0) goto L2d
                            return r2
                        L2d:
                            java.lang.String r1 = r4.f105923c
                            java.lang.String r5 = r5.f105923c
                            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
                            if (r5 != 0) goto L38
                            return r2
                        L38:
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.api.models.ConsentChallenge.Qr.Delegated.Selection.Identity.equals(java.lang.Object):boolean");
                    }

                    public final int hashCode() {
                        int iHashCode = this.f105921a.hashCode() * 31;
                        String str = this.f105922b;
                        return this.f105923c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int i) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeParcelable(new IndividualIdentityId(this.f105921a), i);
                        String str = this.f105922b;
                        dest.writeParcelable(str != null ? new RegisteredIdentityId(str) : null, i);
                        dest.writeString(this.f105923c);
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
                            iA = org.bouncycastle.jcajce.provider.digest.a.a(Identity.CREATOR, parcel, arrayList, iA, 1);
                        }
                        return new Selection(arrayList);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Selection[i];
                    }
                }

                public Selection(ArrayList subjects) {
                    Intrinsics.checkNotNullParameter(subjects, "subjects");
                    this.f105920a = subjects;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Selection) && this.f105920a.equals(((Selection) obj2).f105920a);
                }

                public final int hashCode() {
                    return this.f105920a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    Iterator itY = j6.a.y(this.f105920a, dest);
                    while (itY.hasNext()) {
                        ((Identity) itY.next()).writeToParcel(dest, i);
                    }
                }
            }

            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Delegated(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), Device.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Client.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Operation.CREATOR.createFromParcel(parcel), Selection.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Details.CREATOR.createFromParcel(parcel) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Delegated[i];
                }
            }

            public Delegated(String id10, long j2, long j3, String hint, Device device, Client client, Operation operation, Selection selection, Details details) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(hint, "hint");
                Intrinsics.checkNotNullParameter(device, "device");
                Intrinsics.checkNotNullParameter(selection, "selection");
                this.f105912a = id10;
                this.f105913b = j2;
                this.f105914c = j3;
                this.d = hint;
                this.e = device;
                this.f = client;
                this.f105915g = operation;
                this.f105916h = selection;
                this.i = details;
            }

            @Override // com.revolut.sso.api.models.ConsentChallenge
            /* JADX INFO: renamed from: Q0, reason: from getter */
            public final Operation getF105927g() {
                return this.f105915g;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Delegated)) {
                    return false;
                }
                Delegated delegated = (Delegated) obj2;
                return Intrinsics.f(this.f105912a, delegated.f105912a) && this.f105913b == delegated.f105913b && this.f105914c == delegated.f105914c && Intrinsics.f(this.d, delegated.d) && Intrinsics.f(this.e, delegated.e) && Intrinsics.f(this.f, delegated.f) && Intrinsics.f(this.f105915g, delegated.f105915g) && Intrinsics.f(this.f105916h, delegated.f105916h) && Intrinsics.f(this.i, delegated.i);
            }

            @Override // com.revolut.sso.api.models.ConsentChallenge
            /* JADX INFO: renamed from: f6, reason: from getter */
            public final long getF105925b() {
                return this.f105913b;
            }

            @Override // com.revolut.sso.api.models.ConsentChallenge
            /* JADX INFO: renamed from: getCreatedAt, reason: from getter */
            public final long getF105926c() {
                return this.f105914c;
            }

            @Override // com.revolut.sso.api.models.ConsentChallenge
            /* JADX INFO: renamed from: getDevice, reason: from getter */
            public final Device getE() {
                return this.e;
            }

            @Override // com.revolut.sso.api.models.ConsentChallenge
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF105924a() {
                return this.f105912a;
            }

            public final int hashCode() {
                int iHashCode = (this.e.hashCode() + p.a.c(d.c(d.c(this.f105912a.hashCode() * 31, 31, this.f105913b), 31, this.f105914c), 31, this.d)) * 31;
                Client client = this.f;
                int iHashCode2 = (iHashCode + (client == null ? 0 : client.hashCode())) * 31;
                Operation operation = this.f105915g;
                int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105916h.f105920a, (iHashCode2 + (operation == null ? 0 : operation.hashCode())) * 31, 31);
                Details details = this.i;
                return iB + (details != null ? details.hashCode() : 0);
            }

            @Override // com.revolut.sso.api.models.ConsentChallenge
            /* JADX INFO: renamed from: j4, reason: from getter */
            public final Client getF() {
                return this.f;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105912a);
                dest.writeLong(this.f105913b);
                dest.writeLong(this.f105914c);
                dest.writeString(this.d);
                this.e.writeToParcel(dest, i);
                Client client = this.f;
                if (client == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    client.writeToParcel(dest, i);
                }
                Operation operation = this.f105915g;
                if (operation == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    operation.writeToParcel(dest, i);
                }
                this.f105916h.writeToParcel(dest, i);
                Details details = this.i;
                if (details == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    details.writeToParcel(dest, i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/api/models/ConsentChallenge$Qr$Personal;", "Lcom/revolut/sso/api/models/ConsentChallenge$Qr;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Personal implements Qr {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105924a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f105925b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f105926c;
            public final String d;
            public final Device e;
            public final Client f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final Operation f105927g;

            @NotNull
            public static final Parcelable.Creator<Personal> CREATOR = new b();

            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Personal(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), Device.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Client.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Operation.CREATOR.createFromParcel(parcel) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Personal[i];
                }
            }

            public Personal(String id10, long j2, long j3, String hint, Device device, Client client, Operation operation) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(hint, "hint");
                Intrinsics.checkNotNullParameter(device, "device");
                this.f105924a = id10;
                this.f105925b = j2;
                this.f105926c = j3;
                this.d = hint;
                this.e = device;
                this.f = client;
                this.f105927g = operation;
            }

            @Override // com.revolut.sso.api.models.ConsentChallenge
            /* JADX INFO: renamed from: Q0, reason: from getter */
            public final Operation getF105927g() {
                return this.f105927g;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Personal)) {
                    return false;
                }
                Personal personal = (Personal) obj2;
                return Intrinsics.f(this.f105924a, personal.f105924a) && this.f105925b == personal.f105925b && this.f105926c == personal.f105926c && Intrinsics.f(this.d, personal.d) && Intrinsics.f(this.e, personal.e) && Intrinsics.f(this.f, personal.f) && Intrinsics.f(this.f105927g, personal.f105927g);
            }

            @Override // com.revolut.sso.api.models.ConsentChallenge
            /* JADX INFO: renamed from: f6, reason: from getter */
            public final long getF105925b() {
                return this.f105925b;
            }

            @Override // com.revolut.sso.api.models.ConsentChallenge
            /* JADX INFO: renamed from: getCreatedAt, reason: from getter */
            public final long getF105926c() {
                return this.f105926c;
            }

            @Override // com.revolut.sso.api.models.ConsentChallenge
            /* JADX INFO: renamed from: getDevice, reason: from getter */
            public final Device getE() {
                return this.e;
            }

            @Override // com.revolut.sso.api.models.ConsentChallenge
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF105924a() {
                return this.f105924a;
            }

            public final int hashCode() {
                int iHashCode = (this.e.hashCode() + p.a.c(d.c(d.c(this.f105924a.hashCode() * 31, 31, this.f105925b), 31, this.f105926c), 31, this.d)) * 31;
                Client client = this.f;
                int iHashCode2 = (iHashCode + (client == null ? 0 : client.hashCode())) * 31;
                Operation operation = this.f105927g;
                return iHashCode2 + (operation != null ? operation.hashCode() : 0);
            }

            @Override // com.revolut.sso.api.models.ConsentChallenge
            /* JADX INFO: renamed from: j4, reason: from getter */
            public final Client getF() {
                return this.f;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105924a);
                dest.writeLong(this.f105925b);
                dest.writeLong(this.f105926c);
                dest.writeString(this.d);
                this.e.writeToParcel(dest, i);
                Client client = this.f;
                if (client == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    client.writeToParcel(dest, i);
                }
                Operation operation = this.f105927g;
                if (operation == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    operation.writeToParcel(dest, i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: Q0 */
    Operation getF105927g();

    /* JADX INFO: renamed from: f6 */
    long getF105925b();

    /* JADX INFO: renamed from: getCreatedAt */
    long getF105926c();

    /* JADX INFO: renamed from: getDevice */
    Device getE();

    /* JADX INFO: renamed from: getId */
    String getF105924a();

    /* JADX INFO: renamed from: j4 */
    Client getF();
}
