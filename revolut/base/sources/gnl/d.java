package gnl;

import com.revolut.feature.debug_tools.DebugScreenFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.sso.impl.domain.models.Identifier;
import com.revolut.sso.impl.ui.identifier_input.IdentifierInputScreen;
import gnl.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ IdentifierInputScreen f145028w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(IdentifierInputScreen identifierInputScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f145028w = identifierInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f145028w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f145028w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            default:
                d dVar3 = new d(this.f145028w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Identifier.Phone phone;
        int i = this.u;
        IdentifierInputScreen identifierInputScreen = this.f145028w;
        switch (i) {
            case 0:
                String itemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarT2 = identifierInputScreen.T2();
                Intrinsics.h(itemId);
                s sVar = (s) mVarT2;
                sVar.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("MENU_DEBUG")) {
                    sVar.u.getClass();
                    sVar.C1(new BridgeDestination(new FeatureCommand(DebugScreenFeatureConfig.f71623a)));
                } else if (itemId.equals("MENU_HELP")) {
                    ((rqk.k) sVar.A).getClass();
                    sVar.C1(new ExternalDestination.Browser("https://help.revolut.com/help/profile-and-plan/log-in-issues/", null));
                } else {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Processing for the menu item with id ", itemId, " is not defined"));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "Revolut SSO", null, illegalArgumentException, h0Var);
                }
                return Unit.f186387a;
            case 1:
                String code = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarT22 = identifierInputScreen.T2();
                Intrinsics.h(code);
                s sVar2 = (s) mVarT22;
                sVar2.getClass();
                Intrinsics.checkNotNullParameter(code, "code");
                StringBuilder sb6 = new StringBuilder();
                int length = code.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt = code.charAt(i2);
                    if (Character.isDigit(cCharAt)) {
                        sb6.append(cCharAt);
                    }
                }
                Integer numM = z.m(sb6.toString());
                if (numM != null) {
                    wi0.b bVarD = sVar2.f145056y.d(numM.intValue());
                    Identifier identifier = ((h) sVar2.t2()).f145029a;
                    boolean z = identifier instanceof Identifier.Phone;
                    if (z) {
                        phone = Identifier.Phone.a((Identifier.Phone) identifier, null, sVar2.z2(bVarD), bVarD, 1);
                    } else if (z) {
                        phone = (Identifier.Phone) new Identifier.Email("");
                    } else {
                        if (!(identifier instanceof Identifier.Email)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        wi0.b bVarY2 = sVar2.y2();
                        phone = new Identifier.Phone(sVar2.z2(bVarY2), "", bVarY2);
                    }
                    sVar2.x2(new p(phone, sVar2, bVarD, 1));
                }
                return Unit.f186387a;
            default:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0m.e.c(identifierInputScreen.m2());
                m mVarT23 = identifierInputScreen.T2();
                String listId = aVar3.f275445a;
                s sVar3 = (s) mVarT23;
                sVar3.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (Intrinsics.f(listId, "LOST_ACCESS")) {
                    sVar3.v2(new j(((h) sVar3.t2()).f145029a));
                } else if (Intrinsics.f(listId, "ALREADY_HAVE_ACCOUNT")) {
                    sVar3.v2(i.a.f145032a);
                }
                return Unit.f186387a;
        }
    }
}
