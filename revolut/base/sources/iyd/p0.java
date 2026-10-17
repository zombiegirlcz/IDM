package iyd;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class p0 {

    @NotNull
    public static final o0 Companion = new o0();
    public static final Lazy[] f = {null, null, yhm.j.c(yhm.k.PUBLICATION, new iw4.b(14)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f169686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f169687c;
    public final f d;
    public final o e;

    public p0(String id10, String title, ArrayList arrayList, f fVar, o oVar, int i) {
        arrayList = (i & 4) != 0 ? null : arrayList;
        fVar = (i & 8) != 0 ? null : fVar;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f169685a = id10;
        this.f169686b = title;
        this.f169687c = arrayList;
        this.d = fVar;
        this.e = oVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f169685a, p0Var.f169685a) && Intrinsics.f(this.f169686b, p0Var.f169686b) && Intrinsics.f(this.f169687c, p0Var.f169687c) && Intrinsics.f(this.d, p0Var.d) && Intrinsics.f(this.e, p0Var.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f169685a.hashCode() * 31, 31, this.f169686b);
        List list = this.f169687c;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        f fVar = this.d;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        o oVar = this.e;
        return iHashCode2 + (oVar != null ? oVar.f169683a.hashCode() : 0);
    }

    public /* synthetic */ p0(int i, String str, String str2, List list, f fVar, o oVar) {
        if (3 != (i & 3)) {
            j1.f(n0.f169681a.getDescriptor(), i, 3);
            throw null;
        }
        this.f169685a = str;
        this.f169686b = str2;
        if ((i & 4) == 0) {
            this.f169687c = null;
        } else {
            this.f169687c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = fVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = oVar;
        }
    }
}
