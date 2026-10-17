package v06;

import c1g.v;
import cmi.n;
import com.revolut.data.model.Data;
import com.revolut.data.network.models.externalcards.IssuerInfoDto;
import com.revolut.feature.backgroundpicker.api.model.ChosenBackground;
import com.revolut.feature.backgroundpicker.models.EntityInfo;
import com.revolut.feature.backgroundpicker.models.RetailBackgroundKey;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.junior.account_activation.impl.data.network.JuniorAsyncAccountActivationService;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.paynow.impl.data.network.PayNowQrService;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.topup_screen.api.TopupApi$Toggles;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchQuery;
import e0f.z;
import efm.d0;
import ft3.h1;
import h93.f0;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import jq9.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import le.u1;
import mii.q;
import okhttp3.ResponseBody;
import q97.q2;
import qfm.i2;
import retrofit2.Response;
import tc7.m0;
import te0.w;
import v2e.i0;
import v3e.m;
import v4k.l;
import v6e.r;
import v7e.p;
import v7e.u;
import vch.x0;
import vd4.k;
import ve4.s;
import ved.o;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f284762w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f284763x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f284762w = obj2;
        this.f284763x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i((j) this.f284762w, (String) this.f284763x, continuation, 0);
            case 1:
                i iVar = new i((com.revolut.feature.topup_screen.impl.screens.card_details.b) this.f284763x, continuation, 1);
                iVar.f284762w = obj2;
                return iVar;
            case 2:
                return new i((v24.a) this.f284762w, (h1) this.f284763x, continuation, 2);
            case 3:
                i iVar2 = new i((v25.b) this.f284763x, continuation, 3);
                iVar2.f284762w = obj2;
                return iVar2;
            case 4:
                return new i((i0) this.f284762w, (String) this.f284763x, continuation, 4);
            case 5:
                return new i((v34.a) this.f284762w, (String) this.f284763x, continuation, 5);
            case 6:
                return new i((m) this.f284762w, (String) this.f284763x, continuation, 6);
            case 7:
                return new i((v4a.m) this.f284762w, (t) this.f284763x, continuation, 7);
            case 8:
                return new i((v4a.m) this.f284762w, (WhoToTransferFilter) this.f284763x, continuation, 8);
            case 9:
                return new i((v4a.m) this.f284762w, this.f284763x, continuation, 9);
            case 10:
                return new i((l) this.f284762w, (ty0.a) this.f284763x, continuation, 10);
            case 11:
                return new i((v58.h) this.f284762w, (r58.d) this.f284763x, continuation, 11);
            case 12:
                return new i((v58.h) this.f284762w, (r58.a) this.f284763x, continuation, 12);
            case 13:
                return new i((com.revolut.feature.travel.flights.impl.ui.screen.discover.a) this.f284762w, (FlightSearchQuery) this.f284763x, continuation, 13);
            case 14:
                return new i((v6a.a) this.f284762w, (dj0.d) this.f284763x, continuation, 14);
            case 15:
                return new i((v6e.j) this.f284762w, (String) this.f284763x, continuation, 15);
            case 16:
                return new i((v73.j) this.f284762w, (f0) this.f284763x, continuation, 16);
            case 17:
                i iVar3 = new i((u) this.f284763x, continuation, 17);
                iVar3.f284762w = obj2;
                return iVar3;
            case 18:
                return new i((u) this.f284762w, (v7e.l) this.f284763x, continuation, 18);
            case 19:
                return new i((vkm.d) this.f284762w, (v8g.c) this.f284763x, continuation, 19);
            case 20:
                return new i((vkm.d) this.f284762w, (v8g.d) this.f284763x, continuation, 20);
            case 21:
                return new i((x0) this.f284762w, (dj0.d) this.f284763x, continuation, 21);
            case 22:
                return new i((k) this.f284762w, (String) this.f284763x, continuation, 22);
            case 23:
                return new i((com.revolut.feature.onboarding.selfie.impl.intro.flow.b) this.f284762w, (my8.k) this.f284763x, continuation, 23);
            case 24:
                return new i((s) this.f284762w, (yy3.i) this.f284763x, continuation, 24);
            case 25:
                return new i((com.revolut.feature.passcode_reminder.impl.ui.flow.b) this.f284762w, (String) this.f284763x, continuation, 25);
            case 26:
                return new i((o) this.f284762w, (ty0.a) this.f284763x, continuation, 26);
            case 27:
                i iVar4 = new i((v) this.f284763x, continuation, 27);
                iVar4.f284762w = obj2;
                return iVar4;
            case 28:
                return new i((vg4.d) this.f284762w, (it3.d) this.f284763x, continuation, 28);
            default:
                return new i((vg6.k) this.f284762w, (String) this.f284763x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        Object objAcceptCongratulations;
        Object objGenerateDocument;
        Object obj3;
        Object objActivateJunior;
        Object payNowQr;
        xi0.b bVar;
        Object objB2;
        RetailBackgroundKey subAccountPersonal;
        Object objA;
        Object objA2;
        int i = this.u;
        int i2 = 28;
        int i3 = 2;
        chosenBackground = null;
        ChosenBackground chosenBackground = null;
        Object obj4 = this.f284763x;
        int i5 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                n nVar = ((j) this.f284762w).f284766l;
                this.v = 1;
                Object objQ3 = ((cmi.m) nVar).q3((String) obj4, this);
                return objQ3 == aVar ? aVar : objQ3;
            case 1:
                String bin = (String) this.f284762w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    if (bin == null) {
                        return null;
                    }
                    z zVar = (z) ((com.revolut.feature.topup_screen.impl.screens.card_details.b) obj4).f91092q;
                    zVar.getClass();
                    Intrinsics.checkNotNullParameter(bin, "bin");
                    u21.k kVar = (u21.k) zVar.f121703a;
                    kVar.getClass();
                    Intrinsics.checkNotNullParameter(bin, "bin");
                    d0<IssuerInfoDto> issuer = kVar.f276535a.getIssuer(bin);
                    u21.a aVar3 = new u21.a(4, new u21.b(3));
                    issuer.getClass();
                    pfm.z zVar2 = new pfm.z(new ufm.i(issuer, aVar3, 1), i5, new m0(18), );
                    Intrinsics.checkNotNullExpressionValue(zVar2, "onErrorReturn(...)");
                    d0 d0VarI0 = w.i0(zVar2);
                    if (zVar.f121707h.a(TopupApi$Toggles.ExternalCardsAvailability.f90465c)) {
                        ufm.i iVar = new ufm.i(d0VarI0, new dz7.l(new dz7.k(17), i2), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        d0VarI0 = iVar;
                    }
                    i2 i2VarK = mra.d.K(zi0.c.t(d0VarI0), 2000L, new q2(23));
                    this.f284762w = null;
                    this.v = 1;
                    objB = nim.a.b(i2VarK, this);
                    if (objB == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                return (t61.j) objB;
            case 2:
                v24.a aVar4 = (v24.a) this.f284762w;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    CreditPluginsService creditPluginsService = aVar4.f285642c;
                    String str = ((h1) obj4).f137835a;
                    this.v = 1;
                    objAcceptCongratulations = creditPluginsService.acceptCongratulations(str, this);
                    if (objAcceptCongratulations == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objAcceptCongratulations = obj2;
                }
                return aVar4.f285640a.p((tt3.a) objAcceptCongratulations);
            case 3:
                q qVar = (q) this.f284762w;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    if (qVar instanceof mii.m) {
                        this.f284762w = null;
                        this.v = 1;
                        if (((v25.b) obj4).invoke(this) == aVar6) {
                            return aVar6;
                        }
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                lg0.a aVar8 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX1 = lg0.b.x1(((i0) this.f284762w).f285708t, (String) obj4, aVar8, null, this, 4);
                return objX1 == aVar7 ? aVar7 : objX1;
            case 5:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objGenerateDocument = ((v34.a) this.f284762w).f285851a.generateDocument("application/json", (String) obj4, this);
                    if (objGenerateDocument == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objGenerateDocument = obj2;
                }
                Object objBody = ((Response) objGenerateDocument).body();
                if (objBody != null) {
                    return ((ResponseBody) objBody).string();
                }
                throw new IllegalArgumentException("Required value was null.");
            case 6:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    lg0.a aVar11 = lg0.a.IGNORE;
                    this.v = 1;
                    if (lg0.b.x1(((m) this.f284762w).f285904c, (String) obj4, aVar11, null, this, 4) == aVar10) {
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
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 != 0) {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                v4a.m mVar = (v4a.m) this.f284762w;
                tw9.h hVar = new tw9.h(mVar, (t) obj4, , i2);
                this.v = 1;
                Object objB3 = pu7.a.B(mVar.k, "handleSelection", hVar, this);
                return objB3 == aVar12 ? aVar12 : objB3;
            case 8:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 != 0) {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                v4a.m mVar2 = (v4a.m) this.f284762w;
                mcg.j jVar = new mcg.j(mVar2, (WhoToTransferFilter) obj4, , 14);
                this.v = 1;
                Object objB4 = pu7.a.B(mVar2.k, "onFilterSelected", jVar, this);
                return objB4 == aVar13 ? aVar13 : objB4;
            case 9:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 != 0) {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                v4a.m mVar3 = (v4a.m) this.f284762w;
                mcg.j jVar2 = new mcg.j(obj4, mVar3, , 15);
                this.v = 1;
                Object objB5 = pu7.a.B(mVar3.k, "onRowInfoClicked", jVar2, this);
                return objB5 == aVar14 ? aVar14 : objB5;
            case 10:
                l lVar = (l) this.f284762w;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    be5.e eVar = lVar.f286136q;
                    this.v = 1;
                    eVar.getClass();
                    if (aVar15 == null) {
                        return aVar15;
                    }
                    obj3 = null;
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    obj3 = obj2;
                }
                aii.u uVar = (aii.u) obj3;
                if (uVar != null) {
                    return lVar.A2(uVar);
                }
                return null;
            case 11:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    ao.h hVar2 = ((v58.h) this.f284762w).f;
                    r58.d dVar = (r58.d) obj4;
                    Intrinsics.checkNotNullParameter(dVar, "<this>");
                    d0 d0VarK = hVar2.k(new u58.e(dVar.f251546a));
                    this.v = 1;
                    if (nim.a.b(d0VarK, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    JuniorAsyncAccountActivationService juniorAsyncAccountActivationService = ((v58.h) this.f284762w).f286166b;
                    wj0.b bVar2 = new wj0.b("JUNIOR_ACCOUNT_ACTIVATION_TAG");
                    r58.a aVar18 = (r58.a) obj4;
                    String str2 = aVar18.f251536a;
                    Intrinsics.checkNotNullParameter(aVar18, "<this>");
                    String str3 = aVar18.f251537b;
                    String str4 = aVar18.f251538c;
                    LocalDate localDate = aVar18.d;
                    ?? r122 = localDate != null ? localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) : 0;
                    String str5 = aVar18.e;
                    kf8.b bVar3 = aVar18.f251539g;
                    kf8.b.Companion.getClass();
                    String strG = u1.g(bVar3, kf8.b.mapping);
                    bj0.b bVar4 = aVar18.f;
                    bj0.b.Companion.getClass();
                    u58.c cVar = new u58.c(str3, str4, r122, str5, strG, u1.g(bVar4, bj0.b.mapping));
                    this.v = 1;
                    objActivateJunior = juniorAsyncAccountActivationService.activateJunior(bVar2, str2, cVar, this);
                    if (objActivateJunior == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objActivateJunior = obj2;
                }
                pi8.d dVar2 = (pi8.d) objActivateJunior;
                Intrinsics.checkNotNullParameter(dVar2, "<this>");
                return new pi8.a(dVar2.f236461a);
            case 13:
                com.revolut.feature.travel.flights.impl.ui.screen.discover.a aVar19 = (com.revolut.feature.travel.flights.impl.ui.screen.discover.a) this.f284762w;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    h4g.k kVar2 = aVar19.o;
                    this.v = 1;
                    if (kVar2.f149371a.b(this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar19.C2(new v5g.e((FlightSearchQuery) obj4));
                return Unit.f186387a;
            case 14:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    PayNowQrService payNowQrService = ((v6a.a) this.f284762w).f286346a;
                    dj0.d dVar3 = (dj0.d) obj4;
                    u6a.a aVar22 = new u6a.a(dVar3 != null ? mo3.a.p(dVar3) : null);
                    this.v = 1;
                    payNowQr = payNowQrService.getPayNowQr(aVar22, this);
                    if (payNowQr == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    payNowQr = obj2;
                }
                u6a.b bVar5 = (u6a.b) payNowQr;
                Intrinsics.checkNotNullParameter(bVar5, "<this>");
                return new y6a.a(bVar5.getEncodedValue(), bVar5.getReference(), bVar5.getVpa(), bVar5.getCompanyName());
            case 15:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 != 0) {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                g6e.g gVar = ((v6e.j) this.f284762w).f286356b;
                this.v = 1;
                Object objD = ((r) gVar).d((String) obj4, this);
                return objD == aVar23 ? aVar23 : objD;
            case 16:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    v73.j jVar3 = (v73.j) this.f284762w;
                    v73.i iVar2 = new v73.i(jVar3, (f0) obj4, , i5);
                    this.v = 1;
                    if (jVar3.Y2(this, iVar2) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                u uVar2 = (u) obj4;
                Data data = (Data) this.f284762w;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    v7e.f fVar = (v7e.f) data.getContent();
                    if (fVar != null && (bVar = fVar.f286587a) != null) {
                        g6e.b bVar6 = uVar2.f286616q;
                        SubaccountType subaccountType = uVar2.f286615p.f89047a;
                        this.f284762w = data;
                        this.v = 1;
                        objB2 = ((s6e.d) bVar6).b(subaccountType, bVar, true, this);
                        if (objB2 == aVar25) {
                            return aVar25;
                        }
                    }
                    v73.c cVar2 = new v73.c(data, chosenBackground, i3);
                    p pVar = u.Companion;
                    uVar2.x2(cVar2);
                    return Unit.f186387a;
                }
                if (i105 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                objB2 = obj2;
                chosenBackground = (ChosenBackground) objB2;
                v73.c cVar22 = new v73.c(data, chosenBackground, i3);
                p pVar2 = u.Companion;
                uVar2.x2(cVar22);
                return Unit.f186387a;
            case 18:
                u uVar3 = (u) this.f284762w;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    g6e.b bVar7 = uVar3.f286616q;
                    String str6 = ((v7e.l) obj4).f286599a;
                    SubaccountType subaccountType2 = uVar3.f286615p.f89047a;
                    v7e.f fVar2 = (v7e.f) ((v7e.g) uVar3.t2()).e.getContent();
                    xi0.b bVar8 = fVar2 != null ? fVar2.f286587a : null;
                    this.v = 1;
                    s6e.d dVar4 = (s6e.d) bVar7;
                    dVar4.getClass();
                    EntityInfo entityInfo = new EntityInfo(com.revolut.feature.subaccount.api.models.a.a(subaccountType2), null, md6.d.DISCOVERY, 2);
                    if (subaccountType2.equals(SubaccountType.Personal.f88963a) || subaccountType2.equals(SubaccountType.Pro.f88964a) || subaccountType2.equals(SubaccountType.ProTax.f88965a) || (subaccountType2 instanceof SubaccountType.Joint) || (subaccountType2 instanceof SubaccountType.Junior) || (subaccountType2 instanceof SubaccountType.Teen)) {
                        subAccountPersonal = new RetailBackgroundKey.SubAccountPersonal(str6, bVar8, entityInfo);
                    } else {
                        if (!subaccountType2.equals(SubaccountType.Group.f88960a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        subAccountPersonal = new RetailBackgroundKey.SubAccountGroup(str6, bVar8, entityInfo);
                    }
                    objA = dVar4.a(subAccountPersonal, this);
                    if (objA == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA = obj2;
                }
                t8e.e eVar2 = new t8e.e((ChosenBackground) objA, 1);
                p pVar3 = u.Companion;
                uVar3.x2(eVar2);
                return Unit.f186387a;
            case 19:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((vkm.d) this.f284762w).collect((v8g.c) obj4, this) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((vkm.d) this.f284762w).collect((v8g.d) obj4, this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 != 0) {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                x0 x0Var = (x0) this.f284762w;
                vc2.s sVar = new vc2.s(x0Var, (dj0.d) obj4, , i5);
                this.v = 1;
                Object objP2 = x0Var.p2(this, sVar);
                return objP2 == aVar29 ? aVar29 : objP2;
            case 22:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 != 0) {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                k kVar3 = (k) this.f284762w;
                vd4.j jVar4 = new vd4.j(kVar3, (String) obj4, null);
                this.v = 1;
                Object objB6 = pu7.a.B(kVar3.k, "unlock and validate document", jVar4, this);
                return objB6 == aVar30 ? aVar30 : objB6;
            case 23:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 != 0) {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.onboarding.selfie.impl.intro.flow.b bVar9 = (com.revolut.feature.onboarding.selfie.impl.intro.flow.b) this.f284762w;
                com.revolut.feature.onboarding.selfie.impl.intro.flow.a aVar32 = new com.revolut.feature.onboarding.selfie.impl.intro.flow.a(bVar9, (my8.k) obj4, null);
                this.v = 1;
                Object objB7 = pu7.a.B(bVar9.k, "accept-consent", aVar32, this);
                return objB7 == aVar31 ? aVar31 : objB7;
            case 24:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 != 0) {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                s sVar2 = (s) this.f284762w;
                vc2.s sVar3 = new vc2.s(sVar2, (yy3.i) obj4, , 8);
                this.v = 1;
                Object objB8 = pu7.a.B(sVar2.k, "startSigningProcess", sVar3, this);
                return objB8 == aVar33 ? aVar33 : objB8;
            case 25:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 != 0) {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.passcode_reminder.impl.ui.flow.b bVar10 = (com.revolut.feature.passcode_reminder.impl.ui.flow.b) this.f284762w;
                com.revolut.feature.passcode_reminder.impl.ui.flow.a aVar35 = new com.revolut.feature.passcode_reminder.impl.ui.flow.a(bVar10, (String) obj4, null);
                this.v = 1;
                Object objB9 = pu7.a.B(bVar10.k, "handlePasscodeReminderEnteredPasscode", aVar35, this);
                return objB9 == aVar34 ? aVar34 : objB9;
            case 26:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 != 0) {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                o oVar = (o) this.f284762w;
                mcg.j jVar5 = new mcg.j(oVar, (ty0.a) obj4, , 16);
                this.v = 1;
                Object objB10 = pu7.a.B(oVar.k, "onClauseClick", jVar5, this);
                return objB10 == aVar36 ? aVar36 : objB10;
            case 27:
                FlowCollector flowCollector = (FlowCollector) this.f284762w;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    vfg.g gVar2 = (vfg.g) ((v) obj4).f20513b;
                    this.f284762w = flowCollector;
                    this.v = 1;
                    objA2 = gVar2.a(this);
                    if (objA2 == aVar37) {
                        return aVar37;
                    }
                } else {
                    if (i115 != 1) {
                        if (i115 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objA2 = obj2;
                }
                Data data2 = new Data(((Boolean) objA2).booleanValue() ? new b39.a(b39.d.MILES) : b39.b.f12015a, null, false, 6, null);
                this.f284762w = null;
                this.v = 2;
                if (flowCollector.emit(data2, this) == aVar37) {
                    return aVar37;
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    vg4.d dVar5 = (vg4.d) this.f284762w;
                    vc2.s sVar4 = new vc2.s(dVar5, (it3.d) obj4, , 9);
                    this.v = 1;
                    if (dVar5.p2(this, sVar4) == aVar38) {
                        return aVar38;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 != 0) {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                vg6.k kVar4 = (vg6.k) this.f284762w;
                vg6.e eVar3 = new vg6.e(kVar4, (String) obj4, null);
                this.v = 1;
                Object objP22 = kVar4.p2(this, eVar3);
                return objP22 == aVar39 ? aVar39 : objP22;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f284763x = obj2;
    }
}
