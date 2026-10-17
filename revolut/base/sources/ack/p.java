package ack;

import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.plan_gifting.impl.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.b f3184w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f3184w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(this.f3184w, continuation, 0);
            default:
                return new p(this.f3184w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.b bVar = this.f3184w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    obj2 = com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.b.I2(bVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.b.J2(bVar, ((Boolean) obj2).booleanValue());
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.b bVar2 = this.f3184w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    obj2 = com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.b.I2(bVar2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    bVar2.f102496y.d(ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "id_success_shot_dialog", new TextLocalisedClause(R$string.premium_birthday_sharing_success_dialog_title, null, null, 14), null, null, null, 60));
                } else {
                    com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.b.J2(bVar2, false);
                }
                return Unit.f186387a;
        }
    }
}
