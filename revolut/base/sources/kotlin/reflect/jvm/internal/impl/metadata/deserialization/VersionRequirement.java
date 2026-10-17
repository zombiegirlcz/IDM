package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import ch.qos.logback.core.CoreConstants;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import yhm.e;
import zsc.p;

/* JADX INFO: loaded from: classes14.dex */
public final class VersionRequirement {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Version f187399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProtoBuf.VersionRequirement.VersionKind f187400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f187401c;
    public final Integer d;
    public final String e;

    public static final class Companion {

        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ProtoBuf.VersionRequirement.Level.values().length];
                try {
                    iArr[ProtoBuf.VersionRequirement.Level.WARNING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ProtoBuf.VersionRequirement.Level.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ProtoBuf.VersionRequirement.Level.HIDDEN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final VersionRequirement create(int i, @NotNull NameResolver nameResolver, @NotNull VersionRequirementTable table) {
            e eVar;
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            Intrinsics.checkNotNullParameter(table, "table");
            ProtoBuf.VersionRequirement versionRequirement = table.get(i);
            if (versionRequirement == null) {
                return null;
            }
            Version versionDecode = Version.Companion.decode(versionRequirement.hasVersion() ? Integer.valueOf(versionRequirement.getVersion()) : null, versionRequirement.hasVersionFull() ? Integer.valueOf(versionRequirement.getVersionFull()) : null);
            ProtoBuf.VersionRequirement.Level level = versionRequirement.getLevel();
            Intrinsics.h(level);
            int i2 = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
            if (i2 == 1) {
                eVar = e.WARNING;
            } else if (i2 == 2) {
                eVar = e.ERROR;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar = e.HIDDEN;
            }
            e eVar2 = eVar;
            Integer numValueOf = versionRequirement.hasErrorCode() ? Integer.valueOf(versionRequirement.getErrorCode()) : null;
            String string = versionRequirement.hasMessage() ? nameResolver.getString(versionRequirement.getMessage()) : null;
            ProtoBuf.VersionRequirement.VersionKind versionKind = versionRequirement.getVersionKind();
            Intrinsics.checkNotNullExpressionValue(versionKind, "getVersionKind(...)");
            return new VersionRequirement(versionDecode, versionKind, eVar2, numValueOf, string);
        }
    }

    public static final class Version {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        public static final Version INFINITY = new Version(256, 256, 256);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f187402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f187403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f187404c;

        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            @NotNull
            public final Version decode(Integer num, Integer num2) {
                return num2 != null ? new Version(num2.intValue() & 255, (num2.intValue() >> 8) & 255, (num2.intValue() >> 16) & 255) : num != null ? new Version(num.intValue() & 7, (num.intValue() >> 3) & 15, (num.intValue() >> 7) & CertificateBody.profileType) : Version.INFINITY;
            }
        }

        public Version(int i, int i2, int i3) {
            this.f187402a = i;
            this.f187403b = i2;
            this.f187404c = i3;
        }

        @NotNull
        public final String asString() {
            int i = this.f187403b;
            int i2 = this.f187402a;
            int i3 = this.f187404c;
            if (i3 == 0) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(i2);
                sb6.append(CoreConstants.DOT);
                sb6.append(i);
                return sb6.toString();
            }
            StringBuilder sb9 = new StringBuilder();
            sb9.append(i2);
            sb9.append(CoreConstants.DOT);
            sb9.append(i);
            sb9.append(CoreConstants.DOT);
            sb9.append(i3);
            return sb9.toString();
        }

        public final int component1() {
            return this.f187402a;
        }

        public final int component2() {
            return this.f187403b;
        }

        public final int component3() {
            return this.f187404c;
        }

        public final void encode(@NotNull Function1<? super Integer, Unit> writeVersion, @NotNull Function1<? super Integer, Unit> writeVersionFull) {
            Intrinsics.checkNotNullParameter(writeVersion, "writeVersion");
            Intrinsics.checkNotNullParameter(writeVersionFull, "writeVersionFull");
            if (equals(INFINITY)) {
                return;
            }
            int i = this.f187404c;
            int i2 = this.f187403b;
            int i3 = this.f187402a;
            if (i3 > 7 || i2 > 15 || i > 127) {
                writeVersionFull.invoke(Integer.valueOf((i2 << 8) | i3 | (i << 16)));
            } else {
                writeVersion.invoke(Integer.valueOf((i2 << 3) | i3 | (i << 7)));
            }
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Version)) {
                return false;
            }
            Version version = (Version) obj2;
            return this.f187402a == version.f187402a && this.f187403b == version.f187403b && this.f187404c == version.f187404c;
        }

        public int hashCode() {
            return Integer.hashCode(this.f187404c) + j6.a.b(this.f187403b, Integer.hashCode(this.f187402a) * 31, 31);
        }

        @NotNull
        public String toString() {
            return asString();
        }
    }

    public VersionRequirement(@NotNull Version version, @NotNull ProtoBuf.VersionRequirement.VersionKind kind, @NotNull e level, Integer num, String str) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(level, "level");
        this.f187399a = version;
        this.f187400b = kind;
        this.f187401c = level;
        this.d = num;
        this.e = str;
    }

    public final Integer getErrorCode() {
        return this.d;
    }

    @NotNull
    public final ProtoBuf.VersionRequirement.VersionKind getKind() {
        return this.f187400b;
    }

    @NotNull
    public final e getLevel() {
        return this.f187401c;
    }

    public final String getMessage() {
        return this.e;
    }

    @NotNull
    public final Version getVersion() {
        return this.f187399a;
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb6 = new StringBuilder("since ");
        sb6.append(this.f187399a);
        sb6.append(p.SPACE_CHAR);
        sb6.append(this.f187401c);
        String str2 = "";
        Integer num = this.d;
        if (num != null) {
            str = " error " + num.intValue();
        } else {
            str = "";
        }
        sb6.append(str);
        String str3 = this.e;
        if (str3 != null) {
            str2 = ": " + str3;
        }
        sb6.append(str2);
        return sb6.toString();
    }
}
