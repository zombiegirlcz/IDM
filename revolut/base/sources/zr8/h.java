package zr8;

import com.revolut.feature.junior_transfer_request.impl.service.JuniorTransferRequestService;
import efm.d0;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kgm.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import le.u1;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import qe0.s;
import yui.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements b {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorTransferRequestService f324666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pr8.a f324667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f324668c;
    public final s d;
    public final w4l.f e;
    public final i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f324669g;

    public h(JuniorTransferRequestService service, pr8.a dao, j memoryCache, ze0.a forceReloadStrategyFactory) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(forceReloadStrategyFactory, "forceReloadStrategyFactory");
        this.f324666a = service;
        this.f324667b = dao;
        this.f324668c = memoryCache;
        b.Companion companion = kotlin.time.b.INSTANCE;
        final int i = 1;
        this.d = ((ze0.c) forceReloadStrategyFactory).b(kotlin.time.b.f(kotlin.time.c.g(1, pkm.e.MINUTES)));
        final int i2 = 2;
        final int i3 = 0;
        this.e = new w4l.f(new Function2(this) { // from class: zr8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f324664b;

            {
                this.f324664b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                xr8.c cVar;
                int i5 = i2;
                h hVar = this.f324664b;
                switch (i5) {
                    case 0:
                        List requests = (List) obj3;
                        Intrinsics.checkNotNullParameter((a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(requests, "requests");
                        hVar.f324668c.f("JUNIOR_TRANSFER_REQUESTS_KEY", requests);
                        return Unit.f186387a;
                    case 1:
                        List requests2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(requests2, "requests");
                        pr8.a aVar = hVar.f324667b;
                        List list = requests2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            mr8.b bVar = (mr8.b) it8.next();
                            Map map = vr8.a.f291516a;
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            String str = bVar.f208073a;
                            dj0.d dVar = bVar.f208074b;
                            long j2 = dVar.f115082a;
                            String str2 = dVar.f115083b.f306286a;
                            String str3 = bVar.e;
                            String str4 = bVar.f;
                            String str5 = bVar.f208076g;
                            String strG = u1.g(bVar.f208075c, vr8.a.f291516a);
                            long millis = bVar.d.getMillis();
                            String str6 = bVar.f208077h;
                            String str7 = bVar.i;
                            mr8.a aVar2 = bVar.f208078j;
                            Iterator it9 = it8;
                            xr8.a aVar3 = new xr8.a(aVar2.f208070a, aVar2.f208071b, aVar2.f208072c);
                            mr8.a aVar4 = bVar.k;
                            xr8.a aVar5 = new xr8.a(aVar4.f208070a, aVar4.f208071b, aVar4.f208072c);
                            mr8.d dVar2 = bVar.f208079l;
                            if (dVar2 != null) {
                                String strName = dVar2.f208080a.name();
                                dj0.d dVar3 = dVar2.f208081b;
                                cVar = new xr8.c(strName, dVar3 != null ? hx7.a.A(dVar3) : null);
                            } else {
                                cVar = null;
                            }
                            arrayList.add(new xr8.b(str, j2, str2, str3, str4, str5, strG, millis, str6, str7, aVar3, aVar5, cVar));
                            it8 = it9;
                        }
                        aVar.e(arrayList);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        a it10 = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<List<wr8.b>> transferRequests = hVar.f324666a.getTransferRequests();
                        f fVar = f.f;
                        zii.f fVar2 = new zii.f(2);
                        transferRequests.getClass();
                        ufm.i iVar = new ufm.i(transferRequests, fVar2, 1);
                        hVar.d.f(Unit.f186387a);
                        Intrinsics.checkNotNullExpressionValue(iVar, "also(...)");
                        return iVar;
                }
            }
        }, new c(this, i3), new Function2(this) { // from class: zr8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f324664b;

            {
                this.f324664b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                xr8.c cVar;
                int i5 = i3;
                h hVar = this.f324664b;
                switch (i5) {
                    case 0:
                        List requests = (List) obj3;
                        Intrinsics.checkNotNullParameter((a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(requests, "requests");
                        hVar.f324668c.f("JUNIOR_TRANSFER_REQUESTS_KEY", requests);
                        return Unit.f186387a;
                    case 1:
                        List requests2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(requests2, "requests");
                        pr8.a aVar = hVar.f324667b;
                        List list = requests2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            mr8.b bVar = (mr8.b) it8.next();
                            Map map = vr8.a.f291516a;
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            String str = bVar.f208073a;
                            dj0.d dVar = bVar.f208074b;
                            long j2 = dVar.f115082a;
                            String str2 = dVar.f115083b.f306286a;
                            String str3 = bVar.e;
                            String str4 = bVar.f;
                            String str5 = bVar.f208076g;
                            String strG = u1.g(bVar.f208075c, vr8.a.f291516a);
                            long millis = bVar.d.getMillis();
                            String str6 = bVar.f208077h;
                            String str7 = bVar.i;
                            mr8.a aVar2 = bVar.f208078j;
                            Iterator it9 = it8;
                            xr8.a aVar3 = new xr8.a(aVar2.f208070a, aVar2.f208071b, aVar2.f208072c);
                            mr8.a aVar4 = bVar.k;
                            xr8.a aVar5 = new xr8.a(aVar4.f208070a, aVar4.f208071b, aVar4.f208072c);
                            mr8.d dVar2 = bVar.f208079l;
                            if (dVar2 != null) {
                                String strName = dVar2.f208080a.name();
                                dj0.d dVar3 = dVar2.f208081b;
                                cVar = new xr8.c(strName, dVar3 != null ? hx7.a.A(dVar3) : null);
                            } else {
                                cVar = null;
                            }
                            arrayList.add(new xr8.b(str, j2, str2, str3, str4, str5, strG, millis, str6, str7, aVar3, aVar5, cVar));
                            it8 = it9;
                        }
                        aVar.e(arrayList);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        a it10 = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<List<wr8.b>> transferRequests = hVar.f324666a.getTransferRequests();
                        f fVar = f.f;
                        zii.f fVar2 = new zii.f(2);
                        transferRequests.getClass();
                        ufm.i iVar = new ufm.i(transferRequests, fVar2, 1);
                        hVar.d.f(Unit.f186387a);
                        Intrinsics.checkNotNullExpressionValue(iVar, "also(...)");
                        return iVar;
                }
            }
        }, null, new Function2(this) { // from class: zr8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f324664b;

            {
                this.f324664b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                xr8.c cVar;
                int i5 = i;
                h hVar = this.f324664b;
                switch (i5) {
                    case 0:
                        List requests = (List) obj3;
                        Intrinsics.checkNotNullParameter((a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(requests, "requests");
                        hVar.f324668c.f("JUNIOR_TRANSFER_REQUESTS_KEY", requests);
                        return Unit.f186387a;
                    case 1:
                        List requests2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(requests2, "requests");
                        pr8.a aVar = hVar.f324667b;
                        List list = requests2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            mr8.b bVar = (mr8.b) it8.next();
                            Map map = vr8.a.f291516a;
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            String str = bVar.f208073a;
                            dj0.d dVar = bVar.f208074b;
                            long j2 = dVar.f115082a;
                            String str2 = dVar.f115083b.f306286a;
                            String str3 = bVar.e;
                            String str4 = bVar.f;
                            String str5 = bVar.f208076g;
                            String strG = u1.g(bVar.f208075c, vr8.a.f291516a);
                            long millis = bVar.d.getMillis();
                            String str6 = bVar.f208077h;
                            String str7 = bVar.i;
                            mr8.a aVar2 = bVar.f208078j;
                            Iterator it9 = it8;
                            xr8.a aVar3 = new xr8.a(aVar2.f208070a, aVar2.f208071b, aVar2.f208072c);
                            mr8.a aVar4 = bVar.k;
                            xr8.a aVar5 = new xr8.a(aVar4.f208070a, aVar4.f208071b, aVar4.f208072c);
                            mr8.d dVar2 = bVar.f208079l;
                            if (dVar2 != null) {
                                String strName = dVar2.f208080a.name();
                                dj0.d dVar3 = dVar2.f208081b;
                                cVar = new xr8.c(strName, dVar3 != null ? hx7.a.A(dVar3) : null);
                            } else {
                                cVar = null;
                            }
                            arrayList.add(new xr8.b(str, j2, str2, str3, str4, str5, strG, millis, str6, str7, aVar3, aVar5, cVar));
                            it8 = it9;
                        }
                        aVar.e(arrayList);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        a it10 = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<List<wr8.b>> transferRequests = hVar.f324666a.getTransferRequests();
                        f fVar = f.f;
                        zii.f fVar2 = new zii.f(2);
                        transferRequests.getClass();
                        ufm.i iVar = new ufm.i(transferRequests, fVar2, 1);
                        hVar.d.f(Unit.f186387a);
                        Intrinsics.checkNotNullExpressionValue(iVar, "also(...)");
                        return iVar;
                }
            }
        }, null, new c(this, i), null, 168);
        this.f = new i(new c(this, i2));
        this.f324669g = new i(new c(this, 3));
    }

    public final pfm.h a(String str) {
        d0 d0VarFirstOrError = m70.a.g(this.e.f(new a(), this.d.a(Unit.f186387a, false)), null, new znc.j(26), 1).firstOrError();
        zmg.c cVar = new zmg.c(new v(str, 27), 18);
        d0VarFirstOrError.getClass();
        return v7.x(new ufm.f(new ufm.i(d0VarFirstOrError, cVar, 1), new zmg.c(new c(this, 4), 19), 3), "ignoreElement(...)");
    }
}
