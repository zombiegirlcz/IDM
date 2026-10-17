package wp5;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.EmojiImage;
import com.revolut.feature.crypto_investments.api.model.transaction_filter.CryptoTransactionFilter;
import com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.TransactionFilterFlowContract$Step;
import com.revolut.feature.kyc_documents_scan.api.models.WorkflowDocumentScanCofiguration;
import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import com.revolut.feature.rev_points.models.RevPointsEarningBreakdown;
import com.revolut.feature.rev_points.models.RevPointsEarningRate;
import com.revolut.feature.workflow.engine.R$string;
import com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$InputData;
import com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import grl.cc;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1c.f1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f299154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f299155c;

    public /* synthetic */ v(Object obj2, Object obj3, int i) {
        this.f299153a = i;
        this.f299154b = obj2;
        this.f299155c = obj3;
    }

    private final Object a(Object obj2) {
        boolean z;
        wu.b bVar = (wu.b) this.f299154b;
        File file = (File) this.f299155c;
        File file2 = (File) obj2;
        Intrinsics.checkNotNullParameter(file2, "file");
        List<String> list = bVar.f300041a;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = true;
        } else {
            for (String str : list) {
                String path = file2.getPath();
                Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
                z = false;
                if (kotlin.text.a0.H(path, file.getAbsolutePath() + "/" + str, false)) {
                    break;
                }
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    private final Object b(Object obj2) {
        Object next;
        hha.d dVar = (hha.d) this.f299154b;
        m1c.z zVar = (m1c.z) this.f299155c;
        RevPointsEarningBreakdown it8 = (RevPointsEarningBreakdown) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        Iterator it9 = it8.f83974c.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next = null;
                break;
            }
            next = it9.next();
            if (((RevPointsEarningRate) next).f83975a == f1.CREDIT_CARD) {
                break;
            }
        }
        return new em4.b(dVar, zVar, (RevPointsEarningRate) next);
    }

    private final Object c(Object obj2) {
        ArrayList arrayList;
        com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.a aVar = (com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.a) this.f299154b;
        TransactionFilterFlowContract$Step.Filters filters = (TransactionFilterFlowContract$Step.Filters) this.f299155c;
        yu5.j output = (yu5.j) obj2;
        Intrinsics.checkNotNullParameter(output, "output");
        if (output instanceof yu5.h) {
            aVar.C2(new lt5.c(((yu5.h) output).f316888b));
        } else {
            if (!(output instanceof yu5.i)) {
                throw new NoWhenBranchMatchedException();
            }
            yu5.i iVar = (yu5.i) output;
            ArrayList arrayListS = knm.b.S(filters.f71432a, iVar.f316890c);
            yki.a aVar2 = aVar.o;
            av5.i iVar2 = iVar.f316889b;
            int i = wu5.c.f300069a[iVar2.ordinal()];
            if (i == 1) {
                arrayList = new ArrayList();
                for (Object obj3 : arrayListS) {
                    if (obj3 instanceof CryptoTransactionFilter.TransactionTypeFilter) {
                        arrayList.add(obj3);
                    }
                }
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList = new ArrayList();
                for (Object obj4 : arrayListS) {
                    if (obj4 instanceof CryptoTransactionFilter.CurrencyFilter) {
                        arrayList.add(obj4);
                    }
                }
            }
            oki.h.t2(aVar, aVar2, new TransactionFilterFlowContract$Step.FiltersByType(iVar2, arrayList, arrayListS, filters.f71433b), true, null, false, 12);
        }
        return Unit.f186387a;
    }

    private final Object d(Object obj2) {
        com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.a aVar = (com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.a) this.f299154b;
        TransactionFilterFlowContract$Step.FiltersByType filtersByType = (TransactionFilterFlowContract$Step.FiltersByType) this.f299155c;
        av5.g output = (av5.g) obj2;
        Intrinsics.checkNotNullParameter(output, "output");
        oki.h.r2(aVar.o);
        oki.h.t2(aVar, aVar.o, new TransactionFilterFlowContract$Step.Filters(knm.b.S(filtersByType.f71436c, output.f9918a), filtersByType.d), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
        return Unit.f186387a;
    }

    private final Object e(Object obj2) {
        dv9.g gVar;
        List list;
        Object next;
        ChatItem chatItem = (ChatItem) this.f299154b;
        dv9.m mVar = (dv9.m) this.f299155c;
        yhm.r rVar = (yhm.r) obj2;
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        od0.i iVar = (od0.i) rVar.f314201a;
        do3.n nVar = (do3.n) rVar.f314202b;
        List list2 = (List) rVar.f314203c;
        dv9.h hVar = (dv9.h) iVar.f224257a;
        if (hVar == null || (list = hVar.f) == null) {
            gVar = null;
        } else {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((dv9.g) next).f118065b, do3.q.k(nVar))) {
                    break;
                }
            }
            gVar = (dv9.g) next;
        }
        Object obj3 = list2;
        if (gVar != null) {
            String str = gVar.f118064a;
            boolean zContains = list2.contains(str);
            obj3 = list2;
            if (!zContains) {
                ArrayList arrayListF1 = zhm.d0.f1(zhm.d0.V0(list2, list2.size() - 1));
                arrayListF1.add(0, str);
                obj3 = arrayListF1;
            }
        }
        Iterable<String> iterable = (Iterable) obj3;
        ArrayList arrayList = new ArrayList(zhm.w.t(iterable, 10));
        for (String str2 : iterable) {
            arrayList.add(new mw0.b(new EmojiImage(str2, 24, 28), str2.equals(gVar != null ? gVar.f118064a : null), new fu9.h(chatItem, mVar, str2)));
        }
        return new mw0.c(arrayList, new fu9.g(chatItem));
    }

    private final Object g(Object obj2) {
        com.revolut.feature.workflow.engine.sdk_flow.f fVar = (com.revolut.feature.workflow.engine.sdk_flow.f) this.f299154b;
        SdkFlowContract$Step sdkFlowContract$Step = (SdkFlowContract$Step) this.f299155c;
        xy8.b result = (xy8.b) obj2;
        Intrinsics.checkNotNullParameter(result, "result");
        xuh.b bVar = fVar.v;
        WorkflowDocumentScanCofiguration workflowConfig = ((SdkFlowContract$Step.Workflow) sdkFlowContract$Step).b();
        my8.t status = result.f309647a.f210398a;
        tx8.b0 b0Var = bVar.f309072a;
        Intrinsics.checkNotNullParameter(workflowConfig, "workflowConfig");
        Intrinsics.checkNotNullParameter(status, "status");
        int i = xuh.a.f309071a[status.ordinal()];
        Continuation continuation = null;
        if (i == 1) {
            av1.c vendor = xuh.b.a(workflowConfig);
            Intrinsics.checkNotNullParameter(vendor, "vendor");
            b0Var.b(cc.Failed, vendor, null);
        } else if (i == 2) {
            av1.c vendor2 = xuh.b.a(workflowConfig);
            Intrinsics.checkNotNullParameter(vendor2, "vendor");
            b0Var.b(cc.Succeeded, vendor2, null);
        } else {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            av1.c vendor3 = xuh.b.a(workflowConfig);
            Intrinsics.checkNotNullParameter(vendor3, "vendor");
            b0Var.b(cc.Skipped, vendor3, null);
        }
        int i2 = wuh.j.f300153a[result.f309647a.f210398a.ordinal()];
        if (i2 == 1) {
            com.revolut.feature.workflow.engine.sdk_flow.f.R2(fVar, null, null, new com.revolut.feature.workflow.engine.sdk_flow.a(fVar, null), 3);
        } else if (i2 == 2 || i2 == 3) {
            SdkFlowContract$InputData sdkFlowContract$InputData = fVar.o;
            Intrinsics.i(sdkFlowContract$InputData, "null cannot be cast to non-null type com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract.InputData.Workflow");
            if (((SdkFlowContract$InputData.Workflow) sdkFlowContract$InputData).f96585c) {
                fVar.C2(wuh.c.f300148a);
            } else {
                wuh.n nVar = new wuh.n(fVar, continuation, 1);
                fVar.u.getClass();
                yji.l.a1(fVar, fVar.X1(new nii.y0("ID_RETRY_STATUS_DIALOG", new nii.l0(new TextLocalisedClause(R$string.cancel_flow_alert_title, null, null, 14), new TextLocalisedClause(R$string.cancel_flow_alert_message, null, null, 14), null, new TextLocalisedClause(R$string.cancel_flow_alert_back, null, null, 14), new TextLocalisedClause(R$string.cancel_flow_alert_quit, null, null, 14), null, false, null, 996), false, 4)), null, null, new wih.c(nVar, fVar, continuation, 13), 3);
            }
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            com.revolut.feature.workflow.engine.sdk_flow.f.R2(fVar, null, null, new wuh.m(fVar, continuation, 3), 3);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:408:0x0bb2  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0bb4  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0c3e  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0c80  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0c90  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0c95  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0ca5  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0ce4  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r43) {
        /*
            Method dump skipped, instruction units count: 3408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wp5.v.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ v(wu9.c cVar, ChatItem chatItem, dv9.m mVar) {
        this.f299153a = 27;
        this.f299154b = chatItem;
        this.f299155c = mVar;
    }
}
