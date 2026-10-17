package com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.core.ui_kit.delegates.l9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card.view_pin.api.R$plurals;
import com.revolut.feature.card.view_pin.api.R$string;
import com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.ShowCardPinWithCtaScreenContract$InputData;
import com.revolut.shared.cards.model.Card;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsConfigBackground;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsDesignConfig;
import com.youTransactor.uCube.rpc.Constants;
import ez0.h;
import ip0.dy;
import ip0.fe0;
import java.io.IOException;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o5l.g;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import u3a.p;
import yv2.i;
import yv2.q;
import yv2.r;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShowCardPinWithCtaScreenContract$InputData f64430a;

    public f(ShowCardPinWithCtaScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f64430a = inputData;
    }

    public static ResourceImage a() {
        return new ResourceImage(R$drawable.uikit_pic_602_card_placeholder, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, gz0.b.Undefined, null, null, null, LDSFile.EF_SOD_TAG), (Clause) null, 190);
    }

    public static UrlImage b(String str) {
        return new UrlImage(str, (String) null, (UrlImageDrawable) new UrlImageDrawable.ImagePlaceholder(new ResourceImage(R$drawable.uikit_pic_602_card_placeholder, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, gz0.b.Undefined, null, null, null, LDSFile.EF_SOD_TAG), (Clause) null, 190)), 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (h) null, (Image) null, false, false, (ImageTransformations) null, (Integer) null, (Integer) null, false, false, (Clause) null, 524282);
    }

    public static dy d() {
        return new dy(a(), a(), -16777216, -16777216, -7829368, -16777216, null, 1084);
    }

    public static aim.e e(yv2.f fVar, Card card, String str) throws IOException {
        dy dyVarD;
        CardDetailsConfigBackground cardDetailsConfigBackground;
        String strF;
        aim.e eVarB = u.b();
        g gVar = fVar.e;
        Clause clause = card.d;
        o5l.b bVar = card.f104690c;
        l9 l9Var = new l9(clause, card.e, card.f, null, null, 16);
        Clause clause2 = card.f104691g;
        CardDetailsDesignConfig cardDetailsDesignConfig = card.f104692h;
        if (cardDetailsDesignConfig == null || (strF = edl.a.f((cardDetailsConfigBackground = cardDetailsDesignConfig.f104701b), bVar, gVar)) == null) {
            dyVarD = d();
        } else {
            UrlImage urlImageB = b(strF);
            String strF2 = edl.a.f(cardDetailsConfigBackground, bVar, gVar);
            dyVarD = strF2 != null ? new dy(urlImageB, b(strF2), cardDetailsDesignConfig.d, cardDetailsDesignConfig.e, cardDetailsDesignConfig.f, cardDetailsDesignConfig.f104704h, null, 1084) : d();
        }
        dy dyVar = dyVarD;
        String str2 = card.i;
        eVarB.add(new NewRevolutCardDelegate.Model("CARD_VIEW_LIST_ID", l9Var, clause2, dyVar, str2 != null ? new UrlImage(str2, null, null, null, 0L, null, null, null, null, null, true, null, null, null, false, false, 520190) : null, 31952));
        boolean z = fVar.f;
        String strK0 = str == null ? "0000" : str;
        if (strK0.length() == 4) {
            Intrinsics.checkNotNullParameter(strK0, "<this>");
            strK0 = d0.k0(strK0.length() == 0 ? f0.f322471a : new ge0.b(strK0, 1), " ", null, null, 0, null, 62);
        }
        eVarB.add(new fe0(new TextClause(strK0, (Style) new Custom(null, false, null, z || str == null, null, Constants.TAG_BLE_FIRMWARE_VERSION), (Integer) null, false, (o9) null, (List) null, 124), R$attr.uikit_dp48));
        return u.a(eVarB);
    }

    public static TextLocalisedQuantityClause h(int i) {
        return new TextLocalisedQuantityClause(R$plurals.card_view_pin_reveal_pin_disappear_timer, Integer.valueOf(i), (List) null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 12);
    }

    @Override // cli.n
    public final o c(j jVar) {
        yv2.f domainState = (yv2.f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i) iii.c.f(domainState.f317104b, new yrb.i(this, domainState, 21), new p(this, domainState, 28), new y66.q(this, domainState, 16));
    }

    public final Clause f(yv2.f fVar) {
        ShowCardPinWithCtaScreenContract$InputData showCardPinWithCtaScreenContract$InputData = this.f64430a;
        if (showCardPinWithCtaScreenContract$InputData instanceof ShowCardPinWithCtaScreenContract$InputData.ViewPinAfterCtaClick) {
            return ((ShowCardPinWithCtaScreenContract$InputData.ViewPinAfterCtaClick) showCardPinWithCtaScreenContract$InputData).f64419c;
        }
        if (!(showCardPinWithCtaScreenContract$InputData instanceof ShowCardPinWithCtaScreenContract$InputData.ViewPinImmediately)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = r.f317119a[fVar.f317107h.ordinal()];
        if (i == 1 || i == 2) {
            if (((ShowCardPinWithCtaScreenContract$InputData.ViewPinImmediately) showCardPinWithCtaScreenContract$InputData).f64421b && fVar.d) {
                return new TextLocalisedClause(R$string.card_view_pin_reminder_subtitle, null, null, 14);
            }
            return null;
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.card_view_pin_new_pin_subtitle, u.c(new TextLocalisedClause(R$string.card_view_pin_new_pin_subtitle_link, null, new Click(30, (Integer) null, (Object) null, "ACTIVATE_INSTRUCTIONS_CLAUSE_ID", false), 10)), null, 12);
        }
        if (i == 4) {
            return new TextLocalisedClause(R$string.card_view_pin_new_pin_pending_activation_subtitle, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Clause g(yv2.f fVar) {
        ShowCardPinWithCtaScreenContract$InputData showCardPinWithCtaScreenContract$InputData = this.f64430a;
        if (showCardPinWithCtaScreenContract$InputData instanceof ShowCardPinWithCtaScreenContract$InputData.ViewPinAfterCtaClick) {
            return ((ShowCardPinWithCtaScreenContract$InputData.ViewPinAfterCtaClick) showCardPinWithCtaScreenContract$InputData).f64418b;
        }
        if (!(showCardPinWithCtaScreenContract$InputData instanceof ShowCardPinWithCtaScreenContract$InputData.ViewPinImmediately)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = r.f317119a[fVar.f317107h.ordinal()];
        if (i == 1 || i == 2) {
            return new TextLocalisedClause(R$string.card_view_pin_reminder_title, null, null, 14);
        }
        if (i == 3 || i == 4) {
            return new TextLocalisedClause(R$string.card_view_pin_new_pin_title, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }
}
