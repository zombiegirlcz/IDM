package ac8;

import com.revolut.feature.junior_allowance.api.navigation.JuniorAllowanceLaunchMode;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.j1;
import nii.n1;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.junior_allowance.impl.ui.flow.allowance.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.junior_allowance.impl.ui.flow.allowance.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.junior_allowance.impl.ui.flow.allowance.a aVar = this.v;
        yki.i iVar = aVar.f76836y;
        n1 n1Var = (n1) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (n1Var instanceof j1) {
            ty0.a aVar3 = ((j1) n1Var).f216180b;
            if (Intrinsics.f(aVar3.f275445a, "TERMS_AND_CONDITION_CLICK_ID")) {
                Object obj3 = aVar3.d;
                if (obj3 instanceof String) {
                    aVar.C1(new ExternalDestination.Browser((String) obj3, null));
                }
            }
        }
        JuniorAllowanceLaunchMode juniorAllowanceLaunchMode = aVar.o.f76824c;
        if (juniorAllowanceLaunchMode instanceof JuniorAllowanceLaunchMode.AsDestination) {
            oki.h.D2(iVar);
        } else {
            if (!(juniorAllowanceLaunchMode instanceof JuniorAllowanceLaunchMode.AsNaviCommand)) {
                throw new NoWhenBranchMatchedException();
            }
            JuniorAllowanceLaunchMode.AsNaviCommand.NaviCommandMode naviCommandMode = ((JuniorAllowanceLaunchMode.AsNaviCommand) juniorAllowanceLaunchMode).f76817a;
            if (naviCommandMode instanceof JuniorAllowanceLaunchMode.AsNaviCommand.NaviCommandMode.Default) {
                NaviCommand naviCommand = ((JuniorAllowanceLaunchMode.AsNaviCommand.NaviCommandMode.Default) naviCommandMode).f76818a;
                if (naviCommand != null) {
                    aVar.C1(u0.b(naviCommand));
                } else {
                    oki.h.D2(iVar);
                }
            } else {
                if (!(naviCommandMode instanceof JuniorAllowanceLaunchMode.AsNaviCommand.NaviCommandMode.WithRequestCode)) {
                    throw new NoWhenBranchMatchedException();
                }
                oki.h.D2(iVar);
            }
        }
        return Unit.f186387a;
    }
}
