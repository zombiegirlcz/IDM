package oq9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f227846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f227847b;

    public n(String memberId, String groupId) {
        Intrinsics.checkNotNullParameter(memberId, "memberId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f227846a = memberId;
        this.f227847b = groupId;
    }

    @Override // oq9.o
    public final String a() {
        return this.f227847b;
    }

    @Override // oq9.o
    public final String b() {
        return this.f227846a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f227846a, nVar.f227846a) && Intrinsics.f(this.f227847b, nVar.f227847b);
    }

    public final int hashCode() {
        return this.f227847b.hashCode() + (this.f227846a.hashCode() * 31);
    }
}
