package qoh;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import poh.k;
import poh.l;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f248218a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ResourceImage f248219b = new ResourceImage(R$drawable.uikit_icn_24_filter, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TextLocalisedClause f248220c = new TextLocalisedClause(R$string.wealth_trading_topMovers_filters_moverType_title, null, null, 14);
    public static final List d;
    public static final f e;

    static {
        f fVar = f.f248214c;
        d = v.k(fVar, d.f248212c, e.f248213c);
        e = fVar;
    }

    private i() {
    }

    @Override // poh.l
    public final TextLocalisedClause a() {
        return f248220c;
    }

    @Override // poh.l
    public final k b() {
        return e;
    }

    @Override // poh.l
    public final ResourceImage getIcon() {
        return f248219b;
    }

    @Override // poh.l
    public final List getOptions() {
        return d;
    }
}
