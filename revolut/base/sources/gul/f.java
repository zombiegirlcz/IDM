package gul;

import androidx.room.util.SQLiteConnectionUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.trading.orders.ui.invest.placement.models.OrderQuoteResult;
import com.revolut.trading.orders.ui.invest.placement.models.ProcessedInputAmount;
import d9.e1;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146984a;

    public /* synthetic */ f(int i) {
        this.f146984a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f146984a) {
            case 0:
                cul.v it8 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.H;
            case 1:
                cul.v it9 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.e;
            case 2:
                cul.v it10 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f;
            case 3:
                cul.v it11 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.H;
            case 4:
                cul.v it12 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.k;
            case 5:
                ProcessedInputAmount processedInputAmount = (ProcessedInputAmount) obj2;
                Intrinsics.checkNotNullParameter(processedInputAmount, "processedInputAmount");
                if (!e1.G(processedInputAmount.getF106871a().f104717a)) {
                    processedInputAmount = null;
                }
                if (processedInputAmount == null) {
                    return null;
                }
                if (processedInputAmount instanceof ProcessedInputAmount.Original) {
                    return ((ProcessedInputAmount.Original) processedInputAmount).f106871a;
                }
                if (processedInputAmount instanceof ProcessedInputAmount.Converted) {
                    return ((ProcessedInputAmount.Converted) processedInputAmount).f106869b;
                }
                throw new NoWhenBranchMatchedException();
            case 6:
                return zi0.c.P(((cul.v) obj2).f109175a, false, null, 3);
            case 7:
                return zi0.c.P(((cul.v) obj2).f109176b, false, null, 3);
            case 8:
                return ((cul.v) obj2).H;
            case 9:
                aul.b bVar = ((cul.v) obj2).d;
                if (bVar != null) {
                    return zi0.c.P(bVar, false, null, 3);
                }
                return null;
            case 10:
                return zi0.c.P(Optional.ofNullable(((cul.v) obj2).f109181l), false, null, 3);
            case 11:
                cul.v it13 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.i;
            case 12:
                cul.v it14 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.H;
            case 13:
                cul.v it15 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.f109182m;
            case 14:
                OrderQuoteResult it16 = (OrderQuoteResult) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f106859b;
            case 15:
                cul.v it17 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                aul.b bVar2 = it17.d;
                if (bVar2 != null) {
                    return zi0.c.P(bVar2, false, null, 3);
                }
                return null;
            case 16:
                cul.v it18 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.L;
            case 17:
                cul.v it19 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.I;
            case 18:
                cul.v it20 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.f109180j;
            case 19:
                cul.v it21 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return it21.L;
            case 20:
                cul.v it22 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return it22.H;
            case 21:
                cul.v it23 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return it23.K;
            case 22:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                Amount amount = (Amount) rVar.f314201a;
                nel.n nVar = (nel.n) rVar.f314202b;
                Amount amountA = z.a(amount, nVar, (k4l.e0) rVar.f314203c);
                if (amountA != null) {
                    return new cul.c0(amountA, cul.b0.LOTS);
                }
                return io3.h.o(nVar.f214597c) ? new cul.c0(amount, cul.b0.NOTES) : new cul.c0(amount, cul.b0.QUANTITY);
            case 23:
                io3.d it24 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                xi0.a aVar = xi0.b.Companion;
                String str = it24.f163147c;
                aVar.getClass();
                return Boolean.valueOf(cp5.d.z(xi0.a.a(str)));
            case 24:
                io3.d it25 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                return Boolean.valueOf(gv5.d.f.contains(it25.f));
            case 25:
                gv8.f update = (gv8.f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                boolean z = update.f147080b;
                update.getClass();
                return new gv8.f(true, z);
            case 26:
                gv8.f update2 = (gv8.f) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                boolean z3 = update2.f147079a;
                update2.getClass();
                return new gv8.f(z3, true);
            case 27:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM payments_social_reactions WHERE state = 'DELETED' AND status in ('SENT', 'ERROR')");
                try {
                    sQLiteStatementPrepare.step();
                    return Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection));
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 28:
                gvc.g update3 = (gvc.g) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return gvc.g.a(update3, null, null, null, null, null, null, null, null, false, 383);
            default:
                return gvi.h.a((gvi.h) obj2, null, null, true, 3);
        }
    }
}
