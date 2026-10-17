package yc0;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.backend_flow.domain.models.HtmlStringItem;
import com.revolut.feature.backend_flow.domain.models.SecondaryDescription;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class e0 implements c0 {

    @NotNull
    private static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f312419a;

    public e0(r infoListItemMapper, p htmlStringItemMapper) {
        Intrinsics.checkNotNullParameter(infoListItemMapper, "infoListItemMapper");
        Intrinsics.checkNotNullParameter(htmlStringItemMapper, "htmlStringItemMapper");
        this.f312419a = infoListItemMapper;
    }

    @Override // yc0.c0
    public final rp0.y a(SecondaryDescription description) {
        ArrayList arrayListA;
        Clause textClause;
        Intrinsics.checkNotNullParameter(description, "description");
        List items = description.f;
        LargeActionButtonDelegate.Model model = null;
        if (items != null) {
            u uVar = (u) this.f312419a;
            uVar.getClass();
            Intrinsics.checkNotNullParameter(items, "items");
            xl2.m mVar = xl2.m.ICONIZED;
            arrayListA = uVar.a(items, mVar, null);
            u.c(arrayListA, mVar);
        } else {
            arrayListA = null;
        }
        String str = description.f63602c;
        if (str == null) {
            m70.a.c(t0.f186434a);
            str = "";
        }
        TextClause textClause2 = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        HtmlStringItem item = description.e;
        if (item != null) {
            Intrinsics.checkNotNullParameter(item, "item");
            textClause = v04.b.o(item, null);
        } else {
            String str2 = description.d;
            textClause = str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        }
        rp0.t tVar = new rp0.t(textClause2, textClause, null, 28);
        rp0.l lVar = rp0.l.WINDOW;
        String str3 = description.f63603g;
        if (str3 != null) {
            LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
            TextClause textClause3 = new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            int i = R$attr.uikit_dp16;
            model = new LargeActionButtonDelegate.Model("SUBTITLE_PROMPT_BUTTON_ID", defaultFilledButton, null, textClause3, false, null, null, i, i, i, i, 496);
        }
        return new rp0.y(i2b.a.o(arrayListA, zhm.v.l(model)), tVar, lVar, null, null, null, "BACKEND_SCREEN_DELEGATES_KEY", null, null, null, 3832);
    }
}
