package jel;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class w2 implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173587c;
    public final String d;
    public final y1 e;
    public final r1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p1 f173588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q1 f173589h;
    public final t1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f173590j;
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w1 f173591l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f173592m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f173593n;
    public final d2 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f173594p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f173595q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l2 f173596r;

    public w2(String symbol, String ref2, String stockExchangeCode, String str, y1 lifecycle, r1 r1Var, p1 p1Var, q1 q1Var, t1 t1Var, ArrayList keyDrivers, ArrayList underlyingAssets, w1 issuer, List mainIndicators, ArrayList payoutScenariosTabs, d2 d2Var, ArrayList performanceTrackers, z1 z1Var, l2 l2Var) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(stockExchangeCode, "stockExchangeCode");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(keyDrivers, "keyDrivers");
        Intrinsics.checkNotNullParameter(underlyingAssets, "underlyingAssets");
        Intrinsics.checkNotNullParameter(issuer, "issuer");
        Intrinsics.checkNotNullParameter(mainIndicators, "mainIndicators");
        Intrinsics.checkNotNullParameter(payoutScenariosTabs, "payoutScenariosTabs");
        Intrinsics.checkNotNullParameter(performanceTrackers, "performanceTrackers");
        this.f173585a = symbol;
        this.f173586b = ref2;
        this.f173587c = stockExchangeCode;
        this.d = str;
        this.e = lifecycle;
        this.f = r1Var;
        this.f173588g = p1Var;
        this.f173589h = q1Var;
        this.i = t1Var;
        this.f173590j = keyDrivers;
        this.k = underlyingAssets;
        this.f173591l = issuer;
        this.f173592m = mainIndicators;
        this.f173593n = payoutScenariosTabs;
        this.o = d2Var;
        this.f173594p = performanceTrackers;
        this.f173595q = z1Var;
        this.f173596r = l2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj2;
        return Intrinsics.f(this.f173585a, w2Var.f173585a) && Intrinsics.f(this.f173586b, w2Var.f173586b) && Intrinsics.f(this.f173587c, w2Var.f173587c) && Intrinsics.f(this.d, w2Var.d) && this.e.equals(w2Var.e) && Intrinsics.f(this.f, w2Var.f) && Intrinsics.f(this.f173588g, w2Var.f173588g) && Intrinsics.f(this.f173589h, w2Var.f173589h) && Intrinsics.f(this.i, w2Var.i) && this.f173590j.equals(w2Var.f173590j) && this.k.equals(w2Var.k) && this.f173591l.equals(w2Var.f173591l) && Intrinsics.f(this.f173592m, w2Var.f173592m) && this.f173593n.equals(w2Var.f173593n) && Intrinsics.f(this.o, w2Var.o) && this.f173594p.equals(w2Var.f173594p) && Intrinsics.f(this.f173595q, w2Var.f173595q) && Intrinsics.f(this.f173596r, w2Var.f173596r);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f173585a.hashCode() * 31, 31, this.f173586b), 31, this.f173587c);
        String str = this.d;
        int iHashCode = (this.e.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        r1 r1Var = this.f;
        int iHashCode2 = (iHashCode + (r1Var == null ? 0 : r1Var.hashCode())) * 31;
        p1 p1Var = this.f173588g;
        int iHashCode3 = (iHashCode2 + (p1Var == null ? 0 : p1Var.hashCode())) * 31;
        q1 q1Var = this.f173589h;
        int iHashCode4 = (iHashCode3 + (q1Var == null ? 0 : q1Var.hashCode())) * 31;
        t1 t1Var = this.i;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f173593n, p.a.d((this.f173591l.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.k, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f173590j, (iHashCode4 + (t1Var == null ? 0 : t1Var.hashCode())) * 31, 31), 31)) * 31, 31, this.f173592m), 31);
        d2 d2Var = this.o;
        int iB2 = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f173594p, (iB + (d2Var == null ? 0 : d2Var.hashCode())) * 31, 31);
        z1 z1Var = this.f173595q;
        int iHashCode5 = (iB2 + (z1Var == null ? 0 : z1Var.hashCode())) * 31;
        l2 l2Var = this.f173596r;
        return iHashCode5 + (l2Var != null ? l2Var.hashCode() : 0);
    }

    @Override // jel.c
    public final String i() {
        return this.f173586b;
    }
}
