package o29;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.lifestyle.core.impl.network.LifestyleHomeService;
import efm.d0;
import java.lang.reflect.Type;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import nvg.b0;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import rfm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements n {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Type f221583j;
    public static final MessageDigest k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LifestyleHomeService f221584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f221585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f221586c;
    public final w39.b d;
    public final ReentrantReadWriteLock e;
    public final w4l.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f221587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f221588h;
    public final w4l.f i;

    static {
        Type type = new TypeToken<List<? extends String>>() { // from class: com.revolut.feature.lifestyle.core.impl.data.repository.LifestyleTabRepositoryImpl$Companion$INDEX_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f221583j = type;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(...)");
        k = messageDigest;
    }

    public u(LifestyleHomeService homeService, ne0.d memoryCache, ue0.c storage, w39.b locationInteractor) {
        Intrinsics.checkNotNullParameter(homeService, "homeService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        this.f221584a = homeService;
        this.f221585b = memoryCache;
        this.f221586c = storage;
        this.d = locationInteractor;
        this.e = new ReentrantReadWriteLock();
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: o29.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f221580b;

            {
                this.f221580b = this;
            }

            /* JADX WARN: Finally extract failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                int i3 = 24;
                int i5 = 0;
                u uVar = this.f221580b;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String enabledFeatures = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        rfm.m mVar = new rfm.m(((z39.b) uVar.d).f319221b.c(), new o28.g(new o17.x(25), 12), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new o17.x(26)), new o28.g(new b0(uVar, enabledFeatures, i3), 6), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String enabledFeatures2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures2, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService = uVar.f221584a;
                        LifestyleHomeService.Companion companion = LifestyleHomeService.INSTANCE;
                        return lifestyleHomeService.getHomeHeader(enabledFeatures2, "X-Enabled-Features,Accept-Language");
                    case 2:
                        String enabledFeatures3 = (String) obj2;
                        f19.g header = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures3, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(header, "header");
                        ne0.d dVar = uVar.f221585b;
                        u.Companion.getClass();
                        dVar.f(t.a("CACHE_KEY_HOME_HEADER_MEMORY_KEY", enabledFeatures3), header);
                        return Unit.f186387a;
                    case 3:
                        String enabledFeatures4 = (String) obj2;
                        f19.g header2 = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures4, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(header2, "header");
                        ue0.c cVar = uVar.f221586c;
                        u.Companion.getClass();
                        cVar.G(header2, t.a("CACHE_KEY_HOME_HEADER_STORAGE_KEY", enabledFeatures4), wim.z.d(o0.b(f19.g.class)));
                        uVar.a(enabledFeatures4);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String enabledFeatures5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures5, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService2 = uVar.f221584a;
                        LifestyleHomeService.Companion companion2 = LifestyleHomeService.INSTANCE;
                        return lifestyleHomeService2.getHomeSuggestedForYou(enabledFeatures5, "X-Enabled-Features,Accept-Language");
                    case 5:
                        String enabledFeatures6 = (String) obj2;
                        f19.g s4u = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures6, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(s4u, "s4u");
                        ne0.d dVar2 = uVar.f221585b;
                        u.Companion.getClass();
                        dVar2.f(t.a("CACHE_KEY_HOME_S4U_MEMORY_KEY", enabledFeatures6), s4u);
                        return Unit.f186387a;
                    case 6:
                        String enabledFeatures7 = (String) obj2;
                        f19.g s4u2 = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures7, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(s4u2, "s4u");
                        ue0.c cVar2 = uVar.f221586c;
                        u.Companion.getClass();
                        cVar2.G(s4u2, t.a("CACHE_KEY_HOME_S4U_STORAGE_KEY", enabledFeatures7), wim.z.d(o0.b(f19.g.class)));
                        uVar.a(enabledFeatures7);
                        return Unit.f186387a;
                    case 7:
                        String enabledFeatures8 = (String) obj2;
                        g19.c cVar3 = (g19.c) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures8, "enabledFeatures");
                        ne0.d dVar3 = uVar.f221585b;
                        u.Companion.getClass();
                        String strA = t.a("CACHE_KEY_HOME_FEED_MEMORY_KEY", enabledFeatures8);
                        Intrinsics.h(cVar3);
                        dVar3.f(strA, cVar3);
                        return Unit.f186387a;
                    case 8:
                        String enabledFeatures9 = (String) obj2;
                        g19.c cVar4 = (g19.c) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures9, "enabledFeatures");
                        ue0.c cVar5 = uVar.f221586c;
                        u.Companion.getClass();
                        String strA2 = t.a("CACHE_KEY_HOME_FEED_STORAGE_KEY", enabledFeatures9);
                        Intrinsics.h(cVar4);
                        cVar5.G(cVar4, strA2, wim.z.d(o0.f186429a.h(o0.b(g19.c.class), o0.a(g19.c.class))));
                        uVar.a(enabledFeatures9);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String enabledFeatures10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures10, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService3 = uVar.f221584a;
                        LifestyleHomeService.Companion companion3 = LifestyleHomeService.INSTANCE;
                        d0<h29.k> homeProducts = lifestyleHomeService3.getHomeProducts(enabledFeatures10, "X-Enabled-Features,Accept-Language");
                        o28.g gVar = new o28.g(new o17.x(24), 11);
                        homeProducts.getClass();
                        ufm.i iVar2 = new ufm.i(homeProducts, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 10:
                        String enabledFeatures11 = (String) obj2;
                        h19.g products = (h19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures11, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(products, "products");
                        ReentrantReadWriteLock reentrantReadWriteLock = uVar.e;
                        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                        for (int i6 = 0; i6 < readHoldCount; i6++) {
                            lock.unlock();
                        }
                        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                        writeLock.lock();
                        try {
                            ne0.d dVar4 = uVar.f221585b;
                            u.Companion.getClass();
                            dVar4.f(t.a("CACHE_KEY_HOME_PRODUCTS_MEMORY_KEY", enabledFeatures11), products);
                            Unit unit = Unit.f186387a;
                            while (i5 < readHoldCount) {
                                lock.lock();
                                i5++;
                            }
                            writeLock.unlock();
                            return Unit.f186387a;
                        } catch (Throwable th10) {
                            while (i5 < readHoldCount) {
                                lock.lock();
                                i5++;
                            }
                            writeLock.unlock();
                            throw th10;
                        }
                    default:
                        String enabledFeatures12 = (String) obj2;
                        h19.g products2 = (h19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures12, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(products2, "products");
                        ue0.c cVar6 = uVar.f221586c;
                        u.Companion.getClass();
                        cVar6.G(products2, t.a("CACHE_KEY_HOME_PRODUCTS_STORAGE_KEY", enabledFeatures12), wim.z.d(o0.b(h19.g.class)));
                        uVar.a(enabledFeatures12);
                        return Unit.f186387a;
                }
            }
        };
        final int i2 = 4;
        Function1 function1 = new Function1(this) { // from class: o29.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f221582b;

            {
                this.f221582b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String enabledFeatures = (String) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ne0.d dVar = this.f221582b.f221585b;
                        u.Companion.getClass();
                        return (f19.g) dVar.get(t.a("CACHE_KEY_HOME_HEADER_MEMORY_KEY", enabledFeatures));
                    case 1:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (f19.g) j6.a.k(f19.g.class, cVar, t.a("CACHE_KEY_HOME_HEADER_STORAGE_KEY", enabledFeatures));
                    case 2:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ne0.d dVar2 = this.f221582b.f221585b;
                        u.Companion.getClass();
                        return (f19.g) dVar2.get(t.a("CACHE_KEY_HOME_S4U_MEMORY_KEY", enabledFeatures));
                    case 3:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar2 = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (f19.g) j6.a.k(f19.g.class, cVar2, t.a("CACHE_KEY_HOME_S4U_STORAGE_KEY", enabledFeatures));
                    case 4:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ne0.d dVar3 = this.f221582b.f221585b;
                        u.Companion.getClass();
                        return (g19.c) dVar3.get(t.a("CACHE_KEY_HOME_FEED_MEMORY_KEY", enabledFeatures));
                    case 5:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar3 = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (g19.c) j6.a.k(g19.c.class, cVar3, t.a("CACHE_KEY_HOME_FEED_STORAGE_KEY", enabledFeatures));
                    case 6:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        u uVar = this.f221582b;
                        ReentrantReadWriteLock.ReadLock lock = uVar.e.readLock();
                        lock.lock();
                        try {
                            ne0.d dVar4 = uVar.f221585b;
                            u.Companion.getClass();
                            return (h19.g) dVar4.get(t.a("CACHE_KEY_HOME_PRODUCTS_MEMORY_KEY", enabledFeatures));
                        } finally {
                            lock.unlock();
                        }
                    default:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar4 = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (h19.g) j6.a.k(h19.g.class, cVar4, t.a("CACHE_KEY_HOME_PRODUCTS_STORAGE_KEY", enabledFeatures));
                }
            }
        };
        final int i3 = 7;
        Function2 function22 = new Function2(this) { // from class: o29.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f221580b;

            {
                this.f221580b = this;
            }

            /* JADX WARN: Finally extract failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i3;
                int i32 = 24;
                int i5 = 0;
                u uVar = this.f221580b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String enabledFeatures = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        rfm.m mVar = new rfm.m(((z39.b) uVar.d).f319221b.c(), new o28.g(new o17.x(25), 12), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new o17.x(26)), new o28.g(new b0(uVar, enabledFeatures, i32), 6), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String enabledFeatures2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures2, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService = uVar.f221584a;
                        LifestyleHomeService.Companion companion = LifestyleHomeService.INSTANCE;
                        return lifestyleHomeService.getHomeHeader(enabledFeatures2, "X-Enabled-Features,Accept-Language");
                    case 2:
                        String enabledFeatures3 = (String) obj2;
                        f19.g header = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures3, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(header, "header");
                        ne0.d dVar = uVar.f221585b;
                        u.Companion.getClass();
                        dVar.f(t.a("CACHE_KEY_HOME_HEADER_MEMORY_KEY", enabledFeatures3), header);
                        return Unit.f186387a;
                    case 3:
                        String enabledFeatures4 = (String) obj2;
                        f19.g header2 = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures4, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(header2, "header");
                        ue0.c cVar = uVar.f221586c;
                        u.Companion.getClass();
                        cVar.G(header2, t.a("CACHE_KEY_HOME_HEADER_STORAGE_KEY", enabledFeatures4), wim.z.d(o0.b(f19.g.class)));
                        uVar.a(enabledFeatures4);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String enabledFeatures5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures5, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService2 = uVar.f221584a;
                        LifestyleHomeService.Companion companion2 = LifestyleHomeService.INSTANCE;
                        return lifestyleHomeService2.getHomeSuggestedForYou(enabledFeatures5, "X-Enabled-Features,Accept-Language");
                    case 5:
                        String enabledFeatures6 = (String) obj2;
                        f19.g s4u = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures6, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(s4u, "s4u");
                        ne0.d dVar2 = uVar.f221585b;
                        u.Companion.getClass();
                        dVar2.f(t.a("CACHE_KEY_HOME_S4U_MEMORY_KEY", enabledFeatures6), s4u);
                        return Unit.f186387a;
                    case 6:
                        String enabledFeatures7 = (String) obj2;
                        f19.g s4u2 = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures7, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(s4u2, "s4u");
                        ue0.c cVar2 = uVar.f221586c;
                        u.Companion.getClass();
                        cVar2.G(s4u2, t.a("CACHE_KEY_HOME_S4U_STORAGE_KEY", enabledFeatures7), wim.z.d(o0.b(f19.g.class)));
                        uVar.a(enabledFeatures7);
                        return Unit.f186387a;
                    case 7:
                        String enabledFeatures8 = (String) obj2;
                        g19.c cVar3 = (g19.c) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures8, "enabledFeatures");
                        ne0.d dVar3 = uVar.f221585b;
                        u.Companion.getClass();
                        String strA = t.a("CACHE_KEY_HOME_FEED_MEMORY_KEY", enabledFeatures8);
                        Intrinsics.h(cVar3);
                        dVar3.f(strA, cVar3);
                        return Unit.f186387a;
                    case 8:
                        String enabledFeatures9 = (String) obj2;
                        g19.c cVar4 = (g19.c) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures9, "enabledFeatures");
                        ue0.c cVar5 = uVar.f221586c;
                        u.Companion.getClass();
                        String strA2 = t.a("CACHE_KEY_HOME_FEED_STORAGE_KEY", enabledFeatures9);
                        Intrinsics.h(cVar4);
                        cVar5.G(cVar4, strA2, wim.z.d(o0.f186429a.h(o0.b(g19.c.class), o0.a(g19.c.class))));
                        uVar.a(enabledFeatures9);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String enabledFeatures10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures10, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService3 = uVar.f221584a;
                        LifestyleHomeService.Companion companion3 = LifestyleHomeService.INSTANCE;
                        d0<h29.k> homeProducts = lifestyleHomeService3.getHomeProducts(enabledFeatures10, "X-Enabled-Features,Accept-Language");
                        o28.g gVar = new o28.g(new o17.x(24), 11);
                        homeProducts.getClass();
                        ufm.i iVar2 = new ufm.i(homeProducts, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 10:
                        String enabledFeatures11 = (String) obj2;
                        h19.g products = (h19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures11, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(products, "products");
                        ReentrantReadWriteLock reentrantReadWriteLock = uVar.e;
                        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                        for (int i6 = 0; i6 < readHoldCount; i6++) {
                            lock.unlock();
                        }
                        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                        writeLock.lock();
                        try {
                            ne0.d dVar4 = uVar.f221585b;
                            u.Companion.getClass();
                            dVar4.f(t.a("CACHE_KEY_HOME_PRODUCTS_MEMORY_KEY", enabledFeatures11), products);
                            Unit unit = Unit.f186387a;
                            while (i5 < readHoldCount) {
                                lock.lock();
                                i5++;
                            }
                            writeLock.unlock();
                            return Unit.f186387a;
                        } catch (Throwable th10) {
                            while (i5 < readHoldCount) {
                                lock.lock();
                                i5++;
                            }
                            writeLock.unlock();
                            throw th10;
                        }
                    default:
                        String enabledFeatures12 = (String) obj2;
                        h19.g products2 = (h19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures12, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(products2, "products");
                        ue0.c cVar6 = uVar.f221586c;
                        u.Companion.getClass();
                        cVar6.G(products2, t.a("CACHE_KEY_HOME_PRODUCTS_STORAGE_KEY", enabledFeatures12), wim.z.d(o0.b(h19.g.class)));
                        uVar.a(enabledFeatures12);
                        return Unit.f186387a;
                }
            }
        };
        final int i5 = 5;
        Function1 function12 = new Function1(this) { // from class: o29.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f221582b;

            {
                this.f221582b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String enabledFeatures = (String) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ne0.d dVar = this.f221582b.f221585b;
                        u.Companion.getClass();
                        return (f19.g) dVar.get(t.a("CACHE_KEY_HOME_HEADER_MEMORY_KEY", enabledFeatures));
                    case 1:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (f19.g) j6.a.k(f19.g.class, cVar, t.a("CACHE_KEY_HOME_HEADER_STORAGE_KEY", enabledFeatures));
                    case 2:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ne0.d dVar2 = this.f221582b.f221585b;
                        u.Companion.getClass();
                        return (f19.g) dVar2.get(t.a("CACHE_KEY_HOME_S4U_MEMORY_KEY", enabledFeatures));
                    case 3:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar2 = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (f19.g) j6.a.k(f19.g.class, cVar2, t.a("CACHE_KEY_HOME_S4U_STORAGE_KEY", enabledFeatures));
                    case 4:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ne0.d dVar3 = this.f221582b.f221585b;
                        u.Companion.getClass();
                        return (g19.c) dVar3.get(t.a("CACHE_KEY_HOME_FEED_MEMORY_KEY", enabledFeatures));
                    case 5:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar3 = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (g19.c) j6.a.k(g19.c.class, cVar3, t.a("CACHE_KEY_HOME_FEED_STORAGE_KEY", enabledFeatures));
                    case 6:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        u uVar = this.f221582b;
                        ReentrantReadWriteLock.ReadLock lock = uVar.e.readLock();
                        lock.lock();
                        try {
                            ne0.d dVar4 = uVar.f221585b;
                            u.Companion.getClass();
                            return (h19.g) dVar4.get(t.a("CACHE_KEY_HOME_PRODUCTS_MEMORY_KEY", enabledFeatures));
                        } finally {
                            lock.unlock();
                        }
                    default:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar4 = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (h19.g) j6.a.k(h19.g.class, cVar4, t.a("CACHE_KEY_HOME_PRODUCTS_STORAGE_KEY", enabledFeatures));
                }
            }
        };
        final int i6 = 8;
        this.f = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: o29.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f221580b;

            {
                this.f221580b = this;
            }

            /* JADX WARN: Finally extract failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i6;
                int i32 = 24;
                int i59 = 0;
                u uVar = this.f221580b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String enabledFeatures = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        rfm.m mVar = new rfm.m(((z39.b) uVar.d).f319221b.c(), new o28.g(new o17.x(25), 12), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new o17.x(26)), new o28.g(new b0(uVar, enabledFeatures, i32), 6), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String enabledFeatures2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures2, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService = uVar.f221584a;
                        LifestyleHomeService.Companion companion = LifestyleHomeService.INSTANCE;
                        return lifestyleHomeService.getHomeHeader(enabledFeatures2, "X-Enabled-Features,Accept-Language");
                    case 2:
                        String enabledFeatures3 = (String) obj2;
                        f19.g header = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures3, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(header, "header");
                        ne0.d dVar = uVar.f221585b;
                        u.Companion.getClass();
                        dVar.f(t.a("CACHE_KEY_HOME_HEADER_MEMORY_KEY", enabledFeatures3), header);
                        return Unit.f186387a;
                    case 3:
                        String enabledFeatures4 = (String) obj2;
                        f19.g header2 = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures4, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(header2, "header");
                        ue0.c cVar = uVar.f221586c;
                        u.Companion.getClass();
                        cVar.G(header2, t.a("CACHE_KEY_HOME_HEADER_STORAGE_KEY", enabledFeatures4), wim.z.d(o0.b(f19.g.class)));
                        uVar.a(enabledFeatures4);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String enabledFeatures5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures5, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService2 = uVar.f221584a;
                        LifestyleHomeService.Companion companion2 = LifestyleHomeService.INSTANCE;
                        return lifestyleHomeService2.getHomeSuggestedForYou(enabledFeatures5, "X-Enabled-Features,Accept-Language");
                    case 5:
                        String enabledFeatures6 = (String) obj2;
                        f19.g s4u = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures6, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(s4u, "s4u");
                        ne0.d dVar2 = uVar.f221585b;
                        u.Companion.getClass();
                        dVar2.f(t.a("CACHE_KEY_HOME_S4U_MEMORY_KEY", enabledFeatures6), s4u);
                        return Unit.f186387a;
                    case 6:
                        String enabledFeatures7 = (String) obj2;
                        f19.g s4u2 = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures7, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(s4u2, "s4u");
                        ue0.c cVar2 = uVar.f221586c;
                        u.Companion.getClass();
                        cVar2.G(s4u2, t.a("CACHE_KEY_HOME_S4U_STORAGE_KEY", enabledFeatures7), wim.z.d(o0.b(f19.g.class)));
                        uVar.a(enabledFeatures7);
                        return Unit.f186387a;
                    case 7:
                        String enabledFeatures8 = (String) obj2;
                        g19.c cVar3 = (g19.c) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures8, "enabledFeatures");
                        ne0.d dVar3 = uVar.f221585b;
                        u.Companion.getClass();
                        String strA = t.a("CACHE_KEY_HOME_FEED_MEMORY_KEY", enabledFeatures8);
                        Intrinsics.h(cVar3);
                        dVar3.f(strA, cVar3);
                        return Unit.f186387a;
                    case 8:
                        String enabledFeatures9 = (String) obj2;
                        g19.c cVar4 = (g19.c) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures9, "enabledFeatures");
                        ue0.c cVar5 = uVar.f221586c;
                        u.Companion.getClass();
                        String strA2 = t.a("CACHE_KEY_HOME_FEED_STORAGE_KEY", enabledFeatures9);
                        Intrinsics.h(cVar4);
                        cVar5.G(cVar4, strA2, wim.z.d(o0.f186429a.h(o0.b(g19.c.class), o0.a(g19.c.class))));
                        uVar.a(enabledFeatures9);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String enabledFeatures10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures10, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService3 = uVar.f221584a;
                        LifestyleHomeService.Companion companion3 = LifestyleHomeService.INSTANCE;
                        d0<h29.k> homeProducts = lifestyleHomeService3.getHomeProducts(enabledFeatures10, "X-Enabled-Features,Accept-Language");
                        o28.g gVar = new o28.g(new o17.x(24), 11);
                        homeProducts.getClass();
                        ufm.i iVar2 = new ufm.i(homeProducts, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 10:
                        String enabledFeatures11 = (String) obj2;
                        h19.g products = (h19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures11, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(products, "products");
                        ReentrantReadWriteLock reentrantReadWriteLock = uVar.e;
                        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                        for (int i66 = 0; i66 < readHoldCount; i66++) {
                            lock.unlock();
                        }
                        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                        writeLock.lock();
                        try {
                            ne0.d dVar4 = uVar.f221585b;
                            u.Companion.getClass();
                            dVar4.f(t.a("CACHE_KEY_HOME_PRODUCTS_MEMORY_KEY", enabledFeatures11), products);
                            Unit unit = Unit.f186387a;
                            while (i59 < readHoldCount) {
                                lock.lock();
                                i59++;
                            }
                            writeLock.unlock();
                            return Unit.f186387a;
                        } catch (Throwable th10) {
                            while (i59 < readHoldCount) {
                                lock.lock();
                                i59++;
                            }
                            writeLock.unlock();
                            throw th10;
                        }
                    default:
                        String enabledFeatures12 = (String) obj2;
                        h19.g products2 = (h19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures12, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(products2, "products");
                        ue0.c cVar6 = uVar.f221586c;
                        u.Companion.getClass();
                        cVar6.G(products2, t.a("CACHE_KEY_HOME_PRODUCTS_STORAGE_KEY", enabledFeatures12), wim.z.d(o0.b(h19.g.class)));
                        uVar.a(enabledFeatures12);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i21 = 9;
        Function2 function23 = new Function2(this) { // from class: o29.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f221580b;

            {
                this.f221580b = this;
            }

            /* JADX WARN: Finally extract failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i21;
                int i32 = 24;
                int i59 = 0;
                u uVar = this.f221580b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String enabledFeatures = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        rfm.m mVar = new rfm.m(((z39.b) uVar.d).f319221b.c(), new o28.g(new o17.x(25), 12), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new o17.x(26)), new o28.g(new b0(uVar, enabledFeatures, i32), 6), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String enabledFeatures2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures2, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService = uVar.f221584a;
                        LifestyleHomeService.Companion companion = LifestyleHomeService.INSTANCE;
                        return lifestyleHomeService.getHomeHeader(enabledFeatures2, "X-Enabled-Features,Accept-Language");
                    case 2:
                        String enabledFeatures3 = (String) obj2;
                        f19.g header = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures3, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(header, "header");
                        ne0.d dVar = uVar.f221585b;
                        u.Companion.getClass();
                        dVar.f(t.a("CACHE_KEY_HOME_HEADER_MEMORY_KEY", enabledFeatures3), header);
                        return Unit.f186387a;
                    case 3:
                        String enabledFeatures4 = (String) obj2;
                        f19.g header2 = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures4, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(header2, "header");
                        ue0.c cVar = uVar.f221586c;
                        u.Companion.getClass();
                        cVar.G(header2, t.a("CACHE_KEY_HOME_HEADER_STORAGE_KEY", enabledFeatures4), wim.z.d(o0.b(f19.g.class)));
                        uVar.a(enabledFeatures4);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String enabledFeatures5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures5, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService2 = uVar.f221584a;
                        LifestyleHomeService.Companion companion2 = LifestyleHomeService.INSTANCE;
                        return lifestyleHomeService2.getHomeSuggestedForYou(enabledFeatures5, "X-Enabled-Features,Accept-Language");
                    case 5:
                        String enabledFeatures6 = (String) obj2;
                        f19.g s4u = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures6, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(s4u, "s4u");
                        ne0.d dVar2 = uVar.f221585b;
                        u.Companion.getClass();
                        dVar2.f(t.a("CACHE_KEY_HOME_S4U_MEMORY_KEY", enabledFeatures6), s4u);
                        return Unit.f186387a;
                    case 6:
                        String enabledFeatures7 = (String) obj2;
                        f19.g s4u2 = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures7, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(s4u2, "s4u");
                        ue0.c cVar2 = uVar.f221586c;
                        u.Companion.getClass();
                        cVar2.G(s4u2, t.a("CACHE_KEY_HOME_S4U_STORAGE_KEY", enabledFeatures7), wim.z.d(o0.b(f19.g.class)));
                        uVar.a(enabledFeatures7);
                        return Unit.f186387a;
                    case 7:
                        String enabledFeatures8 = (String) obj2;
                        g19.c cVar3 = (g19.c) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures8, "enabledFeatures");
                        ne0.d dVar3 = uVar.f221585b;
                        u.Companion.getClass();
                        String strA = t.a("CACHE_KEY_HOME_FEED_MEMORY_KEY", enabledFeatures8);
                        Intrinsics.h(cVar3);
                        dVar3.f(strA, cVar3);
                        return Unit.f186387a;
                    case 8:
                        String enabledFeatures9 = (String) obj2;
                        g19.c cVar4 = (g19.c) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures9, "enabledFeatures");
                        ue0.c cVar5 = uVar.f221586c;
                        u.Companion.getClass();
                        String strA2 = t.a("CACHE_KEY_HOME_FEED_STORAGE_KEY", enabledFeatures9);
                        Intrinsics.h(cVar4);
                        cVar5.G(cVar4, strA2, wim.z.d(o0.f186429a.h(o0.b(g19.c.class), o0.a(g19.c.class))));
                        uVar.a(enabledFeatures9);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String enabledFeatures10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures10, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService3 = uVar.f221584a;
                        LifestyleHomeService.Companion companion3 = LifestyleHomeService.INSTANCE;
                        d0<h29.k> homeProducts = lifestyleHomeService3.getHomeProducts(enabledFeatures10, "X-Enabled-Features,Accept-Language");
                        o28.g gVar = new o28.g(new o17.x(24), 11);
                        homeProducts.getClass();
                        ufm.i iVar2 = new ufm.i(homeProducts, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 10:
                        String enabledFeatures11 = (String) obj2;
                        h19.g products = (h19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures11, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(products, "products");
                        ReentrantReadWriteLock reentrantReadWriteLock = uVar.e;
                        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                        for (int i66 = 0; i66 < readHoldCount; i66++) {
                            lock.unlock();
                        }
                        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                        writeLock.lock();
                        try {
                            ne0.d dVar4 = uVar.f221585b;
                            u.Companion.getClass();
                            dVar4.f(t.a("CACHE_KEY_HOME_PRODUCTS_MEMORY_KEY", enabledFeatures11), products);
                            Unit unit = Unit.f186387a;
                            while (i59 < readHoldCount) {
                                lock.lock();
                                i59++;
                            }
                            writeLock.unlock();
                            return Unit.f186387a;
                        } catch (Throwable th10) {
                            while (i59 < readHoldCount) {
                                lock.lock();
                                i59++;
                            }
                            writeLock.unlock();
                            throw th10;
                        }
                    default:
                        String enabledFeatures12 = (String) obj2;
                        h19.g products2 = (h19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures12, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(products2, "products");
                        ue0.c cVar6 = uVar.f221586c;
                        u.Companion.getClass();
                        cVar6.G(products2, t.a("CACHE_KEY_HOME_PRODUCTS_STORAGE_KEY", enabledFeatures12), wim.z.d(o0.b(h19.g.class)));
                        uVar.a(enabledFeatures12);
                        return Unit.f186387a;
                }
            }
        };
        final int i22 = 6;
        Function1 function13 = new Function1(this) { // from class: o29.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f221582b;

            {
                this.f221582b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String enabledFeatures = (String) obj2;
                switch (i22) {
                    case 0:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ne0.d dVar = this.f221582b.f221585b;
                        u.Companion.getClass();
                        return (f19.g) dVar.get(t.a("CACHE_KEY_HOME_HEADER_MEMORY_KEY", enabledFeatures));
                    case 1:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (f19.g) j6.a.k(f19.g.class, cVar, t.a("CACHE_KEY_HOME_HEADER_STORAGE_KEY", enabledFeatures));
                    case 2:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ne0.d dVar2 = this.f221582b.f221585b;
                        u.Companion.getClass();
                        return (f19.g) dVar2.get(t.a("CACHE_KEY_HOME_S4U_MEMORY_KEY", enabledFeatures));
                    case 3:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar2 = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (f19.g) j6.a.k(f19.g.class, cVar2, t.a("CACHE_KEY_HOME_S4U_STORAGE_KEY", enabledFeatures));
                    case 4:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ne0.d dVar3 = this.f221582b.f221585b;
                        u.Companion.getClass();
                        return (g19.c) dVar3.get(t.a("CACHE_KEY_HOME_FEED_MEMORY_KEY", enabledFeatures));
                    case 5:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar3 = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (g19.c) j6.a.k(g19.c.class, cVar3, t.a("CACHE_KEY_HOME_FEED_STORAGE_KEY", enabledFeatures));
                    case 6:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        u uVar = this.f221582b;
                        ReentrantReadWriteLock.ReadLock lock = uVar.e.readLock();
                        lock.lock();
                        try {
                            ne0.d dVar4 = uVar.f221585b;
                            u.Companion.getClass();
                            return (h19.g) dVar4.get(t.a("CACHE_KEY_HOME_PRODUCTS_MEMORY_KEY", enabledFeatures));
                        } finally {
                            lock.unlock();
                        }
                    default:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar4 = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (h19.g) j6.a.k(h19.g.class, cVar4, t.a("CACHE_KEY_HOME_PRODUCTS_STORAGE_KEY", enabledFeatures));
                }
            }
        };
        final int i32 = 10;
        Function2 function24 = new Function2(this) { // from class: o29.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f221580b;

            {
                this.f221580b = this;
            }

            /* JADX WARN: Finally extract failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i32;
                int i322 = 24;
                int i59 = 0;
                u uVar = this.f221580b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String enabledFeatures = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        rfm.m mVar = new rfm.m(((z39.b) uVar.d).f319221b.c(), new o28.g(new o17.x(25), 12), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new o17.x(26)), new o28.g(new b0(uVar, enabledFeatures, i322), 6), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String enabledFeatures2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures2, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService = uVar.f221584a;
                        LifestyleHomeService.Companion companion = LifestyleHomeService.INSTANCE;
                        return lifestyleHomeService.getHomeHeader(enabledFeatures2, "X-Enabled-Features,Accept-Language");
                    case 2:
                        String enabledFeatures3 = (String) obj2;
                        f19.g header = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures3, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(header, "header");
                        ne0.d dVar = uVar.f221585b;
                        u.Companion.getClass();
                        dVar.f(t.a("CACHE_KEY_HOME_HEADER_MEMORY_KEY", enabledFeatures3), header);
                        return Unit.f186387a;
                    case 3:
                        String enabledFeatures4 = (String) obj2;
                        f19.g header2 = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures4, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(header2, "header");
                        ue0.c cVar = uVar.f221586c;
                        u.Companion.getClass();
                        cVar.G(header2, t.a("CACHE_KEY_HOME_HEADER_STORAGE_KEY", enabledFeatures4), wim.z.d(o0.b(f19.g.class)));
                        uVar.a(enabledFeatures4);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String enabledFeatures5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures5, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService2 = uVar.f221584a;
                        LifestyleHomeService.Companion companion2 = LifestyleHomeService.INSTANCE;
                        return lifestyleHomeService2.getHomeSuggestedForYou(enabledFeatures5, "X-Enabled-Features,Accept-Language");
                    case 5:
                        String enabledFeatures6 = (String) obj2;
                        f19.g s4u = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures6, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(s4u, "s4u");
                        ne0.d dVar2 = uVar.f221585b;
                        u.Companion.getClass();
                        dVar2.f(t.a("CACHE_KEY_HOME_S4U_MEMORY_KEY", enabledFeatures6), s4u);
                        return Unit.f186387a;
                    case 6:
                        String enabledFeatures7 = (String) obj2;
                        f19.g s4u2 = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures7, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(s4u2, "s4u");
                        ue0.c cVar2 = uVar.f221586c;
                        u.Companion.getClass();
                        cVar2.G(s4u2, t.a("CACHE_KEY_HOME_S4U_STORAGE_KEY", enabledFeatures7), wim.z.d(o0.b(f19.g.class)));
                        uVar.a(enabledFeatures7);
                        return Unit.f186387a;
                    case 7:
                        String enabledFeatures8 = (String) obj2;
                        g19.c cVar3 = (g19.c) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures8, "enabledFeatures");
                        ne0.d dVar3 = uVar.f221585b;
                        u.Companion.getClass();
                        String strA = t.a("CACHE_KEY_HOME_FEED_MEMORY_KEY", enabledFeatures8);
                        Intrinsics.h(cVar3);
                        dVar3.f(strA, cVar3);
                        return Unit.f186387a;
                    case 8:
                        String enabledFeatures9 = (String) obj2;
                        g19.c cVar4 = (g19.c) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures9, "enabledFeatures");
                        ue0.c cVar5 = uVar.f221586c;
                        u.Companion.getClass();
                        String strA2 = t.a("CACHE_KEY_HOME_FEED_STORAGE_KEY", enabledFeatures9);
                        Intrinsics.h(cVar4);
                        cVar5.G(cVar4, strA2, wim.z.d(o0.f186429a.h(o0.b(g19.c.class), o0.a(g19.c.class))));
                        uVar.a(enabledFeatures9);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String enabledFeatures10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures10, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService3 = uVar.f221584a;
                        LifestyleHomeService.Companion companion3 = LifestyleHomeService.INSTANCE;
                        d0<h29.k> homeProducts = lifestyleHomeService3.getHomeProducts(enabledFeatures10, "X-Enabled-Features,Accept-Language");
                        o28.g gVar = new o28.g(new o17.x(24), 11);
                        homeProducts.getClass();
                        ufm.i iVar2 = new ufm.i(homeProducts, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 10:
                        String enabledFeatures11 = (String) obj2;
                        h19.g products = (h19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures11, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(products, "products");
                        ReentrantReadWriteLock reentrantReadWriteLock = uVar.e;
                        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                        for (int i66 = 0; i66 < readHoldCount; i66++) {
                            lock.unlock();
                        }
                        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                        writeLock.lock();
                        try {
                            ne0.d dVar4 = uVar.f221585b;
                            u.Companion.getClass();
                            dVar4.f(t.a("CACHE_KEY_HOME_PRODUCTS_MEMORY_KEY", enabledFeatures11), products);
                            Unit unit = Unit.f186387a;
                            while (i59 < readHoldCount) {
                                lock.lock();
                                i59++;
                            }
                            writeLock.unlock();
                            return Unit.f186387a;
                        } catch (Throwable th10) {
                            while (i59 < readHoldCount) {
                                lock.lock();
                                i59++;
                            }
                            writeLock.unlock();
                            throw th10;
                        }
                    default:
                        String enabledFeatures12 = (String) obj2;
                        h19.g products2 = (h19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures12, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(products2, "products");
                        ue0.c cVar6 = uVar.f221586c;
                        u.Companion.getClass();
                        cVar6.G(products2, t.a("CACHE_KEY_HOME_PRODUCTS_STORAGE_KEY", enabledFeatures12), wim.z.d(o0.b(h19.g.class)));
                        uVar.a(enabledFeatures12);
                        return Unit.f186387a;
                }
            }
        };
        final int i33 = 7;
        Function1 function14 = new Function1(this) { // from class: o29.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f221582b;

            {
                this.f221582b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String enabledFeatures = (String) obj2;
                switch (i33) {
                    case 0:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ne0.d dVar = this.f221582b.f221585b;
                        u.Companion.getClass();
                        return (f19.g) dVar.get(t.a("CACHE_KEY_HOME_HEADER_MEMORY_KEY", enabledFeatures));
                    case 1:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (f19.g) j6.a.k(f19.g.class, cVar, t.a("CACHE_KEY_HOME_HEADER_STORAGE_KEY", enabledFeatures));
                    case 2:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ne0.d dVar2 = this.f221582b.f221585b;
                        u.Companion.getClass();
                        return (f19.g) dVar2.get(t.a("CACHE_KEY_HOME_S4U_MEMORY_KEY", enabledFeatures));
                    case 3:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar2 = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (f19.g) j6.a.k(f19.g.class, cVar2, t.a("CACHE_KEY_HOME_S4U_STORAGE_KEY", enabledFeatures));
                    case 4:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ne0.d dVar3 = this.f221582b.f221585b;
                        u.Companion.getClass();
                        return (g19.c) dVar3.get(t.a("CACHE_KEY_HOME_FEED_MEMORY_KEY", enabledFeatures));
                    case 5:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar3 = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (g19.c) j6.a.k(g19.c.class, cVar3, t.a("CACHE_KEY_HOME_FEED_STORAGE_KEY", enabledFeatures));
                    case 6:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        u uVar = this.f221582b;
                        ReentrantReadWriteLock.ReadLock lock = uVar.e.readLock();
                        lock.lock();
                        try {
                            ne0.d dVar4 = uVar.f221585b;
                            u.Companion.getClass();
                            return (h19.g) dVar4.get(t.a("CACHE_KEY_HOME_PRODUCTS_MEMORY_KEY", enabledFeatures));
                        } finally {
                            lock.unlock();
                        }
                    default:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar4 = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (h19.g) j6.a.k(h19.g.class, cVar4, t.a("CACHE_KEY_HOME_PRODUCTS_STORAGE_KEY", enabledFeatures));
                }
            }
        };
        final int i43 = 11;
        this.f221587g = new w4l.f(function23, function13, function24, function14, new Function2(this) { // from class: o29.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f221580b;

            {
                this.f221580b = this;
            }

            /* JADX WARN: Finally extract failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i43;
                int i322 = 24;
                int i59 = 0;
                u uVar = this.f221580b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String enabledFeatures = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        rfm.m mVar = new rfm.m(((z39.b) uVar.d).f319221b.c(), new o28.g(new o17.x(25), 12), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new o17.x(26)), new o28.g(new b0(uVar, enabledFeatures, i322), 6), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String enabledFeatures2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures2, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService = uVar.f221584a;
                        LifestyleHomeService.Companion companion = LifestyleHomeService.INSTANCE;
                        return lifestyleHomeService.getHomeHeader(enabledFeatures2, "X-Enabled-Features,Accept-Language");
                    case 2:
                        String enabledFeatures3 = (String) obj2;
                        f19.g header = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures3, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(header, "header");
                        ne0.d dVar = uVar.f221585b;
                        u.Companion.getClass();
                        dVar.f(t.a("CACHE_KEY_HOME_HEADER_MEMORY_KEY", enabledFeatures3), header);
                        return Unit.f186387a;
                    case 3:
                        String enabledFeatures4 = (String) obj2;
                        f19.g header2 = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures4, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(header2, "header");
                        ue0.c cVar = uVar.f221586c;
                        u.Companion.getClass();
                        cVar.G(header2, t.a("CACHE_KEY_HOME_HEADER_STORAGE_KEY", enabledFeatures4), wim.z.d(o0.b(f19.g.class)));
                        uVar.a(enabledFeatures4);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String enabledFeatures5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures5, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService2 = uVar.f221584a;
                        LifestyleHomeService.Companion companion2 = LifestyleHomeService.INSTANCE;
                        return lifestyleHomeService2.getHomeSuggestedForYou(enabledFeatures5, "X-Enabled-Features,Accept-Language");
                    case 5:
                        String enabledFeatures6 = (String) obj2;
                        f19.g s4u = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures6, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(s4u, "s4u");
                        ne0.d dVar2 = uVar.f221585b;
                        u.Companion.getClass();
                        dVar2.f(t.a("CACHE_KEY_HOME_S4U_MEMORY_KEY", enabledFeatures6), s4u);
                        return Unit.f186387a;
                    case 6:
                        String enabledFeatures7 = (String) obj2;
                        f19.g s4u2 = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures7, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(s4u2, "s4u");
                        ue0.c cVar2 = uVar.f221586c;
                        u.Companion.getClass();
                        cVar2.G(s4u2, t.a("CACHE_KEY_HOME_S4U_STORAGE_KEY", enabledFeatures7), wim.z.d(o0.b(f19.g.class)));
                        uVar.a(enabledFeatures7);
                        return Unit.f186387a;
                    case 7:
                        String enabledFeatures8 = (String) obj2;
                        g19.c cVar3 = (g19.c) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures8, "enabledFeatures");
                        ne0.d dVar3 = uVar.f221585b;
                        u.Companion.getClass();
                        String strA = t.a("CACHE_KEY_HOME_FEED_MEMORY_KEY", enabledFeatures8);
                        Intrinsics.h(cVar3);
                        dVar3.f(strA, cVar3);
                        return Unit.f186387a;
                    case 8:
                        String enabledFeatures9 = (String) obj2;
                        g19.c cVar4 = (g19.c) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures9, "enabledFeatures");
                        ue0.c cVar5 = uVar.f221586c;
                        u.Companion.getClass();
                        String strA2 = t.a("CACHE_KEY_HOME_FEED_STORAGE_KEY", enabledFeatures9);
                        Intrinsics.h(cVar4);
                        cVar5.G(cVar4, strA2, wim.z.d(o0.f186429a.h(o0.b(g19.c.class), o0.a(g19.c.class))));
                        uVar.a(enabledFeatures9);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String enabledFeatures10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures10, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService3 = uVar.f221584a;
                        LifestyleHomeService.Companion companion3 = LifestyleHomeService.INSTANCE;
                        d0<h29.k> homeProducts = lifestyleHomeService3.getHomeProducts(enabledFeatures10, "X-Enabled-Features,Accept-Language");
                        o28.g gVar = new o28.g(new o17.x(24), 11);
                        homeProducts.getClass();
                        ufm.i iVar2 = new ufm.i(homeProducts, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 10:
                        String enabledFeatures11 = (String) obj2;
                        h19.g products = (h19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures11, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(products, "products");
                        ReentrantReadWriteLock reentrantReadWriteLock = uVar.e;
                        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                        for (int i66 = 0; i66 < readHoldCount; i66++) {
                            lock.unlock();
                        }
                        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                        writeLock.lock();
                        try {
                            ne0.d dVar4 = uVar.f221585b;
                            u.Companion.getClass();
                            dVar4.f(t.a("CACHE_KEY_HOME_PRODUCTS_MEMORY_KEY", enabledFeatures11), products);
                            Unit unit = Unit.f186387a;
                            while (i59 < readHoldCount) {
                                lock.lock();
                                i59++;
                            }
                            writeLock.unlock();
                            return Unit.f186387a;
                        } catch (Throwable th10) {
                            while (i59 < readHoldCount) {
                                lock.lock();
                                i59++;
                            }
                            writeLock.unlock();
                            throw th10;
                        }
                    default:
                        String enabledFeatures12 = (String) obj2;
                        h19.g products2 = (h19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures12, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(products2, "products");
                        ue0.c cVar6 = uVar.f221586c;
                        u.Companion.getClass();
                        cVar6.G(products2, t.a("CACHE_KEY_HOME_PRODUCTS_STORAGE_KEY", enabledFeatures12), wim.z.d(o0.b(h19.g.class)));
                        uVar.a(enabledFeatures12);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i59 = 1;
        Function2 function25 = new Function2(this) { // from class: o29.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f221580b;

            {
                this.f221580b = this;
            }

            /* JADX WARN: Finally extract failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i59;
                int i322 = 24;
                int i592 = 0;
                u uVar = this.f221580b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String enabledFeatures = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        rfm.m mVar = new rfm.m(((z39.b) uVar.d).f319221b.c(), new o28.g(new o17.x(25), 12), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new o17.x(26)), new o28.g(new b0(uVar, enabledFeatures, i322), 6), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String enabledFeatures2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures2, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService = uVar.f221584a;
                        LifestyleHomeService.Companion companion = LifestyleHomeService.INSTANCE;
                        return lifestyleHomeService.getHomeHeader(enabledFeatures2, "X-Enabled-Features,Accept-Language");
                    case 2:
                        String enabledFeatures3 = (String) obj2;
                        f19.g header = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures3, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(header, "header");
                        ne0.d dVar = uVar.f221585b;
                        u.Companion.getClass();
                        dVar.f(t.a("CACHE_KEY_HOME_HEADER_MEMORY_KEY", enabledFeatures3), header);
                        return Unit.f186387a;
                    case 3:
                        String enabledFeatures4 = (String) obj2;
                        f19.g header2 = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures4, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(header2, "header");
                        ue0.c cVar = uVar.f221586c;
                        u.Companion.getClass();
                        cVar.G(header2, t.a("CACHE_KEY_HOME_HEADER_STORAGE_KEY", enabledFeatures4), wim.z.d(o0.b(f19.g.class)));
                        uVar.a(enabledFeatures4);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String enabledFeatures5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures5, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService2 = uVar.f221584a;
                        LifestyleHomeService.Companion companion2 = LifestyleHomeService.INSTANCE;
                        return lifestyleHomeService2.getHomeSuggestedForYou(enabledFeatures5, "X-Enabled-Features,Accept-Language");
                    case 5:
                        String enabledFeatures6 = (String) obj2;
                        f19.g s4u = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures6, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(s4u, "s4u");
                        ne0.d dVar2 = uVar.f221585b;
                        u.Companion.getClass();
                        dVar2.f(t.a("CACHE_KEY_HOME_S4U_MEMORY_KEY", enabledFeatures6), s4u);
                        return Unit.f186387a;
                    case 6:
                        String enabledFeatures7 = (String) obj2;
                        f19.g s4u2 = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures7, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(s4u2, "s4u");
                        ue0.c cVar2 = uVar.f221586c;
                        u.Companion.getClass();
                        cVar2.G(s4u2, t.a("CACHE_KEY_HOME_S4U_STORAGE_KEY", enabledFeatures7), wim.z.d(o0.b(f19.g.class)));
                        uVar.a(enabledFeatures7);
                        return Unit.f186387a;
                    case 7:
                        String enabledFeatures8 = (String) obj2;
                        g19.c cVar3 = (g19.c) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures8, "enabledFeatures");
                        ne0.d dVar3 = uVar.f221585b;
                        u.Companion.getClass();
                        String strA = t.a("CACHE_KEY_HOME_FEED_MEMORY_KEY", enabledFeatures8);
                        Intrinsics.h(cVar3);
                        dVar3.f(strA, cVar3);
                        return Unit.f186387a;
                    case 8:
                        String enabledFeatures9 = (String) obj2;
                        g19.c cVar4 = (g19.c) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures9, "enabledFeatures");
                        ue0.c cVar5 = uVar.f221586c;
                        u.Companion.getClass();
                        String strA2 = t.a("CACHE_KEY_HOME_FEED_STORAGE_KEY", enabledFeatures9);
                        Intrinsics.h(cVar4);
                        cVar5.G(cVar4, strA2, wim.z.d(o0.f186429a.h(o0.b(g19.c.class), o0.a(g19.c.class))));
                        uVar.a(enabledFeatures9);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String enabledFeatures10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures10, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService3 = uVar.f221584a;
                        LifestyleHomeService.Companion companion3 = LifestyleHomeService.INSTANCE;
                        d0<h29.k> homeProducts = lifestyleHomeService3.getHomeProducts(enabledFeatures10, "X-Enabled-Features,Accept-Language");
                        o28.g gVar = new o28.g(new o17.x(24), 11);
                        homeProducts.getClass();
                        ufm.i iVar2 = new ufm.i(homeProducts, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 10:
                        String enabledFeatures11 = (String) obj2;
                        h19.g products = (h19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures11, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(products, "products");
                        ReentrantReadWriteLock reentrantReadWriteLock = uVar.e;
                        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                        for (int i66 = 0; i66 < readHoldCount; i66++) {
                            lock.unlock();
                        }
                        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                        writeLock.lock();
                        try {
                            ne0.d dVar4 = uVar.f221585b;
                            u.Companion.getClass();
                            dVar4.f(t.a("CACHE_KEY_HOME_PRODUCTS_MEMORY_KEY", enabledFeatures11), products);
                            Unit unit = Unit.f186387a;
                            while (i592 < readHoldCount) {
                                lock.lock();
                                i592++;
                            }
                            writeLock.unlock();
                            return Unit.f186387a;
                        } catch (Throwable th10) {
                            while (i592 < readHoldCount) {
                                lock.lock();
                                i592++;
                            }
                            writeLock.unlock();
                            throw th10;
                        }
                    default:
                        String enabledFeatures12 = (String) obj2;
                        h19.g products2 = (h19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures12, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(products2, "products");
                        ue0.c cVar6 = uVar.f221586c;
                        u.Companion.getClass();
                        cVar6.G(products2, t.a("CACHE_KEY_HOME_PRODUCTS_STORAGE_KEY", enabledFeatures12), wim.z.d(o0.b(h19.g.class)));
                        uVar.a(enabledFeatures12);
                        return Unit.f186387a;
                }
            }
        };
        final int i66 = 0;
        Function1 function15 = new Function1(this) { // from class: o29.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f221582b;

            {
                this.f221582b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String enabledFeatures = (String) obj2;
                switch (i66) {
                    case 0:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ne0.d dVar = this.f221582b.f221585b;
                        u.Companion.getClass();
                        return (f19.g) dVar.get(t.a("CACHE_KEY_HOME_HEADER_MEMORY_KEY", enabledFeatures));
                    case 1:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (f19.g) j6.a.k(f19.g.class, cVar, t.a("CACHE_KEY_HOME_HEADER_STORAGE_KEY", enabledFeatures));
                    case 2:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ne0.d dVar2 = this.f221582b.f221585b;
                        u.Companion.getClass();
                        return (f19.g) dVar2.get(t.a("CACHE_KEY_HOME_S4U_MEMORY_KEY", enabledFeatures));
                    case 3:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar2 = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (f19.g) j6.a.k(f19.g.class, cVar2, t.a("CACHE_KEY_HOME_S4U_STORAGE_KEY", enabledFeatures));
                    case 4:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ne0.d dVar3 = this.f221582b.f221585b;
                        u.Companion.getClass();
                        return (g19.c) dVar3.get(t.a("CACHE_KEY_HOME_FEED_MEMORY_KEY", enabledFeatures));
                    case 5:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar3 = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (g19.c) j6.a.k(g19.c.class, cVar3, t.a("CACHE_KEY_HOME_FEED_STORAGE_KEY", enabledFeatures));
                    case 6:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        u uVar = this.f221582b;
                        ReentrantReadWriteLock.ReadLock lock = uVar.e.readLock();
                        lock.lock();
                        try {
                            ne0.d dVar4 = uVar.f221585b;
                            u.Companion.getClass();
                            return (h19.g) dVar4.get(t.a("CACHE_KEY_HOME_PRODUCTS_MEMORY_KEY", enabledFeatures));
                        } finally {
                            lock.unlock();
                        }
                    default:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar4 = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (h19.g) j6.a.k(h19.g.class, cVar4, t.a("CACHE_KEY_HOME_PRODUCTS_STORAGE_KEY", enabledFeatures));
                }
            }
        };
        final int i74 = 2;
        Function2 function26 = new Function2(this) { // from class: o29.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f221580b;

            {
                this.f221580b = this;
            }

            /* JADX WARN: Finally extract failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i74;
                int i322 = 24;
                int i592 = 0;
                u uVar = this.f221580b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String enabledFeatures = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        rfm.m mVar = new rfm.m(((z39.b) uVar.d).f319221b.c(), new o28.g(new o17.x(25), 12), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new o17.x(26)), new o28.g(new b0(uVar, enabledFeatures, i322), 6), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String enabledFeatures2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures2, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService = uVar.f221584a;
                        LifestyleHomeService.Companion companion = LifestyleHomeService.INSTANCE;
                        return lifestyleHomeService.getHomeHeader(enabledFeatures2, "X-Enabled-Features,Accept-Language");
                    case 2:
                        String enabledFeatures3 = (String) obj2;
                        f19.g header = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures3, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(header, "header");
                        ne0.d dVar = uVar.f221585b;
                        u.Companion.getClass();
                        dVar.f(t.a("CACHE_KEY_HOME_HEADER_MEMORY_KEY", enabledFeatures3), header);
                        return Unit.f186387a;
                    case 3:
                        String enabledFeatures4 = (String) obj2;
                        f19.g header2 = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures4, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(header2, "header");
                        ue0.c cVar = uVar.f221586c;
                        u.Companion.getClass();
                        cVar.G(header2, t.a("CACHE_KEY_HOME_HEADER_STORAGE_KEY", enabledFeatures4), wim.z.d(o0.b(f19.g.class)));
                        uVar.a(enabledFeatures4);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String enabledFeatures5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures5, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService2 = uVar.f221584a;
                        LifestyleHomeService.Companion companion2 = LifestyleHomeService.INSTANCE;
                        return lifestyleHomeService2.getHomeSuggestedForYou(enabledFeatures5, "X-Enabled-Features,Accept-Language");
                    case 5:
                        String enabledFeatures6 = (String) obj2;
                        f19.g s4u = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures6, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(s4u, "s4u");
                        ne0.d dVar2 = uVar.f221585b;
                        u.Companion.getClass();
                        dVar2.f(t.a("CACHE_KEY_HOME_S4U_MEMORY_KEY", enabledFeatures6), s4u);
                        return Unit.f186387a;
                    case 6:
                        String enabledFeatures7 = (String) obj2;
                        f19.g s4u2 = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures7, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(s4u2, "s4u");
                        ue0.c cVar2 = uVar.f221586c;
                        u.Companion.getClass();
                        cVar2.G(s4u2, t.a("CACHE_KEY_HOME_S4U_STORAGE_KEY", enabledFeatures7), wim.z.d(o0.b(f19.g.class)));
                        uVar.a(enabledFeatures7);
                        return Unit.f186387a;
                    case 7:
                        String enabledFeatures8 = (String) obj2;
                        g19.c cVar3 = (g19.c) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures8, "enabledFeatures");
                        ne0.d dVar3 = uVar.f221585b;
                        u.Companion.getClass();
                        String strA = t.a("CACHE_KEY_HOME_FEED_MEMORY_KEY", enabledFeatures8);
                        Intrinsics.h(cVar3);
                        dVar3.f(strA, cVar3);
                        return Unit.f186387a;
                    case 8:
                        String enabledFeatures9 = (String) obj2;
                        g19.c cVar4 = (g19.c) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures9, "enabledFeatures");
                        ue0.c cVar5 = uVar.f221586c;
                        u.Companion.getClass();
                        String strA2 = t.a("CACHE_KEY_HOME_FEED_STORAGE_KEY", enabledFeatures9);
                        Intrinsics.h(cVar4);
                        cVar5.G(cVar4, strA2, wim.z.d(o0.f186429a.h(o0.b(g19.c.class), o0.a(g19.c.class))));
                        uVar.a(enabledFeatures9);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String enabledFeatures10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures10, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService3 = uVar.f221584a;
                        LifestyleHomeService.Companion companion3 = LifestyleHomeService.INSTANCE;
                        d0<h29.k> homeProducts = lifestyleHomeService3.getHomeProducts(enabledFeatures10, "X-Enabled-Features,Accept-Language");
                        o28.g gVar = new o28.g(new o17.x(24), 11);
                        homeProducts.getClass();
                        ufm.i iVar2 = new ufm.i(homeProducts, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 10:
                        String enabledFeatures11 = (String) obj2;
                        h19.g products = (h19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures11, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(products, "products");
                        ReentrantReadWriteLock reentrantReadWriteLock = uVar.e;
                        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                        for (int i662 = 0; i662 < readHoldCount; i662++) {
                            lock.unlock();
                        }
                        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                        writeLock.lock();
                        try {
                            ne0.d dVar4 = uVar.f221585b;
                            u.Companion.getClass();
                            dVar4.f(t.a("CACHE_KEY_HOME_PRODUCTS_MEMORY_KEY", enabledFeatures11), products);
                            Unit unit = Unit.f186387a;
                            while (i592 < readHoldCount) {
                                lock.lock();
                                i592++;
                            }
                            writeLock.unlock();
                            return Unit.f186387a;
                        } catch (Throwable th10) {
                            while (i592 < readHoldCount) {
                                lock.lock();
                                i592++;
                            }
                            writeLock.unlock();
                            throw th10;
                        }
                    default:
                        String enabledFeatures12 = (String) obj2;
                        h19.g products2 = (h19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures12, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(products2, "products");
                        ue0.c cVar6 = uVar.f221586c;
                        u.Companion.getClass();
                        cVar6.G(products2, t.a("CACHE_KEY_HOME_PRODUCTS_STORAGE_KEY", enabledFeatures12), wim.z.d(o0.b(h19.g.class)));
                        uVar.a(enabledFeatures12);
                        return Unit.f186387a;
                }
            }
        };
        final int i92 = 1;
        Function1 function16 = new Function1(this) { // from class: o29.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f221582b;

            {
                this.f221582b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String enabledFeatures = (String) obj2;
                switch (i92) {
                    case 0:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ne0.d dVar = this.f221582b.f221585b;
                        u.Companion.getClass();
                        return (f19.g) dVar.get(t.a("CACHE_KEY_HOME_HEADER_MEMORY_KEY", enabledFeatures));
                    case 1:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (f19.g) j6.a.k(f19.g.class, cVar, t.a("CACHE_KEY_HOME_HEADER_STORAGE_KEY", enabledFeatures));
                    case 2:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ne0.d dVar2 = this.f221582b.f221585b;
                        u.Companion.getClass();
                        return (f19.g) dVar2.get(t.a("CACHE_KEY_HOME_S4U_MEMORY_KEY", enabledFeatures));
                    case 3:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar2 = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (f19.g) j6.a.k(f19.g.class, cVar2, t.a("CACHE_KEY_HOME_S4U_STORAGE_KEY", enabledFeatures));
                    case 4:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ne0.d dVar3 = this.f221582b.f221585b;
                        u.Companion.getClass();
                        return (g19.c) dVar3.get(t.a("CACHE_KEY_HOME_FEED_MEMORY_KEY", enabledFeatures));
                    case 5:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar3 = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (g19.c) j6.a.k(g19.c.class, cVar3, t.a("CACHE_KEY_HOME_FEED_STORAGE_KEY", enabledFeatures));
                    case 6:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        u uVar = this.f221582b;
                        ReentrantReadWriteLock.ReadLock lock = uVar.e.readLock();
                        lock.lock();
                        try {
                            ne0.d dVar4 = uVar.f221585b;
                            u.Companion.getClass();
                            return (h19.g) dVar4.get(t.a("CACHE_KEY_HOME_PRODUCTS_MEMORY_KEY", enabledFeatures));
                        } finally {
                            lock.unlock();
                        }
                    default:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar4 = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (h19.g) j6.a.k(h19.g.class, cVar4, t.a("CACHE_KEY_HOME_PRODUCTS_STORAGE_KEY", enabledFeatures));
                }
            }
        };
        final int i96 = 3;
        this.f221588h = new w4l.f(function25, function15, function26, function16, new Function2(this) { // from class: o29.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f221580b;

            {
                this.f221580b = this;
            }

            /* JADX WARN: Finally extract failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i96;
                int i322 = 24;
                int i592 = 0;
                u uVar = this.f221580b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String enabledFeatures = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        rfm.m mVar = new rfm.m(((z39.b) uVar.d).f319221b.c(), new o28.g(new o17.x(25), 12), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new o17.x(26)), new o28.g(new b0(uVar, enabledFeatures, i322), 6), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String enabledFeatures2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures2, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService = uVar.f221584a;
                        LifestyleHomeService.Companion companion = LifestyleHomeService.INSTANCE;
                        return lifestyleHomeService.getHomeHeader(enabledFeatures2, "X-Enabled-Features,Accept-Language");
                    case 2:
                        String enabledFeatures3 = (String) obj2;
                        f19.g header = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures3, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(header, "header");
                        ne0.d dVar = uVar.f221585b;
                        u.Companion.getClass();
                        dVar.f(t.a("CACHE_KEY_HOME_HEADER_MEMORY_KEY", enabledFeatures3), header);
                        return Unit.f186387a;
                    case 3:
                        String enabledFeatures4 = (String) obj2;
                        f19.g header2 = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures4, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(header2, "header");
                        ue0.c cVar = uVar.f221586c;
                        u.Companion.getClass();
                        cVar.G(header2, t.a("CACHE_KEY_HOME_HEADER_STORAGE_KEY", enabledFeatures4), wim.z.d(o0.b(f19.g.class)));
                        uVar.a(enabledFeatures4);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String enabledFeatures5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures5, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService2 = uVar.f221584a;
                        LifestyleHomeService.Companion companion2 = LifestyleHomeService.INSTANCE;
                        return lifestyleHomeService2.getHomeSuggestedForYou(enabledFeatures5, "X-Enabled-Features,Accept-Language");
                    case 5:
                        String enabledFeatures6 = (String) obj2;
                        f19.g s4u = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures6, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(s4u, "s4u");
                        ne0.d dVar2 = uVar.f221585b;
                        u.Companion.getClass();
                        dVar2.f(t.a("CACHE_KEY_HOME_S4U_MEMORY_KEY", enabledFeatures6), s4u);
                        return Unit.f186387a;
                    case 6:
                        String enabledFeatures7 = (String) obj2;
                        f19.g s4u2 = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures7, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(s4u2, "s4u");
                        ue0.c cVar2 = uVar.f221586c;
                        u.Companion.getClass();
                        cVar2.G(s4u2, t.a("CACHE_KEY_HOME_S4U_STORAGE_KEY", enabledFeatures7), wim.z.d(o0.b(f19.g.class)));
                        uVar.a(enabledFeatures7);
                        return Unit.f186387a;
                    case 7:
                        String enabledFeatures8 = (String) obj2;
                        g19.c cVar3 = (g19.c) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures8, "enabledFeatures");
                        ne0.d dVar3 = uVar.f221585b;
                        u.Companion.getClass();
                        String strA = t.a("CACHE_KEY_HOME_FEED_MEMORY_KEY", enabledFeatures8);
                        Intrinsics.h(cVar3);
                        dVar3.f(strA, cVar3);
                        return Unit.f186387a;
                    case 8:
                        String enabledFeatures9 = (String) obj2;
                        g19.c cVar4 = (g19.c) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures9, "enabledFeatures");
                        ue0.c cVar5 = uVar.f221586c;
                        u.Companion.getClass();
                        String strA2 = t.a("CACHE_KEY_HOME_FEED_STORAGE_KEY", enabledFeatures9);
                        Intrinsics.h(cVar4);
                        cVar5.G(cVar4, strA2, wim.z.d(o0.f186429a.h(o0.b(g19.c.class), o0.a(g19.c.class))));
                        uVar.a(enabledFeatures9);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String enabledFeatures10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures10, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService3 = uVar.f221584a;
                        LifestyleHomeService.Companion companion3 = LifestyleHomeService.INSTANCE;
                        d0<h29.k> homeProducts = lifestyleHomeService3.getHomeProducts(enabledFeatures10, "X-Enabled-Features,Accept-Language");
                        o28.g gVar = new o28.g(new o17.x(24), 11);
                        homeProducts.getClass();
                        ufm.i iVar2 = new ufm.i(homeProducts, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 10:
                        String enabledFeatures11 = (String) obj2;
                        h19.g products = (h19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures11, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(products, "products");
                        ReentrantReadWriteLock reentrantReadWriteLock = uVar.e;
                        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                        for (int i662 = 0; i662 < readHoldCount; i662++) {
                            lock.unlock();
                        }
                        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                        writeLock.lock();
                        try {
                            ne0.d dVar4 = uVar.f221585b;
                            u.Companion.getClass();
                            dVar4.f(t.a("CACHE_KEY_HOME_PRODUCTS_MEMORY_KEY", enabledFeatures11), products);
                            Unit unit = Unit.f186387a;
                            while (i592 < readHoldCount) {
                                lock.lock();
                                i592++;
                            }
                            writeLock.unlock();
                            return Unit.f186387a;
                        } catch (Throwable th10) {
                            while (i592 < readHoldCount) {
                                lock.lock();
                                i592++;
                            }
                            writeLock.unlock();
                            throw th10;
                        }
                    default:
                        String enabledFeatures12 = (String) obj2;
                        h19.g products2 = (h19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures12, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(products2, "products");
                        ue0.c cVar6 = uVar.f221586c;
                        u.Companion.getClass();
                        cVar6.G(products2, t.a("CACHE_KEY_HOME_PRODUCTS_STORAGE_KEY", enabledFeatures12), wim.z.d(o0.b(h19.g.class)));
                        uVar.a(enabledFeatures12);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i99 = 4;
        Function2 function27 = new Function2(this) { // from class: o29.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f221580b;

            {
                this.f221580b = this;
            }

            /* JADX WARN: Finally extract failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i99;
                int i322 = 24;
                int i592 = 0;
                u uVar = this.f221580b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String enabledFeatures = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        rfm.m mVar = new rfm.m(((z39.b) uVar.d).f319221b.c(), new o28.g(new o17.x(25), 12), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new o17.x(26)), new o28.g(new b0(uVar, enabledFeatures, i322), 6), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String enabledFeatures2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures2, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService = uVar.f221584a;
                        LifestyleHomeService.Companion companion = LifestyleHomeService.INSTANCE;
                        return lifestyleHomeService.getHomeHeader(enabledFeatures2, "X-Enabled-Features,Accept-Language");
                    case 2:
                        String enabledFeatures3 = (String) obj2;
                        f19.g header = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures3, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(header, "header");
                        ne0.d dVar = uVar.f221585b;
                        u.Companion.getClass();
                        dVar.f(t.a("CACHE_KEY_HOME_HEADER_MEMORY_KEY", enabledFeatures3), header);
                        return Unit.f186387a;
                    case 3:
                        String enabledFeatures4 = (String) obj2;
                        f19.g header2 = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures4, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(header2, "header");
                        ue0.c cVar = uVar.f221586c;
                        u.Companion.getClass();
                        cVar.G(header2, t.a("CACHE_KEY_HOME_HEADER_STORAGE_KEY", enabledFeatures4), wim.z.d(o0.b(f19.g.class)));
                        uVar.a(enabledFeatures4);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String enabledFeatures5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures5, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService2 = uVar.f221584a;
                        LifestyleHomeService.Companion companion2 = LifestyleHomeService.INSTANCE;
                        return lifestyleHomeService2.getHomeSuggestedForYou(enabledFeatures5, "X-Enabled-Features,Accept-Language");
                    case 5:
                        String enabledFeatures6 = (String) obj2;
                        f19.g s4u = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures6, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(s4u, "s4u");
                        ne0.d dVar2 = uVar.f221585b;
                        u.Companion.getClass();
                        dVar2.f(t.a("CACHE_KEY_HOME_S4U_MEMORY_KEY", enabledFeatures6), s4u);
                        return Unit.f186387a;
                    case 6:
                        String enabledFeatures7 = (String) obj2;
                        f19.g s4u2 = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures7, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(s4u2, "s4u");
                        ue0.c cVar2 = uVar.f221586c;
                        u.Companion.getClass();
                        cVar2.G(s4u2, t.a("CACHE_KEY_HOME_S4U_STORAGE_KEY", enabledFeatures7), wim.z.d(o0.b(f19.g.class)));
                        uVar.a(enabledFeatures7);
                        return Unit.f186387a;
                    case 7:
                        String enabledFeatures8 = (String) obj2;
                        g19.c cVar3 = (g19.c) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures8, "enabledFeatures");
                        ne0.d dVar3 = uVar.f221585b;
                        u.Companion.getClass();
                        String strA = t.a("CACHE_KEY_HOME_FEED_MEMORY_KEY", enabledFeatures8);
                        Intrinsics.h(cVar3);
                        dVar3.f(strA, cVar3);
                        return Unit.f186387a;
                    case 8:
                        String enabledFeatures9 = (String) obj2;
                        g19.c cVar4 = (g19.c) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures9, "enabledFeatures");
                        ue0.c cVar5 = uVar.f221586c;
                        u.Companion.getClass();
                        String strA2 = t.a("CACHE_KEY_HOME_FEED_STORAGE_KEY", enabledFeatures9);
                        Intrinsics.h(cVar4);
                        cVar5.G(cVar4, strA2, wim.z.d(o0.f186429a.h(o0.b(g19.c.class), o0.a(g19.c.class))));
                        uVar.a(enabledFeatures9);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String enabledFeatures10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures10, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService3 = uVar.f221584a;
                        LifestyleHomeService.Companion companion3 = LifestyleHomeService.INSTANCE;
                        d0<h29.k> homeProducts = lifestyleHomeService3.getHomeProducts(enabledFeatures10, "X-Enabled-Features,Accept-Language");
                        o28.g gVar = new o28.g(new o17.x(24), 11);
                        homeProducts.getClass();
                        ufm.i iVar2 = new ufm.i(homeProducts, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 10:
                        String enabledFeatures11 = (String) obj2;
                        h19.g products = (h19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures11, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(products, "products");
                        ReentrantReadWriteLock reentrantReadWriteLock = uVar.e;
                        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                        for (int i662 = 0; i662 < readHoldCount; i662++) {
                            lock.unlock();
                        }
                        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                        writeLock.lock();
                        try {
                            ne0.d dVar4 = uVar.f221585b;
                            u.Companion.getClass();
                            dVar4.f(t.a("CACHE_KEY_HOME_PRODUCTS_MEMORY_KEY", enabledFeatures11), products);
                            Unit unit = Unit.f186387a;
                            while (i592 < readHoldCount) {
                                lock.lock();
                                i592++;
                            }
                            writeLock.unlock();
                            return Unit.f186387a;
                        } catch (Throwable th10) {
                            while (i592 < readHoldCount) {
                                lock.lock();
                                i592++;
                            }
                            writeLock.unlock();
                            throw th10;
                        }
                    default:
                        String enabledFeatures12 = (String) obj2;
                        h19.g products2 = (h19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures12, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(products2, "products");
                        ue0.c cVar6 = uVar.f221586c;
                        u.Companion.getClass();
                        cVar6.G(products2, t.a("CACHE_KEY_HOME_PRODUCTS_STORAGE_KEY", enabledFeatures12), wim.z.d(o0.b(h19.g.class)));
                        uVar.a(enabledFeatures12);
                        return Unit.f186387a;
                }
            }
        };
        final int i100 = 2;
        Function1 function17 = new Function1(this) { // from class: o29.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f221582b;

            {
                this.f221582b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String enabledFeatures = (String) obj2;
                switch (i100) {
                    case 0:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ne0.d dVar = this.f221582b.f221585b;
                        u.Companion.getClass();
                        return (f19.g) dVar.get(t.a("CACHE_KEY_HOME_HEADER_MEMORY_KEY", enabledFeatures));
                    case 1:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (f19.g) j6.a.k(f19.g.class, cVar, t.a("CACHE_KEY_HOME_HEADER_STORAGE_KEY", enabledFeatures));
                    case 2:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ne0.d dVar2 = this.f221582b.f221585b;
                        u.Companion.getClass();
                        return (f19.g) dVar2.get(t.a("CACHE_KEY_HOME_S4U_MEMORY_KEY", enabledFeatures));
                    case 3:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar2 = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (f19.g) j6.a.k(f19.g.class, cVar2, t.a("CACHE_KEY_HOME_S4U_STORAGE_KEY", enabledFeatures));
                    case 4:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ne0.d dVar3 = this.f221582b.f221585b;
                        u.Companion.getClass();
                        return (g19.c) dVar3.get(t.a("CACHE_KEY_HOME_FEED_MEMORY_KEY", enabledFeatures));
                    case 5:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar3 = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (g19.c) j6.a.k(g19.c.class, cVar3, t.a("CACHE_KEY_HOME_FEED_STORAGE_KEY", enabledFeatures));
                    case 6:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        u uVar = this.f221582b;
                        ReentrantReadWriteLock.ReadLock lock = uVar.e.readLock();
                        lock.lock();
                        try {
                            ne0.d dVar4 = uVar.f221585b;
                            u.Companion.getClass();
                            return (h19.g) dVar4.get(t.a("CACHE_KEY_HOME_PRODUCTS_MEMORY_KEY", enabledFeatures));
                        } finally {
                            lock.unlock();
                        }
                    default:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar4 = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (h19.g) j6.a.k(h19.g.class, cVar4, t.a("CACHE_KEY_HOME_PRODUCTS_STORAGE_KEY", enabledFeatures));
                }
            }
        };
        final int i101 = 5;
        Function2 function28 = new Function2(this) { // from class: o29.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f221580b;

            {
                this.f221580b = this;
            }

            /* JADX WARN: Finally extract failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i101;
                int i322 = 24;
                int i592 = 0;
                u uVar = this.f221580b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String enabledFeatures = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        rfm.m mVar = new rfm.m(((z39.b) uVar.d).f319221b.c(), new o28.g(new o17.x(25), 12), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new o17.x(26)), new o28.g(new b0(uVar, enabledFeatures, i322), 6), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String enabledFeatures2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures2, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService = uVar.f221584a;
                        LifestyleHomeService.Companion companion = LifestyleHomeService.INSTANCE;
                        return lifestyleHomeService.getHomeHeader(enabledFeatures2, "X-Enabled-Features,Accept-Language");
                    case 2:
                        String enabledFeatures3 = (String) obj2;
                        f19.g header = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures3, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(header, "header");
                        ne0.d dVar = uVar.f221585b;
                        u.Companion.getClass();
                        dVar.f(t.a("CACHE_KEY_HOME_HEADER_MEMORY_KEY", enabledFeatures3), header);
                        return Unit.f186387a;
                    case 3:
                        String enabledFeatures4 = (String) obj2;
                        f19.g header2 = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures4, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(header2, "header");
                        ue0.c cVar = uVar.f221586c;
                        u.Companion.getClass();
                        cVar.G(header2, t.a("CACHE_KEY_HOME_HEADER_STORAGE_KEY", enabledFeatures4), wim.z.d(o0.b(f19.g.class)));
                        uVar.a(enabledFeatures4);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String enabledFeatures5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures5, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService2 = uVar.f221584a;
                        LifestyleHomeService.Companion companion2 = LifestyleHomeService.INSTANCE;
                        return lifestyleHomeService2.getHomeSuggestedForYou(enabledFeatures5, "X-Enabled-Features,Accept-Language");
                    case 5:
                        String enabledFeatures6 = (String) obj2;
                        f19.g s4u = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures6, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(s4u, "s4u");
                        ne0.d dVar2 = uVar.f221585b;
                        u.Companion.getClass();
                        dVar2.f(t.a("CACHE_KEY_HOME_S4U_MEMORY_KEY", enabledFeatures6), s4u);
                        return Unit.f186387a;
                    case 6:
                        String enabledFeatures7 = (String) obj2;
                        f19.g s4u2 = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures7, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(s4u2, "s4u");
                        ue0.c cVar2 = uVar.f221586c;
                        u.Companion.getClass();
                        cVar2.G(s4u2, t.a("CACHE_KEY_HOME_S4U_STORAGE_KEY", enabledFeatures7), wim.z.d(o0.b(f19.g.class)));
                        uVar.a(enabledFeatures7);
                        return Unit.f186387a;
                    case 7:
                        String enabledFeatures8 = (String) obj2;
                        g19.c cVar3 = (g19.c) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures8, "enabledFeatures");
                        ne0.d dVar3 = uVar.f221585b;
                        u.Companion.getClass();
                        String strA = t.a("CACHE_KEY_HOME_FEED_MEMORY_KEY", enabledFeatures8);
                        Intrinsics.h(cVar3);
                        dVar3.f(strA, cVar3);
                        return Unit.f186387a;
                    case 8:
                        String enabledFeatures9 = (String) obj2;
                        g19.c cVar4 = (g19.c) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures9, "enabledFeatures");
                        ue0.c cVar5 = uVar.f221586c;
                        u.Companion.getClass();
                        String strA2 = t.a("CACHE_KEY_HOME_FEED_STORAGE_KEY", enabledFeatures9);
                        Intrinsics.h(cVar4);
                        cVar5.G(cVar4, strA2, wim.z.d(o0.f186429a.h(o0.b(g19.c.class), o0.a(g19.c.class))));
                        uVar.a(enabledFeatures9);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String enabledFeatures10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures10, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService3 = uVar.f221584a;
                        LifestyleHomeService.Companion companion3 = LifestyleHomeService.INSTANCE;
                        d0<h29.k> homeProducts = lifestyleHomeService3.getHomeProducts(enabledFeatures10, "X-Enabled-Features,Accept-Language");
                        o28.g gVar = new o28.g(new o17.x(24), 11);
                        homeProducts.getClass();
                        ufm.i iVar2 = new ufm.i(homeProducts, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 10:
                        String enabledFeatures11 = (String) obj2;
                        h19.g products = (h19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures11, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(products, "products");
                        ReentrantReadWriteLock reentrantReadWriteLock = uVar.e;
                        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                        for (int i662 = 0; i662 < readHoldCount; i662++) {
                            lock.unlock();
                        }
                        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                        writeLock.lock();
                        try {
                            ne0.d dVar4 = uVar.f221585b;
                            u.Companion.getClass();
                            dVar4.f(t.a("CACHE_KEY_HOME_PRODUCTS_MEMORY_KEY", enabledFeatures11), products);
                            Unit unit = Unit.f186387a;
                            while (i592 < readHoldCount) {
                                lock.lock();
                                i592++;
                            }
                            writeLock.unlock();
                            return Unit.f186387a;
                        } catch (Throwable th10) {
                            while (i592 < readHoldCount) {
                                lock.lock();
                                i592++;
                            }
                            writeLock.unlock();
                            throw th10;
                        }
                    default:
                        String enabledFeatures12 = (String) obj2;
                        h19.g products2 = (h19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures12, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(products2, "products");
                        ue0.c cVar6 = uVar.f221586c;
                        u.Companion.getClass();
                        cVar6.G(products2, t.a("CACHE_KEY_HOME_PRODUCTS_STORAGE_KEY", enabledFeatures12), wim.z.d(o0.b(h19.g.class)));
                        uVar.a(enabledFeatures12);
                        return Unit.f186387a;
                }
            }
        };
        final int i102 = 3;
        Function1 function18 = new Function1(this) { // from class: o29.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f221582b;

            {
                this.f221582b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String enabledFeatures = (String) obj2;
                switch (i102) {
                    case 0:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ne0.d dVar = this.f221582b.f221585b;
                        u.Companion.getClass();
                        return (f19.g) dVar.get(t.a("CACHE_KEY_HOME_HEADER_MEMORY_KEY", enabledFeatures));
                    case 1:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (f19.g) j6.a.k(f19.g.class, cVar, t.a("CACHE_KEY_HOME_HEADER_STORAGE_KEY", enabledFeatures));
                    case 2:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ne0.d dVar2 = this.f221582b.f221585b;
                        u.Companion.getClass();
                        return (f19.g) dVar2.get(t.a("CACHE_KEY_HOME_S4U_MEMORY_KEY", enabledFeatures));
                    case 3:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar2 = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (f19.g) j6.a.k(f19.g.class, cVar2, t.a("CACHE_KEY_HOME_S4U_STORAGE_KEY", enabledFeatures));
                    case 4:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ne0.d dVar3 = this.f221582b.f221585b;
                        u.Companion.getClass();
                        return (g19.c) dVar3.get(t.a("CACHE_KEY_HOME_FEED_MEMORY_KEY", enabledFeatures));
                    case 5:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar3 = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (g19.c) j6.a.k(g19.c.class, cVar3, t.a("CACHE_KEY_HOME_FEED_STORAGE_KEY", enabledFeatures));
                    case 6:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        u uVar = this.f221582b;
                        ReentrantReadWriteLock.ReadLock lock = uVar.e.readLock();
                        lock.lock();
                        try {
                            ne0.d dVar4 = uVar.f221585b;
                            u.Companion.getClass();
                            return (h19.g) dVar4.get(t.a("CACHE_KEY_HOME_PRODUCTS_MEMORY_KEY", enabledFeatures));
                        } finally {
                            lock.unlock();
                        }
                    default:
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        ue0.c cVar4 = this.f221582b.f221586c;
                        u.Companion.getClass();
                        return (h19.g) j6.a.k(h19.g.class, cVar4, t.a("CACHE_KEY_HOME_PRODUCTS_STORAGE_KEY", enabledFeatures));
                }
            }
        };
        final int i103 = 6;
        this.i = new w4l.f(function27, function17, function28, function18, new Function2(this) { // from class: o29.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f221580b;

            {
                this.f221580b = this;
            }

            /* JADX WARN: Finally extract failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i103;
                int i322 = 24;
                int i592 = 0;
                u uVar = this.f221580b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String enabledFeatures = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                        rfm.m mVar = new rfm.m(((z39.b) uVar.d).f319221b.c(), new o28.g(new o17.x(25), 12), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new o17.x(26)), new o28.g(new b0(uVar, enabledFeatures, i322), 6), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String enabledFeatures2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures2, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService = uVar.f221584a;
                        LifestyleHomeService.Companion companion = LifestyleHomeService.INSTANCE;
                        return lifestyleHomeService.getHomeHeader(enabledFeatures2, "X-Enabled-Features,Accept-Language");
                    case 2:
                        String enabledFeatures3 = (String) obj2;
                        f19.g header = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures3, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(header, "header");
                        ne0.d dVar = uVar.f221585b;
                        u.Companion.getClass();
                        dVar.f(t.a("CACHE_KEY_HOME_HEADER_MEMORY_KEY", enabledFeatures3), header);
                        return Unit.f186387a;
                    case 3:
                        String enabledFeatures4 = (String) obj2;
                        f19.g header2 = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures4, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(header2, "header");
                        ue0.c cVar = uVar.f221586c;
                        u.Companion.getClass();
                        cVar.G(header2, t.a("CACHE_KEY_HOME_HEADER_STORAGE_KEY", enabledFeatures4), wim.z.d(o0.b(f19.g.class)));
                        uVar.a(enabledFeatures4);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String enabledFeatures5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures5, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService2 = uVar.f221584a;
                        LifestyleHomeService.Companion companion2 = LifestyleHomeService.INSTANCE;
                        return lifestyleHomeService2.getHomeSuggestedForYou(enabledFeatures5, "X-Enabled-Features,Accept-Language");
                    case 5:
                        String enabledFeatures6 = (String) obj2;
                        f19.g s4u = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures6, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(s4u, "s4u");
                        ne0.d dVar2 = uVar.f221585b;
                        u.Companion.getClass();
                        dVar2.f(t.a("CACHE_KEY_HOME_S4U_MEMORY_KEY", enabledFeatures6), s4u);
                        return Unit.f186387a;
                    case 6:
                        String enabledFeatures7 = (String) obj2;
                        f19.g s4u2 = (f19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures7, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(s4u2, "s4u");
                        ue0.c cVar2 = uVar.f221586c;
                        u.Companion.getClass();
                        cVar2.G(s4u2, t.a("CACHE_KEY_HOME_S4U_STORAGE_KEY", enabledFeatures7), wim.z.d(o0.b(f19.g.class)));
                        uVar.a(enabledFeatures7);
                        return Unit.f186387a;
                    case 7:
                        String enabledFeatures8 = (String) obj2;
                        g19.c cVar3 = (g19.c) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures8, "enabledFeatures");
                        ne0.d dVar3 = uVar.f221585b;
                        u.Companion.getClass();
                        String strA = t.a("CACHE_KEY_HOME_FEED_MEMORY_KEY", enabledFeatures8);
                        Intrinsics.h(cVar3);
                        dVar3.f(strA, cVar3);
                        return Unit.f186387a;
                    case 8:
                        String enabledFeatures9 = (String) obj2;
                        g19.c cVar4 = (g19.c) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures9, "enabledFeatures");
                        ue0.c cVar5 = uVar.f221586c;
                        u.Companion.getClass();
                        String strA2 = t.a("CACHE_KEY_HOME_FEED_STORAGE_KEY", enabledFeatures9);
                        Intrinsics.h(cVar4);
                        cVar5.G(cVar4, strA2, wim.z.d(o0.f186429a.h(o0.b(g19.c.class), o0.a(g19.c.class))));
                        uVar.a(enabledFeatures9);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String enabledFeatures10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(enabledFeatures10, "enabledFeatures");
                        LifestyleHomeService lifestyleHomeService3 = uVar.f221584a;
                        LifestyleHomeService.Companion companion3 = LifestyleHomeService.INSTANCE;
                        d0<h29.k> homeProducts = lifestyleHomeService3.getHomeProducts(enabledFeatures10, "X-Enabled-Features,Accept-Language");
                        o28.g gVar = new o28.g(new o17.x(24), 11);
                        homeProducts.getClass();
                        ufm.i iVar2 = new ufm.i(homeProducts, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 10:
                        String enabledFeatures11 = (String) obj2;
                        h19.g products = (h19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures11, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(products, "products");
                        ReentrantReadWriteLock reentrantReadWriteLock = uVar.e;
                        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                        for (int i662 = 0; i662 < readHoldCount; i662++) {
                            lock.unlock();
                        }
                        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                        writeLock.lock();
                        try {
                            ne0.d dVar4 = uVar.f221585b;
                            u.Companion.getClass();
                            dVar4.f(t.a("CACHE_KEY_HOME_PRODUCTS_MEMORY_KEY", enabledFeatures11), products);
                            Unit unit = Unit.f186387a;
                            while (i592 < readHoldCount) {
                                lock.lock();
                                i592++;
                            }
                            writeLock.unlock();
                            return Unit.f186387a;
                        } catch (Throwable th10) {
                            while (i592 < readHoldCount) {
                                lock.lock();
                                i592++;
                            }
                            writeLock.unlock();
                            throw th10;
                        }
                    default:
                        String enabledFeatures12 = (String) obj2;
                        h19.g products2 = (h19.g) obj3;
                        Intrinsics.checkNotNullParameter(enabledFeatures12, "enabledFeatures");
                        Intrinsics.checkNotNullParameter(products2, "products");
                        ue0.c cVar6 = uVar.f221586c;
                        u.Companion.getClass();
                        cVar6.G(products2, t.a("CACHE_KEY_HOME_PRODUCTS_STORAGE_KEY", enabledFeatures12), wim.z.d(o0.b(h19.g.class)));
                        uVar.a(enabledFeatures12);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public final synchronized void a(String str) {
        try {
            Collection collection = (List) this.f221586c.T2("lifestyle_home_enabled_features_index", f221583j);
            if (collection == null) {
                collection = zhm.f0.f322471a;
            }
            ArrayList arrayListF1 = zhm.d0.f1(collection);
            arrayListF1.remove(str);
            arrayListF1.add(str);
            while (arrayListF1.size() > 30) {
                String str2 = (String) arrayListF1.remove(0);
                ue0.c cVar = this.f221586c;
                Companion.getClass();
                cVar.I0(t.a("CACHE_KEY_HOME_FEED_STORAGE_KEY", str2));
                cVar.I0(t.a("CACHE_KEY_HOME_PRODUCTS_STORAGE_KEY", str2));
                cVar.I0(t.a("CACHE_KEY_HOME_HEADER_STORAGE_KEY", str2));
                cVar.I0(t.a("CACHE_KEY_HOME_S4U_STORAGE_KEY", str2));
            }
            ue0.c cVar2 = this.f221586c;
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            KType kTypeB = o0.b(String.class);
            companion.getClass();
            cVar2.G(arrayListF1, "lifestyle_home_enabled_features_index", wim.z.d(o0.f186429a.d(o0.c(List.class, KTypeProjection.Companion.a(kTypeB)))));
        } catch (Throwable th10) {
            throw th10;
        }
    }
}
