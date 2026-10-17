package gah;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import w4l.k;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements d1h.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final usc.a f142177a;

    public c(usc.a wealthDisclaimersInteractor) {
        Intrinsics.checkNotNullParameter(wealthDisclaimersInteractor, "wealthDisclaimersInteractor");
        this.f142177a = wealthDisclaimersInteractor;
    }

    @Override // d1h.f
    public final Flow R1(List scopes, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return new g0c.e(this.f142177a.l(scopes, loadingStrategy), this, scopes, 16);
    }
}
