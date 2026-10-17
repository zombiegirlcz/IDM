package my3;

import ht3.l0;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f210315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f210316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f210317c;

    public h(l0 l0Var, f debtsHub, c typeSelector) {
        Intrinsics.checkNotNullParameter(debtsHub, "debtsHub");
        Intrinsics.checkNotNullParameter(typeSelector, "typeSelector");
        this.f210315a = l0Var;
        this.f210316b = debtsHub;
        this.f210317c = typeSelector;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f210315a, hVar.f210315a) && Intrinsics.f(this.f210316b, hVar.f210316b) && Intrinsics.f(this.f210317c, hVar.f210317c);
    }

    public final int hashCode() {
        l0 l0Var = this.f210315a;
        return this.f210317c.hashCode() + ((this.f210316b.hashCode() + ((l0Var == null ? 0 : l0Var.hashCode()) * 31)) * 31);
    }
}
