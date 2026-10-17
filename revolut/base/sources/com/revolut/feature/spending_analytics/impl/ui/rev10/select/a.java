package com.revolut.feature.spending_analytics.impl.ui.rev10.select;

import akb.s;
import amh.j;
import ard.s0;
import ard.u;
import c8g.c;
import cli.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionContract$SelectionMode;
import efm.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l5i.q;
import l80.e;
import lk0.g;
import oki.h;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import tof.a3;
import vkm.j2;
import vkm.z1;
import wsg.n;
import yji.l;
import yk0.d;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements ard.b {

    @NotNull
    public static final u Companion = new u();
    public Map A;
    public Set B;
    public a2 C;
    public g D;
    public SelectTransactionContract$DateRange E;
    public boolean F;
    public final SelectTransactionContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nhf.a f87891p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q f87892q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e61.a f87893r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n f87894s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s0 f87895t;
    public final e u;
    public final d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ge3.d f87896w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f87897x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final z1 f87898y;
    public String z;

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(cli.n r24, com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionContract$InputData r25, nhf.a r26, l5i.q r27, e61.a r28, wsg.n r29, ard.s0 r30, l80.e r31, yk0.d r32, ge3.d r33) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.spending_analytics.impl.ui.rev10.select.a.<init>(cli.n, com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionContract$InputData, nhf.a, l5i.q, e61.a, wsg.n, ard.s0, l80.e, yk0.d, ge3.d):void");
    }

    public final List I2() {
        ArrayList arrayList;
        List list;
        g gVar = ((ard.a) ((j2) this.f87897x.f22677a).getValue()).f8633a;
        if (gVar == null || (list = gVar.f196174a) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                List list2 = ((lk0.e) it8.next()).f196171a;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(((he3.h) it9.next()).f151559a);
                }
                a0.x(arrayList2, arrayList);
            }
        }
        return arrayList == null ? f0.f322471a : arrayList;
    }

    public final void J2() {
        this.F = true;
        Continuation continuation = null;
        this.D = null;
        a2 a2Var = this.C;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.C = l2(new s(this, continuation, 13), new yi5.b(26));
    }

    public final boolean K2(Set set, List list, ard.a aVar) {
        if (set.size() != list.size() || list.isEmpty()) {
            return false;
        }
        if (!(this.o.f87884c instanceof SelectTransactionContract$SelectionMode.Multiple.SpecificTransactions)) {
            return true;
        }
        g gVar = aVar.f8633a;
        List list2 = gVar != null ? gVar.f196174a : null;
        if (list2 == null) {
            list2 = f0.f322471a;
        }
        if (list2.isEmpty()) {
            return false;
        }
        List<lk0.e> list3 = list2;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            for (lk0.e eVar : list3) {
                if (eVar.f196173c || eVar.e != null) {
                    return false;
                }
            }
        }
        lk0.e eVar2 = (lk0.e) d0.o0(list2);
        return (eVar2 != null ? eVar2.d : null) == null;
    }

    public final void L2(a3 transaction) {
        String str = transaction.f272581b;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        y yVar = this.f87897x;
        Set set = ((ard.a) ((j2) yVar.f22677a).getValue()).f8634b;
        boolean z = false;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it8 = set.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                } else if (Intrinsics.f(((a3) it8.next()).f272581b, str)) {
                    z = true;
                    break;
                }
            }
        }
        this.A = r0.q(this.A, new Pair(str, Boolean.valueOf(!z)));
        SelectTransactionContract$SelectionMode selectTransactionContract$SelectionMode = this.o.f87884c;
        if (!(selectTransactionContract$SelectionMode instanceof SelectTransactionContract$SelectionMode.Single)) {
            if (!(selectTransactionContract$SelectionMode instanceof SelectTransactionContract$SelectionMode.Multiple)) {
                throw new NoWhenBranchMatchedException();
            }
            H2(yVar, new j(transaction, this, 28));
        } else if (((SelectTransactionContract$SelectionMode.Single) selectTransactionContract$SelectionMode).f87890a) {
            H2(yVar, new aqd.g(transaction, 1));
        } else {
            C2(new ard.g(transaction));
        }
    }

    public final boolean M2(SelectTransactionContract$DateRange selectTransactionContract$DateRange) {
        SelectTransactionContract$SelectionMode selectTransactionContract$SelectionMode = this.o.f87884c;
        if (selectTransactionContract$SelectionMode instanceof SelectTransactionContract$SelectionMode.Multiple.SpecificTransactions) {
            return true;
        }
        if (selectTransactionContract$SelectionMode instanceof SelectTransactionContract$SelectionMode.Multiple.AllSelected) {
            return selectTransactionContract$DateRange != null;
        }
        if ((selectTransactionContract$SelectionMode instanceof SelectTransactionContract$SelectionMode.Multiple.AllDeselected) || (selectTransactionContract$SelectionMode instanceof SelectTransactionContract$SelectionMode.Single)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // yji.l
    public final void T1(long j2) {
        this.E = ((ard.a) ((j2) this.f87897x.f22677a).getValue()).e;
        r map = ((njf.j) this.f87891p).f().map(new aoa.h(new aqb.s(24), 22));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVar = (r) this.f87893r.f122883c.getValue();
        r map2 = this.f87894s.x(AccountId.Personal.f51414a).x().map(new aoa.h(new aqb.s(25), 23));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        l.b1(this, c.d(rd0.e.b(mif.a.e(map, rVar, map2)), new ard.s(this, 1)), null, null, 7);
        l.b1(this, c.d(cj9.c.O(((le3.w) this.f87896w).b(this.o.f87883b), 500L), new ard.s(this, 2)), null, null, 7);
        J2();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f87897x;
    }
}
