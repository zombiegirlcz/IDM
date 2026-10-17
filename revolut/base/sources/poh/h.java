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
public final class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f237998a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ResourceImage f237999b = new ResourceImage(R$drawable.uikit_icn_24_wealth, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TextLocalisedClause f238000c = new TextLocalisedClause(R$string.meta_collection_filter_asset_type_title, null, null, 14);
    public static final List d;
    public static final a e;

    static {
        a aVar = a.f237990c;
        d = v.k(e.f237994c, d.f237993c, b.f237991c, c.f237992c, aVar);
        e = aVar;
    }

    private h() {
    }

    @Override // poh.l
    public final TextLocalisedClause a() {
        return f238000c;
    }

    @Override // poh.l
    public final k b() {
        return e;
    }

    @Override // poh.l
    public final ResourceImage getIcon() {
        return f237999b;
    }

    @Override // poh.l
    public final List getOptions() {
        return d;
    }
}
