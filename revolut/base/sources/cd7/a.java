package cd7;

import abf.n;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.home_feed.impl.widgets.scheduled_payments.ScheduledPaymentsEntryPoint;
import com.revolut.feature.home_feed.impl.widgets.scheduled_payments.ScheduledPaymentsWidgetContext;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import efm.r;
import java.io.Serializable;
import k71.q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import vf0.y;
import ypg.p;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23197a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23199c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;

    public /* synthetic */ a(com.revolut.feature.home_feed.impl.widgets.scheduled_payments.b bVar, int i, ScheduledPaymentsWidgetContext scheduledPaymentsWidgetContext, String str, int i2) {
        this.d = bVar;
        this.f23198b = i;
        this.e = scheduledPaymentsWidgetContext;
        this.f = str;
        this.f23199c = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f23197a) {
            case 0:
                com.revolut.feature.home_feed.impl.widgets.scheduled_payments.b bVar = (com.revolut.feature.home_feed.impl.widgets.scheduled_payments.b) this.d;
                ScheduledPaymentsWidgetContext scheduledPaymentsWidgetContext = (ScheduledPaymentsWidgetContext) this.e;
                String str = (String) this.f;
                y yVar = (y) obj2;
                Intrinsics.checkNotNullParameter(yVar, "<destruct>");
                boolean zBooleanValue = ((Boolean) yVar.f288491a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) yVar.f288492b).booleanValue();
                boolean zBooleanValue3 = ((Boolean) yVar.f288493c).booleanValue();
                AccountId accountId = (AccountId) yVar.d;
                od0.i iVar = (od0.i) yVar.e;
                boolean zBooleanValue4 = ((Boolean) yVar.f).booleanValue();
                o7.d dVar = bVar.f74733b;
                RecurringPaymentFilter recurringPaymentFilter = (RecurringPaymentFilter) iVar.f224257a;
                ScheduledPaymentsEntryPoint entryPoint = scheduledPaymentsWidgetContext.getEntryPoint();
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                r rVarG = m70.a.g(nim.a.w(g9e.a.d((g9e.a) dVar.f222642b, recurringPaymentFilter, accountId, 35), new n(dVar, this.f23198b, entryPoint)), null, new ccg.a(3), 1);
                r rVarG2 = m70.a.g(((p) bVar.f74734c).e(pcd.d.f234853b), null, new ccg.a(4), 1);
                r rVarA = cl3.a.a(bVar.i);
                r rVarF = ((njf.j) bVar.f74737j).f();
                q.Companion.getClass();
                r rVarStartWith = rVarF.startWith(k71.p.a());
                Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
                return w.n(rVarG, rVarG2, rVarA, rVarStartWith).map(new cd0.c(new b(scheduledPaymentsWidgetContext, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, bVar, str, this.f23199c), 5));
            default:
                return RowMeasurePolicy.placeHelper$lambda$0$0((Placeable[]) this.d, (RowMeasurePolicy) this.e, this.f23198b, this.f23199c, (int[]) this.f, (Placeable.PlacementScope) obj2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a(Placeable[] placeableArr, RowMeasurePolicy rowMeasurePolicy, int i, int i2, int[] iArr) {
        this.d = placeableArr;
        this.e = rowMeasurePolicy;
        this.f23198b = i;
        this.f23199c = i2;
        this.f = iArr;
    }
}
