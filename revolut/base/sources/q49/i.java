package q49;

import android.os.Parcelable;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.main_screen_ui_customization.impl.R$string;
import ip0.bf;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        List list = domainState.f242084b;
        List list2 = domainState.f242084b;
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            FloatingBottomBarView.Item item = (FloatingBottomBarView.Item) obj2;
            int i3 = domainState.d;
            if (i == ((i3 <= 0 || list2.size() <= i3) ? -1 : i3 - 1)) {
                eVarB.add(new ListSubheaderDelegate.Model("SEPARATOR_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.retail_tab_bar_tab_organiser_items_customize_navigation_order_hidden_tabs, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
            }
            String str = domainState.f242085c;
            String str2 = item.f58588a;
            eVarB.add(new bf(item.f58589b, item.f58590c, str2, !item.d, Intrinsics.f(str, str2)));
            i = i2;
        }
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return new e(eVarA, new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.retail_tab_bar_tab_organiser_items_customize_navigation_order_apply, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, !Intrinsics.f(domainState.f242083a, list2), null, null, 988), null, null, 55));
    }
}
