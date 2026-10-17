package a87;

import kotlin.jvm.internal.Intrinsics;
import ybl.l;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f2117a;

    public c(l tradingConfigInteractor, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
                this.f2117a = tradingConfigInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
                this.f2117a = tradingConfigInteractor;
                break;
        }
    }

    public b a() {
        return new b(mo3.a.g(l.d(this.f2117a), null, new a5g.l(18), 1), 0);
    }
}
