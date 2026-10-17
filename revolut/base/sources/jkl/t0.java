package jkl;

import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 -2\u00020\u0001:\u0006\u0012\u0005\u000f\u0014\r\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\t\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u0005\u0010\u001cR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001c\u0010'\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u001c\u0010,\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\r\u0010+¨\u0006."}, d2 = {"Ljkl/t0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "id", "b", "getMethod", "method", "", "c", "J", "e", "()J", "expiresAt", "d", "createdAt", "f", "hint", "Ljkl/t0$d;", "Ljkl/t0$d;", "()Ljkl/t0$d;", "device", "Ljkl/t0$a;", "Ljkl/t0$a;", "()Ljkl/t0$a;", "client", "Ljkl/t0$e;", "h", "Ljkl/t0$e;", "()Ljkl/t0$e;", "operation", "Ljkl/t0$f;", "i", "Ljkl/t0$f;", "()Ljkl/t0$f;", "selection", "Ljkl/t0$c;", "j", "Ljkl/t0$c;", "()Ljkl/t0$c;", "details", "Companion", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("method")
    @NotNull
    private final String method;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("expiresAt")
    private final long expiresAt;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("createdAt")
    private final long createdAt;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("hint")
    @NotNull
    private final String hint;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("device")
    @NotNull
    private final d device;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("client")
    private final a client;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("operation")
    private final e operation;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("selection")
    private final f selection;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("details")
    private final c details;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u0000 \n2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000b"}, d2 = {"Ljkl/t0$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "name", "iconUri", "Companion", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("iconUri")
        private final String iconUri;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getIconUri() {
            return this.iconUri;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.name, aVar.name) && Intrinsics.f(this.iconUri, aVar.iconUri);
        }

        public final int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.iconUri;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u0000 \n2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000b"}, d2 = {"Ljkl/t0$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "actionLabel", "actionDeepLink", "Companion", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        private final String actionLabel;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("deepLink")
        private final String actionDeepLink;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActionDeepLink() {
            return this.actionDeepLink;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getActionLabel() {
            return this.actionLabel;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.actionLabel, cVar.actionLabel) && Intrinsics.f(this.actionDeepLink, cVar.actionDeepLink);
        }

        public final int hashCode() {
            String str = this.actionLabel;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.actionDeepLink;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\t\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\t\u0010\r¨\u0006\u0010"}, d2 = {"Ljkl/t0$d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "name", "b", "ip", "Ljkl/t0$d$b;", "Ljkl/t0$d$b;", "()Ljkl/t0$d$b;", "location", "Companion", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("ip")
        private final String ip;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("location")
        @NotNull
        private final b location;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000b\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0006\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0010"}, d2 = {"Ljkl/t0$d$b;", "", "", "toString", "()Ljava/lang/String;", "Ljkl/t0$d$b$b;", "a", "Ljkl/t0$d$b$b;", "c", "()Ljkl/t0$d$b$b;", "status", "b", "Ljava/lang/String;", "address", "latlon", "Companion", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("status")
            private final EnumC0997b status;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("address")
            private final String address;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("latlon")
            private final String latlon;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: renamed from: jkl.t0$d$b$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Ljkl/t0$d$b$b;", "", "PENDING_CONSENTING_DEVICE_LOCATION", "PENDING_VERIFICATION", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class EnumC0997b {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ EnumC0997b[] $VALUES;

                @lg.b("PENDING_CONSENTING_DEVICE_LOCATION")
                public static final EnumC0997b PENDING_CONSENTING_DEVICE_LOCATION;

                @lg.b("PENDING_VERIFICATION")
                public static final EnumC0997b PENDING_VERIFICATION;

                static {
                    EnumC0997b enumC0997b = new EnumC0997b("PENDING_CONSENTING_DEVICE_LOCATION", 0);
                    PENDING_CONSENTING_DEVICE_LOCATION = enumC0997b;
                    EnumC0997b enumC0997b2 = new EnumC0997b("PENDING_VERIFICATION", 1);
                    PENDING_VERIFICATION = enumC0997b2;
                    EnumC0997b[] enumC0997bArr = {enumC0997b, enumC0997b2};
                    $VALUES = enumC0997bArr;
                    $ENTRIES = vc.s.n(enumC0997bArr);
                }

                public static EnumC0997b valueOf(String str) {
                    return (EnumC0997b) Enum.valueOf(EnumC0997b.class, str);
                }

                public static EnumC0997b[] values() {
                    return (EnumC0997b[]) $VALUES.clone();
                }
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAddress() {
                return this.address;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getLatlon() {
                return this.latlon;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final EnumC0997b getStatus() {
                return this.status;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return this.status == bVar.status && Intrinsics.f(this.address, bVar.address) && Intrinsics.f(this.latlon, bVar.latlon);
            }

            public final int hashCode() {
                EnumC0997b enumC0997b = this.status;
                int iHashCode = (enumC0997b == null ? 0 : enumC0997b.hashCode()) * 31;
                String str = this.address;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.latlon;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getIp() {
            return this.ip;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b getLocation() {
            return this.location;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.name, dVar.name) && Intrinsics.f(this.ip, dVar.ip) && Intrinsics.f(this.location, dVar.location);
        }

        public final int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.ip;
            return this.location.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0002\t\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012¨\u0006\u0015"}, d2 = {"Ljkl/t0$e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "title", "b", "d", "subtitle", "c", "subject", "reason", "", "Ljkl/t0$e$b;", "Ljava/util/List;", "()Ljava/util/List;", "properties", "Companion", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("subtitle")
        @NotNull
        private final String subtitle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("subject")
        private final String subject;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("reason")
        private final String reason;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("properties")
        @NotNull
        private final List<b> properties;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \f2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Ljkl/t0$e$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "name", "key", "c", "value", "Companion", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("name")
            @NotNull
            private final String name;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("key")
            private final String key;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("value")
            @NotNull
            private final String value;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getName() {
                return this.name;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return Intrinsics.f(this.name, bVar.name) && Intrinsics.f(this.key, bVar.key) && Intrinsics.f(this.value, bVar.value);
            }

            public final int hashCode() {
                int iHashCode = this.name.hashCode() * 31;
                String str = this.key;
                return this.value.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getProperties() {
            return this.properties;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSubject() {
            return this.subject;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this.title, eVar.title) && Intrinsics.f(this.subtitle, eVar.subtitle) && Intrinsics.f(this.subject, eVar.subject) && Intrinsics.f(this.reason, eVar.reason) && Intrinsics.f(this.properties, eVar.properties);
        }

        public final int hashCode() {
            int iC = p.a.c(this.title.hashCode() * 31, 31, this.subtitle);
            String str = this.subject;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.reason;
            return this.properties.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"Ljkl/t0$f;", "", "", "toString", "()Ljava/lang/String;", "", "Ljkl/t0$f$b;", "a", "Ljava/util/List;", "()Ljava/util/List;", "subjects", "Companion", "b", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("subjects")
        @NotNull
        private final List<b> subjects;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \f2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\r"}, d2 = {"Ljkl/t0$f$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "identityId", "b", "c", "registeredIdentityId", "name", "Companion", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("identityId")
            @NotNull
            private final String identityId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("registeredIdentityId")
            private final String registeredIdentityId;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("name")
            @NotNull
            private final String name;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getIdentityId() {
                return this.identityId;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getName() {
                return this.name;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getRegisteredIdentityId() {
                return this.registeredIdentityId;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return Intrinsics.f(this.identityId, bVar.identityId) && Intrinsics.f(this.registeredIdentityId, bVar.registeredIdentityId) && Intrinsics.f(this.name, bVar.name);
            }

            public final int hashCode() {
                int iHashCode = this.identityId.hashCode() * 31;
                String str = this.registeredIdentityId;
                return this.name.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getSubjects() {
            return this.subjects;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof f) && Intrinsics.f(this.subjects, ((f) obj2).subjects);
        }

        public final int hashCode() {
            return this.subjects.hashCode();
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getClient() {
        return this.client;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getDetails() {
        return this.details;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getDevice() {
        return this.device;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getExpiresAt() {
        return this.expiresAt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.id, t0Var.id) && Intrinsics.f(this.method, t0Var.method) && this.expiresAt == t0Var.expiresAt && this.createdAt == t0Var.createdAt && Intrinsics.f(this.hint, t0Var.hint) && Intrinsics.f(this.device, t0Var.device) && Intrinsics.f(this.client, t0Var.client) && Intrinsics.f(this.operation, t0Var.operation) && Intrinsics.f(this.selection, t0Var.selection) && Intrinsics.f(this.details, t0Var.details);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final e getOperation() {
        return this.operation;
    }

    public final int hashCode() {
        int iHashCode = (this.device.hashCode() + p.a.c(a0.d.c(a0.d.c(p.a.c(this.id.hashCode() * 31, 31, this.method), 31, this.expiresAt), 31, this.createdAt), 31, this.hint)) * 31;
        a aVar = this.client;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        e eVar = this.operation;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        f fVar = this.selection;
        int iHashCode4 = (iHashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        c cVar = this.details;
        return iHashCode4 + (cVar != null ? cVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final f getSelection() {
        return this.selection;
    }
}
