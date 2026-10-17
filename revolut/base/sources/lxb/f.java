package lxb;

import com.revolut.feature.rev_points.impl.data.network.RevPointsProductEligibilityService;
import efm.d0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import m1c.f1;
import m1c.g1;
import m1c.h1;
import m1c.o0;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import ufm.i;
import vxb.v;
import wim.z;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsProductEligibilityService f200547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f200548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f200549c;
    public final w4l.f d;
    public final w4l.f e;

    public f(RevPointsProductEligibilityService revPointsProductEligibilityService, ue0.c storage, j memoryCache) {
        Intrinsics.checkNotNullParameter(revPointsProductEligibilityService, "revPointsProductEligibilityService");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f200547a = revPointsProductEligibilityService;
        this.f200548b = storage;
        this.f200549c = memoryCache;
        final int i = 3;
        Function2 function2 = new Function2(this) { // from class: lxb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f200540b;

            {
                this.f200540b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                int i3 = 1;
                f fVar = this.f200540b;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        e request = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        RevPointsProductEligibilityService revPointsProductEligibilityService2 = fVar.f200547a;
                        String str = request.f200545a.f152288b;
                        o0 o0Var = request.f200546b;
                        d0<ixb.a> productEligibilities = revPointsProductEligibilityService2.getProductEligibilities(str, o0Var != null ? u1.g(o0Var, gxb.b.f147743a) : null);
                        c cVar = new c(0, new lv9.c(15));
                        productEligibilities.getClass();
                        i iVar = new i(productEligibilities, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        e request2 = (e) obj2;
                        g1 eligibilities = (g1) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(eligibilities, "eligibilities");
                        fVar.f200549c.f(request2.a(), eligibilities);
                        break;
                    case 2:
                        e request3 = (e) obj2;
                        g1 eligibilities2 = (g1) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(eligibilities2, "eligibilities");
                        ue0.c cVar2 = fVar.f200548b;
                        String strA = request3.a();
                        Object obj4 = gxb.c.f147744a;
                        Intrinsics.checkNotNullParameter(eligibilities2, "<this>");
                        ArrayList<h1> arrayList = eligibilities2.f201366a;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (h1 h1Var : arrayList) {
                            Intrinsics.checkNotNullParameter(h1Var, "<this>");
                            arrayList2.add(new vxb.w(h1Var.f201375a.name(), h1Var.f201376b, h1Var.f201377c));
                        }
                        cVar2.G(new v(u1.h(eligibilities2.f201367b, gxb.c.f147744a), arrayList2, eligibilities2.f201368c), strA, z.d(kotlin.jvm.internal.o0.b(v.class)));
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        f1 product = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(product, "product");
                        d0<ixb.b> productEligibility = fVar.f200547a.getProductEligibility(product.name());
                        c cVar3 = new c(i3, new lv9.c(16));
                        productEligibility.getClass();
                        i iVar2 = new i(productEligibility, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 4:
                        f1 product2 = (f1) obj2;
                        h1 eligibility = (h1) obj3;
                        Intrinsics.checkNotNullParameter(product2, "product");
                        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
                        fVar.f200549c.f(f.a(product2), eligibility);
                        break;
                    default:
                        f1 product3 = (f1) obj2;
                        h1 eligibility2 = (h1) obj3;
                        Intrinsics.checkNotNullParameter(product3, "product");
                        Intrinsics.checkNotNullParameter(eligibility2, "eligibility");
                        ue0.c cVar4 = fVar.f200548b;
                        String strA2 = f.a(product3);
                        Intrinsics.checkNotNullParameter(eligibility2, "<this>");
                        cVar4.G(new vxb.w(eligibility2.f201375a.name(), eligibility2.f201376b, eligibility2.f201377c), strA2, z.d(kotlin.jvm.internal.o0.b(vxb.w.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        b bVar = new b(this, i);
        final int i2 = 4;
        Function2 function22 = new Function2(this) { // from class: lxb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f200540b;

            {
                this.f200540b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i2;
                int i3 = 1;
                f fVar = this.f200540b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        e request = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        RevPointsProductEligibilityService revPointsProductEligibilityService2 = fVar.f200547a;
                        String str = request.f200545a.f152288b;
                        o0 o0Var = request.f200546b;
                        d0<ixb.a> productEligibilities = revPointsProductEligibilityService2.getProductEligibilities(str, o0Var != null ? u1.g(o0Var, gxb.b.f147743a) : null);
                        c cVar = new c(0, new lv9.c(15));
                        productEligibilities.getClass();
                        i iVar = new i(productEligibilities, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        e request2 = (e) obj2;
                        g1 eligibilities = (g1) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(eligibilities, "eligibilities");
                        fVar.f200549c.f(request2.a(), eligibilities);
                        break;
                    case 2:
                        e request3 = (e) obj2;
                        g1 eligibilities2 = (g1) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(eligibilities2, "eligibilities");
                        ue0.c cVar2 = fVar.f200548b;
                        String strA = request3.a();
                        Object obj4 = gxb.c.f147744a;
                        Intrinsics.checkNotNullParameter(eligibilities2, "<this>");
                        ArrayList<h1> arrayList = eligibilities2.f201366a;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (h1 h1Var : arrayList) {
                            Intrinsics.checkNotNullParameter(h1Var, "<this>");
                            arrayList2.add(new vxb.w(h1Var.f201375a.name(), h1Var.f201376b, h1Var.f201377c));
                        }
                        cVar2.G(new v(u1.h(eligibilities2.f201367b, gxb.c.f147744a), arrayList2, eligibilities2.f201368c), strA, z.d(kotlin.jvm.internal.o0.b(v.class)));
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        f1 product = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(product, "product");
                        d0<ixb.b> productEligibility = fVar.f200547a.getProductEligibility(product.name());
                        c cVar3 = new c(i3, new lv9.c(16));
                        productEligibility.getClass();
                        i iVar2 = new i(productEligibility, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 4:
                        f1 product2 = (f1) obj2;
                        h1 eligibility = (h1) obj3;
                        Intrinsics.checkNotNullParameter(product2, "product");
                        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
                        fVar.f200549c.f(f.a(product2), eligibility);
                        break;
                    default:
                        f1 product3 = (f1) obj2;
                        h1 eligibility2 = (h1) obj3;
                        Intrinsics.checkNotNullParameter(product3, "product");
                        Intrinsics.checkNotNullParameter(eligibility2, "eligibility");
                        ue0.c cVar4 = fVar.f200548b;
                        String strA2 = f.a(product3);
                        Intrinsics.checkNotNullParameter(eligibility2, "<this>");
                        cVar4.G(new vxb.w(eligibility2.f201375a.name(), eligibility2.f201376b, eligibility2.f201377c), strA2, z.d(kotlin.jvm.internal.o0.b(vxb.w.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        b bVar2 = new b(this, i2);
        final int i3 = 5;
        this.d = new w4l.f(function2, bVar, function22, bVar2, new Function2(this) { // from class: lxb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f200540b;

            {
                this.f200540b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i3;
                int i32 = 1;
                f fVar = this.f200540b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        e request = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        RevPointsProductEligibilityService revPointsProductEligibilityService2 = fVar.f200547a;
                        String str = request.f200545a.f152288b;
                        o0 o0Var = request.f200546b;
                        d0<ixb.a> productEligibilities = revPointsProductEligibilityService2.getProductEligibilities(str, o0Var != null ? u1.g(o0Var, gxb.b.f147743a) : null);
                        c cVar = new c(0, new lv9.c(15));
                        productEligibilities.getClass();
                        i iVar = new i(productEligibilities, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        e request2 = (e) obj2;
                        g1 eligibilities = (g1) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(eligibilities, "eligibilities");
                        fVar.f200549c.f(request2.a(), eligibilities);
                        break;
                    case 2:
                        e request3 = (e) obj2;
                        g1 eligibilities2 = (g1) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(eligibilities2, "eligibilities");
                        ue0.c cVar2 = fVar.f200548b;
                        String strA = request3.a();
                        Object obj4 = gxb.c.f147744a;
                        Intrinsics.checkNotNullParameter(eligibilities2, "<this>");
                        ArrayList<h1> arrayList = eligibilities2.f201366a;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (h1 h1Var : arrayList) {
                            Intrinsics.checkNotNullParameter(h1Var, "<this>");
                            arrayList2.add(new vxb.w(h1Var.f201375a.name(), h1Var.f201376b, h1Var.f201377c));
                        }
                        cVar2.G(new v(u1.h(eligibilities2.f201367b, gxb.c.f147744a), arrayList2, eligibilities2.f201368c), strA, z.d(kotlin.jvm.internal.o0.b(v.class)));
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        f1 product = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(product, "product");
                        d0<ixb.b> productEligibility = fVar.f200547a.getProductEligibility(product.name());
                        c cVar3 = new c(i32, new lv9.c(16));
                        productEligibility.getClass();
                        i iVar2 = new i(productEligibility, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 4:
                        f1 product2 = (f1) obj2;
                        h1 eligibility = (h1) obj3;
                        Intrinsics.checkNotNullParameter(product2, "product");
                        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
                        fVar.f200549c.f(f.a(product2), eligibility);
                        break;
                    default:
                        f1 product3 = (f1) obj2;
                        h1 eligibility2 = (h1) obj3;
                        Intrinsics.checkNotNullParameter(product3, "product");
                        Intrinsics.checkNotNullParameter(eligibility2, "eligibility");
                        ue0.c cVar4 = fVar.f200548b;
                        String strA2 = f.a(product3);
                        Intrinsics.checkNotNullParameter(eligibility2, "<this>");
                        cVar4.G(new vxb.w(eligibility2.f201375a.name(), eligibility2.f201376b, eligibility2.f201377c), strA2, z.d(kotlin.jvm.internal.o0.b(vxb.w.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 0;
        Function2 function23 = new Function2(this) { // from class: lxb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f200540b;

            {
                this.f200540b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i5;
                int i32 = 1;
                f fVar = this.f200540b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        e request = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        RevPointsProductEligibilityService revPointsProductEligibilityService2 = fVar.f200547a;
                        String str = request.f200545a.f152288b;
                        o0 o0Var = request.f200546b;
                        d0<ixb.a> productEligibilities = revPointsProductEligibilityService2.getProductEligibilities(str, o0Var != null ? u1.g(o0Var, gxb.b.f147743a) : null);
                        c cVar = new c(0, new lv9.c(15));
                        productEligibilities.getClass();
                        i iVar = new i(productEligibilities, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        e request2 = (e) obj2;
                        g1 eligibilities = (g1) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(eligibilities, "eligibilities");
                        fVar.f200549c.f(request2.a(), eligibilities);
                        break;
                    case 2:
                        e request3 = (e) obj2;
                        g1 eligibilities2 = (g1) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(eligibilities2, "eligibilities");
                        ue0.c cVar2 = fVar.f200548b;
                        String strA = request3.a();
                        Object obj4 = gxb.c.f147744a;
                        Intrinsics.checkNotNullParameter(eligibilities2, "<this>");
                        ArrayList<h1> arrayList = eligibilities2.f201366a;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (h1 h1Var : arrayList) {
                            Intrinsics.checkNotNullParameter(h1Var, "<this>");
                            arrayList2.add(new vxb.w(h1Var.f201375a.name(), h1Var.f201376b, h1Var.f201377c));
                        }
                        cVar2.G(new v(u1.h(eligibilities2.f201367b, gxb.c.f147744a), arrayList2, eligibilities2.f201368c), strA, z.d(kotlin.jvm.internal.o0.b(v.class)));
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        f1 product = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(product, "product");
                        d0<ixb.b> productEligibility = fVar.f200547a.getProductEligibility(product.name());
                        c cVar3 = new c(i32, new lv9.c(16));
                        productEligibility.getClass();
                        i iVar2 = new i(productEligibility, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 4:
                        f1 product2 = (f1) obj2;
                        h1 eligibility = (h1) obj3;
                        Intrinsics.checkNotNullParameter(product2, "product");
                        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
                        fVar.f200549c.f(f.a(product2), eligibility);
                        break;
                    default:
                        f1 product3 = (f1) obj2;
                        h1 eligibility2 = (h1) obj3;
                        Intrinsics.checkNotNullParameter(product3, "product");
                        Intrinsics.checkNotNullParameter(eligibility2, "eligibility");
                        ue0.c cVar4 = fVar.f200548b;
                        String strA2 = f.a(product3);
                        Intrinsics.checkNotNullParameter(eligibility2, "<this>");
                        cVar4.G(new vxb.w(eligibility2.f201375a.name(), eligibility2.f201376b, eligibility2.f201377c), strA2, z.d(kotlin.jvm.internal.o0.b(vxb.w.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        b bVar3 = new b(this, i5);
        final int i6 = 1;
        Function2 function24 = new Function2(this) { // from class: lxb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f200540b;

            {
                this.f200540b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i6;
                int i32 = 1;
                f fVar = this.f200540b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        e request = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        RevPointsProductEligibilityService revPointsProductEligibilityService2 = fVar.f200547a;
                        String str = request.f200545a.f152288b;
                        o0 o0Var = request.f200546b;
                        d0<ixb.a> productEligibilities = revPointsProductEligibilityService2.getProductEligibilities(str, o0Var != null ? u1.g(o0Var, gxb.b.f147743a) : null);
                        c cVar = new c(0, new lv9.c(15));
                        productEligibilities.getClass();
                        i iVar = new i(productEligibilities, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        e request2 = (e) obj2;
                        g1 eligibilities = (g1) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(eligibilities, "eligibilities");
                        fVar.f200549c.f(request2.a(), eligibilities);
                        break;
                    case 2:
                        e request3 = (e) obj2;
                        g1 eligibilities2 = (g1) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(eligibilities2, "eligibilities");
                        ue0.c cVar2 = fVar.f200548b;
                        String strA = request3.a();
                        Object obj4 = gxb.c.f147744a;
                        Intrinsics.checkNotNullParameter(eligibilities2, "<this>");
                        ArrayList<h1> arrayList = eligibilities2.f201366a;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (h1 h1Var : arrayList) {
                            Intrinsics.checkNotNullParameter(h1Var, "<this>");
                            arrayList2.add(new vxb.w(h1Var.f201375a.name(), h1Var.f201376b, h1Var.f201377c));
                        }
                        cVar2.G(new v(u1.h(eligibilities2.f201367b, gxb.c.f147744a), arrayList2, eligibilities2.f201368c), strA, z.d(kotlin.jvm.internal.o0.b(v.class)));
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        f1 product = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(product, "product");
                        d0<ixb.b> productEligibility = fVar.f200547a.getProductEligibility(product.name());
                        c cVar3 = new c(i32, new lv9.c(16));
                        productEligibility.getClass();
                        i iVar2 = new i(productEligibility, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 4:
                        f1 product2 = (f1) obj2;
                        h1 eligibility = (h1) obj3;
                        Intrinsics.checkNotNullParameter(product2, "product");
                        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
                        fVar.f200549c.f(f.a(product2), eligibility);
                        break;
                    default:
                        f1 product3 = (f1) obj2;
                        h1 eligibility2 = (h1) obj3;
                        Intrinsics.checkNotNullParameter(product3, "product");
                        Intrinsics.checkNotNullParameter(eligibility2, "eligibility");
                        ue0.c cVar4 = fVar.f200548b;
                        String strA2 = f.a(product3);
                        Intrinsics.checkNotNullParameter(eligibility2, "<this>");
                        cVar4.G(new vxb.w(eligibility2.f201375a.name(), eligibility2.f201376b, eligibility2.f201377c), strA2, z.d(kotlin.jvm.internal.o0.b(vxb.w.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        b bVar4 = new b(this, i6);
        final int i21 = 2;
        this.e = new w4l.f(function23, bVar3, function24, bVar4, new Function2(this) { // from class: lxb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f200540b;

            {
                this.f200540b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i21;
                int i32 = 1;
                f fVar = this.f200540b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        e request = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        RevPointsProductEligibilityService revPointsProductEligibilityService2 = fVar.f200547a;
                        String str = request.f200545a.f152288b;
                        o0 o0Var = request.f200546b;
                        d0<ixb.a> productEligibilities = revPointsProductEligibilityService2.getProductEligibilities(str, o0Var != null ? u1.g(o0Var, gxb.b.f147743a) : null);
                        c cVar = new c(0, new lv9.c(15));
                        productEligibilities.getClass();
                        i iVar = new i(productEligibilities, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        e request2 = (e) obj2;
                        g1 eligibilities = (g1) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(eligibilities, "eligibilities");
                        fVar.f200549c.f(request2.a(), eligibilities);
                        break;
                    case 2:
                        e request3 = (e) obj2;
                        g1 eligibilities2 = (g1) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(eligibilities2, "eligibilities");
                        ue0.c cVar2 = fVar.f200548b;
                        String strA = request3.a();
                        Object obj4 = gxb.c.f147744a;
                        Intrinsics.checkNotNullParameter(eligibilities2, "<this>");
                        ArrayList<h1> arrayList = eligibilities2.f201366a;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (h1 h1Var : arrayList) {
                            Intrinsics.checkNotNullParameter(h1Var, "<this>");
                            arrayList2.add(new vxb.w(h1Var.f201375a.name(), h1Var.f201376b, h1Var.f201377c));
                        }
                        cVar2.G(new v(u1.h(eligibilities2.f201367b, gxb.c.f147744a), arrayList2, eligibilities2.f201368c), strA, z.d(kotlin.jvm.internal.o0.b(v.class)));
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        f1 product = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(product, "product");
                        d0<ixb.b> productEligibility = fVar.f200547a.getProductEligibility(product.name());
                        c cVar3 = new c(i32, new lv9.c(16));
                        productEligibility.getClass();
                        i iVar2 = new i(productEligibility, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 4:
                        f1 product2 = (f1) obj2;
                        h1 eligibility = (h1) obj3;
                        Intrinsics.checkNotNullParameter(product2, "product");
                        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
                        fVar.f200549c.f(f.a(product2), eligibility);
                        break;
                    default:
                        f1 product3 = (f1) obj2;
                        h1 eligibility2 = (h1) obj3;
                        Intrinsics.checkNotNullParameter(product3, "product");
                        Intrinsics.checkNotNullParameter(eligibility2, "eligibility");
                        ue0.c cVar4 = fVar.f200548b;
                        String strA2 = f.a(product3);
                        Intrinsics.checkNotNullParameter(eligibility2, "<this>");
                        cVar4.G(new vxb.w(eligibility2.f201375a.name(), eligibility2.f201376b, eligibility2.f201377c), strA2, z.d(kotlin.jvm.internal.o0.b(vxb.w.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public static String a(f1 f1Var) {
        return j6.a.q("REV_POINTS_PRODUCT_ELIGIBILITY", f1Var.name());
    }
}
