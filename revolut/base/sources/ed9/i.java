package ed9;

import android.os.Parcelable;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.onboarding.impl.R$string;
import com.revolut.feature.onboarding.impl.user_migration.intro.UserMigrationIntroScreenContract$InputData;
import com.youTransactor.uCube.rpc.Constants;
import ip0.qe0;
import ip0.we0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserMigrationIntroScreenContract$InputData f124957a;

    public i(UserMigrationIntroScreenContract$InputData screenInputData) {
        Intrinsics.checkNotNullParameter(screenInputData, "screenInputData");
        this.f124957a = screenInputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        UserMigrationIntroScreenContract$InputData userMigrationIntroScreenContract$InputData = this.f124957a;
        Clause textLocalisedClause = userMigrationIntroScreenContract$InputData.f78594a;
        if (textLocalisedClause == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.user_migration_fr_branch_intro_prompt_header_title, null, null, 14);
        }
        Clause textLocalisedClause2 = userMigrationIntroScreenContract$InputData.f78595b;
        if (textLocalisedClause2 == null) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.user_migration_fr_branch_intro_prompt_header_subtitle, null, null, 14);
        }
        we0 we0Var = new we0("PROMPT_IMAGE_LIST_ID", new qe0(-2, new CdnImage("prompt", "mobile/onboarding/branch_migration/fr", null, null, null, null, Constants.TAG_OS_VERSION)));
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.user_migration_fr_branch_intro_prompt_content_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.user_migration_fr_branch_intro_prompt_content_bank_title, null, null, 14);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.user_migration_fr_branch_intro_prompt_content_bank_subtitle, null, null, 14);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        List listK = v.k(we0Var, model, new RowDelegate.Model("CONTENT_ACCOUNT_LIST_ID", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_profile, R$attr.uikit_colorLightBlue, R$attr.uikit_colorLightBlue_10), null, null, false, null, false, 62), textLocalisedClause3, null, 0, textLocalisedClause4, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("CONTENT_PROTECTION_LIST_ID", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_bank, R$attr.uikit_colorOrange, R$attr.uikit_colorOrange_10), null, null, false, null, false, 62), new TextLocalisedClause(R$string.user_migration_fr_branch_intro_prompt_content_protection_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.user_migration_fr_branch_intro_prompt_content_protection_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("CONTENT_SALARY_LIST_ID", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_coins, R$attr.uikit_colorDeepPurple, R$attr.uikit_colorDeepPurple_10), null, null, false, null, false, 62), new TextLocalisedClause(R$string.user_migration_fr_branch_intro_prompt_content_salary_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.user_migration_fr_branch_intro_prompt_content_salary_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new f(textLocalisedClause, textLocalisedClause2, listK);
    }
}
