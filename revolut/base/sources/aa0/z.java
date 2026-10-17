package aa0;

import com.revolut.feature.backend_flow.domain.models.InputItem;
import com.revolut.feature.backend_flow.domain.models.MoneyInputItem;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes19.dex */
public final class z extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f2751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Regex f2752b;

    public z(w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.f2751a = amountFormatter;
        this.f2752b = new Regex("[^0-9]");
    }

    @Override // aa0.c
    public final InputItem a(InputItem inputItem, Object obj2) {
        Long lValueOf;
        MoneyInputItem targetItem = (MoneyInputItem) inputItem;
        v0 updatedValue = (v0) obj2;
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
        if (!(updatedValue instanceof s0)) {
            if (updatedValue instanceof t0) {
                return MoneyInputItem.d(targetItem, null, ((t0) updatedValue).f2742a, null, 1015);
            }
            if (updatedValue instanceof u0) {
                return MoneyInputItem.d(targetItem, null, null, ((u0) updatedValue).f2743a, 511);
            }
            throw new NoWhenBranchMatchedException();
        }
        String str = ((s0) updatedValue).f2741a;
        m70.a.c(kotlin.jvm.internal.t0.f186434a);
        if (this.f2752b.replace(str, "").length() > 0) {
            lValueOf = Long.valueOf(this.f2751a.b(str, targetItem.d.f306286a));
        } else {
            lValueOf = null;
        }
        return MoneyInputItem.d(targetItem, lValueOf, null, null, 1019);
    }
}
