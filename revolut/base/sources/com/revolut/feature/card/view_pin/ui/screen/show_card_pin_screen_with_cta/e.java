package com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.card.view_pin.api.R$string;
import com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.ShowCardPinWithCtaScreenContract$InputData;
import com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.a;
import com.revolut.feature.twofa.exceptions.UserDeclinedTwoFaException;
import com.revolut.feature.twofa.exceptions.UserFailedTwoFaException;
import com.revolut.sso.api.exceptions.UserCancelledSSOExceptionLegacy;
import com.revolut.sso.api.exceptions.UserFailedSsoException;
import do3.q;
import ha3.x;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import o5l.g;
import oki.h;
import org.jetbrains.annotations.NotNull;
import yji.l;
import yv2.j;
import yv2.k;
import yv2.m;
import yv2.o;
import yv2.p;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends h implements yv2.h {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final yv2.f f64425t = new yv2.f(7, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), false, g.HDPI, true, false, yv2.g.LOAD_PIN_STATUS);
    public final ShowCardPinWithCtaScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rv2.a f64426p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c90.c f64427q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f64428r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f64429s;

    public e(f stateMapper, ShowCardPinWithCtaScreenContract$InputData inputData, rv2.a viewCardPinInteractor, c90.c uiResources) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(viewCardPinInteractor, "viewCardPinInteractor");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.o = inputData;
        this.f64426p = viewCardPinInteractor;
        this.f64427q = uiResources;
        this.f64428r = mra.d.b(this, f64425t, stateMapper, null, false, 12);
        this.f64429s = hx7.e.a(this, new yi3.d(this, 24));
    }

    @Override // yji.l
    public final void I1() {
        ShowCardPinWithCtaScreenContract$InputData showCardPinWithCtaScreenContract$InputData = this.o;
        String cardId = showCardPinWithCtaScreenContract$InputData.getF64420a();
        gwh.c cVar = (gwh.c) this.f64426p;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Continuation continuation = null;
        l.a1(this, rd0.e.b(pd.b.r(((x) cVar.f147329a).v(cardId), new gwe.d(cVar, 1))), null, null, new p(this, continuation, 1), 3);
        if (showCardPinWithCtaScreenContract$InputData instanceof ShowCardPinWithCtaScreenContract$InputData.ViewPinImmediately) {
            l2(new b(this, null), new yi5.b(26));
        } else if (!(showCardPinWithCtaScreenContract$InputData instanceof ShowCardPinWithCtaScreenContract$InputData.ViewPinAfterCtaClick)) {
            throw new NoWhenBranchMatchedException();
        }
        l2(new y7i.h(this, continuation, 24), new yi5.b(26));
    }

    public final void I2(boolean z, yv2.g gVar) {
        H2(this.f64428r, new yuc.p(gVar, 8));
        l.a1(this, q.w(mo3.a.g(rd0.e.b(((gwh.c) this.f64426p).c(this.o.getF64420a(), z)), null, null, 3), this), null, null, new p(this, null, 0), 3);
    }

    public final void J2(m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean zF = Intrinsics.f(event, j.f317113a);
        a.C0460a c0460a = a.C0460a.f64424a;
        if (zF) {
            C2(c0460a);
            return;
        }
        boolean zF2 = Intrinsics.f(event, yv2.l.f317115a);
        ShowCardPinWithCtaScreenContract$InputData showCardPinWithCtaScreenContract$InputData = this.o;
        if (zF2) {
            if (showCardPinWithCtaScreenContract$InputData instanceof ShowCardPinWithCtaScreenContract$InputData.ViewPinAfterCtaClick) {
                l2(new b(this, null), new yi5.b(26));
                return;
            } else {
                if (!(showCardPinWithCtaScreenContract$InputData instanceof ShowCardPinWithCtaScreenContract$InputData.ViewPinImmediately)) {
                    throw new NoWhenBranchMatchedException();
                }
                C2(c0460a);
                return;
            }
        }
        if (!(event instanceof k)) {
            throw new NoWhenBranchMatchedException();
        }
        if (Intrinsics.f(((k) event).f317114a, "ACTIVATE_INSTRUCTIONS_CLAUSE_ID")) {
            C1(((gwh.c) this.f64426p).a(showCardPinWithCtaScreenContract$InputData.getF64420a()));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f64429s;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f64428r;
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if ((throwable instanceof UserCancelledSSOExceptionLegacy) || (throwable instanceof UserFailedSsoException) || (throwable instanceof UserFailedTwoFaException) || (throwable instanceof UserDeclinedTwoFaException)) {
            C2(a.C0460a.f64424a);
            return true;
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
        l.a1(this, X1(new y0("ERROR_DIALOG_ID", new z(new TextLocalisedClause(R$string.card_view_pin_error_title, null, null, 14), new TextLocalisedClause(R$string.card_view_pin_error_description, null, null, 14), new TextLocalisedClause(R$string.card_view_pin_error_primary_button, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4)), null, null, new c(this, null), 3);
        return true;
    }
}
