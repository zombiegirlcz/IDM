package wk4;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.autopay.ui.screen.set_date.SetDateScreen;
import com.revolut.feature.credit.core.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rp0.t;
import rp0.y;
import wk4.b;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SetDateScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(SetDateScreen setDateScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = setDateScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.v, continuation, 0);
            default:
                return new h(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SetDateScreen setDateScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((m) setDateScreen.T2()).v2(b.a.f298236a);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVar = (m) setDateScreen.T2();
                yk4.a aVar3 = mVar.f298247p;
                j60.a aVar4 = mVar.f298248q;
                boolean z = ((a) mVar.t2()).f298235c;
                int dayOfMonth = oi0.d.Y(((a) mVar.t2()).d).getDayOfMonth();
                Integer num = ((a) mVar.t2()).f298233a;
                if (num == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                boolean z3 = num.intValue() < dayOfMonth;
                int i2 = l.f298246a[((a) mVar.t2()).e.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            mVar.y2();
                        }
                    } else if (z && z3) {
                        aVar4.x(yk4.a.d(aVar3));
                    } else if (z) {
                        aVar4.x(yk4.a.e(aVar3));
                    } else {
                        aVar3.getClass();
                        t tVar = new t(new TextLocalisedClause(R$string.credit_autopay_set_day_direct_debit_might_not_be_active_message_title, null, null, 14), new TextLocalisedClause(R$string.credit_autopay_set_day_direct_debit_might_not_be_active_message_description, null, null, 14), null, 28);
                        LargeActionButtonDelegate.Model modelB = yk4.a.b();
                        int i3 = R$attr.uikit_dp24;
                        yp0.b.l(modelB, i3, i3, 0, 0, null, false, 60);
                        aVar4.x(new y(u.c(modelB), tVar, null, null, null, null, "SET_DATE_BOTTOM_DIALOG_DELEGATES_KEY", null, null, null, 3836));
                    }
                } else if (z && z3) {
                    aVar4.x(yk4.a.d(aVar3));
                } else if (z) {
                    aVar4.x(yk4.a.e(aVar3));
                } else {
                    mVar.y2();
                }
                return Unit.f186387a;
        }
    }
}
