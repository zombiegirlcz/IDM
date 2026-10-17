package idj;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mcj.c;
import mcj.d;
import rp0.l;
import rp0.t;
import rp0.y;
import thf.g;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f160495a;

    public a(g transactionItemMapper) {
        Intrinsics.checkNotNullParameter(transactionItemMapper, "transactionItemMapper");
        this.f160495a = transactionItemMapper;
    }

    public static y a(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3, List list, c cVar) {
        t tVar = new t(textLocalisedClause, textLocalisedClause2, null, 28);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        int i = R$attr.uikit_dp16;
        return new y(d0.F0(new LargeActionButtonDelegate.Model("SELL_TO_UNSTAKE_EXPANDABLE_DIALOG_BUTTON_LIST_ID", defaultFilledButton, null, textLocalisedClause3, false, null, cVar, R$attr.uikit_dp0, R$attr.uikit_dp24, i, i, 368), list), tVar, l.WINDOW, null, null, null, 1016);
    }
}
