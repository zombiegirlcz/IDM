package tyb;

import aw0.e;
import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.impl.ui.account_migration_checklist.RevPointsAccountMigrationChecklistScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsAccountMigrationChecklistScreenContract$InputData f275540a;

    public c(RevPointsAccountMigrationChecklistScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f275540a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new cii.b(new e(false, null, null, new n6(new TextLocalisedClause(R$string.rev_points_account_migration_redemption_suggestion_cta, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), f0.f322471a, new lw0.a(new TextLocalisedClause(R$string.rev_points_account_migration_redemption_suggestion_title, u.c(nub.a.i(this.f275540a.f83763a, null, new nub.b(0), null, 5)), null, 12), new TextLocalisedClause(R$string.rev_points_account_migration_redemption_suggestion_subtitle, null, null, 14), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_rev_points, null, null, 6)), null, false, 24));
    }
}
