package oid;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.shops.impl.service.AdvertisingService;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class h0 implements od0.e {

    @NotNull
    public static final d0 Companion = new d0();
    public static final Type e;
    public static final Type f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdvertisingService f225639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f225640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fd0.d f225641c;
    public final w4l.f d;

    static {
        Type type = new TypeToken<List<? extends String>>() { // from class: com.revolut.feature.shops.impl.repository.ShopsOutletsRepository$Companion$INDEX_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        e = type;
        Type type2 = new TypeToken<mid.p>() { // from class: com.revolut.feature.shops.impl.repository.ShopsOutletsRepository$Companion$OUTLETS_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        f = type2;
    }

    public h0(AdvertisingService advertisingService, ue0.c storage) {
        Intrinsics.checkNotNullParameter(advertisingService, "advertisingService");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f225639a = advertisingService;
        this.f225640b = storage;
        this.f225641c = new fd0.d(10);
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: oid.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f225617b;

            {
                this.f225617b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String strA;
                String strA2;
                String strA3;
                String strA4;
                String strA5;
                switch (i) {
                    case 0:
                        h0 h0Var = this.f225617b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        e0 params = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        AdvertisingService advertisingService2 = h0Var.f225639a;
                        f0 f0Var = params.f225627a;
                        g0 g0Var = params.f225628b;
                        String strA6 = null;
                        if (f0Var != null) {
                            double d = f0Var.f225631a;
                            h0.Companion.getClass();
                            strA = d0.a(d);
                        } else {
                            strA = null;
                        }
                        f0 f0Var2 = params.f225627a;
                        if (f0Var2 != null) {
                            double d5 = f0Var2.f225632b;
                            h0.Companion.getClass();
                            strA2 = d0.a(d5);
                        } else {
                            strA2 = null;
                        }
                        if (g0Var != null) {
                            double d6 = g0Var.f225635a;
                            h0.Companion.getClass();
                            strA3 = d0.a(d6);
                        } else {
                            strA3 = null;
                        }
                        if (g0Var != null) {
                            double d10 = g0Var.d;
                            h0.Companion.getClass();
                            strA4 = d0.a(d10);
                        } else {
                            strA4 = null;
                        }
                        if (g0Var != null) {
                            double d15 = g0Var.f225637c;
                            h0.Companion.getClass();
                            strA5 = d0.a(d15);
                        } else {
                            strA5 = null;
                        }
                        if (g0Var != null) {
                            double d41 = g0Var.f225636b;
                            h0.Companion.getClass();
                            strA6 = d0.a(d41);
                        }
                        return advertisingService2.getOutlets(strA, strA2, strA3, strA5, strA6, strA4);
                    case 1:
                        h0 h0Var2 = this.f225617b;
                        e0 params2 = (e0) obj2;
                        mid.p shopsOutlets = (mid.p) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(shopsOutlets, "shopsOutlets");
                        h0Var2.f225641c.d(h0.a(params2), shopsOutlets);
                        return Unit.f186387a;
                    default:
                        h0 h0Var3 = this.f225617b;
                        e0 params3 = (e0) obj2;
                        mid.p shopsOutlets2 = (mid.p) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(shopsOutlets2, "shopsOutlets");
                        String strA7 = h0.a(params3);
                        h0Var3.f225640b.G(shopsOutlets2, strA7, wim.z.d(o0.b(mid.p.class)));
                        synchronized (h0Var3) {
                            try {
                                Collection collection = (List) h0Var3.f225640b.T2("shops_outlets_key_index", h0.e);
                                if (collection == null) {
                                    collection = zhm.f0.f322471a;
                                }
                                ArrayList arrayListF1 = zhm.d0.f1(collection);
                                arrayListF1.remove(strA7);
                                arrayListF1.add(strA7);
                                if (arrayListF1.size() > 10) {
                                    h0Var3.f225640b.I0((String) arrayListF1.remove(0));
                                }
                                ue0.c cVar = h0Var3.f225640b;
                                KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                                KType kTypeB = o0.b(String.class);
                                companion.getClass();
                                cVar.G(arrayListF1, "shops_outlets_key_index", wim.z.d(o0.f186429a.d(o0.c(List.class, KTypeProjection.Companion.a(kTypeB)))));
                            } catch (Throwable th10) {
                                throw th10;
                            }
                        }
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1 = new Function1(this) { // from class: oid.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f225621b;

            {
                this.f225621b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                e0 params = (e0) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (mid.p) this.f225621b.f225641c.c(h0.a(params));
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (mid.p) this.f225621b.f225640b.T2(h0.a(params), h0.f);
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: oid.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f225617b;

            {
                this.f225617b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String strA;
                String strA2;
                String strA3;
                String strA4;
                String strA5;
                switch (i2) {
                    case 0:
                        h0 h0Var = this.f225617b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        e0 params = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        AdvertisingService advertisingService2 = h0Var.f225639a;
                        f0 f0Var = params.f225627a;
                        g0 g0Var = params.f225628b;
                        String strA6 = null;
                        if (f0Var != null) {
                            double d = f0Var.f225631a;
                            h0.Companion.getClass();
                            strA = d0.a(d);
                        } else {
                            strA = null;
                        }
                        f0 f0Var2 = params.f225627a;
                        if (f0Var2 != null) {
                            double d5 = f0Var2.f225632b;
                            h0.Companion.getClass();
                            strA2 = d0.a(d5);
                        } else {
                            strA2 = null;
                        }
                        if (g0Var != null) {
                            double d6 = g0Var.f225635a;
                            h0.Companion.getClass();
                            strA3 = d0.a(d6);
                        } else {
                            strA3 = null;
                        }
                        if (g0Var != null) {
                            double d10 = g0Var.d;
                            h0.Companion.getClass();
                            strA4 = d0.a(d10);
                        } else {
                            strA4 = null;
                        }
                        if (g0Var != null) {
                            double d15 = g0Var.f225637c;
                            h0.Companion.getClass();
                            strA5 = d0.a(d15);
                        } else {
                            strA5 = null;
                        }
                        if (g0Var != null) {
                            double d41 = g0Var.f225636b;
                            h0.Companion.getClass();
                            strA6 = d0.a(d41);
                        }
                        return advertisingService2.getOutlets(strA, strA2, strA3, strA5, strA6, strA4);
                    case 1:
                        h0 h0Var2 = this.f225617b;
                        e0 params2 = (e0) obj2;
                        mid.p shopsOutlets = (mid.p) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(shopsOutlets, "shopsOutlets");
                        h0Var2.f225641c.d(h0.a(params2), shopsOutlets);
                        return Unit.f186387a;
                    default:
                        h0 h0Var3 = this.f225617b;
                        e0 params3 = (e0) obj2;
                        mid.p shopsOutlets2 = (mid.p) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(shopsOutlets2, "shopsOutlets");
                        String strA7 = h0.a(params3);
                        h0Var3.f225640b.G(shopsOutlets2, strA7, wim.z.d(o0.b(mid.p.class)));
                        synchronized (h0Var3) {
                            try {
                                Collection collection = (List) h0Var3.f225640b.T2("shops_outlets_key_index", h0.e);
                                if (collection == null) {
                                    collection = zhm.f0.f322471a;
                                }
                                ArrayList arrayListF1 = zhm.d0.f1(collection);
                                arrayListF1.remove(strA7);
                                arrayListF1.add(strA7);
                                if (arrayListF1.size() > 10) {
                                    h0Var3.f225640b.I0((String) arrayListF1.remove(0));
                                }
                                ue0.c cVar = h0Var3.f225640b;
                                KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                                KType kTypeB = o0.b(String.class);
                                companion.getClass();
                                cVar.G(arrayListF1, "shops_outlets_key_index", wim.z.d(o0.f186429a.d(o0.c(List.class, KTypeProjection.Companion.a(kTypeB)))));
                            } catch (Throwable th10) {
                                throw th10;
                            }
                        }
                        return Unit.f186387a;
                }
            }
        };
        Function1 function12 = new Function1(this) { // from class: oid.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f225621b;

            {
                this.f225621b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                e0 params = (e0) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (mid.p) this.f225621b.f225641c.c(h0.a(params));
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (mid.p) this.f225621b.f225640b.T2(h0.a(params), h0.f);
                }
            }
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: oid.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f225617b;

            {
                this.f225617b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String strA;
                String strA2;
                String strA3;
                String strA4;
                String strA5;
                switch (i3) {
                    case 0:
                        h0 h0Var = this.f225617b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        e0 params = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        AdvertisingService advertisingService2 = h0Var.f225639a;
                        f0 f0Var = params.f225627a;
                        g0 g0Var = params.f225628b;
                        String strA6 = null;
                        if (f0Var != null) {
                            double d = f0Var.f225631a;
                            h0.Companion.getClass();
                            strA = d0.a(d);
                        } else {
                            strA = null;
                        }
                        f0 f0Var2 = params.f225627a;
                        if (f0Var2 != null) {
                            double d5 = f0Var2.f225632b;
                            h0.Companion.getClass();
                            strA2 = d0.a(d5);
                        } else {
                            strA2 = null;
                        }
                        if (g0Var != null) {
                            double d6 = g0Var.f225635a;
                            h0.Companion.getClass();
                            strA3 = d0.a(d6);
                        } else {
                            strA3 = null;
                        }
                        if (g0Var != null) {
                            double d10 = g0Var.d;
                            h0.Companion.getClass();
                            strA4 = d0.a(d10);
                        } else {
                            strA4 = null;
                        }
                        if (g0Var != null) {
                            double d15 = g0Var.f225637c;
                            h0.Companion.getClass();
                            strA5 = d0.a(d15);
                        } else {
                            strA5 = null;
                        }
                        if (g0Var != null) {
                            double d41 = g0Var.f225636b;
                            h0.Companion.getClass();
                            strA6 = d0.a(d41);
                        }
                        return advertisingService2.getOutlets(strA, strA2, strA3, strA5, strA6, strA4);
                    case 1:
                        h0 h0Var2 = this.f225617b;
                        e0 params2 = (e0) obj2;
                        mid.p shopsOutlets = (mid.p) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(shopsOutlets, "shopsOutlets");
                        h0Var2.f225641c.d(h0.a(params2), shopsOutlets);
                        return Unit.f186387a;
                    default:
                        h0 h0Var3 = this.f225617b;
                        e0 params3 = (e0) obj2;
                        mid.p shopsOutlets2 = (mid.p) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(shopsOutlets2, "shopsOutlets");
                        String strA7 = h0.a(params3);
                        h0Var3.f225640b.G(shopsOutlets2, strA7, wim.z.d(o0.b(mid.p.class)));
                        synchronized (h0Var3) {
                            try {
                                Collection collection = (List) h0Var3.f225640b.T2("shops_outlets_key_index", h0.e);
                                if (collection == null) {
                                    collection = zhm.f0.f322471a;
                                }
                                ArrayList arrayListF1 = zhm.d0.f1(collection);
                                arrayListF1.remove(strA7);
                                arrayListF1.add(strA7);
                                if (arrayListF1.size() > 10) {
                                    h0Var3.f225640b.I0((String) arrayListF1.remove(0));
                                }
                                ue0.c cVar = h0Var3.f225640b;
                                KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                                KType kTypeB = o0.b(String.class);
                                companion.getClass();
                                cVar.G(arrayListF1, "shops_outlets_key_index", wim.z.d(o0.f186429a.d(o0.c(List.class, KTypeProjection.Companion.a(kTypeB)))));
                            } catch (Throwable th10) {
                                throw th10;
                            }
                        }
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public static String a(e0 e0Var) {
        StringBuilder sb6 = new StringBuilder("shops_outlets");
        f0 f0Var = e0Var.f225627a;
        if (f0Var != null) {
            d0 d0Var = Companion;
            double d = f0Var.f225631a;
            d0Var.getClass();
            sb6.append("_lat=" + d0.a(d) + "_lon=" + d0.a(f0Var.f225632b));
        }
        g0 g0Var = e0Var.f225628b;
        if (g0Var != null) {
            d0 d0Var2 = Companion;
            double d5 = g0Var.f225635a;
            d0Var2.getClass();
            sb6.append(j6.a.w(v0.a.m("_bounds[brLat=", d0.a(d5), ",tlLat=", d0.a(g0Var.f225637c), ",tlLong="), d0.a(g0Var.f225636b), ",brLong=", d0.a(g0Var.d), "]"));
        }
        return sb6.toString();
    }

    @Override // od0.e
    public final void clear() {
        this.f225641c.i(-1);
        Type type = e;
        ue0.c cVar = this.f225640b;
        Iterable iterable = (List) cVar.T2("shops_outlets_key_index", type);
        if (iterable == null) {
            iterable = zhm.f0.f322471a;
        }
        Iterator it8 = iterable.iterator();
        while (it8.hasNext()) {
            cVar.I0((String) it8.next());
        }
        cVar.I0("shops_outlets_key_index");
    }
}
