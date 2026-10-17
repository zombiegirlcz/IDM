package usj;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f282957g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f282958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f282959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f282960c;
    public final List d;
    public final List e;
    public final Integer f;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f282957g = new Lazy[]{null, null, null, yhm.j.c(kVar, new us4.b(2)), yhm.j.c(kVar, new us4.b(3)), null};
    }

    public /* synthetic */ o(int i, String str, String str2, String str3, List list, List list2, Integer num) {
        if (7 != (i & 7)) {
            j1.f(m.f282956a.getDescriptor(), i, 7);
            throw null;
        }
        this.f282958a = str;
        this.f282959b = str2;
        this.f282960c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f282958a, oVar.f282958a) && Intrinsics.f(this.f282959b, oVar.f282959b) && Intrinsics.f(this.f282960c, oVar.f282960c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f282958a.hashCode() * 31, 31, this.f282959b), 31, this.f282960c);
        List list = this.d;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.f;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
