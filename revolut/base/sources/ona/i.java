package ona;

import android.net.Uri;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import e7l.g;
import efm.r;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import oid.y;
import q06.l;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends jki.g implements d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yp.b f226926p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fk3.b f226927q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f226928r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f01.a f226929s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f80.a f226930t;
    public final am2.a u;
    public final c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p stateMapper, yp.b appStoreNavigationFactory, fk3.b configurationRepository, l deeplinkRouter, f01.a uiKitResources, f80.a uriHelper, am2.a profileTypeInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(appStoreNavigationFactory, "appStoreNavigationFactory");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(profileTypeInteractor, "profileTypeInteractor");
        this.f226926p = appStoreNavigationFactory;
        this.f226927q = configurationRepository;
        this.f226928r = deeplinkRouter;
        this.f226929s = uiKitResources;
        this.f226930t = uriHelper;
        this.u = profileTypeInteractor;
        this.v = new c(new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        r rVarOnErrorResumeNext = ((ik3.g) this.f226927q).a(g.b.f123407a, false).onErrorResumeNext(new y(new f(this, 0), 24));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        yji.l.a1(this, rd0.e.b(rVarOnErrorResumeNext), null, null, new oli.f(this, null, 8), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.v;
    }

    public final Uri y2(int i) {
        return ((f80.b) this.f226930t).f(this.f226929s.b(new TextLocalisedClause(i, null, null, 14)).toString());
    }
}
