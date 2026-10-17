package ax9;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.flow.permissions.PermissionsFlow;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Explanation;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import zhm.q0;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.payments.profile.impl.ui_kompot.scanner.f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.feature.payments.profile.impl.ui_kompot.scanner.f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.payments.profile.impl.ui_kompot.scanner.f fVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            ufm.c cVarE = fVar.f79663q.e("android.permission.CAMERA");
            this.u = 1;
            objB = nim.a.b(cVarE, this);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            objB = obj2;
        }
        if (!((Boolean) objB).booleanValue()) {
            yji.l.i2(fVar, new PermissionsFlow(q0.c(new Pair("android.permission.CAMERA", new PermissionsFlowContract$Explanation.PromptScreen(new TextLocalisedClause(R.string.camera_access_require, null, null, 14), new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R.string.camera_access_grant, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D019", null, null, null, 30), (TextClause) null, 48)))), null, new auj.o(fVar, 15), 1);
            return Unit.f186387a;
        }
        j2 j2Var = fVar.f79667w;
        Boolean bool = Boolean.TRUE;
        j2Var.getClass();
        j2Var.g(null, bool);
        return Unit.f186387a;
    }
}
