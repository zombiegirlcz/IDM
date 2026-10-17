package xra;

import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.push_to_card.impl.storage.PushToCardService;
import efm.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import qe0.s;
import xo8.i0;
import xo8.u;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class h {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PushToCardService f308312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qra.a f308313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f308314c;
    public final k d;
    public final o e;
    public final sf0.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s f308315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f308316h;
    public final w4l.f i;

    public h(PushToCardService pushToCardService, qra.a pushToCardDao, j statsRepository, k statsCalculator, mra.f cardOwnerToSubmitDtoMapper, mra.h cardOwnerUpdateDtoMapper, ne0.j memoryCache, o gson, sf0.h serverErrorParser, ze0.a forceReloadStrategyFactory) {
        Intrinsics.checkNotNullParameter(pushToCardService, "pushToCardService");
        Intrinsics.checkNotNullParameter(pushToCardDao, "pushToCardDao");
        Intrinsics.checkNotNullParameter(statsRepository, "statsRepository");
        Intrinsics.checkNotNullParameter(statsCalculator, "statsCalculator");
        Intrinsics.checkNotNullParameter(cardOwnerToSubmitDtoMapper, "cardOwnerToSubmitDtoMapper");
        Intrinsics.checkNotNullParameter(cardOwnerUpdateDtoMapper, "cardOwnerUpdateDtoMapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(forceReloadStrategyFactory, "forceReloadStrategyFactory");
        this.f308312a = pushToCardService;
        this.f308313b = pushToCardDao;
        this.f308314c = statsRepository;
        this.d = statsCalculator;
        this.e = gson;
        this.f = serverErrorParser;
        this.f308315g = ((ze0.c) forceReloadStrategyFactory).b(180000L);
        final int i = 0;
        final int i2 = 1;
        this.f308316h = new w4l.f(new Function2(this) { // from class: xra.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f308311b;

            {
                this.f308311b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i3 = i;
                h hVar = this.f308311b;
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<lqa.f>> cardOwners = hVar.f308312a.getCardOwners();
                        u uVar = new u(15, new i0(22));
                        cardOwners.getClass();
                        ufm.f fVar = new ufm.f(new ufm.i(cardOwners, uVar, 1), new u(16, new a(hVar, 3)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        return fVar;
                    case 1:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        j jVar = hVar.f308314c;
                        List list = domain;
                        ArrayList existingIds = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            existingIds.add(((CardOwner) it9.next()).f81490a);
                        }
                        jVar.getClass();
                        Intrinsics.checkNotNullParameter(existingIds, "existingIds");
                        jVar.f308317a.a(existingIds);
                        qra.a aVar = hVar.f308313b;
                        Intrinsics.checkNotNullParameter(domain, "<this>");
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it10 = list.iterator();
                        while (it10.hasNext()) {
                            arrayList.add(g4i.a.J((CardOwner) it10.next()));
                        }
                        aVar.g(arrayList);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<lqa.f> cardOwner = hVar.f308312a.getCardOwner(id10);
                        e eVar = e.f;
                        x2l.a aVar2 = new x2l.a(13, false);
                        cardOwner.getClass();
                        ufm.i iVar = new ufm.i(cardOwner, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        CardOwner domain2 = (CardOwner) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        hVar.f308313b.h(g4i.a.J(domain2));
                        return Unit.f186387a;
                }
            }
        }, new bek.c(memoryCache, 8), new bek.d(memoryCache, 8), new a(this, 2), new Function2(this) { // from class: xra.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f308311b;

            {
                this.f308311b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i3 = i2;
                h hVar = this.f308311b;
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<lqa.f>> cardOwners = hVar.f308312a.getCardOwners();
                        u uVar = new u(15, new i0(22));
                        cardOwners.getClass();
                        ufm.f fVar = new ufm.f(new ufm.i(cardOwners, uVar, 1), new u(16, new a(hVar, 3)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        return fVar;
                    case 1:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        j jVar = hVar.f308314c;
                        List list = domain;
                        ArrayList existingIds = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            existingIds.add(((CardOwner) it9.next()).f81490a);
                        }
                        jVar.getClass();
                        Intrinsics.checkNotNullParameter(existingIds, "existingIds");
                        jVar.f308317a.a(existingIds);
                        qra.a aVar = hVar.f308313b;
                        Intrinsics.checkNotNullParameter(domain, "<this>");
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it10 = list.iterator();
                        while (it10.hasNext()) {
                            arrayList.add(g4i.a.J((CardOwner) it10.next()));
                        }
                        aVar.g(arrayList);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<lqa.f> cardOwner = hVar.f308312a.getCardOwner(id10);
                        e eVar = e.f;
                        x2l.a aVar2 = new x2l.a(13, false);
                        cardOwner.getClass();
                        ufm.i iVar = new ufm.i(cardOwner, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        CardOwner domain2 = (CardOwner) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        hVar.f308313b.h(g4i.a.J(domain2));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i3 = 2;
        final int i5 = 3;
        this.i = new w4l.f(new Function2(this) { // from class: xra.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f308311b;

            {
                this.f308311b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i32 = i3;
                h hVar = this.f308311b;
                switch (i32) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<lqa.f>> cardOwners = hVar.f308312a.getCardOwners();
                        u uVar = new u(15, new i0(22));
                        cardOwners.getClass();
                        ufm.f fVar = new ufm.f(new ufm.i(cardOwners, uVar, 1), new u(16, new a(hVar, 3)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        return fVar;
                    case 1:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        j jVar = hVar.f308314c;
                        List list = domain;
                        ArrayList existingIds = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            existingIds.add(((CardOwner) it9.next()).f81490a);
                        }
                        jVar.getClass();
                        Intrinsics.checkNotNullParameter(existingIds, "existingIds");
                        jVar.f308317a.a(existingIds);
                        qra.a aVar = hVar.f308313b;
                        Intrinsics.checkNotNullParameter(domain, "<this>");
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it10 = list.iterator();
                        while (it10.hasNext()) {
                            arrayList.add(g4i.a.J((CardOwner) it10.next()));
                        }
                        aVar.g(arrayList);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<lqa.f> cardOwner = hVar.f308312a.getCardOwner(id10);
                        e eVar = e.f;
                        x2l.a aVar2 = new x2l.a(13, false);
                        cardOwner.getClass();
                        ufm.i iVar = new ufm.i(cardOwner, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        CardOwner domain2 = (CardOwner) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        hVar.f308313b.h(g4i.a.J(domain2));
                        return Unit.f186387a;
                }
            }
        }, new bek.c(memoryCache, 9), new bek.d(memoryCache, 9), new a(this, 4), new Function2(this) { // from class: xra.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f308311b;

            {
                this.f308311b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i32 = i5;
                h hVar = this.f308311b;
                switch (i32) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<lqa.f>> cardOwners = hVar.f308312a.getCardOwners();
                        u uVar = new u(15, new i0(22));
                        cardOwners.getClass();
                        ufm.f fVar = new ufm.f(new ufm.i(cardOwners, uVar, 1), new u(16, new a(hVar, 3)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        return fVar;
                    case 1:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        j jVar = hVar.f308314c;
                        List list = domain;
                        ArrayList existingIds = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            existingIds.add(((CardOwner) it9.next()).f81490a);
                        }
                        jVar.getClass();
                        Intrinsics.checkNotNullParameter(existingIds, "existingIds");
                        jVar.f308317a.a(existingIds);
                        qra.a aVar = hVar.f308313b;
                        Intrinsics.checkNotNullParameter(domain, "<this>");
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it10 = list.iterator();
                        while (it10.hasNext()) {
                            arrayList.add(g4i.a.J((CardOwner) it10.next()));
                        }
                        aVar.g(arrayList);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<lqa.f> cardOwner = hVar.f308312a.getCardOwner(id10);
                        e eVar = e.f;
                        x2l.a aVar2 = new x2l.a(13, false);
                        cardOwner.getClass();
                        ufm.i iVar = new ufm.i(cardOwner, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        CardOwner domain2 = (CardOwner) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        hVar.f308313b.h(g4i.a.J(domain2));
                        return Unit.f186387a;
                }
            }
        }, new xpe.c(this, memoryCache, 9), null, null, 192);
    }
}
