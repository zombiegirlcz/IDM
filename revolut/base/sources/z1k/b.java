package z1k;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f318853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f318854c;
    public final TextLocalisedClause d;
    public final dj0.d e;
    public final boolean f;

    public b(String name, String logo, dj0.d senderAmount, TextLocalisedClause planName, dj0.d planFee, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(senderAmount, "senderAmount");
        Intrinsics.checkNotNullParameter(planName, "planName");
        Intrinsics.checkNotNullParameter(planFee, "planFee");
        this.f318852a = name;
        this.f318853b = logo;
        this.f318854c = senderAmount;
        this.d = planName;
        this.e = planFee;
        this.f = z;
    }

    @Override // z1k.c
    public final dj0.d a() {
        return this.f318854c;
    }

    @Override // z1k.c
    public final boolean b() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f318852a, bVar.f318852a) && Intrinsics.f(this.f318853b, bVar.f318853b) && this.f318854c.equals(bVar.f318854c) && this.d.equals(bVar.d) && this.e.equals(bVar.e) && this.f == bVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + v7.c(t61.a.a(v7.c(p.a.c(this.f318852a.hashCode() * 31, 31, this.f318853b), 31, this.f318854c), 31, this.d), 31, this.e);
    }
}
