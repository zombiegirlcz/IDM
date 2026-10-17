package mw4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class l {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cy0.c f209339a;

    public l(cy0.c stickyPointDecorator) {
        Intrinsics.checkNotNullParameter(stickyPointDecorator, "stickyPointDecorator");
        this.f209339a = stickyPointDecorator;
    }

    public static Clause a() {
        return yoj.b.w(sx4.g.e(2), new ImageClause(R$drawable.uikit_icn_16_info_outline, Integer.valueOf(R$attr.uikit_colorAccent), (Float) null, (Float) null, 28));
    }

    public static int b(long j2) {
        return (int) kotlin.ranges.f.i(j2, 0L, 2147483647L);
    }
}
