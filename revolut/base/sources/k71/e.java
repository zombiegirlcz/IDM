package k71;

import kotlin.jvm.internal.Intrinsics;
import tof.hc;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f181778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f181779c;
    public final hc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String groupId, String str, hc scope) {
        super(groupId);
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f181778b = groupId;
        this.f181779c = str;
        this.d = scope;
    }

    @Override // k71.i
    public final String a() {
        return this.f181778b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f181778b, eVar.f181778b) && Intrinsics.f(this.f181779c, eVar.f181779c) && this.d.equals(eVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f181778b.hashCode() * 31;
        String str = this.f181779c;
        return this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
