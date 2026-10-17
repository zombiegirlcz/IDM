package k71;

import kotlin.jvm.internal.Intrinsics;
import tof.hc;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f181780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hc f181781c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String groupId, hc scope) {
        super(groupId);
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f181780b = groupId;
        this.f181781c = scope;
    }

    @Override // k71.i
    public final String a() {
        return this.f181780b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f181780b, fVar.f181780b) && this.f181781c.equals(fVar.f181781c);
    }

    public final int hashCode() {
        return this.f181781c.hashCode() + (this.f181780b.hashCode() * 31);
    }
}
