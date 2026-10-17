package t1i;

import com.revolut.feature_exchange.impl.ui.exchange.order_settings.OrderSettingsContract$Configuration;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import efm.d0;
import g1i.l0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f267365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f267366b;

    public /* synthetic */ j(o oVar, int i) {
        this.f267365a = i;
        this.f267366b = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f267365a) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                o oVar = this.f267366b;
                d0 d0VarY3 = ((g1i.d0) oVar.k).y3();
                sx4.c cVar = new sx4.c(new j(oVar, 2), 12);
                d0VarY3.getClass();
                pfm.a aVar = new pfm.a(d0VarY3, cVar, 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return aVar;
            case 1:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return ((l0) this.f267366b.f267374j).finish();
            default:
                g gVar = this.f267366b.f267374j;
                v1i.a orderSettings = (v1i.a) obj2;
                Intrinsics.checkNotNullParameter(orderSettings, "orderSettings");
                if (k.f267367a[orderSettings.f285318a.ordinal()] == 1) {
                    return ((l0) gVar).o();
                }
                l0 l0Var = (l0) gVar;
                l0Var.getClass();
                w1i.g.Companion.getClass();
                return l0Var.d.a(new ActivityNavigateCommand(w1i.c.f293855b, new OrderSettingsContract$Configuration(0.0d, R$string.common_action_continue), null, null, 0, null, null, null, null, false, 1020));
        }
    }
}
