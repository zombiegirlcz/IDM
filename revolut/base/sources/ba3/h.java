package ba3;

import com.revolut.feature.cards_core.impl.data.network.revolutcard.RevolutCardScaService;
import efm.d0;
import h93.n;
import h93.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import ufm.i;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    @NotNull
    private static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutCardScaService f13892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s93.c f13893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f13894c;
    public final w4l.f d;

    public h(RevolutCardScaService revolutCardScaService, s93.c cardScaCountersDao, j memoryCache) {
        Intrinsics.checkNotNullParameter(revolutCardScaService, "revolutCardScaService");
        Intrinsics.checkNotNullParameter(cardScaCountersDao, "cardScaCountersDao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f13892a = revolutCardScaService;
        this.f13893b = cardScaCountersDao;
        this.f13894c = memoryCache;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: ba3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f13889b;

            {
                this.f13889b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<y93.b>> scaCounters = this.f13889b.f13892a.getScaCounters();
                        b79.g gVar = new b79.g(new b96.a(9), 18);
                        scaCounters.getClass();
                        i iVar = new i(scaCounters, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List counters = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(counters, "counters");
                        this.f13889b.f13894c.f("revolut_card_sca_counters_cache_key", counters);
                        break;
                    default:
                        List counters2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(counters2, "counters");
                        s93.c cVar = this.f13889b.f13893b;
                        List<o> list = counters2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (o oVar : list) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str = oVar.f150157a;
                            n nVar = oVar.f150158b;
                            Intrinsics.checkNotNullParameter(nVar, "<this>");
                            arrayList.add(new s93.b(str, new aa3.a(hx7.a.A(nVar.f150154a), nVar.f150155b, hx7.a.A(nVar.f150156c))));
                        }
                        cVar.b(arrayList);
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: ba3.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f13891b;

            {
                this.f13891b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f13891b.f13894c.get("revolut_card_sca_counters_cache_key");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "<unused var>");
                        List<s93.b> listC = this.f13891b.f13893b.c();
                        ArrayList arrayList = new ArrayList(w.t(listC, 10));
                        for (s93.b bVar : listC) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            String str = bVar.f261101a;
                            aa3.a aVar = bVar.f261102b;
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new o(str, new n(aVar.getCount(), hx7.a.v(aVar.getCurrent()), hx7.a.v(aVar.getLimit()))));
                        }
                        return arrayList;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: ba3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f13889b;

            {
                this.f13889b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<y93.b>> scaCounters = this.f13889b.f13892a.getScaCounters();
                        b79.g gVar = new b79.g(new b96.a(9), 18);
                        scaCounters.getClass();
                        i iVar = new i(scaCounters, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List counters = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(counters, "counters");
                        this.f13889b.f13894c.f("revolut_card_sca_counters_cache_key", counters);
                        break;
                    default:
                        List counters2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(counters2, "counters");
                        s93.c cVar = this.f13889b.f13893b;
                        List<o> list = counters2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (o oVar : list) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str = oVar.f150157a;
                            n nVar = oVar.f150158b;
                            Intrinsics.checkNotNullParameter(nVar, "<this>");
                            arrayList.add(new s93.b(str, new aa3.a(hx7.a.A(nVar.f150154a), nVar.f150155b, hx7.a.A(nVar.f150156c))));
                        }
                        cVar.b(arrayList);
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: ba3.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f13891b;

            {
                this.f13891b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f13891b.f13894c.get("revolut_card_sca_counters_cache_key");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "<unused var>");
                        List<s93.b> listC = this.f13891b.f13893b.c();
                        ArrayList arrayList = new ArrayList(w.t(listC, 10));
                        for (s93.b bVar : listC) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            String str = bVar.f261101a;
                            aa3.a aVar = bVar.f261102b;
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new o(str, new n(aVar.getCount(), hx7.a.v(aVar.getCurrent()), hx7.a.v(aVar.getLimit()))));
                        }
                        return arrayList;
                }
            }
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: ba3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f13889b;

            {
                this.f13889b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<y93.b>> scaCounters = this.f13889b.f13892a.getScaCounters();
                        b79.g gVar = new b79.g(new b96.a(9), 18);
                        scaCounters.getClass();
                        i iVar = new i(scaCounters, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List counters = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(counters, "counters");
                        this.f13889b.f13894c.f("revolut_card_sca_counters_cache_key", counters);
                        break;
                    default:
                        List counters2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(counters2, "counters");
                        s93.c cVar = this.f13889b.f13893b;
                        List<o> list = counters2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (o oVar : list) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str = oVar.f150157a;
                            n nVar = oVar.f150158b;
                            Intrinsics.checkNotNullParameter(nVar, "<this>");
                            arrayList.add(new s93.b(str, new aa3.a(hx7.a.A(nVar.f150154a), nVar.f150155b, hx7.a.A(nVar.f150156c))));
                        }
                        cVar.b(arrayList);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
