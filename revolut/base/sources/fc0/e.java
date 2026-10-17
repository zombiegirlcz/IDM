package fc0;

import aw0.i3;
import com.revolut.biometric_verification.impl.data.service.BiometricVerificationScansService;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasRegistrationMode;
import com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient;
import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import com.revolut.feature.rev_points.api.widget.rim.RevPointsRimWidgetContext;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import fi7.s;
import gr.n;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import k50.j4;
import klf.p1;
import km2.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kr.b2;
import kr.j1;
import kr.p0;
import kr.r0;
import kr.t;
import kr.t2;
import kr.u0;
import kr.v0;
import kr.w0;
import kr.y0;
import lfg.l;
import ll7.e0;
import lr.m;
import lr.p;
import mjf.k0;
import mn6.j;
import okhttp3.MultipartBody$Part;
import org.joda.time.Instant;
import ulm.e1;
import ulm.o1;
import v20.t0;
import w4l.k;
import yhm.o;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends gim.i implements Function2 {
    public Object A;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f133597w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f133598x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f133599y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i, f fVar, String str, String str2, Map map, Continuation continuation) {
        super(2, continuation);
        this.u = 0;
        this.v = i;
        this.f133599y = fVar;
        this.f133598x = str;
        this.z = str2;
        this.A = map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:
    
        if (r1.emit(r15, r14) == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e2, code lost:
    
        if (r1.emit(od0.i.f224256b, r14) != r2) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fc0.e.b(java.lang.Object):java.lang.Object");
    }

    private final Object c(Object obj2) {
        l lVar;
        hlm.c cVar;
        yfg.h hVar;
        List listV0;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            lVar = (l) this.z;
            hlm.c cVar2 = lVar.f194907b;
            yfg.h hVar2 = (yfg.h) this.A;
            this.f133597w = cVar2;
            this.f133599y = lVar;
            this.f133598x = hVar2;
            this.v = 1;
            if (cVar2.lock(null, this) == aVar) {
                return aVar;
            }
            cVar = cVar2;
            hVar = hVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (yfg.h) this.f133598x;
            lVar = (l) this.f133599y;
            cVar = (hlm.c) this.f133597w;
            o.b(obj2);
        }
        try {
            ue0.c cVar3 = lVar.f194906a;
            l.Companion.getClass();
            Type type = l.f194905c;
            Intrinsics.checkNotNullExpressionValue(type, "<get-TYPE>(...)");
            List list = (List) cVar3.T2("RECENT_LOCATION_SEARCHES_KEY", type);
            if (list == null) {
                listV0 = u.c(hVar);
            } else {
                ArrayList arrayListF1 = d0.f1(list);
                arrayListF1.add(0, hVar);
                listV0 = d0.V0(d0.U(arrayListF1), 10);
            }
            ue0.c cVar4 = lVar.f194906a;
            Intrinsics.checkNotNullExpressionValue(type, "<get-TYPE>(...)");
            cVar4.G(listV0, "RECENT_LOCATION_SEARCHES_KEY", type);
            Unit unit = Unit.f186387a;
            cVar.unlock(null);
            return Unit.f186387a;
        } catch (Throwable th10) {
            cVar.unlock(null);
            throw th10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0083 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f133598x
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r9.f133599y
            ll7.e0 r1 = (ll7.e0) r1
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r9.v
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L33
            if (r3 == r6) goto L2f
            if (r3 == r5) goto L27
            if (r3 != r4) goto L1f
            java.lang.Object r0 = r9.f133597w
            kl7.b r0 = (kl7.b) r0
            yhm.o.b(r10)
            return r0
        L1f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L27:
            java.lang.Object r0 = r9.f133597w
            kl7.b r0 = (kl7.b) r0
            yhm.o.b(r10)
            goto L78
        L2f:
            yhm.o.b(r10)
            goto L52
        L33:
            yhm.o.b(r10)
            com.revolut.feature.insurance_car.impl.data.network.InsuranceCarService r10 = r1.f196609a
            hl7.a0 r3 = new hl7.a0
            java.lang.Object r7 = r9.A
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.util.ArrayList r7 = d8l.d.H(r7)
            java.lang.Object r8 = r9.z
            java.lang.String r8 = (java.lang.String) r8
            r3.<init>(r8, r7)
            r9.v = r6
            java.lang.Object r10 = r10.cancelPolicy(r0, r3, r9)
            if (r10 != r2) goto L52
            goto L82
        L52:
            hl7.j0 r10 = (hl7.j0) r10
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r3)
            kl7.b r3 = new kl7.b
            boolean r6 = r10.f153155a
            hl7.g0 r10 = r10.f153156b
            if (r10 == 0) goto L66
            kl7.a r10 = cj9.c.S(r10)
            goto L67
        L66:
            r10 = 0
        L67:
            r3.<init>(r6, r10)
            if (r6 == 0) goto L84
            r9.f133597w = r3
            r9.v = r5
            java.lang.Object r10 = r1.f(r0, r9)
            if (r10 != r2) goto L77
            goto L82
        L77:
            r0 = r3
        L78:
            r9.f133597w = r0
            r9.v = r4
            java.lang.Object r10 = ll7.v.c(r1, r9)
            if (r10 != r2) goto L83
        L82:
            return r2
        L83:
            return r0
        L84:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fc0.e.n(java.lang.Object):java.lang.Object");
    }

    private final Object o(Object obj2) {
        p pVar = (p) this.A;
        p0 p0Var = (p0) this.f133599y;
        o1 o1Var = p0Var.f188555a;
        ProducerScope producerScope = (ProducerScope) this.f133597w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        try {
            try {
                if (i == 0) {
                    o.b(obj2);
                    MultipartBody$Part.Companion.getClass();
                    MultipartBody$Part multipartBody$PartC = e1.c("scan", null, o1Var);
                    MultipartBody$Part multipartBody$PartB = e1.b("scanInfo", pVar.e.c(kr.d.Companion.serializer(), p0Var.f188556b));
                    BiometricVerificationScansService biometricVerificationScansService = pVar.f199357b;
                    String str = (String) this.f133598x;
                    m mVar = new m(producerScope, 1);
                    this.f133597w = producerScope;
                    this.v = 1;
                    if (biometricVerificationScansService.uploadCompactSelfie(false, str, multipartBody$PartC, multipartBody$PartB, mVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                producerScope.mo3647trySendJP2dKIU(new n((String) this.z, o1Var.f281119j));
            } catch (Exception e) {
                producerScope.mo3647trySendJP2dKIU(new gr.o(o1Var.f281119j, e));
            }
            return Unit.f186387a;
        } finally {
            producerScope.close(null);
        }
    }

    private final Object p(Object obj2) {
        p pVar = (p) this.A;
        r0 r0Var = (r0) this.f133599y;
        o1 o1Var = r0Var.f188568a;
        ProducerScope producerScope = (ProducerScope) this.f133597w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        try {
            try {
                if (i == 0) {
                    o.b(obj2);
                    MultipartBody$Part.Companion.getClass();
                    MultipartBody$Part multipartBody$PartC = e1.c("scan", null, o1Var);
                    MultipartBody$Part multipartBody$PartB = e1.b("scanInfo", pVar.e.c(t.INSTANCE.serializer(), r0Var.f188569b));
                    BiometricVerificationScansService biometricVerificationScansService = pVar.f199357b;
                    String str = (String) this.f133598x;
                    lr.o oVar = new lr.o(producerScope, 0);
                    this.f133597w = producerScope;
                    this.v = 1;
                    if (biometricVerificationScansService.uploadFaceEmbeddings(true, str, multipartBody$PartB, multipartBody$PartC, oVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                producerScope.mo3647trySendJP2dKIU(new n((String) this.z, o1Var.f281119j));
            } catch (Exception e) {
                producerScope.mo3647trySendJP2dKIU(new gr.o(o1Var.f281119j, e));
            }
            return Unit.f186387a;
        } finally {
            producerScope.close(null);
        }
    }

    private final Object s(Object obj2) throws Throwable {
        Throwable th10;
        e eVar;
        Exception exc2;
        p pVar = (p) this.A;
        u0 u0Var = (u0) this.f133599y;
        o1 o1Var = u0Var.f188587a;
        ProducerScope producerScope = (ProducerScope) this.f133597w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        try {
            if (i == 0) {
                o.b(obj2);
                try {
                    MultipartBody$Part.Companion.getClass();
                    MultipartBody$Part multipartBody$PartC = e1.c("scan", null, o1Var);
                    MultipartBody$Part multipartBody$PartB = e1.b("scanInfo", pVar.e.c(j1.Companion.serializer(), u0Var.f188588b));
                    BiometricVerificationScansService biometricVerificationScansService = pVar.f199357b;
                    String str = (String) this.f133598x;
                    lr.o oVar = new lr.o(producerScope, 2);
                    this.f133597w = producerScope;
                    this.v = 1;
                    eVar = this;
                    try {
                        if (biometricVerificationScansService.uploadMedia(str, multipartBody$PartC, multipartBody$PartB, oVar, eVar) == aVar) {
                            return aVar;
                        }
                    } catch (Exception e) {
                        e = e;
                        exc2 = e;
                        producerScope.mo3647trySendJP2dKIU(new gr.o(o1Var.f281119j, exc2));
                    }
                } catch (Exception e2) {
                    e = e2;
                    exc2 = e;
                    producerScope.mo3647trySendJP2dKIU(new gr.o(o1Var.f281119j, exc2));
                } catch (Throwable th11) {
                    th = th11;
                    th10 = th;
                    producerScope.close(null);
                    throw th10;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    o.b(obj2);
                    eVar = this;
                } catch (Exception e4) {
                    exc2 = e4;
                    producerScope.mo3647trySendJP2dKIU(new gr.o(o1Var.f281119j, exc2));
                } catch (Throwable th12) {
                    th10 = th12;
                    producerScope.close(null);
                    throw th10;
                }
            }
            producerScope.mo3647trySendJP2dKIU(new n((String) eVar.z, o1Var.f281119j));
            producerScope.close(null);
            return Unit.f186387a;
        } catch (Throwable th13) {
            th = th13;
        }
    }

    private final Object t(Object obj2) throws Throwable {
        Throwable th10;
        e eVar;
        Exception exc2;
        p pVar = (p) this.A;
        v0 v0Var = (v0) this.f133599y;
        o1 o1Var = v0Var.f188590a;
        ProducerScope producerScope = (ProducerScope) this.f133597w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        try {
            if (i == 0) {
                o.b(obj2);
                try {
                    MultipartBody$Part.Companion.getClass();
                    MultipartBody$Part multipartBody$PartC = e1.c("scan", null, o1Var);
                    MultipartBody$Part multipartBody$PartB = e1.b("scanInfo", pVar.e.c(b2.Companion.serializer(), v0Var.f188591b));
                    BiometricVerificationScansService biometricVerificationScansService = pVar.f199357b;
                    lr.o oVar = new lr.o(producerScope, 3);
                    String str = (String) this.f133598x;
                    this.f133597w = producerScope;
                    this.v = 1;
                    eVar = this;
                    try {
                        if (biometricVerificationScansService.uploadMedia(str, multipartBody$PartC, multipartBody$PartB, oVar, eVar) == aVar) {
                            return aVar;
                        }
                    } catch (Exception e) {
                        e = e;
                        exc2 = e;
                        producerScope.mo3647trySendJP2dKIU(new gr.o(o1Var.f281119j, exc2));
                    }
                } catch (Exception e2) {
                    e = e2;
                    exc2 = e;
                    producerScope.mo3647trySendJP2dKIU(new gr.o(o1Var.f281119j, exc2));
                } catch (Throwable th11) {
                    th = th11;
                    th10 = th;
                    producerScope.close(null);
                    throw th10;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    o.b(obj2);
                    eVar = this;
                } catch (Exception e4) {
                    exc2 = e4;
                    producerScope.mo3647trySendJP2dKIU(new gr.o(o1Var.f281119j, exc2));
                } catch (Throwable th12) {
                    th10 = th12;
                    producerScope.close(null);
                    throw th10;
                }
            }
            producerScope.mo3647trySendJP2dKIU(new n((String) eVar.z, o1Var.f281119j));
            producerScope.close(null);
            return Unit.f186387a;
        } catch (Throwable th13) {
            th = th13;
        }
    }

    private final Object u(Object obj2) {
        p pVar = (p) this.A;
        w0 w0Var = (w0) this.f133599y;
        vw.n nVar = w0Var.f188595a;
        ProducerScope producerScope = (ProducerScope) this.f133597w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        try {
            try {
                if (i == 0) {
                    o.b(obj2);
                    e1 e1Var = MultipartBody$Part.Companion;
                    String str = w0Var.f188596b;
                    e1Var.getClass();
                    MultipartBody$Part multipartBody$PartC = e1.c("scan", str, nVar);
                    MultipartBody$Part multipartBody$PartB = e1.b("scanInfo", pVar.e.c(t2.Companion.serializer(), w0Var.f188597c));
                    BiometricVerificationScansService biometricVerificationScansService = pVar.f199357b;
                    String str2 = (String) this.f133598x;
                    lr.o oVar = new lr.o(producerScope, 4);
                    this.f133597w = producerScope;
                    this.v = 1;
                    if (biometricVerificationScansService.uploadMedia(str2, multipartBody$PartC, multipartBody$PartB, oVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                producerScope.mo3647trySendJP2dKIU(new n((String) this.z, nVar.f292607j.d()));
            } catch (Exception e) {
                producerScope.mo3647trySendJP2dKIU(new gr.o(nVar.f292607j.d(), e));
            }
            return Unit.f186387a;
        } finally {
            producerScope.close(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x017c, code lost:
    
        if (r3.a(r2, r18) != r4) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b8, code lost:
    
        if (mjf.k0.a(r2, r18) != r4) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb A[PHI: r5 r10
      0x00bb: PHI (r5v15 k71.q) = (r5v13 k71.q), (r5v17 k71.q) binds: [B:30:0x00b7, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r10v3 java.lang.Object) = (r10v2 java.lang.Object), (r10v5 java.lang.Object) binds: [B:30:0x00b7, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object v(java.lang.Object r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fc0.e.v(java.lang.Object):java.lang.Object");
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.v, (f) this.f133599y, (String) this.f133598x, (String) this.z, (Map) this.A, continuation);
                eVar.f133597w = obj2;
                return eVar;
            case 1:
                e eVar2 = new e((ga2.d) this.f133599y, (eim.c) this.z, (f5j.a) this.A, (String) this.f133598x, continuation, 1);
                eVar2.f133597w = obj2;
                return eVar2;
            case 2:
                return new e((ArrayList) this.f133597w, (String) this.f133598x, this.v, (ge5.g) this.f133599y, (xi0.b) this.A, (String) this.z, continuation);
            case 3:
                return new e(3, (s) this.f133599y, (jx1.g) this.f133597w, (gw1.e) this.f133598x, (ApmAliasRegistrationMode) this.z, (RegisterAlias$Alias) this.A, continuation);
            case 4:
                return new e(4, (s) this.f133599y, (jx1.g) this.f133597w, (gw1.g) this.f133598x, (Alias) this.z, (Alias) this.A, continuation);
            case 5:
                return new e((hl9.d) this.A, (String) this.z, continuation);
            case 6:
                e eVar3 = new e(6, (hve.o) this.f133599y, (String) this.f133598x, (String) this.z, (TopUpMethodsContext) this.A, continuation);
                eVar3.f133597w = obj2;
                return eVar3;
            case 7:
                e eVar4 = new e(7, (i3) this.f133599y, (i01.b) this.f133598x, (hsa.l) this.z, (a2.a) this.A, continuation);
                eVar4.f133597w = obj2;
                return eVar4;
            case 8:
                e eVar5 = new e((j28.e) this.z, (InvestWidgetContext) this.A, (String) this.f133598x, continuation);
                eVar5.f133597w = obj2;
                return eVar5;
            case 9:
                return new e((iah.h) this.f133599y, (com.revolut.feature.wealth.impl.ui.flows.add_money.composite.a) this.z, (afa.u) this.A, (String) this.f133598x, continuation, 9);
            case 10:
                e eVar6 = new e((jf2.d) this.f133599y, (eim.c) this.z, (UpiTransferFlowContract$Recipient) this.A, (String) this.f133598x, continuation, 10);
                eVar6.f133597w = obj2;
                return eVar6;
            case 11:
                return new e(11, (hha.d) this.f133599y, (com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b) this.f133597w, (hha.d) this.f133598x, (hha.i) this.z, (PricingPlanOffer) this.A, continuation);
            case 12:
                e eVar7 = new e((js7.f) this.f133599y, (wr7.a) this.z, (String) this.f133598x, (k) this.A, continuation, 12);
                eVar7.f133597w = obj2;
                return eVar7;
            case 13:
                e eVar8 = new e((k1c.b) this.z, (String) this.f133598x, (RevPointsRimWidgetContext) this.A, continuation);
                eVar8.f133597w = obj2;
                return eVar8;
            case 14:
                return new e(14, (LocalDate) this.f133599y, (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.c) this.f133597w, (LocalDate) this.f133598x, (Set) this.z, (Set) this.A, continuation);
            case 15:
                return new e(15, (Instant) this.f133599y, (j4) this.f133597w, (v20.n) this.f133598x, (Instant) this.z, (UUID) this.A, continuation);
            case 16:
                return new e((j4) this.f133599y, (List) this.z, (String) this.f133598x, (t0) this.A, continuation, 16);
            case 17:
                e eVar9 = new e((p1) this.A, (String) this.f133598x, (String) this.z, continuation);
                eVar9.f133597w = obj2;
                return eVar9;
            case 18:
                return new e((Map) this.A, (String) this.f133598x, (String) this.z, (r) this.f133597w, (String) this.f133599y, continuation);
            case 19:
                return new e((ks9.s) this.f133598x, (bs9.u) this.z, (PaymentGroup) this.A, continuation);
            case 20:
                e eVar10 = new e(20, (l97.n) this.f133599y, (z87.f) this.f133598x, (aii.r) this.z, (o97.b) this.A, continuation);
                eVar10.f133597w = obj2;
                return eVar10;
            case 21:
                return new e((l) this.z, (yfg.h) this.A, continuation);
            case 22:
                e0 e0Var = (e0) this.f133599y;
                return new e((String) this.f133598x, (String) this.z, (ArrayList) this.A, continuation, e0Var);
            case 23:
                e eVar11 = new e((y0) this.f133599y, (p) this.A, (String) this.f133598x, (String) this.z, continuation, 23);
                eVar11.f133597w = obj2;
                return eVar11;
            case 24:
                e eVar12 = new e((y0) this.f133599y, (p) this.A, (String) this.f133598x, (String) this.z, continuation, 24);
                eVar12.f133597w = obj2;
                return eVar12;
            case 25:
                e eVar13 = new e((y0) this.f133599y, (p) this.A, (String) this.f133598x, (String) this.z, continuation, 25);
                eVar13.f133597w = obj2;
                return eVar13;
            case 26:
                e eVar14 = new e((y0) this.f133599y, (p) this.A, (String) this.f133598x, (String) this.z, continuation, 26);
                eVar14.f133597w = obj2;
                return eVar14;
            case 27:
                e eVar15 = new e((y0) this.f133599y, (p) this.A, (String) this.f133598x, (String) this.z, continuation, 27);
                eVar15.f133597w = obj2;
                return eVar15;
            case 28:
                return new e((Set) this.f133598x, (k0) this.z, continuation);
            default:
                return new e((j) this.f133597w, (ExternalInstitution) this.f133599y, (ho3.a) this.z, (String) this.f133598x, (in6.k) this.A, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:612:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fc0.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f133597w = obj2;
        this.f133599y = serializable;
        this.f133598x = obj3;
        this.z = obj4;
        this.A = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f133599y = obj2;
        this.f133598x = obj3;
        this.z = obj4;
        this.A = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(hl9.d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 5;
        this.A = dVar;
        this.z = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j28.e eVar, InvestWidgetContext investWidgetContext, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 8;
        this.z = eVar;
        this.A = investWidgetContext;
        this.f133598x = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Object obj3, Object obj4, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f133599y = obj2;
        this.z = obj3;
        this.A = obj4;
        this.f133598x = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Object obj3, String str, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f133599y = obj2;
        this.z = obj3;
        this.f133598x = str;
        this.A = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, String str2, ArrayList arrayList, Continuation continuation, e0 e0Var) {
        super(2, continuation);
        this.u = 22;
        this.f133599y = e0Var;
        this.f133598x = str;
        this.A = arrayList;
        this.z = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ArrayList arrayList, String str, int i, ge5.g gVar, xi0.b bVar, String str2, Continuation continuation) {
        super(2, continuation);
        this.u = 2;
        this.f133597w = arrayList;
        this.f133598x = str;
        this.v = i;
        this.f133599y = gVar;
        this.A = bVar;
        this.z = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Map map, String str, String str2, r rVar, String str3, Continuation continuation) {
        super(2, continuation);
        this.u = 18;
        this.A = map;
        this.f133598x = str;
        this.z = str2;
        this.f133597w = rVar;
        this.f133599y = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Set set, k0 k0Var, Continuation continuation) {
        super(2, continuation);
        this.u = 28;
        this.f133598x = set;
        this.z = k0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k1c.b bVar, String str, RevPointsRimWidgetContext revPointsRimWidgetContext, Continuation continuation) {
        super(2, continuation);
        this.u = 13;
        this.z = bVar;
        this.f133598x = str;
        this.A = revPointsRimWidgetContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p1 p1Var, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.u = 17;
        this.A = p1Var;
        this.f133598x = str;
        this.z = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(y0 y0Var, p pVar, String str, String str2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f133599y = y0Var;
        this.A = pVar;
        this.f133598x = str;
        this.z = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ks9.s sVar, bs9.u uVar, PaymentGroup paymentGroup, Continuation continuation) {
        super(2, continuation);
        this.u = 19;
        this.f133598x = sVar;
        this.z = uVar;
        this.A = paymentGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, yfg.h hVar, Continuation continuation) {
        super(2, continuation);
        this.u = 21;
        this.z = lVar;
        this.A = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, ExternalInstitution externalInstitution, ho3.a aVar, String str, in6.k kVar, Continuation continuation) {
        super(2, continuation);
        this.u = 29;
        this.f133597w = jVar;
        this.f133599y = externalInstitution;
        this.z = aVar;
        this.f133598x = str;
        this.A = kVar;
    }
}
