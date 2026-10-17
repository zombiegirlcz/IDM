package r9c;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.impl.R$string;
import ip0.zj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import o9c.s;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static List a(s domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listK = v.k(domainState.f223227c, domainState.f223228g, domainState.d, domainState.k, domainState.f, domainState.i, domainState.f223231l, domainState.f223236r);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listK) {
            Data data = (Data) obj2;
            if (data.getError() != null && !data.getLoading()) {
                arrayList.add(obj2);
            }
        }
        ArrayList<Throwable> arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            Throwable error = ((Data) it8.next()).getError();
            if (error != null) {
                arrayList2.add(error);
            }
        }
        if (arrayList2.isEmpty()) {
            return f0.f322471a;
        }
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ORDER_SUMMARY_ERROR_LIST_ID", new TextLocalisedClause(R$string.revolut_pay_order_summary_error_title, null, null, 14), null, null, new l6(12, new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_common_action_try_again, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1868);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        List listC = u.c(model);
        for (Throwable th10 : arrayList2) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
        }
        return listC;
    }
}
