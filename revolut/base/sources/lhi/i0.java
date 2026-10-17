package lhi;

import com.revolut.core.extensions.rx.BreadcrumbException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.p0;

/* JADX INFO: loaded from: classes10.dex */
public final class i0 implements hpa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195286a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f195287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f195288c;

    public i0(l61.a userCompanyInteractor, ifm.b compositeDisposable) {
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f195287b = userCompanyInteractor;
        this.f195288c = compositeDisposable;
    }

    @Override // hpa.a
    public final boolean b(ipa.j message) {
        int i = this.f195286a;
        Object obj2 = this.f195288c;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                if (ipa.k.l(message) == ipa.h.COMPANY_CHANGED) {
                    pfm.a aVar = new pfm.a(((ang.b) ((l61.a) this.f195287b)).f7765a.d.g(Unit.f186387a, false), new kl.b0(new lak.l(new BreadcrumbException(), 8)), 2);
                    Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                    ofm.h hVarW = aVar.w(new a08.r(29, h0.f195284a), g0.f195280a);
                    Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                    te0.w.j0((ifm.b) obj2, hVarW);
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                ipa.h hVarL = ipa.k.l(message);
                if (hVarL == ipa.h.REWARDS_HUB_STEP_COMPLETION || hVarL == ipa.h.REWARDS_HUB_CHALLENGE_STATE_UPDATED) {
                    Intrinsics.checkNotNullParameter(message, "<this>");
                    String str = (String) message.get("campaign_id");
                    Continuation continuation = null;
                    if (str != null) {
                        Intrinsics.checkNotNullParameter(message, "<this>");
                        String str2 = (String) message.get("challenge_id");
                        p0 p0Var = p0.f264001a;
                        skm.e0.C((CoroutineScope) obj2, elm.f.f127540b, null, new twb.b0(this, str, str2, continuation, 29), 2);
                    } else {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("CampaignId is not found in push message category=" + hVarL);
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                    }
                }
                break;
        }
        return true;
    }

    public i0(stj.h rewardsHubInteractor, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(rewardsHubInteractor, "rewardsHubInteractor");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f195287b = rewardsHubInteractor;
        this.f195288c = scope;
    }
}
