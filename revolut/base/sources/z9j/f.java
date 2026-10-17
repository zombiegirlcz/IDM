package z9j;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.retail.feature.crypto.disclaimer.api.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import te0.w;
import z8k.i;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements n {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f320508a = w.y0(new i(3));

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Companion.getClass();
        List list = (List) f320508a.getValue();
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            g gVar = (g) obj2;
            PlainTextDelegate.Model model = new PlainTextDelegate.Model(a0.d.n("disclosure_item_", i), (UrlImage) null, gVar.f320509a, gVar.f320510b, (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model);
            i = i2;
        }
        return new c(arrayList, new b(new TextLocalisedClause(R$string.crypto_disclaimer_retail_revolut_x_screen_title, null, null, 14), new TextLocalisedClause(R$string.crypto_disclaimer_retail_revolut_x_screen_subtitle, null, null, 14)));
    }
}
