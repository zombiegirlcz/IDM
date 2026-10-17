package ya5;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f311937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f311938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f311939c;

    public i(List items, h header, aw0.e eVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f311937a = items;
        this.f311938b = header;
        this.f311939c = eVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f311937a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f311937a, iVar.f311937a) && Intrinsics.f(this.f311938b, iVar.f311938b) && Intrinsics.f(this.f311939c, iVar.f311939c);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f311937a.hashCode() * 31, 31, this.f311938b.f311936a);
        aw0.i iVar = this.f311939c;
        return iA + (iVar == null ? 0 : iVar.hashCode());
    }
}
