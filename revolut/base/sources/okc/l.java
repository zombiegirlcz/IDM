package okc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f225975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f225976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f225977c;
    public final i d;

    public /* synthetic */ l(int i, String str, String str2, String str3, i iVar) {
        if (3 != (i & 3)) {
            j1.f(j.f225974a.getDescriptor(), i, 3);
            throw null;
        }
        this.f225975a = str;
        this.f225976b = str2;
        if ((i & 4) == 0) {
            this.f225977c = null;
        } else {
            this.f225977c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = iVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f225975a, lVar.f225975a) && Intrinsics.f(this.f225976b, lVar.f225976b) && Intrinsics.f(this.f225977c, lVar.f225977c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f225975a.hashCode() * 31, 31, this.f225976b);
        String str = this.f225977c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        i iVar = this.d;
        return iHashCode + (iVar != null ? iVar.f225973a.hashCode() : 0);
    }
}
