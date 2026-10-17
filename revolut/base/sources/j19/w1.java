package j19;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class w1 implements c {

    @NotNull
    public static final v1 Companion = new v1();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Lazy[] f170271j = {null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new j18.j(18)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k19.m f170274c;
    public final k19.w d;
    public final k19.c e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k19.t f170275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k19.j f170276h;
    public final String i;

    public /* synthetic */ w1(int i, String str, String str2, k19.m mVar, k19.w wVar, k19.c cVar, List list, k19.t tVar, k19.j jVar, String str3) {
        if (31 != (i & 31)) {
            qlm.j1.f(u1.f170268a.getDescriptor(), i, 31);
            throw null;
        }
        this.f170272a = str;
        this.f170273b = str2;
        this.f170274c = mVar;
        this.d = wVar;
        this.e = cVar;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.f170275g = null;
        } else {
            this.f170275g = tVar;
        }
        if ((i & 128) == 0) {
            this.f170276h = null;
        } else {
            this.f170276h = jVar;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj2;
        return Intrinsics.f(this.f170272a, w1Var.f170272a) && Intrinsics.f(this.f170273b, w1Var.f170273b) && Intrinsics.f(this.f170274c, w1Var.f170274c) && Intrinsics.f(this.d, w1Var.d) && Intrinsics.f(this.e, w1Var.e) && Intrinsics.f(this.f, w1Var.f) && Intrinsics.f(this.f170275g, w1Var.f170275g) && Intrinsics.f(this.f170276h, w1Var.f170276h) && Intrinsics.f(this.i, w1Var.i);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.f170274c.hashCode() + p.a.c(this.f170272a.hashCode() * 31, 31, this.f170273b)) * 31)) * 31)) * 31;
        List list = this.f;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        k19.t tVar = this.f170275g;
        int iHashCode3 = (iHashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        k19.j jVar = this.f170276h;
        int iHashCode4 = (iHashCode3 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        String str = this.i;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }
}
