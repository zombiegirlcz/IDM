package e44;

import a19.e;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import dp4.a1;
import e2j.j;
import e31.i;
import ft3.h1;
import java.time.format.DateTimeFormatter;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m31.c;
import mp.p;
import ne0.d;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f122382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditPluginsService f122383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f122384c;
    public final c d;
    public final x4l.c e;
    public final DateTimeFormatter f;

    public b(p creditApplicationDtoMapper, CreditPluginsService creditPluginsService, d memoryCache, c multipartHelper) {
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(multipartHelper, "multipartHelper");
        this.f122382a = creditApplicationDtoMapper;
        this.f122383b = creditPluginsService;
        this.f122384c = memoryCache;
        this.d = multipartHelper;
        Continuation continuation = null;
        this.e = new x4l.c(new a1(this, continuation, 6), new j(this, 11), new dt4.p(this, 29), new i(2, 1, continuation), new e(3, 28, continuation));
        this.f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    }

    public static final void a(b bVar, lv3.a aVar, h1 h1Var) {
        bVar.e.g(new a(h1Var), aVar);
    }
}
