package hu1;

import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.api.product.ApmBlik;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import rp0.g1;
import rp0.k1;

/* JADX INFO: loaded from: classes20.dex */
public final class d0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ e0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, Continuation continuation) {
        super(2, continuation);
        this.v = e0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        e0 e0Var = this.v;
        g1 g1Var = e0Var.C;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        if (i == 0) {
            yhm.o.b(obj2);
            z zVar = new z(e0Var, continuation, 4);
            this.u = 1;
            obj2 = e0Var.p2(this, zVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        c02.d dVar = (c02.d) obj2;
        int i2 = c0.f155511a[dVar.f20101a.ordinal()];
        if (i2 == 1) {
            ((k1) g1Var).d(ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "NUMBER_REGISTERED_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.apm_alias_register_dialog_success_phone, null, null, 14), null, null, null, 60));
            e0Var.x2(new b0(dVar, 0));
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (Intrinsics.f(dVar.f20103c, "KEY_PHONE_ALREADY_IN_USE")) {
                yji.l.a1(e0Var, e0Var.X1(((j12.d) e0Var.D).f(ApmBlik.f61809c.e())), null, null, new x(e0Var, continuation, 2), 3);
            } else {
                ((k1) g1Var).d(ShotDialogDisplayer$Configuration.Companion.d(ShotDialogDisplayer$Configuration.INSTANCE, "NUMBER_NOT_REGISTERED_SHOT_DIALOG_ID", new TextLocalisedClause(R.string.error_generic, null, null, 14), null, 60));
            }
        }
        return Unit.f186387a;
    }
}
