package gkf;

import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f144380a;

    public d(p pVar) {
        this.f144380a = pVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f144380a, ((d) obj2).f144380a);
    }

    public final int hashCode() {
        p pVar = this.f144380a;
        if (pVar == null) {
            return 0;
        }
        return pVar.hashCode();
    }
}
