package b20;

import kotlin.jvm.internal.Intrinsics;
import l80.f;
import okhttp3.Interceptor;
import okhttp3.Response;
import ulm.i1;
import ulm.j1;
import ulm.y0;
import vc.s;
import zlm.h;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1j.a f11852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p10.b f11853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f11854c;
    public final qd0.b d;
    public final dm0.d e;

    public c(b1j.a fcmTokenProvider, p10.b configuration, l80.e dateProvider, qd0.b languageProvider, dm0.d deviceIdProvider, rf3.c chatAppTypeProvider) {
        Intrinsics.checkNotNullParameter(fcmTokenProvider, "fcmTokenProvider");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(chatAppTypeProvider, "chatAppTypeProvider");
        this.f11852a = fcmTokenProvider;
        this.f11853b = configuration;
        this.f11854c = dateProvider;
        this.d = languageProvider;
        this.e = deviceIdProvider;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        h hVar = (h) chain;
        i1 i1VarB = hVar.e.b();
        i1VarB.a("X-Device-Id", this.e.b().f115812a);
        i1VarB.a("Accept-Language", p10.b.a(((s80.b) this.d).b()));
        p10.b bVar = this.f11853b;
        i1VarB.a("X-Client-Version", bVar.f231591a);
        i1VarB.d("User-Agent");
        i1VarB.a("User-Agent", s.g(bVar.k));
        i1VarB.a("X-Timezone", ((f) this.f11854c).a());
        i1VarB.a("X-Chat-Version", "4.5.0");
        String strA = this.f11852a.a();
        if (strA == null) {
            strA = "";
        }
        i1VarB.a("X-Push-Token", strA);
        i1VarB.d("X-App-Type");
        i1VarB.a("X-App-Type", "RETAIL");
        return hVar.b(new j1(i1VarB));
    }
}
