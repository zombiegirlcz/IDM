package gmg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class k {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f144830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f144831c;
    public final String d;
    public final j e;

    public /* synthetic */ k(int i, String str, String str2, String str3, String str4, j jVar) {
        if (31 != (i & 31)) {
            j1.f(f.f144824a.getDescriptor(), i, 31);
            throw null;
        }
        this.f144829a = str;
        this.f144830b = str2;
        this.f144831c = str3;
        this.d = str4;
        this.e = jVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f144829a, kVar.f144829a) && Intrinsics.f(this.f144830b, kVar.f144830b) && Intrinsics.f(this.f144831c, kVar.f144831c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f144829a.hashCode() * 31, 31, this.f144830b);
        String str = this.f144831c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        j jVar = this.e;
        return iHashCode2 + (jVar != null ? jVar.hashCode() : 0);
    }
}
