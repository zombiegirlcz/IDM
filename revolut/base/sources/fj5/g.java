package fj5;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.qr.parser.api.R$string;
import com.revolut.kompot.common.flow.permissions.PermissionsFlow;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Explanation;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import yhm.o;
import yji.l;
import zhm.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.crypto.qr.parser.impl.ui.scanner.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.crypto.qr.parser.impl.ui.scanner.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.crypto.qr.parser.impl.ui.scanner.a aVar2 = this.v;
        if (i == 0) {
            o.b(obj2);
            ufm.c cVarE = aVar2.f70903p.e("android.permission.CAMERA");
            this.u = 1;
            objB = nim.a.b(cVarE, this);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objB = obj2;
        }
        if (!((Boolean) objB).booleanValue()) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_qr_code_scanner_camera_access_require, null, null, 14);
            m70.a.c(t0.f186434a);
            l.i2(aVar2, new PermissionsFlow(q0.c(new Pair("android.permission.CAMERA", new PermissionsFlowContract$Explanation.PromptScreen(textLocalisedClause, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.crypto_qr_code_scanner_camera_access_grant, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D019", null, null, null, 30), (TextClause) null, 48)))), null, new fca.d(aVar2, 26), 1);
            return Unit.f186387a;
        }
        j2 j2Var = aVar2.f70905r;
        Boolean bool = Boolean.TRUE;
        j2Var.getClass();
        j2Var.g(null, bool);
        return Unit.f186387a;
    }
}
