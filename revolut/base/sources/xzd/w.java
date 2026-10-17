package xzd;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.statements.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class w implements cli.n {

    @NotNull
    public static final u Companion = new u();
    public static final ResourceImage e = new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mzd.b f309949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0e.a f309950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zjh.j f309951c;
    public final kgm.i d;

    public w(mzd.b productSectionMapper, d0e.a statementPeriodItemMapper, zjh.j statementPeriodSummaryMapper, kgm.i statementCustomisationInteractor) {
        Intrinsics.checkNotNullParameter(productSectionMapper, "productSectionMapper");
        Intrinsics.checkNotNullParameter(statementPeriodItemMapper, "statementPeriodItemMapper");
        Intrinsics.checkNotNullParameter(statementPeriodSummaryMapper, "statementPeriodSummaryMapper");
        Intrinsics.checkNotNullParameter(statementCustomisationInteractor, "statementCustomisationInteractor");
        this.f309949a = productSectionMapper;
        this.f309950b = statementPeriodItemMapper;
        this.f309951c = statementPeriodSummaryMapper;
        this.d = statementCustomisationInteractor;
    }

    public static RowDelegate.Model a(Clause clause, TextLocalisedQuantityClause textLocalisedQuantityClause, GlyphImage glyphImage) {
        RowDelegate.Model model = new RowDelegate.Model("ID_ACCOUNTS_ITEM", glyphImage != null ? new RowDelegate.Model.MainImage.Image40(glyphImage, null, null, false, null, false, 62) : null, clause, null, 0, textLocalisedQuantityClause, null, null, 0, new pf(new TextLocalisedClause(R$string.documents_hub_product_selection_action_change, null, null, 14), null, null, false, null, null, 510), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static CellDetailsActionDelegate.Model b(int i, Clause clause, TextLocalisedClause textLocalisedClause, String str) {
        CellDetailsActionDelegate.Model model = new CellDetailsActionDelegate.Model(str, textLocalisedClause, 0, new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), clause, false, false, null, null, 0, 0, 32736);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (n) iii.c.f(domainState.f309930a, new xx9.f(this, 19), new xx9.e(this, 26), new wx6.k(this, domainState, 24));
    }
}
