package jb1;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.card_reader.order.api.model.CardReaderOrderProductDetails;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.checkout.CheckoutScreenContract$InputData;
import com.revolut.feature.revpro.card_reader.order.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import nii.y0;
import nii.z;
import skm.a2;
import vkm.z1;

/* JADX INFO: loaded from: classes20.dex */
public final class x extends jki.g implements k {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CheckoutScreenContract$InputData f172572p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xa1.a f172573q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i90.b f172574r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final nb1.a f172575s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z1 f172576t;
    public final z1 u;
    public final g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(jki.p stateMapper, CheckoutScreenContract$InputData inputData, xa1.a orderInteractor, i90.b uuidGenerator, nb1.a dialogFactory) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(orderInteractor, "orderInteractor");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        this.f172572p = inputData;
        this.f172573q = orderInteractor;
        this.f172574r = uuidGenerator;
        this.f172575s = dialogFactory;
        this.f172576t = vkm.q.b(0, 7, null);
        this.u = vkm.q.b(0, 7, null);
        this.v = new g(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, null, 1);
    }

    public static final void y2(x xVar, n1 n1Var) {
        xVar.getClass();
        if ((n1Var instanceof k1) || (n1Var instanceof m1)) {
            xVar.s1();
        } else if (n1Var instanceof l1) {
            xVar.l2(new q(0, xVar, null), new yi5.b(26));
        }
    }

    public final void A2() {
        CardReaderOrderProductDetails cardReaderOrderProductDetails = (CardReaderOrderProductDetails) ((g) t2()).f172550a.getContent();
        if (cardReaderOrderProductDetails == null) {
            return;
        }
        ya1.g request = new ya1.g(cardReaderOrderProductDetails.f60575a.f115083b, ((g) t2()).f, this.f172572p.f60601a);
        mfc.c cVar = (mfc.c) this.f172573q;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        jfc.h hVar = (jfc.h) cVar.f204988a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        yji.l.a1(this, new ie7.h(rd0.e.b(hVar.e.f(request, false)), this, 7), null, null, new s(5, this, null), 3);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f172576t, new r(1, this, continuation)), null, null, new s(1, this, continuation), 3);
        yji.l.a1(this, vkm.q.Q(this.u, new r(0, this, continuation)), null, null, new s(0, this, continuation), 3);
        l2(new q(1, this, continuation), new yi5.b(26));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.v;
    }

    public final a2 z2() {
        wa1.a aVar = this.f172575s.f213955a;
        return yji.l.a1(this, X1(new y0(null, new z(new TextLocalisedClause(R$string.rev_pro_card_reader_order_checkout_payment_error_title, null, null, 14), new TextLocalisedClause(R$string.rev_pro_card_reader_order_checkout_payment_error_description, null, null, 14), new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32500), false, 5)), null, null, new s(2, this, null), 3);
    }
}
