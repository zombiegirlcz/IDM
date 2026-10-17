package cl;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class j implements Serializable {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24917b;

    public j(String applicantId, String clientUuid) {
        Intrinsics.checkNotNullParameter(applicantId, "applicantId");
        Intrinsics.checkNotNullParameter(clientUuid, "clientUuid");
        this.f24916a = applicantId;
        this.f24917b = clientUuid;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f24916a, jVar.f24916a) && Intrinsics.f(this.f24917b, jVar.f24917b);
    }

    public final int hashCode() {
        return this.f24917b.hashCode() + (this.f24916a.hashCode() * 31);
    }

    public final String toString() {
        return j6.a.s("TokenPayload(applicantId=", this.f24916a, ", clientUuid=", this.f24917b, ")");
    }
}
