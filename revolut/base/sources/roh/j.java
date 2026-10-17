package roh;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements poh.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f256016a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ResourceImage f256017b = new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TextLocalisedClause f256018c = new TextLocalisedClause(R$string.wealth_trading_topMovers_filters_timeSpan_title, null, null, 14);
    public static final List d;
    public static final d e;

    static {
        d dVar = d.f256009c;
        d = v.k(dVar, f.f256011c, e.f256010c, g.f256012c, c.f256008c);
        e = dVar;
    }

    private j() {
    }

    @Override // poh.l
    public final TextLocalisedClause a() {
        return f256018c;
    }

    @Override // poh.l
    public final poh.k b() {
        return e;
    }

    @Override // poh.l
    public final ResourceImage getIcon() {
        return f256017b;
    }

    @Override // poh.l
    public final List getOptions() {
        return d;
    }
}
