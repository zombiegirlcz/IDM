package kf1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f183271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f183272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f183273c;

    public f(l shopify, n wooCommerce, h prestaShop) {
        Intrinsics.checkNotNullParameter(shopify, "shopify");
        Intrinsics.checkNotNullParameter(wooCommerce, "wooCommerce");
        Intrinsics.checkNotNullParameter(prestaShop, "prestaShop");
        this.f183271a = shopify;
        this.f183272b = wooCommerce;
        this.f183273c = prestaShop;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f183271a, fVar.f183271a) && Intrinsics.f(this.f183272b, fVar.f183272b) && Intrinsics.f(this.f183273c, fVar.f183273c);
    }

    public final int hashCode() {
        return this.f183273c.hashCode() + ((this.f183272b.hashCode() + (this.f183271a.hashCode() * 31)) * 31);
    }
}
