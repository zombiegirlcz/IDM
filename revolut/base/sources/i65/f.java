package i65;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ax4.b f158862a;

    public f(ax4.b constructorState) {
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        this.f158862a = constructorState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f158862a, ((f) obj2).f158862a);
    }

    public final int hashCode() {
        return this.f158862a.hashCode();
    }
}
