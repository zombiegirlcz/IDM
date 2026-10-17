package cl4;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f24951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f24952c;

    public k(String defaultRate, i promo, ArrayList promotions) {
        Intrinsics.checkNotNullParameter(defaultRate, "defaultRate");
        Intrinsics.checkNotNullParameter(promo, "promo");
        Intrinsics.checkNotNullParameter(promotions, "promotions");
        this.f24950a = defaultRate;
        this.f24951b = promo;
        this.f24952c = promotions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f24950a, kVar.f24950a) && this.f24951b.equals(kVar.f24951b) && this.f24952c.equals(kVar.f24952c);
    }

    public final int hashCode() {
        return this.f24952c.hashCode() + ((this.f24951b.hashCode() + (this.f24950a.hashCode() * 31)) * 31);
    }
}
