package jt4;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lw0.m;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f178339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.i f178340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f178341c;

    public c(aw0.i iVar, List items, m mVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f178339a = mVar;
        this.f178340b = iVar;
        this.f178341c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f178341c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f178339a, cVar.f178339a) && Intrinsics.f(this.f178340b, cVar.f178340b) && Intrinsics.f(this.f178341c, cVar.f178341c);
    }

    public final int hashCode() {
        m mVar = this.f178339a;
        int iHashCode = (mVar == null ? 0 : mVar.hashCode()) * 31;
        aw0.i iVar = this.f178340b;
        return this.f178341c.hashCode() + ((iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 31);
    }
}
