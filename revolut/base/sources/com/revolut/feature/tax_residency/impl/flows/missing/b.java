package com.revolut.feature.tax_residency.impl.flows.missing;

import bnj.n;
import boe.c;
import boe.d;
import boe.h;
import boe.i;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.tax_residency.api.WhatIsTaxDialogConfig;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.feature.tax_residency.impl.flows.list.TaxResidenciesListFlow;
import com.revolut.feature.tax_residency.impl.flows.list.TaxResidenciesListFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.flows.missing.TaxMissingRationaleFlowContract$Step;
import com.revolut.feature.tax_residency.impl.flows.submit.SubmitTaxResidencyFlow;
import com.revolut.feature.tax_residency.impl.flows.submit.SubmitTaxResidencyFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.screens.rationales.RationalesScreen;
import com.revolut.feature.tax_residency.impl.screens.rationales.RationalesScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import grl.k9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yji.l;
import zhm.d0;
import zhm.f0;
import zhm.w;
import zme.f;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends g implements d {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TaxMissingRationaleFlowContract$InputData f90045t;
    public final yme.a u;
    public final j60.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TaxMissingRationaleFlowContract$Step.Rationales f90046w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TaxMissingRationaleFlowContract$State f90047x;

    public b(TaxMissingRationaleFlowContract$InputData inputData, yme.a taxResidencyInteractor, j60.a bottomDialogExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(taxResidencyInteractor, "taxResidencyInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        this.f90045t = inputData;
        this.u = taxResidencyInteractor;
        this.v = bottomDialogExtension;
        this.f90046w = TaxMissingRationaleFlowContract$Step.Rationales.f90043a;
        this.f90047x = new TaxMissingRationaleFlowContract$State(null);
    }

    public final void O2(wi0.b bVar, List list, List list2, Function1 function1) {
        l.i2(this, new SubmitTaxResidencyFlow(new SubmitTaxResidencyFlowContract$InputData(bVar, list, list2, (List) f0.f322471a, (List) null, true, "PRIMARY_BUTTON_LOADING_TAG", 16)), null, new n(this, function1), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P2(boolean r7, boolean r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof boe.n
            if (r0 == 0) goto L13
            r0 = r9
            boe.n r0 = (boe.n) r0
            int r1 = r0.f17404x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17404x = r1
            goto L18
        L13:
            boe.n r0 = new boe.n
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17404x
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            boe.g r7 = r0.u
            yhm.o.b(r9)
            goto Laa
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r9)
            if (r7 == 0) goto L3d
            boe.f r7 = new boe.f
            r7.<init>(r8)
            goto L3f
        L3d:
            boe.e r7 = boe.e.f17397a
        L3f:
            r0.u = r7
            r0.f17404x = r3
            com.revolut.feature.tax_residency.impl.flows.missing.TaxMissingRationaleFlowContract$InputData r8 = r6.f90045t
            wi0.b r8 = r8.f90039b
            com.revolut.kompot.navigable.flow.FlowStateWrapper r9 = r6.A2()
            com.revolut.kompot.navigable.flow.FlowState r9 = r9.f98429a
            com.revolut.feature.tax_residency.impl.flows.missing.TaxMissingRationaleFlowContract$State r9 = (com.revolut.feature.tax_residency.impl.flows.missing.TaxMissingRationaleFlowContract$State) r9
            zme.j r9 = r9.f90041a
            if (r9 == 0) goto Lb3
            yme.a r2 = r6.u
            hoe.a r2 = (hoe.a) r2
            r2.getClass()
            java.lang.String r3 = "countryCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r3)
            java.lang.String r4 = "rationaleType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r4)
            boolean r5 = com.bumptech.glide.d.x(r8)
            if (r5 == 0) goto L6d
            zme.a r5 = zme.a.FATCA
            goto L6f
        L6d:
            zme.a r5 = zme.a.CRS
        L6f:
            joe.b r2 = r2.f154277a
            joe.o r2 = (joe.o) r2
            r2.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r4)
            java.lang.String r3 = "certificationType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            ioe.e0 r3 = new ioe.e0
            java.lang.Object r4 = joe.a.f176929b
            java.lang.String r4 = le.u1.g(r5, r4)
            java.lang.String r8 = r8.f297794a
            java.lang.Object r5 = joe.a.f176930c
            java.lang.String r9 = le.u1.g(r9, r5)
            r3.<init>(r4, r8, r9)
            com.revolut.feature.tax_residency.impl.services.TaxResidencyService r8 = r2.f176939a
            efm.b r8 = r8.submitRationale(r3)
            pfm.r r8 = te0.w.g0(r8)
            java.lang.Object r8 = nim.a.a(r8, r0)
            if (r8 != r1) goto La5
            goto La7
        La5:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        La7:
            if (r8 != r1) goto Laa
            return r1
        Laa:
            r6.G2(r7)
            r6.I2()
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        Lb3:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Required value was null."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.tax_residency.impl.flows.missing.b.P2(boolean, boolean, gim.c):java.lang.Object");
    }

    public final List Q2(List list) {
        TaxMissingRationaleFlowContract$InputData taxMissingRationaleFlowContract$InputData;
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            taxMissingRationaleFlowContract$InputData = this.f90045t;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((f) next).f323482a, taxMissingRationaleFlowContract$InputData.f90039b)) {
                break;
            }
        }
        if (next != null) {
            return list;
        }
        return d0.F0(new f(taxMissingRationaleFlowContract$InputData.f90039b, null, null, false, null, null, 62), list);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        TaxMissingRationaleFlowContract$Step step = (TaxMissingRationaleFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        boolean z = step instanceof TaxMissingRationaleFlowContract$Step.Rationales;
        TaxMissingRationaleFlowContract$InputData taxMissingRationaleFlowContract$InputData = this.f90045t;
        if (z) {
            wi0.b bVar = taxMissingRationaleFlowContract$InputData.f90039b;
            List list = taxMissingRationaleFlowContract$InputData.e;
            List list2 = taxMissingRationaleFlowContract$InputData.f;
            RationalesScreen rationalesScreen = new RationalesScreen(new RationalesScreenContract$InputData(bVar, taxMissingRationaleFlowContract$InputData.f90040c));
            a5b.b bVar2 = new a5b.b(this, bVar, list, list2, 9);
            Intrinsics.checkNotNullParameter(bVar2, "<set-?>");
            rationalesScreen.H = bVar2;
            return rationalesScreen;
        }
        if (!(step instanceof TaxMissingRationaleFlowContract$Step.CollectTin)) {
            throw new NoWhenBranchMatchedException();
        }
        wi0.b bVar3 = taxMissingRationaleFlowContract$InputData.f90039b;
        List list3 = taxMissingRationaleFlowContract$InputData.e;
        List listQ2 = Q2(list3);
        List list4 = list3;
        ArrayList arrayList = new ArrayList(w.t(list4, 10));
        Iterator it8 = list4.iterator();
        while (it8.hasNext()) {
            arrayList.add(((f) it8.next()).f323482a);
        }
        List list5 = taxMissingRationaleFlowContract$InputData.f;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list5) {
            if (!i26.l.o((zme.l) obj2)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        Iterator it9 = arrayList2.iterator();
        while (it9.hasNext()) {
            arrayList3.add(((zme.l) it9.next()).f323500a);
        }
        ArrayList arrayListF0 = d0.F0(bVar3, d0.U(d0.E0(arrayList3, arrayList)));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.tax_residency_list_reasonableness_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.tax_residency_common_action_confirm, null, null, 14);
        h.Companion.getClass();
        k9 k9Var = c.f17396b;
        wi0.b bVar4 = null;
        List list6 = null;
        boolean z3 = true;
        boolean z4 = false;
        boolean z6 = false;
        boolean z11 = true;
        WhatIsTaxDialogConfig whatIsTaxDialogConfig = null;
        TaxResidenciesListFlow taxResidenciesListFlow = new TaxResidenciesListFlow(new TaxResidenciesListFlowContract$InputData(bVar4, listQ2, list6, arrayListF0, z3, z4, z6, z11, textLocalisedClause, textLocalisedClause2, whatIsTaxDialogConfig, new AnalyticsProduct.Retail(k9Var), taxMissingRationaleFlowContract$InputData.d, 2053));
        n nVar = new n(this, bVar3, 2);
        Intrinsics.checkNotNullParameter(nVar, "<set-?>");
        taxResidenciesListFlow.J = nVar;
        return taxResidenciesListFlow;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f90047x;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f90046w;
    }
}
