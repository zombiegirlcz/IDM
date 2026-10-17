package svi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f266002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1 f266003b;

    public u1(s1 homePage, t1 howToAccessPage) {
        Intrinsics.checkNotNullParameter(homePage, "homePage");
        Intrinsics.checkNotNullParameter(howToAccessPage, "howToAccessPage");
        this.f266002a = homePage;
        this.f266003b = howToAccessPage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj2;
        return Intrinsics.f(this.f266002a, u1Var.f266002a) && Intrinsics.f(this.f266003b, u1Var.f266003b);
    }

    public final int hashCode() {
        return this.f266003b.hashCode() + (this.f266002a.hashCode() * 31);
    }
}
