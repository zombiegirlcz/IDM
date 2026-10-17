package kotlin.reflect.jvm.internal.impl.km;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class KmVersionRequirement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f186818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f186819b;
    public KmVersionRequirementVersionKind kind;
    public KmVersionRequirementLevel level;
    public KmVersion version;

    public final Integer getErrorCode() {
        return this.f186818a;
    }

    @NotNull
    public final KmVersionRequirementVersionKind getKind() {
        KmVersionRequirementVersionKind kmVersionRequirementVersionKind = this.kind;
        if (kmVersionRequirementVersionKind != null) {
            return kmVersionRequirementVersionKind;
        }
        Intrinsics.r("kind");
        throw null;
    }

    @NotNull
    public final KmVersionRequirementLevel getLevel() {
        KmVersionRequirementLevel kmVersionRequirementLevel = this.level;
        if (kmVersionRequirementLevel != null) {
            return kmVersionRequirementLevel;
        }
        Intrinsics.r("level");
        throw null;
    }

    public final String getMessage() {
        return this.f186819b;
    }

    @NotNull
    public final KmVersion getVersion() {
        KmVersion kmVersion = this.version;
        if (kmVersion != null) {
            return kmVersion;
        }
        Intrinsics.r("version");
        throw null;
    }

    public final void setErrorCode(Integer num) {
        this.f186818a = num;
    }

    public final void setKind(@NotNull KmVersionRequirementVersionKind kmVersionRequirementVersionKind) {
        Intrinsics.checkNotNullParameter(kmVersionRequirementVersionKind, "<set-?>");
        this.kind = kmVersionRequirementVersionKind;
    }

    public final void setLevel(@NotNull KmVersionRequirementLevel kmVersionRequirementLevel) {
        Intrinsics.checkNotNullParameter(kmVersionRequirementLevel, "<set-?>");
        this.level = kmVersionRequirementLevel;
    }

    public final void setMessage(String str) {
        this.f186819b = str;
    }

    public final void setVersion(@NotNull KmVersion kmVersion) {
        Intrinsics.checkNotNullParameter(kmVersion, "<set-?>");
        this.version = kmVersion;
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("KmVersionRequirement(kind=");
        sb6.append(getKind());
        sb6.append(", level=");
        sb6.append(getLevel());
        sb6.append(", version=");
        sb6.append(getVersion());
        sb6.append(", errorCode=");
        sb6.append(this.f186818a);
        sb6.append(", message=");
        return a.u(sb6, this.f186819b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
