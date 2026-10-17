package zkk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.d f323078b;

    public q(String id10, hha.d dVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f323077a = id10;
        this.f323078b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f323077a, qVar.f323077a) && Intrinsics.f(this.f323078b, qVar.f323078b);
    }

    public final int hashCode() {
        int iHashCode = this.f323077a.hashCode() * 31;
        hha.d dVar = this.f323078b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
