package mp6;

import android.graphics.Bitmap;
import ard.b0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol;
import com.revolut.feature.rev_points.impl.ui.RevPointsFlowContract$Step;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import com.revolut.feature.revolutpay.api.shared.domain.models.PaymentInitiationParams;
import com.revolut.feature.revolutpay.order_tracking.impl.data.service.RevolutPayDeliveryTrackingService;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.CryptoDepositsOverviewControllerContract$InputData;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import k71.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.n0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import n33.r2;
import n7i.s;
import nfj.u0;
import nii.k1;
import nii.l1;
import nii.n1;
import okhttp3.MultipartBody$Part;
import okhttp3.RequestBody;
import om4.r1;
import qa9.r;
import r0a.y;
import rfm.z;
import s56.i0;
import skm.e0;
import skm.g0;
import skm.p0;
import ulm.a1;
import ulm.b1;
import ulm.e1;
import ulm.o1;
import ulm.p1;
import vkm.z1;
import zhm.d0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f207752w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f207753x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f207754y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, Serializable serializable, Object obj2, Object obj3, Object obj4, String str, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f207752w = obj2;
        this.f207753x = obj3;
        this.z = str;
        this.f207754y = serializable;
        this.A = obj4;
    }

    private final Object b(Object obj2) {
        List list = (List) this.A;
        List list2 = ((rwa.m) this.f207753x).f257875a;
        Function1 function1 = (Function1) this.z;
        n1 n1Var = (n1) this.f207752w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        try {
        } catch (Throwable th10) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
            function1.invoke(new cn3.c(list, false));
        }
        if (i == 0) {
            yhm.o.b(obj2);
            if ((n1Var instanceof l1) || (n1Var instanceof k1)) {
                if (list2.size() == 1) {
                    z zVarB = ((wl3.h) ((pxa.c) this.f207754y).f240593n).b(((rwa.e) d0.b0(list2)).f257864a);
                    this.f207752w = null;
                    this.v = 1;
                    obj2 = nim.a.h(zVarB, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    function1.invoke(new cn3.c(list, false));
                }
            }
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yhm.o.b(obj2);
        zm3.a aVar2 = (zm3.a) obj2;
        Intrinsics.h(aVar2);
        function1.invoke(new cn3.c(u.c(new cn3.e(aVar2)), false));
        return Unit.f186387a;
    }

    private final Object c(Object obj2) throws Throwable {
        com.revolut.feature.rev_points.impl.ui.transactions.list.d dVar = (com.revolut.feature.rev_points.impl.ui.transactions.list.d) this.f207752w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            elm.g gVar = p0.f264002b;
            a9h.a aVar2 = new a9h.a(dVar, (ArrayList) this.f207754y, (q) this.A, (String) this.z, (Continuation) null);
            this.v = 1;
            obj2 = e0.J(gVar, aVar2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        List<RevPointsTransaction> transactionsList = (List) obj2;
        syb.c cVar = dVar.v;
        String selectedTransactionId = ((RevPointsTransaction) this.f207753x).f84054a;
        RevPointsTransactionPageParams pageParams = dVar.o.f83876a;
        String searchQuery = (String) this.z;
        eub.l pagingInteractor = dVar.f83889q;
        com.revolut.feature.rev_points.impl.ui.c cVar2 = (com.revolut.feature.rev_points.impl.ui.c) cVar;
        cVar2.getClass();
        Intrinsics.checkNotNullParameter(transactionsList, "transactionsList");
        Intrinsics.checkNotNullParameter(selectedTransactionId, "selectedTransactionId");
        Intrinsics.checkNotNullParameter(pageParams, "pageParams");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(pagingInteractor, "pagingInteractor");
        yki.i iVar = cVar2.u;
        for (RevPointsTransaction revPointsTransaction : transactionsList) {
            if (Intrinsics.f(revPointsTransaction.f84054a, selectedTransactionId)) {
                oki.h.z2(iVar, new RevPointsFlowContract$Step.OpenTransactionDetailsPager(transactionsList, selectedTransactionId, revPointsTransaction, pageParams, searchQuery, pagingInteractor, false, null, 192), ModalDestination.Style.FullscreenPaged.f98310a);
                return Unit.f186387a;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final Object n(Object obj2) {
        q34.d dVar = (q34.d) this.f207753x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            ArrayList arrayList = (ArrayList) this.f207752w;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            int i2 = 0;
            for (Object obj3 : arrayList) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    v.s();
                    throw null;
                }
                arrayList2.add(dVar.d.b((File) obj3, a0.d.n("file", i3)));
                i2 = i3;
            }
            CreditPluginsService creditPluginsService = dVar.f241797b;
            String str = (String) this.z;
            String str2 = (String) this.f207754y;
            lr.m mVar = new lr.m((ukm.q) this.A, 2);
            this.v = 1;
            if (creditPluginsService.uploadDocs(str, str2, arrayList2, mVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r1.emit(q56.f.f242297a, r9) == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        if (r1.emit(r10, r9) != r2) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d A[PHI: r1 r10
      0x006d: PHI (r1v2 kotlinx.coroutines.flow.FlowCollector) = (r1v1 kotlinx.coroutines.flow.FlowCollector), (r1v4 kotlinx.coroutines.flow.FlowCollector) binds: [B:23:0x006a, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x006d: PHI (r10v10 java.lang.Object) = (r10v8 java.lang.Object), (r10v0 java.lang.Object) binds: [B:23:0x006a, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.z
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r9.f207752w
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r9.v
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r3 == 0) goto L35
            if (r3 == r7) goto L31
            if (r3 == r6) goto L2d
            if (r3 == r5) goto L24
            if (r3 != r4) goto L1c
            goto L31
        L1c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L24:
            java.lang.Object r0 = r9.f207753x
            r1 = r0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            yhm.o.b(r10)
            goto L6d
        L2d:
            yhm.o.b(r10)
            goto L58
        L31:
            yhm.o.b(r10)
            goto L7a
        L35:
            yhm.o.b(r10)
            boolean r10 = kotlin.text.d0.W(r0)
            if (r10 == 0) goto L4b
            r9.f207752w = r8
            r9.v = r7
            q56.f r10 = q56.f.f242297a
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r2) goto L7a
            goto L79
        L4b:
            r9.f207752w = r1
            r9.v = r6
            q56.h r10 = q56.h.f242300a
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r2) goto L58
            goto L79
        L58:
            java.lang.Object r10 = r9.f207754y
            com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a r10 = (com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a) r10
            java.lang.Object r3 = r9.A
            java.util.List r3 = (java.util.List) r3
            r9.f207752w = r8
            r9.f207753x = r1
            r9.v = r5
            java.lang.Object r10 = com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a.I2(r10, r0, r3, r9)
            if (r10 != r2) goto L6d
            goto L79
        L6d:
            r9.f207752w = r8
            r9.f207753x = r8
            r9.v = r4
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r2) goto L7a
        L79:
            return r2
        L7a:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: mp6.j.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (vkm.q.u(r1, r8, r7) == r2) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f207754y
            q7c.j r0 = (q7c.j) r0
            java.lang.Object r1 = r7.f207752w
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r7.v
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L2f
            if (r3 == r6) goto L2b
            if (r3 == r5) goto L23
            if (r3 != r4) goto L1b
            yhm.o.b(r8)
            goto L75
        L1b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L23:
            java.lang.Object r3 = r7.f207753x
            l6c.b r3 = (l6c.b) r3
            yhm.o.b(r8)
            goto L55
        L2b:
            yhm.o.b(r8)
            goto L45
        L2f:
            yhm.o.b(r8)
            java.lang.Object r8 = r7.A
            com.revolut.feature.revolutpay.api.shared.domain.models.PaymentInitiationParams r8 = (com.revolut.feature.revolutpay.api.shared.domain.models.PaymentInitiationParams) r8
            java.lang.Object r3 = r7.z
            java.lang.String r3 = (java.lang.String) r3
            r7.f207752w = r1
            r7.v = r6
            java.lang.Object r8 = r0.d(r8, r3, r7)
            if (r8 != r2) goto L45
            goto L74
        L45:
            r3 = r8
            l6c.b r3 = (l6c.b) r3
            r7.f207752w = r1
            r7.f207753x = r3
            r7.v = r5
            java.lang.Object r8 = r1.emit(r3, r7)
            if (r8 != r2) goto L55
            goto L74
        L55:
            boolean r8 = r3 instanceof l6c.a
            r5 = 0
            if (r8 == 0) goto L5d
            l6c.a r3 = (l6c.a) r3
            goto L5e
        L5d:
            r3 = r5
        L5e:
            if (r3 == 0) goto L75
            java.lang.String r8 = r3.a()
            vkm.v1 r8 = r0.e(r8)
            r7.f207752w = r5
            r7.f207753x = r5
            r7.v = r4
            java.lang.Object r8 = vkm.q.u(r1, r8, r7)
            if (r8 != r2) goto L75
        L74:
            return r2
        L75:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mp6.j.p(java.lang.Object):java.lang.Object");
    }

    private final Object s(Object obj2) {
        pac.f fVar;
        String str = (String) this.z;
        qac.i iVar = (qac.i) this.f207753x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            RevolutPayDeliveryTrackingService revolutPayDeliveryTrackingService = iVar.f244022a;
            pac.h hVar = new pac.h(null, str, (String) this.f207754y, (String) this.A);
            this.v = 1;
            obj2 = revolutPayDeliveryTrackingService.editTracking(hVar, this);
            if (obj2 != aVar) {
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (pac.f) this.f207752w;
            yhm.o.b(obj2);
            return nac.a.b(fVar);
        }
        yhm.o.b(obj2);
        pac.f fVar2 = (pac.f) obj2;
        r rVar = new r(fVar2, 1);
        this.f207752w = fVar2;
        this.v = 2;
        if (qac.i.a(iVar, str, rVar, this) != aVar) {
            fVar = fVar2;
            return nac.a.b(fVar);
        }
        return aVar;
    }

    private final Object t(Object obj2) {
        Iterator it8;
        CoroutineScope coroutineScope = (CoroutineScope) this.f207752w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            ArrayList arrayListU = p.a.u(obj2);
            n0 n0Var = new n0();
            n0 n0Var2 = new n0();
            ArrayList arrayList = (ArrayList) this.f207753x;
            qt8.o oVar = (qt8.o) this.f207754y;
            String str = (String) this.z;
            j21.c cVar = (j21.c) this.A;
            Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                my8.e eVar = (my8.e) it9.next();
                if (eVar instanceof my8.c) {
                    my8.c cVar2 = (my8.c) eVar;
                    Bitmap bitmap = cVar2.f210373a;
                    oVar.getClass();
                    Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                    b1.Companion.getClass();
                    o1 o1VarD = p1.d(RequestBody.Companion, do3.q.H(bitmap), a1.b("image/jpeg"), 0, 6);
                    MultipartBody$Part.Companion.getClass();
                    MultipartBody$Part multipartBody$PartC = e1.c("scan", null, o1VarD);
                    n0Var.f186428a = multipartBody$PartC.f226052b.contentLength() + n0Var.f186428a;
                    it8 = it9;
                    oVar = oVar;
                    arrayListU.add(e0.g(coroutineScope, null, skm.d0.LAZY, new ac8.h(oVar, str, multipartBody$PartC, cVar2, n0Var2, cVar, n0Var, null, 27), 1));
                } else {
                    it8 = it9;
                    if (!(eVar instanceof my8.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    my8.d dVar = (my8.d) eVar;
                    File file = dVar.f210375a;
                    oVar.getClass();
                    Intrinsics.checkNotNullParameter(file, "file");
                    b1.Companion.getClass();
                    b1 b1VarB = a1.b("video/mp4");
                    RequestBody.Companion.getClass();
                    ulm.k1 k1VarA = p1.a(file, b1VarB);
                    MultipartBody$Part.Companion.getClass();
                    MultipartBody$Part multipartBody$PartC2 = e1.c("scan", null, k1VarA);
                    n0Var.f186428a = multipartBody$PartC2.f226052b.contentLength() + n0Var.f186428a;
                    arrayListU.add(e0.g(coroutineScope, null, skm.d0.LAZY, new ac8.h(oVar, str, multipartBody$PartC2, dVar, n0Var2, cVar, n0Var, null, 28), 1));
                }
                it9 = it8;
            }
            Iterator it10 = arrayListU.iterator();
            while (it10.hasNext()) {
                ((g0) it10.next()).start();
            }
            this.f207752w = null;
            this.v = 1;
            if (e0.h(arrayListU, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object u(Object obj2) {
        skm.h0 h0VarG;
        r0a.g gVar;
        ChatTransferRecipient chatTransferRecipient = (ChatTransferRecipient) this.A;
        y yVar = (y) this.z;
        CoroutineScope coroutineScope = (CoroutineScope) this.f207752w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        Continuation continuation = null;
        if (i == 0) {
            yhm.o.b(obj2);
            skm.h0 h0VarG2 = e0.g(coroutineScope, null, null, new r0a.w(yVar, chatTransferRecipient, continuation, 0), 3);
            h0VarG = e0.g(coroutineScope, null, null, new r0a.w(yVar, chatTransferRecipient, continuation, 1), 3);
            this.f207752w = null;
            this.f207753x = h0VarG;
            this.v = 1;
            obj2 = h0VarG2.y(this);
            if (obj2 != aVar) {
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = (r0a.g) this.f207754y;
            yhm.o.b(obj2);
            return new r0a.r(gVar, (qv0.i) obj2);
        }
        h0VarG = (skm.h0) this.f207753x;
        yhm.o.b(obj2);
        r0a.g gVar2 = (r0a.g) obj2;
        this.f207752w = null;
        this.f207753x = null;
        this.f207754y = gVar2;
        this.v = 2;
        Object objI = h0VarG.i(this);
        if (objI != aVar) {
            gVar = gVar2;
            obj2 = objI;
            return new r0a.r(gVar, (qv0.i) obj2);
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
    
        if (r10 == r5) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object v(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.Object r0 = r9.z
            efm.r r0 = (efm.r) r0
            java.lang.Object r1 = r9.A
            kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
            java.lang.Object r2 = r9.f207754y
            com.revolut.retail.feature.crypto_deposits.impl.ui.overview.CryptoDepositsOverviewControllerContract$InputData r2 = (com.revolut.retail.feature.crypto_deposits.impl.ui.overview.CryptoDepositsOverviewControllerContract$InputData) r2
            java.lang.Object r3 = r9.f207753x
            rbj.l r3 = (rbj.l) r3
            java.lang.Object r4 = r9.f207752w
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            fim.a r5 = fim.a.COROUTINE_SUSPENDED
            int r6 = r9.v
            r7 = 2
            r8 = 1
            if (r6 == 0) goto L31
            if (r6 == r8) goto L2d
            if (r6 != r7) goto L25
            yhm.o.b(r10)
            goto Lb6
        L25:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L2d:
            yhm.o.b(r10)
            goto L44
        L31:
            yhm.o.b(r10)
            xi0.b r10 = r2.f100075a
            boolean r6 = r2.f100076b
            r9.f207752w = r4
            r9.v = r8
            java.lang.Enum r10 = r3.c(r10, r6, r9)
            if (r10 != r5) goto L44
            goto Lb5
        L44:
            zbj.w r10 = (zbj.w) r10
            int[] r6 = rbj.h.f253132a
            int r10 = r10.ordinal()
            r10 = r6[r10]
            r6 = 0
            if (r10 == r8) goto L91
            if (r10 == r7) goto L63
            r0 = 3
            if (r10 != r0) goto L5d
            xi0.b r10 = r2.f100075a
            wkm.l r10 = r3.b(r10, r1)
            goto L97
        L5d:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L63:
            xi0.b r10 = r2.f100075a
            zbj.u0 r2 = r2.f100077c
            r3.getClass()
            java.lang.String r8 = "currency"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r8)
            java.lang.String r8 = "contactsPermissionsGrantedObservable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r8)
            java.lang.String r8 = "userSelectedBlockchainFlow"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r8)
            vkm.d r0 = r3.a(r0, r10)
            wkm.l r10 = r3.b(r10, r1)
            amf.k r1 = new amf.k
            r8 = 10
            r1.<init>(r3, r2, r6, r8)
            t38.e r2 = new t38.e
            r3 = 24
            r2.<init>(r0, r3, r10, r1)
            r10 = r2
            goto L97
        L91:
            xi0.b r10 = r2.f100075a
            vkm.d r10 = r3.a(r0, r10)
        L97:
            r9.f207752w = r6
            r9.v = r7
            vkm.q.w(r4)
            r74.a0 r0 = new r74.a0
            r1 = 10
            r0.<init>(r4, r1)
            java.lang.Object r10 = r10.collect(r0, r9)
            if (r10 != r5) goto Lac
            goto Lae
        Lac:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        Lae:
            if (r10 != r5) goto Lb1
            goto Lb3
        Lb1:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        Lb3:
            if (r10 != r5) goto Lb6
        Lb5:
            return r5
        Lb6:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: mp6.j.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
    
        if (r0.emit(r10, r9) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object w(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f207752w
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r9.v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L25
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L15
            yhm.o.b(r10)
            goto L5f
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            java.lang.Object r0 = r9.f207753x
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            yhm.o.b(r10)
            goto L52
        L25:
            yhm.o.b(r10)
            java.lang.Object r10 = r9.f207754y
            rg3.o r10 = (rg3.o) r10
            java.lang.Object r2 = r9.A
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            java.lang.Object r6 = r9.z
            java.lang.String r6 = (java.lang.String) r6
            rg3.h r7 = new rg3.h
            r8 = 0
            r7.<init>(r8, r6, r2)
            r9.f207752w = r5
            r9.f207753x = r0
            r9.v = r4
            qg7.p r2 = new qg7.p
            r4 = 13
            r2.<init>(r10, r7, r5, r4)
            skm.p0 r10 = skm.p0.f264001a
            elm.f r10 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r10, r2, r9)
            if (r10 != r1) goto L52
            goto L5e
        L52:
            r9.f207752w = r5
            r9.f207753x = r5
            r9.v = r3
            java.lang.Object r10 = r0.emit(r10, r9)
            if (r10 != r1) goto L5f
        L5e:
            return r1
        L5f:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: mp6.j.w(java.lang.Object):java.lang.Object");
    }

    private final Object x(Object obj2) throws Throwable {
        File file;
        File file2 = (File) this.A;
        rnf.l lVar = (rnf.l) this.f207754y;
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        Continuation continuation = null;
        if (i == 0) {
            yhm.o.b(obj2);
            File fileK = ((a80.h) lVar.f255663a).k("txn_receipts");
            String str = (String) this.z;
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strN = lim.o.n(file2);
            StringBuilder sb6 = new StringBuilder("receipt_txn_");
            sb6.append(str);
            sb6.append("_");
            sb6.append(jCurrentTimeMillis);
            File file3 = new File(fileK, v0.a.i(sb6, ".", strN));
            if (!file2.renameTo(file3)) {
                lim.o.l(file2, file3);
                zk0.b bVar = lVar.f255663a;
                String absolutePath = file2.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                ((a80.h) bVar).d(absolutePath);
            }
            enf.c cVar = lVar.f255664b;
            this.f207752w = file3;
            this.v = 1;
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(elm.f.f127540b, new chf.a(file3, cVar, continuation, 21), this);
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ != obj3) {
                file = file3;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            File file4 = (File) this.f207753x;
            yhm.o.b(obj2);
            return file4;
        }
        file = (File) this.f207752w;
        yhm.o.b(obj2);
        z1 z1Var = lVar.f255665c;
        Unit unit = Unit.f186387a;
        this.f207752w = null;
        this.f207753x = file;
        this.v = 2;
        return z1Var.emit(unit, this) == obj3 ? obj3 : file;
    }

    private final Object y(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f207752w;
            akg.n nVar = (akg.n) this.f207753x;
            b0 b0Var = new b0(flowCollector, (Ref$BooleanRef) this.f207754y, (rqd.k) this.A, (String) this.z, 23);
            this.f207752w = null;
            this.v = 1;
            if (nVar.collect(b0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(0, (n) this.f207753x, (yo6.d) this.f207754y, (String) this.z, (yo6.c) this.A, continuation);
                jVar.f207752w = obj2;
                return jVar;
            case 1:
                j jVar2 = new j((n1j.e) this.z, (Set) this.A, continuation, 1);
                jVar2.f207752w = obj2;
                return jVar2;
            case 2:
                return new j((r2) this.f207753x, (psg.a) this.f207754y, (kc8.a) this.A, continuation);
            case 3:
                return new j((s) this.f207752w, (TradingAccount) this.f207753x, (kel.b) this.f207754y, (x5i.d) this.z, (AccountWrapper) this.A, continuation);
            case 4:
                j jVar3 = new j((n97.k) this.f207753x, (efm.r) this.f207754y, (n97.g) this.A, (String) this.z, continuation, 4);
                jVar3.f207752w = obj2;
                return jVar3;
            case 5:
                return new j(5, (u0) this.f207752w, (Long) this.f207754y, (String) this.A, (String) this.z, (String) this.f207753x, continuation);
            case 6:
                j jVar4 = new j((TradingLegalEntityInformation) this.f207753x, (jx0.a) this.f207754y, (wbl.j) this.A, (String) this.z, continuation, 6);
                jVar4.f207752w = obj2;
                return jVar4;
            case 7:
                j jVar5 = new j((nrb.b) this.f207754y, (AdvancedChartSymbol) this.z, (c1b.h) this.A, continuation, 7);
                jVar5.f207752w = obj2;
                return jVar5;
            case 8:
                j jVar6 = new j(8, (List) this.f207753x, (ArrayList) this.f207754y, (nx1.u) this.z, (List) this.A, continuation);
                jVar6.f207752w = obj2;
                return jVar6;
            case 9:
                return new j(9, (com.revolut.feature.onboarding.impl.onboarding.plan_selection.a) this.f207753x, (hha.d) this.f207754y, (hha.i) this.z, (PricingPlanOffer) this.A, continuation);
            case 10:
                return new j(10, (of6.e) this.f207752w, (Map) this.f207754y, (Map) this.A, (String) this.z, (String) this.f207753x, continuation);
            case 11:
                j jVar7 = new j(11, (ql4.v) this.f207753x, (r1) this.f207754y, (String) this.z, (String) this.A, continuation);
                jVar7.f207752w = obj2;
                return jVar7;
            case 12:
                j jVar8 = new j((oz1.j) this.f207754y, (String) this.z, (ApmPaymentAuthorisationPaymentMethod) this.A, continuation, 12);
                jVar8.f207752w = obj2;
                return jVar8;
            case 13:
                return new j(13, (Serializable) this.f207754y, this.f207752w, this.f207753x, this.A, (String) this.z, continuation);
            case 14:
                return new j(14, (p5k.k) this.f207753x, (FundingSource) this.f207754y, (xi0.b) this.z, (Clause) this.A, continuation);
            case 15:
                j jVar9 = new j((pp5.a) this.z, (List) this.A, continuation, 15);
                jVar9.f207752w = obj2;
                return jVar9;
            case 16:
                j jVar10 = new j((px1.i) this.f207754y, (String) this.z, (List) this.A, continuation, 16);
                jVar10.f207753x = obj2;
                return jVar10;
            case 17:
                j jVar11 = new j(17, (rwa.m) this.f207753x, (pxa.c) this.f207754y, (Function1) this.z, (List) this.A, continuation);
                jVar11.f207752w = obj2;
                return jVar11;
            case 18:
                return new j(18, (ArrayList) this.f207754y, (com.revolut.feature.rev_points.impl.ui.transactions.list.d) this.f207752w, (RevPointsTransaction) this.f207753x, (q) this.A, (String) this.z, continuation);
            case 19:
                return new j(19, (String) this.f207754y, (ArrayList) this.f207752w, (q34.d) this.f207753x, (ukm.q) this.A, (String) this.z, continuation);
            case 20:
                j jVar12 = new j((String) this.z, (com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a) this.f207754y, (List) this.A, continuation);
                jVar12.f207752w = obj2;
                return jVar12;
            case 21:
                j jVar13 = new j(21, (q7c.j) this.f207754y, (PaymentInitiationParams) this.A, (String) this.z, continuation);
                jVar13.f207752w = obj2;
                return jVar13;
            case 22:
                return new j((qac.i) this.f207753x, (String) this.z, (String) this.f207754y, (String) this.A, continuation);
            case 23:
                j jVar14 = new j(23, (ArrayList) this.f207753x, (qt8.o) this.f207754y, (String) this.z, (j21.c) this.A, continuation);
                jVar14.f207752w = obj2;
                return jVar14;
            case 24:
                j jVar15 = new j((y) this.z, (ChatTransferRecipient) this.A, continuation, 24);
                jVar15.f207752w = obj2;
                return jVar15;
            case 25:
                j jVar16 = new j(25, (rbj.l) this.f207753x, (CryptoDepositsOverviewControllerContract$InputData) this.f207754y, (efm.r) this.z, (Flow) this.A, continuation);
                jVar16.f207752w = obj2;
                return jVar16;
            case 26:
                j jVar17 = new j(26, (rg3.o) this.f207754y, (Function1) this.A, (String) this.z, continuation);
                jVar17.f207752w = obj2;
                return jVar17;
            case 27:
                return new j((rnf.l) this.f207754y, (String) this.z, (File) this.A, continuation, 27);
            case 28:
                j jVar18 = new j((akg.n) this.f207753x, continuation, (Ref$BooleanRef) this.f207754y, (rqd.k) this.A, (String) this.z);
                jVar18.f207752w = obj2;
                return jVar18;
            default:
                return new j(29, (e16.g) this.f207753x, (i0) this.f207754y, (wk5.a) this.z, (xi0.b) this.A, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((j) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((j) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((j) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((j) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((j) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((j) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((j) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((j) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((j) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((j) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((j) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((j) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((j) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:189:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0387 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:562:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:583:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:598:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0162  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r39) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 3408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mp6.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f207753x = obj2;
        this.f207754y = obj3;
        this.z = obj4;
        this.A = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, Object obj2, Object obj3, Object obj4, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f207752w = obj2;
        this.z = str;
        this.f207753x = str2;
        this.f207754y = obj3;
        this.A = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, Object obj2, Object obj3, String str, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f207754y = obj2;
        this.A = obj3;
        this.z = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(akg.n nVar, Continuation continuation, Ref$BooleanRef ref$BooleanRef, rqd.k kVar, String str) {
        super(2, continuation);
        this.u = 28;
        this.f207753x = nVar;
        this.f207754y = ref$BooleanRef;
        this.A = kVar;
        this.z = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Object obj3, Object obj4, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f207753x = obj2;
        this.f207754y = obj3;
        this.A = obj4;
        this.z = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f207754y = obj2;
        this.z = obj3;
        this.A = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.z = obj2;
        this.A = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a aVar, List list, Continuation continuation) {
        super(2, continuation);
        this.u = 20;
        this.z = str;
        this.f207754y = aVar;
        this.A = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r2 r2Var, psg.a aVar, kc8.a aVar2, Continuation continuation) {
        super(2, continuation);
        this.u = 2;
        this.f207753x = r2Var;
        this.f207754y = aVar;
        this.A = aVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(s sVar, TradingAccount tradingAccount, kel.b bVar, x5i.d dVar, AccountWrapper accountWrapper, Continuation continuation) {
        super(2, continuation);
        this.u = 3;
        this.f207752w = sVar;
        this.f207753x = tradingAccount;
        this.f207754y = bVar;
        this.z = dVar;
        this.A = accountWrapper;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(qac.i iVar, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.u = 22;
        this.f207753x = iVar;
        this.z = str;
        this.f207754y = str2;
        this.A = str3;
    }
}
