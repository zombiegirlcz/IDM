package lfg;

import androidx.room.util.DBUtil;
import com.revolut.feature.travel.miles.api.model.TravelMilesProvider;
import com.revolut.feature.travel.miles.impl.network.TravelMilesService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesService f194914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ofg.g f194915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f194916c;
    public final w4l.f d;

    public s(TravelMilesService service, ne0.j memoryCache, ofg.g providersDao) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(providersDao, "providersDao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f194914a = service;
        this.f194915b = providersDao;
        this.f194916c = memoryCache;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: lfg.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f194911b;

            {
                this.f194911b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<xfg.t>> providers = this.f194911b.f194914a.getProviders();
                        le3.y yVar = new le3.y(new le3.b(28), 12);
                        providers.getClass();
                        ufm.i iVar = new ufm.i(providers, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List providers2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(providers2, "providers");
                        this.f194911b.f194916c.f("CACHE_KEY_PROVIDERS", providers2);
                        break;
                    default:
                        List providers3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(providers3, "providers");
                        ofg.g gVar = this.f194911b.f194915b;
                        List list = providers3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(zi0.c.X((TravelMilesProvider) it8.next()));
                        }
                        DBUtil.performBlocking(gVar.f224846a, false, true, new ofg.e(gVar, arrayList, 1));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: lfg.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f194913b;

            {
                this.f194913b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit unit = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        return (List) this.f194913b.f194916c.get("CACHE_KEY_PROVIDERS");
                    default:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        ofg.g gVar = this.f194913b.f194915b;
                        List list = (List) DBUtil.performBlocking(gVar.f224846a, true, false, new ofg.f(gVar, 0));
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(zi0.c.Q((qfg.f) it8.next()));
                        }
                        return arrayList;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: lfg.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f194911b;

            {
                this.f194911b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<xfg.t>> providers = this.f194911b.f194914a.getProviders();
                        le3.y yVar = new le3.y(new le3.b(28), 12);
                        providers.getClass();
                        ufm.i iVar = new ufm.i(providers, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List providers2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(providers2, "providers");
                        this.f194911b.f194916c.f("CACHE_KEY_PROVIDERS", providers2);
                        break;
                    default:
                        List providers3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(providers3, "providers");
                        ofg.g gVar = this.f194911b.f194915b;
                        List list = providers3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(zi0.c.X((TravelMilesProvider) it8.next()));
                        }
                        DBUtil.performBlocking(gVar.f224846a, false, true, new ofg.e(gVar, arrayList, 1));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: lfg.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f194913b;

            {
                this.f194913b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit unit = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        return (List) this.f194913b.f194916c.get("CACHE_KEY_PROVIDERS");
                    default:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        ofg.g gVar = this.f194913b.f194915b;
                        List list = (List) DBUtil.performBlocking(gVar.f224846a, true, false, new ofg.f(gVar, 0));
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(zi0.c.Q((qfg.f) it8.next()));
                        }
                        return arrayList;
                }
            }
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: lfg.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f194911b;

            {
                this.f194911b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<xfg.t>> providers = this.f194911b.f194914a.getProviders();
                        le3.y yVar = new le3.y(new le3.b(28), 12);
                        providers.getClass();
                        ufm.i iVar = new ufm.i(providers, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List providers2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(providers2, "providers");
                        this.f194911b.f194916c.f("CACHE_KEY_PROVIDERS", providers2);
                        break;
                    default:
                        List providers3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(providers3, "providers");
                        ofg.g gVar = this.f194911b.f194915b;
                        List list = providers3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(zi0.c.X((TravelMilesProvider) it8.next()));
                        }
                        DBUtil.performBlocking(gVar.f224846a, false, true, new ofg.e(gVar, arrayList, 1));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
