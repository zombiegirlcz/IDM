package ack;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.rev_points.giftcards.api.model.UserVoucherDetails;
import com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlowContract$State;
import com.revolut.feature.topup_screen.api.model.CheckoutContext;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.api.userauth.UserAuthFeatureApi$Toggles$RegisteredIdentitySignIn;
import com.revolut.retail.feature.impl.userauth.network.services.UserAuthService;
import eql.c0;
import h93.f0;
import ha3.x;
import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;
import k50.j4;
import kmc.s;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import lv4.b0;
import nel.v0;
import pfm.r;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3181w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f3182x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f3183y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, Serializable serializable, Object obj2, Continuation continuation, boolean z) {
        super(2, continuation);
        this.u = i;
        this.f3183y = serializable;
        this.f3181w = z;
        this.z = obj2;
    }

    private final Object b(Object obj2) {
        twj.f fVar = (twj.f) this.f3182x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            UserAuthService userAuthService = fVar.f275037a;
            wi0.b bVar = (wi0.b) this.f3183y;
            nwj.o oVar = new nwj.o(bVar != null ? bVar.f297794a : null, (String) this.z, this.f3181w);
            this.v = 1;
            obj2 = userAuthService.signInWithAccessToken(oVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return mwj.b.a((nwj.i) obj2, ((jte.d) fVar.d).c(UserAuthFeatureApi$Toggles$RegisteredIdentitySignIn.f99271c));
    }

    private final Object c(Object obj2) {
        boolean z = this.f3181w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            r rVarB = ((lx0.j) ((kbb.c) this.f3182x).f182550c).b((String) (z ? this.f3183y : this.z));
            this.f3181w = z;
            this.v = 1;
            if (nim.a.a(rVarB, this) == aVar) {
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

    private final Object n(Object obj2) {
        vhc.g gVar = (vhc.g) this.f3182x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            Boolean bool = (Boolean) this.f3183y;
            Intrinsics.h(bool);
            FeatureCommand featureCommandB = vhc.g.b((jf0.c) this.z, bool.booleanValue());
            nid.d dVar = gVar.f289467c;
            boolean z = this.f3181w;
            this.v = 1;
            obj2 = dVar.a(featureCommandB, z, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        gVar.f289465a.c((NaviCommand) obj2);
        return Boolean.TRUE;
    }

    private final Object o(Object obj2) {
        w34.b bVar = (w34.b) this.f3182x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            CreditPluginsService creditPluginsService = bVar.f294146b;
            String str = (String) this.f3183y;
            String strName = ((cv3.h) this.z).name();
            boolean z = this.f3181w;
            this.v = 1;
            obj2 = creditPluginsService.getOfferV2Content(str, strName, null, null, null, null, null, null, z, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        t14.p pVar = bVar.f294147c;
        return t14.p.a((t14.o) obj2);
    }

    /* JADX WARN: Type inference failed for: r2v19, types: [gim.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v3, types: [gim.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r6v3, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o((com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.b) this.f3183y, (zm3.l) this.z, this.f3181w, continuation, 0);
                oVar.f3182x = obj2;
                return oVar;
            case 1:
                return new o((bwb.p) this.f3183y, (UserVoucherDetails) this.z, this.f3181w, continuation, 1);
            case 2:
                o oVar2 = new o(this.f3181w, (ejd.k) this.f3183y, (Function2) this.z, continuation);
                oVar2.f3182x = obj2;
                return oVar2;
            case 3:
                return new o((c0) this.f3182x, this.f3181w, (hjl.c) this.f3183y, (Function2) this.z, continuation);
            case 4:
                return new o((com.revolut.feature.topup_screen.impl.mcy.b) this.f3182x, (j71.c) this.f3183y, this.f3181w, (wi0.b) this.z, continuation, 4);
            case 5:
                return new o((x) this.f3182x, (String) this.f3183y, (i93.e) this.z, this.f3181w, continuation, 5);
            case 6:
                return new o((com.revolut.sso.impl.ui.consent.qr.b) this.f3182x, (String) this.f3183y, this.f3181w, (String) this.z, continuation, 6);
            case 7:
                o oVar3 = new o((com.revolut.feature.security_hub.impl.ui.flow.m) this.f3183y, (String) this.z, this.f3181w, continuation, 7);
                oVar3.f3182x = obj2;
                return oVar3;
            case 8:
                return new o((hve.o) this.f3182x, (TopUpMethodsContext) this.f3183y, this.f3181w, (CheckoutContext) this.z, continuation, 8);
            case 9:
                return new o((joe.o) this.f3182x, this.f3181w, (String) this.f3183y, (String) this.z, continuation, 9);
            case 10:
                return new o((String) this.f3182x, this.f3181w, (dj0.d) this.f3183y, (jqj.m) this.z, continuation, 10);
            case 11:
                return new o((j4) this.f3182x, (UUID) this.f3183y, (Integer) this.z, this.f3181w, continuation, 11);
            case 12:
                return new o((s) this.f3182x, (Function1) this.f3183y, (OnboardingFlowContract$State) this.z, this.f3181w, continuation, 12);
            case 13:
                return new o((ldh.m) this.f3182x, (v0) this.f3183y, (bfl.g) this.z, this.f3181w, continuation, 13);
            case 14:
                int i = 14;
                o oVar4 = new o(i, (Ref$BooleanRef) this.f3183y, (b0) this.z, continuation, this.f3181w);
                oVar4.f3182x = obj2;
                return oVar4;
            case 15:
                return new o((m98.p) this.f3182x, this.f3181w, (String) this.f3183y, (b93.b) this.z, continuation, 15);
            case 16:
                return new o((String) this.f3182x, this.f3181w, (dj0.d) this.f3183y, (n8a.s) this.z, continuation, 16);
            case 17:
                return new o((com.revolut.sso.impl.ui.country_selection.b) this.z, continuation);
            case 18:
                o oVar5 = new o((com.revolut.sso.impl.ui.auth.n) this.f3183y, this.f3181w, (Function2) this.z, continuation);
                oVar5.f3182x = obj2;
                return oVar5;
            case 19:
                return new o((pq3.b) this.f3183y, (oq3.c) this.z, this.f3181w, continuation, 19);
            case 20:
                o oVar6 = new o(this.f3181w, (qe0.k) this.f3183y, (qe0.o) this.z, continuation, 20);
                oVar6.f3182x = obj2;
                return oVar6;
            case 21:
                return new o(21, (String) this.f3183y, (qf7.i) this.z, continuation, this.f3181w);
            case 22:
                return new o((com.revolut.feature.tax_residency.impl.screens.tin.c) this.f3182x, (String) this.f3183y, (String) this.z, this.f3181w, continuation, 22);
            case 23:
                return new o((com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) this.f3182x, (s63.g) this.f3183y, (f0) this.z, this.f3181w, continuation, 23);
            case 24:
                return new o((twj.f) this.f3182x, (String) this.f3183y, (String) this.z, this.f3181w, continuation, 24);
            case 25:
                return new o((twj.f) this.f3182x, (wi0.b) this.f3183y, (String) this.z, this.f3181w, continuation, 25);
            case 26:
                o oVar7 = new o((kbb.c) this.f3182x, (String) this.f3183y, (String) this.z, continuation);
                oVar7.f3181w = ((Boolean) obj2).booleanValue();
                return oVar7;
            case 27:
                return new o((vhc.g) this.f3182x, (Boolean) this.f3183y, (jf0.c) this.z, this.f3181w, continuation, 27);
            case 28:
                return new o((w34.b) this.f3182x, (String) this.f3183y, (cv3.h) this.z, this.f3181w, continuation, 28);
            default:
                o oVar8 = new o(this.f3181w, (wid.c) this.f3183y, (Instant) this.z, continuation, 29);
                oVar8.f3182x = obj2;
                return oVar8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((o) create((vl4.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((o) create((jkl.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                return ((o) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:510:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v64, types: [com.revolut.core.ui_kit.models.Style, java.util.List, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r3v11, types: [gim.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r3v12, types: [gim.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r3v25, types: [gim.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x0203 -> B:112:0x0206). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0071 -> B:13:0x0038). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 2692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ack.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(com.revolut.sso.impl.ui.auth.n nVar, boolean z, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.u = 18;
        this.f3183y = nVar;
        this.f3181w = z;
        this.z = (gim.i) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.sso.impl.ui.country_selection.b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = 17;
        this.z = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(c0 c0Var, boolean z, hjl.c cVar, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.u = 3;
        this.f3182x = c0Var;
        this.f3181w = z;
        this.f3183y = cVar;
        this.z = (gim.i) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj2, Object obj3, Object obj4, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f3182x = obj2;
        this.f3183y = obj3;
        this.z = obj4;
        this.f3181w = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj2, Object obj3, boolean z, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f3182x = obj2;
        this.f3183y = obj3;
        this.f3181w = z;
        this.z = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj2, Object obj3, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f3183y = obj2;
        this.z = obj3;
        this.f3181w = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj2, boolean z, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f3182x = obj2;
        this.f3181w = z;
        this.f3183y = obj3;
        this.z = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(kbb.c cVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.u = 26;
        this.f3182x = cVar;
        this.f3183y = str;
        this.z = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(boolean z, ejd.k kVar, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.u = 2;
        this.f3181w = z;
        this.f3183y = kVar;
        this.z = (gim.i) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(boolean z, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f3181w = z;
        this.f3183y = obj2;
        this.z = obj3;
    }
}
