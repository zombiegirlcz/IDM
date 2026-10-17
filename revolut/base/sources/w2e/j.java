package w2e;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.data.model.Data;
import com.revolut.feature.store.api.R$string;
import ip0.pb0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tx0.r4;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements n {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f294037a = u.c(new pb0("LOADING_LIST_ID"));

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        w2e.a domainState = (w2e.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f294026b;
        Data data = domainState.f294025a;
        return new c((List) iii.c.f(data, new w29.a(8), new w2.d(6), new id8.b(this, list)), (data.getContent() == null || Intrinsics.f(domainState.f294026b, domainState.f294027c)) ? false : true, u.c(new TextNavBarMenuItem("RESET_MENU_ITEM_ID", new TextLocalisedClause(R$string.store_home_brands_filters_screen_action_reset, null, null, 14), r4.ACTION, null, 8)));
    }
}
