package gf7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class o {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f143370b;

    public /* synthetic */ o(int i, String str, h hVar) {
        if (3 != (i & 3)) {
            j1.f(d.f143357a.getDescriptor(), i, 3);
            throw null;
        }
        this.f143369a = str;
        this.f143370b = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f143369a, oVar.f143369a) && Intrinsics.f(this.f143370b, oVar.f143370b);
    }

    public final int hashCode() {
        String str = this.f143369a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        h hVar = this.f143370b;
        return iHashCode + (hVar != null ? hVar.hashCode() : 0);
    }
}
