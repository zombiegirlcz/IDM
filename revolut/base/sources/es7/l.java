package es7;

import ekd.i0;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();
    public static final Lazy[] f = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new i0(20))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f128899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f128900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f128901c;
    public final String d;
    public final i e;

    public /* synthetic */ l(int i, String str, String str2, String str3, String str4, i iVar) {
        if (31 != (i & 31)) {
            j1.f(h.f128890a.getDescriptor(), i, 31);
            throw null;
        }
        this.f128899a = str;
        this.f128900b = str2;
        this.f128901c = str3;
        this.d = str4;
        this.e = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f128899a, lVar.f128899a) && Intrinsics.f(this.f128900b, lVar.f128900b) && Intrinsics.f(this.f128901c, lVar.f128901c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e);
    }

    public final int hashCode() {
        String str = this.f128899a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f128900b);
        String str2 = this.f128901c;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        i iVar = this.e;
        return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }

    public l(String str, String title, String str2, String str3, i iVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f128899a = str;
        this.f128900b = title;
        this.f128901c = str2;
        this.d = str3;
        this.e = iVar;
    }
}
