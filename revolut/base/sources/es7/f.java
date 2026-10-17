package es7;

import ekd.i0;
import es7.b;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class f {

    @NotNull
    public static final d Companion = new d();
    public static final Lazy[] f = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new i0(15)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f128884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f128885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f128886c;
    public final b d;
    public final String e;

    public /* synthetic */ f(int i, String str, String str2, e eVar, b bVar, String str3) {
        if (31 != (i & 31)) {
            j1.f(a.f128876a.getDescriptor(), i, 31);
            throw null;
        }
        this.f128884a = str;
        this.f128885b = str2;
        this.f128886c = eVar;
        this.d = bVar;
        this.e = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f128884a, fVar.f128884a) && Intrinsics.f(this.f128885b, fVar.f128885b) && Intrinsics.f(this.f128886c, fVar.f128886c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f128884a.hashCode() * 31;
        String str = this.f128885b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        e eVar = this.f128886c;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.f128882a.hashCode())) * 31;
        b bVar = this.d;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public f(String title, String str, e eVar, b.C0748b c0748b, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f128884a = title;
        this.f128885b = str;
        this.f128886c = eVar;
        this.d = c0748b;
        this.e = str2;
    }
}
