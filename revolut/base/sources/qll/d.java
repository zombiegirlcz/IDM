package qll;

import aw0.f4;
import com.revolut.feature.debug_tools.DebugScreenFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.sso.api.models.RevolutAccountSession;
import com.revolut.sso.impl.ui.combined_authentication.unified.CombinedAuthenticationUnifiedScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mx0.f9;
import mx0.g9;
import mx0.h9;
import mx0.i9;
import mx0.j9;
import mx0.k9;
import mx0.l9;
import mx0.m9;
import mx0.n9;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CombinedAuthenticationUnifiedScreen f247583w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CombinedAuthenticationUnifiedScreen combinedAuthenticationUnifiedScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f247583w = combinedAuthenticationUnifiedScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f247583w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f247583w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d(this.f247583w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
            case 3:
                d dVar4 = new d(this.f247583w, continuation, 3);
                dVar4.v = obj2;
                return dVar4;
            default:
                d dVar5 = new d(this.f247583w, continuation, 4);
                dVar5.v = obj2;
                return dVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((RevolutAccountSession) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((d) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((n9) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 19;
        CombinedAuthenticationUnifiedScreen combinedAuthenticationUnifiedScreen = this.f247583w;
        switch (i) {
            case 0:
                RevolutAccountSession session = (RevolutAccountSession) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.sso.impl.ui.combined_authentication.unified.a aVar2 = (com.revolut.sso.impl.ui.combined_authentication.unified.a) combinedAuthenticationUnifiedScreen.R2();
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(session, "session");
                aVar2.C2(new s(session));
                return Unit.f186387a;
            case 1:
                String itemId = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarE3 = combinedAuthenticationUnifiedScreen.R2();
                Intrinsics.h(itemId);
                com.revolut.sso.impl.ui.combined_authentication.unified.a aVar4 = (com.revolut.sso.impl.ui.combined_authentication.unified.a) jVarE3;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("MENU_DEBUG")) {
                    aVar4.A.getClass();
                    aVar4.C1(new BridgeDestination(new FeatureCommand(DebugScreenFeatureConfig.f71623a)));
                } else {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Menu item with id ", itemId, " is not handled"));
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                }
                return Unit.f186387a;
            case 2:
                Boolean bool = (Boolean) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarE32 = combinedAuthenticationUnifiedScreen.R2();
                Intrinsics.h(bool);
                com.revolut.sso.impl.ui.combined_authentication.unified.a aVar6 = (com.revolut.sso.impl.ui.combined_authentication.unified.a) jVarE32;
                if (bool.booleanValue()) {
                    aVar6.H2(aVar6.D, new qce.a(aVar6, ((q) ((j2) aVar6.D.f22677a).getValue()).f247596b, i2));
                } else {
                    aVar6.getClass();
                }
                return Unit.f186387a;
            case 3:
                f4 f4Var = (f4) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.sso.impl.ui.combined_authentication.unified.a aVar8 = (com.revolut.sso.impl.ui.combined_authentication.unified.a) combinedAuthenticationUnifiedScreen.R2();
                if (f4Var.f10304b) {
                    aVar8.I2(((q) ((j2) aVar8.D.f22677a).getValue()).f247597c.f106149a);
                } else {
                    aVar8.getClass();
                }
                return Unit.f186387a;
            default:
                n9 n9Var = (n9) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n9Var instanceof f9) {
                    ((com.revolut.sso.impl.ui.combined_authentication.unified.a) combinedAuthenticationUnifiedScreen.R2()).C2(t.f247602a);
                } else if (n9Var instanceof h9) {
                    com.revolut.sso.impl.ui.combined_authentication.unified.a aVar10 = (com.revolut.sso.impl.ui.combined_authentication.unified.a) combinedAuthenticationUnifiedScreen.R2();
                    aVar10.I2(((q) ((j2) aVar10.D.f22677a).getValue()).f247597c.f106149a);
                } else if (n9Var instanceof k9) {
                    com.revolut.sso.impl.ui.combined_authentication.unified.a aVar11 = (com.revolut.sso.impl.ui.combined_authentication.unified.a) combinedAuthenticationUnifiedScreen.R2();
                    aVar11.H2(aVar11.D, new qce.a(aVar11, ((q) ((j2) aVar11.D.f22677a).getValue()).f247596b, i2));
                } else if (n9Var instanceof i9) {
                    eql.j jVar = (eql.j) ((com.revolut.sso.impl.ui.combined_authentication.unified.a) combinedAuthenticationUnifiedScreen.R2()).f106441y;
                    if (jVar.f128507n.a()) {
                        jVar.f128506m.b(new e58.e(jVar, 27), new eq4.g(jVar, 8));
                    }
                } else if (n9Var instanceof j9) {
                    ((com.revolut.sso.impl.ui.combined_authentication.unified.a) combinedAuthenticationUnifiedScreen.R2()).C2(v.f247604a);
                } else if (n9Var instanceof l9) {
                    ((com.revolut.sso.impl.ui.combined_authentication.unified.a) combinedAuthenticationUnifiedScreen.R2()).C2(w.f247605a);
                } else if (n9Var instanceof g9) {
                    ((com.revolut.sso.impl.ui.combined_authentication.unified.a) combinedAuthenticationUnifiedScreen.R2()).C2(u.f247603a);
                } else {
                    if (!(n9Var instanceof m9)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((com.revolut.sso.impl.ui.combined_authentication.unified.a) combinedAuthenticationUnifiedScreen.R2()).C2(x.f247606a);
                }
                return Unit.f186387a;
        }
    }
}
