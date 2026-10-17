package ll8;

import android.content.Context;
import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior_remote_login.impl.R$string;
import com.revolut.feature.junior_remote_login.navigation.JuniorAppLinkShareFeatureConfig;
import com.revolut.retail.core.navigation.IntentCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import f01.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import sri.m;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements uri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s70.a f196669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f196670b;

    public a(s70.a intentProvider, c uiKitResources) {
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f196669a = intentProvider;
        this.f196670b = uiKitResources;
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof JuniorAppLinkShareFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        JuniorAppLinkShareFeatureConfig config = (JuniorAppLinkShareFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.junior_share_app_link_title, u.c(config.f77225a), null, 12);
        c cVar = this.f196670b;
        navigator.c(new IntentCommand(((s70.b) this.f196669a).f(cVar.b(textLocalisedClause).toString(), cVar.b(new CompositeClause(v.k(new TextLocalisedClause(R$string.junior_share_app_link_text_part1, null, null, 14), new TextLocalisedClause(R$string.junior_share_app_link_text_part2, null, null, 14)), new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12)).toString(), null), null));
    }
}
