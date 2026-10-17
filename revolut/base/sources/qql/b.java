package qql;

import ei3.o;
import ij0.c;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;
import sf0.h;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements Interceptor {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rql.a f248579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rql.b f248580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nql.a f248581c;
    public final c d;
    public final h e;
    public final o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f248582g;

    public b(rql.a ssoReauthenticationRepository, rql.b ssoReauthenticationRequestRepository, nql.a ssoReauthenticationConfiguration, c revolutHostChecker, h serverErrorParser, o ssoReauthenticationErrorParser) {
        Intrinsics.checkNotNullParameter(ssoReauthenticationRepository, "ssoReauthenticationRepository");
        Intrinsics.checkNotNullParameter(ssoReauthenticationRequestRepository, "ssoReauthenticationRequestRepository");
        Intrinsics.checkNotNullParameter(ssoReauthenticationConfiguration, "ssoReauthenticationConfiguration");
        Intrinsics.checkNotNullParameter(revolutHostChecker, "revolutHostChecker");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(ssoReauthenticationErrorParser, "ssoReauthenticationErrorParser");
        this.f248579a = ssoReauthenticationRepository;
        this.f248580b = ssoReauthenticationRequestRepository;
        this.f248581c = ssoReauthenticationConfiguration;
        this.d = revolutHostChecker;
        this.e = serverErrorParser;
        this.f = ssoReauthenticationErrorParser;
        this.f248582g = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.Response intercept(ulm.y0 r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qql.b.intercept(ulm.y0):okhttp3.Response");
    }
}
