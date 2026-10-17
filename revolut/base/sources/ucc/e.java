package ucc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f279024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f279025b;

    public e(String step, d dVar) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.f279024a = step;
        this.f279025b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f279024a, eVar.f279024a) && Intrinsics.f(this.f279025b, eVar.f279025b);
    }

    public final int hashCode() {
        int iHashCode = this.f279024a.hashCode() * 31;
        d dVar = this.f279025b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
