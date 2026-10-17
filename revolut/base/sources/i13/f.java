package i13;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cards_core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import do3.n;
import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import nii.y0;
import nii.z;
import skm.k0;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_order_new.common.setpin.kompot.a f157531w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.revolut.feature.card_order_new.common.setpin.kompot.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f157531w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f157531w, continuation, 0);
            case 1:
                return new f(this.f157531w, continuation, 1);
            case 2:
                return new f(this.f157531w, continuation, 2);
            case 3:
                return new f(this.f157531w, continuation, 3);
            case 4:
                return new f(this.f157531w, continuation, 4);
            default:
                return new f(this.f157531w, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((f) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.card_order_new.common.setpin.kompot.a aVar2 = this.f157531w;
                if (i == 0) {
                    o.b(obj2);
                    d0 d0VarF = aVar2.f65017q.f(false);
                    this.v = 1;
                    objB = nim.a.b(d0VarF, this);
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
                aVar2.H2(aVar2.f65020t, new a2f.j((n) objB, 9));
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (k0.b(200L, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                com.revolut.feature.card_order_new.common.setpin.kompot.a aVar4 = this.f157531w;
                aVar4.H2(aVar4.f65020t, new i0k.f(9));
                return Unit.f186387a;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (k0.b(400L, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                com.revolut.feature.card_order_new.common.setpin.kompot.a aVar6 = this.f157531w;
                aVar6.H2(aVar6.f65020t, new i0k.f(10));
                return Unit.f186387a;
            case 3:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (k0.b(200L, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                com.revolut.feature.card_order_new.common.setpin.kompot.a aVar8 = this.f157531w;
                aVar8.f65016p.R();
                aVar8.o.getClass();
                return yji.l.a1(aVar8, aVar8.X1(new y0("PIN_MISMATCH_DIALOG_ID", new z(new TextLocalisedClause(R.string.card_pin_change_title_no_match, null, null, 14), null, new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4)), null, null, new f(aVar8, null, 2), 3);
            case 4:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (k0.b(400L, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                com.revolut.feature.card_order_new.common.setpin.kompot.a aVar10 = this.f157531w;
                aVar10.H2(aVar10.f65020t, new i0k.f(12));
                return Unit.f186387a;
            default:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (k0.b(200L, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                com.revolut.feature.card_order_new.common.setpin.kompot.a aVar12 = this.f157531w;
                aVar12.f65016p.R();
                aVar12.o.getClass();
                return yji.l.a1(aVar12, aVar12.X1(new y0("SIMPLE_PIN_MEXICO_DIALOG_ID", new z(new TextLocalisedClause(R.string.pin_weak_alert_title, null, null, 14), new TextLocalisedClause(R$string.pin_weak_alert_error, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new TextLocalisedClause(R$string.card_set_pin_change, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4)), null, null, new f(aVar12, null, 4), 3);
        }
    }
}
