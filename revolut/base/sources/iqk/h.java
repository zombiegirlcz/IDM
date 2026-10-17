package iqk;

import aw0.o9;
import bnf.r;
import com.revolut.core.ui_kit.delegates.p;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import do3.n;
import java.util.List;
import java.util.Map;
import k71.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import thf.m;
import tof.a3;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f167888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.d f167889b;

    public h(m transactionTextResourcesMapper, thf.d transactionIconResourcesMapper) {
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionIconResourcesMapper, "transactionIconResourcesMapper");
        this.f167888a = transactionTextResourcesMapper;
        this.f167889b = transactionIconResourcesMapper;
    }

    public static p c(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return new p(new MoneyClause(transaction.k, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }

    public final com.revolut.core.ui_kit.delegates.m a(a3 transaction, q extraData) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Map map = extraData.f181795b;
        return new com.revolut.core.ui_kit.delegates.m(thf.d.a(this.f167889b, transaction, extraData.d, extraData.e, extraData.f181799j, null, extraData.f181794a, map, extraData.f181806s, null, extraData.u, null, 1296), LayeredImage.Companion.f(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_exclamation_mark_sign, R$attr.uikit_colorOrange, R$attr.uikit_colorWhite, null, 2.0f, 2.0f, Float.valueOf(12.0f), 8), (ProgressStyle) null, 4);
    }

    public final TextClause b(a3 transaction, q extraData) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Map map = extraData.f181795b;
        Map map2 = extraData.d;
        Map map3 = extraData.e;
        r61.c cVar = extraData.f181799j;
        n nVar = extraData.f181794a;
        return new TextClause(((r) this.f167888a).p(transaction, map, map2, map3, cVar, nVar != null ? nVar.f116408a : null, extraData.f181806s, extraData.u), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
