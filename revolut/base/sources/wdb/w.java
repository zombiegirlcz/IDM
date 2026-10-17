package wdb;

import com.revolut.data.model.Data;
import com.revolut.feature.retail.restaurants.impl.domain.interactor.InvalidGuaranteeException;
import com.revolut.feature.retail.restaurants.impl.domain.model.Reservation;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.y;
import vy5.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class w {

    @NotNull
    private static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7c.g f296540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q7c.m f296541b;

    public w(q7c.g paymentMethodsInteractor, q7c.m quoteInteractor) {
        Intrinsics.checkNotNullParameter(paymentMethodsInteractor, "paymentMethodsInteractor");
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        this.f296540a = paymentMethodsInteractor;
        this.f296541b = quoteInteractor;
    }

    public static final boolean a(w wVar, Data data) {
        od0.i iVar = (od0.i) data.getContent();
        PaymentMethod paymentMethod = iVar != null ? (PaymentMethod) iVar.f224257a : null;
        if (zi0.c.E(data)) {
            return ((paymentMethod instanceof PaymentMethod.Pocket) && ((PaymentMethod.Pocket) paymentMethod).e) ? false : true;
        }
        return false;
    }

    public static boolean b(PaymentMethod.Pocket pocket, dj0.d dVar, Quote quote) {
        dj0.d dVar2;
        dj0.d dVar3 = null;
        if (quote != null && (dVar2 = quote.f84400c) != null && Intrinsics.f(dVar2.f115083b, pocket.i.f115083b)) {
            dVar3 = dVar2;
        }
        return dVar3 != null ? pocket.i.e(dVar3) : Intrinsics.f(pocket.f84381j.f115083b, dVar.f115083b) && pocket.f84381j.e(dVar);
    }

    public final akg.n c(Reservation.Guarantee.Order order, dj0.d dVar) {
        u6c.t tVar = u6c.t.STAYS;
        long j2 = dVar.f115082a;
        return this.f296540a.b(new u6c.n(order.d, null, tVar, Long.valueOf(j2), dVar.f115083b, false, null, null, 928), w4l.i.f294643c);
    }

    public final Flow d(Reservation.Guarantee guarantee, PaymentMethod.Pocket pocket) {
        dj0.d dVar;
        Continuation continuation;
        Flow flowQ;
        Intrinsics.checkNotNullParameter(guarantee, "guarantee");
        Reservation.Guarantee.Order order = guarantee.f82823c;
        if (order != null) {
            if (!com.revolut.feature.retail.restaurants.impl.domain.model.f.a(guarantee)) {
                order = null;
            }
            if (order != null) {
                dj0.d dVar2 = order.f82825b;
                if (dVar2 == null) {
                    return new go.g(zi0.c.O(new InvalidGuaranteeException(0)), 2);
                }
                if (pocket == null) {
                    dVar = dVar2;
                    flowQ = c(order, dVar2);
                    continuation = null;
                } else {
                    dVar = dVar2;
                    continuation = null;
                    flowQ = vkm.q.Q(vkm.q.R(this.f296540a.c(new u6c.p(pocket.f84377b, order.d, (u6c.u) null, u6c.t.STAYS, Long.valueOf(dVar2.f115082a), dVar2.f115083b, false, 64), pocket.f84376a, w4l.i.f294643c), new p(this, null)), new mki.d(continuation, this, order, dVar, 28));
                }
                return new y(boh.f.e(new d0(flowQ, 3), new w38.v(this, dVar, 23)), new r(3, continuation));
            }
        }
        return new go.g(zi0.c.O(new InvalidGuaranteeException(0)), 2);
    }
}
