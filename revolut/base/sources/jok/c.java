package jok;

import android.content.Context;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.network.WaitlistService;
import hd.r;
import ip0.v7;
import java.util.List;
import jm4.o3;
import kl.b0;
import kl.t1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import nfj.l1;
import o29.l;
import okf.m;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj0.a f177151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee0.a f177152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final an0.c f177153c;
    public final ite.a d;
    public final cri.b e;
    public final Context f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f177154g = this;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f177155h;
    public final e4m.e i;

    public c(ee0.a aVar, nj0.a aVar2, ite.a aVar3, cri.b bVar, an0.c cVar, Context context) {
        this.f177151a = aVar2;
        this.f177152b = aVar;
        this.f177153c = cVar;
        this.d = aVar3;
        this.e = bVar;
        this.f = context;
        int i = 6;
        this.f177155h = e4m.b.b(new o3(this, 0, i));
        this.i = e4m.b.b(new o3(this, 1, i));
    }

    public final t1 a() {
        Retrofit retrofit = ((nj0.d) this.f177151a).f();
        h.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(WaitlistService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        WaitlistService service = (WaitlistService) objCreate;
        s.k(service);
        j memoryCache = (j) this.f177155h.get();
        ue0.c storage = (ue0.c) this.i.get();
        b0 errorParser = new b0(fe0.c.a());
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(errorParser, "errorParser");
        final r rVar = new r();
        rVar.f151364a = service;
        rVar.f151365b = memoryCache;
        rVar.f151366c = storage;
        rVar.d = errorParser;
        Continuation continuation = null;
        final int i = 0;
        rVar.e = new x4l.c(new m(rVar, null), new Function1() { // from class: ook.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        c params = (c) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) ((j) rVar.f151365b).get(params.a());
                    default:
                        String entryId = (String) obj2;
                        Intrinsics.checkNotNullParameter(entryId, "entryId");
                        return (gok.f) v7.r("waitlist_layout_", entryId, (j) rVar.f151365b);
                }
            }
        }, new Function2() { // from class: ook.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        c params = (c) obj2;
                        List entries = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(entries, "entries");
                        ((j) rVar.f151365b).f(params.a(), entries);
                        break;
                    default:
                        String entryId = (String) obj2;
                        gok.f layout = (gok.f) obj3;
                        Intrinsics.checkNotNullParameter(entryId, "entryId");
                        Intrinsics.checkNotNullParameter(layout, "layout");
                        ((j) rVar.f151365b).f("waitlist_layout_" + entryId, layout);
                        break;
                }
                return Unit.f186387a;
            }
        }, new ook.h(rVar, continuation, i), new l1(rVar, continuation, 19));
        final int i2 = 1;
        rVar.f = new x4l.c(new l(rVar, continuation, 10), new Function1() { // from class: ook.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        c params = (c) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) ((j) rVar.f151365b).get(params.a());
                    default:
                        String entryId = (String) obj2;
                        Intrinsics.checkNotNullParameter(entryId, "entryId");
                        return (gok.f) v7.r("waitlist_layout_", entryId, (j) rVar.f151365b);
                }
            }
        }, new Function2() { // from class: ook.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        c params = (c) obj2;
                        List entries = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(entries, "entries");
                        ((j) rVar.f151365b).f(params.a(), entries);
                        break;
                    default:
                        String entryId = (String) obj2;
                        gok.f layout = (gok.f) obj3;
                        Intrinsics.checkNotNullParameter(entryId, "entryId");
                        Intrinsics.checkNotNullParameter(layout, "layout");
                        ((j) rVar.f151365b).f("waitlist_layout_" + entryId, layout);
                        break;
                }
                return Unit.f186387a;
            }
        }, new ook.h(rVar, continuation, i2), new l1(rVar, continuation, 20));
        return new t1(rVar);
    }
}
