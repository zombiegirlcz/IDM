package fl1;

import aii.q;
import aw0.o9;
import cli.y;
import cli.z;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.alipay.impl.ui.webcontainer.AlipayPlusWebContainerContract$InputData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends oki.h implements z {
    public final y o;

    public n(AlipayPlusWebContainerContract$InputData inputData, o stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        String str = inputData.f61094c;
        this.o = mra.d.b(this, new g(str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, true), stateMapper, null, false, 12);
    }

    public final void I2(final k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof j;
        y yVar = this.o;
        if (z) {
            final int i = 0;
            H2(yVar, new Function1() { // from class: fl1.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    g update = (g) obj2;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            String str = ((j) event).f135893a;
                            TextClause textClause = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                            boolean z3 = update.f135890b;
                            update.getClass();
                            return new g(textClause, z3);
                        default:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            boolean z4 = ((i) event).f135892a < 100;
                            Clause clause = update.f135889a;
                            update.getClass();
                            return new g(clause, z4);
                    }
                }
            });
        } else if (event instanceof i) {
            final int i2 = 1;
            H2(yVar, new Function1() { // from class: fl1.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    g update = (g) obj2;
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            String str = ((j) event).f135893a;
                            TextClause textClause = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                            boolean z3 = update.f135890b;
                            update.getClass();
                            return new g(textClause, z3);
                        default:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            boolean z4 = ((i) event).f135892a < 100;
                            Clause clause = update.f135889a;
                            update.getClass();
                            return new g(clause, z4);
                    }
                }
            });
        } else {
            if (!event.equals(h.f135891a)) {
                throw new NoWhenBranchMatchedException();
            }
            C2(q.f5292a);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
