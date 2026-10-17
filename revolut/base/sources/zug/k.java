package zug;

import aw0.c7;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.account_closure.impl.R$string;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ymk.y;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model a(String str, wbl.b bVar, String str2, RowDelegate.Model.c.b bVar2) {
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new InstrumentImage(bVar.i(), 30, null, null), null, null, false, null, false, 62);
        TextClause textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i = R$string.trading_upcoming_dividends_item_description;
        com.revolut.core.ui_kit.models.j jVar = c7.Companion;
        LocalDate localDateA = bVar.a();
        LocalDateClause$DateFormat.INSTANCE.getClass();
        return new RowDelegate.Model(str, image40, textClause, null, 0, new TextLocalisedClause(i, u.c(com.revolut.core.ui_kit.models.j.b(jVar, localDateA, LocalDateClause$DateFormat.Companion.f57815b)), null, 12), null, null, 0, bVar2, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
    }

    public static FullScreenStateDelegate.Model b(int i, int i2, String str) {
        return new FullScreenStateDelegate.Model(str, new TextLocalisedClause(i, null, null, 14), null, new ComplexImage.Regular(new GlyphImage(i2, null, null, 6)), null, null, false, null, null, null, 2020);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        zug.a domainState = (zug.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        d dVar = new d(new TextLocalisedClause(R$string.trading_upcoming_dividends_title, null, null, 14), new TextLocalisedClause(R$string.trading_upcoming_dividends_subtitle, null, null, 14));
        Data data = domainState.f325453b;
        List list = data != null ? (List) iii.c.f(data, new zr2.o(20), new zs4.d(3), new y(26, domainState, this)) : null;
        if (list == null) {
            list = f0.f322471a;
        }
        return new e(list, dVar);
    }
}
