package nj0;

import android.content.Context;
import g2e.t;
import java.time.Clock;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import qj0.i;
import qj0.k;
import qj0.l;
import retrofit2.Retrofit;
import vc.s;
import yj0.h;
import yj0.j;
import yj0.m;

/* JADX INFO: loaded from: classes.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l70.e f216293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y60.c f216294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ij0.a f216295c;
    public final gmi.a d;
    public final jm0.a e;
    public final rj0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final th0.a f216296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nn0.c f216297h;
    public final rj0.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f216298j;
    public final an0.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ee0.a f216299l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Function0 f216300m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final nf0.a f216301n;
    public final tql.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f216302p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pj0.f f216303q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f216304r = e4m.b.b(new c(this, 1));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f216305s = e4m.b.b(new c(this, 0));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f216306t = e4m.g.a(new c(this, 4));
    public final e4m.e u = e4m.g.a(new c(this, 3));
    public final e4m.e v = e4m.g.a(new c(this, 2));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f216307w = e4m.g.a(new c(this, 5));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f216308x = e4m.b.b(new c(this, 6));

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f216309y = e4m.g.a(new c(this, 10));
    public final e4m.e z = e4m.g.a(new c(this, 9));
    public final e4m.e A = e4m.g.a(new c(this, 8));
    public final e4m.e B = e4m.b.b(new c(this, 11));
    public final e4m.e C = e4m.b.b(new c(this, 12));
    public final e4m.e D = e4m.g.a(new c(this, 7));
    public final e4m.e E = e4m.g.a(new c(this, 13));

    public d(i iVar, l70.e eVar, ee0.a aVar, nf0.a aVar2, nn0.c cVar, an0.c cVar2, jm0.a aVar3, th0.a aVar4, gmi.a aVar5, y60.c cVar3, tql.a aVar6, pj0.f fVar, Context context, ij0.a aVar7, rj0.b bVar, Function0 function0, rj0.a aVar8) {
        this.f216293a = eVar;
        this.f216294b = cVar3;
        this.f216295c = aVar7;
        this.d = aVar5;
        this.e = aVar3;
        this.f = bVar;
        this.f216296g = aVar4;
        this.f216297h = cVar;
        this.i = aVar8;
        this.f216298j = context;
        this.k = cVar2;
        this.f216299l = aVar;
        this.f216300m = function0;
        this.f216301n = aVar2;
        this.o = aVar6;
        this.f216302p = iVar;
        this.f216303q = fVar;
    }

    public final xe0.e a() {
        ee0.a aVar = this.f216299l;
        je0.d mapper = aVar.b();
        s.j(mapper);
        yk0.a databaseSessionProvider = this.k.b();
        s.j(databaseSessionProvider);
        xe0.f storageFactory = aVar.f();
        s.j(storageFactory);
        qj0.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "app_locked_urls_storage", mapper, 0, null, 56);
    }

    public final ck0.b b() {
        l70.e eVar = this.f216293a;
        n80.b bVar = new n80.b();
        gi0.a aVar = new gi0.a();
        pn0.c cVarA = this.f216297h.a();
        s.j(cVarA);
        x80.a aVarQ = eVar.q();
        s.j(aVarQ);
        return new ck0.b(bVar, aVar, cVarA, aVarQ, this.f216295c, this.i);
    }

    public final yj0.g c() {
        j okHttpCacheProvider = (j) this.f216308x.get();
        zm0.c sessionProvider = this.k.j();
        s.j(sessionProvider);
        xe0.e storage = a();
        qj0.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(okHttpCacheProvider, "okHttpCacheProvider");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Function0 tracker = this.f216300m;
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Clock clockSystemUTC = Clock.systemUTC();
        Intrinsics.checkNotNullExpressionValue(clockSystemUTC, "systemUTC(...)");
        return new yj0.g(okHttpCacheProvider, clockSystemUTC, sessionProvider, storage, new lwl.f(tracker, 12));
    }

    public final ek.a d() {
        return qj0.j.a(this.f216302p, fe0.d.a());
    }

    public final OkHttpClient e() {
        return (OkHttpClient) this.A.get();
    }

    public final Retrofit f() {
        ik0.b retrofitFactory = (ik0.b) this.D.get();
        k.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Retrofit retrofitA = ik0.b.a(retrofitFactory, null, null, null, null, 31);
        s.k(retrofitA);
        return retrofitA;
    }

    public final h g() {
        j cacheProvider = (j) this.f216308x.get();
        kk0.a readWriteLockPool = new kk0.a();
        qj0.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(cacheProvider, "cacheProvider");
        ij0.a networkConfiguration = this.f216295c;
        Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
        Intrinsics.checkNotNullParameter(readWriteLockPool, "readWriteLockPool");
        m[] elements = {new m("terms", new String[]{"/terms/{id}/accept"}), new m("/terms/accepted", new String[]{"/terms/{id}/accept"}), new m("/terms/to-accept", new String[]{"/terms/{id}/accept"}), new m("preorders", new String[]{"preorders"}), new m("insurance/all", new String[]{"insurance/travel/calc", "insurance/travel/order", "insurance/travel/{id}/reactivate", "/insurance/travel/{id}/upgrade/calc", "insurance/travel/{id}", "insurance/travel/{id}/verify", "insurance/{id}/docs-acknowledge", "/plans/{id}/subscribe", "/plans/current/cancel"}), new m("split-bills", new String[]{"split-bills", "split-bills/{id}"}), new m("user/current/features", new String[]{"user/current/features/{name}/unlock", "/plans/{id}/subscribe", "/plans/current/cancel", "user/current/activate"}), new m("gifts", new String[]{"gifts", "/gifts/{id}/feedback", "/gifts/{giftId}/claim"}), new m("/card-transfers/card-owners", new String[]{"/card-transfers/card-owners", "/card-transfers/card-owners/{id}", "/card-owners/{id}/settings"}), new m("tile-carousels", new String[]{"/tiles/{id}/view", "/tiles/{id}/close", "/tiles/close-all", "/tiles/{id}/open", "my-card/sca-reset", "my-card/{id}/sca-reset"}), new m("my-card/sca-counters", new String[]{"my-card/sca-reset", "my-card/{id}/sca-reset"}), new m("user/current", new String[]{"user/current", "/user/current/username/validate", "user/current/picture", "/user/current/email/code", "/user/current/email/confirm", "user/password", "/user/current/review/user-details/confirm"}), new m("/banners/news", new String[]{"/banners/{type}/{id}/close", "/banners/{type}/{id}/view", "/banners/{type}/{id}/open"}), new m("/banners/local", new String[]{"/banners/{type}/{id}/close", "/banners/{type}/{id}/view", "/banners/{type}/{id}/open"}), new m("travels/stays/aggregators/bookings", new String[]{"travels/stays/bookings/{id}", "travels/stays/pricecheck", "travels/stays/bookings", "travels/stays/preferences/favorites/properties/{propertyId}"}), new m("user/current/accounts", new String[]{"beneficiary", "/beneficiary/exist", "beneficiary/validate", "beneficiary/{id}", "beneficiary/extra-fields", "/beneficiary/{id}/extra-fields", "beneficiary/{id}/settings", "/beneficiary/{id}/personal-designated-account", "/beneficiary/{id}/display-name"}), new m("money-requests", new String[]{"money-requests", "money-requests/{id}/cancel", "money-requests/{id}/remind"}), new m("/user/current/settings/privacy", new String[]{"/user/current/settings/privacy/{settingName}"}), new m("lounge-registrations", new String[]{"lounge-passes", "/flight-registration"}), new m("lifestyle/home/header", new String[]{"/user/current/settings", "/user/current/settings/privacy/{settingName}", "/plans/{id}/subscribe", "/plans/current/cancel"}), new m("lifestyle/home/products", new String[]{"/user/current/settings", "/user/current/settings/privacy/{settingName}", "/plans/{id}/subscribe", "/plans/current/cancel"}), new m("lifestyle/home/feed", new String[]{"point-account", "/loyalty/checklist-step/force-complete", "/user/current/settings", "/user/current/settings/privacy/{settingName}", "/plans/{id}/subscribe", "/plans/current/cancel"}), new m("lifestyle/home/suggested-for-you", new String[]{"/user/current/settings", "/user/current/settings/privacy/{settingName}", "/loyalty/checklist-step/force-complete", "/plans/{id}/subscribe", "/plans/current/cancel"}), new m("lifestyle/content-gateway/get-content", new String[]{"/user/current/settings", "/user/current/settings/privacy/{settingName}", "/loyalty/checklist-step/force-complete", "/plans/{id}/subscribe", "/plans/current/cancel"}), new m("lifestyle/top-offers-widget", new String[]{"/user/current/settings", "/user/current/settings/privacy/{settingName}", "/plans/{id}/subscribe", "/plans/current/cancel"}), new m("profile/picture", new String[]{"/profile/avatars", "/profile/avatars/{id}"})};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        String[] elements2 = {"user/current/activate", "preorders", "insurance/all", "insurance/travel/calc", "/insurance/travel/{id}/upgrade/calc", "insurance/travel/order", "insurance/travel/{id}/reactivate", "insurance/travel/{id}", "insurance/travel/{id}/verify", "insurance/{id}/docs-acknowledge", "/plans/{id}/subscribe", "/plans/current/cancel", "split-bills", "split-bills/{id}", "lounge-registrations", "lounge-passes", "my-card/all", "my-card/issue/virtual", "my-card/issue", "my-card/{id}/delivery", "my-card/{id}/block", "my-card/{id}/unblock", "my-card/{id}/label", "my-card/{id}/report-lost", "my-card/{id}", "my-card/link", "my-card/{id}/limit", "my-card/{id}/pin/unblock", "my-card/{id}/delivery/confirm", "my-card/{id}/settings", "my-card/{id}/customisations", "my-card/{id}/pockets", "gifts", "/gifts/{id}/feedback", "/gifts/{giftId}/claim", "/user/current/global-search/v2/preferences", "/card-transfers/card-owners", "/card-transfers/card-owners/{id}", "/card-owners/{id}/settings", "user/current/features", "user/current/features/{name}/unlock", "terms", "/terms/accepted", "/terms/to-accept", "/terms/{id}/accept", "/tiles/close-all", "/tiles/{id}/close", "/tiles/{id}/open", "/tiles/{id}/view", "tile-carousels", "travels/stays/cashbacks/rates", "trading-access/portfolios/{portfolioId}/holdings/{holdingId}/buy", "trading-access/portfolios/{portfolioId}/holdings/{holdingId}/sell", "user/current", "/user/current/username/validate", "user/current/picture", "/user/current/email/code", "/user/current/email/confirm", "user/password", "/user/current/review/user-details/confirm", "/banners/news", "/banners/local", "/banners/{type}/{id}/close", "/banners/{type}/{id}/view", "/banners/{type}/{id}/open", "travels/stays/aggregators/bookings", "travels/stays/bookings/{id}", "travels/stays/pricecheck", "travels/stays/bookings", "travels/stays/preferences/favorites/properties/{propertyId}", "user/current/accounts", "beneficiary", "/beneficiary/exist", "beneficiary/validate", "beneficiary/{id}", "beneficiary/extra-fields", "/beneficiary/{id}/extra-fields", "beneficiary/{id}/settings", "/beneficiary/{id}/personal-designated-account", "/beneficiary/{id}/display-name", "money-requests", "money-requests/{id}/cancel", "money-requests/{id}/remind", "/paylater/v2/upcoming-payments", "/paylater/switch/off", "/paylater/switch/on", "/paylater/manual-repayments", "/user/current/settings", "/user/current/settings/privacy", "/user/current/settings/privacy/{settingName}", "/assets/quote", "/youth/config", "my-card/sca-reset", "my-card/{id}/sca-reset", "my-card/sca-counters", "money-request", "money-request/{id}", "money-request/{id}/accept", "money-request/{id}/reject", "money-request/{id}/remind", "point-account", "/loyalty/checklist-step/force-complete", "lifestyle/home/feed", "lifestyle/home/products", "lifestyle/home/header", "lifestyle/home/suggested-for-you", "lifestyle/top-offers-widget", "lifestyle/content-gateway/get-content", "profile/picture", "/profile/avatars", "/profile/avatars/{id}"};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return new h(setY0, kotlin.collections.d.y0(elements2), readWriteLockPool, cacheProvider, networkConfiguration);
    }

    public final bk0.e h() {
        qj0.g gVar = qj0.h.Companion;
        gVar.getClass();
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        Intrinsics.checkNotNullExpressionValue(clockSystemDefaultZone, "systemDefaultZone(...)");
        s.k(clockSystemDefaultZone);
        dm0.d dVarD = this.e.d();
        s.j(dVarD);
        qd0.b bVarN = this.f216293a.n();
        s.j(bVarN);
        gVar.getClass();
        rj0.b provider = this.f;
        Intrinsics.checkNotNullParameter(provider, "provider");
        b1j.a aVarA = ((cpi.i) provider).a();
        s.k(aVarA);
        jj0.a aVarD = ((oad.a) this.d).d();
        ck0.b bVarB = b();
        ij0.a aVar = this.f216295c;
        ah.a factory = new ah.a(clockSystemDefaultZone, aVar, dVarD, bVarN, aVarA, aVarD, bVarB);
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new bk0.e(clockSystemDefaultZone, aVar, dVarD, bVarN, aVarA, aVarD, bVarB);
    }

    public final wj0.a i() {
        return (wj0.a) this.f216305s.get();
    }

    public final hk0.a j() {
        t tVarO = o();
        l70.e eVar = this.f216293a;
        g80.c cVarY = eVar.y();
        s.j(cVarY);
        zk0.b bVarL = eVar.l();
        s.j(bVarL);
        return new hk0.a(tVarO, cVarY, bVarL);
    }

    public final r10.f k() {
        return new r10.f(this.f216294b.b(), this.f216295c);
    }

    public final xj0.i l() {
        return (xj0.i) this.z.get();
    }

    public final ik0.b m() {
        return (ik0.b) this.D.get();
    }

    public final sj0.b n() {
        qf0.c cVarA = this.f216301n.a();
        s.j(cVarA);
        zm0.c cVarJ = this.k.j();
        s.j(cVarJ);
        return new sj0.b(cVarA, cVarJ);
    }

    public final t o() {
        return new t(qgh.c.v(l.a((ik0.b) this.D.get(), (OkHttpClient) this.E.get())));
    }
}
