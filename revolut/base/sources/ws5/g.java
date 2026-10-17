package ws5;

import com.revolut.core.ui_kit.delegates.widgets.NewsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto_feed.impl.R$string;
import dsh.r;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f299662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f299663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dsh.e f299664c;

    public g(h hVar, String str, dsh.e eVar) {
        this.f299662a = hVar;
        this.f299663b = str;
        this.f299664c = eVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        boolean zIsEmpty = content.isEmpty();
        String str = this.f299663b;
        h hVar = this.f299662a;
        if (zIsEmpty) {
            return h.i(hVar, str);
        }
        r.Companion.getClass();
        int iB = r.a.b(this.f299664c, 3);
        return NewsWidgetDelegate.Model.Companion.a(NewsWidgetDelegate.Model.INSTANCE, str, new TextLocalisedClause(R$string.crypto_home_widget_news_title, null, null, 14), hVar.f299666c.a(d0.V0(content, iB)), content.size() > iB ? new TextLocalisedClause(R$string.crypto_home_feed_widget_dynamic_footer, null, null, 14) : null);
    }
}
