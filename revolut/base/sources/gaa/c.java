package gaa;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.pix.api.model.PortabilityRequestArgsModel;
import com.revolut.feature.pix.impl.flow.migrate_alias.screens.review.ReviewMigrateAliasScreen;
import g9i.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ReviewMigrateAliasScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ReviewMigrateAliasScreen reviewMigrateAliasScreen, Continuation continuation) {
        super(2, continuation);
        this.v = reviewMigrateAliasScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ?? r06 = this.v.Q;
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (Intrinsics.f(model.f52613a, "REQUEST_MIGRATION_BUTTON_ID")) {
            j jVar = (j) r06.getValue();
            PortabilityRequestArgsModel portabilityRequestArgsModel = jVar.o.f80641b;
            if (portabilityRequestArgsModel instanceof PortabilityRequestArgsModel.DifferentOwnership) {
                jVar.I2(new a76.c(0, jVar.f142126q, d.class, "provideDifferentOwnershipPortabilityResultSuccessConfig", "provideDifferentOwnershipPortabilityResultSuccessConfig()Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration;", 0, 19), new s(1, jVar.f142126q, d.class, "provideDifferentOwnershipPortabilityResultErrorConfig", "provideDifferentOwnershipPortabilityResultErrorConfig(Ljava/lang/Throwable;)Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration$Error;", 0, 1));
            } else {
                if (!(portabilityRequestArgsModel instanceof PortabilityRequestArgsModel.SameOwnership)) {
                    throw new NoWhenBranchMatchedException();
                }
                jVar.I2(new a76.c(0, jVar.f142126q, d.class, "provideSameOwnershipPortabilityResultSuccessConfig", "provideSameOwnershipPortabilityResultSuccessConfig()Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration;", 0, 20), new s(1, jVar.f142126q, d.class, "provideSameOwnershipPortabilityResultErrorConfig", "provideSameOwnershipPortabilityResultErrorConfig(Ljava/lang/Throwable;)Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration$Error;", 0, 2));
            }
        } else {
            j jVar2 = (j) r06.getValue();
            j60.a.v(jVar2.f142125p, false, new g8i.h(jVar2, 1), 1);
        }
        return Unit.f186387a;
    }
}
