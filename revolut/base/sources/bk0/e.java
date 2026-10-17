package bk0;

import cn0.g;
import java.time.Clock;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.j;
import zhm.r0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements c {

    @NotNull
    public static final d Companion = new d();
    public static final Regex i = new Regex("^(\\d+\\.)*\\d+");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clock f16209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ij0.a f16210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm0.d f16211c;
    public final qd0.b d;
    public final b1j.a e;
    public final hmi.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ck0.b f16212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f16213h;

    public e(Clock clock, ij0.a configuration, dm0.d deviceIdProvider, qd0.b languageProvider, b1j.a pushTokenProvider, hmi.a requestAuthorizer, ck0.b userAgentProvider) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(pushTokenProvider, "pushTokenProvider");
        Intrinsics.checkNotNullParameter(requestAuthorizer, "requestAuthorizer");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        this.f16209a = clock;
        this.f16210b = configuration;
        this.f16211c = deviceIdProvider;
        this.d = languageProvider;
        this.e = pushTokenProvider;
        this.f = requestAuthorizer;
        this.f16212g = userAgentProvider;
        this.f16213h = j.b(new bc1.b(this, 9));
    }

    @Override // bk0.a
    public final Map a(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Map mapK = r0.k(b(url2, false), c(), new Pair("X-Client-Version", (String) this.f16213h.getValue()), f(), new Pair("X-Timezone", this.f16209a.getZone().getId()), d());
        ((jj0.a) this.f).getClass();
        return r0.p(mapK, r0.g());
    }

    public final Pair b(String url2, boolean z) {
        Intrinsics.checkNotNullParameter(url2, "url");
        jj0.a aVar = (jj0.a) this.f;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(url2, "url");
        return new Pair("Authorization", aVar.f174614b.m((z ? aVar.a() : ((g) aVar.f174613a).d()).a()));
    }

    public final Pair c() {
        return new Pair("X-Device-Id", this.f16211c.b().f115812a);
    }

    public final Pair d() {
        String language;
        Locale localeB = ((s80.b) this.d).b();
        String country = localeB.getCountry();
        if (country == null || d0.W(country)) {
            language = localeB.getLanguage();
            Intrinsics.h(language);
        } else {
            language = com.google.android.gms.internal.mlkit_vision_face.a.o(localeB.getLanguage(), "-", localeB.getCountry());
        }
        return new Pair("Accept-Language", language);
    }

    public final Map e() {
        Clock clock = this.f16209a;
        return r0.k(new Pair("X-Timezone", clock.getZone().getId()), new Pair("X-Push-Id", s.g(this.e.a())), new Pair("X-Client-Version", (String) this.f16213h.getValue()), d(), new Pair("X-Timestamp", String.valueOf(clock.instant().getEpochSecond())));
    }

    public final Pair f() {
        return new Pair("User-Agent", (String) this.f16212g.e.getValue());
    }
}
