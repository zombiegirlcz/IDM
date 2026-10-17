package su6;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderPayment;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qu6.d f265683a;

    public i(qu6.d acquiringOrderPaymentMapper) {
        Intrinsics.checkNotNullParameter(acquiringOrderPaymentMapper, "acquiringOrderPaymentMapper");
        this.f265683a = acquiringOrderPaymentMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sale_acquiring_payment_selector_title, null, null, 14);
        List listP0 = d0.P0(domainState.f265679a, new h());
        ArrayList arrayList = new ArrayList(w.t(listP0, 10));
        Iterator it8 = listP0.iterator();
        while (it8.hasNext()) {
            arrayList.add(this.f265683a.a((AcquiringOrderPayment) it8.next()));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new f(textLocalisedClause, arrayList);
    }
}
