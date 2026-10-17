package jfb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.reverywhere.api.model.ReverywhereMiniAppName;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.R$string;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class u0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.retail.reverywhere.impl.web_app.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f173840w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.revolut.feature.retail.reverywhere.impl.web_app.d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f173840w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new u0(this.v, this.f173840w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objD;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.retail.reverywhere.impl.web_app.d dVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            ReverywhereMiniAppName.Companion companion = ReverywhereMiniAppName.INSTANCE;
            String prefixedAppName = dVar.f82936p.getF82922b();
            companion.getClass();
            Intrinsics.checkNotNullParameter(prefixedAppName, "prefixedAppName");
            ReverywhereMiniAppName reverywhereMiniAppNameA = ReverywhereMiniAppName.Companion.a(kotlin.text.d0.v0(prefixedAppName, "REVERYWHERE:", prefixedAppName));
            web.b bVar = dVar.f82939s;
            this.u = 1;
            objD = ((efb.g) bVar).d(reverywhereMiniAppNameA, this.f173840w, this);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            objD = obj2;
        }
        NaviCommand naviCommand = (NaviCommand) objD;
        if (naviCommand == null) {
            dVar.X1(new nii.y0("id_terms_error", new nii.z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4));
            return Unit.f186387a;
        }
        dVar.C1(new BridgeDestination(naviCommand));
        return Unit.f186387a;
    }
}
