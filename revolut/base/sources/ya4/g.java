package ya4;

import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import kotlin.jvm.internal.Intrinsics;
import wh3.h;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final py3.f f311928a;

    public g(py3.f ssoErrorChecker) {
        Intrinsics.checkNotNullParameter(ssoErrorChecker, "ssoErrorChecker");
        this.f311928a = ssoErrorChecker;
    }

    @Override // py3.a
    public final boolean a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return this.f311928a.a(throwable);
    }

    @Override // ya4.a
    public final Object b(Throwable th10, CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration, h hVar) {
        return null;
    }
}
