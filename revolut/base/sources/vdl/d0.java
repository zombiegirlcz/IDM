package vdl;

import com.revolut.shared.feature.wealth.domain.impl.data.network.IpoInstrumentService;
import ip0.v7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class d0 {

    @NotNull
    private static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IpoInstrumentService f287951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dcl.n0 f287952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dcl.o0 f287953c;
    public final ne0.j d;
    public final x4l.c e;

    public d0(IpoInstrumentService service, dcl.n0 detailsDao, dcl.o0 summaryDao, ne0.j memoryCache, b80.c connectivityRepository) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(detailsDao, "detailsDao");
        Intrinsics.checkNotNullParameter(summaryDao, "summaryDao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(connectivityRepository, "connectivityRepository");
        this.f287951a = service;
        this.f287952b = detailsDao;
        this.f287953c = summaryDao;
        this.d = memoryCache;
        Continuation continuation = null;
        final int i = 0;
        new x4l.c(new uec.d(connectivityRepository, this, continuation, 27), new Function1(this) { // from class: vdl.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f288073b;

            {
                this.f288073b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        String ref2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        return (oel.a) v7.r("ipo_instrument_details_", ref2, this.f288073b.d);
                    default:
                        Set refs = (Set) obj2;
                        Intrinsics.checkNotNullParameter(refs, "refs");
                        Set set = refs;
                        int iB = zhm.q0.b(zhm.w.t(set, 10));
                        if (iB < 16) {
                            iB = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                        for (Object obj3 : set) {
                            linkedHashMap.put(obj3, (oel.l) v7.r("ipo_instrument_summary_", (String) obj3, this.f288073b.d));
                        }
                        Collection collectionValues = linkedHashMap.values();
                        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                            Iterator it8 = collectionValues.iterator();
                            while (it8.hasNext()) {
                                if (((oel.l) it8.next()) == null) {
                                    return null;
                                }
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            String str = (String) entry.getKey();
                            oel.l lVar = (oel.l) entry.getValue();
                            Pair pair = lVar != null ? new Pair(str, lVar) : null;
                            if (pair != null) {
                                arrayList.add(pair);
                            }
                        }
                        return zhm.r0.t(arrayList);
                }
            }
        }, new Function2(this) { // from class: vdl.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f287938b;

            {
                this.f287938b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        String ref2 = (String) obj2;
                        oel.a ipo = (oel.a) obj3;
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        Intrinsics.checkNotNullParameter(ipo, "ipo");
                        this.f287938b.d.f("ipo_instrument_details_" + ref2, ipo);
                        break;
                    default:
                        Set<String> refs = (Set) obj2;
                        Map summaries = (Map) obj3;
                        Intrinsics.checkNotNullParameter(refs, "refs");
                        Intrinsics.checkNotNullParameter(summaries, "summaries");
                        for (String str : refs) {
                            oel.l lVar = (oel.l) summaries.get(str);
                            if (lVar != null) {
                                this.f287938b.d.f("ipo_instrument_summary_" + str, lVar);
                            }
                        }
                        break;
                }
                return Unit.f186387a;
            }
        }, new c0(this, continuation, i), new uec.d(this, continuation, 28));
        final int i2 = 1;
        final int i3 = 1;
        this.e = new x4l.c(new uec.d(connectivityRepository, this, continuation, 29), new Function1(this) { // from class: vdl.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f288073b;

            {
                this.f288073b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        String ref2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        return (oel.a) v7.r("ipo_instrument_details_", ref2, this.f288073b.d);
                    default:
                        Set refs = (Set) obj2;
                        Intrinsics.checkNotNullParameter(refs, "refs");
                        Set set = refs;
                        int iB = zhm.q0.b(zhm.w.t(set, 10));
                        if (iB < 16) {
                            iB = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                        for (Object obj3 : set) {
                            linkedHashMap.put(obj3, (oel.l) v7.r("ipo_instrument_summary_", (String) obj3, this.f288073b.d));
                        }
                        Collection collectionValues = linkedHashMap.values();
                        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                            Iterator it8 = collectionValues.iterator();
                            while (it8.hasNext()) {
                                if (((oel.l) it8.next()) == null) {
                                    return null;
                                }
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            String str = (String) entry.getKey();
                            oel.l lVar = (oel.l) entry.getValue();
                            Pair pair = lVar != null ? new Pair(str, lVar) : null;
                            if (pair != null) {
                                arrayList.add(pair);
                            }
                        }
                        return zhm.r0.t(arrayList);
                }
            }
        }, new Function2(this) { // from class: vdl.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f287938b;

            {
                this.f287938b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        String ref2 = (String) obj2;
                        oel.a ipo = (oel.a) obj3;
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        Intrinsics.checkNotNullParameter(ipo, "ipo");
                        this.f287938b.d.f("ipo_instrument_details_" + ref2, ipo);
                        break;
                    default:
                        Set<String> refs = (Set) obj2;
                        Map summaries = (Map) obj3;
                        Intrinsics.checkNotNullParameter(refs, "refs");
                        Intrinsics.checkNotNullParameter(summaries, "summaries");
                        for (String str : refs) {
                            oel.l lVar = (oel.l) summaries.get(str);
                            if (lVar != null) {
                                this.f287938b.d.f("ipo_instrument_summary_" + str, lVar);
                            }
                        }
                        break;
                }
                return Unit.f186387a;
            }
        }, new c0(this, continuation, 1), new th6.p(this, continuation, 18));
    }
}
