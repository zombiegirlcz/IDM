package qw1;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.core.models.alias.Alias;
import ip0.qd0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sv1.a f249744a;

    public i(sv1.a aliasUiMapper) {
        Intrinsics.checkNotNullParameter(aliasUiMapper, "aliasUiMapper");
        this.f249744a = aliasUiMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f249734a;
        Set set = domainState.f249735b;
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            Alias alias = (Alias) obj2;
            arrayList.add(new SelectableDelegate.Model(a0.d.n("BREB_REGISTER_ALIAS_ITEM_ID_", i), new RowDelegate.Model(a0.d.n("INNER_BREB_REGISTER_ALIAS_ITEM_ID_", i), new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(sv1.b.a(alias), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60), new TextClause(this.f249744a.a(alias), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextLocalisedClause(sv1.b.b(alias), null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, alias, null, 0, 0, 0, 0, 532676568), set.contains(alias) ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, alias, null, false, 32504));
            i = i2;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new e(arrayList, !set.isEmpty());
    }
}
