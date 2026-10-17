package lkf;

import aw0.o9;
import aw0.u0;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.core.api.product.ApmProduct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes8.dex */
public final class z {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f196417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z80.b f196418b;

    public z(klf.h0 commonDataSource, z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f196417a = commonDataSource;
        this.f196418b = phoneToolsProvider;
    }

    public static CellDetailsActionDelegate.Model a(ApmProduct apmProduct, String str, String str2, TextLocalisedClause textLocalisedClause) {
        TextLocalisedClause textLocalisedClauseE = apmProduct.e();
        int iZ = apmProduct.z();
        ImageClauseTint.Color color = new ImageClauseTint.Color(R$attr.uikit_colorForeground);
        Float fValueOf = Float.valueOf(16.0f);
        ImageClause imageClause = new ImageClause(iZ, color, fValueOf, fValueOf, 16);
        TextClause textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        t0 t0Var = t0.f186434a;
        m70.a.a(t0Var);
        TextClause textClause2 = new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        return new CellDetailsActionDelegate.Model(str, textLocalisedClause, 0, null, new CompositeClause(zhm.v.k(textClause, textClause2, textLocalisedClauseE, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), imageClause), null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 10), false, false, u0.LARGE, null, 0, 0, ISO781611.BIOMETRIC_INFORMATION_TEMPLATE_TAG);
    }
}
