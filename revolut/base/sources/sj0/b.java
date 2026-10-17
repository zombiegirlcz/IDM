package sj0;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;
import qf0.c;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Interceptor {

    @NotNull
    public static final a Companion = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f263669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zm0.c f263670b;

    public b(c overseer, zm0.c sessionProvider) {
        Intrinsics.checkNotNullParameter(overseer, "overseer");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        this.f263669a = overseer;
        this.f263670b = sessionProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.Response intercept(ulm.y0 r10) throws com.revolut.core.network.exceptions.HandledNetworkException {
        /*
            r9 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            zm0.c r0 = r9.f263670b
            cn0.g r0 = (cn0.g) r0
            mm0.o r0 = r0.d()
            boolean r6 = r0 instanceof mm0.n
            tj0.b r1 = tj0.c.Companion
            r1.getClass()
            tj0.c r7 = tj0.b.a(r0)
            zlm.h r10 = (zlm.h) r10
            ulm.j1 r0 = r10.e
            okhttp3.Response r10 = r10.b(r0)
            int r0 = r10.d
            r1 = 400(0x190, float:5.6E-43)
            if (r0 < r1) goto L80
            r8 = 0
            okhttp3.ResponseBody r0 = r10.f226090g     // Catch: java.lang.Exception -> L46
            if (r0 == 0) goto L48
            mmm.k r0 = r0.source()     // Catch: java.lang.Exception -> L46
            if (r0 == 0) goto L48
            r1 = 1048576(0x100000, double:5.180654E-318)
            r0.a(r1)     // Catch: java.lang.Exception -> L46
            mmm.h r0 = r0.getBuffer()     // Catch: java.lang.Exception -> L46
            if (r0 == 0) goto L48
            mmm.h r0 = r0.clone()     // Catch: java.lang.Exception -> L46
            java.lang.String r0 = r0.q()     // Catch: java.lang.Exception -> L46
            goto L49
        L46:
            r0 = move-exception
            goto L4b
        L48:
            r0 = r8
        L49:
            r5 = r0
            goto L55
        L4b:
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            rd0.d.a(r2, r8, r8, r0, r1)
            r5 = r8
        L55:
            com.revolut.core.network.exceptions.NetworkException r1 = new com.revolut.core.network.exceptions.NetworkException
            ulm.j1 r0 = r10.f226087a
            ulm.x0 r2 = r0.f281095a
            int r3 = r10.d
            java.lang.String r4 = r0.f281096b
            r1.<init>(r2, r3, r4, r5, r6, r7)
            afe.a r0 = new afe.a
            r2 = 15
            r0.<init>(r9, r1, r8, r2)
            kotlin.coroutines.g r2 = kotlin.coroutines.g.f186406a
            java.lang.Object r0 = skm.e0.E(r2, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L78
            goto L80
        L78:
            com.revolut.core.network.exceptions.HandledNetworkException r0 = new com.revolut.core.network.exceptions.HandledNetworkException
            java.lang.String r10 = r10.f226089c
            r0.<init>(r10, r1)
            throw r0
        L80:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: sj0.b.intercept(ulm.y0):okhttp3.Response");
    }
}
