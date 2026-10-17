package lhc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class k {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f195248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f195249c;
    public final String d;
    public final j e;

    public /* synthetic */ k(int i, String str, f fVar, String str2, String str3, j jVar) {
        if (31 != (i & 31)) {
            j1.f(c.f195239a.getDescriptor(), i, 31);
            throw null;
        }
        this.f195247a = str;
        this.f195248b = fVar;
        this.f195249c = str2;
        this.d = str3;
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
        return Intrinsics.f(this.f195247a, kVar.f195247a) && Intrinsics.f(this.f195248b, kVar.f195248b) && Intrinsics.f(this.f195249c, kVar.f195249c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e);
    }

    public final int hashCode() {
        String str = this.f195247a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        f fVar = this.f195248b;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str2 = this.f195249c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        j jVar = this.e;
        return iHashCode4 + (jVar != null ? jVar.hashCode() : 0);
    }

    public k(String str, f fVar, String str2, String str3, j jVar) {
        this.f195247a = str;
        this.f195248b = fVar;
        this.f195249c = str2;
        this.d = str3;
        this.e = jVar;
    }
}
