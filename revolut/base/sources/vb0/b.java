package vb0;

import com.revolut.feature.backend_flow.domain.models.Action;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l3l.m;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f287347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ad0.a f287348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qa0.b f287349c;

    public b(a mapper, ad0.a actionMapper, qa0.b externalNavigationExtension) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(actionMapper, "actionMapper");
        Intrinsics.checkNotNullParameter(externalNavigationExtension, "externalNavigationExtension");
        this.f287347a = mapper;
        this.f287348b = actionMapper;
        this.f287349c = externalNavigationExtension;
    }

    public final void a(com.revolut.kompot.navigable.a aVar, Action action, BackendScreen backendScreen, m mVar) {
        if (action instanceof Action.Dismiss) {
            aVar.m2().onBackPressed();
            return;
        }
        if (action instanceof Action.Deeplink) {
            this.f287349c.Z2(((Action.Deeplink) action).f63226c);
        } else {
            if (!(action instanceof Action.Submit)) {
                throw new NoWhenBranchMatchedException();
            }
            mVar.invoke(new ya0.b(this.f287348b.j(backendScreen, (Action.Submit) action)));
        }
    }
}
