package eu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f129492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fu3.c f129493b;

    public e(c calculatorContent, fu3.c cVar) {
        Intrinsics.checkNotNullParameter(calculatorContent, "calculatorContent");
        this.f129492a = calculatorContent;
        this.f129493b = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f129492a, eVar.f129492a) && Intrinsics.f(this.f129493b, eVar.f129493b);
    }

    public final int hashCode() {
        int iHashCode = this.f129492a.hashCode() * 31;
        fu3.c cVar = this.f129493b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }
}
