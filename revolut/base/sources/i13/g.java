package i13;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cards_core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import hib.n;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.l0;
import nii.y0;
import skm.k0;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_order_new.common.setpin.kompot.a f157532w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f157533x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(com.revolut.feature.card_order_new.common.setpin.kompot.a aVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f157532w = aVar;
        this.f157533x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f157532w, this.f157533x, continuation, 0);
            default:
                return new g(this.f157532w, this.f157533x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (k0.b(200L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                com.revolut.feature.card_order_new.common.setpin.kompot.a aVar2 = this.f157532w;
                aVar2.f65016p.R();
                aVar2.o.getClass();
                boolean z = false;
                return yji.l.a1(aVar2, aVar2.X1(new y0("SIMPLE_PIN_DIALOG_ID", new l0(new TextLocalisedClause(R.string.pin_weak_alert_title, null, null, 14), new TextLocalisedClause(R.string.pin_weak_alert_message, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, new TextLocalisedClause(R$string.card_set_pin_continue, null, null, 14), new TextLocalisedClause(R$string.card_set_pin_change, null, null, 14), null, false, null, 996), false, 4)), null, null, new hsd.c(aVar2, this.f157533x, z, (Continuation) null, 9), 3);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.card_order_new.common.setpin.kompot.a aVar4 = this.f157532w;
                    n nVar = new n((yji.l) aVar4, (Object) this.f157533x, (Continuation) null, 21);
                    this.v = 1;
                    if (aVar4.p2(this, nVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
