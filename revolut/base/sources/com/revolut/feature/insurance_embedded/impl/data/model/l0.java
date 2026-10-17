package com.revolut.feature.insurance_embedded.impl.data.model;

import gu7.f1;
import gu7.l2;
import gu7.m2;
import gu7.r1;
import gu7.v1;
import gu7.w2;
import gu7.z2;
import gu7.z3;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class l0 {

    @NotNull
    public static final m2 Companion = new m2();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Lazy[] f76005p = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new v1(3)), null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z3 f76007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l2 f76008c;
    public final gu7.m0 d;
    public final j e;
    public final OrderCardWidget f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ActivateCoverageWidget f76009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gu7.s f76010h;
    public final r1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Promotion f76011j;
    public final PricingPlanBanner k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final GenericBanner f76012l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w2 f76013m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z2 f76014n;
    public final f1 o;

    public /* synthetic */ l0(int i, String str, z3 z3Var, l2 l2Var, gu7.m0 m0Var, j jVar, OrderCardWidget orderCardWidget, ActivateCoverageWidget activateCoverageWidget, gu7.s sVar, r1 r1Var, Promotion promotion, PricingPlanBanner pricingPlanBanner, GenericBanner genericBanner, w2 w2Var, z2 z2Var, f1 f1Var) {
        if (32767 != (i & 32767)) {
            j1.f(k0.f76002a.getDescriptor(), i, 32767);
            throw null;
        }
        this.f76006a = str;
        this.f76007b = z3Var;
        this.f76008c = l2Var;
        this.d = m0Var;
        this.e = jVar;
        this.f = orderCardWidget;
        this.f76009g = activateCoverageWidget;
        this.f76010h = sVar;
        this.i = r1Var;
        this.f76011j = promotion;
        this.k = pricingPlanBanner;
        this.f76012l = genericBanner;
        this.f76013m = w2Var;
        this.f76014n = z2Var;
        this.o = f1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f76006a, l0Var.f76006a) && Intrinsics.f(this.f76007b, l0Var.f76007b) && Intrinsics.f(this.f76008c, l0Var.f76008c) && Intrinsics.f(this.d, l0Var.d) && Intrinsics.f(this.e, l0Var.e) && Intrinsics.f(this.f, l0Var.f) && Intrinsics.f(this.f76009g, l0Var.f76009g) && Intrinsics.f(this.f76010h, l0Var.f76010h) && Intrinsics.f(this.i, l0Var.i) && Intrinsics.f(this.f76011j, l0Var.f76011j) && Intrinsics.f(this.k, l0Var.k) && Intrinsics.f(this.f76012l, l0Var.f76012l) && Intrinsics.f(this.f76013m, l0Var.f76013m) && Intrinsics.f(this.f76014n, l0Var.f76014n) && Intrinsics.f(this.o, l0Var.o);
    }

    public final int hashCode() {
        int iHashCode = (this.f76007b.hashCode() + (this.f76006a.hashCode() * 31)) * 31;
        l2 l2Var = this.f76008c;
        int iHashCode2 = (iHashCode + (l2Var == null ? 0 : l2Var.hashCode())) * 31;
        gu7.m0 m0Var = this.d;
        int iHashCode3 = (iHashCode2 + (m0Var == null ? 0 : m0Var.hashCode())) * 31;
        j jVar = this.e;
        int iHashCode4 = (iHashCode3 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        OrderCardWidget orderCardWidget = this.f;
        int iHashCode5 = (iHashCode4 + (orderCardWidget == null ? 0 : orderCardWidget.hashCode())) * 31;
        ActivateCoverageWidget activateCoverageWidget = this.f76009g;
        int iHashCode6 = (iHashCode5 + (activateCoverageWidget == null ? 0 : activateCoverageWidget.hashCode())) * 31;
        gu7.s sVar = this.f76010h;
        int iHashCode7 = (iHashCode6 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        r1 r1Var = this.i;
        int iHashCode8 = (iHashCode7 + (r1Var == null ? 0 : r1Var.hashCode())) * 31;
        Promotion promotion = this.f76011j;
        int iHashCode9 = (iHashCode8 + (promotion == null ? 0 : promotion.hashCode())) * 31;
        PricingPlanBanner pricingPlanBanner = this.k;
        int iHashCode10 = (iHashCode9 + (pricingPlanBanner == null ? 0 : pricingPlanBanner.hashCode())) * 31;
        GenericBanner genericBanner = this.f76012l;
        int iHashCode11 = (iHashCode10 + (genericBanner == null ? 0 : genericBanner.hashCode())) * 31;
        w2 w2Var = this.f76013m;
        int iHashCode12 = (iHashCode11 + (w2Var == null ? 0 : w2Var.hashCode())) * 31;
        z2 z2Var = this.f76014n;
        int iHashCode13 = (iHashCode12 + (z2Var == null ? 0 : z2Var.hashCode())) * 31;
        f1 f1Var = this.o;
        return iHashCode13 + (f1Var != null ? f1Var.hashCode() : 0);
    }

    public l0(String product, z3 header, l2 l2Var, gu7.m0 m0Var, j jVar, OrderCardWidget orderCardWidget, ActivateCoverageWidget activateCoverageWidget, gu7.s sVar, r1 r1Var, Promotion promotion, PricingPlanBanner pricingPlanBanner, GenericBanner genericBanner, w2 w2Var, z2 z2Var, f1 f1Var) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f76006a = product;
        this.f76007b = header;
        this.f76008c = l2Var;
        this.d = m0Var;
        this.e = jVar;
        this.f = orderCardWidget;
        this.f76009g = activateCoverageWidget;
        this.f76010h = sVar;
        this.i = r1Var;
        this.f76011j = promotion;
        this.k = pricingPlanBanner;
        this.f76012l = genericBanner;
        this.f76013m = w2Var;
        this.f76014n = z2Var;
        this.o = f1Var;
    }
}
