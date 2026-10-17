package tz6;

import aw0.o9;
import aw0.u4;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.impl.R$string;
import ggc.t;
import ggc.y;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kgc.d f275889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sf0.h f275890b;

    public q(kgc.d rewardImageMapper, sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(rewardImageMapper, "rewardImageMapper");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f275889a = rewardImageMapper;
        this.f275890b = serverErrorParser;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        u4 u4Var;
        y yVar;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f275876a, new tyg.g(this, 3), new tp8.l(this, 17), new tch.c(this, domainState, 12));
        Data data = domainState.f275876a;
        ggc.l lVar = (ggc.l) data.getContent();
        int i = R$drawable.uikit_icn_24_back_button_arrow;
        boolean z = false;
        if (lVar == null) {
            u4Var = new u4(Integer.valueOf(i), null, null, null, null, null, null);
        } else {
            t tVar = lVar.d;
            y yVar2 = lVar.f143644h;
            Image imageA = ((sic.d) this.f275889a).a(lVar.f143640a.hashCode(), tVar.f);
            TextClause textClause = new TextClause(tVar.f143668c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str = yVar2.f143672a;
            TextClause textClause2 = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
            String str2 = yVar2.f143673b;
            UrlImage urlImage = str2 != null ? new UrlImage(str2, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902) : null;
            String str3 = yVar2.f143672a;
            if (str3 == null) {
                str3 = "";
            }
            u4Var = new u4(Integer.valueOf(i), urlImage, new aw0.k(6, new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false), textClause, textClause2, null, imageA);
        }
        ggc.l lVar2 = (ggc.l) data.getContent();
        String str4 = (lVar2 == null || (yVar = lVar2.f143644h) == null) ? null : yVar.f143672a;
        AnalyticsContext analyticsContext = str4 != null ? new AnalyticsContext(v0.a.b(str4, AnalyticsContext.INSTANCE)) : null;
        g gVar = new g(new TextLocalisedClause(R$string.freelancer_perks_perk_action_email, null, null, 14), lVar2 != null && lVar2.f143652s, analyticsContext, str4 != null ? new TextLocalisedClause(R$string.freelancer_perks_perk_action_go, u.c(str4), null, 12) : null, analyticsContext, str4 != null);
        if (data.getContent() == null && data.getLoading()) {
            z = true;
        }
        return new j(list, u4Var, gVar, z);
    }
}
