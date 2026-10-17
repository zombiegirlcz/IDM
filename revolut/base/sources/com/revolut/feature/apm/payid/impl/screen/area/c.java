package com.revolut.feature.apm.payid.impl.screen.area;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.feature.apm.core.models.recipients.PayIdBeneficiary;
import com.revolut.feature.apm.core.ui.api.navigation.list.ApmTransactionAreaListInputData;
import com.revolut.feature.apm.payid.impl.screen.area.a;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.payments.social.api.navigation.TransferOnlyChatDestination;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import e12.f;
import f5j.r;
import hx7.e;
import java.util.concurrent.CopyOnWriteArrayList;
import k3k.k;
import ka2.a0;
import ka2.i;
import ka2.j;
import ka2.m;
import ka2.o;
import ka2.q;
import ka2.s;
import ka2.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import te0.w;
import tof.k7;
import xx9.p;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends h implements i {
    public final vw1.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pn3.a f62714p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p f62715q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f62716r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final whf.b f62717s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zja.a f62718t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public c(vw1.b aliasRepository, pn3.a contactsPermissionsController, p recentRecipientInteractor, f apmTransactionAreaListExtension, whf.b transactionsContentProvider, zja.a productArticleInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(aliasRepository, "aliasRepository");
        Intrinsics.checkNotNullParameter(contactsPermissionsController, "contactsPermissionsController");
        Intrinsics.checkNotNullParameter(recentRecipientInteractor, "recentRecipientInteractor");
        Intrinsics.checkNotNullParameter(apmTransactionAreaListExtension, "apmTransactionAreaListExtension");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = aliasRepository;
        this.f62714p = contactsPermissionsController;
        this.f62715q = recentRecipientInteractor;
        this.f62716r = apmTransactionAreaListExtension;
        this.f62717s = transactionsContentProvider;
        this.f62718t = productArticleInteractor;
        this.u = d.b(this, new ka2.h(0), stateMapper, null, false, 12);
        this.v = e.a(this, new k(this, 13));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new b(this, null), new yi5.b(26));
        l.a1(this, vw1.b.c(this.o), null, null, new a0(this, continuation, 0), 3);
        l.a1(this, rd0.e.b(whf.b.a(this.f62717s, w.h(new k7(r.PAYID_ALIAS)), null, 3, null, 10)), null, null, new a0(this, continuation, 1), 3);
        l.a1(this, rd0.e.b(((pn3.b) this.f62714p).b()), null, null, new a0(this, continuation, 2), 3);
        l.a1(this, nim.a.v(rd0.e.n(rd0.e.b(p.c(this.f62715q, false, null, 3)), h0.f322473a), new k9h.d(7)), null, null, new a0(this, continuation, 3), 3);
    }

    public final void I2(t event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof ka2.k) {
            C2(a.C0456a.f62710a);
            return;
        }
        if (event instanceof ka2.p) {
            C2(a.d.f62713a);
            return;
        }
        if (event instanceof q) {
            B2();
            return;
        }
        if (event instanceof j) {
            C2(a.b.f62711a);
            return;
        }
        if (event instanceof m) {
            C2(a.c.f62712a);
            return;
        }
        if (event instanceof ka2.l) {
            ((pn3.b) this.f62714p).c(this, new ka2.y(this, 0));
            return;
        }
        if (event instanceof ka2.n) {
            Object obj2 = ((ka2.n) event).f182400a;
            PayIdBeneficiary payIdBeneficiary = obj2 instanceof PayIdBeneficiary ? (PayIdBeneficiary) obj2 : null;
            if (payIdBeneficiary != null) {
                C1(new TransferOnlyChatDestination(new ChatTransferRecipient.ApmTransferRecipient(payIdBeneficiary)));
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException(a0.d.m(obj2, "Unexpected type of contact: "));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return;
        }
        if (event instanceof o) {
            C1(new TransferDestination.PaymentsSearch(WhoToTransferFilter.ApmPayId.f79991a, 29));
        } else if (event instanceof ka2.r) {
            C1(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(ofm.q.P(((ka2.r) event).f182404a), null, null, null, 126))));
        } else {
            if (!(event instanceof s)) {
                throw new NoWhenBranchMatchedException();
            }
            C1(new com.revolut.kompot.common.b(e1(new e12.e(new ApmTransactionAreaListInputData(0), this.f62716r)), (ModalDestination.Style) null, 6));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // yji.l
    public final void T1(long j2) {
        ((pn3.b) this.f62714p).e();
    }

    @Override // cli.z
    public final g getState() {
        return this.u;
    }
}
