package cii;

import aw0.i;
import kotlin.jvm.internal.Intrinsics;
import lw0.m;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f24551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f24552b;

    public a(m mVar, i iVar) {
        this.f24551a = mVar;
        this.f24552b = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f24551a, aVar.f24551a) && Intrinsics.f(this.f24552b, aVar.f24552b);
    }

    public final int hashCode() {
        m mVar = this.f24551a;
        int iHashCode = (mVar == null ? 0 : mVar.hashCode()) * 31;
        i iVar = this.f24552b;
        return iHashCode + (iVar != null ? iVar.hashCode() : 0);
    }
}
