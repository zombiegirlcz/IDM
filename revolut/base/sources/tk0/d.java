package tk0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271827a;

    public /* synthetic */ d(String str) {
        this.f271827a = str;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof d) {
            return Intrinsics.f(this.f271827a, ((d) obj2).f271827a);
        }
        return false;
    }

    @Override // tk0.g
    public final String getId() {
        return this.f271827a;
    }

    public final int hashCode() {
        return this.f271827a.hashCode();
    }

    public final String toString() {
        return p.a.p("StringKey(id=", this.f271827a, ")");
    }
}
