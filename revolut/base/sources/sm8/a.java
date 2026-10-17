package sm8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior_rewards.impl.R$string;
import com.revolut.kompot.common.ExternalDestination;
import kbb.c;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f264387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s70.a f264388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f01.a f264389c;

    public a(c juniorConfigInteractor, s70.a intentProvider, f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f264387a = juniorConfigInteractor;
        this.f264388b = intentProvider;
        this.f264389c = uiKitResources;
    }

    public final ExternalDestination.ByIntent a() {
        return new ExternalDestination.ByIntent(((s70.b) this.f264388b).f("", this.f264389c.b(new TextLocalisedClause(R$string.junior_rewards_reward_details_share_link, u.c(this.f264387a.u()), null, 12)).toString(), null), null);
    }
}
