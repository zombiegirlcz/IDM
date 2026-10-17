package bx6;

import bt9.t;
import bw4.s;
import cli.y;
import com.revolut.data.model.Data;
import gr6.o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import vkm.z1;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends oki.h implements e {

    @NotNull
    public static final h Companion = new h();
    public final jf1.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f19502p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l61.a f19503q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f19504r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f19505s;

    public i(jf1.a proMerchantTogglesInteractor, o freelancerProcessingFeesInteractor, l61.a userCompanyInteractor, k stateMapper) {
        Intrinsics.checkNotNullParameter(proMerchantTogglesInteractor, "proMerchantTogglesInteractor");
        Intrinsics.checkNotNullParameter(freelancerProcessingFeesInteractor, "freelancerProcessingFeesInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = proMerchantTogglesInteractor;
        this.f19502p = freelancerProcessingFeesInteractor;
        this.f19503q = userCompanyInteractor;
        z1 z1VarB = q.b(0, 6, null);
        z1VarB.k(Unit.f186387a);
        this.f19504r = z1VarB;
        this.f19505s = mra.d.b(this, new d(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, nim.a.v(q.Q(this.f19504r, new s(continuation, this, 1)), new t(25)), null, null, new btd.e(this, continuation, 16), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f19505s;
    }
}
