package o4h;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f222281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.i f222282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f222283c;

    public k(j jVar, aw0.i iVar, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f222281a = jVar;
        this.f222282b = iVar;
        this.f222283c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f222283c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f222281a, kVar.f222281a) && Intrinsics.f(this.f222282b, kVar.f222282b) && Intrinsics.f(this.f222283c, kVar.f222283c);
    }

    public final int hashCode() {
        j jVar = this.f222281a;
        int iHashCode = (jVar == null ? 0 : jVar.hashCode()) * 31;
        aw0.i iVar = this.f222282b;
        return this.f222283c.hashCode() + ((iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 31);
    }
}
