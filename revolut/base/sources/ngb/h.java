package ngb;

import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import ip0.bk0;
import ip0.ck0;
import ip0.qe0;
import ip0.vj0;
import ip0.we0;
import ip0.yj0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.i;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements n {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f215134a;

    public h(a inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f215134a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        we0 we0Var = new we0("SALARY_REWARD_BOTTOM_SHEET_ICON", new qe0(100, new GlyphImage(R$drawable.uikit_icn_24_lock_closed, null, null, 6)));
        a aVar = this.f215134a;
        TextLocalisedClause textLocalisedClause = aVar.f215129c;
        i[] elements = {we0Var, textLocalisedClause != null ? new vj0("SALARY_REWARD_BOTTOM_SHEET_BADGE", new TagViewData(null, textLocalisedClause, new TagViewData.TagBackground.Solid(new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorForeground), 0.1f)), null, new TagViewData.TagOutline.Solid(R$attr.uikit_colorTransparent), false, null, null, null, R$attr.uikit_colorForeground, null, 1512), false, null, R$attr.uikit_dp0, R$attr.uikit_dp8, 0, 0, 408) : null, new TextDelegate.Model("SALARY_REWARD_BOTTOM_SHEET_TITLE", aVar.f215127a, false, new bk0(0), null, null, R$attr.uikit_dp0, R$attr.uikit_dp8, 0, 0, 1652), new TextDelegate.Model("SALARY_REWARD_BOTTOM_SHEET_SUBTITLE", aVar.f215128b, false, new ck0(yj0.CENTER_HORIZONTAL), null, null, R$attr.uikit_dp0, 0, 0, 0, 1908)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new cii.b(new aw0.e(false, null, null, new n6(aVar.d, LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, 55), kotlin.collections.d.L(elements), null);
    }
}
