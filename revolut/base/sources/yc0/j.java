package yc0;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.backend_flow.domain.models.Action;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.BottomPromptItem;
import com.revolut.feature.backend_flow.domain.models.BottomPromptScreen;
import com.revolut.feature.backend_flow.domain.models.HtmlStringItem;
import com.revolut.feature.backend_flow.domain.models.ImageItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class j implements ad0.a {

    @NotNull
    private static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f312426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f312427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f312428c;
    public final ad0.a d;
    public final ad0.p e;

    public j(q imageItemMapper, e iconMapper, g analyticsMapper, ad0.a actionsMapper, ad0.p informationItemsMapper, p htmlStringItemMapper) {
        Intrinsics.checkNotNullParameter(imageItemMapper, "imageItemMapper");
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        Intrinsics.checkNotNullParameter(analyticsMapper, "analyticsMapper");
        Intrinsics.checkNotNullParameter(actionsMapper, "actionsMapper");
        Intrinsics.checkNotNullParameter(informationItemsMapper, "informationItemsMapper");
        Intrinsics.checkNotNullParameter(htmlStringItemMapper, "htmlStringItemMapper");
        this.f312426a = imageItemMapper;
        this.f312427b = iconMapper;
        this.f312428c = analyticsMapper;
        this.d = actionsMapper;
        this.e = informationItemsMapper;
    }

    public final rp0.t a(BottomPromptScreen bottomPromptScreen) {
        HtmlClause htmlClauseO;
        Image imageA;
        String str = bottomPromptScreen.f63327b;
        rp0.v vVar = null;
        if (str == null) {
            return null;
        }
        TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        HtmlStringItem item = bottomPromptScreen.f63328c;
        if (item != null) {
            Intrinsics.checkNotNullParameter(item, "item");
            htmlClauseO = v04.b.o(item, null);
        } else {
            htmlClauseO = null;
        }
        ImageItem imageItem = bottomPromptScreen.d;
        if (imageItem != null && (imageA = this.f312426a.a(imageItem, null)) != null) {
            vVar = new rp0.v("BOTTOM_PROMPT_HEADER_ICON_ID", imageA);
        }
        return new rp0.t(textClause, htmlClauseO, vVar, 24);
    }

    public final rp0.y b(BottomPromptScreen screen) {
        ArrayList arrayListU;
        Iterable iterable;
        Intrinsics.checkNotNullParameter(screen, "screen");
        boolean z = false;
        if (uc0.b.d(screen)) {
            arrayListU = iii.c.c(3);
        } else {
            List list = (List) ue0.e.M(screen.e);
            if (list != null) {
                ArrayList<BottomPromptItem> arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (pd.b.k(((BottomPromptItem) obj2).f63325c)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                for (BottomPromptItem bottomPromptItem : arrayList) {
                    RowDelegate.Model model = new RowDelegate.Model(a0.d.n("LIST_ID_BOTTOM_PROMPT_ITEM_", bottomPromptItem.f63324b.hashCode()), new RowDelegate.Model.MainImage.Image24(e.a(this.f312427b, bottomPromptItem.f63323a, null, null, 6), z, z, 6), new HtmlClause(0, 30, (Integer) null, (Object) null, bottomPromptItem.f63324b.f63481a), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    arrayList2.add(model);
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                arrayListU = arrayList2;
            } else {
                List list2 = screen.f;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof xl2.u) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                Iterator it8 = arrayList3.iterator();
                while (it8.hasNext()) {
                    arrayList4.add(((ad0.r) this.e).a((xl2.u) it8.next()));
                }
                arrayListU = zhm.w.u(arrayList4);
            }
        }
        rp0.t tVarA = a(screen);
        rp0.l lVar = rp0.l.WINDOW;
        List list3 = screen.f63330h;
        g gVar = this.f312428c;
        if (list3 == null) {
            iterable = zhm.f0.f322471a;
        } else {
            List list4 = list3;
            ArrayList arrayList5 = new ArrayList(zhm.w.t(list4, 10));
            int i = 0;
            for (Object obj4 : list4) {
                int i2 = i + 1;
                if (i < 0) {
                    zhm.v.s();
                    throw null;
                }
                Action action = (Action) obj4;
                boolean z3 = i == 0 ? true : z;
                boolean z4 = i != zhm.v.j(list3) ? z : true;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(screen, "screen");
                LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model(a0.d.n("LIST_ID_BOTTOM_PROMPT_ACTION_", action.getF63230b().hashCode()), z3 ? LargeActionButton.ButtonStyle.f58725a : LargeActionButton.ButtonStyle.f58726b, null, new TextClause(action.getF63230b(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, null, action, new AnalyticsContext(uc0.a.a(screen, gVar.f312423b.a().f63264b, i)), 232);
                int i3 = R$attr.uikit_dp16;
                yp0.b.p(model2, z3 ? i3 : R$attr.uikit_dp0, z4 ? R$attr.uikit_dp24 : i3, i3, i3);
                arrayList5.add(model2);
                i = i2;
                z = false;
            }
            iterable = arrayList5;
        }
        return new rp0.y(zhm.d0.E0(iterable, arrayListU), tVarA, lVar, null, null, null, null, gVar.f312422a.getM(), new AnalyticsContext(gVar.a(screen)), null, 2296);
    }

    @Override // ad0.a
    public final BackendScreen j(BackendScreen screen, Action.Submit submit) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return this.d.j(screen, submit);
    }
}
