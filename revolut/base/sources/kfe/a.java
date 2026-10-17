package kfe;

import com.revolut.shared.feature.suspicious_transaction.api.navigation.SuspiciousTransactionFeatureConfig;
import efm.d0;
import fag.g;
import jf0.c;
import jf0.d;
import joe.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import q06.h;
import q06.k;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements d, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f183354a;

    public a(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f183354a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(c cVar) {
        return y.D(cVar, "deeplink", 1, "suspicious-transaction");
    }

    @Override // q06.k
    public final Object e(c cVar, Continuation continuation) {
        return new h(new SuspiciousTransactionFeatureConfig.SuspiciousTransaction(cVar.e(2), cVar.d), null);
    }

    @Override // jf0.d
    public final d0 f(c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        z zVar = new z(new ufm.c(new g(this, deeplink, 25), 2), 1, new e(14), null);
        Intrinsics.checkNotNullExpressionValue(zVar, "onErrorReturn(...)");
        return zVar;
    }
}
