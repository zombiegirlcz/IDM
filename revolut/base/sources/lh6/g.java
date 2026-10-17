package lh6;

import cli.y;
import com.revolut.feature.external_accounts.impl.mandate.update_limits.UpdateLimitsMode;
import com.revolut.feature.external_accounts.impl.mandate.update_limits.UpdateLimitsScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import we6.z0;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ UpdateLimitsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(UpdateLimitsScreen updateLimitsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = updateLimitsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            default:
                return new g(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        UpdateLimitsScreen updateLimitsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                updateLimitsScreen.m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.external_accounts.impl.mandate.update_limits.a aVar3 = (com.revolut.feature.external_accounts.impl.mandate.update_limits.a) updateLimitsScreen.R2();
                UpdateLimitsMode updateLimitsMode = aVar3.o.f72468a;
                if (Intrinsics.f(updateLimitsMode, UpdateLimitsMode.ReturnNewLimits.f72465a)) {
                    y yVar = aVar3.f72475t;
                    aVar3.C2(new z0(((h) ((j2) yVar.f22677a).getValue()).f195165a, ((h) ((j2) yVar.f22677a).getValue()).f195166b));
                } else {
                    int i2 = 21;
                    Continuation continuation = null;
                    if (updateLimitsMode instanceof UpdateLimitsMode.UpdateMandate) {
                        aVar3.n2(new l34.a(aVar3, ((UpdateLimitsMode.UpdateMandate) updateLimitsMode).f72466a, continuation, i2), new whi.b(6));
                    } else {
                        if (!(updateLimitsMode instanceof UpdateLimitsMode.UpdateStoredMethodLimits)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar3.n2(new l34.a(aVar3, ((UpdateLimitsMode.UpdateStoredMethodLimits) updateLimitsMode).f72467a, continuation, i2), new whi.b(6));
                    }
                }
                return Unit.f186387a;
        }
    }
}
