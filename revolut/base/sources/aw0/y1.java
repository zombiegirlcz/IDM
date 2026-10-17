package aw0;

import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class y1 {

    @NotNull
    public static final w1 Companion;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final y1 f10615h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f10617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f10618c;
    public final Clause d;
    public final Clause e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f10619g;

    static {
        w1 w1Var = new w1();
        Companion = w1Var;
        f10615h = w1.a(w1Var, zhm.f0.f322471a, null, null, null, null, false, null, 254);
    }

    public y1(List list, List list2, List list3, Clause clause, Clause clause2, boolean z, p2 p2Var) {
        this.f10616a = list;
        this.f10617b = list2;
        this.f10618c = list3;
        this.d = clause;
        this.e = clause2;
        this.f = z;
        this.f10619g = p2Var;
    }

    public final ArrayList a() {
        List list = this.f10617b;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(Float.valueOf(((a2) it8.next()).f10222a));
        }
        return arrayList;
    }

    public final ArrayList b() {
        List list = this.f10618c;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(Float.valueOf(((a2) it8.next()).f10222a));
        }
        return arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj2;
        return Intrinsics.f(this.f10616a, y1Var.f10616a) && Intrinsics.f(this.f10617b, y1Var.f10617b) && Intrinsics.f(this.f10618c, y1Var.f10618c) && Intrinsics.f(this.d, y1Var.d) && Intrinsics.f(this.e, y1Var.e) && this.f == y1Var.f && Intrinsics.f(this.f10619g, y1Var.f10619g);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(this.f10616a.hashCode() * 31, 31, this.f10617b), 31, this.f10618c);
        Clause clause = this.d;
        int iHashCode = (iD + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.e;
        int iC = j6.a.c((iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31, 961, this.f);
        p2 p2Var = this.f10619g;
        return iC + (p2Var != null ? p2Var.hashCode() : 0);
    }
}
