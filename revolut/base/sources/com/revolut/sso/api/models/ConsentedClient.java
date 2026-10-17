package com.revolut.sso.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import ip0.v7;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/sso/api/models/ConsentedClient;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "Id", "Consent", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConsentedClient implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f105929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f105930c;
    public final Instant d;
    public final Instant e;
    public final String f;

    @NotNull
    public static final Parcelable.Creator<ConsentedClient> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/sso/api/models/ConsentedClient$Consent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "Claim", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Consent implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f105931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105933c;
        public final ArrayList d;
        public final String e;

        @NotNull
        public static final Parcelable.Creator<Consent> CREATOR = new b();

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/sso/api/models/ConsentedClient$Consent$Claim;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "com/revolut/sso/api/models/c", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Claim implements Parcelable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final c f105934a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f105935b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105936c;

            @NotNull
            public static final Parcelable.Creator<Claim> CREATOR = new b();

            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Claim(c.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Claim[i];
                }
            }

            public Claim(c name, String displayName, String str) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(displayName, "displayName");
                this.f105934a = name;
                this.f105935b = displayName;
                this.f105936c = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Claim)) {
                    return false;
                }
                Claim claim = (Claim) obj2;
                return this.f105934a == claim.f105934a && Intrinsics.f(this.f105935b, claim.f105935b) && Intrinsics.f(this.f105936c, claim.f105936c);
            }

            public final int hashCode() {
                int iC = p.a.c(this.f105934a.hashCode() * 31, 31, this.f105935b);
                String str = this.f105936c;
                return iC + (str == null ? 0 : str.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105934a.name());
                dest.writeString(this.f105935b);
                dest.writeString(this.f105936c);
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int iA = 0;
                boolean z = parcel.readInt() != 0;
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Claim.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Consent(string, string2, parcel.readString(), arrayList, z);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Consent[i];
            }
        }

        public Consent(String name, String displayName, String str, ArrayList claims, boolean z) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(claims, "claims");
            this.f105931a = z;
            this.f105932b = name;
            this.f105933c = displayName;
            this.d = claims;
            this.e = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Consent)) {
                return false;
            }
            Consent consent = (Consent) obj2;
            return this.f105931a == consent.f105931a && Intrinsics.f(this.f105932b, consent.f105932b) && Intrinsics.f(this.f105933c, consent.f105933c) && this.d.equals(consent.d) && Intrinsics.f(this.e, consent.e);
        }

        public final int hashCode() {
            int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, p.a.c(p.a.c(Boolean.hashCode(this.f105931a) * 31, 31, this.f105932b), 31, this.f105933c), 31);
            String str = this.e;
            return iB + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f105931a ? 1 : 0);
            dest.writeString(this.f105932b);
            dest.writeString(this.f105933c);
            Iterator itY = j6.a.y(this.d, dest);
            while (itY.hasNext()) {
                ((Claim) itY.next()).writeToParcel(dest, i);
            }
            dest.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/api/models/ConsentedClient$Id;", "Landroid/os/Parcelable;", "value", "", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Id implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Id> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105937a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new Id(v7.t(parcel, "parcel", "value"));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Id[i];
            }
        }

        public /* synthetic */ Id(String str) {
            this.f105937a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (obj2 instanceof Id) {
                return Intrinsics.f(this.f105937a, ((Id) obj2).f105937a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f105937a.hashCode();
        }

        public final String toString() {
            return p.a.p("Id(value=", this.f105937a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105937a);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String str = Id.CREATOR.createFromParcel(parcel).f105937a;
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Consent.CREATOR, parcel, arrayList, iA, 1);
            }
            return new ConsentedClient(str, string, arrayList, (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ConsentedClient[i];
        }
    }

    public ConsentedClient(String id10, String name, ArrayList consents, Instant createdAt, Instant lastUsedAt, String iconUri) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(consents, "consents");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(lastUsedAt, "lastUsedAt");
        Intrinsics.checkNotNullParameter(iconUri, "iconUri");
        this.f105928a = id10;
        this.f105929b = name;
        this.f105930c = consents;
        this.d = createdAt;
        this.e = lastUsedAt;
        this.f = iconUri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ConsentedClient)) {
            return false;
        }
        ConsentedClient consentedClient = (ConsentedClient) obj2;
        return Intrinsics.f(this.f105928a, consentedClient.f105928a) && Intrinsics.f(this.f105929b, consentedClient.f105929b) && this.f105930c.equals(consentedClient.f105930c) && Intrinsics.f(this.d, consentedClient.d) && Intrinsics.f(this.e, consentedClient.e) && Intrinsics.f(this.f, consentedClient.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + r6.b.c(r6.b.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105930c, p.a.c(this.f105928a.hashCode() * 31, 31, this.f105929b), 31), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105928a);
        dest.writeString(this.f105929b);
        Iterator itY = j6.a.y(this.f105930c, dest);
        while (itY.hasNext()) {
            ((Consent) itY.next()).writeToParcel(dest, i);
        }
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeString(this.f);
    }
}
