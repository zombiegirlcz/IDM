package ns5;

import com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.n3;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto_feed.impl.R$string;
import dsh.r;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f218753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dsh.e f218754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f218755c;

    public f(g gVar, dsh.e eVar, String str) {
        this.f218753a = gVar;
        this.f218754b = eVar;
        this.f218755c = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        cw5.a content = (cw5.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        r.Companion.getClass();
        int iB = r.a.b(this.f218754b, 5);
        return RowsWidgetDelegate.Model.Companion.d(RowsWidgetDelegate.Model.INSTANCE, this.f218755c, new BaseDynamicWidgetDelegate.BigHeaderModel("ALL_CRYPTO_WIDGET_HEADER_LIST_ID", new TextLocalisedClause(R$string.crypto_home_widget_all_crypto_title, null, null, 14), null, false, null, 56), gw5.b.b(this.f218753a.f218757c, d0.V0(content.f109531a, iB), content.f109532b, content.f109533c, 40), content.f109531a.size() > iB ? new n3(new TextLocalisedClause(R$string.crypto_home_feed_widget_dynamic_footer, null, null, 14), null) : null, null, null, null, 112);
    }
}
