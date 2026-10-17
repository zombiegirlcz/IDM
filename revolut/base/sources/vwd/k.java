package vwd;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.staking.api.R$string;
import com.revolut.feature.staking.api.model.StakingModes;
import ip0.ak0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aud.a f292711a;

    public k(aud.a riskMapper) {
        Intrinsics.checkNotNullParameter(riskMapper, "riskMapper");
        this.f292711a = riskMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        xi0.b bVar = domainState.f292704a.d;
        CurrencyClause currencyClause = new CurrencyClause(bVar, CurrencyClause.Format.DisplayName.f57755a, null, 4);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.staking_details_v2_subtitle, u.c(new CurrencyClause(bVar, CurrencyClause.Format.Ticker.f57756a, null, 4)), null, 12);
        CurrencyImage currencyImage = new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14);
        StakingModes.Manual manual = domainState.f292704a.f88088c.f88071a;
        List listB = manual == null ? f0.f322471a : ((iwd.b) this.f292711a).b(manual);
        InputDisclosureDelegate.Model model = new InputDisclosureDelegate.Model("INPUT_DISCLOSURE_LIST_ID", new TextLocalisedClause(R$string.staking_details_learn_more, null, null, 14), null, null, null, 1020);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new g(currencyClause, textLocalisedClause, currencyImage, textLocalisedClause2, i2b.a.o(i2b.a.p(listB, model), v.l(com.bumptech.glide.d.k(domainState.f292705b) ? new TextDelegate.Model("UAE_DISCLAIMER_FOOTER_LIST_ID", new TextLocalisedClause(R$string.staking_details_disclaimer_uae, v.k(new TextLocalisedClause(R$string.staking_details_disclaimer_terms_and_conditions, null, new Click(30, (Integer) null, (Object) null, "STAKING_DETAILS_TERMS_AND_CONDITIONS_LINK_ID", false), 10), new TextLocalisedClause(R$string.staking_details_disclaimer_risk_disclosure, null, new Click(30, (Integer) null, (Object) null, "STAKING_DETAILS_RISK_DISCLOSURE_LINK_ID", false), 10)), null, 12), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2032) : null)));
    }
}
