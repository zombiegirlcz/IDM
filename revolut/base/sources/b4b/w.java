package b4b;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.cfd.impl.screens.order.utils.CfdInputValue;
import com.revolut.retail.wealth.resources.R$string;
import java.math.BigDecimal;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BigDecimal f12254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f12255c;

    public /* synthetic */ w(BigDecimal bigDecimal, boolean z, int i) {
        this.f12253a = i;
        this.f12254b = bigDecimal;
        this.f12255c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f12253a) {
            case 0:
                n update = (n) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return n.a(update, null, new CfdInputValue(this.f12254b, Boolean.valueOf(this.f12255c), 12), null, null, null, null, null, null, null, false, null, null, 8189);
            case 1:
                n update2 = (n) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                CfdInputValue cfdInputValue = update2.f12228b;
                BigDecimal value = this.f12254b;
                if (value == null) {
                    value = cfdInputValue.f82234a;
                }
                Boolean bool = Boolean.TRUE;
                cfdInputValue.getClass();
                Intrinsics.checkNotNullParameter(value, "value");
                return n.a(update2, null, new CfdInputValue(value, bool, true, this.f12255c), null, null, null, null, null, null, null, false, null, null, 8189);
            default:
                NumberClause numberClause = (NumberClause) obj2;
                Intrinsics.checkNotNullParameter(numberClause, "numberClause");
                return new TextLocalisedClause(R$string.invest_templates_percentage_points, zhm.u.c(numberClause), new Custom(Integer.valueOf(s87.c.b(this.f12254b, this.f12255c)), false, null, false, null, 254), 8);
        }
    }

    public /* synthetic */ w(s87.c cVar, BigDecimal bigDecimal, boolean z) {
        this.f12253a = 2;
        this.f12254b = bigDecimal;
        this.f12255c = z;
    }
}
