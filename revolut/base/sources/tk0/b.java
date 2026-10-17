package tk0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271825a;

    public /* synthetic */ b(String str) {
        this.f271825a = str;
    }

    public static final /* synthetic */ b a(String str) {
        return new b(str);
    }

    public static void b(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof b) {
            return Intrinsics.f(this.f271825a, ((b) obj2).f271825a);
        }
        return false;
    }

    @Override // tk0.g
    public final String getId() {
        return this.f271825a;
    }

    public final int hashCode() {
        return this.f271825a.hashCode();
    }

    public final String toString() {
        return p.a.p("BooleanKey(id=", this.f271825a, ")");
    }
}
