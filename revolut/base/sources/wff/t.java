package wff;

import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.transaction.troubleshooter.api.domain.models.Troubleshooter;
import com.revolut.feature.transaction.troubleshooter.api.domain.models.TroubleshooterAction;
import com.revolut.feature.transaction.troubleshooter.api.domain.models.TroubleshooterSubContent;
import com.revolut.feature.transaction.troubleshooter.api.domain.models.TroubleshooterSubContentItem;
import com.revolut.retail.common.ui.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class t implements jki.p {

    @NotNull
    private static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d8d.d f297103a;

    public t(d8d.d helpFeedbackMapper, lde.n widgetsInteractor) {
        Intrinsics.checkNotNullParameter(helpFeedbackMapper, "helpFeedbackMapper");
        Intrinsics.checkNotNullParameter(widgetsInteractor, "widgetsInteractor");
        this.f297103a = helpFeedbackMapper;
    }

    public static p b(TroubleshooterAction troubleshooterAction, String str, LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton) {
        return new p(new TextClause(troubleshooterAction.f91847b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), defaultFilledButton, l7d.a.d(4, str, troubleshooterAction.f91846a));
    }

    public static PlainTextDelegate.Model c(String str, String str2) {
        return new PlainTextDelegate.Model("TROUBLESHOOTER_DETAIL_ITEM_PREFIX_HTML", (Clause) null, (Clause) new HtmlClause(0, 30, (Integer) null, (Object) null, str), (v5) null, str2 != null ? new UrlImage(str2, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, new ImageTransformations((CircleTransformation) null, true, false, (Integer) 8, (Integer) null, (Integer) null, 443), (Integer) null, (Integer) null, false, false, (Clause) null, 516090) : null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65386);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.revolut.core.ui_kit.models.Style, java.lang.String, java.util.List, wff.p] */
    @Override // jki.p
    public final jki.m a(jki.i iVar) throws Throwable {
        Throwable th10;
        ArrayList arrayList;
        List list;
        RowDelegate.Model.MainImage.Image24 image24;
        m domainState = (m) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Troubleshooter troubleshooter = domainState.f297093b;
        qv0.i iVarX = domainState.f297094c;
        String str = domainState.f297092a;
        Data data = domainState.d;
        ArrayList arrayList2 = new ArrayList();
        if (iVarX != null) {
            RowDelegate.Model model = iVarX instanceof RowDelegate.Model ? (RowDelegate.Model) iVarX : null;
            if (model != null) {
                iVarX = RowDelegate.Model.x(model, null, null, null, null, null, 0, null, false, null, null, 0, 0, 0, 0, null, -2049, 15);
            }
            qv0.i iVar2 = iVarX;
            yp0.b.l(iVar2, 0, 0, 0, 0, null, false, 63);
            arrayList2.add(iVar2);
        }
        String str2 = troubleshooter.f91842c;
        ArrayList arrayList3 = troubleshooter.f91843g;
        String str3 = troubleshooter.f;
        TroubleshooterSubContent troubleshooterSubContent = troubleshooter.f91844h;
        List list2 = (List) iii.c.f(data, new wdb.b(this, 12), new wf0.b(5), new soc.f(this, 15, str, str2));
        String str4 = troubleshooter.e;
        int i = 1;
        if (str4 != null) {
            if (troubleshooterSubContent == null || !(!troubleshooterSubContent.f91850b.isEmpty())) {
                ArrayList arrayListE0 = d0.E0(list2, zhm.u.c(c(str4, str3)));
                yp0.b.k(arrayListE0, 0, 0, 0, 0, 31);
                a0.x(arrayListE0, arrayList2);
            } else {
                PlainTextDelegate.Model modelC = c(str4, str3);
                yp0.b.l(modelC, 0, 0, 0, 0, null, false, 63);
                arrayList2.add(modelC);
            }
        }
        int i2 = 2;
        if (troubleshooterSubContent != null) {
            ArrayList arrayList4 = troubleshooterSubContent.f91850b;
            int size = arrayList4.size();
            th10 = null;
            ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
            int i3 = 0;
            for (Object obj2 : arrayList4) {
                int i5 = i3 + 1;
                if (i3 < 0) {
                    zhm.v.s();
                    throw null;
                }
                TroubleshooterSubContentItem troubleshooterSubContentItem = (TroubleshooterSubContentItem) obj2;
                mff.b bVar = troubleshooterSubContent.f91849a;
                String strN = a0.d.n("TROUBLESHOOTER_DETAIL_ITEM_PREFIX_", i5);
                int i6 = s.f297102a[bVar.ordinal()];
                if (i6 != i) {
                    if (i6 != i2 && i6 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    image24 = null;
                    list = list2;
                } else if (size > i) {
                    list = list2;
                    image24 = new RowDelegate.Model.MainImage.Image24(com.revolut.core.ui_kit_core.displayers.image.models.a.b(i5, Integer.valueOf(R$attr.uikit_colorWidgetBackground), Integer.valueOf(R$attr.uikit_colorForeground), Integer.valueOf(R$attr.uikit_colorForeground), 16), false, false, 6);
                } else {
                    list = list2;
                    image24 = null;
                }
                TextClause textClause = new TextClause(troubleshooterSubContentItem.f91851a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TextClause textClause2 = new TextClause(troubleshooterSubContentItem.f91852b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TroubleshooterAction troubleshooterAction = troubleshooterSubContentItem.f91853c;
                arrayList5.add(new RowDelegate.Model(strN, image24, textClause, null, 0, textClause2, troubleshooterAction != null ? new TextClause(troubleshooterAction.f91847b, (Style) new Click(28, (Integer) null, (Object) troubleshooterAction, troubleshooterAction.f91846a, false), (Integer) null, false, (o9) null, (List) null, 124) : null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868760));
                i3 = i5;
                list2 = list;
                i2 = 2;
                i = 1;
            }
            ArrayList arrayListE02 = d0.E0(list2, arrayList5);
            yp0.b.k(arrayListE02, 0, 0, 0, 0, 31);
            arrayList = arrayListE02;
        } else {
            th10 = null;
            arrayList = null;
        }
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        if (arrayList3.size() > 2) {
            ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList3, 10));
            int i21 = 0;
            for (Object obj3 : arrayList3) {
                int i22 = i21 + 1;
                if (i21 < 0) {
                    zhm.v.s();
                    throw th10;
                }
                TroubleshooterAction troubleshooterAction2 = (TroubleshooterAction) obj3;
                LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model(j6.a.q("TROUBLESHOOTER_DETAIL_ITEM_PREFIX_", troubleshooterAction2.f91846a), i21 == 0 ? LargeActionButton.ButtonStyle.f58725a : LargeActionButton.ButtonStyle.f58726b, null, new TextClause(troubleshooterAction2.f91847b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, null, troubleshooterAction2, l7d.a.d(4, str, troubleshooterAction2.f91846a), 232);
                yp0.b.r(model2, 0, 0, 0, 0, 15);
                arrayList6.add(model2);
                i21 = i22;
            }
            arrayList2.addAll(arrayList6);
        }
        TroubleshooterAction troubleshooterAction3 = troubleshooter.i;
        if (troubleshooterAction3 != null) {
            CellDetailsChevronDelegate.Model model3 = new CellDetailsChevronDelegate.Model("TROUBLESHOOTER_DETAIL_ITEM_PREFIX_HELP", new TextClause(troubleshooterAction3.f91847b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, false, troubleshooterAction3, l7d.a.d(4, str, troubleshooterAction3.f91846a), null, 1996);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            arrayList2.add(model3);
        }
        TextClause textClause3 = new TextClause(troubleshooter.f91841b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str5 = troubleshooter.d;
        TextClause textClause4 = str5 != null ? new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : th10;
        ?? r2 = th10;
        List listC = zhm.u.c(new TextNavBarMenuItem("DONE_ACTION_ID", new TextLocalisedClause(R$string.common_action_done, r2, r2, 14), null, l7d.a.d(6, str, r2), 4));
        int size2 = arrayList3.size();
        return new q(arrayList2, textClause3, textClause4, listC, size2 != 1 ? size2 != 2 ? new l(r2, r2, BitmapDescriptorFactory.HUE_RED) : new l(b((TroubleshooterAction) arrayList3.get(0), str, LargeActionButton.ButtonStyle.f58725a), b((TroubleshooterAction) arrayList3.get(1), str, LargeActionButton.ButtonStyle.f58726b), 160.0f) : new l(b((TroubleshooterAction) arrayList3.get(0), str, LargeActionButton.ButtonStyle.f58725a), null, 80.0f));
    }
}
