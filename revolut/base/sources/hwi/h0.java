package hwi;

import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungesPassActivityService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class h0 {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AirportLoungesPassActivityService f156222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f156223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f156224c;
    public final x4l.c d;
    public final x4l.c e;

    public h0(AirportLoungesPassActivityService service, ue0.c storage, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f156222a = service;
        this.f156223b = storage;
        this.f156224c = memoryCache;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new ghl.l(this, continuation, 12), new Function1(this) { // from class: hwi.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f156209b;

            {
                this.f156209b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        svi.y0 query = (svi.y0) obj2;
                        Intrinsics.checkNotNullParameter(query, "query");
                        return (svi.z0) this.f156209b.f156224c.get(h0.a(query));
                    default:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f156209b.f156224c.get("KEY_PASS_ACTIVITY_FILTERS");
                }
            }
        }, new Function2(this) { // from class: hwi.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f156212b;

            {
                this.f156212b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        svi.y0 query = (svi.y0) obj2;
                        svi.z0 passActivity = (svi.z0) obj3;
                        Intrinsics.checkNotNullParameter(query, "query");
                        Intrinsics.checkNotNullParameter(passActivity, "passActivity");
                        this.f156212b.f156224c.f(h0.a(query), passActivity);
                        break;
                    default:
                        List filters = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f156212b.f156224c.f("KEY_PASS_ACTIVITY_FILTERS", filters);
                        break;
                }
                return Unit.f186387a;
            }
        }, new hp2.d(this, continuation, 17), new g2e.m0(this, continuation, 23));
        final int i2 = 1;
        this.e = new x4l.c(new e6d.f(this, continuation, 21), new Function1(this) { // from class: hwi.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f156209b;

            {
                this.f156209b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        svi.y0 query = (svi.y0) obj2;
                        Intrinsics.checkNotNullParameter(query, "query");
                        return (svi.z0) this.f156209b.f156224c.get(h0.a(query));
                    default:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f156209b.f156224c.get("KEY_PASS_ACTIVITY_FILTERS");
                }
            }
        }, new Function2(this) { // from class: hwi.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f156212b;

            {
                this.f156212b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        svi.y0 query = (svi.y0) obj2;
                        svi.z0 passActivity = (svi.z0) obj3;
                        Intrinsics.checkNotNullParameter(query, "query");
                        Intrinsics.checkNotNullParameter(passActivity, "passActivity");
                        this.f156212b.f156224c.f(h0.a(query), passActivity);
                        break;
                    default:
                        List filters = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f156212b.f156224c.f("KEY_PASS_ACTIVITY_FILTERS", filters);
                        break;
                }
                return Unit.f186387a;
            }
        }, new hbg.h(this, continuation, 29), new b(this, continuation, 4));
    }

    public static String a(svi.y0 y0Var) {
        String strV0 = kotlin.text.d0.v0(b(y0Var.f266016b), "?", "");
        String str = y0Var.f266015a;
        return a0.d.s("KEY_PASS_ACTIVITY:", str != null ? str : "", ":", strV0);
    }

    public static String b(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!((Set) entry.getValue()).isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        TreeMap treeMapE = zhm.q0.e(linkedHashMap);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry2 : treeMapE.entrySet()) {
            String str = (String) entry2.getKey();
            Set set = (Set) entry2.getValue();
            Intrinsics.h(set);
            List listO0 = zhm.d0.O0(set);
            ArrayList arrayList2 = new ArrayList(zhm.w.t(listO0, 10));
            Iterator it8 = listO0.iterator();
            while (it8.hasNext()) {
                arrayList2.add(str + "=" + ((String) it8.next()));
            }
            zhm.a0.x(arrayList2, arrayList);
        }
        String strK0 = zhm.d0.k0(arrayList, "&", null, null, 0, null, 62);
        return strK0.length() == 0 ? "/lounges/v2/pass-activity" : "/lounges/v2/pass-activity?".concat(strK0);
    }
}
