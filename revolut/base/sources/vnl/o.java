package vnl;

import android.app.Activity;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.chat.domain.model.draft.DraftRoutingKey;
import com.revolut.data.model.Data;
import com.revolut.device_fingerprint.api.DeviceFingerprintApi$Toggles$DeviceFingerprintSubmissionEnabled;
import com.revolut.feature.apm.core.impl.data.network.payment_authorisations.ApmPaymentAuthorisationsService;
import com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatusTerms;
import com.revolut.feature.freelancer.api.terms.FreelancerTerms;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.staking.impl.flow.stake.v2.StakingControllerContract$Step;
import com.revolut.feature.terms.api.model.Terms;
import cu8.k1;
import dx4.a1;
import dz1.c;
import efm.d0;
import ht3.b0;
import ht3.l0;
import ht3.x;
import java.net.URI;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty;
import kotlin.text.a0;
import kotlin.time.TimeMark;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import t14.b;
import t14.e;
import t14.f;
import tnb.g0;
import vkm.z1;
import vrl.i0;
import vrl.y0;
import vv8.q;
import vy5.c0;
import vy5.w;
import vyi.r;
import vzk.u;
import zh9.u0;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f290828w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f290829x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f290828w = obj2;
        this.f290829x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o((p) this.f290829x, continuation, 0);
                oVar.f290828w = obj2;
                return oVar;
            case 1:
                return new o((com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a) this.f290828w, (wi0.b) this.f290829x, continuation, 1);
            case 2:
                return new o((com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a) this.f290828w, (ty0.a) this.f290829x, continuation, 2);
            case 3:
                return new o((y0) this.f290828w, (String) this.f290829x, continuation, 3);
            case 4:
                o oVar2 = new o((vsd.c) this.f290829x, continuation, 4);
                oVar2.f290828w = obj2;
                return oVar2;
            case 5:
                return new o((vu1.h) this.f290828w, (ApmOnboardingStatusTerms) this.f290829x, continuation, 5);
            case 6:
                return new o((vu1.h) this.f290828w, (Terms) this.f290829x, continuation, 6);
            case 7:
                o oVar3 = new o((vu1.h) this.f290829x, continuation, 7);
                oVar3.f290828w = obj2;
                return oVar3;
            case 8:
                return new o((com.revolut.feature.staking.impl.flow.stake.v2.a) this.f290828w, (StakingControllerContract$Step) this.f290829x, continuation, 8);
            case 9:
                return new o((Ref$ObjectRef) this.f290828w, (vv.d) this.f290829x, continuation, 9);
            case 10:
                return new o((q) this.f290828w, (t3i.f) this.f290829x, continuation, 10);
            case 11:
                return new o((q) this.f290828w, (t3i.h) this.f290829x, continuation, 11);
            case 12:
                return new o((com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.d) this.f290828w, (LocationDomain) this.f290829x, continuation, 12);
            case 13:
                o oVar4 = new o((vwf.a) this.f290829x, continuation, 13);
                oVar4.f290828w = obj2;
                return oVar4;
            case 14:
                return new o((vx9.c) this.f290828w, (List) this.f290829x, continuation, 14);
            case 15:
                return new o((w) this.f290828w, (vy5.k) this.f290829x, continuation, 15);
            case 16:
                o oVar5 = new o((cc7.l) this.f290829x, continuation, 16);
                oVar5.f290828w = obj2;
                return oVar5;
            case 17:
                return new o((oq.e) this.f290828w, (vy8.b) this.f290829x, continuation, 17);
            case 18:
                return new o((r) this.f290828w, (String) this.f290829x, continuation, 18);
            case 19:
                return new o((vz1.g) this.f290828w, (j02.m) this.f290829x, continuation, 19);
            case 20:
                o oVar6 = new o((u) this.f290829x, continuation, 20);
                oVar6.f290828w = obj2;
                return oVar6;
            case 21:
                return new o((w07.n) this.f290828w, (FreelancerTerms) this.f290829x, continuation, 21);
            case 22:
                o oVar7 = new o((w20.e) this.f290829x, continuation, 22);
                oVar7.f290828w = obj2;
                return oVar7;
            case 23:
                return new o((w31.e) this.f290829x, continuation, 23);
            case 24:
                return new o((w34.b) this.f290828w, (String) this.f290829x, continuation, 24);
            case 25:
                return new o((com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.flow.b) this.f290828w, (t36.c) this.f290829x, continuation, 25);
            case 26:
                o oVar8 = new o((w38.e) this.f290829x, continuation, 26);
                oVar8.f290828w = obj2;
                return oVar8;
            case 27:
                o oVar9 = new o((w38.m) this.f290829x, continuation, 27);
                oVar9.f290828w = obj2;
                return oVar9;
            case 28:
                return new o((com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c) this.f290828w, (s8k.b) this.f290829x, continuation, 28);
            default:
                return new o((com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c) this.f290828w, (s8k.c) this.f290829x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3;
        Object objB;
        Object objI;
        Object objEmit;
        Object objZ2;
        dz1.h eVar;
        Object objCreatePaymentAuthorisations;
        Object objI2;
        TimeMark timeMarkA;
        Object obj4;
        Object offerV2Intro;
        cv3.h hVar;
        Object bVar;
        cv3.i iVar;
        cv3.h hVar2;
        cv3.e eVar2;
        l0 oVar;
        String offerType;
        Object objN;
        int i = this.u;
        int i2 = 17;
        int i3 = 0;
        Object obj5 = this.f290829x;
        int i5 = 1;
        switch (i) {
            case 0:
                String str = (String) this.f290828w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    z1 z1Var = ((p) obj5).f290831m;
                    this.f290828w = null;
                    this.v = 1;
                    if (z1Var.emit(str, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a aVar3 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a) this.f290828w;
                vq5.q qVar = new vq5.q(aVar3, (wi0.b) obj5, null);
                this.v = 1;
                Object objP2 = aVar3.p2(this, qVar);
                return objP2 == aVar2 ? aVar2 : objP2;
            case 2:
                com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a aVar4 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a) this.f290828w;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    be5.e eVar3 = aVar4.A;
                    this.v = 1;
                    eVar3.getClass();
                    if (aVar5 == null) {
                        return aVar5;
                    }
                    obj3 = null;
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    obj3 = obj2;
                }
                aii.u uVar = (aii.u) obj3;
                if (uVar != null) {
                    return aVar4.C1(uVar);
                }
                return null;
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    vrl.g gVar = ((y0) this.f290828w).f291691b;
                    this.v = 1;
                    if (((vrl.m) gVar).h((String) obj5, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                FlowCollector flowCollector = (FlowCollector) this.f290828w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((vsd.c) obj5).e.a("ACCOUNT.linked_account"));
                    this.f290828w = null;
                    this.v = 1;
                    if (flowCollector.emit(boolValueOf, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                vu1.h hVar3 = (vu1.h) this.f290828w;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    eu1.a aVar9 = hVar3.o;
                    ArrayList scopes = ((ApmOnboardingStatusTerms) obj5).f61979c;
                    eu1.h hVar4 = (eu1.h) aVar9;
                    hVar4.getClass();
                    Intrinsics.checkNotNullParameter(scopes, "scopes");
                    d0 d0VarH = pre.c.h(hVar4.f129470b, null, scopes, 5);
                    this.v = 1;
                    objB = nim.a.b(d0VarH, this);
                    if (objB == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                hVar3.H2(hVar3.f292200q, new v77.a((List) objB, 7));
                return Unit.f186387a;
            case 6:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    eu1.a aVar11 = ((vu1.h) this.f290828w).o;
                    String termsId = ((Terms) obj5).f90355a;
                    eu1.h hVar5 = (eu1.h) aVar11;
                    hVar5.getClass();
                    Intrinsics.checkNotNullParameter(termsId, "termsId");
                    pfm.r rVarB = pre.c.b(hVar5.f129470b, termsId);
                    this.v = 1;
                    if (nim.a.a(rVarB, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                CoroutineScope coroutineScope = (CoroutineScope) this.f290828w;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    vu1.h hVar6 = (vu1.h) obj5;
                    vu1.g gVar2 = new vu1.g(hVar6, coroutineScope, null);
                    this.f290828w = null;
                    this.v = 1;
                    if (u0.b0(hVar6.X(), "SIGN_TERMS_BUTTON_LOADING_TAG", gVar2, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.staking.impl.flow.stake.v2.a aVar14 = (com.revolut.feature.staking.impl.flow.stake.v2.a) this.f290828w;
                    th5.b bVar2 = aVar14.f88136q;
                    ec5.i iVar2 = ec5.i.CRYPTO_STAKING;
                    vqd.b bVar3 = new vqd.b(aVar14, (StakingControllerContract$Step) obj5, 12);
                    this.v = 1;
                    if (bVar2.Z2(iVar2, bVar3, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f290828w;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    if (Intrinsics.f(ref$ObjectRef.f186409a, vv.e.f292428a)) {
                        kv.p pVar = ((vv.d) obj5).d;
                        this.v = 1;
                        if (pVar.a(this) == aVar15) {
                            return aVar15;
                        }
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                ref$ObjectRef.f186409a = vv.f.f292429a;
                return Unit.f186387a;
            case 10:
                q qVar2 = (q) this.f290828w;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    t3i.f fVar = (t3i.f) obj5;
                    ArrayList arrayList = fVar.f267792a;
                    URI uri2 = fVar.f267793b;
                    av.a aVar17 = av.a.FRONT_VIDEO;
                    t3i.a aVar18 = fVar.f267794c;
                    vv8.p pVar2 = new vv8.p(qVar2, fVar, i3);
                    this.v = 1;
                    if (q.I2(qVar2, arrayList, uri2, aVar17, aVar18, pVar2, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                qVar2.H2(qVar2.f292497s, new i0(23));
                return Unit.f186387a;
            case 11:
                t3i.h hVar7 = (t3i.h) obj5;
                q qVar3 = (q) this.f290828w;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    List listC = zhm.u.c(hVar7.f267796a);
                    URI uri3 = hVar7.f267797b;
                    av.a aVar20 = av.a.SELFIE_VIDEO;
                    t3i.a aVar21 = hVar7.f267798c;
                    vv8.p pVar3 = new vv8.p(qVar3, hVar7, i5);
                    this.v = 1;
                    if (q.I2(qVar3, listC, uri3, aVar20, aVar21, pVar3, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                t3i.m mVar = qVar3.f292494p;
                Activity context = qVar3.f292495q;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                try {
                    mVar.a().deleteFourthlineFiles(context);
                    break;
                } catch (Throwable th10) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                }
                qVar3.H2(qVar3.f292497s, new i0(24));
                return Unit.f186387a;
            case 12:
                com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.d dVar = (com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.d) this.f290828w;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    LocationDomain location = (LocationDomain) obj5;
                    z39.b bVar4 = (z39.b) dVar.f85688p;
                    bVar4.getClass();
                    Intrinsics.checkNotNullParameter(location, "location");
                    rfm.w wVarA = bVar4.f319221b.a(location);
                    this.v = 1;
                    objI = nim.a.i(wVarA, this);
                    if (objI == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objI = obj2;
                }
                x39.a aVar23 = (x39.a) objI;
                String str2 = aVar23 != null ? aVar23.f302714c : null;
                if (str2 == null) {
                    return null;
                }
                dVar.H2(dVar.f85693w, new vb2.r(str2, 19));
                return Unit.f186387a;
            case 13:
                FlowCollector flowCollector2 = (FlowCollector) this.f290828w;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    Data dataP = zi0.c.P(((vwf.a) obj5).f292713b.f92617g, false, null, 3);
                    this.f290828w = null;
                    this.v = 1;
                    if (flowCollector2.emit(dataP, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    lx1.d dVar2 = (lx1.d) ((vx9.c) this.f290828w).f292858c;
                    List list = (List) obj5;
                    Intrinsics.h(list);
                    this.v = 1;
                    e8.r rVar = ((fy1.o) dVar2).d;
                    KProperty[] kPropertyArr = fy1.o.f;
                    if (!((MutableSharedFlow) rVar.b(kPropertyArr[0])).d().isEmpty() || (objEmit = ((MutableSharedFlow) rVar.b(kPropertyArr[0])).emit(list, this)) != aVar25) {
                        objEmit = Unit.f186387a;
                    }
                    if (objEmit == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    w wVar = (w) this.f290828w;
                    vy5.m mVar2 = new vy5.m(wVar, (vy5.k) obj5, null);
                    this.v = 1;
                    if (wVar.Y2(this, mVar2) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                Object obj6 = this.f290828w;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    oqk.k kVar = (oqk.k) ((cc7.l) obj5).o;
                    this.f290828w = null;
                    this.v = 1;
                    if (kVar.b3(obj6, this) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                vy8.b bVar5 = (vy8.b) obj5;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    oq.e eVar4 = (oq.e) this.f290828w;
                    if ((eVar4 instanceof oq.b) || (eVar4 instanceof oq.a)) {
                        fx8.a aVar29 = bVar5.f293260l;
                        this.v = 1;
                        Object objA = aVar29.f138773a.a(this);
                        if (objA != aVar28) {
                            objA = Unit.f186387a;
                        }
                        if (objA == aVar28) {
                            return aVar28;
                        }
                    } else {
                        if (!(eVar4 instanceof oq.d) && !(eVar4 instanceof oq.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fx8.a aVar30 = bVar5.f293260l;
                        this.v = 2;
                        Object objA2 = nim.a.a((pfm.h) ((com.revolut.feature.kyc.impl.b) aVar30.f138773a.f249542a).f77569g.c0(k1.f108851a), this);
                        Object obj7 = objA2;
                        if (objA2 != aVar28) {
                            obj7 = Unit.f186387a;
                        }
                        if (obj7 != aVar28) {
                            obj7 = Unit.f186387a;
                        }
                        if (obj7 == aVar28) {
                            return aVar28;
                        }
                    }
                } else {
                    if (i105 != 1 && i105 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                String str3 = (String) obj5;
                r rVar2 = (r) this.f290828w;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objZ2 = r.z2(rVar2, str3, this);
                    if (objZ2 == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i106 != 1) {
                        if (i106 != 2 && i106 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objZ2 = obj2;
                }
                boolean zBooleanValue = ((Boolean) objZ2).booleanValue();
                if (zBooleanValue) {
                    this.v = 2;
                    if (r.A2(rVar2, str3, this) == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (zBooleanValue) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.v = 3;
                    if (r.y2(rVar2, str3, this) == aVar31) {
                        return aVar31;
                    }
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    ApmPaymentAuthorisationsService apmPaymentAuthorisationsService = ((vz1.g) this.f290828w).f293363a;
                    j02.m mVar3 = (j02.m) obj5;
                    Intrinsics.checkNotNullParameter(mVar3, "<this>");
                    String strName = mVar3.f169924a.name();
                    j02.l lVar = mVar3.f169925b;
                    Intrinsics.checkNotNullParameter(lVar, "<this>");
                    if (lVar instanceof j02.k) {
                        eVar = new dz1.g(((j02.k) lVar).f169923a);
                    } else if (lVar instanceof j02.h) {
                        j02.h hVar8 = (j02.h) lVar;
                        eVar = new dz1.c(new c.a(hVar8.f169919a.f169918a), hVar8.f169920b);
                    } else if (lVar instanceof j02.i) {
                        eVar = new dz1.d(((j02.i) lVar).f169921a);
                    } else {
                        if (!(lVar instanceof j02.j)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        eVar = new dz1.e(((j02.j) lVar).f169922a);
                    }
                    dz1.h hVar9 = eVar;
                    dj0.d dVar3 = mVar3.f169926c;
                    jo3.a aVarP = dVar3 != null ? mo3.a.p(dVar3) : null;
                    String str4 = mVar3.d;
                    String str5 = mVar3.f169927g;
                    LocalDate localDate = mVar3.e;
                    String str6 = localDate != null ? localDate.format(DateTimeFormatter.ISO_LOCAL_DATE) : null;
                    LocalDate localDate2 = mVar3.f;
                    dz1.i iVar3 = new dz1.i(strName, hVar9, aVarP, str4, str5, str6, localDate2 != null ? localDate2.format(DateTimeFormatter.ISO_LOCAL_DATE) : 0);
                    this.v = 1;
                    objCreatePaymentAuthorisations = apmPaymentAuthorisationsService.createPaymentAuthorisations(iVar3, this);
                    if (objCreatePaymentAuthorisations == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objCreatePaymentAuthorisations = obj2;
                }
                return l02.c.a((k02.e) objCreatePaymentAuthorisations);
            case 20:
                Data data = (Data) this.f290828w;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    u uVar2 = (u) obj5;
                    mcg.j jVar = new mcg.j(uVar2, data, , i2);
                    this.f290828w = null;
                    this.v = 1;
                    if (pu7.a.B(uVar2.k, "Trading Onboarding Nationalities", jVar, this) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                w07.n nVar = (w07.n) this.f290828w;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objI2 = w07.n.I2(nVar, (FreelancerTerms) obj5, this);
                    if (objI2 == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objI2 = obj2;
                }
                aii.u uVar3 = (aii.u) objI2;
                if (uVar3 != null) {
                    return nVar.C1(uVar3);
                }
                return null;
            case 22:
                w20.e eVar5 = (w20.e) obj5;
                DraftRoutingKey draftRoutingKey = (DraftRoutingKey) this.f290828w;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    Pair pairC = w20.e.c(draftRoutingKey);
                    String str7 = (String) pairC.f186385a;
                    String str8 = (String) pairC.f186386b;
                    r10.f fVarE = eVar5.e();
                    this.f290828w = draftRoutingKey;
                    this.v = 1;
                    if (DBUtil.performSuspending((RoomDatabase) fVarE.b, false, true, new avj.o(str7, str8, 28), this) == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                eVar5.f293914c.remove(w20.e.b(draftRoutingKey));
                return Unit.f186387a;
            case 23:
                w31.e eVar6 = (w31.e) obj5;
                com.revolut.analytics.tracking.v3.d dVar4 = eVar6.f294138b;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                try {
                    try {
                    } catch (CancellationException e) {
                        ((com.revolut.analytics.tracking.v3.f) dVar4).e(-1L, eo.f.REVOLUT, false);
                        throw e;
                    }
                } catch (Exception e2) {
                    ((com.revolut.analytics.tracking.v3.f) dVar4).f(eo.f.REVOLUT, false);
                    if (!(e2 instanceof CancellationException)) {
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "DeviceFingerprintInteractor", "Device fingerprint publication failed", e2, h0Var2);
                    }
                }
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    if (eVar6.f294139c.a(DeviceFingerprintApi$Toggles$DeviceFingerprintSubmissionEnabled.f60256c)) {
                        return Unit.f186387a;
                    }
                    timeMarkA = eVar6.f294141h.a();
                    z31.c cVar = eVar6.d;
                    this.f290828w = timeMarkA;
                    this.v = 1;
                    Object objA3 = cVar.a(this);
                    obj4 = objA3;
                    if (objA3 == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i111 != 1) {
                        if (i111 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        ((com.revolut.analytics.tracking.v3.f) dVar4).f(eo.f.REVOLUT, true);
                        return Unit.f186387a;
                    }
                    timeMarkA = (TimeMark) this.f290828w;
                    yhm.o.b(obj2);
                    obj4 = ((u31.b) obj2).f276737a;
                }
                Map deviceFingerprint = (Map) obj4;
                ((com.revolut.analytics.tracking.v3.f) dVar4).e(kotlin.time.b.f(timeMarkA.a()), eo.f.REVOLUT, true);
                g0 g0Var = eVar6.e;
                this.f290828w = null;
                this.v = 2;
                com.revolut.analytics.tracking.v3.f fVar2 = (com.revolut.analytics.tracking.v3.f) ((com.revolut.analytics.tracking.v3.d) g0Var.f272384b);
                Intrinsics.checkNotNullParameter(deviceFingerprint, "deviceFingerprint");
                com.revolut.analytics.tracking.v3.f.g(fVar2, AnalyticsProduct.Shared.MobilePlatform.f, null, null, new ni1.a(fVar2, deviceFingerprint, 11), 10);
                if (Unit.f186387a == aVar36) {
                    return aVar36;
                }
                ((com.revolut.analytics.tracking.v3.f) dVar4).f(eo.f.REVOLUT, true);
                return Unit.f186387a;
            case 24:
                w34.b bVar6 = (w34.b) this.f290828w;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    offerV2Intro = bVar6.f294146b.getOfferV2Intro((String) obj5, this);
                    if (offerV2Intro == aVar37) {
                        return aVar37;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    offerV2Intro = obj2;
                }
                t14.b dto = (t14.b) offerV2Intro;
                t14.c cVar2 = bVar6.d;
                Intrinsics.checkNotNullParameter(dto, "dto");
                b.a parameters = dto.getParameters();
                if (parameters == null || (offerType = parameters.getOfferType()) == null) {
                    hVar = null;
                } else {
                    cv3.h[] hVarArrValues = cv3.h.values();
                    int length = hVarArrValues.length;
                    for (int i113 = 0; i113 < length; i113++) {
                        hVar = hVarArrValues[i113];
                        if (!a0.z(hVar.name(), offerType, true)) {
                        }
                    }
                    hVar = null;
                }
                t14.g screen = dto.getIb.b.Screen java.lang.String();
                if (screen != null) {
                    if (screen instanceof t14.e) {
                        t14.e eVar7 = (t14.e) screen;
                        szb.g gVar3 = new szb.g(18);
                        st3.c primaryButton = eVar7.getPrimaryButton();
                        ht3.c cVarA = primaryButton != null ? dr3.a.a(primaryButton, gVar3, ht3.b.ACCENT) : null;
                        st3.c secondaryButton = eVar7.getSecondaryButton();
                        ht3.c cVarA2 = secondaryButton != null ? dr3.a.a(secondaryButton, gVar3, ht3.b.FLAT) : null;
                        if (hVar == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        List items = eVar7.getItems();
                        if (items == null || items.isEmpty()) {
                            ht3.c cVar3 = cVarA;
                            String title = eVar7.getTitle();
                            String description = eVar7.getDescription();
                            ht3.m mVar4 = ht3.n.Companion;
                            String image = eVar7.getImage();
                            if (image == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            mVar4.getClass();
                            oVar = new ht3.o(title, description, null, null, ht3.m.a(image), null, null, cVar3, cVarA2, false, null, 1644);
                        } else {
                            String title2 = eVar7.getTitle();
                            String description2 = eVar7.getDescription();
                            String image2 = eVar7.getImage();
                            ht3.g0 g0Var2 = image2 != null ? new ht3.g0(image2) : null;
                            ArrayList<e.a> arrayListZ = zhm.d0.Z(eVar7.getItems());
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayListZ, 10));
                            for (e.a aVar38 : arrayListZ) {
                                String title3 = aVar38.getTitle();
                                dx4.y0 y0Var = a1.Companion;
                                String icon = aVar38.getIcon();
                                y0Var.getClass();
                                a1 a1VarA = dx4.y0.a(icon);
                                arrayList2.add(new b0(title3, null, a1VarA != null ? new x(a1VarA) : null, null));
                            }
                            st3.d footer = eVar7.getFooter();
                            oVar = new ht3.g(title2, description2, null, null, g0Var2, null, arrayList2, null, footer != null ? dr3.h.a(footer) : null, cVarA, cVarA2, null, 6148);
                        }
                        return new cv3.d(oVar, hVar);
                    }
                    if (!(screen instanceof t14.f)) {
                        if (!(screen instanceof t14.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        t14.d dVar5 = (t14.d) screen;
                        String storyName = dVar5.getStoryName();
                        String storyVariant = dVar5.getStoryVariant();
                        Map substitutionData = dVar5.getSubstitutionData();
                        if (substitutionData == null) {
                            substitutionData = r0.g();
                        }
                        Map map = substitutionData;
                        String nextButtonAction = dVar5.getNextButtonAction();
                        cv3.i[] iVarArrValues = cv3.i.values();
                        int length2 = iVarArrValues.length;
                        while (true) {
                            if (i3 < length2) {
                                iVar = iVarArrValues[i3];
                                if (!a0.z(iVar.name(), nextButtonAction, true)) {
                                    i3++;
                                }
                            } else {
                                iVar = null;
                            }
                        }
                        if (iVar == null) {
                            h0 h0Var3 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "OfferV2DetailsDtoMapper.kt", p.a.p("Can't support ", dVar5.getNextButtonAction(), " for CreditOfferIntroScreenDto.ProductArticle"), null, h0Var3);
                            iVar = cv3.i.UNKNOWN;
                        }
                        cv3.i iVar4 = iVar;
                        if (hVar != null) {
                            return new cv3.c(storyName, storyVariant, map, iVar4, hVar);
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    t14.f fVar3 = (t14.f) screen;
                    String title4 = fVar3.getTitle();
                    String description3 = fVar3.getDescription();
                    List<f.a> items2 = fVar3.getItems();
                    ArrayList arrayList3 = new ArrayList();
                    for (f.a aVar39 : items2) {
                        String offerType2 = aVar39.getOfferType();
                        cv3.h[] hVarArrValues2 = cv3.h.values();
                        int length3 = hVarArrValues2.length;
                        int i114 = 0;
                        while (true) {
                            if (i114 < length3) {
                                hVar2 = hVarArrValues2[i114];
                                if (!a0.z(hVar2.name(), offerType2, true)) {
                                    i114++;
                                }
                            } else {
                                hVar2 = null;
                            }
                        }
                        if (hVar2 == null) {
                            h0 h0Var4 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "OfferV2DetailsDtoMapper.kt", j6.a.q("Unsupported OfferV2CreditTypeSelection.Type: ", aVar39.getOfferType()), null, h0Var4);
                            eVar2 = null;
                        } else {
                            eVar2 = new cv3.e(aVar39.getTitle(), aVar39.getDescription(), hVar2, aVar39.getIcon());
                        }
                        if (eVar2 != null) {
                            arrayList3.add(eVar2);
                        }
                    }
                    bVar = new cv3.f(title4, description3, arrayList3);
                } else {
                    if (hVar == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    bVar = new cv3.b(hVar);
                }
                return bVar;
            case 25:
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.flow.b bVar7 = (com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.flow.b) this.f290828w;
                    com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.flow.a aVar41 = new com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.flow.a(bVar7, (t36.c) obj5, null);
                    this.v = 1;
                    if (bVar7.p2(this, aVar41) == aVar40) {
                        return aVar40;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                FlowCollector flowCollector3 = (FlowCollector) this.f290828w;
                fim.a aVar42 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    this.f290828w = flowCollector3;
                    this.v = 1;
                    if (flowCollector3.emit(w4l.h.f294642c, this) == aVar42) {
                        return aVar42;
                    }
                } else {
                    if (i116 != 1) {
                        if (i116 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                vkm.d dVarB = rd0.e.b(((w38.e) obj5).f294171a.f248320a);
                c0 c0Var = new c0(flowCollector3, 15);
                this.f290828w = null;
                this.v = 2;
                if (dVarB.collect(c0Var, this) == aVar42) {
                    return aVar42;
                }
                return Unit.f186387a;
            case 27:
                w38.m mVar5 = (w38.m) obj5;
                FlowCollector flowCollector4 = (FlowCollector) this.f290828w;
                fim.a aVar43 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    g48.r0 r0Var = mVar5.f294190a;
                    this.f290828w = flowCollector4;
                    this.v = 1;
                    objN = r0Var.n();
                    if (objN == aVar43) {
                        return aVar43;
                    }
                } else {
                    if (i117 != 1) {
                        if (i117 != 2 && i117 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objN = obj2;
                }
                if (((Boolean) objN).booleanValue()) {
                    Flow flowF = ((r38.l) mVar5.f294191b).f(w4l.h.f294642c);
                    this.f290828w = null;
                    this.v = 2;
                    vkm.q.w(flowCollector4);
                    Object objCollect = flowF.collect(new c0(flowCollector4, i2), this);
                    if (objCollect != aVar43) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar43) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar43) {
                        return aVar43;
                    }
                } else {
                    Boolean bool = Boolean.FALSE;
                    this.f290828w = null;
                    this.v = 3;
                    if (flowCollector4.emit(bool, this) == aVar43) {
                        return aVar43;
                    }
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar44 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 != 0) {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c cVar4 = (com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c) this.f290828w;
                s8k.b bVar8 = (s8k.b) obj5;
                bVar8.getClass();
                w3k.f fVar4 = new w3k.f(cVar4, bVar8, null);
                this.v = 1;
                Object objB0 = u0.b0(cVar4.X(), "PEER_TO_PEER_REVIEW_PROCEED_CTA_BUTTON_TAG", fVar4, this);
                return objB0 == aVar44 ? aVar44 : objB0;
            default:
                fim.a aVar45 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 != 0) {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c cVar5 = (com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c) this.f290828w;
                s8k.c cVar6 = (s8k.c) obj5;
                cVar6.getClass();
                w3k.g gVar4 = new w3k.g(cVar5, cVar6, null);
                this.v = 1;
                Object objB02 = u0.b0(cVar5.X(), "PEER_TO_PEER_REVIEW_PROCEED_CTA_BUTTON_TAG", gVar4, this);
                return objB02 == aVar45 ? aVar45 : objB02;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f290829x = obj2;
    }
}
