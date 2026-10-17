package xka;

import aw0.c4;
import aw0.d4;
import aw0.o9;
import bka.b1;
import bka.c1;
import bka.e1;
import bka.l0;
import bka.n0;
import bka.t0;
import bka.x0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.lightprompt.LightPromptViewModel;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.media.models.UrlMedia;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.kompot.common.R$string;
import ip0.ak0;
import ip0.dk0;
import ip0.y20;
import ip0.z20;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.t5;
import mx0.u5;
import mx0.v5;
import org.jmrtd.lds.LDSFile;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zka.c f306629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zka.f f306630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zja.b f306631c;

    public b0(zka.h heroItemMapper, zka.c bulletsItemMapper, zka.e cardItemMapper, zka.a cardV2ItemUiMapper, zka.j textItemMapper, zka.k textV2ItemUiMapper, zka.i subHeaderItemMapper, zka.b lightPromptFullScreenParamsMapper, zka.f disclaimerItemMapper, zja.b productArticleToggles) {
        Intrinsics.checkNotNullParameter(heroItemMapper, "heroItemMapper");
        Intrinsics.checkNotNullParameter(bulletsItemMapper, "bulletsItemMapper");
        Intrinsics.checkNotNullParameter(cardItemMapper, "cardItemMapper");
        Intrinsics.checkNotNullParameter(cardV2ItemUiMapper, "cardV2ItemUiMapper");
        Intrinsics.checkNotNullParameter(textItemMapper, "textItemMapper");
        Intrinsics.checkNotNullParameter(textV2ItemUiMapper, "textV2ItemUiMapper");
        Intrinsics.checkNotNullParameter(subHeaderItemMapper, "subHeaderItemMapper");
        Intrinsics.checkNotNullParameter(lightPromptFullScreenParamsMapper, "lightPromptFullScreenParamsMapper");
        Intrinsics.checkNotNullParameter(disclaimerItemMapper, "disclaimerItemMapper");
        Intrinsics.checkNotNullParameter(productArticleToggles, "productArticleToggles");
        this.f306629a = bulletsItemMapper;
        this.f306630b = disclaimerItemMapper;
        this.f306631c = productArticleToggles;
    }

    public static u a(r rVar) {
        return new u(new LightPromptViewModel.Error(new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), rVar.f306647b), rVar.f306647b);
    }

    public static d4 d(aka.b bVar) {
        c4 c4Var;
        HtmlClause htmlClause = new HtmlClause(0, 26, Integer.valueOf(R$attr.uikit_colorForeground), (Object) null, bVar.f5747a);
        int i = a0.f306626a[bVar.f5748b.ordinal()];
        if (i == 1) {
            c4Var = c4.ON_MEDIA;
        } else if (i == 2) {
            c4Var = c4.LARGE;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            c4Var = c4.MEDIUM;
        }
        return new d4(htmlClause, c4Var);
    }

    public final List b(n0 n0Var) {
        String str;
        y20 y20Var;
        if (n0Var instanceof bka.k) {
            bka.k bulletItem = (bka.k) n0Var;
            Intrinsics.checkNotNullParameter(bulletItem, "bulletItem");
            ArrayList arrayListA = this.f306629a.a(bulletItem);
            yp0.b.k(arrayListA, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
            return arrayListA;
        }
        j jVar = null;
        if (n0Var instanceof bka.r) {
            bka.r cardItem = (bka.r) n0Var;
            Intrinsics.checkNotNullParameter(cardItem, "cardItem");
            bka.p pVar = cardItem.f16333a;
            String strQ = j6.a.q("CardItem_", pVar.e);
            String str2 = pVar.f16329a;
            TextClause textClause = str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
            String str3 = pVar.f16330b;
            TextClause textClause2 = str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
            UrlMedia urlMedia = new UrlMedia(pVar.e);
            int i = zka.d.f322929a[pVar.f16331c.ordinal()];
            if (i == 1) {
                y20Var = y20.LARGE;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                y20Var = y20.SMALL;
            }
            z20 z20Var = new z20(strQ, textClause, textClause2, urlMedia, y20Var, !pVar.d);
            yp0.b.r(z20Var, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 12);
            return zhm.u.c(z20Var);
        }
        if (n0Var instanceof l0) {
            l0 heroItem = (l0) n0Var;
            Intrinsics.checkNotNullParameter(heroItem, "heroItem");
            return zhm.u.c(zka.h.a(heroItem, false, null));
        }
        if (n0Var instanceof t0) {
            t0 subHeaderItem = (t0) n0Var;
            Intrinsics.checkNotNullParameter(subHeaderItem, "subHeaderItem");
            String str4 = subHeaderItem.f16339a.f16337a;
            return zhm.u.c(new TextDelegate.Model(j6.a.q("SubHeaderItem_", str4), new TextClause(str4, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), false, new dk0(0), null, null, 0, R$attr.uikit_dp32, 0, 0, 1776));
        }
        if (!(n0Var instanceof c1)) {
            if (!(n0Var instanceof bka.b0)) {
                if (Intrinsics.f(n0Var, e1.INSTANCE)) {
                    return f0.f322471a;
                }
                throw new NoWhenBranchMatchedException();
            }
            bka.b0 disclaimerItem = (bka.b0) n0Var;
            Intrinsics.checkNotNullParameter(disclaimerItem, "disclaimerItem");
            String strQ2 = j6.a.q("DisclaimerItem_", disclaimerItem.f16298a.f16344a);
            zka.f fVar = this.f306630b;
            TextClause textClauseA = ((vka.a) fVar.f322930a).a(disclaimerItem, fVar.f322931b);
            ak0 ak0Var = new ak0(null, null, 3);
            int i2 = R$attr.uikit_dp0;
            TextDelegate.Model model = new TextDelegate.Model(strQ2, textClauseA, false, ak0Var, null, null, i2, i2, i2, i2, 116);
            yp0.b.r(model, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 12);
            return zhm.u.c(model);
        }
        c1 textItem = (c1) n0Var;
        b1 b1Var = textItem.f16304a;
        Intrinsics.checkNotNullParameter(textItem, "textItem");
        x0 x0Var = b1Var.d;
        v5 u5Var = x0Var != null ? new u5(0, new TextLocalisedClause(com.revolut.feature.product_article.impl.R$string.product_article_text_item, zhm.u.c(x0Var.f16346a), null, 12)) : t5.e;
        String str5 = b1Var.f16301c;
        UrlImage urlImage = str5 != null ? new UrlImage(str5, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, null, null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_SOD_TAG), null, null, false, false, 507902) : null;
        String strQ3 = j6.a.q("TextItem_", b1Var.f16300b);
        String str6 = b1Var.f16299a;
        TextClause textClause3 = str6 != null ? new TextClause(str6, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        HtmlClause htmlClause = new HtmlClause(3, 28, (Integer) null, (Object) null, b1Var.f16300b);
        x0 x0Var2 = b1Var.d;
        if (x0Var2 != null && (str = x0Var2.f16347b) != null) {
            jVar = new j(str);
        }
        PlainTextDelegate.Model model2 = new PlainTextDelegate.Model(strQ3, urlImage, textClause3, htmlClause, u5Var, (List) null, (String) null, jVar, (AnalyticsContext) null, 0, 0, 0, 0, 32192);
        yp0.b.l(model2, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, null, false, 60);
        return zhm.u.c(model2);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        r domainState = (r) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (u) iii.c.f(domainState.f306646a, new xe7.a(domainState, 13), new xif.k(this, domainState), new wx6.k(this, domainState, 13));
    }
}
