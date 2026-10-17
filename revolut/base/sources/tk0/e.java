package tk0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271828a;

    public /* synthetic */ e(String str) {
        this.f271828a = str;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof e) {
            return Intrinsics.f(this.f271828a, ((e) obj2).f271828a);
        }
        return false;
    }

    @Override // tk0.g
    public final String getId() {
        return this.f271828a;
    }

    public final int hashCode() {
        return this.f271828a.hashCode();
    }

    public final String toString() {
        return p.a.p("StringList(id=", this.f271828a, ")");
    }
}
