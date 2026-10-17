package iqf;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f167829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.i f167830b;

    public e(List items, aw0.e eVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f167829a = items;
        this.f167830b = eVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f167829a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f167829a, eVar.f167829a) && Intrinsics.f(this.f167830b, eVar.f167830b);
    }

    public final int hashCode() {
        int iHashCode = this.f167829a.hashCode() * 31;
        aw0.i iVar = this.f167830b;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
