package amm;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import mmm.l0;
import mmm.s0;
import mmm.v0;
import mmm.w;
import okhttp3.OkHttpClient;
import ulm.e0;
import ulm.u0;
import ulm.x0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class c implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f6489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f6490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6491c;
    public final /* synthetic */ j d;

    public c(j jVar, x0 url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.d = jVar;
        this.f6489a = url2;
        this.f6490b = new w(((l0) jVar.f6501c.f286252c).f207282a.timeout());
    }

    public final void d(u0 trailers) {
        OkHttpClient okHttpClient;
        e0 e0Var;
        Intrinsics.checkNotNullParameter(trailers, "trailers");
        j jVar = this.d;
        int i = jVar.d;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + jVar.d);
        }
        j.k(jVar, this.f6490b);
        jVar.d = 6;
        if (trailers.size() <= 0 || (okHttpClient = jVar.f6499a) == null || (e0Var = okHttpClient.f226058j) == null) {
            return;
        }
        zlm.g.b(e0Var, this.f6489a, trailers);
    }

    @Override // mmm.s0
    public long read(mmm.h sink, long j2) {
        j jVar = this.d;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            return ((l0) jVar.f6501c.f286252c).read(sink, j2);
        } catch (IOException e) {
            jVar.f6500b.b();
            d(j.f);
            throw e;
        }
    }

    @Override // mmm.s0
    public final v0 timeout() {
        return this.f6490b;
    }
}
