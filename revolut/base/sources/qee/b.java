package qee;

import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f245120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uce.c f245121b;

    public b(f0 f0Var, uce.c neverReceivedCardMode) {
        Intrinsics.checkNotNullParameter(neverReceivedCardMode, "neverReceivedCardMode");
        this.f245120a = f0Var;
        this.f245121b = neverReceivedCardMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f245120a, bVar.f245120a) && this.f245121b == bVar.f245121b;
    }

    public final int hashCode() {
        f0 f0Var = this.f245120a;
        return this.f245121b.hashCode() + ((f0Var == null ? 0 : f0Var.hashCode()) * 31);
    }
}
