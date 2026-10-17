package jkl;

import java.time.Instant;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\t\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004¨\u0006\u001a"}, d2 = {"Ljkl/u0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "f", "name", "", "Ljkl/u0$b;", "c", "Ljava/util/List;", "()Ljava/util/List;", "consents", "Ljava/time/Instant;", "Ljava/time/Instant;", "()Ljava/time/Instant;", "createdAt", "e", "lastUsedAt", "iconUri", "Companion", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("consents")
    @NotNull
    private final List<b> consents;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("createdAt")
    @NotNull
    private final Instant createdAt;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("lastUsedAt")
    @NotNull
    private final Instant lastUsedAt;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("iconUri")
    @NotNull
    private final String iconUri;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0002\u000b\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u000f\u0010\u0004R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0018"}, d2 = {"Ljkl/u0$b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "c", "()Z", "display", "b", "Ljava/lang/String;", "e", "name", "d", "displayName", "", "Ljkl/u0$b$a;", "Ljava/util/List;", "()Ljava/util/List;", "claims", "description", "Companion", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("display")
        private final boolean display;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("displayName")
        @NotNull
        private final String displayName;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("claims")
        @NotNull
        private final List<a> claims;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("description")
        private final String description;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0006\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\r\u0010\u0004¨\u0006\u0010"}, d2 = {"Ljkl/u0$b$a;", "", "", "toString", "()Ljava/lang/String;", "Ljkl/u0$b$a$b;", "a", "Ljkl/u0$b$a$b;", "b", "()Ljkl/u0$b$a$b;", "name", "Ljava/lang/String;", "displayName", "c", "value", "Companion", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("name")
            @NotNull
            private final EnumC0999b name;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("displayName")
            @NotNull
            private final String displayName;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("value")
            private final String value;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: renamed from: jkl.u0$b$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Ljkl/u0$b$a$b;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "ADDRESS", "BIRTH_DATE", "CITIZENSHIP", "EMAIL", "NAME", "PHONE", "UNKNOWN", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class EnumC0999b {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ EnumC0999b[] $VALUES;

                @lg.b("address")
                public static final EnumC0999b ADDRESS;

                @lg.b("birthdate")
                public static final EnumC0999b BIRTH_DATE;

                @lg.b("citizenship")
                public static final EnumC0999b CITIZENSHIP;

                @lg.b("email")
                public static final EnumC0999b EMAIL;

                @lg.b("name")
                public static final EnumC0999b NAME;

                @lg.b("phone")
                public static final EnumC0999b PHONE;

                @he0.b
                public static final EnumC0999b UNKNOWN;

                @NotNull
                private final String value;

                static {
                    EnumC0999b enumC0999b = new EnumC0999b("ADDRESS", 0, "address");
                    ADDRESS = enumC0999b;
                    EnumC0999b enumC0999b2 = new EnumC0999b("BIRTH_DATE", 1, "birthdate");
                    BIRTH_DATE = enumC0999b2;
                    EnumC0999b enumC0999b3 = new EnumC0999b("CITIZENSHIP", 2, "citizenship");
                    CITIZENSHIP = enumC0999b3;
                    EnumC0999b enumC0999b4 = new EnumC0999b("EMAIL", 3, "email");
                    EMAIL = enumC0999b4;
                    EnumC0999b enumC0999b5 = new EnumC0999b("NAME", 4, "name");
                    NAME = enumC0999b5;
                    EnumC0999b enumC0999b6 = new EnumC0999b("PHONE", 5, "phone");
                    PHONE = enumC0999b6;
                    EnumC0999b enumC0999b7 = new EnumC0999b("UNKNOWN", 6, "unknown");
                    UNKNOWN = enumC0999b7;
                    EnumC0999b[] enumC0999bArr = {enumC0999b, enumC0999b2, enumC0999b3, enumC0999b4, enumC0999b5, enumC0999b6, enumC0999b7};
                    $VALUES = enumC0999bArr;
                    $ENTRIES = vc.s.n(enumC0999bArr);
                }

                public EnumC0999b(String str, int i, String str2) {
                    this.value = str2;
                }

                public static EnumC0999b valueOf(String str) {
                    return (EnumC0999b) Enum.valueOf(EnumC0999b.class, str);
                }

                public static EnumC0999b[] values() {
                    return (EnumC0999b[]) $VALUES.clone();
                }
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDisplayName() {
                return this.displayName;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final EnumC0999b getName() {
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
                if (!(obj2 instanceof a)) {
                    return false;
                }
                a aVar = (a) obj2;
                return this.name == aVar.name && Intrinsics.f(this.displayName, aVar.displayName) && Intrinsics.f(this.value, aVar.value);
            }

            public final int hashCode() {
                int iC = p.a.c(this.name.hashCode() * 31, 31, this.displayName);
                String str = this.value;
                return iC + (str == null ? 0 : str.hashCode());
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getClaims() {
            return this.claims;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getDisplay() {
            return this.display;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return this.display == bVar.display && Intrinsics.f(this.name, bVar.name) && Intrinsics.f(this.displayName, bVar.displayName) && Intrinsics.f(this.claims, bVar.claims) && Intrinsics.f(this.description, bVar.description);
        }

        public final int hashCode() {
            int iD = p.a.d(p.a.c(p.a.c(Boolean.hashCode(this.display) * 31, 31, this.name), 31, this.displayName), 31, this.claims);
            String str = this.description;
            return iD + (str == null ? 0 : str.hashCode());
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getConsents() {
        return this.consents;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Instant getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getIconUri() {
        return this.iconUri;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Instant getLastUsedAt() {
        return this.lastUsedAt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return Intrinsics.f(this.id, u0Var.id) && Intrinsics.f(this.name, u0Var.name) && Intrinsics.f(this.consents, u0Var.consents) && Intrinsics.f(this.createdAt, u0Var.createdAt) && Intrinsics.f(this.lastUsedAt, u0Var.lastUsedAt) && Intrinsics.f(this.iconUri, u0Var.iconUri);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        return this.iconUri.hashCode() + r6.b.c(r6.b.c(p.a.d(p.a.c(this.id.hashCode() * 31, 31, this.name), 31, this.consents), 31, this.createdAt), 31, this.lastUsedAt);
    }
}
