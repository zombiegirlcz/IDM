package vrl;

import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes12.dex */
public interface c {
    static Flow b(c cVar, UUID tradingAccountId) {
        e eVar = (e) cVar;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return xam.a.h(new u29.c(eVar, loadingStrategy, (Continuation) null, 21), vkm.q.q(nim.a.v(eVar.e(tradingAccountId, loadingStrategy), new vq0.g(14))));
    }
}
