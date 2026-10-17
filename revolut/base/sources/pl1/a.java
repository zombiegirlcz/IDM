package pl1;

import com.revolut.feature.apm.core.impl.crypto.o;
import java.security.KeyPair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements ww1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kdh.b f237243a;

    public a(kdh.b bVar, com.revolut.feature.apm.core.impl.crypto.d dVar) {
        this.f237243a = bVar;
    }

    @Override // ww1.a
    public final String b(KeyPair key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f237243a.b(key);
    }

    @Override // ww1.a
    public final Object i(gim.c cVar) {
        return ((o) this.f237243a.f182899b).i(cVar);
    }
}
