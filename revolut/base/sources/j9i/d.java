package j9i;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import com.revolut.feature_reactions_keyboard.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import r9i.e;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f172346c;
    public final ReactionsKeyboardView d;
    public final a e;

    public d(e reactionsKeyboardViewModel, ReactionsKeyboardView reactionsKeyboardView, a configuration) {
        Intrinsics.checkNotNullParameter(reactionsKeyboardViewModel, "reactionsKeyboardViewModel");
        Intrinsics.checkNotNullParameter(reactionsKeyboardView, "reactionsKeyboardView");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f172346c = reactionsKeyboardViewModel;
        this.d = reactionsKeyboardView;
        this.e = configuration;
    }

    @Override // yji.d
    public final void N() {
        this.d.G();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q() {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j9i.d.Q():void");
    }

    @Override // yji.d
    public final void onCreate() {
        String str;
        a aVar = this.e;
        AnalyticsProduct analyticsProduct = aVar.f172344g;
        ReactionsKeyboardView reactionsKeyboardView = this.d;
        reactionsKeyboardView.setAnalyticsProduct(analyticsProduct);
        if (aVar.d) {
            reactionsKeyboardView.setTitle(new TextLocalisedClause(aVar.f172341a, null, null, 14));
        }
        reactionsKeyboardView.k = aVar.f;
        reactionsKeyboardView.setErrorMessage(new TextLocalisedClause(aVar.f172342b, null, null, 14), new TextLocalisedClause(aVar.f172343c, null, null, 14));
        reactionsKeyboardView.setSearchHint(yoj.b.w(new TextLocalisedClause(R$string.gifs_view_search_bar_placeholder, null, null, 14), new TextClause(" GIPHY", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)));
        reactionsKeyboardView.setEmptySearchTitle(new TextLocalisedClause(R$string.reactions_keyboard_search_empty, null, null, 14));
        List list = aVar.e;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            int i = c.f172345a[((b) it8.next()).ordinal()];
            if (i == 1) {
                str = "type_sticker";
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "type_gif";
            }
            arrayList.add(str);
        }
        ReactionsKeyboardView.E(reactionsKeyboardView, this.f172346c, arrayList);
    }

    @Override // yji.d
    public final void onDestroy() {
        ReactionsKeyboardView reactionsKeyboardView = this.d;
        reactionsKeyboardView.G();
        reactionsKeyboardView.Q();
    }
}
