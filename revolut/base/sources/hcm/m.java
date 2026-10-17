package hcm;

import ecm.m2;
import gcm.d6;
import gcm.j6;
import gcm.k6;
import gcm.l3;
import gcm.p1;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocketFactory;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: loaded from: classes13.dex */
public final class m extends ecm.a0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final io.grpc.okhttp.internal.c f151288p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f151289q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d6 f151290r;
    public final l3 d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SSLSocketFactory f151292h;
    public final j6 e = k6.f142736c;
    public final d6 f = f151290r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d6 f151291g = new d6(p1.f142818q);
    public final io.grpc.okhttp.internal.c i = f151288p;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j f151293j = j.TLS;
    public long k = Long.MAX_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f151294l = p1.f142814l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f151295m = Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f151296n = 4194304;
    public final int o = Integer.MAX_VALUE;

    static {
        Logger.getLogger(m.class.getName());
        io.grpc.okhttp.internal.b bVar = new io.grpc.okhttp.internal.b(io.grpc.okhttp.internal.c.e);
        bVar.a(io.grpc.okhttp.internal.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, io.grpc.okhttp.internal.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        bVar.b(io.grpc.okhttp.internal.o.TLS_1_2);
        if (!bVar.f162993a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        bVar.d = true;
        f151288p = new io.grpc.okhttp.internal.c(bVar);
        f151289q = TimeUnit.DAYS.toNanos(1000L);
        f151290r = new d6(new qf.b(5));
        EnumSet.of(m2.MTLS, m2.CUSTOM_MANAGERS);
    }

    public m(String str) {
        this.d = new l3(str, new k(this), new a31.a(this, 13));
    }

    @Override // ecm.a0
    public final ecm.e0 q() {
        return this.d;
    }
}
