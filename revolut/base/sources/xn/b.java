package xn;

import android.os.Parcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.protobuf.w0;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.tracking.v3.WidgetDescription;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import no.d;
import org.jetbrains.annotations.NotNull;
import skm.e0;

/* JADX INFO: loaded from: classes17.dex */
public final class b implements qn.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f307295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yn.a f307296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f307297c;
    public final tn.a d;
    public final ReentrantReadWriteLock e;
    public final HashMap f;

    public b(d adsEventsTracker, yn.a adsTrackingSessionRepository, e dateProvider, tn.a viewableRecordContextDecorator) {
        Intrinsics.checkNotNullParameter(adsEventsTracker, "adsEventsTracker");
        Intrinsics.checkNotNullParameter(adsTrackingSessionRepository, "adsTrackingSessionRepository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(viewableRecordContextDecorator, "viewableRecordContextDecorator");
        this.f307295a = adsEventsTracker;
        this.f307296b = adsTrackingSessionRepository;
        this.f307297c = dateProvider;
        this.d = viewableRecordContextDecorator;
        this.e = new ReentrantReadWriteLock();
        this.f = new HashMap();
    }

    public static rn.c c(zn.d dVar, zn.e eVar) {
        AnalyticsProduct analyticsProduct = eVar.f;
        ViewableRecordItem$Type e = dVar.getE();
        if (e instanceof ViewableRecordItem$Type.ViewableRecord) {
            String f100566c = dVar.getF100566c();
            Integer num = ((ViewableRecordItem$Type.ViewableRecord) e).f50287a;
            AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
            Parcelable d = dVar.getD();
            companion.getClass();
            return new rn.a(f100566c, num, true, new AnalyticsContext(AnalyticsContext.Companion.a(d)), eVar.e, analyticsProduct, eVar.f323640b, eVar.f323641c, eVar.d);
        }
        if (!(e instanceof ViewableRecordItem$Type.Impression)) {
            throw new NoWhenBranchMatchedException();
        }
        String f100566c2 = dVar.getF100566c();
        ViewableRecordItem$Type.Impression impression = (ViewableRecordItem$Type.Impression) e;
        Integer num2 = impression.f;
        String str = impression.f50284a;
        String str2 = impression.f50285b;
        String str3 = impression.f50286c;
        Integer num3 = impression.d;
        String str4 = impression.e;
        String str5 = eVar.e;
        AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
        Parcelable d5 = dVar.getD();
        companion2.getClass();
        w0 w0VarA = AnalyticsContext.Companion.a(d5);
        return new rn.b(f100566c2, num2, true, new AnalyticsContext(w0VarA), str5, analyticsProduct, eVar.f323640b, eVar.f323641c, str, str2, str3, num3, str4, 0, 0, 0, 0, 0, 0L, 0L, null);
    }

    public static void e(rn.b bVar, float f) {
        double d = f;
        if (d < 0.25d) {
            bVar.f255380n += 100;
        }
        if (d >= 0.25d) {
            bVar.o += 100;
        }
        if (d >= 0.5d) {
            bVar.f255381p += 100;
        }
        if (d >= 0.75d) {
            bVar.f255382q += 100;
        }
        if (f >= 1.0f) {
            bVar.f255383r += 100;
        }
    }

    public final void a() {
        HashMap map = this.f;
        ReentrantReadWriteLock reentrantReadWriteLock = this.e;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            Collection<rn.c> collectionValues = map.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            for (rn.c cVar : collectionValues) {
                Intrinsics.h(cVar);
                b(cVar);
            }
            map.clear();
            Unit unit = Unit.f186387a;
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th10) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th10;
        }
    }

    public final void b(rn.c cVar) {
        AnalyticsProduct product;
        AnalyticsProduct product2;
        d dVar = this.f307295a;
        gpk.c cVar2 = dVar.f217751a;
        boolean z = cVar instanceof rn.a;
        tn.a aVar = this.d;
        yn.a aVar2 = this.f307296b;
        if (z) {
            rn.a aVar3 = (rn.a) cVar;
            String str = aVar3.f255367a;
            boolean zA = aVar2.a(str);
            aVar2.b(str);
            String identifier = aVar3.f255367a;
            Integer num = aVar3.f255368b;
            AnalyticsContext analyticsContext = aVar3.d;
            String str2 = aVar3.e;
            AnalyticsProduct analyticsProduct = aVar3.f;
            String str3 = aVar3.f255370g;
            Integer num2 = aVar3.f255371h;
            WidgetDescription widgetDescription = aVar3.i;
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            AnalyticsContext analyticsContextA = aVar.a(new rn.a(identifier, num, zA, analyticsContext, str2, analyticsProduct, str3, num2, widgetDescription));
            if (analyticsContextA == null || (product2 = aVar3.f) == null) {
                return;
            }
            String str4 = aVar3.e;
            w0 w0Var = analyticsContextA.f50296a;
            String str5 = aVar3.f255370g;
            Integer num3 = aVar3.f255371h;
            Integer num4 = aVar3.f255368b;
            WidgetDescription widgetDescription2 = aVar3.i;
            Intrinsics.checkNotNullParameter(product2, "product");
            e0.C(cVar2.c(), null, null, new no.c(str4, product2, w0Var, str5, num3, num4, widgetDescription2, dVar, null), 3);
            return;
        }
        if (!(cVar instanceof rn.b)) {
            throw new NoWhenBranchMatchedException();
        }
        rn.b bVar = (rn.b) cVar;
        String str6 = bVar.f255372a;
        if (bVar.f255385t == 0) {
            bVar.f255385t = System.currentTimeMillis();
        }
        boolean zA2 = aVar2.a(str6);
        aVar2.b(str6);
        String identifier2 = bVar.f255372a;
        Integer num5 = bVar.f255373b;
        AnalyticsContext analyticsContext2 = bVar.d;
        String str7 = bVar.e;
        AnalyticsProduct analyticsProduct2 = bVar.f;
        String str8 = bVar.f255375g;
        Integer num6 = bVar.f255376h;
        String str9 = bVar.i;
        String str10 = bVar.f255377j;
        String str11 = bVar.k;
        Integer num7 = bVar.f255378l;
        String str12 = bVar.f255379m;
        int i = bVar.f255380n;
        int i2 = bVar.o;
        int i3 = bVar.f255381p;
        int i5 = bVar.f255382q;
        int i6 = bVar.f255383r;
        long j2 = bVar.f255384s;
        long j3 = bVar.f255385t;
        Long l2 = bVar.u;
        Intrinsics.checkNotNullParameter(identifier2, "identifier");
        AnalyticsContext analyticsContextA2 = aVar.a(new rn.b(identifier2, num5, zA2, analyticsContext2, str7, analyticsProduct2, str8, num6, str9, str10, str11, num7, str12, i, i2, i3, i5, i6, j2, j3, l2));
        if (analyticsContextA2 == null || (product = bVar.f) == null) {
            return;
        }
        String str13 = bVar.e;
        w0 w0Var2 = analyticsContextA2.f50296a;
        String str14 = bVar.f255375g;
        Integer num8 = bVar.f255376h;
        Integer num9 = bVar.f255373b;
        Intrinsics.checkNotNullParameter(product, "product");
        e0.C(cVar2.c(), null, null, new no.b(str13, product, w0Var2, str14, num8, num9, dVar, null), 3);
    }

    public final void d(zn.d viewableRecordItem) {
        Intrinsics.checkNotNullParameter(viewableRecordItem, "viewableRecordItem");
        ReentrantReadWriteLock reentrantReadWriteLock = this.e;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            ((f) this.f307297c).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object obj2 = this.f.get(viewableRecordItem.getF100566c());
            rn.b bVar = obj2 instanceof rn.b ? (rn.b) obj2 : null;
            if (bVar != null) {
                bVar.u = Long.valueOf(jCurrentTimeMillis);
                Unit unit = Unit.f186387a;
            }
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public final void f(zn.f viewableRecordSnapshot) {
        rn.b bVar;
        Intrinsics.checkNotNullParameter(viewableRecordSnapshot, "viewableRecordSnapshot");
        ReentrantReadWriteLock reentrantReadWriteLock = this.e;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            Iterator it8 = viewableRecordSnapshot.f323642a.entrySet().iterator();
            while (true) {
                boolean zHasNext = it8.hasNext();
                HashMap map = this.f;
                if (!zHasNext) {
                    Set setKeySet = viewableRecordSnapshot.f323642a.keySet();
                    Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it9 = setKeySet.iterator();
                    while (it9.hasNext()) {
                        linkedHashSet.add(((zn.d) it9.next()).getF100566c());
                    }
                    Iterator it10 = map.entrySet().iterator();
                    while (it10.hasNext()) {
                        Map.Entry entry = (Map.Entry) it10.next();
                        String str = (String) entry.getKey();
                        rn.c cVar = (rn.c) entry.getValue();
                        if (!linkedHashSet.contains(str)) {
                            b(cVar);
                            it10.remove();
                        }
                    }
                    Unit unit = Unit.f186387a;
                    while (i < readHoldCount) {
                        lock.lock();
                        i++;
                    }
                    writeLock.unlock();
                    return;
                }
                Map.Entry entry2 = (Map.Entry) it8.next();
                zn.d dVar = (zn.d) entry2.getKey();
                zn.e eVar = (zn.e) entry2.getValue();
                ViewableRecordItem$Type e = dVar.getE();
                if (!(e instanceof ViewableRecordItem$Type.ViewableRecord)) {
                    if (!(e instanceof ViewableRecordItem$Type.Impression)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (map.containsKey(dVar.getF100566c())) {
                        Object obj2 = map.get(dVar.getF100566c());
                        bVar = obj2 instanceof rn.b ? (rn.b) obj2 : null;
                        if (bVar != null) {
                            e(bVar, eVar.f323639a);
                        }
                    } else if (eVar.f323639a > BitmapDescriptorFactory.HUE_RED) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        rn.c cVarC = c(dVar, eVar);
                        bVar = cVarC instanceof rn.b ? (rn.b) cVarC : null;
                        if (bVar != null) {
                            bVar.f255384s = jCurrentTimeMillis;
                            e(bVar, eVar.f323639a);
                        }
                        map.put(cVarC.a(), cVarC);
                    }
                } else if (!map.containsKey(dVar.getF100566c()) && eVar.f323639a > BitmapDescriptorFactory.HUE_RED) {
                    rn.c cVarC2 = c(dVar, eVar);
                    map.put(cVarC2.a(), cVarC2);
                }
            }
        } catch (Throwable th10) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th10;
        }
    }
}
