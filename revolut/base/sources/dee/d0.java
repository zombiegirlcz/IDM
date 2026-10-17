package dee;

import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import ip0.ck0;
import ip0.yj0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class d0 {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public static ArrayList a(TextLocalisedClause progressTitle, List steps) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(progressTitle, "progressTitle");
        TextDelegate.Model model = new TextDelegate.Model("PROGRESS_TITLE_ID", progressTitle, false, new ck0(yj0.START), null, null, 0, 0, 0, 0, 2036);
        List list = steps;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            g0 g0Var = (g0) obj2;
            arrayList.add(new ProgressStepVerticalV2Delegate.Model(a0.d.n("TIMELINE_STEP_", i), g0Var.f113406a, g0Var.f113407b, g0Var.f113408c, false, null, 0, 0, 0, null, false, false, 32752));
            i = i2;
        }
        ArrayList arrayListE0 = zhm.d0.E0(arrayList, zhm.u.c(model));
        yp0.b.k(arrayListE0, 0, 0, 0, 0, 31);
        return arrayListE0;
    }

    public static TimeClause b(Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "instant");
        return new TimeClause(instant.toEpochMilli(), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12);
    }
}
