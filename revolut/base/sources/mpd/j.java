package mpd;

import cli.y;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.CustomPeriodSelectController;
import ip0.vd;
import ip0.wd;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import mk5.s;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CustomPeriodSelectController f207795w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(CustomPeriodSelectController customPeriodSelectController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f207795w = customPeriodSelectController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f207795w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            default:
                j jVar2 = new j(this.f207795w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((vd) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((wd) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        c field = null;
        CustomPeriodSelectController customPeriodSelectController = this.f207795w;
        switch (i) {
            case 0:
                vd vdVar = (vd) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String str = vdVar.f166806a.f54184a;
                KProperty[] kPropertyArr = CustomPeriodSelectController.S;
                if (Intrinsics.f(str, "custom_period_start_calendar")) {
                    field = c.START_DATE;
                } else if (Intrinsics.f(str, "custom_period_end_calendar")) {
                    field = c.END_DATE;
                }
                if (field != null) {
                    d dVarE3 = customPeriodSelectController.d();
                    LocalDate date = vdVar.f166807b;
                    com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.a aVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.a) dVarE3;
                    aVar2.getClass();
                    Intrinsics.checkNotNullParameter(date, "date");
                    Intrinsics.checkNotNullParameter(field, "field");
                    y yVar = aVar2.f87685s;
                    LocalDate localDate = ((a) ((j2) yVar.f22677a).getValue()).f207784a;
                    if (localDate != null) {
                        LocalDate localDateE = ((l80.f) aVar2.f87682p).e();
                        if (!date.isBefore(localDate) && !date.isAfter(localDateE)) {
                            aVar2.H2(yVar, new moe.c(field, 1, date, localDateE));
                        }
                    }
                }
                break;
            default:
                wd wdVar = (wd) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String str2 = wdVar.f166987a.f54184a;
                KProperty[] kPropertyArr2 = CustomPeriodSelectController.S;
                if (Intrinsics.f(str2, "custom_period_start_calendar")) {
                    field = c.START_DATE;
                } else if (Intrinsics.f(str2, "custom_period_end_calendar")) {
                    field = c.END_DATE;
                }
                if (field != null) {
                    d dVarE32 = customPeriodSelectController.d();
                    LocalDate date2 = wdVar.f166988b;
                    com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.a aVar4 = (com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.a) dVarE32;
                    aVar4.getClass();
                    Intrinsics.checkNotNullParameter(date2, "date");
                    Intrinsics.checkNotNullParameter(field, "field");
                    y yVar2 = aVar4.f87685s;
                    b bVar = ((a) ((j2) yVar2.f22677a).getValue()).f207787g;
                    if (bVar != null && bVar.f207790c == field && !bVar.f) {
                        aVar4.H2(yVar2, new s(bVar, date2, 21));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
