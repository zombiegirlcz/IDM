package xyc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlowContract$FlowState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import uyc.p;
import vkm.j2;
import wyc.n;
import xv4.o;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f309719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.selfserve.sot.impl.ui.flow.e f309720b;

    public /* synthetic */ k(com.revolut.feature.selfserve.sot.impl.ui.flow.e eVar, int i) {
        this.f309719a = i;
        this.f309720b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        DocumentType documentType;
        int iIndexOf;
        DocumentType documentType2;
        int iIndexOf2;
        String str;
        Object next;
        switch (this.f309719a) {
            case 0:
                n output = (n) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                boolean z = output instanceof wyc.m;
                com.revolut.feature.selfserve.sot.impl.ui.flow.e eVar = this.f309720b;
                if (z) {
                    eVar.L2(((wyc.m) output).f301217a);
                } else if (output instanceof wyc.l) {
                    yji.l.a1(eVar, eVar.X1(new kii.c("CHANGE_INCOME_SOURCE_DIALOG_ID", null, new TextLocalisedClause(R$string.sow_add_income_sources_remove_all_attachments_confirmation_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_confirm, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), ((wyc.l) output).f301216a, true, 786)), null, null, new o(eVar, (Continuation) null, 8), 3);
                } else {
                    if (!(output instanceof wyc.k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar.B2();
                }
                return Unit.f186387a;
            case 1:
                com.revolut.feature.selfserve.sot.impl.ui.flow.e eVar2 = this.f309720b;
                qki.d dVar = eVar2.v;
                final qyc.l output2 = (qyc.l) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof qyc.k) {
                    final int i = 0;
                    eVar2.H2(dVar, new Function1() { // from class: xyc.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            SotFlowContract$FlowState update = (SotFlowContract$FlowState) obj3;
                            switch (i) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                    return SotFlowContract$FlowState.a(update, false, null, null, null, null, null, ((qyc.k) output2).f250277a, null, null, null, null, null, null, false, 16319);
                                default:
                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                    return SotFlowContract$FlowState.a(update, false, null, null, null, null, null, ((qyc.j) output2).f250276a, null, null, null, null, null, null, false, 16319);
                            }
                        }
                    });
                    eVar2.M2();
                } else {
                    if (!(output2 instanceof qyc.j)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    final int i2 = 1;
                    eVar2.H2(dVar, new Function1() { // from class: xyc.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            SotFlowContract$FlowState update = (SotFlowContract$FlowState) obj3;
                            switch (i2) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                    return SotFlowContract$FlowState.a(update, false, null, null, null, null, null, ((qyc.k) output2).f250277a, null, null, null, null, null, null, false, 16319);
                                default:
                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                    return SotFlowContract$FlowState.a(update, false, null, null, null, null, null, ((qyc.j) output2).f250276a, null, null, null, null, null, null, false, 16319);
                            }
                        }
                    });
                    eVar2.B2();
                }
                return Unit.f186387a;
            case 2:
                com.revolut.feature.selfserve.sot.impl.ui.flow.e eVar3 = this.f309720b;
                qki.d dVar2 = eVar3.v;
                p output3 = (p) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (output3 instanceof uyc.n) {
                    eVar3.H2(dVar2, new xw9.c(output3, 18));
                } else if (output3 instanceof uyc.o) {
                    yki.a aVar = eVar3.f85946w;
                    j2 j2Var = (j2) dVar2.f22677a;
                    j2 j2Var2 = (j2) dVar2.f22677a;
                    if (((SotFlowContract$FlowState) j2Var.getValue()).k != null) {
                        eVar3.l2(new xb4.e(eVar3, null, 17), new yi5.b(26));
                    } else {
                        List list = ((SotFlowContract$FlowState) j2Var2.getValue()).d;
                        if (list == null || (documentType2 = ((SotFlowContract$FlowState) j2Var2.getValue()).e) == null || Intrinsics.f(d0.m0(list), documentType2) || (iIndexOf2 = list.indexOf(documentType2)) < 0) {
                            oki.h.t2(eVar3, aVar, eVar3.K2(), true, null, false, 12);
                        } else {
                            eVar3.H2(dVar2, new xsh.j(list, iIndexOf2, 1));
                            DocumentType documentType3 = ((SotFlowContract$FlowState) j2Var2.getValue()).e;
                            if (documentType3 != null) {
                                oki.h.t2(eVar3, aVar, com.revolut.feature.selfserve.sot.impl.ui.flow.e.J2(eVar3, documentType3), false, null, false, 12);
                            }
                        }
                    }
                } else {
                    if (!(output3 instanceof uyc.m)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j2 j2Var3 = (j2) dVar2.f22677a;
                    j2 j2Var4 = (j2) dVar2.f22677a;
                    if (((SotFlowContract$FlowState) j2Var3.getValue()).f85919n) {
                        eVar3.H2(dVar2, new xx9.f(14));
                        eVar3.B2();
                    } else {
                        List list2 = ((SotFlowContract$FlowState) j2Var4.getValue()).d;
                        if (list2 == null || (documentType = ((SotFlowContract$FlowState) j2Var4.getValue()).e) == null || Intrinsics.f(d0.b0(list2), documentType) || (iIndexOf = list2.indexOf(documentType)) < 0) {
                            eVar3.B2();
                        } else {
                            eVar3.H2(dVar2, new xsh.j(list2, iIndexOf, 2));
                            DocumentType documentType4 = ((SotFlowContract$FlowState) j2Var4.getValue()).e;
                            if (documentType4 != null) {
                                oki.h.t2(eVar3, eVar3.f85946w, com.revolut.feature.selfserve.sot.impl.ui.flow.e.J2(eVar3, documentType4), false, null, false, 12);
                            }
                        }
                    }
                }
                return Unit.f186387a;
            case 3:
                syc.g output4 = (syc.g) obj2;
                Intrinsics.checkNotNullParameter(output4, "output");
                boolean z3 = output4 instanceof syc.f;
                com.revolut.feature.selfserve.sot.impl.ui.flow.e eVar4 = this.f309720b;
                if (z3) {
                    List list3 = ((syc.f) output4).f266653a;
                    qki.d dVar3 = eVar4.v;
                    eVar4.H2(dVar3, new x5f.m(list3, 12));
                    IncomeSource incomeSource = ((SotFlowContract$FlowState) ((j2) dVar3.f22677a).getValue()).f85913c;
                    if (incomeSource != null) {
                        eVar4.A1(new com.revolut.feature.selfserve.sot.impl.ui.flow.c(eVar4, incomeSource, list3, null), new yi5.b(25));
                    }
                } else {
                    if (!(output4 instanceof syc.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar4.B2();
                }
                return Unit.f186387a;
            case 4:
                com.revolut.feature.selfserve.sot.impl.ui.flow.e eVar5 = this.f309720b;
                qki.d dVar4 = eVar5.v;
                tyc.h output5 = (tyc.h) obj2;
                Intrinsics.checkNotNullParameter(output5, "output");
                if (output5 instanceof tyc.g) {
                    eVar5.H2(dVar4, new xf0.h(((tyc.g) output5).f275545a, 15));
                    j2 j2Var5 = (j2) dVar4.f22677a;
                    List list4 = ((SotFlowContract$FlowState) j2Var5.getValue()).d;
                    if (list4 != null && (str = ((SotFlowContract$FlowState) j2Var5.getValue()).f85916j) != null) {
                        List list5 = list4;
                        Iterator it8 = list5.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (Intrinsics.f(((DocumentType) next).f85859a, "OTHER")) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        DocumentType documentType5 = (DocumentType) next;
                        if (documentType5 != null) {
                            DocumentType documentTypeA = DocumentType.a(documentType5, str);
                            ArrayList arrayList = new ArrayList(w.t(list5, 10));
                            for (Object obj3 : list5) {
                                if (Intrinsics.f(((DocumentType) obj3).f85859a, "OTHER")) {
                                    obj3 = documentTypeA;
                                }
                                arrayList.add(obj3);
                            }
                            eVar5.H2(dVar4, new j(arrayList, documentTypeA, 0));
                        }
                    }
                    DocumentType documentType6 = ((SotFlowContract$FlowState) j2Var5.getValue()).e;
                    if (documentType6 != null) {
                        oki.h.t2(eVar5, eVar5.f85946w, com.revolut.feature.selfserve.sot.impl.ui.flow.e.J2(eVar5, documentType6), true, null, false, 12);
                    }
                } else {
                    if (!(output5 instanceof tyc.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar5.H2(dVar4, new xw9.c(output5, 17));
                    eVar5.B2();
                }
                return Unit.f186387a;
            case 5:
                this.f309720b.f85945t.onNext(Integer.valueOf((int) (((Float) obj2).floatValue() * 100)));
                return Unit.f186387a;
            default:
                this.f309720b.f85945t.onNext(Integer.valueOf((int) (((Float) obj2).floatValue() * 100)));
                return Unit.f186387a;
        }
    }
}
