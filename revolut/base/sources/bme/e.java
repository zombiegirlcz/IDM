package bme;

import android.graphics.drawable.GradientDrawable;
import aw0.o9;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.DetailGridItemDelegate;
import com.revolut.core.ui_kit.delegates.h5;
import com.revolut.core.ui_kit.delegates.i5;
import com.revolut.core.ui_kit.delegates.widgets.TilePaginatedGridWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.tracking.v3.ShopsContext;
import j19.a0;
import j19.d0;
import j19.e0;
import j19.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k19.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk0.a f16834a;

    public e(mk0.a personalisationStorage) {
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        this.f16834a = personalisationStorage;
    }

    public final List a(f0 slot, int i, String placementId) {
        DetailGridItemDelegate.a h5Var;
        Intrinsics.checkNotNullParameter(slot, "slot");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        e0 e0Var = slot.f;
        if (e0Var == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        a0 a0Var = e0Var.f170192a;
        String str = slot.f170199b;
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        ShopsContext.a aVarNewBuilder = ShopsContext.newBuilder();
        aVarNewBuilder.j(placementId);
        boolean z = false;
        aVarNewBuilder.i(false);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        w0 w0VarA2 = AnalyticsContext.Companion.a(w0VarA);
        List list = e0Var.f170193b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it8.hasNext()) {
                boolean z3 = z;
                String str2 = slot.f170198a;
                TextClause textClause = new TextClause(a0Var.f170164a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                a aVar = new a(a0Var.f170165b, new zn.c(Integer.valueOf(z3 ? 1 : 0), Integer.valueOf(i), null, placementId, null, str));
                AnalyticsContext analyticsContext = new AnalyticsContext(w0VarA2);
                int i3 = zle.a.f323249a;
                return u.c(new TilePaginatedGridWidgetDelegate.Model(str2, textClause, arrayList, aVar, analyticsContext, Intrinsics.f(this.f16834a.a(new tk0.b("lifestyle_brand_grid_hint_shown")), Boolean.TRUE) ? null : new AnimationRequest(z3)));
            }
            Object next = it8.next();
            int i5 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            d0 d0Var = (d0) next;
            String strN = a0.d.n("BRAND_GRID_ITEM_ID_", i2);
            UrlImage urlImage = new UrlImage(d0Var.f170185b, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, z, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902);
            TextClause textClause2 = new TextClause(d0Var.f170184a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            q qVar = d0Var.e;
            int i6 = d.f16833a[qVar.f180165c.ordinal()];
            if (i6 == 1) {
                h5Var = new h5(new TagViewData(new UrlImage(qVar.f180164b, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), new TextClause(qVar.f180163a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TagViewData.TagBackground.Gradient(v.k(new Color.Solid(R$attr.uikit_colorPurple), new Color.Solid(R$attr.uikit_colorIndigo)), GradientDrawable.Orientation.TL_BR), null, new TagViewData.TagOutline.Solid(R$attr.uikit_colorTransparent), false, null, null, null, R$attr.uikit_colorWhite, null, 1512));
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                h5Var = new i5(new TagViewData(new UrlImage(qVar.f180164b, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), new TextClause(qVar.f180163a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TagViewData.TagBackground.Solid(new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorForeground), 0.2f)), null, new TagViewData.TagOutline.Solid(R$attr.uikit_colorTransparent), false, null, null, null, R$attr.uikit_colorWhite, null, 1512));
            }
            String str3 = str;
            str = str3;
            arrayList.add(new DetailGridItemDelegate.Model(strN, urlImage, textClause2, h5Var, new a(d0Var.f170186c, new zn.c(Integer.valueOf(i5), Integer.valueOf(i), d0Var.f170185b, placementId, d0Var.d, str3)), new AnalyticsContext(w0VarA2)));
            i2 = i5;
            z = z;
        }
    }
}
