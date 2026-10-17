package jj0;

import hn0.n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KClass;
import mm0.m;
import mm0.o;

/* JADX INFO: loaded from: classes.dex */
public final class a implements hmi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm0.c f174613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yf.c f174614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vi0.b f174615c;
    public final n d;

    public a(zm0.c sessionProvider, yf.c tokenEncoder, vi0.b accountIdProvider, n securityRepositoryInteractor) {
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        Intrinsics.checkNotNullParameter(tokenEncoder, "tokenEncoder");
        Intrinsics.checkNotNullParameter(accountIdProvider, "accountIdProvider");
        Intrinsics.checkNotNullParameter(securityRepositoryInteractor, "securityRepositoryInteractor");
        this.f174613a = sessionProvider;
        this.f174614b = tokenEncoder;
        this.f174615c = accountIdProvider;
        this.d = securityRepositoryInteractor;
    }

    public final o a() {
        o oVar;
        zm0.c cVar = this.f174613a;
        KClass kClass = o0.f186429a.b(m.class);
        cn0.g gVar = (cn0.g) cVar;
        synchronized (gVar) {
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            gVar.b();
            oVar = (o) gVar.e.get(kClass);
        }
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalArgumentException("Unable to make an application request - anonymous session not initialised");
    }
}
