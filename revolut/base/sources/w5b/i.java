package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f294872c;
    public final Boolean d;

    public /* synthetic */ i(int i, String str, String str2, l lVar, Boolean bool) {
        if (15 != (i & 15)) {
            qlm.j1.f(g.f294839a.getDescriptor(), i, 15);
            throw null;
        }
        this.f294870a = str;
        this.f294871b = str2;
        this.f294872c = lVar;
        this.d = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f294870a, iVar.f294870a) && Intrinsics.f(this.f294871b, iVar.f294871b) && Intrinsics.f(this.f294872c, iVar.f294872c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f294870a.hashCode() * 31, 31, this.f294871b);
        l lVar = this.f294872c;
        int iHashCode = (iC + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Boolean bool = this.d;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
