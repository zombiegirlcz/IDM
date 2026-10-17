package gvl;

import com.revolut.trading.orders.ui.screens.schedule.ScheduleSettingsScreen;
import ip0.vd;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ScheduleSettingsScreen f147220w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(ScheduleSettingsScreen scheduleSettingsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f147220w = scheduleSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f147220w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            case 1:
                i iVar2 = new i(this.f147220w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
            default:
                i iVar3 = new i(this.f147220w, continuation, 2);
                iVar3.v = obj2;
                return iVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((vd) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create((LocalDate) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((sel.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ScheduleSettingsScreen scheduleSettingsScreen = this.f147220w;
        switch (i) {
            case 0:
                vd vdVar = (vd) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE3 = scheduleSettingsScreen.e3();
                LocalDate date = vdVar.f166807b;
                oVarE3.getClass();
                Intrinsics.checkNotNullParameter(date, "date");
                oVarE3.f147230p.A(oVarE3.I2(date));
                break;
            case 1:
                LocalDate date2 = (LocalDate) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE32 = scheduleSettingsScreen.e3();
                oVarE32.getClass();
                Intrinsics.checkNotNullParameter(date2, "date");
                j60.a.v(oVarE32.f147230p, false, null, 3);
                oVarE32.H2(oVarE32.getState(), new a15.l(7, date2));
                break;
            default:
                sel.a period = (sel.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE33 = scheduleSettingsScreen.e3();
                oVarE33.getClass();
                Intrinsics.checkNotNullParameter(period, "period");
                j60.a.v(oVarE33.f147230p, false, null, 3);
                oVarE33.H2(oVarE33.getState(), new gmk.j(period, 28));
                break;
        }
        return Unit.f186387a;
    }
}
