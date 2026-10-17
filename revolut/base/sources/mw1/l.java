package mw1;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.breb.api.R$string;
import com.revolut.feature.apm.core.models.alias.Alias;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sv1.a f209309a;

    public l(sv1.a aliasUiMapper) {
        Intrinsics.checkNotNullParameter(aliasUiMapper, "aliasUiMapper");
        this.f209309a = aliasUiMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<Alias> list = domainState.f209303b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (Alias alias : list) {
            arrayList.add(new RowDelegate.Model(j6.a.q("ITEM_ALIAS_ID_", alias.f61879b), new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(sv1.b.a(alias), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), alias.equals(domainState.f209302a) ? new AccentCircleBadge(dw0.a.Checked) : null, null, false, null, false, 60), new TextClause(this.f209309a.a(alias), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextLocalisedClause(sv1.b.b(alias), null, null, 14), null, null, 0, null, true, null, false, null, null, null, null, null, null, alias, null, 0, 0, 0, 0, 532674520));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new i(arrayList, new lw0.a(new TextLocalisedClause(R$string.bre_b_qr_request_alias_title, null, null, 14), null, null, null, false, 30));
    }
}
