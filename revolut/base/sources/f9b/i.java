package f9b;

import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import javax.net.ssl.SSLException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import org.jetbrains.annotations.NotNull;
import r10.t;
import tpi.j;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public final class i {

    @NotNull
    public static final h Companion = new h(0);
    public static final List i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g81.a f132907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yf.c f132908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f132909c;
    public final gte.a d;
    public final b80.c e;
    public final j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jpf.a f132910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final sf0.h f132911h;

    static {
        p0 p0Var = o0.f186429a;
        i = v.k(p0Var.b(SocketException.class), p0Var.b(SocketTimeoutException.class), p0Var.b(UnknownHostException.class), p0Var.b(SSLException.class));
    }

    public i(g81.a commonErrorHandler, yf.c connectionWidgetDisplayer, t errorActionPerformer, gte.a featureToggleInteractor, b80.c networkStateRepository, j jVar, jpf.a retailServerErrorHandler, sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(commonErrorHandler, "commonErrorHandler");
        Intrinsics.checkNotNullParameter(connectionWidgetDisplayer, "connectionWidgetDisplayer");
        Intrinsics.checkNotNullParameter(errorActionPerformer, "errorActionPerformer");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(retailServerErrorHandler, "retailServerErrorHandler");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f132907a = commonErrorHandler;
        this.f132908b = connectionWidgetDisplayer;
        this.f132909c = errorActionPerformer;
        this.d = featureToggleInteractor;
        this.e = networkStateRepository;
        this.f = jVar;
        this.f132910g = retailServerErrorHandler;
        this.f132911h = serverErrorParser;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.revolut.core.error.data.model.ServerError r9, retrofit2.Response r10, kotlin.jvm.functions.Function1 r11, kotlin.jvm.functions.Function1 r12, boolean r13, java.lang.Exception r14) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f9b.i.a(com.revolut.core.error.data.model.ServerError, retrofit2.Response, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, java.lang.Exception):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.lang.Throwable r10, kotlin.jvm.functions.Function1 r11, kotlin.jvm.functions.Function1 r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f9b.i.b(java.lang.Throwable, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, boolean):boolean");
    }
}
