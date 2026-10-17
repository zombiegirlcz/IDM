package txg;

import ce9.m;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qxg.g f275425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f275426b;

    public g(qxg.g contributorMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(contributorMapper, "contributorMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f275425a = contributorMapper;
        this.f275426b = featureToggleInteractor;
    }

    @Override // cli.n
    public final o c(j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(m.p(domainState.f275420a, ((jte.d) this.f275426b).c(WealthUiApi$Toggles.RoboStrategies.f95863c)), null, null, 14);
        Data data = domainState.f275421b;
        TextLocalisedQuantityClause textLocalisedQuantityClause = data != null ? (TextLocalisedQuantityClause) iii.c.f(data, new tx.f(13), new tw8.g(6), new sr8.a(25)) : null;
        if (data != null) {
            qxg.g gVar = this.f275425a;
            list = (List) iii.c.f(data, new qwd.o(gVar, 26), new qsk.d(22), new qxg.d(gVar, 0));
        }
        if (list == null) {
            list = f0.f322471a;
        }
        return new f(textLocalisedClause, textLocalisedQuantityClause, list);
    }
}
