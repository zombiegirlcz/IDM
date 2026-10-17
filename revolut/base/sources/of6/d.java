package of6;

import android.content.Context;
import com.revolut.core.backend_flow.api.navigation.BackendFlowDestination;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.cards.models.card.PocketWithSubaccount;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tax_residency.impl.v2.models.ExemptionReason;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.ui.auth.n;
import ft3.h1;
import gim.i;
import h93.f0;
import io3.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import nii.l1;
import nii.n1;
import oge.f;
import om4.h3;
import om4.r1;
import ot1.p;
import oz1.j;
import p4c.x;
import pkf.h2;
import pol.h;
import pxc.r;
import q43.j0;
import q43.o0;
import q56.s;
import we6.k;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f224742w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f224743x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f224744y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f224742w = obj2;
        this.f224743x = obj3;
        this.f224744y = obj4;
        this.z = obj5;
    }

    private final Object b(Object obj2) {
        n1 n1Var = (n1) this.f224742w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (n1Var instanceof l1) {
            ((com.revolut.sso.impl.ui.phone.enter_phone.a) this.f224744y).C2(new h(this.v, (String) this.f224743x, (wi0.b) this.z));
        }
        return Unit.f186387a;
    }

    private final Object c(Object obj2) {
        com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.a aVar = (com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.a) this.f224742w;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            if (aVar.o.i) {
                jld.h hVar = new jld.h(23, aVar, (Boolean) this.f224744y, (String) this.f224743x, (ExemptionReason) this.z, null);
                this.v = 1;
                if (aVar.p2(this, hVar) == aVar2) {
                    return aVar2;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        aVar.C2(new ppe.c((Boolean) this.f224744y, (String) this.f224743x, (ExemptionReason) this.z, aVar.v.d() != null));
        return Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
    
        if (r1.emit(r0, r9) == r2) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.z
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor r0 = (com.revolut.feature.apm.core.models.recipients.ApmDescriptor) r0
            java.lang.Object r1 = r9.f224742w
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r9.v
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L24
            if (r3 == r5) goto L20
            if (r3 != r4) goto L18
            yhm.o.b(r10)
            goto L77
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            yhm.o.b(r10)
            goto L60
        L24:
            yhm.o.b(r10)
            java.lang.Object r10 = r9.f224743x
            px1.i r10 = (px1.i) r10
            com.revolut.feature.apm.core.contacts.data.network.ApmContactsDiscoveryService r10 = r10.f240561a
            qx1.g r3 = new qx1.g
            java.lang.Object r6 = r9.f224744y
            n02.b r6 = (n02.b) r6
            java.lang.String r6 = r6.a()
            java.util.List r6 = zhm.u.c(r6)
            qx1.h r7 = new qx1.h
            java.lang.String r8 = r0.getF62112a()
            java.lang.String r0 = r0.getF62102a()
            r7.<init>(r8, r0)
            java.util.List r0 = zhm.u.c(r7)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r3.<init>(r6, r0, r7)
            r9.f224742w = r1
            r9.v = r5
            com.revolut.feature.apm.core.contacts.data.network.ApmContactsDiscoveryService$a r0 = com.revolut.feature.apm.core.contacts.data.network.ApmContactsDiscoveryService.INSTANCE
            java.lang.String r0 = "true"
            java.lang.Object r10 = r10.postDiscoverContacts(r3, r0, r9)
            if (r10 != r2) goto L60
            goto L76
        L60:
            qx1.f r10 = (qx1.f) r10
            nx1.w r0 = new nx1.w
            java.lang.String r10 = r10.getJobId()
            r0.<init>(r10)
            r10 = 0
            r9.f224742w = r10
            r9.v = r4
            java.lang.Object r10 = r1.emit(r0, r9)
            if (r10 != r2) goto L77
        L76:
            return r2
        L77:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: of6.d.n(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b6, code lost:
    
        if (r0.emit(r2, r10) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f224742w
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r10.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L22
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L15
            yhm.o.b(r11)
            goto Lb9
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1d:
            yhm.o.b(r11)
            goto La2
        L22:
            yhm.o.b(r11)
            java.lang.Object r11 = r10.f224743x
            px1.i r11 = (px1.i) r11
            com.revolut.feature.apm.core.contacts.data.network.ApmContactsDiscoveryService r11 = r11.f240561a
            java.lang.Object r2 = r10.f224744y
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r7 = zhm.w.t(r2, r6)
            r5.<init>(r7)
            java.util.Iterator r2 = r2.iterator()
        L40:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L54
            java.lang.Object r7 = r2.next()
            n02.b r7 = (n02.b) r7
            java.lang.String r7 = r7.a()
            r5.add(r7)
            goto L40
        L54:
            java.lang.Object r2 = r10.z
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r7 = new java.util.ArrayList
            int r6 = zhm.w.t(r2, r6)
            r7.<init>(r6)
            java.util.Iterator r2 = r2.iterator()
        L67:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L8c
            java.lang.Object r6 = r2.next()
            ox1.c r6 = (ox1.c) r6
            qx1.h r8 = new qx1.h
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor r9 = r6.getDescriptor()
            java.lang.String r9 = r9.getF62112a()
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor r6 = r6.getDescriptor()
            java.lang.String r6 = r6.getF62102a()
            r8.<init>(r9, r6)
            r7.add(r8)
            goto L67
        L8c:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            qx1.g r6 = new qx1.g
            r6.<init>(r5, r7, r2)
            r10.f224742w = r0
            r10.v = r4
            com.revolut.feature.apm.core.contacts.data.network.ApmContactsDiscoveryService$a r2 = com.revolut.feature.apm.core.contacts.data.network.ApmContactsDiscoveryService.INSTANCE
            java.lang.String r2 = "true"
            java.lang.Object r11 = r11.postDiscoverContacts(r6, r2, r10)
            if (r11 != r1) goto La2
            goto Lb8
        La2:
            qx1.f r11 = (qx1.f) r11
            nx1.w r2 = new nx1.w
            java.lang.String r11 = r11.getJobId()
            r2.<init>(r11)
            r11 = 0
            r10.f224742w = r11
            r10.v = r3
            java.lang.Object r11 = r0.emit(r2, r10)
            if (r11 != r1) goto Lb9
        Lb8:
            return r1
        Lb9:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: of6.d.o(java.lang.Object):java.lang.Object");
    }

    private final Object p(Object obj2) {
        r rVar = (r) this.f224742w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            String str = (String) this.f224743x;
            String str2 = (String) this.f224744y;
            HashMap map = ((jf0.c) this.z).d;
            this.v = 1;
            obj2 = rVar.b(str, str2, map, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        BackendFlowDestination backendFlowDestination = (BackendFlowDestination) obj2;
        if (backendFlowDestination == null) {
            return Boolean.FALSE;
        }
        rVar.f240616b.c(new FeatureCommand(new KompotOverlayFeatureConfig(backendFlowDestination, yhi.b.SOLID, (Integer) null, 12)));
        return Boolean.TRUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f224743x
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r6.v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L29
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L15
            yhm.o.b(r7)
            goto L6d
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            java.lang.Object r0 = r6.f224742w
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L27
            goto L4d
        L25:
            r7 = move-exception
            goto L56
        L27:
            r7 = move-exception
            goto L70
        L29:
            yhm.o.b(r7)
            java.lang.Object r7 = r6.f224744y
            q12.f r7 = (q12.f) r7
            java.lang.Object r2 = r6.z
            com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection r2 = (com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection) r2
            r6.f224743x = r5     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L27
            r6.f224742w = r0     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L27
            r6.v = r4     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L27
            boolean r4 = r2 instanceof com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection.Outgoing     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L27
            if (r4 == 0) goto L40
            r7 = r5
            goto L4a
        L40:
            boolean r4 = r2 instanceof com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection.Incoming     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L27
            if (r4 == 0) goto L50
            com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection$Incoming r2 = (com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection.Incoming) r2     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L27
            java.lang.Object r7 = r7.a(r2, r6)     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L27
        L4a:
            if (r7 != r1) goto L4d
            goto L6c
        L4d:
            s02.a r7 = (s02.a) r7     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L27
            goto L60
        L50:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L27
            r7.<init>()     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L27
            throw r7     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L27
        L56:
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r4 = rd0.d.f253311a
            rd0.c r4 = rd0.c.ERROR
            rd0.d.a(r4, r5, r5, r7, r2)
            r7 = r5
        L60:
            r6.f224743x = r5
            r6.f224742w = r5
            r6.v = r3
            java.lang.Object r7 = r0.emit(r7, r6)
            if (r7 != r1) goto L6d
        L6c:
            return r1
        L6d:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L70:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: of6.d.s(java.lang.Object):java.lang.Object");
    }

    private final Object t(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            o0 o0Var = (o0) this.f224742w;
            j0 j0Var = new j0(o0Var, (PocketWithSubaccount) this.f224743x, (f0) this.f224744y, (List) this.z, null);
            this.v = 1;
            if (u0.b0(o0Var.X(), "TAG_CONTINUE_BUTTON", j0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object u(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a aVar2 = (com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a) this.f224742w;
            s sVar = new s(aVar2, (q56.i) this.z, (String) this.f224743x, (String) this.f224744y, null, 1);
            this.v = 1;
            if (u0.b0(aVar2.X(), "DeFiSendAddBeneficiaryScreen_SaveButton_Tag", sVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(0, (e) this.f224742w, (String) this.f224743x, (String) this.f224744y, (k) this.z, continuation);
            case 1:
                d dVar = new d((f) this.f224744y, (ProductAccountDescriptor$Value) this.z, continuation, 1);
                dVar.f224743x = obj2;
                return dVar;
            case 2:
                d dVar2 = new d((oh3.f) this.f224744y, (BalanceWrapper) this.z, continuation, 2);
                dVar2.f224743x = obj2;
                return dVar2;
            case 3:
                d dVar3 = new d((oi0.b) this.f224743x, (Context) this.f224744y, (Set) this.z, continuation, 3);
                dVar3.f224742w = obj2;
                return dVar3;
            case 4:
                d dVar4 = new d((n) this.f224743x, (jkl.i) this.f224744y, (Function2) this.z, continuation);
                dVar4.f224742w = obj2;
                return dVar4;
            case 5:
                return new d((n) this.f224744y, (Challenge) this.z, continuation, 5);
            case 6:
                d dVar5 = new d((Flow) this.f224743x, (gu2.e) this.f224744y, continuation, (n) this.z);
                dVar5.f224742w = obj2;
                return dVar5;
            case 7:
                d dVar6 = new d((r1) this.z, (String) this.f224743x, (String) this.f224744y, continuation);
                dVar6.f224742w = obj2;
                return dVar6;
            case 8:
                d dVar7 = new d((h3) this.f224744y, (String) this.f224743x, (w4l.k) this.z, continuation);
                dVar7.f224742w = obj2;
                return dVar7;
            case 9:
                return new d(9, (io3.d) this.f224742w, (l) this.f224743x, (opf.e) this.f224744y, (CurrencyFilteringPolicy) this.z, continuation);
            case 10:
                return new d(10, (com.revolut.feature.apm.breb.impl.flow.a) this.f224742w, (List) this.f224743x, (p) this.f224744y, (ov1.f) this.z, continuation);
            case 11:
                d dVar8 = new d((j) this.f224744y, (ApmPaymentAuthorisationPaymentMethod) this.z, continuation, 11);
                dVar8.f224743x = obj2;
                return dVar8;
            case 12:
                return new d((p24.p) this.f224743x, (h1) this.f224744y, (ArrayList) this.z, continuation, 12);
            case 13:
                return new d(13, (x) this.f224742w, (String) this.f224743x, (String) this.f224744y, (Function1) this.z, continuation);
            case 14:
                d dVar9 = new d((p5k.k) this.f224743x, (l5k.e) this.f224744y, (nrf.f) this.z, continuation, 14);
                dVar9.f224742w = obj2;
                return dVar9;
            case 15:
                d dVar10 = new d((pbi.b) this.f224744y, (wi0.b) this.z, (String) this.f224743x, continuation);
                dVar10.f224742w = obj2;
                return dVar10;
            case 16:
                d dVar11 = new d((pj3.r) this.f224743x, (hj3.a) this.f224744y, (fj3.f) this.z, continuation, 16);
                dVar11.f224742w = obj2;
                return dVar11;
            case 17:
                d dVar12 = new d((h2) this.z, continuation);
                dVar12.f224744y = obj2;
                return dVar12;
            case 18:
                return new d((pkj.k) this.f224744y, (wi0.b) this.z, continuation, 18);
            case 19:
                return new d((pn2.d) this.f224743x, (mn2.a) this.f224744y, (wn2.d) this.z, continuation, 19);
            case 20:
                return new d(20, (pn2.d) this.f224742w, (mn2.a) this.f224743x, (wn2.d) this.f224744y, (wn2.a) this.z, continuation);
            case 21:
                d dVar13 = new d((com.revolut.sso.impl.ui.phone.enter_phone.a) this.f224744y, (String) this.f224743x, this.v, (wi0.b) this.z, continuation);
                dVar13.f224742w = obj2;
                return dVar13;
            case 22:
                return new d((com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.a) this.f224742w, (Boolean) this.f224744y, (String) this.f224743x, (ExemptionReason) this.z, continuation);
            case 23:
                d dVar14 = new d((px1.i) this.f224743x, (n02.b) this.f224744y, (ApmDescriptor) this.z, continuation, 23);
                dVar14.f224742w = obj2;
                return dVar14;
            case 24:
                d dVar15 = new d((px1.i) this.f224743x, (List) this.f224744y, (List) this.z, continuation, 24);
                dVar15.f224742w = obj2;
                return dVar15;
            case 25:
                return new d(25, (r) this.f224742w, (String) this.f224743x, (String) this.f224744y, (jf0.c) this.z, continuation);
            case 26:
                d dVar16 = new d((q12.f) this.f224744y, (ApmQuoteDirection) this.z, continuation, 26);
                dVar16.f224743x = obj2;
                return dVar16;
            case 27:
                return new d(27, (o0) this.f224742w, (PocketWithSubaccount) this.f224743x, (f0) this.f224744y, (List) this.z, continuation);
            case 28:
                return new d((com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a) this.f224742w, (q56.i) this.z, (String) this.f224743x, (String) this.f224744y, continuation);
            default:
                return new d((com.revolut.feature.onboarding.impl.onboarding.country.screen.a) this.f224743x, (TermsScope) this.f224744y, (wi0.b) this.z, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:600:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v5, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: of6.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a aVar, q56.i iVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.u = 28;
        this.f224742w = aVar;
        this.z = iVar;
        this.f224743x = str;
        this.f224744y = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.a aVar, Boolean bool, String str, ExemptionReason exemptionReason, Continuation continuation) {
        super(2, continuation);
        this.u = 22;
        this.f224742w = aVar;
        this.f224744y = bool;
        this.f224743x = str;
        this.z = exemptionReason;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(n nVar, jkl.i iVar, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.u = 4;
        this.f224743x = nVar;
        this.f224744y = iVar;
        this.z = (i) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.sso.impl.ui.phone.enter_phone.a aVar, String str, int i, wi0.b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = 21;
        this.f224744y = aVar;
        this.f224743x = str;
        this.v = i;
        this.z = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f224743x = obj2;
        this.f224744y = obj3;
        this.z = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f224744y = obj2;
        this.z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Flow flow, gu2.e eVar, Continuation continuation, n nVar) {
        super(2, continuation);
        this.u = 6;
        this.f224743x = flow;
        this.f224744y = eVar;
        this.z = nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r1 r1Var, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.u = 7;
        this.z = r1Var;
        this.f224743x = str;
        this.f224744y = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h3 h3Var, String str, w4l.k kVar, Continuation continuation) {
        super(2, continuation);
        this.u = 8;
        this.f224744y = h3Var;
        this.f224743x = str;
        this.z = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(pbi.b bVar, wi0.b bVar2, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 15;
        this.f224744y = bVar;
        this.z = bVar2;
        this.f224743x = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h2 h2Var, Continuation continuation) {
        super(2, continuation);
        this.u = 17;
        this.z = h2Var;
    }
}
