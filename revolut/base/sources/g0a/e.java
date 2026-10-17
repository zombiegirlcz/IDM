package g0a;

import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.cards.models.card.PocketWithSubaccount;
import com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInPriceUpdateRequest;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart;
import com.revolut.retail.feature.trading_onboarding.impl.data.network.BackendFlowOnboardingService;
import com.revolut.retail.feature.trading_onboarding.impl.data.network.OnboardingService;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import dx6.m;
import ft3.d1;
import g27.t;
import g4k.p;
import g4k.r;
import g8i.e0;
import grl.r2;
import h43.s;
import ha3.x;
import hba.l;
import hw3.f0;
import i0e.q;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import n14.k;
import nii.j0;
import nii.l1;
import nii.m0;
import nii.z;
import yhm.o;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f139386w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f139387x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f139388y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f139386w = obj2;
        this.f139387x = obj3;
        this.f139388y = obj4;
        this.z = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [gim.i, kotlin.jvm.functions.Function2] */
    private final Object b(Object obj2) {
        ?? r06 = (gim.i) this.z;
        Function0 function0 = (Function0) this.f139388y;
        Function1 function1 = (Function1) this.f139387x;
        l lVar = (l) this.f139386w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            m mVar = new m(function1);
            hba.i iVar = new hba.i(0, function0);
            gi2.i iVar2 = new gi2.i((Function2) r06, lVar, (Continuation) null);
            this.v = 1;
            obj2 = k.V(lVar, null, mVar, iVar, iVar2, this, 1);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        nii.h hVar = (nii.h) obj2;
        m0 m0VarA = hVar.a().a();
        if (m0VarA instanceof z) {
            if (hVar.a() instanceof l1) {
                lVar.I2(function1, function0, r06);
            } else {
                lVar.J2();
            }
        } else if (m0VarA instanceof j0) {
            lVar.C2(hba.d.DISMISS);
        } else {
            lVar.J2();
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d A[PHI: r3
      0x006d: PHI (r3v6 ko5.l) = (r3v2 ko5.l), (r3v8 ko5.l) binds: [B:19:0x006a, B:10:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008a -> B:13:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f139388y
            hp5.o r0 = (hp5.o) r0
            java.lang.Object r1 = r14.f139387x
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r14.v
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L2d
            if (r3 == r7) goto L29
            if (r3 == r6) goto L21
            if (r3 != r5) goto L19
            goto L2d
        L19:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L21:
            java.lang.Object r3 = r14.f139386w
            ko5.l r3 = (ko5.l) r3
            yhm.o.b(r15)
            goto L6d
        L29:
            yhm.o.b(r15)
            goto L55
        L2d:
            yhm.o.b(r15)
        L30:
            kotlin.coroutines.CoroutineContext r15 = r14.getContext()
            boolean r15 = skm.e0.x(r15)
            if (r15 == 0) goto L8d
            com.revolut.feature.crypto.withdraw.impl.network.CryptoWithdrawService r15 = r0.f154482a
            java.lang.Object r3 = r14.z
            ko5.k r3 = (ko5.k) r3
            dp5.y0 r3 = v13.d.N(r3)
            efm.d0 r15 = r15.requestWithdrawQuote(r3)
            r14.f139387x = r1
            r14.f139386w = r4
            r14.v = r7
            java.lang.Object r15 = nim.a.b(r15, r14)
            if (r15 != r2) goto L55
            goto L8c
        L55:
            java.lang.String r3 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r3)
            dp5.b1 r15 = (dp5.b1) r15
            ko5.l r3 = cp5.d.U(r15)
            r14.f139387x = r1
            r14.f139386w = r3
            r14.v = r6
            java.lang.Object r15 = r1.emit(r3, r14)
            if (r15 != r2) goto L6d
            goto L8c
        L6d:
            long r8 = r3.f186239b
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.SECONDS
            r10 = 3
            long r10 = r15.toMillis(r10)
            long r12 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r12
            long r8 = java.lang.Math.max(r8, r10)
            r14.f139387x = r1
            r14.f139386w = r4
            r14.v = r5
            java.lang.Object r15 = skm.k0.b(r8, r14)
            if (r15 != r2) goto L30
        L8c:
            return r2
        L8d:
            kotlin.Unit r15 = kotlin.Unit.f186387a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: g0a.e.c(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [fim.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.os.ParcelFileDescriptor, java.lang.Object] */
    private final Object n(Object obj2) throws Throwable {
        SecurityException cause;
        PdfRenderer pdfRenderer;
        PdfRenderer pdfRenderer2;
        ParcelFileDescriptor parcelFileDescriptor;
        PdfRenderer pdfRenderer3 = fim.a.COROUTINE_SUSPENDED;
        ParcelFileDescriptor parcelFileDescriptorOpen = this.v;
        try {
            if (parcelFileDescriptorOpen == 0) {
                o.b(obj2);
                parcelFileDescriptorOpen = ParcelFileDescriptor.open(new File((String) this.f139387x), 268435456);
                try {
                    pdfRenderer = new PdfRenderer(parcelFileDescriptorOpen);
                } catch (SecurityException e) {
                    cause = e;
                } catch (Throwable th10) {
                    pdfRenderer3 = 0;
                    th = th10;
                }
                try {
                    f0 f0Var = (f0) this.z;
                    this.f139386w = parcelFileDescriptorOpen;
                    this.f139388y = pdfRenderer;
                    this.v = 1;
                    obj2 = f0.a(f0Var, pdfRenderer, this);
                    if (obj2 == pdfRenderer3) {
                        return pdfRenderer3;
                    }
                    pdfRenderer2 = pdfRenderer;
                    parcelFileDescriptor = parcelFileDescriptorOpen;
                } catch (SecurityException e2) {
                    cause = e2;
                    Intrinsics.checkNotNullParameter(cause, "cause");
                    throw new PasswordProtectedDocumentException(cause);
                } catch (Throwable th11) {
                    th = th11;
                    pdfRenderer3 = pdfRenderer;
                    if (pdfRenderer3 != 0) {
                        pdfRenderer3.close();
                    }
                    parcelFileDescriptorOpen.close();
                    throw th;
                }
            } else {
                if (parcelFileDescriptorOpen != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pdfRenderer2 = (PdfRenderer) this.f139388y;
                ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) this.f139386w;
                try {
                    o.b(obj2);
                    parcelFileDescriptor = parcelFileDescriptor2;
                } catch (SecurityException e4) {
                    cause = e4;
                    Intrinsics.checkNotNullParameter(cause, "cause");
                    throw new PasswordProtectedDocumentException(cause);
                }
            }
            String str = (String) obj2;
            if (pdfRenderer2 != null) {
                pdfRenderer2.close();
            }
            parcelFileDescriptor.close();
            return str;
        } catch (Throwable th12) {
            th = th12;
        }
    }

    private final Object o(Object obj2) {
        List list = (List) this.z;
        hyk.a aVar = (hyk.a) this.f139386w;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            BackendFlowOnboardingService backendFlowOnboardingService = aVar.f156881a;
            String str = (String) this.f139387x;
            String strB = eyk.a.b((OnboardingPart) this.f139388y);
            String strK0 = !list.isEmpty() ? d0.k0(list, ",", null, null, 0, null, 62) : null;
            this.v = 1;
            obj2 = backendFlowOnboardingService.getBackendFlowAccountOnboardingPart(str, strB, strK0, this);
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return aVar.f156882b.a((q90.i) obj2);
    }

    private final Object p(Object obj2) {
        hyk.a aVar = (hyk.a) this.f139386w;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            BackendFlowOnboardingService backendFlowOnboardingService = aVar.f156881a;
            String str = (String) this.f139387x;
            String strB = eyk.a.b((OnboardingPart) this.f139388y);
            q90.i iVarB = aVar.f156882b.b((BackendFlow) this.z);
            this.v = 1;
            obj2 = backendFlowOnboardingService.postBackendFlowAccountOnboardingPart(str, strB, iVarB, this);
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return aVar.f156882b.a((q90.i) obj2);
    }

    private final Object s(Object obj2) {
        ArrayList arrayList;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            OnboardingService onboardingService = ((hyk.c) this.f139386w).f156887a;
            String str = (String) this.f139387x;
            OnboardingPart onboardingPart = (OnboardingPart) this.f139388y;
            Intrinsics.checkNotNullParameter(onboardingPart, "<this>");
            String name = onboardingPart.getName();
            List list = (List) this.z;
            if (list != null) {
                List list2 = list;
                arrayList = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((TradingProductCode) it8.next()).getF105337a());
                }
            } else {
                arrayList = null;
            }
            this.v = 1;
            obj2 = onboardingService.getNextTradingAccountOnboardingPart(str, name, arrayList, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return eyk.a.a((fyk.f) obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x015b, code lost:
    
        if (r14 == r8) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016b, code lost:
    
        if (r7.emit(r14, r13) == r8) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x016d, code lost:
    
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0a.e.t(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r4v7, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    /* JADX WARN: Type inference failed for: r5v7, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.q] */
    /* JADX WARN: Type inference failed for: r6v28, types: [gim.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r6v5, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(0, (g) this.f139386w, (String) this.f139387x, (String) this.f139388y, (MessageItem) this.z, continuation);
            case 1:
                e eVar = new e((gim.i) this.z, continuation);
                eVar.f139388y = obj2;
                return eVar;
            case 2:
                return new e((String) this.f139388y, (t) this.z, continuation, 2);
            case 3:
                e eVar2 = new e((p) this.f139387x, (r) this.f139388y, (BankTransferData) this.z, continuation, 3);
                eVar2.f139386w = obj2;
                return eVar2;
            case 4:
                e eVar3 = new e(4, continuation, (e0) this.z);
                eVar3.f139388y = obj2;
                return eVar3;
            case 5:
                return new e((xi0.b) this.f139387x, (g9j.t) this.f139388y, (xi0.b) this.z, continuation, 5);
            case 6:
                return new e((com.revolut.feature.pix.impl.flow.portability_details.a) this.f139386w, (Function1) this.f139387x, (Function0) this.f139388y, (Function1) this.z, continuation);
            case 7:
                e eVar4 = new e((gce.m) this.f139387x, (qua.p) this.f139388y, (List) this.z, continuation, 7);
                eVar4.f139386w = obj2;
                return eVar4;
            case 8:
                return new e(8, (com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c) this.f139386w, (TravelMilesSearchLocation) this.f139387x, (TravelMilesSearchLocation) this.f139388y, (LocalDate) this.z, continuation);
            case 9:
                return new e((com.revolut.feature.apm.wero.impl.ui.pay.b) this.f139388y, (jh2.a) this.z, continuation, 9);
            case 10:
                return new e(10, (com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.d) this.f139386w, (String) this.f139387x, (String) this.f139388y, (String) this.z, continuation);
            case 11:
                return new e(11, (gmj.i) this.f139386w, (String) this.f139387x, (String) this.f139388y, (String) this.z, continuation);
            case 12:
                e eVar5 = new e(12, continuation, (com.revolut.feature.corporate_events.impl.ui.screen.details.a) this.z);
                eVar5.f139388y = obj2;
                return eVar5;
            case 13:
                return new e((gve.b) this.f139386w, (yte.m) this.f139388y, (yte.l) this.z, (String) this.f139387x, continuation);
            case 14:
                return new e(14, (h25.e) this.f139386w, (ou3.o) this.f139387x, (d1) this.f139388y, (r2) this.z, continuation);
            case 15:
                e eVar6 = new e((com.revolut.retail.feature.balance.picker.impl.new_picker.dual.a) this.f139387x, (xi0.b) this.f139388y, (xi0.b) this.z, continuation, 15);
                eVar6.f139386w = obj2;
                return eVar6;
            case 16:
                return new e(16, (s) this.f139386w, (h93.f0) this.f139387x, (PocketWithSubaccount) this.f139388y, (List) this.z, continuation);
            case 17:
                e eVar7 = new e((Map) this.f139387x, (h4k.k) this.f139388y, (BankTransferData) this.z, continuation, 17);
                eVar7.f139386w = obj2;
                return eVar7;
            case 18:
                return new e((h9f.e) this.f139386w, (TransferInPriceUpdateRequest) this.z, (String) this.f139387x, (String) this.f139388y, continuation);
            case 19:
                return new e(19, (x) this.f139386w, (String) this.f139387x, (i93.e) this.f139388y, (dj0.d) this.z, continuation);
            case 20:
                return new e(20, (x) this.f139386w, (String) this.f139387x, (i93.d) this.f139388y, (List) this.z, continuation);
            case 21:
                return new e((l) this.f139386w, (Function1) this.f139387x, (Function0) this.f139388y, (Function2) this.z, continuation);
            case 22:
                e eVar8 = new e((hp5.o) this.f139388y, (ko5.k) this.z, continuation, 22);
                eVar8.f139387x = obj2;
                return eVar8;
            case 23:
                return new e(23, (hve.o) this.f139386w, (String) this.f139387x, (yte.m) this.f139388y, (TopUpMethodsContext) this.z, continuation);
            case 24:
                return new e((String) this.f139387x, (f0) this.z, continuation);
            case 25:
                return new e(25, (hyk.a) this.f139386w, (String) this.f139387x, (OnboardingPart) this.f139388y, (List) this.z, continuation);
            case 26:
                return new e(26, (hyk.a) this.f139386w, (String) this.f139387x, (OnboardingPart) this.f139388y, (BackendFlow) this.z, continuation);
            case 27:
                return new e(27, (hyk.c) this.f139386w, (String) this.f139387x, (OnboardingPart) this.f139388y, (List) this.z, continuation);
            case 28:
                e eVar9 = new e(28, (q) this.f139388y, (Set) this.z, (String) this.f139387x, continuation);
                eVar9.f139386w = obj2;
                return eVar9;
            default:
                e eVar10 = new e(29, (i28.g) this.f139388y, (InvestWidgetContext) this.z, (String) this.f139387x, continuation);
                eVar10.f139386w = obj2;
                return eVar10;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((e) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((e) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((e) create((kp3.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((e) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((e) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((e) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(5:485|(1:(1:(1:(3:490|514|515)(2:491|492))(9:493|529|494|495|506|511|(1:578)|514|515))(1:498))(2:499|(1:576))|527|502|(1:577)(6:505|506|511|(0)|514|515)) */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0b11, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0b12, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:550:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:567:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:578:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v197 */
    /* JADX WARN: Type inference failed for: r0v198 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r15v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r4v30, types: [l17.a] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.revolut.core.ui_kit.models.Style, java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r7v15, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.q] */
    /* JADX WARN: Type inference failed for: r8v12, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r9v7, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0a.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, Object obj2, Object obj3, String str, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f139388y = obj2;
        this.z = obj3;
        this.f139387x = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, Continuation continuation, yji.l lVar) {
        super(2, continuation);
        this.u = i;
        this.z = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(com.revolut.feature.pix.impl.flow.portability_details.a aVar, Function1 function1, Function0 function0, Function1 function12, Continuation continuation) {
        super(2, continuation);
        this.u = 6;
        this.f139386w = aVar;
        this.f139387x = (kotlin.jvm.internal.q) function1;
        this.f139388y = (kotlin.jvm.internal.q) function0;
        this.z = (gim.i) function12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(gve.b bVar, yte.m mVar, yte.l lVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 13;
        this.f139386w = bVar;
        this.f139388y = mVar;
        this.z = lVar;
        this.f139387x = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h9f.e eVar, TransferInPriceUpdateRequest transferInPriceUpdateRequest, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.u = 18;
        this.f139386w = eVar;
        this.z = transferInPriceUpdateRequest;
        this.f139387x = str;
        this.f139388y = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(l lVar, Function1 function1, Function0 function0, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.u = 21;
        this.f139386w = lVar;
        this.f139387x = function1;
        this.f139388y = function0;
        this.z = (gim.i) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f139387x = obj2;
        this.f139388y = obj3;
        this.z = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f139388y = obj2;
        this.z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, f0 f0Var, Continuation continuation) {
        super(2, continuation);
        this.u = 24;
        this.f139387x = str;
        this.z = f0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.z = (gim.i) function1;
    }
}
