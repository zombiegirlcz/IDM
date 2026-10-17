package ht2;

import aw0.u4;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.youTransactor.uCube.rpc.Constants;
import ip0.qe0;
import ip0.we0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class x implements cli.n, vu.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r10.w f155250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jt2.u f155251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vu.c f155252c;

    public x(r10.w bigTileOverviewStateMapper, jt2.u titleHeaderOverviewStateMapper, vu.c configurationProvider) {
        Intrinsics.checkNotNullParameter(bigTileOverviewStateMapper, "bigTileOverviewStateMapper");
        Intrinsics.checkNotNullParameter(titleHeaderOverviewStateMapper, "titleHeaderOverviewStateMapper");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        this.f155250a = bigTileOverviewStateMapper;
        this.f155251b = titleHeaderOverviewStateMapper;
        this.f155252c = configurationProvider;
    }

    @Override // vu.c
    public final su.a F() {
        return this.f155252c.F();
    }

    @Override // vu.c
    public final Set H0() {
        return this.f155252c.H0();
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (this.f155252c.F() == su.a.BIG_TILE) {
            Intrinsics.checkNotNullParameter(domainState, "domainState");
            Data referralWithIncentiveCampaign = domainState.f155221a;
            Data data = domainState.f155221a;
            r10.w wVar = this.f155250a;
            fnc.s sVar = (fnc.s) wVar.f250865a;
            TextLocalisedClause textLocalisedClauseN = sVar.n(referralWithIncentiveCampaign);
            Intrinsics.checkNotNullParameter(referralWithIncentiveCampaign, "referralWithIncentiveCampaign");
            Clause clause = (Clause) iii.c.f(referralWithIncentiveCampaign, new jpl.e(28), new jme.f(21), new jt2.c(sVar, 1));
            p pVar = new p(new u4(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow), null, clause != null ? new aw0.k(4, clause, new ResourceImage(R$drawable.uikit_icn_16_time, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite_90), (List) null, (ImageTransformations) null, (Clause) null, 246), false) : null, textLocalisedClauseN, textLocalisedClauseN, null, new CdnImage("campaign_banner", "mobile/business_premium/referrals", null, new ImageTransformations((CircleTransformation) null, true, false, (Integer) null, (Integer) null, (Integer) null, 507), null, null, Constants.TAG_F4)));
            jt2.g gVar = (jt2.g) wVar.f250866b;
            Intrinsics.checkNotNullParameter(domainState, "domainState");
            return new s((List) iii.c.f(data, new jlh.g(gVar, 24), new jnf.d(gVar, 10), new joa.j(gVar, domainState, 4)), pVar, sVar.m(data, domainState.f155225h));
        }
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data referralWithIncentiveCampaign2 = domainState.f155221a;
        Data data2 = domainState.f155221a;
        jt2.u uVar = this.f155251b;
        fnc.s sVar2 = uVar.f178335a;
        TextLocalisedClause textLocalisedClauseN2 = sVar2.n(referralWithIncentiveCampaign2);
        Intrinsics.checkNotNullParameter(referralWithIncentiveCampaign2, "referralWithIncentiveCampaign");
        Clause clause2 = (Clause) iii.c.f(referralWithIncentiveCampaign2, new jpl.e(28), new jme.f(21), new jt2.c(sVar2, 1));
        Intrinsics.checkNotNullParameter(referralWithIncentiveCampaign2, "referralWithIncentiveCampaign");
        q qVar = new q(textLocalisedClauseN2, clause2, (Image) iii.c.f(referralWithIncentiveCampaign2, new jpl.e(29), new jme.f(19), new jb8.b(20)));
        we0 we0Var = new we0("BANNER_IMAGE_LIST_ID", new qe0(-2, new CdnImage("centered_campaign_banner", "mobile/business_premium/referrals", null, new ImageTransformations(null, null, null, null, null, null, Integer.valueOf(BERTags.FLAGS), 63), null, null, Constants.TAG_F4)));
        int i = R$attr.uikit_dp0;
        yp0.b.r(we0Var, i, i, 0, 0, 12);
        List listC = zhm.u.c(we0Var);
        jt2.g gVar2 = uVar.f178336b;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new s(d0.E0((List) iii.c.f(data2, new jlh.g(gVar2, 24), new jnf.d(gVar2, 10), new joa.j(gVar2, domainState, 4)), listC), qVar, sVar2.m(data2, domainState.f155225h));
    }

    @Override // vu.c
    public final su.b o0() {
        return this.f155252c.o0();
    }
}
