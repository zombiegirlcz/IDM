package fzd;

import com.revolut.feature.statements.api.models.SelectableOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.a1;
import zhm.d0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 extends z {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j2 f139139l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j2 f139140m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j2 f139141n;
    public final j2 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f139142p;

    public a0() {
        h0 h0Var = h0.f322473a;
        j2 j2VarC = vkm.q.c(h0Var);
        this.f139139l = j2VarC;
        this.f139140m = j2VarC;
        j2 j2VarC2 = vkm.q.c(h0Var);
        this.f139141n = j2VarC2;
        this.o = j2VarC2;
        this.f139142p = f0.f322471a;
    }

    @Override // fzd.z
    public final void Z2() {
        this.f139139l.setValue(h0.f322473a);
    }

    @Override // fzd.z
    public final j2 b3() {
        return this.f139140m;
    }

    @Override // fzd.z
    public final j2 c3() {
        return this.o;
    }

    @Override // fzd.z
    public final void d3() {
        List list = this.f139142p;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((SelectableOption) it8.next()).getType());
        }
        this.f139139l.setValue(d0.i1(arrayList));
    }

    @Override // fzd.z
    public final void e3(List categories) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f139142p = categories;
    }

    @Override // fzd.z
    public final void f3(Set selectedCategories) {
        Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
        this.f139139l.setValue(selectedCategories);
    }

    @Override // fzd.z
    public final void g3(Set selectedTransactionDirections) {
        Intrinsics.checkNotNullParameter(selectedTransactionDirections, "selectedTransactionDirections");
        this.f139141n.setValue(selectedTransactionDirections);
    }

    @Override // fzd.z
    public final void h3(String categoryType) {
        Intrinsics.checkNotNullParameter(categoryType, "categoryType");
        Set set = (Set) this.f139140m.getValue();
        LinkedHashSet linkedHashSetJ = set.contains(categoryType) ? a1.j(set, categoryType) : a1.m(set, categoryType);
        j2 j2Var = this.f139139l;
        j2Var.getClass();
        j2Var.g(null, linkedHashSetJ);
    }

    @Override // fzd.z
    public final void i3(String transactionDirection) {
        Intrinsics.checkNotNullParameter(transactionDirection, "transactionDirection");
        Set set = (Set) this.o.getValue();
        LinkedHashSet linkedHashSetJ = set.contains(transactionDirection) ? a1.j(set, transactionDirection) : a1.m(set, transactionDirection);
        j2 j2Var = this.f139141n;
        j2Var.getClass();
        j2Var.g(null, linkedHashSetJ);
    }
}
