package spa;

import com.google.firebase.messaging.u;
import com.revolut.core.extensions.rx.BreadcrumbException;
import e0f.n;
import efm.r;
import ipa.k;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import m30.j;
import mm0.o;
import mm0.p;
import n30.l;
import n30.m;
import n30.p0;
import no.s1;
import org.jetbrains.annotations.NotNull;
import qza.x;
import skm.e0;
import te0.w;
import wim.z;

/* JADX INFO: loaded from: classes13.dex */
public final class i extends nri.a implements e0m.d {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ifm.b f264920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4m.a f264921c;
    public final d4m.a d;
    public final d4m.a e;
    public final d4m.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d4m.a f264922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d4m.a f264923h;
    public final d4m.a i;

    public i(ifm.b compositeDisposable, d4m.a pushProcessingInteractor, d4m.a pushMessagingService, d4m.a storage, d4m.a sessionProvider, d4m.a deviceRepository, d4m.a chatInteractor, d4m.a inAppCallRequestsInteractor) {
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(pushProcessingInteractor, "pushProcessingInteractor");
        Intrinsics.checkNotNullParameter(pushMessagingService, "pushMessagingService");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        Intrinsics.checkNotNullParameter(chatInteractor, "chatInteractor");
        Intrinsics.checkNotNullParameter(inAppCallRequestsInteractor, "inAppCallRequestsInteractor");
        this.f264920b = compositeDisposable;
        this.f264921c = pushProcessingInteractor;
        this.d = pushMessagingService;
        this.e = storage;
        this.f = sessionProvider;
        this.f264922g = deviceRepository;
        this.f264923h = chatInteractor;
        this.i = inAppCallRequestsInteractor;
    }

