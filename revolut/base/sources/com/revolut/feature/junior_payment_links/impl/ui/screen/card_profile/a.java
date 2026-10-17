package com.revolut.feature.junior_payment_links.impl.ui.screen.card_profile;

import a3e.u;
import au6.a3;
import aw0.t2;
import aw0.u2;
import aw0.v2;
import aw0.w2;
import bj8.c;
import bj8.f;
import cli.y;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.data.model.Data;
import com.revolut.feature.junior_payment_links.api.model.PaymentLinkCustomAmountBundle;
import com.revolut.feature.junior_payment_links.impl.ui.screen.card_profile.JuniorCardProfileScreenContract;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import vkm.j2;
import vkm.q;
import vkm.q0;
import wsg.n;
import xi8.b;
import yi8.g;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements f {
    public final JuniorCardProfileScreenContract.Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hj8.a f77091p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f77092q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f77093r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f77094s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c70.a f77095t;
    public final vii.b u;
    public final y v;

    public a(u stateMapper, JuniorCardProfileScreenContract.Input input, hj8.a juniorProfileInteractor, n walletInteractor, g paymentLinkCustomAmountBundleProvider, b juniorPaymentLinkSharingInteractor, c70.a clipboard) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(paymentLinkCustomAmountBundleProvider, "paymentLinkCustomAmountBundleProvider");
        Intrinsics.checkNotNullParameter(juniorPaymentLinkSharingInteractor, "juniorPaymentLinkSharingInteractor");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        this.o = input;
        this.f77091p = juniorProfileInteractor;
        this.f77092q = walletInteractor;
        this.f77093r = paymentLinkCustomAmountBundleProvider;
        this.f77094s = juniorPaymentLinkSharingInteractor;
        this.f77095t = clipboard;
        this.u = new vii.b();
        this.v = d.b(this, new bj8.b(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(new q0(this.u, new bf5.a(this, continuation, 8), 1), new a3(continuation, this, 22)), null, null, new bi2.n(this, continuation, 2), 3);
    }

    @Override // fpa.e
    public final void O(ActionsView.Item action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Object obj2 = action.f58324n;
        if (obj2 instanceof ri8.b) {
            C2(new bj8.d(((ri8.b) obj2).f254567a));
            return;
        }
        if (Intrinsics.f(obj2, ri8.a.f254566a)) {
            C2(c.f15584a);
        } else if (obj2 instanceof ri8.c) {
            ri8.c cVar = (ri8.c) obj2;
            C1(this.f77094s.b(cVar.f254568a, cVar.f254569b));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }

    @Override // fpa.e
    public final void q() {
        this.u.a();
    }

    @Override // fpa.e
    public final void t0(w2 click) {
        Intrinsics.checkNotNullParameter(click, "click");
        Object content = ((bj8.b) ((j2) this.v.f22677a).getValue()).f15583a.getContent();
        if (content == null) {
            throw new IllegalArgumentException("JuniorCardProfileScreenModel::onContentClick cannot be called on null DomainState::cardProfile::content");
        }
        bj8.a aVar = (bj8.a) content;
        PaymentLinkCustomAmountBundle paymentLinkCustomAmountBundle = aVar.f15581g;
        if (Intrinsics.f(click, v2.f10570a)) {
            this.f77095t.c(null, paymentLinkCustomAmountBundle.a() ? j6.a.q("@", aVar.d) : this.f77094s.a(aVar.f15582h, paymentLinkCustomAmountBundle), false, new bc1.b(this, 8));
        } else if (Intrinsics.f(click, t2.f10539a)) {
            C2(new bj8.d(paymentLinkCustomAmountBundle));
        } else if (!Intrinsics.f(click, u2.f10554a)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
