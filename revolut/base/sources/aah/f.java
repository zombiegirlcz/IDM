package aah;

import e7l.g;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements z0h.d {

    @NotNull
    public static final d Companion = new d();
    public static final Lazy d = yhm.j.b(new a92.d(6));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.l f2824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f2825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l61.a f2826c;

    public f(ybl.l tradingConfigInteractor, fk3.a configurationInteractor, l61.a userCompanyInteractor) {
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.f2824a = tradingConfigInteractor;
        this.f2825b = configurationInteractor;
        this.f2826c = userCompanyInteractor;
    }

    @Override // z0h.d
    public final Flow s1() {
        return q.q(nim.a.v(u0.i(rd0.e.b(((ik3.c) this.f2825b).l(g.b.f123407a, w4l.h.f294642c)), rd0.e.b(hng.g.b(((ang.b) this.f2826c).f7765a)), ybl.l.d(this.f2824a)), new a9h.b(11)));
    }

    @Override // z0h.d
    public final Flow w0() {
        return rd0.e.b(nim.a.w(ybl.l.c(this.f2824a, false, 3), new a9h.b(12)));
    }
}
