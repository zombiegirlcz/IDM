package jj0;

import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import mm0.j;
import mm0.n;
import mm0.o;
import mm0.p;
import mm0.q;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm0.c f174618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zm0.b f174619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rad.a f174620c;
    public final yf.c d;

    public e(zm0.c sessionProvider, zm0.b sessionController, rad.a tokenRepository, yf.c tokenEncoder) {
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        Intrinsics.checkNotNullParameter(sessionController, "sessionController");
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        Intrinsics.checkNotNullParameter(tokenEncoder, "tokenEncoder");
        this.f174618a = sessionProvider;
        this.f174619b = sessionController;
        this.f174620c = tokenRepository;
        this.d = tokenEncoder;
    }

    public final hmi.e a(String str) {
        o oVarD = ((cn0.g) this.f174618a).d();
        if (!(oVarD instanceof n) && !(oVarD instanceof p)) {
            return hmi.c.f153981a;
        }
        synchronized (this) {
            o oVarD2 = ((cn0.g) this.f174618a).d();
            if (!((oVarD2 instanceof n) || (oVarD2 instanceof p))) {
                return hmi.c.f153981a;
            }
            q qVarA = oVarD2.a();
            if (!Intrinsics.f(str, this.d.m(qVarA))) {
                return new hmi.d(qVarA);
            }
            try {
                rad.a aVar = this.f174620c;
                String str2 = oVarD2.a().f207120a;
                String str3 = oVarD2.a().d;
                if (str3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                imi.a aVar2 = (imi.a) aVar.a(str2, str3).e();
                String str4 = aVar2.f162492a;
                String str5 = aVar2.f162493b;
                long j2 = aVar2.f162494c;
                ((cn0.g) this.f174619b).l(new j(o0.f186429a.b(oVarD2.getClass()), str4, Long.valueOf(j2), str5, aVar2.d));
                return new hmi.d(((cn0.g) this.f174618a).d().a());
            } catch (RuntimeException error) {
                Throwable cause = error.getCause();
                if (cause instanceof IOException) {
                    throw cause;
                }
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, "TokenRefreshCoordinator refreshToken exception: " + error, error, h0Var);
                Intrinsics.checkNotNullParameter(error, "error");
                return new hmi.b();
            }
        }
    }
}
