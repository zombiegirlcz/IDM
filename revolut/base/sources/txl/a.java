package txl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f275433a;

    public /* synthetic */ a(String str) {
        this.f275433a = str;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof a) {
            return Intrinsics.f(this.f275433a, ((a) obj2).f275433a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f275433a.hashCode();
    }

    public final String toString() {
        return p.a.p("Id(value=", this.f275433a, ")");
    }
}
