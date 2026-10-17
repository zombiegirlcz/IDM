package dsb;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import grl.b4;
import gsb.t;
import ip0.ak0;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f117280a;

    public e(Set infoHelpers) {
        Intrinsics.checkNotNullParameter(infoHelpers, "infoHelpers");
        this.f117280a = infoHelpers;
    }

    public final TextDelegate.Model a(qrb.k kVar, Data data) {
        Object next;
        if (kVar == null) {
            m70.a.c(t0.f186434a);
            return new TextDelegate.Model("TRADE_ORDER_INFO_LIST_ID", new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2032);
        }
        t tVar = data != null ? (t) data.getContent() : null;
        Iterator it8 = this.f117280a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((c) next).a(kVar, tVar)) {
                break;
            }
        }
        c cVar = (c) next;
        if (cVar != null) {
            m mVarC = cVar.c(kVar, tVar);
            return new TextDelegate.Model("TRADE_ORDER_INFO_LIST_ID", cVar.b(kVar, tVar), mVarC != null, new ak0(null, null, 3), mVarC, null, 0, 0, 0, 0, b4.EXPIRED_OR_INVALID_KEY_VALUE);
        }
        throw new IllegalStateException("Can't handle info for type " + kVar.n().f214597c);
    }
}
