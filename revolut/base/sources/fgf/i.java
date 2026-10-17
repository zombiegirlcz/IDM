package fgf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class i {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f135069c;
    public final d d;
    public final h e;

    public /* synthetic */ i(int i, String str, String str2, String str3, d dVar, h hVar) {
        if (11 != (i & 11)) {
            j1.f(a.f135062a.getDescriptor(), i, 11);
            throw null;
        }
        this.f135067a = str;
        this.f135068b = str2;
        if ((i & 4) == 0) {
            this.f135069c = null;
        } else {
            this.f135069c = str3;
        }
        this.d = dVar;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = hVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f135067a, iVar.f135067a) && Intrinsics.f(this.f135068b, iVar.f135068b) && Intrinsics.f(this.f135069c, iVar.f135069c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f135067a.hashCode() * 31, 31, this.f135068b);
        String str = this.f135069c;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d.f135064a);
        h hVar = this.e;
        return iC2 + (hVar != null ? hVar.f135066a.hashCode() : 0);
    }
}
