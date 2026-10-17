package zgj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f322141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f322142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f322143c;

    public a0(z zVar, List items, q actionButtonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionButtonState, "actionButtonState");
        this.f322141a = zVar;
        this.f322142b = items;
        this.f322143c = actionButtonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f322142b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f322141a, a0Var.f322141a) && Intrinsics.f(this.f322142b, a0Var.f322142b) && Intrinsics.f(this.f322143c, a0Var.f322143c);
    }

    public final int hashCode() {
        z zVar = this.f322141a;
        return this.f322143c.hashCode() + p.a.d((zVar == null ? 0 : zVar.hashCode()) * 31, 31, this.f322142b);
    }
}
