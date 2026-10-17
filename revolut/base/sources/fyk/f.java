package fyk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f139030b;

    public /* synthetic */ f(int i, String str, c cVar) {
        if (3 != (i & 3)) {
            j1.f(d.f139028a.getDescriptor(), i, 3);
            throw null;
        }
        this.f139029a = str;
        this.f139030b = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f139029a, fVar.f139029a) && Intrinsics.f(this.f139030b, fVar.f139030b);
    }

    public final int hashCode() {
        int iHashCode = this.f139029a.hashCode() * 31;
        c cVar = this.f139030b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }
}
