package rd0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f253306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f253307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f253308c;
    public final String d;

    public a(String ownerClassName, String calledClassName, String functionName, String id10) {
        Intrinsics.checkNotNullParameter(ownerClassName, "ownerClassName");
        Intrinsics.checkNotNullParameter(calledClassName, "calledClassName");
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f253306a = ownerClassName;
        this.f253307b = calledClassName;
        this.f253308c = functionName;
        this.d = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f253306a, aVar.f253306a) && Intrinsics.f(this.f253307b, aVar.f253307b) && Intrinsics.f(this.f253308c, aVar.f253308c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f253306a.hashCode() * 31, 31, this.f253307b), 31, this.f253308c);
    }
}