    @Override // nri.a
    public final void i3() {
        d4m.a aVar = this.d;
        hi0.b bVar = (hi0.b) ((hh0.c) aVar.get());
        r rVarDistinctUntilChanged = bVar.f152441a.a().x().onErrorResumeNext(r.empty()).concatWith(bVar.f152443c).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        r rVarW0 = w.w0(rVarDistinctUntilChanged);
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: spa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f264913b;

            {
                this.f264913b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i2 = i;
                i iVar = this.f264913b;
                switch (i2) {
                    case 0:
                        String token = (String) obj2;
                        Intrinsics.checkNotNullParameter(token, "it");
                        gom.c cVar = gom.e.f145194a;
                        cVar.f("RetailCloudMessagingServiceListener");
                        cVar.i("Push token updated: " + token, new Object[0]);
                        d1j.a aVar2 = (d1j.a) iVar.e.get();
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(token, "token");
                        aVar2.f110652b.G(token, "fcm_token", z.d(o0.b(String.class)));
                        aVar2.f110653c.onNext(token);
                        ifm.b bVar2 = iVar.f264920b;
                        pfm.a aVar3 = new pfm.a(((p0) ((j) iVar.i.get())).c(token), new bo.e(9, new x(new BreadcrumbException(), 8)), 2);
                        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
                        ofm.h hVarW = aVar3.w(new n(3, f.f264917a), e.f264916a);
                        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                        w.j0(bVar2, hVarW);
                        o oVarD = ((cn0.g) ((zm0.c) iVar.f.get())).d();
                        if ((oVarD instanceof mm0.n) || (oVarD instanceof p)) {
                            pfm.a aVar4 = new pfm.a(w.g0(((s21.a) iVar.f264922g.get()).f259241a.patchDeviceInfo()), new bo.e(9, new ry7.j(new BreadcrumbException(), 17)), 2);
                            Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
                            ofm.h hVarW2 = aVar4.w(new n(3, h.f264919a), g.f264918a);
                            Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
                            w.j0(bVar2, hVarW2);
                            n30.n nVar = (n30.n) ((n30.a) iVar.f264923h.get());
                            lfm.c cVar2 = nVar.f211649c;
                            pfm.a aVar5 = new pfm.a(w.g0(nVar.f211648b.syncPushToken()), new kgm.c(new n0c.p(new BreadcrumbException(), 7), (byte) 0), 2);
                            Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
                            ofm.h hVarW3 = aVar5.w(new lhi.b(7, m.f211645a), l.f211643a);
                            Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
                            w.j0(cVar2, hVarW3);
                        }
                        break;
                    default:
                        hh0.b it8 = (hh0.b) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        gom.c cVar3 = gom.e.f145194a;
                        cVar3.f("RetailCloudMessagingServiceListener");
                        cVar3.i("Push message received: " + it8.a(), new Object[0]);
                        qpa.c cVar4 = (qpa.c) iVar.f264921c.get();
                        ipa.j message = new ipa.j(it8.a());
                        cVar4.getClass();
                        Intrinsics.checkNotNullParameter(message, "message");
                        u uVar = cVar4.f248323b;
                        ipa.h category = k.l(message);
                        String strG = k.g(message);
                        String strJ = k.j(message);
                        String strN = k.n(message);
                        String strK = k.k(message);
                        Intrinsics.checkNotNullParameter(category, "category");
                        e0.C(((gpk.c) uVar.e).c(), null, null, new s1(uVar, category, strG, strJ, strN, strK, null, 1), 3);
                        Iterator it9 = cVar4.f248322a.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                hpa.a aVar6 = (hpa.a) it9.next();
                                if (aVar6.b(message)) {
                                    String simpleName = qpa.c.class.getSimpleName();
                                    Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                    rd0.d.b(rd0.c.INFO, simpleName, a0.d.s("Push message ", k.h(message), " was intercepted by ", aVar6.getClass().getSimpleName()), null, null, 16);
                                }
                            }
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        r rVarOnErrorResumeNext = rVarW0.onErrorResumeNext(new bo.e(9, new x(new BreadcrumbException(), 6)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new n(3, function1), new n(3, c.f264914a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        ifm.b bVar2 = this.f264920b;
        w.j0(bVar2, cVarSubscribe);
        r map = ((hi0.b) ((hh0.c) aVar.get())).f152442b.map(new ag.j(new an0.e(20), 25));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        final int i2 = 1;
        Function1 function12 = new Function1(this) { // from class: spa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f264913b;

            {
                this.f264913b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i2;
                i iVar = this.f264913b;
                switch (i22) {
                    case 0:
                        String token = (String) obj2;
                        Intrinsics.checkNotNullParameter(token, "it");
                        gom.c cVar = gom.e.f145194a;
                        cVar.f("RetailCloudMessagingServiceListener");
                        cVar.i("Push token updated: " + token, new Object[0]);
                        d1j.a aVar2 = (d1j.a) iVar.e.get();
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(token, "token");
                        aVar2.f110652b.G(token, "fcm_token", z.d(o0.b(String.class)));
                        aVar2.f110653c.onNext(token);
                        ifm.b bVar22 = iVar.f264920b;
                        pfm.a aVar3 = new pfm.a(((p0) ((j) iVar.i.get())).c(token), new bo.e(9, new x(new BreadcrumbException(), 8)), 2);
                        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
                        ofm.h hVarW = aVar3.w(new n(3, f.f264917a), e.f264916a);
                        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                        w.j0(bVar22, hVarW);
                        o oVarD = ((cn0.g) ((zm0.c) iVar.f.get())).d();
                        if ((oVarD instanceof mm0.n) || (oVarD instanceof p)) {
                            pfm.a aVar4 = new pfm.a(w.g0(((s21.a) iVar.f264922g.get()).f259241a.patchDeviceInfo()), new bo.e(9, new ry7.j(new BreadcrumbException(), 17)), 2);
                            Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
                            ofm.h hVarW2 = aVar4.w(new n(3, h.f264919a), g.f264918a);
                            Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
                            w.j0(bVar22, hVarW2);
                            n30.n nVar = (n30.n) ((n30.a) iVar.f264923h.get());
                            lfm.c cVar2 = nVar.f211649c;
                            pfm.a aVar5 = new pfm.a(w.g0(nVar.f211648b.syncPushToken()), new kgm.c(new n0c.p(new BreadcrumbException(), 7), (byte) 0), 2);
                            Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
                            ofm.h hVarW3 = aVar5.w(new lhi.b(7, m.f211645a), l.f211643a);
                            Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
                            w.j0(cVar2, hVarW3);
                        }
                        break;
                    default:
                        hh0.b it8 = (hh0.b) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        gom.c cVar3 = gom.e.f145194a;
                        cVar3.f("RetailCloudMessagingServiceListener");
                        cVar3.i("Push message received: " + it8.a(), new Object[0]);
                        qpa.c cVar4 = (qpa.c) iVar.f264921c.get();
                        ipa.j message = new ipa.j(it8.a());
                        cVar4.getClass();
                        Intrinsics.checkNotNullParameter(message, "message");
                        u uVar = cVar4.f248323b;
                        ipa.h category = k.l(message);
                        String strG = k.g(message);
                        String strJ = k.j(message);
                        String strN = k.n(message);
                        String strK = k.k(message);
                        Intrinsics.checkNotNullParameter(category, "category");
                        e0.C(((gpk.c) uVar.e).c(), null, null, new s1(uVar, category, strG, strJ, strN, strK, null, 1), 3);
                        Iterator it9 = cVar4.f248322a.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                hpa.a aVar6 = (hpa.a) it9.next();
                                if (aVar6.b(message)) {
                                    String simpleName = qpa.c.class.getSimpleName();
                                    Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                    rd0.d.b(rd0.c.INFO, simpleName, a0.d.s("Push message ", k.h(message), " was intercepted by ", aVar6.getClass().getSimpleName()), null, null, 16);
                                }
                            }
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        r rVarOnErrorResumeNext2 = map.onErrorResumeNext(new bo.e(9, new x(new BreadcrumbException(), 7)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new n(3, function12), new n(3, d.f264915a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe2, "subscribe(...)");
        w.j0(bVar2, cVarSubscribe2);
    }
}
