package jq6;

import aw0.m6;
import aw0.n6;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.flexible.staking.consent.impl.R$string;
import ip0.ck0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ttd.a f177488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aq6.b f177489b;

    public m(ttd.a stakingInterestRateFormatter, aq6.b inputData) {
        Intrinsics.checkNotNullParameter(stakingInterestRateFormatter, "stakingInterestRateFormatter");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f177488a = stakingInterestRateFormatter;
        this.f177489b = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = 14;
        boolean z = false;
        TextDelegate.Model model = new TextDelegate.Model("TEXT_DELEGATE_LIST_ID", new TextLocalisedClause(R$string.crypto_staking_auto_earn_consent_subtitle, null, null, 14), false, new ck0(0), null, null, 0, 0, 0, 0, 2036);
        Data data = domainState.f177478a;
        koi.j[] elements = {model, data != null ? (koi.j) iii.c.f(data, new jpl.e(2), new jme.f(i), new j75.i(this, 12)) : null, new RowDelegate.Model("LIQUIDITY_ROW_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_drop, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6), new TextLocalisedClause(R$string.crypto_staking_auto_earn_consent_liquidity_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.crypto_staking_auto_earn_consent_liquidity_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_staking_auto_earn_consent_disclaimer_text, v.k(new TextLocalisedClause(R$string.crypto_staking_auto_earn_consent_disclaimer_risks, null, new Click(28, (Integer) null, (Object) a.STAKING_RISKS, "STAKING_RISKS_CLICK_ID", false), 10), new TextLocalisedClause(R$string.crypto_staking_auto_earn_consent_disclaimer_terms, null, new Click(28, (Integer) null, (Object) a.TERMS_AND_CONDITIONS, "TERMS_AND_CONDITIONS_CLICK_ID", false), 10)), null, 12);
        m6 m6Var = n6.Companion;
        return new d(listL, textLocalisedClause, m6.c(m6Var, new TextLocalisedClause(R$string.crypto_staking_auto_earn_consent_enable_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), !this.f177489b.f8270a ? m6.c(m6Var, new TextLocalisedClause(R$string.crypto_staking_auto_earn_consent_skip_action, null, null, 14), LargeActionButton.ButtonStyle.o, null, null, false, null, null, null, 1020) : null);
    }
}
