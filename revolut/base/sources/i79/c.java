package i79;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import ip0.wy;
import ip0.xy;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f159213a;

    public c(l80.e dateProvider, h79.a analyticsMapper) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(analyticsMapper, "analyticsMapper");
        this.f159213a = dateProvider;
    }

    public static wy a(s69.e eVar) {
        String text = eVar.f260167b;
        xy style = xy.PRIMARY_ACTIVE;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        return new wy(new TextClause(text, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), style, null);
    }
}
