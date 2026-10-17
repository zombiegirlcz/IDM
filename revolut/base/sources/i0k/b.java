package i0k;

import com.revolut.retail.feature.marketnews.impl.data.network.services.ScopedSymbolsService;
import efm.d0;
import fi7.s;
import hy2.k;
import hy2.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.bouncycastle.asn1.BERTags;
import te0.w;
import ufm.i;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScopedSymbolsService f157409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzj.b f157410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w4l.f f157411c;

    public b(ScopedSymbolsService service, zzj.b dao, wzj.b cache, b80.c networkStateRepository) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f157409a = service;
        this.f157410b = dao;
        final int i = 0;
        int i2 = 0;
        final int i3 = 1;
        this.f157411c = new w4l.f(w.k0(networkStateRepository, new Function1(this) { // from class: i0k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f157408b;

            {
                this.f157408b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i5 = i;
                b bVar = this.f157408b;
                rzj.c params = (rzj.c) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        ScopedSymbolsService scopedSymbolsService = bVar.f157409a;
                        Object obj3 = e0k.a.f121724a;
                        Intrinsics.checkNotNullParameter(params, "<this>");
                        d0<List<g0k.c>> symbolsForScope = scopedSymbolsService.getSymbolsForScope(u1.g(params, e0k.a.f121725b));
                        l lVar = new l(new k(29), 23);
                        symbolsForScope.getClass();
                        i iVar = new i(symbolsForScope, lVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        List<zzj.a> listB = bVar.f157410b.b(params);
                        ArrayList arrayList = new ArrayList(zhm.w.t(listB, 10));
                        for (zzj.a aVar : listB) {
                            Object obj4 = e0k.a.f121724a;
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            rzj.d dVar = aVar.f326755b;
                            String str = aVar.f326756c;
                            String str2 = aVar.d;
                            xi0.a aVar2 = xi0.b.Companion;
                            String str3 = aVar.e;
                            aVar2.getClass();
                            arrayList.add(new rzj.b(dVar, str, str2, xi0.a.a(str3), aVar.f));
                        }
                        return arrayList;
                }
            }
        }), new hie.b(1, cache, vzj.a.class, "getSymbolsForScope", "getSymbolsForScope(Lcom/revolut/retail/feature/marketnews/api/domain/model/SymbolScope;)Ljava/util/List;", i2, 26), new s(2, cache, vzj.a.class, "cacheSymbolsForScope", "cacheSymbolsForScope(Lcom/revolut/retail/feature/marketnews/api/domain/model/SymbolScope;Ljava/util/List;)V", i2, 16), new Function1(this) { // from class: i0k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f157408b;

            {
                this.f157408b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i5 = i3;
                b bVar = this.f157408b;
                rzj.c params = (rzj.c) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        ScopedSymbolsService scopedSymbolsService = bVar.f157409a;
                        Object obj3 = e0k.a.f121724a;
                        Intrinsics.checkNotNullParameter(params, "<this>");
                        d0<List<g0k.c>> symbolsForScope = scopedSymbolsService.getSymbolsForScope(u1.g(params, e0k.a.f121725b));
                        l lVar = new l(new k(29), 23);
                        symbolsForScope.getClass();
                        i iVar = new i(symbolsForScope, lVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        List<zzj.a> listB = bVar.f157410b.b(params);
                        ArrayList arrayList = new ArrayList(zhm.w.t(listB, 10));
                        for (zzj.a aVar : listB) {
                            Object obj4 = e0k.a.f121724a;
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            rzj.d dVar = aVar.f326755b;
                            String str = aVar.f326756c;
                            String str2 = aVar.d;
                            xi0.a aVar2 = xi0.b.Companion;
                            String str3 = aVar.e;
                            aVar2.getClass();
                            arrayList.add(new rzj.b(dVar, str, str2, xi0.a.a(str3), aVar.f));
                        }
                        return arrayList;
                }
            }
        }, new hw9.b(this, 16), null, null, null, BERTags.FLAGS);
    }
}
