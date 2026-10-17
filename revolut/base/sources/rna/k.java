package rna;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.profile.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import rhj.m;
import rm2.s;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vjg.g f255546a;

    public k(vjg.g themeCatalog) {
        Intrinsics.checkNotNullParameter(themeCatalog, "themeCatalog");
        this.f255546a = themeCatalog;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.profile_appearance_title, null, null, 14);
        qv0.i[] elements = {(qv0.i) iii.c.f(domainState.f255535a, new s(17), new m(27), new ri4.o(this, 5)), new RowDelegate.Model("ID_INTERFACE", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_smartphone, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, false, null, false, 62), new TextLocalisedClause(R$string.profileHome_appearance_item_interfaceSettings_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904), new RowDelegate.Model("ID_LANGUAGE", new ResourceImage(R$drawable.uikit_icn_24_globe, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, new TextLocalisedClause(R$string.profileHome_settings_item_language_title, null, null, 14), new TextClause(domainState.f255536b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741676)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new g(textLocalisedClause, listL);
    }
}
