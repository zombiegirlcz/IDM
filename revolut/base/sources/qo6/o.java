package qo6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f248068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f248069c;
    public final f d;

    public /* synthetic */ o(int i, String str, String str2, i iVar, f fVar) {
        if (15 != (i & 15)) {
            j1.f(m.f248066a.getDescriptor(), i, 15);
            throw null;
        }
        this.f248067a = str;
        this.f248068b = str2;
        this.f248069c = iVar;
        this.d = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f248067a, oVar.f248067a) && Intrinsics.f(this.f248068b, oVar.f248068b) && Intrinsics.f(this.f248069c, oVar.f248069c) && Intrinsics.f(this.d, oVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f248067a.hashCode() * 31, 31, this.f248068b);
        i iVar = this.f248069c;
        int iHashCode = (iC + (iVar == null ? 0 : iVar.hashCode())) * 31;
        f fVar = this.d;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }
}
