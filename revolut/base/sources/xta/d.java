package xta;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rating.impl.extension.AppRatingException;
import com.revolut.retail.common.ui.R$string;
import dp4.y0;
import dqk.f;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rp0.q0;
import rp0.r0;
import rp0.u0;
import wli.x;
import yji.n;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final py3.b f308796l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final yta.b f308797m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r60.a f308798n;
    public final x o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yp.b f308799p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f308800q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final toh.d f308801r;

    public d(py3.b ratingEligibilityChecker, yta.b ratingActionHandler, r60.b promptView, x deeplinkHandler, yp.b appStoreNavigationFactory, f ratingPromptConfiguration, toh.d appRatingShownDateValidator) {
        Intrinsics.checkNotNullParameter(ratingEligibilityChecker, "ratingEligibilityChecker");
        Intrinsics.checkNotNullParameter(ratingActionHandler, "ratingActionHandler");
        Intrinsics.checkNotNullParameter(promptView, "promptView");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(appStoreNavigationFactory, "appStoreNavigationFactory");
        Intrinsics.checkNotNullParameter(ratingPromptConfiguration, "ratingPromptConfiguration");
        Intrinsics.checkNotNullParameter(appRatingShownDateValidator, "appRatingShownDateValidator");
        this.f308796l = ratingEligibilityChecker;
        this.f308797m = ratingActionHandler;
        this.f308798n = promptView;
        this.o = deeplinkHandler;
        this.f308799p = appStoreNavigationFactory;
        this.f308800q = ratingPromptConfiguration;
        this.f308801r = appRatingShownDateValidator;
    }

    public static final void Z2(d dVar) {
        try {
            ((r60.d) dVar.f308798n).Q();
            Unit unit = Unit.f186387a;
        } catch (CancellationException unused) {
        } catch (Exception throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            AppRatingException appRatingException = new AppRatingException("closePrompt", throwable);
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, appRatingException, h0Var);
        }
    }

    public static final void b3(d dVar) {
        r60.a aVar = dVar.f308798n;
        int i = R$string.app_rating_screen_title;
        dVar.f308800q.getClass();
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        Clause clause = null;
        ResourceImage resourceImage2 = null;
        AnalyticsContext analyticsContext = null;
        AnalyticsContext analyticsContext2 = null;
        r60.d dVar2 = (r60.d) aVar;
        dVar2.R(new u0(new TextLocalisedClause(i, u.c(new TextLocalisedClause(R$string.application_full_name, null, null, 14)), null, 12), new TextLocalisedClause(R$string.app_rating_subtitle_v3, null, null, 14), null, new r0(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D090", null, null, null, 30)), clause, resourceImage, resourceImage2, q0.VERTICAL, new TextLocalisedClause(R$string.app_rating_actionFooter_like, null, null, 14), new TextLocalisedClause(R$string.app_rating_actionFooter_notReally, null, null, 14), analyticsContext, analyticsContext2, null, null, null, null, null, null, null, 33552724));
    }

    @Override // yji.n
    public final void H2() {
        r60.d dVar = (r60.d) this.f308798n;
        Continuation continuation = null;
        n.l2(this, rd0.e.b(dVar.d.b()), null, new a(this, null), 3);
        n.l2(this, rd0.e.b(dVar.d.f256147a.f()), null, new xnl.f(this, continuation, 12), 3);
        n.l2(this, rd0.e.b(dVar.d.f()), null, new b(this, null), 3);
        n.l2(this, rd0.e.b(dVar.d.d()), null, new c(this, null), 3);
        V2(new y0((n) this, continuation, 20), new yi5.b(29));
    }
}
