package xhc;

import com.revolut.data.model.Data;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.feature.rewards.api.model.subscriptions_search.SubscriptionSearchItem;
import ffk.t;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o97.r;
import o97.y;
import s2i.i;
import xd2.n;
import xf0.j;
import xg6.k;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements jgc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wgc.c f305853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f305854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f305855c;
    public final gte.a d;
    public final ihm.b e;
    public final r f;

    public e(wgc.c subscriptionsSearchInteractor, t pricingPlanInteractor, d subscriptionsSearchGlobalSearchMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(subscriptionsSearchInteractor, "subscriptionsSearchInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(subscriptionsSearchGlobalSearchMapper, "subscriptionsSearchGlobalSearchMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f305853a = subscriptionsSearchInteractor;
        this.f305854b = pricingPlanInteractor;
        this.f305855c = subscriptionsSearchGlobalSearchMapper;
        this.d = featureToggleInteractor;
        ihm.b bVarE = ihm.b.e(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.e = bVarE;
        this.f = r.PLAN_SUBSCRIPTIONS;
    }

    @Override // z87.f
    public final void d() {
        this.e.onNext(Boolean.FALSE);
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        efm.r rVarFromCallable = efm.r.fromCallable(new i(this, 17));
        Intrinsics.checkNotNullExpressionValue(rVarFromCallable, "fromCallable(...)");
        int i = 9;
        efm.r rVarSwitchMap = ue0.e.H(rVarFromCallable, h0.f322473a, new n(24)).switchMap(new k(new j(this, searchQuery, i), i));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return ue0.e.E(rVarSwitchMap, new Data(f0.f322471a, null, false, 6, null));
    }

    @Override // z87.f
    public final r h() {
        return this.f;
    }

    @Override // z87.f
    public final Object l(String str, y yVar, Continuation continuation) {
        boolean zF = Intrinsics.f(str, "LIST_ID_SUBSCRIPTIONS_SEARCH_TITLE");
        o97.e eVar = o97.e.f223096a;
        if (zF) {
            this.e.onNext(Boolean.valueOf(!pd.b.j((Boolean) r2.f())));
            return eVar;
        }
        Object obj2 = yVar.f223136b;
        SubscriptionSearchItem subscriptionSearchItem = obj2 instanceof SubscriptionSearchItem ? (SubscriptionSearchItem) obj2 : null;
        if (subscriptionSearchItem != null) {
            SubscriptionSearchItem.Action action = subscriptionSearchItem.e;
            SubscriptionSearchItem.Action.OpenUrl openUrl = action instanceof SubscriptionSearchItem.Action.OpenUrl ? (SubscriptionSearchItem.Action.OpenUrl) action : null;
            if (openUrl != null) {
                return new o97.c(openUrl.f84886a);
            }
        }
        return eVar;
    }
}
