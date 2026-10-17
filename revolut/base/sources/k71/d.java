package k71;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f181776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f181777c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String groupId, String legId) {
        super(groupId);
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(legId, "legId");
        this.f181776b = groupId;
        this.f181777c = legId;
    }

    @Override // k71.i
    public final String a() {
        return this.f181776b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f181776b, dVar.f181776b) && Intrinsics.f(this.f181777c, dVar.f181777c);
    }

    public final int hashCode() {
        return this.f181777c.hashCode() + (this.f181776b.hashCode() * 31);
    }
}
