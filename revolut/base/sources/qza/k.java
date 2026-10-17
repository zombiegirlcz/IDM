package qza;

import com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$Config;
import kotlin.jvm.internal.Intrinsics;
import rfm.f0;

/* JADX INFO: loaded from: classes13.dex */
public final class k extends vm.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hn.h f250463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mp.r f250464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f250465c;

    public k(hn.h dialogConfigurationDispatcher, mp.r errorConfigurationFactory, g state) {
        Intrinsics.checkNotNullParameter(dialogConfigurationDispatcher, "dialogConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(errorConfigurationFactory, "errorConfigurationFactory");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f250463a = dialogConfigurationDispatcher;
        this.f250464b = errorConfigurationFactory;
        this.f250465c = state;
    }

    @Override // vm.d
    public final efm.d0 d(um.a errorData) {
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        if (Intrinsics.f(errorData.a(), new b((RemoteStoriesContract$Config) ((b0) this.f250465c).w0().get()))) {
            f0 f0VarF = new pfm.h(new oma.r(this, 19), 2).f(efm.d0.m(Boolean.TRUE));
            Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
            return f0VarF;
        }
        in.a aVar = in.b.Companion;
        f0 f0VarF2 = this.f250463a.a(this.f250464b.k("DEFAULT_ERROR_DIALOG_ID")).f(efm.d0.m(Boolean.TRUE));
        Intrinsics.checkNotNullExpressionValue(f0VarF2, "andThen(...)");
        return f0VarF2;
    }
}
