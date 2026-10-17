package dx1;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.R$string;
import dv9.r;
import kotlin.Lazy;
import yhm.j;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f120517a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f120518b = R$drawable.uikit_icn_24_swish;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TextLocalisedClause f120519c = new TextLocalisedClause(R$string.apm_product_swish_title, null, null, 14);
    public static final Lazy d = j.b(new r(18));

    private g() {
    }

    @Override // dx1.b
    public final String getId() {
        return "SWISH";
    }
}
