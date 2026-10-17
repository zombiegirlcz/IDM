package fgf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f135073c;

    public /* synthetic */ l(int i, String str, String str2, i iVar) {
        if (3 != (i & 3)) {
            j1.f(j.f135070a.getDescriptor(), i, 3);
            throw null;
        }
        this.f135071a = str;
        this.f135072b = str2;
        if ((i & 4) == 0) {
            this.f135073c = null;
        } else {
            this.f135073c = iVar;
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
        return Intrinsics.f(this.f135071a, lVar.f135071a) && Intrinsics.f(this.f135072b, lVar.f135072b) && Intrinsics.f(this.f135073c, lVar.f135073c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f135071a.hashCode() * 31, 31, this.f135072b);
        i iVar = this.f135073c;
        return iC + (iVar == null ? 0 : iVar.hashCode());
    }
}
