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
public final class o implements poh.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f256024a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ResourceImage f256025b = new ResourceImage(R$drawable.uikit_icn_24_filter, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TextLocalisedClause f256026c = new TextLocalisedClause(R$string.wealth_trading_topMovers_filters_moverType_title, null, null, 14);
    public static final List d;
    public static final k e;

    static {
        k kVar = k.f256019c;
        d = v.k(kVar, l.f256020c);
        e = kVar;
    }

    private o() {
    }

    @Override // poh.l
    public final TextLocalisedClause a() {
        return f256026c;
    }

    @Override // poh.l
    public final poh.k b() {
        return e;
    }

    @Override // poh.l
    public final ResourceImage getIcon() {
        return f256025b;
    }

    @Override // poh.l
    public final List getOptions() {
        return d;
    }
}
