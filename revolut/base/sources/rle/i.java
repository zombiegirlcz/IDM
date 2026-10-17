package rle;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import rd3.x;
import rhj.m;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model a(int i, Clause clause, TextLocalisedClause textLocalisedClause, String str) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(i, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60), textLocalisedClause, null, 0, clause, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
    }

    public final List b(Data data) {
        List list = data != null ? (List) iii.c.f(data, new rj7.b(24), new m(16), new x(this, 5)) : null;
        return list == null ? f0.f322471a : list;
    }
}
