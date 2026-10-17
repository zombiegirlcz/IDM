package db6;

import aw0.o9;
import ba6.l;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.widgets.QuickActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.d3;
import com.revolut.core.ui_kit.delegates.widgets.e3;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import ez0.h;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements fa6.a {

    @NotNull
    public static final C0670a Companion = new C0670a();

    /* JADX INFO: renamed from: db6.a$a, reason: collision with other inner class name */
    public static final class C0670a {
        private C0670a() {
        }
    }

    public final RowDelegate.Model a(l charity) {
        Intrinsics.checkNotNullParameter(charity, "charity");
        return new RowDelegate.Model(charity.f13938a, new RowDelegate.Model.MainImage.Image40(new UrlImage(charity.f, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (h) null, (Image) bb6.a.f14169a, false, false, new ImageTransformations(null, new CircleTransformation(Float.valueOf(0.5f), Integer.valueOf(R$attr.uikit_colorGreyTone10), false, 12), null, null, null, null, null, ISO781611.SMT_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 515578), null, null, false, null, false, 62), new TextClause(charity.f13939b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(charity.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, charity, null, 0, 0, 0, 0, 532676568);
    }

    public final QuickActionWidgetDelegate.Model b(String listId, l charity, int i) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(charity, "charity");
        return new QuickActionWidgetDelegate.Model(listId, new UrlImage(charity.f, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (h) null, (Image) null, false, false, new ImageTransformations(null, new CircleTransformation(Float.valueOf(0.5f), Integer.valueOf(R$attr.uikit_colorGreyTone10), false, 12), null, null, null, null, null, ISO781611.SMT_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 516090), null, i != 0 ? com.revolut.core.ui_kit_core.displayers.image.models.a.a(i, Integer.valueOf(R$attr.uikit_colorWidgetBackground), Integer.valueOf(R$attr.uikit_colorAccent), Integer.valueOf(R$attr.uikit_colorAccent), 2.0f) : null, new TextClause(charity.f13939b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new d3(new e3(R$drawable.uikit_icn_24_arrow_up, true), (e3) null, 6), null, null, 452);
    }
}
