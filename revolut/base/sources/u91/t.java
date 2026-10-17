package u91;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f278382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f278383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f278384c;

    public t(String id10, String name, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f278382a = id10;
        this.f278383b = name;
        this.f278384c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f278382a, tVar.f278382a) && Intrinsics.f(this.f278383b, tVar.f278383b) && Intrinsics.f(this.f278384c, tVar.f278384c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f278382a.hashCode() * 31, 31, this.f278383b);
        String str = this.f278384c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
