package gf9;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.bills.core.api.model.BillWarning;
import com.revolut.revolut.feature_fourthline_impl.R;
import fim.h;
import gaa.g;
import gim.c;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nii.l0;
import nii.y0;
import xo1.q;
import yhm.m;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends n {
    public final Object Z2(q qVar, c frame) {
        eim.c cVar = new eim.c(h.b(frame));
        BillWarning e = qVar.getE();
        if (e != null) {
            n.j2(this, L2(new y0(null, new l0(new TextClause(e.f61349a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(e.f61350b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextClause(e.f61351c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R.string.common_action_continue, null, null, 14), null, false, null, 996), false, 5)), null, new g(cVar, null, 19), 3);
        } else {
            m.Companion companion = m.INSTANCE;
            cVar.resumeWith(a.Continue);
            Unit unit = Unit.f186387a;
        }
        Object objB = cVar.b();
        if (objB == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objB;
    }
}
