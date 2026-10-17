package d6j;

import aw0.q0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class t implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f111602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f111603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f111604c;

    public t(List items, s toolbarUiState, q0 q0Var) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarUiState, "toolbarUiState");
        this.f111602a = items;
        this.f111603b = toolbarUiState;
        this.f111604c = q0Var;
    }

    @Override // cli.p
    public final List c() {
        return this.f111602a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f111602a, tVar.f111602a) && Intrinsics.f(this.f111603b, tVar.f111603b) && Intrinsics.f(this.f111604c, tVar.f111604c);
    }

    public final int hashCode() {
        int iHashCode = (this.f111603b.hashCode() + (this.f111602a.hashCode() * 31)) * 31;
        q0 q0Var = this.f111604c;
        return iHashCode + (q0Var == null ? 0 : q0Var.hashCode());
    }
}
