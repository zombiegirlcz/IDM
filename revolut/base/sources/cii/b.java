package cii;

import aw0.i;
import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lw0.m;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f24554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f24555c;

    public b(i iVar, List items, m mVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f24553a = items;
        this.f24554b = mVar;
        this.f24555c = iVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f24553a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f24553a, bVar.f24553a) && Intrinsics.f(this.f24554b, bVar.f24554b) && Intrinsics.f(this.f24555c, bVar.f24555c);
    }

    public final int hashCode() {
        int iHashCode = this.f24553a.hashCode() * 31;
        m mVar = this.f24554b;
        int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        i iVar = this.f24555c;
        return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }
}
