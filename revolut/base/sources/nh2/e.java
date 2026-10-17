package nh2;

import java.security.KeyPair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements ww1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.core.impl.crypto.o f215296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.core.impl.crypto.d f215297b;

    public e(com.revolut.feature.apm.core.impl.crypto.o oVar, com.revolut.feature.apm.core.impl.crypto.d dVar) {
        this.f215296a = oVar;
        this.f215297b = dVar;
    }

    @Override // ww1.a
    public final String b(KeyPair key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f215296a.b(key);
    }

    @Override // ww1.a
    public final Object i(gim.c cVar) {
        return this.f215296a.i(cVar);
    }
}
