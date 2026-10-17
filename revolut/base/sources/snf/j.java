package snf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements u {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f264589a;

    public j(xi0.b bVar) {
        this.f264589a = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f264589a, ((j) obj2).f264589a);
    }

    public final int hashCode() {
        xi0.b bVar = this.f264589a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }
}
