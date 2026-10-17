package xod;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class t {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static CompositeClause a(int i, int i2, int i3) {
        ImageClauseTint.Color color = new ImageClauseTint.Color(i3);
        Float fValueOf = Float.valueOf(10.0f);
        List listK = zhm.v.k(new ImageClause(i2, color, fValueOf, fValueOf, 16), new TextLocalisedClause(i, null, new Custom(Integer.valueOf(i3), false, null, false, null, 254), 10));
        m70.a.t(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }
}
