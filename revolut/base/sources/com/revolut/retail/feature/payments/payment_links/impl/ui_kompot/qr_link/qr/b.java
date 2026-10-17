package com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.qr;

import aw0.o9;
import aw0.t2;
import aw0.u2;
import aw0.v2;
import aw0.w2;
import cli.y;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.payments.payment_links.impl.R$string;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.qr.PaymentLinkQrScreenContract$ModalStep;
import java.util.List;
import k7c.l0;
import k8k.c;
import k8k.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import tqi.g;
import vkm.j2;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements k8k.b {

    @NotNull
    public static final c Companion = new c();
    public final g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g8k.b f102227p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p56.a f102228q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c70.a f102229r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f01.c f102230s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f102231t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public b(g shareNaviCommandFactory, g8k.b paymentLinkWithAmountGenerator, p56.a transferLinkInteractor, c70.a clipboard, f01.c uiKitResources, PaymentLinkQrScreenContract$InputData inputData, e stateMapper) {
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        Intrinsics.checkNotNullParameter(paymentLinkWithAmountGenerator, "paymentLinkWithAmountGenerator");
        Intrinsics.checkNotNullParameter(transferLinkInteractor, "transferLinkInteractor");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = shareNaviCommandFactory;
        this.f102227p = paymentLinkWithAmountGenerator;
        this.f102228q = transferLinkInteractor;
        this.f102229r = clipboard;
        this.f102230s = uiKitResources;
        this.f102231t = d.b(this, new k8k.a(null, paymentLinkWithAmountGenerator.a(null, inputData.f102223a, null), null), stateMapper, null, false, 12);
        this.u = hx7.e.a(this, new fb.c(this, inputData, 25));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // fpa.e
    public final void O(ActionsView.Item action) {
        Intrinsics.checkNotNullParameter(action, "action");
        String str = action.f58316a;
        int iHashCode = str.hashCode();
        y yVar = this.f102231t;
        if (iHashCode == -1276874826) {
            if (str.equals("EDIT_AMOUNT_BUTTON_ID")) {
                h.v2(this.u, new PaymentLinkQrScreenContract$ModalStep.SetAmountAndNote(((k8k.a) ((j2) yVar.f22677a).getValue()).f182174b, ((k8k.a) ((j2) yVar.f22677a).getValue()).f182175c), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
                return;
            }
            return;
        }
        if (iHashCode == -5673860) {
            if (str.equals("REMOVE_AMOUNT_BUTTON_ID")) {
                H2(yVar, new k7c.d(27));
            }
        } else if (iHashCode == 737435587 && str.equals("SHARE_LINK_BUTTON_ID")) {
            tqi.c cVar = new tqi.c(null, this.f102230s.b(new TextLocalisedClause(R$string.money_request_share_description, u.c(new TextClause(((k8k.a) ((j2) yVar.f22677a).getValue()).f182173a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12)).toString(), null, null, 91);
            m70.a.c(t0.f186434a);
            C1(u0.b(this.o.g(cVar, "")));
        }
    }

    @Override // fpa.e
    public final void Z0(String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (Intrinsics.f(itemId, "NAV_BAR_INFO_BUTTON_ID")) {
            l2(new l0(this, null, 2), new yi5.b(26));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f102231t;
    }

    @Override // fpa.e
    public final void t0(w2 click) {
        Intrinsics.checkNotNullParameter(click, "click");
        if (Intrinsics.f(click, t2.f10539a)) {
            this.f102229r.c(null, ((k8k.a) ((j2) this.f102231t.f22677a).getValue()).f182173a, false, new jj2.a(this, 29));
        } else if (!Intrinsics.f(click, u2.f10554a) && !Intrinsics.f(click, v2.f10570a)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // fpa.e
    public final void y(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        if (Intrinsics.f(clickData.f275445a, "EDIT_AMOUNT_INFO_CLAUSE_ID")) {
            y yVar = this.f102231t;
            h.v2(this.u, new PaymentLinkQrScreenContract$ModalStep.SetAmountAndNote(((k8k.a) ((j2) yVar.f22677a).getValue()).f182174b, ((k8k.a) ((j2) yVar.f22677a).getValue()).f182175c), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
        }
    }
}
