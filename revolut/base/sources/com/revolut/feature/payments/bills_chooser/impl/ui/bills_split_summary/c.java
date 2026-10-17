package com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary;

import ang.f;
import cli.g;
import cli.n;
import com.revolut.data.model.Data;
import com.revolut.feature.payments.bills_chooser.api.common.BillType;
import com.revolut.feature.payments.bills_chooser.api.navigation.SplitBillInputData;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitLineItem;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMembersType;
import com.revolut.feature.payments.bills_chooser.impl.domain.SplitBillItem;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.SplitBillsSummaryScreenContract$SplitSummaryTab;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.SplitBillsSummaryScreenContract$Step;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.SplitItemizationControllerContract$InputData;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.members.ItemizationMembersControllerContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k71.p;
import k71.q;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import njf.j;
import oki.h;
import vkm.j2;
import wp9.b0;
import wp9.c0;
import wp9.h0;
import wp9.k0;
import wp9.r;
import wp9.x;
import wp9.y;
import wp9.z;
import yji.l;
import yp9.e;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;
import zp9.v;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends h implements y {
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f79249p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yp9.b f79250q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n60.a f79251r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f79252s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final v f79253t;
    public final np9.a u;
    public final SplitBillInputData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final nhf.a f79254w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final gq9.f f79255x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f79256y;
    public final cli.y z;

    public c(e summaryInteractor, f userInteractor, yp9.b buttonsDelegate, n60.a keyboardControllerExtension, j60.a bottomExpandableDialog, v mapperOwner, np9.a dialogProvider, SplitBillInputData inputData, nhf.a unitedWalletInteractor, gq9.f scanBillControllerModelExtension, yp9.a itemizationInitialStateProvider, n stateMapper) {
        r rVar;
        x xVar;
        toh.d dVar = itemizationInitialStateProvider.f315796c;
        SplitBillInputData splitBillInputData = itemizationInitialStateProvider.f315794a;
        Intrinsics.checkNotNullParameter(summaryInteractor, "summaryInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(buttonsDelegate, "buttonsDelegate");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(mapperOwner, "mapperOwner");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(scanBillControllerModelExtension, "scanBillControllerModelExtension");
        Intrinsics.checkNotNullParameter(itemizationInitialStateProvider, "itemizationInitialStateProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = summaryInteractor;
        this.f79249p = userInteractor;
        this.f79250q = buttonsDelegate;
        this.f79251r = keyboardControllerExtension;
        this.f79252s = bottomExpandableDialog;
        this.f79253t = mapperOwner;
        this.u = dialogProvider;
        this.v = inputData;
        this.f79254w = unitedWalletInteractor;
        this.f79255x = scanBillControllerModelExtension;
        this.f79256y = hx7.e.a(this, new h0(this, 0));
        cp9.a aVar = uj3.b.o(inputData.f79198b) ? cp9.a.PERCENT : cp9.a.AMOUNT;
        List list = splitBillInputData.f79201h;
        SplitBillsSummaryScreenContract$SplitSummaryTab common = (list != null && (list.isEmpty() ^ true) && dVar.h()) ? SplitBillsSummaryScreenContract$SplitSummaryTab.Itemize.f79242a : new SplitBillsSummaryScreenContract$SplitSummaryTab.Common(aVar);
        b0 b0VarA = summaryInteractor.a(inputData.f79197a, aVar, null);
        Data data = new Data(null, null, true, 3, null);
        SplitMembersType splitMembersType = inputData.f79197a;
        boolean z = inputData.e;
        r rVar2 = new r(c0.DISABLED, z.INVISIBLE, uj3.b.o(buttonsDelegate.f315797a.f79198b) ? u.c(yp9.b.a()) : f0.f322471a, null);
        if (dVar.h()) {
            Iterable iterable = splitBillInputData.f79201h;
            Iterable<SplitLineItem> iterable2 = iterable == null ? f0.f322471a : iterable;
            ArrayList arrayList = new ArrayList(w.t(iterable2, 10));
            for (SplitLineItem splitLineItem : iterable2) {
                String strU = wp5.y.u(itemizationInitialStateProvider.f315795b, "toString(...)");
                String str = splitLineItem.f79212a;
                r rVar3 = rVar2;
                long j2 = splitLineItem.f79213b;
                List list2 = splitLineItem.d;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(((SplitMemberType) it8.next()).O7());
                }
                arrayList.add(new SplitBillItem(strU, str, j2, d0.i1(arrayList2)));
                rVar2 = rVar3;
            }
            rVar = rVar2;
            xVar = new x(arrayList, null);
        } else {
            xVar = new x(f0.f322471a, null);
            rVar = rVar2;
        }
        q.Companion.getClass();
        this.z = mra.d.b(this, new wp9.v(data, b0VarA, common, splitMembersType, z, rVar, xVar, p.a()), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        h0 h0Var = new h0(this, 1);
        gq9.f fVar = this.f79255x;
        fVar.f145609s = h0Var;
        fVar.f145610t = new h0(this, 2);
        Continuation continuation = null;
        l.a1(this, rd0.e.b(this.f79249p.k(false)), null, null, new a(this, null), 3);
        l.a1(this, rd0.e.b(((j) this.f79254w).f()), null, null, new k0(this, continuation, 0), 3);
        l.a1(this, this.z.B(new wp5.w(4)), null, null, new k0(this, continuation, 1), 3);
    }

    public final cp9.a I2() {
        SplitBillsSummaryScreenContract$SplitSummaryTab splitBillsSummaryScreenContract$SplitSummaryTab = ((wp9.v) ((j2) this.z.f22677a).getValue()).f299204c;
        if (splitBillsSummaryScreenContract$SplitSummaryTab instanceof SplitBillsSummaryScreenContract$SplitSummaryTab.Common) {
            return ((SplitBillsSummaryScreenContract$SplitSummaryTab.Common) splitBillsSummaryScreenContract$SplitSummaryTab).f79241a;
        }
        r6.b.r("No split type");
        return null;
    }

    public final SplitItemizationControllerContract$InputData J2(boolean z) {
        SplitBillInputData splitBillInputData = this.v;
        xi0.b bVarC = com.revolut.feature.payments.bills_chooser.api.common.a.c(splitBillInputData.f79198b);
        List list = splitBillInputData.f79198b;
        dj0.d.Companion.getClass();
        dj0.d dVarA = dj0.d.e;
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            dVarA = i == 0 ? com.revolut.feature.payments.bills_chooser.api.common.a.b((BillType) obj2).a() : pyd.c.O(dVarA, com.revolut.feature.payments.bills_chooser.api.common.a.b((BillType) obj2).a());
            i = i2;
        }
        return new SplitItemizationControllerContract$InputData(dVarA.f115082a, ((wp9.v) ((j2) this.z.f22677a).getValue()).f299205g.f299207a, bVarC, z);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f79256y;
    }

    public final void K2(SplitBillItem splitBillItem) {
        cli.y yVar = this.z;
        h.v2(this.f79256y, new SplitBillsSummaryScreenContract$Step.ItemizationMembers(new ItemizationMembersControllerContract$InputData(splitBillItem, ((wp9.v) ((j2) yVar.f22677a).getValue()).d, com.revolut.feature.payments.bills_chooser.api.common.a.c(this.v.f79198b), (do3.n) ((wp9.v) ((j2) yVar.f22677a).getValue()).f299202a.getContent())), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // cli.z
    public final g getState() {
        return this.z;
    }
}
