package sli;

import kotlin.jvm.internal.Intrinsics;
import sli.b;
import t61.g;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f264206a;

    public a(g gVar) {
        this.f264206a = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f264206a, ((a) obj2).f264206a);
    }

    public final int hashCode() {
        g gVar = this.f264206a;
        if (gVar == null) {
            return 0;
        }
        return gVar.hashCode();
    }
}
