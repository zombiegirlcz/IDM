package xga;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f305647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f305648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f305649c;

    public /* synthetic */ h(int i, b0 b0Var, o oVar, d dVar) {
        if (7 != (i & 7)) {
            j1.f(f.f305646a.getDescriptor(), i, 7);
            throw null;
        }
        this.f305647a = b0Var;
        this.f305648b = oVar;
        this.f305649c = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f305647a, hVar.f305647a) && Intrinsics.f(this.f305648b, hVar.f305648b) && Intrinsics.f(this.f305649c, hVar.f305649c);
    }

    public final int hashCode() {
        int iHashCode = this.f305647a.hashCode() * 31;
        o oVar = this.f305648b;
        return this.f305649c.f305645a.hashCode() + ((iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31);
    }
}
