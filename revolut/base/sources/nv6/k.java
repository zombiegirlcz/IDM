package nv6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rr6.j f219516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rr6.g f219517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rr6.m f219518c;
    public final rr6.n d;
    public final boolean e;
    public final od0.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final whf.p f219519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f219520h;

    public k(rr6.j cashbackInfo, rr6.g boosterInfo, rr6.m currentRate, rr6.n planInfo, boolean z, od0.i highestAvailableRate, whf.p payouts, boolean z3) {
        Intrinsics.checkNotNullParameter(cashbackInfo, "cashbackInfo");
        Intrinsics.checkNotNullParameter(boosterInfo, "boosterInfo");
        Intrinsics.checkNotNullParameter(currentRate, "currentRate");
        Intrinsics.checkNotNullParameter(planInfo, "planInfo");
        Intrinsics.checkNotNullParameter(highestAvailableRate, "highestAvailableRate");
        Intrinsics.checkNotNullParameter(payouts, "payouts");
        this.f219516a = cashbackInfo;
        this.f219517b = boosterInfo;
        this.f219518c = currentRate;
        this.d = planInfo;
        this.e = z;
        this.f = highestAvailableRate;
        this.f219519g = payouts;
        this.f219520h = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f219516a, kVar.f219516a) && Intrinsics.f(this.f219517b, kVar.f219517b) && Intrinsics.f(this.f219518c, kVar.f219518c) && Intrinsics.f(this.d, kVar.d) && this.e == kVar.e && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f219519g, kVar.f219519g) && this.f219520h == kVar.f219520h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f219520h) + ((this.f219519g.hashCode() + r6.b.f(this.f, j6.a.c((this.d.hashCode() + ((this.f219518c.hashCode() + ((this.f219517b.hashCode() + (this.f219516a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e), 31)) * 31);
    }
}
