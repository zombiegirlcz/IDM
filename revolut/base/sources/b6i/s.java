package b6i;

import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_move_money.impl.amount.c f12823b;

    public /* synthetic */ s(com.revolut.feature_move_money.impl.amount.c cVar, int i) {
        this.f12822a = i;
        this.f12823b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        l lVar;
        int i = this.f12822a;
        int i2 = 1;
        com.revolut.feature_move_money.impl.amount.c cVar = this.f12823b;
        switch (i) {
            case 0:
                dpf.c output = (dpf.c) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!Intrinsics.f(output, dpf.a.f116875a)) {
                    if (!(output instanceof dpf.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c8i.j0 j0Var = cVar.N;
                    cli.y yVar = cVar.Y;
                    TransferScheduleData scheduleData = ((dpf.b) output).f116876a;
                    j0Var.getClass();
                    Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
                    if (n1l.b.d(scheduleData, ((l80.f) j0Var.f22203a).f())) {
                        cVar.H2(yVar, new b58.f(output, cVar, 7));
                    } else {
                        cVar.H2(yVar, new s(cVar, i2));
                    }
                }
                return Unit.f186387a;
            case 1:
                h update = (h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                q7i.a aVar = cVar.U;
                OrderMode orderMode = update.f12787h;
                aVar.getClass();
                return h.a(update, null, null, null, null, false, false, null, new OrderMode.Market(q7i.a.a(orderMode)), 0, 383);
            case 2:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, it8, h0Var);
                com.revolut.feature_move_money.impl.amount.c cVar2 = this.f12823b;
                yji.l.a1(cVar2, cVar2.X1(new nii.y0(null, cVar2.f97291w.a(), false, 5)), null, null, new az.i(cVar2, null, 11), 3);
                return Boolean.TRUE;
            default:
                h update2 = (h) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                int i3 = a0.f12757c[cVar.Q2().f12785c.ordinal()];
                if (i3 == 1) {
                    lVar = l.BOTTOM_TO_TOP;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lVar = l.TOP_TO_BOTTOM;
                }
                return h.a(update2, null, null, lVar, null, false, false, null, null, 0, 507);
        }
    }
}
