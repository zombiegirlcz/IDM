package k71;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f181775b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String groupId) {
        super(groupId);
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f181775b = groupId;
    }

    @Override // k71.i
    public final String a() {
        return this.f181775b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f181775b, ((c) obj2).f181775b);
    }

    public final int hashCode() {
        return this.f181775b.hashCode();
    }
}
