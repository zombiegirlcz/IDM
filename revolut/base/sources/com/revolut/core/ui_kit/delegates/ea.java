package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.OrderBookItemDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.youTransactor.uCube.rpc.Constants;
import ip0.wz;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class ea implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f54100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f54101c;
    public qv0.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f54102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f54103h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f54104j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f54105l;

    public ea(TextLocalisedClause actionLabel) {
        OrderBookRestrictedDelegate.INSTANCE.getClass();
        TextClause textClause = new TextClause("00000", (Style) new Custom(null, false, null, true, null, Constants.TAG_BLE_FIRMWARE_VERSION), (Integer) null, false, (aw0.o9) null, (List) null, 124);
        OrderBookItemDelegate.a aVar = new OrderBookItemDelegate.a(textClause, textClause, 40, textClause, textClause, 40);
        OrderBookItemDelegate.a aVar2 = new OrderBookItemDelegate.a(textClause, textClause, 60, textClause, textClause, 60);
        List priceDataList = zhm.v.k(aVar, aVar2, aVar, aVar2, aVar, aVar, aVar);
        Intrinsics.checkNotNullParameter("OrderBook_Restricted", "listId");
        Intrinsics.checkNotNullParameter(actionLabel, "actionLabel");
        Intrinsics.checkNotNullParameter(priceDataList, "priceDataList");
        this.f54099a = "OrderBook_Restricted";
        this.f54100b = actionLabel;
        this.f54101c = priceDataList;
        this.d = c.d.f249513a;
        this.e = null;
        this.f = null;
        this.f54102g = null;
        this.f54103h = null;
        int i = R$attr.uikit_dp0;
        this.i = i;
        this.f54104j = i;
        this.k = i;
        this.f54105l = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new OrderBookRestrictedDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getD() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53900a() {
        return this.f54099a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ea)) {
            return false;
        }
        ea eaVar = (ea) obj2;
        return Intrinsics.f(this.f54099a, eaVar.f54099a) && Intrinsics.f(this.f54100b, eaVar.f54100b) && Intrinsics.f(this.f54101c, eaVar.f54101c) && Intrinsics.f(this.d, eaVar.d) && Intrinsics.f(this.e, eaVar.e) && Intrinsics.f(this.f, eaVar.f) && Intrinsics.f(this.f54102g, eaVar.f54102g) && Intrinsics.f(this.f54103h, eaVar.f54103h);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51854j() {
        return this.i;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.i = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.d, p.a.d(t61.a.a(this.f54099a.hashCode() * 31, 31, this.f54100b), 961, this.f54101c), 31);
        p31.c cVar = this.e;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f54102g;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f54103h;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF() {
        return this.e;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.d = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51852g() {
        return this.f;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f54102g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getK() {
        return this.f54104j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51856m() {
        return this.f54105l;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f54104j = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getE() {
        return this.d;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getI() {
        return this.f54103h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51853h() {
        return this.f54102g;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51855l() {
        return this.k;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f54103h = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(oldItem instanceof ea)) {
            return null;
        }
        ea eaVar = (ea) oldItem;
        return new wz(!Intrinsics.f(this.f54100b, eaVar.f54100b), !Intrinsics.f(this.f54101c, eaVar.f54101c), !true, or0.b.l(this, (qv0.i) oldItem));
    }
}
