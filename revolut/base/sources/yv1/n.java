package yv1;

import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.breb.api.R$string;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasStatus;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sv1.a f317097a;

    public n(sv1.a aliasUiMapper) {
        Intrinsics.checkNotNullParameter(aliasUiMapper, "aliasUiMapper");
        this.f317097a = aliasUiMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Alias alias = domainState.f317084a;
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(sv1.b.a(alias), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62);
        sv1.a aVar = this.f317097a;
        List listC = u.c(new RowDelegate.Model("ITEM_ACTIVE_ALIAS_ID", image40, new TextClause(aVar.a(alias), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextLocalisedClause(sv1.b.b(alias), null, null, 14), null, null, 0, null, true, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        List list = listC;
        List list2 = domainState.f317085b;
        ArrayList<Alias> arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (Intrinsics.f(((Alias) obj2).f61880c, AliasStatus.AVAILABLE.f61886b)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (Alias alias2 : arrayList) {
            arrayList2.add(new RowDelegate.Model(j6.a.q("ITEM_REPLACE_ALIAS_ID_", alias2.f61879b), new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(sv1.b.a(alias2), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), new TextClause(aVar.a(alias2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextLocalisedClause(sv1.b.b(alias2), null, null, 14), null, null, 0, new pf(new TextLocalisedClause(R$string.bre_b_area_more_replace_key_cta_button_title, null, null, 14), null, null, false, null, null, 510), false, null, false, null, null, null, null, null, null, alias2, null, 0, 0, 0, 0, 532673496));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return new j(d0.E0(arrayList2, list), new lw0.a(new TextLocalisedClause(R$string.bre_b_area_more_replace_key_title, null, null, 14), new TextLocalisedClause(R$string.bre_b_area_more_replace_key_subtitle, null, null, 14), null, new lw0.j("ITEM_ADD_MENU_ID", new fw0.b(null)), false, 20));
    }
}
