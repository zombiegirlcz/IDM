package au6;

import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import com.revolut.feature.freelancer.impl.network.services.AcquiringOrdersService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AcquiringOrdersService f9634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f9635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineDispatcher f9636c;
    public final ne0.j d;
    public final is6.a e;
    public final cu6.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f9637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ue0.c f9638h;
    public final skm.r i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final vkm.j2 f9639j;
    public final vkm.u1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x4l.c f9640l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x4l.c f9641m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x4l.c f9642n;

    public v(AcquiringOrdersService api2, CoroutineScope coroutineScope, CoroutineDispatcher ioDispatcher, ne0.j memoryCache, is6.a ordersDao, cu6.a orderFilterMatcher, m orderMetadataRepository, ue0.c storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(ordersDao, "ordersDao");
        Intrinsics.checkNotNullParameter(orderFilterMatcher, "orderFilterMatcher");
        Intrinsics.checkNotNullParameter(orderMetadataRepository, "orderMetadataRepository");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f9634a = api2;
        this.f9635b = coroutineScope;
        this.f9636c = ioDispatcher;
        this.d = memoryCache;
        this.e = ordersDao;
        this.f = orderFilterMatcher;
        this.f9637g = orderMetadataRepository;
        this.f9638h = storage;
        this.i = skm.e0.b();
        Continuation continuation = null;
        vkm.v1 v1Var = new vkm.v1(new ald.l(this, continuation, 16));
        vkm.d2.Companion.getClass();
        Boolean bool = Boolean.FALSE;
        vkm.e2 e2Var = vkm.c2.f290008b;
        vkm.u1 u1VarO = vkm.q.O(v1Var, coroutineScope, e2Var, bool);
        vkm.j2 j2VarC = vkm.q.c(null);
        this.f9639j = j2VarC;
        this.k = vkm.q.O(new vkm.y(new akb.s(this, continuation, 18), new t38.e(j2VarC, 24, u1VarO, new u(3, 0, continuation))), coroutineScope, e2Var, new Data(null, null, true, 3, null));
        int i = 1;
        this.f9640l = new x4l.c(new a0e.m(this, continuation, 28), new p(this, i), new q(this, i), new r(this, continuation, i), new a09.p(this, continuation, 10), new r(this, continuation, 2));
        int i2 = 0;
        this.f9641m = new x4l.c(new o(this, continuation, i2), new p(this, i2), new q(this, i2), new r(this, continuation, i2), new a0e.o(this, continuation, 6));
        int i3 = 2;
        this.f9642n = new x4l.c(new o(this, continuation, 1), new p(this, i3), new q(this, i3), new r(this, continuation, 3), new a0e.o(this, continuation, 7));
    }

    public static final void a(v vVar, List list) {
        Object value;
        ArrayList arrayListF1;
        vkm.j2 j2Var = vVar.f9639j;
        do {
            value = j2Var.getValue();
            Collection collection = (List) value;
            if (collection == null) {
                collection = zhm.f0.f322471a;
            }
            arrayListF1 = zhm.d0.f1(collection);
            for (Object obj2 : list) {
                Iterator it8 = arrayListF1.iterator();
                int i = 0;
                while (true) {
                    if (!it8.hasNext()) {
                        i = -1;
                        break;
                    } else if (Intrinsics.f(((nr6.b) it8.next()).f218537a, ((nr6.b) obj2).f218537a)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    arrayListF1.set(i, obj2);
                } else {
                    arrayListF1.add(obj2);
                }
            }
        } while (!j2Var.h(value, arrayListF1));
    }

    public final List b(List list, AcquiringOrderFilter acquiringOrderFilter) {
        if (acquiringOrderFilter == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (this.f.a((nr6.b) obj2, acquiringOrderFilter)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
