package zw7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f325864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f325865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f325866c;

    public z0(i iVar, String value, k kVar) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f325864a = iVar;
        this.f325865b = value;
        this.f325866c = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return this.f325864a == z0Var.f325864a && Intrinsics.f(this.f325865b, z0Var.f325865b) && Intrinsics.f(this.f325866c, z0Var.f325866c);
    }

    public final int hashCode() {
        i iVar = this.f325864a;
        int iC = p.a.c((iVar == null ? 0 : iVar.hashCode()) * 31, 31, this.f325865b);
        k kVar = this.f325866c;
        return iC + (kVar != null ? kVar.hashCode() : 0);
    }
}
