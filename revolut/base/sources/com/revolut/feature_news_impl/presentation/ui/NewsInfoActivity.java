package com.revolut.feature_news_impl.presentation.ui;

import a0.d;
import a08.q;
import a08.r;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import aw0.ka;
import aw0.o9;
import b9i.c;
import b9i.j;
import b9i.k;
import bq.i;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature_news_api.NewsInfoFeatureConfig;
import com.revolut.feature_news_impl.R$id;
import com.revolut.feature_news_impl.R$layout;
import com.revolut.feature_news_impl.R$menu;
import com.revolut.feature_news_impl.R$string;
import com.revolut.feature_news_impl.presentation.ui.NewsInfoActivity;
import com.revolut.retail.common.ui.model.NewsUiItem;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.uicomponent.R$dimen;
import com.revolut.uicomponent.toolbar.app_bar.RevolutToolbar;
import f9b.f;
import gmf.b;
import j90.a;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kotlin.text.d0;
import kotlin.text.t;
import le.u1;
import org.joda.time.Instant;
import pfm.h;
import pri.e;
import q06.l;
import sri.m;
import te0.w;
import tqi.g;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_news_impl/presentation/ui/NewsInfoActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "Lb9i/b;", "Lb9i/c;", "<init>", "()V", "feature_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NewsInfoActivity extends BaseDelegatesActivity implements c {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f97429x0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f97430r0 = "NEWS_INFO_FLOW";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final a f97431s0 = u1.w(this, R$id.toolbar);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final a f97432t0 = u1.w(this, R$id.button_action);
    public final a u0 = u1.w(this, R$id.expiry_title);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final a f97433v0 = u1.w(this, R$id.webview);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public a9i.a f97434w0;

    static {
        h0 h0Var = new h0(NewsInfoActivity.class, "toolbar", "getToolbar()Lcom/revolut/uicomponent/toolbar/app_bar/RevolutToolbar;", 0);
        p0 p0Var = o0.f186429a;
        f97429x0 = new KProperty[]{p0Var.j(h0Var), p.a.y(NewsInfoActivity.class, "buttonAction", "getButtonAction()Lcom/revolut/core/ui_kit/views/LargeActionButton;", 0, p0Var), p.a.y(NewsInfoActivity.class, "expiryTitle", "getExpiryTitle()Landroid/widget/TextView;", 0, p0Var), p.a.y(NewsInfoActivity.class, "webview", "getWebview()Landroid/webkit/WebView;", 0, p0Var)};
    }

    public static String b1(int i) {
        return d.v(new Object[]{Integer.valueOf(i & 16777215)}, 1, "#%06X", "format(...)");
    }

    @Override // nri.b
    public final e F0() {
        a9i.a aVar = this.f97434w0;
        if (aVar == null) {
            Intrinsics.r("component");
            throw null;
        }
        NewsInfoFeatureConfig newsInfoFeatureConfig = aVar.f2659b;
        f fVar = (f) aVar.f2661g.get();
        a9i.c cVar = aVar.f2660c;
        g gVarE = cVar.f2664a.e();
        m mVarL = i.l(aVar.f2658a);
        xoj.a aVarA = cVar.f2665b.a();
        s.j(aVarA);
        a61.a aVarD = cVar.f2666c.d();
        l lVarA = cVar.d.a();
        s.j(lVarA);
        fk3.a aVarA2 = cVar.e.a();
        s.j(aVarA2);
        return new b9i.l(newsInfoFeatureConfig, fVar, gVarE, mVarL, aVarA, aVarD, lVarA, aVarA2, new c9i.c());
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF96958s0() {
        return this.f97430r0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        a9i.a aVar = this.f97434w0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    public final RevolutToolbar Z0() {
        return (RevolutToolbar) this.f97431s0.getValue(this, f97429x0[0]);
    }

    public final void c1(NewsUiItem news, yoj.f features) throws IOException {
        Clause textClause;
        Intrinsics.checkNotNullParameter(news, "news");
        Intrinsics.checkNotNullParameter(features, "features");
        String str = news.f98598b;
        String str2 = news.f98601h;
        KProperty[] kPropertyArr = f97429x0;
        if (str != null) {
            int dimensionPixelSize = (int) (r3.getDimensionPixelSize(R$dimen.dp_64) / getResources().getDisplayMetrics().density);
            a9i.a aVar = this.f97434w0;
            if (aVar == null) {
                Intrinsics.r("component");
                throw null;
            }
            c90.c cVarH = b.h(aVar.f2658a);
            String strH = d.h(dimensionPixelSize, "px");
            int i = R$attr.uikit_colorBackground;
            Context context = cVarH.f22265a;
            String strB1 = b1(kli.a.s(i, context));
            String strB12 = b1(kli.a.s(R$attr.uikit_colorForeground, context));
            String strB13 = b1(kli.a.s(R$attr.uikit_colorGreyTone50, context));
            String strB14 = b1(kli.a.s(R$attr.uikit_colorAccent, context));
            StringBuilder sbM = v0.a.m("\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">\n<head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n    <meta name=\"language\" content=\"en\"/>\n    <style>\n        body, html {\n        margin: 10px;\n        margin-bottom: ", strH, ";\n        padding: 0;\n        background-color: ", strB1, ";\n        font-family: \"Roboto-Regular\";\n        font-size: 14px;\n        color: ");
            j6.a.D(sbM, strB13, ";\n        }\n        h2 {\n        font-family: \"Roboto-Medium\";\n        font-size: 20px;\n        text-align: center;\n        font-weight: normal;\n        color: ", strB12, ";\n        }\n        a {\n        color: ");
            sbM.append(strB14);
            sbM.append(";\n        }\n    </style>\n</head>\n<body>\n");
            sbM.append(str);
            sbM.append("\n</body>\n</html>\n    ");
            String strE = t.e(sbM.toString());
            KProperty kProperty = kPropertyArr[3];
            a aVar2 = this.f97433v0;
            ((WebView) aVar2.getValue(this, kProperty)).setWebViewClient(new c9i.b(this, 0));
            ((WebView) aVar2.getValue(this, kPropertyArr[3])).loadDataWithBaseURL(null, strE, "text/html", "utf-8", null);
        }
        if (Z0().getMenu() != null) {
            Menu menu = Z0().getMenu();
            MenuItem menuItemFindItem = menu != null ? menu.findItem(R$id.menu_action_share) : null;
            if (menuItemFindItem != null) {
                String str3 = news.d;
                menuItemFindItem.setVisible(str3 != null && (d0.W(str3) ^ true));
            }
        }
        KProperty kProperty2 = kPropertyArr[1];
        a aVar3 = this.f97432t0;
        LargeActionButton largeActionButton = (LargeActionButton) aVar3.getValue(this, kProperty2);
        String str4 = news.f98599c;
        largeActionButton.setVisibility((str4 == null || str4.length() == 0) ? 8 : 0);
        if (str2 != null) {
            ((LargeActionButton) aVar3.getValue(this, kPropertyArr[1])).setText(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        }
        Instant instant = news.f98604m;
        if (instant != null) {
            int i2 = R$string.news_title_expire;
            TimeClause timeClause = new TimeClause(instant.getMillis(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12);
            m70.a.t(t0.f186434a);
            textClause = new TextLocalisedClause(i2, u.c(new CompositeClause(v.k(timeClause, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TimeClause(instant.getMillis(), TimeClause.Format.TimeDefault.f57977b, null, null, 12)), null, null, null, 14)), null, 12);
        } else {
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        ty0.c.b(jh.d.f(this).b0(), textClause, (TextView) this.u0.getValue(this, kPropertyArr[2]), null, null, 12);
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f97434w0 = new a9i.a(((a9i.c) com.bumptech.glide.c.l(this).b(null, this.f97430r0)).f, rd0.e.g(this, bundle, null), (NewsInfoFeatureConfig) G0());
        super.onCreate(bundle);
        setContentView(R$layout.activity_news_info);
        Z0().setTitle("");
        final int i = 0;
        Z0().setNavigationOnClickListener(new View.OnClickListener(this) { // from class: c9i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewsInfoActivity f22473b;

            {
                this.f22473b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                efm.b hVar;
                int i2 = i;
                NewsInfoActivity newsInfoActivity = this.f22473b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = NewsInfoActivity.f97429x0;
                        b9i.b bVar = (b9i.b) newsInfoActivity.f218652a0;
                        if (bVar != null) {
                            com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, ((b9i.l) bVar).f13798j);
                        }
                        break;
                    default:
                        KProperty[] kPropertyArr2 = NewsInfoActivity.f97429x0;
                        b9i.b bVar2 = (b9i.b) newsInfoActivity.f218652a0;
                        if (bVar2 != null) {
                            b9i.l lVar = (b9i.l) bVar2;
                            NewsUiItem newsUiItem = lVar.f13802p;
                            if ((newsUiItem != null ? newsUiItem.f98599c : null) != null && newsUiItem != null) {
                                String str = newsUiItem.f98599c;
                                if (str == null) {
                                    hVar = pfm.m.f235744a;
                                    Intrinsics.checkNotNullExpressionValue(hVar, "complete(...)");
                                } else {
                                    hVar = new h(new ufm.i(o70.a.i(((cpj.b) lVar.k).h()), new b79.g(new b9i.e(lVar, str, 0), 13), 0), 4);
                                    Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
                                }
                                efm.b bVarH = hVar.h(j.f13795a);
                                Intrinsics.checkNotNullExpressionValue(bVarH, "compose(...)");
                                Function1 function1K = lVar.K();
                                pfm.a aVar = new pfm.a(bVarH, new a08.s(5, new b9i.h(new BreadcrumbException(), 4)), 2);
                                Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                                ofm.h hVarW = aVar.w(new r(8, function1K), new q(9, k.f13796a));
                                Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                                w.j0(lVar.f239031a, hVarW);
                            }
                        }
                        break;
                }
            }
        });
        Z0().inflateMenu(R$menu.fragment_news_info);
        Z0().setOnMenuItemClickListener(new c64.a(this, 13));
        final int i2 = 1;
        ((LargeActionButton) this.f97432t0.getValue(this, f97429x0[1])).setOnClickListener(new View.OnClickListener(this) { // from class: c9i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewsInfoActivity f22473b;

            {
                this.f22473b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                efm.b hVar;
                int i22 = i2;
                NewsInfoActivity newsInfoActivity = this.f22473b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NewsInfoActivity.f97429x0;
                        b9i.b bVar = (b9i.b) newsInfoActivity.f218652a0;
                        if (bVar != null) {
                            com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, ((b9i.l) bVar).f13798j);
                        }
                        break;
                    default:
                        KProperty[] kPropertyArr2 = NewsInfoActivity.f97429x0;
                        b9i.b bVar2 = (b9i.b) newsInfoActivity.f218652a0;
                        if (bVar2 != null) {
                            b9i.l lVar = (b9i.l) bVar2;
                            NewsUiItem newsUiItem = lVar.f13802p;
                            if ((newsUiItem != null ? newsUiItem.f98599c : null) != null && newsUiItem != null) {
                                String str = newsUiItem.f98599c;
                                if (str == null) {
                                    hVar = pfm.m.f235744a;
                                    Intrinsics.checkNotNullExpressionValue(hVar, "complete(...)");
                                } else {
                                    hVar = new h(new ufm.i(o70.a.i(((cpj.b) lVar.k).h()), new b79.g(new b9i.e(lVar, str, 0), 13), 0), 4);
                                    Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
                                }
                                efm.b bVarH = hVar.h(j.f13795a);
                                Intrinsics.checkNotNullExpressionValue(bVarH, "compose(...)");
                                Function1 function1K = lVar.K();
                                pfm.a aVar = new pfm.a(bVarH, new a08.s(5, new b9i.h(new BreadcrumbException(), 4)), 2);
                                Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                                ofm.h hVarW = aVar.w(new r(8, function1K), new q(9, k.f13796a));
                                Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                                w.j0(lVar.f239031a, hVarW);
                            }
                        }
                        break;
                }
            }
        });
    }
}
