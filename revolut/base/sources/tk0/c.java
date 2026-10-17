package tk0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271826a;

    public /* synthetic */ c(String str) {
        this.f271826a = str;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof c) {
            return Intrinsics.f(this.f271826a, ((c) obj2).f271826a);
        }
        return false;
    }

    @Override // tk0.g
    public final String getId() {
        return this.f271826a;
    }

    public final int hashCode() {
        return this.f271826a.hashCode();
    }

    public final String toString() {
        return p.a.p("NumberKey(id=", this.f271826a, ")");
    }
}
