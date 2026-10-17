package hd2;

import cli.n;
import cli.y;
import com.revolut.feature.apm.services.ideal.impl.ui.auth.IdealAuthScreenContract$InputData;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ImplicitActivityDestination;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v0f.p;
import vkm.j2;
import vkm.q0;
import yji.l;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends oki.h implements dli.b {

    @NotNull
    private static final a Companion = new a();
    public final IdealAuthScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f80.a f151377p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f151378q;

    public c(IdealAuthScreenContract$InputData inputData, f80.a uriHelper, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f151377p = uriHelper;
        this.f151378q = mra.d.b(this, new d(5), stateMapper, null, false, 12);
    }

    public final void I2() {
        C1(u0.b(new ActivityNavigateCommand(new ImplicitActivityDestination("android.intent.action.VIEW", null, null, null, ((f80.b) this.f151377p).f(this.o.f62840a), 14), null, null, null, 0, null, null, null, null, false, 1022)));
        B2();
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, new q0(new p(kotlin.ranges.f.l(((d) ((j2) this.f151378q.f22677a).getValue()).f151379a, 0), 6), new b(2, 0, null), 1), null, new hbg.h(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f151378q;
    }
}
