package rt4;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xp3.d f257172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f257173b;

    public f(xp3.d dVar, ArrayList options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f257172a = dVar;
        this.f257173b = options;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f257172a == fVar.f257172a && this.f257173b.equals(fVar.f257173b);
    }

    public final int hashCode() {
        xp3.d dVar = this.f257172a;
        return this.f257173b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31);
    }
}
