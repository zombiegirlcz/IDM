package mpd;

import cli.y;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.CustomPeriodSelectController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mhd.p0;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CustomPeriodSelectController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(CustomPeriodSelectController customPeriodSelectController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = customPeriodSelectController;
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
        CustomPeriodSelectController customPeriodSelectController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.a) customPeriodSelectController.d()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.a aVar3 = (com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.a) customPeriodSelectController.d();
                y yVar = aVar3.f87685s;
                a aVar4 = (a) ((j2) yVar.f22677a).getValue();
                b bVar = aVar4.f207787g;
                final int i2 = 0;
                if (bVar != null) {
                    final b bVarA = b.a(bVar, null, null, null, null, ((l80.f) aVar3.f87682p).e(), false, 47);
                    if (!bVar.f) {
                        if (bVarA.b(aVar4.f207784a)) {
                            final int i3 = 1;
                            aVar3.H2(yVar, new Function1() { // from class: mpd.l
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    switch (i3) {
                                        case 0:
                                            a update = (a) obj3;
                                            Intrinsics.checkNotNullParameter(update, "$this$update");
                                            return a.a(update, null, null, null, false, bVarA, 63);
                                        default:
                                            a update2 = (a) obj3;
                                            Intrinsics.checkNotNullParameter(update2, "$this$update");
                                            return a.a(update2, null, null, null, false, b.a(bVarA, null, null, null, null, null, true, 31), 63);
                                    }
                                }
                            });
                            aVar3.l2(new p0(aVar3, bVarA, null, 29), new yi5.b(26));
                        } else {
                            aVar3.H2(yVar, new Function1() { // from class: mpd.l
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    switch (i2) {
                                        case 0:
                                            a update = (a) obj3;
                                            Intrinsics.checkNotNullParameter(update, "$this$update");
                                            return a.a(update, null, null, null, false, bVarA, 63);
                                        default:
                                            a update2 = (a) obj3;
                                            Intrinsics.checkNotNullParameter(update2, "$this$update");
                                            return a.a(update2, null, null, null, false, b.a(bVarA, null, null, null, null, null, true, 31), 63);
                                    }
                                }
                            });
                        }
                    }
                } else if (aVar4.f) {
                    aVar3.l2(new p(aVar3, aVar4, null, 0), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
