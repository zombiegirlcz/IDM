package poh;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class s implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f238010a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ResourceImage f238011b = new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TextLocalisedClause f238012c = new TextLocalisedClause(R$string.wealth_trading_topMovers_filters_timeSpan_title, null, null, 14);
    public static final List d;
    public static final n e;

    static {
        n nVar = n.f238004c;
        d = v.k(nVar, o.f238005c, p.f238006c);
        e = nVar;
    }

    private s() {
    }

    @Override // poh.l
    public final TextLocalisedClause a() {
        return f238012c;
    }

    @Override // poh.l
    public final k b() {
        return e;
    }

    @Override // poh.l
    public final ResourceImage getIcon() {
        return f238011b;
    }

    @Override // poh.l
    public final List getOptions() {
        return d;
    }
}
