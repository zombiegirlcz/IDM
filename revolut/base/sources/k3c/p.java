package k3c;

import com.revolut.feature.revolut_shop.data.service.IppShopService;
import d3c.b0;
import d3c.h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k37.s;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements e3c.a {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Regex f180679h = new Regex("filename=\"(.*)\"");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IppShopService f180680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f180681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f180682c;
    public final x4l.c d;
    public final x4l.c e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f180683g;

    public p(IppShopService ippShopService, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(ippShopService, "ippShopService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f180680a = ippShopService;
        this.f180681b = memoryCache;
        final int i = 0;
        Continuation continuation = null;
        k kVar = new k(this, continuation, i);
        Function1 function1 = new Function1(this) { // from class: k3c.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f180662b;

            {
                this.f180662b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f180662b.f180681b.get("PRODUCTS_V2_MEMORY_KEY");
                    case 1:
                        String productType = (String) obj2;
                        Intrinsics.checkNotNullParameter(productType, "productType");
                        ne0.j jVar = this.f180662b.f180681b;
                        String str = String.format("PRODUCT_VARIANT_MEMORY_KEY_%s", Arrays.copyOf(new Object[]{productType}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        return (od0.i) jVar.get(str);
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (b0) this.f180662b.f180681b.get("USER_CART_MEMORY_KEY");
                    default:
                        String it10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (d3c.h) hx7.q.p(this.f180662b.f180681b, new fkg.a(it10));
                }
            }
        };
        final int i2 = 1;
        int i3 = 2;
        int i5 = 3;
        this.f180682c = new x4l.c(kVar, function1, new Function2(this) { // from class: k3c.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f180660b;

            {
                this.f180660b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        h0 page = (h0) obj3;
                        Intrinsics.checkNotNullParameter((f) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(page, "page");
                        for (d3c.h hVar : page.f111032c) {
                            hx7.q.U(this.f180660b.f180681b, new fkg.a(hVar.f111018a), hVar);
                        }
                        break;
                    case 1:
                        List<d3c.p> products = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(products, "products");
                        ne0.j jVar = this.f180660b.f180681b;
                        jVar.f("PRODUCTS_V2_MEMORY_KEY", products);
                        for (d3c.p pVar : products) {
                            String f84197a = pVar.f111052a.getF84197a();
                            od0.i.Companion.getClass();
                            jVar.f(a0.d.v(new Object[]{f84197a}, 1, "PRODUCT_VARIANT_MEMORY_KEY_%s", "format(...)"), od0.h.a(pVar));
                        }
                        break;
                    case 2:
                        String productType = (String) obj2;
                        od0.i data = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(productType, "productType");
                        Intrinsics.checkNotNullParameter(data, "data");
                        ne0.j jVar2 = this.f180660b.f180681b;
                        jVar2.f(a0.d.v(new Object[]{productType}, 1, "PRODUCT_VARIANT_MEMORY_KEY_%s", "format(...)"), data);
                        List list = (List) jVar2.get("PRODUCTS_V2_MEMORY_KEY");
                        if (list != null && data.d()) {
                            Object objC = data.c();
                            int size = list.size();
                            ArrayList arrayListF1 = d0.f1(list);
                            Iterator it8 = arrayListF1.iterator();
                            int i6 = 0;
                            while (true) {
                                if (!it8.hasNext()) {
                                    i6 = -1;
                                } else if (!Intrinsics.f(((d3c.p) it8.next()).f111052a.getF84197a(), productType)) {
                                    i6++;
                                }
                            }
                            if (i6 >= 0) {
                                arrayListF1.set(i6, objC);
                            } else {
                                arrayListF1.add(size, objC);
                            }
                            jVar2.f("PRODUCTS_V2_MEMORY_KEY", arrayListF1);
                        }
                        break;
                    case 3:
                        b0 userCart = (b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(userCart, "userCart");
                        this.f180660b.f180681b.f("USER_CART_MEMORY_KEY", userCart);
                        break;
                    default:
                        d3c.h order = (d3c.h) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(order, "order");
                        hx7.q.U(this.f180660b.f180681b, new fkg.a(order.f111018a), order);
                        break;
                }
                return Unit.f186387a;
            }
        }, new iz1.g(i3, 7, continuation), new l(i5, 0, continuation));
        jy6.l lVar = new jy6.l(this, continuation, 6);
        final int i6 = 1;
        Function1 function12 = new Function1(this) { // from class: k3c.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f180662b;

            {
                this.f180662b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i6) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f180662b.f180681b.get("PRODUCTS_V2_MEMORY_KEY");
                    case 1:
                        String productType = (String) obj2;
                        Intrinsics.checkNotNullParameter(productType, "productType");
                        ne0.j jVar = this.f180662b.f180681b;
                        String str = String.format("PRODUCT_VARIANT_MEMORY_KEY_%s", Arrays.copyOf(new Object[]{productType}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        return (od0.i) jVar.get(str);
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (b0) this.f180662b.f180681b.get("USER_CART_MEMORY_KEY");
                    default:
                        String it10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (d3c.h) hx7.q.p(this.f180662b.f180681b, new fkg.a(it10));
                }
            }
        };
        final int i21 = 2;
        this.d = new x4l.c(lVar, function12, new Function2(this) { // from class: k3c.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f180660b;

            {
                this.f180660b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        h0 page = (h0) obj3;
                        Intrinsics.checkNotNullParameter((f) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(page, "page");
                        for (d3c.h hVar : page.f111032c) {
                            hx7.q.U(this.f180660b.f180681b, new fkg.a(hVar.f111018a), hVar);
                        }
                        break;
                    case 1:
                        List<d3c.p> products = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(products, "products");
                        ne0.j jVar = this.f180660b.f180681b;
                        jVar.f("PRODUCTS_V2_MEMORY_KEY", products);
                        for (d3c.p pVar : products) {
                            String f84197a = pVar.f111052a.getF84197a();
                            od0.i.Companion.getClass();
                            jVar.f(a0.d.v(new Object[]{f84197a}, 1, "PRODUCT_VARIANT_MEMORY_KEY_%s", "format(...)"), od0.h.a(pVar));
                        }
                        break;
                    case 2:
                        String productType = (String) obj2;
                        od0.i data = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(productType, "productType");
                        Intrinsics.checkNotNullParameter(data, "data");
                        ne0.j jVar2 = this.f180660b.f180681b;
                        jVar2.f(a0.d.v(new Object[]{productType}, 1, "PRODUCT_VARIANT_MEMORY_KEY_%s", "format(...)"), data);
                        List list = (List) jVar2.get("PRODUCTS_V2_MEMORY_KEY");
                        if (list != null && data.d()) {
                            Object objC = data.c();
                            int size = list.size();
                            ArrayList arrayListF1 = d0.f1(list);
                            Iterator it8 = arrayListF1.iterator();
                            int i66 = 0;
                            while (true) {
                                if (!it8.hasNext()) {
                                    i66 = -1;
                                } else if (!Intrinsics.f(((d3c.p) it8.next()).f111052a.getF84197a(), productType)) {
                                    i66++;
                                }
                            }
                            if (i66 >= 0) {
                                arrayListF1.set(i66, objC);
                            } else {
                                arrayListF1.add(size, objC);
                            }
                            jVar2.f("PRODUCTS_V2_MEMORY_KEY", arrayListF1);
                        }
                        break;
                    case 3:
                        b0 userCart = (b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(userCart, "userCart");
                        this.f180660b.f180681b.f("USER_CART_MEMORY_KEY", userCart);
                        break;
                    default:
                        d3c.h order = (d3c.h) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(order, "order");
                        hx7.q.U(this.f180660b.f180681b, new fkg.a(order.f111018a), order);
                        break;
                }
                return Unit.f186387a;
            }
        }, new iz1.g(i3, 6, continuation), new eci.a(i5, 29, continuation));
        o oVar = new o(this, null);
        final int i22 = 2;
        Function1 function13 = new Function1(this) { // from class: k3c.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f180662b;

            {
                this.f180662b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i22) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f180662b.f180681b.get("PRODUCTS_V2_MEMORY_KEY");
                    case 1:
                        String productType = (String) obj2;
                        Intrinsics.checkNotNullParameter(productType, "productType");
                        ne0.j jVar = this.f180662b.f180681b;
                        String str = String.format("PRODUCT_VARIANT_MEMORY_KEY_%s", Arrays.copyOf(new Object[]{productType}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        return (od0.i) jVar.get(str);
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (b0) this.f180662b.f180681b.get("USER_CART_MEMORY_KEY");
                    default:
                        String it10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (d3c.h) hx7.q.p(this.f180662b.f180681b, new fkg.a(it10));
                }
            }
        };
        final int i32 = 3;
        this.e = new x4l.c(oVar, function13, new Function2(this) { // from class: k3c.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f180660b;

            {
                this.f180660b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        h0 page = (h0) obj3;
                        Intrinsics.checkNotNullParameter((f) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(page, "page");
                        for (d3c.h hVar : page.f111032c) {
                            hx7.q.U(this.f180660b.f180681b, new fkg.a(hVar.f111018a), hVar);
                        }
                        break;
                    case 1:
                        List<d3c.p> products = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(products, "products");
                        ne0.j jVar = this.f180660b.f180681b;
                        jVar.f("PRODUCTS_V2_MEMORY_KEY", products);
                        for (d3c.p pVar : products) {
                            String f84197a = pVar.f111052a.getF84197a();
                            od0.i.Companion.getClass();
                            jVar.f(a0.d.v(new Object[]{f84197a}, 1, "PRODUCT_VARIANT_MEMORY_KEY_%s", "format(...)"), od0.h.a(pVar));
                        }
                        break;
                    case 2:
                        String productType = (String) obj2;
                        od0.i data = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(productType, "productType");
                        Intrinsics.checkNotNullParameter(data, "data");
                        ne0.j jVar2 = this.f180660b.f180681b;
                        jVar2.f(a0.d.v(new Object[]{productType}, 1, "PRODUCT_VARIANT_MEMORY_KEY_%s", "format(...)"), data);
                        List list = (List) jVar2.get("PRODUCTS_V2_MEMORY_KEY");
                        if (list != null && data.d()) {
                            Object objC = data.c();
                            int size = list.size();
                            ArrayList arrayListF1 = d0.f1(list);
                            Iterator it8 = arrayListF1.iterator();
                            int i66 = 0;
                            while (true) {
                                if (!it8.hasNext()) {
                                    i66 = -1;
                                } else if (!Intrinsics.f(((d3c.p) it8.next()).f111052a.getF84197a(), productType)) {
                                    i66++;
                                }
                            }
                            if (i66 >= 0) {
                                arrayListF1.set(i66, objC);
                            } else {
                                arrayListF1.add(size, objC);
                            }
                            jVar2.f("PRODUCTS_V2_MEMORY_KEY", arrayListF1);
                        }
                        break;
                    case 3:
                        b0 userCart = (b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(userCart, "userCart");
                        this.f180660b.f180681b.f("USER_CART_MEMORY_KEY", userCart);
                        break;
                    default:
                        d3c.h order = (d3c.h) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(order, "order");
                        hx7.q.U(this.f180660b.f180681b, new fkg.a(order.f111018a), order);
                        break;
                }
                return Unit.f186387a;
            }
        }, new iz1.g(i3, 8, continuation), new l(i5, 1, continuation));
        ghl.l lVar2 = new ghl.l(this, continuation, 28);
        final int i33 = 3;
        Function1 function14 = new Function1(this) { // from class: k3c.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f180662b;

            {
                this.f180662b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i33) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f180662b.f180681b.get("PRODUCTS_V2_MEMORY_KEY");
                    case 1:
                        String productType = (String) obj2;
                        Intrinsics.checkNotNullParameter(productType, "productType");
                        ne0.j jVar = this.f180662b.f180681b;
                        String str = String.format("PRODUCT_VARIANT_MEMORY_KEY_%s", Arrays.copyOf(new Object[]{productType}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        return (od0.i) jVar.get(str);
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (b0) this.f180662b.f180681b.get("USER_CART_MEMORY_KEY");
                    default:
                        String it10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (d3c.h) hx7.q.p(this.f180662b.f180681b, new fkg.a(it10));
                }
            }
        };
        final int i43 = 4;
        this.f = new x4l.c(lVar2, function14, new Function2(this) { // from class: k3c.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f180660b;

            {
                this.f180660b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i43) {
                    case 0:
                        h0 page = (h0) obj3;
                        Intrinsics.checkNotNullParameter((f) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(page, "page");
                        for (d3c.h hVar : page.f111032c) {
                            hx7.q.U(this.f180660b.f180681b, new fkg.a(hVar.f111018a), hVar);
                        }
                        break;
                    case 1:
                        List<d3c.p> products = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(products, "products");
                        ne0.j jVar = this.f180660b.f180681b;
                        jVar.f("PRODUCTS_V2_MEMORY_KEY", products);
                        for (d3c.p pVar : products) {
                            String f84197a = pVar.f111052a.getF84197a();
                            od0.i.Companion.getClass();
                            jVar.f(a0.d.v(new Object[]{f84197a}, 1, "PRODUCT_VARIANT_MEMORY_KEY_%s", "format(...)"), od0.h.a(pVar));
                        }
                        break;
                    case 2:
                        String productType = (String) obj2;
                        od0.i data = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(productType, "productType");
                        Intrinsics.checkNotNullParameter(data, "data");
                        ne0.j jVar2 = this.f180660b.f180681b;
                        jVar2.f(a0.d.v(new Object[]{productType}, 1, "PRODUCT_VARIANT_MEMORY_KEY_%s", "format(...)"), data);
                        List list = (List) jVar2.get("PRODUCTS_V2_MEMORY_KEY");
                        if (list != null && data.d()) {
                            Object objC = data.c();
                            int size = list.size();
                            ArrayList arrayListF1 = d0.f1(list);
                            Iterator it8 = arrayListF1.iterator();
                            int i66 = 0;
                            while (true) {
                                if (!it8.hasNext()) {
                                    i66 = -1;
                                } else if (!Intrinsics.f(((d3c.p) it8.next()).f111052a.getF84197a(), productType)) {
                                    i66++;
                                }
                            }
                            if (i66 >= 0) {
                                arrayListF1.set(i66, objC);
                            } else {
                                arrayListF1.add(size, objC);
                            }
                            jVar2.f("PRODUCTS_V2_MEMORY_KEY", arrayListF1);
                        }
                        break;
                    case 3:
                        b0 userCart = (b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(userCart, "userCart");
                        this.f180660b.f180681b.f("USER_CART_MEMORY_KEY", userCart);
                        break;
                    default:
                        d3c.h order = (d3c.h) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(order, "order");
                        hx7.q.U(this.f180660b.f180681b, new fkg.a(order.f111018a), order);
                        break;
                }
                return Unit.f186387a;
            }
        }, new iz1.g(i3, i43, continuation), new eci.a(i5, 27, continuation));
        final int i59 = 0;
        this.f180683g = new x4l.c(new jy6.l(this, continuation, 5), new s(6), new Function2(this) { // from class: k3c.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f180660b;

            {
                this.f180660b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i59) {
                    case 0:
                        h0 page = (h0) obj3;
                        Intrinsics.checkNotNullParameter((f) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(page, "page");
                        for (d3c.h hVar : page.f111032c) {
                            hx7.q.U(this.f180660b.f180681b, new fkg.a(hVar.f111018a), hVar);
                        }
                        break;
                    case 1:
                        List<d3c.p> products = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(products, "products");
                        ne0.j jVar = this.f180660b.f180681b;
                        jVar.f("PRODUCTS_V2_MEMORY_KEY", products);
                        for (d3c.p pVar : products) {
                            String f84197a = pVar.f111052a.getF84197a();
                            od0.i.Companion.getClass();
                            jVar.f(a0.d.v(new Object[]{f84197a}, 1, "PRODUCT_VARIANT_MEMORY_KEY_%s", "format(...)"), od0.h.a(pVar));
                        }
                        break;
                    case 2:
                        String productType = (String) obj2;
                        od0.i data = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(productType, "productType");
                        Intrinsics.checkNotNullParameter(data, "data");
                        ne0.j jVar2 = this.f180660b.f180681b;
                        jVar2.f(a0.d.v(new Object[]{productType}, 1, "PRODUCT_VARIANT_MEMORY_KEY_%s", "format(...)"), data);
                        List list = (List) jVar2.get("PRODUCTS_V2_MEMORY_KEY");
                        if (list != null && data.d()) {
                            Object objC = data.c();
                            int size = list.size();
                            ArrayList arrayListF1 = d0.f1(list);
                            Iterator it8 = arrayListF1.iterator();
                            int i66 = 0;
                            while (true) {
                                if (!it8.hasNext()) {
                                    i66 = -1;
                                } else if (!Intrinsics.f(((d3c.p) it8.next()).f111052a.getF84197a(), productType)) {
                                    i66++;
                                }
                            }
                            if (i66 >= 0) {
                                arrayListF1.set(i66, objC);
                            } else {
                                arrayListF1.add(size, objC);
                            }
                            jVar2.f("PRODUCTS_V2_MEMORY_KEY", arrayListF1);
                        }
                        break;
                    case 3:
                        b0 userCart = (b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(userCart, "userCart");
                        this.f180660b.f180681b.f("USER_CART_MEMORY_KEY", userCart);
                        break;
                    default:
                        d3c.h order = (d3c.h) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(order, "order");
                        hx7.q.U(this.f180660b.f180681b, new fkg.a(order.f111018a), order);
                        break;
                }
                return Unit.f186387a;
            }
        }, new iz1.g(i3, 5, continuation), new eci.a(i5, 28, continuation));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        if (r12.e.d(r0, true, r6) != r7) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r13, d3c.d0 r14, gim.c r15) {
        /*
            r12 = this;
            boolean r2 = r15 instanceof k3c.g
            if (r2 == 0) goto L14
            r2 = r15
            k3c.g r2 = (k3c.g) r2
            int r3 = r2.f180666y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L14
            int r3 = r3 - r4
            r2.f180666y = r3
        L12:
            r6 = r2
            goto L1a
        L14:
            k3c.g r2 = new k3c.g
            r2.<init>(r12, r15)
            goto L12
        L1a:
            java.lang.Object r0 = r6.f180664w
            fim.a r7 = fim.a.COROUTINE_SUSPENDED
            int r2 = r6.f180666y
            r8 = 3
            r9 = 2
            r10 = 1
            r11 = 0
            if (r2 == 0) goto L45
            if (r2 == r10) goto L3c
            if (r2 == r9) goto L38
            if (r2 != r8) goto L30
            yhm.o.b(r0)
            goto L84
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L38:
            yhm.o.b(r0)
            goto L73
        L3c:
            d3c.d0 r2 = r6.v
            java.lang.String r3 = r6.u
            yhm.o.b(r0)
            r4 = r2
            goto L58
        L45:
            yhm.o.b(r0)
            r6.u = r13
            r6.v = r14
            r6.f180666y = r10
            java.lang.Object r3 = r12.c(r6)
            if (r3 != r7) goto L55
            goto L83
        L55:
            r4 = r14
            r0 = r3
            r3 = r13
        L58:
            r2 = r0
            d3c.b0 r2 = (d3c.b0) r2
            dmf.b r0 = new dmf.b
            r5 = 0
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            r6.u = r11
            r6.v = r11
            r6.f180666y = r9
            java.lang.Object r0 = skm.e0.J(r2, r0, r6)
            if (r0 != r7) goto L73
            goto L83
        L73:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            r6.u = r11
            r6.v = r11
            r6.f180666y = r8
            x4l.c r2 = r12.e
            java.lang.Object r0 = r2.d(r0, r10, r6)
            if (r0 != r7) goto L84
        L83:
            return r7
        L84:
            ne0.j r0 = r12.f180681b
            java.lang.String r2 = "USER_CART_MEMORY_KEY"
            java.lang.Object r0 = r0.get(r2)
            d3c.b0 r0 = (d3c.b0) r0
            if (r0 == 0) goto L91
            return r0
        L91:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "User cart is null"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k3c.p.b(java.lang.String, d3c.d0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof k3c.i
            if (r0 == 0) goto L13
            r0 = r6
            k3c.i r0 = (k3c.i) r0
            int r1 = r0.f180670x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f180670x = r1
            goto L18
        L13:
            k3c.i r0 = new k3c.i
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f180670x
            java.lang.String r3 = "USER_CART_MEMORY_KEY"
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            k3c.p r0 = r0.u
            yhm.o.b(r6)
            goto L50
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            yhm.o.b(r6)
            ne0.j r6 = r5.f180681b
            java.lang.Object r6 = r6.get(r3)
            d3c.b0 r6 = (d3c.b0) r6
            if (r6 != 0) goto L63
            kotlin.Unit r6 = kotlin.Unit.f186387a
            r0.u = r5
            r0.f180670x = r4
            x4l.c r2 = r5.e
            java.lang.Object r6 = r2.d(r6, r4, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            r0 = r5
        L50:
            ne0.j r6 = r0.f180681b
            java.lang.Object r6 = r6.get(r3)
            d3c.b0 r6 = (d3c.b0) r6
            if (r6 == 0) goto L5b
            return r6
        L5b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "User cart is null"
            r6.<init>(r0)
            throw r6
        L63:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k3c.p.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (skm.e0.J(r11, r4, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof k3c.m
            if (r0 == 0) goto L13
            r0 = r12
            k3c.m r0 = (k3c.m) r0
            int r1 = r0.f180674x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f180674x = r1
            goto L18
        L13:
            k3c.m r0 = new k3c.m
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f180674x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r12)
            goto L9d
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            java.lang.String r11 = r0.u
            yhm.o.b(r12)
        L38:
            r8 = r11
            goto L48
        L3a:
            yhm.o.b(r12)
            r0.u = r11
            r0.f180674x = r4
            java.lang.Object r12 = r10.c(r0)
            if (r12 != r1) goto L38
            goto L9c
        L48:
            r7 = r12
            d3c.b0 r7 = (d3c.b0) r7
            java.util.ArrayList r11 = r7.f110997h
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r11 = r11.iterator()
        L56:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r11.next()
            r4 = r2
            d3c.c0 r4 = (d3c.c0) r4
            java.lang.String r4 = r4.f111003a
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r4, r8)
            if (r4 != 0) goto L56
            r12.add(r2)
            goto L56
        L6f:
            d3c.b0 r11 = d3c.b0.a(r7, r12)
            ne0.j r12 = r10.f180681b
            java.lang.String r2 = "USER_CART_MEMORY_KEY"
            r12.f(r2, r11)
            k37.s r11 = new k37.s
            r12 = 5
            r11.<init>(r12)
            x4l.c r12 = r10.e
            x4l.c.a(r12, r11)
            aie.v r4 = new aie.v
            r5 = 9
            r9 = 0
            r6 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            r0.u = r9
            r0.f180674x = r3
            java.lang.Object r11 = skm.e0.J(r11, r4, r0)
            if (r11 != r1) goto L9d
        L9c:
            return r1
        L9d:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: k3c.p.d(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r28, long r29, gim.c r31) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k3c.p.e(java.lang.String, long, gim.c):java.lang.Object");
    }
}
