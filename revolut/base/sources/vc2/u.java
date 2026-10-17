package vc2;

import cli.y;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes20.dex */
public final class u extends oki.h implements d {
    public final h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.feature.apm.core.ui.api.navigation.a f287639p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v02.b f287640q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wc2.g f287641r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v02.c f287642s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wj0.a f287643t;
    public final y u;
    public final z1 v;

    public u(h settingsInteractor, com.revolut.feature.apm.core.ui.api.navigation.a aliasRegistrationExtension, v02.b aliasDeregisterExtension, wc2.g newAliasNavigationProvider, v02.c aliasDialogMapper, wj0.a idempotencyKeyHolder, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(settingsInteractor, "settingsInteractor");
        Intrinsics.checkNotNullParameter(aliasRegistrationExtension, "aliasRegistrationExtension");
        Intrinsics.checkNotNullParameter(aliasDeregisterExtension, "aliasDeregisterExtension");
        Intrinsics.checkNotNullParameter(newAliasNavigationProvider, "newAliasNavigationProvider");
        Intrinsics.checkNotNullParameter(aliasDialogMapper, "aliasDialogMapper");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = settingsInteractor;
        this.f287639p = aliasRegistrationExtension;
        this.f287640q = aliasDeregisterExtension;
        this.f287641r = newAliasNavigationProvider;
        this.f287642s = aliasDialogMapper;
        this.f287643t = idempotencyKeyHolder;
        this.u = mra.d.b(this, new a(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.v = z1VarB;
    }

    @Override // yji.l
    public final void I1() {
        this.f287643t.a("IDEMPOTENCY_TAG_CHECK_ALIAS_AVAILABILITY");
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.v, new uec.d(continuation, this, 23)), null, null, new v44.e(this, continuation, 19), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
