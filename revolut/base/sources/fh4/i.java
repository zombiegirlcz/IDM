package fh4;

import dx4.p4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p4 f135136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ax4.b f135137b;

    public i(p4 screenDetailsItem, ax4.b constructorState) {
        Intrinsics.checkNotNullParameter(screenDetailsItem, "screenDetailsItem");
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        this.f135136a = screenDetailsItem;
        this.f135137b = constructorState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f135136a, iVar.f135136a) && Intrinsics.f(this.f135137b, iVar.f135137b);
    }

    public final int hashCode() {
        return this.f135137b.hashCode() + (this.f135136a.hashCode() * 31);
    }
}
