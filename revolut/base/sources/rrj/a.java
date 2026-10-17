package rrj;

import kotlin.jvm.internal.Intrinsics;
import tof.i3;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f256845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qzi.a f256846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i3 f256847c;

    public a(dj0.d spentAmount, qzi.a categoryBudget, i3 category) {
        Intrinsics.checkNotNullParameter(spentAmount, "spentAmount");
        Intrinsics.checkNotNullParameter(categoryBudget, "categoryBudget");
        Intrinsics.checkNotNullParameter(category, "category");
        this.f256845a = spentAmount;
        this.f256846b = categoryBudget;
        this.f256847c = category;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f256845a, aVar.f256845a) && Intrinsics.f(this.f256846b, aVar.f256846b) && Intrinsics.f(this.f256847c, aVar.f256847c);
    }

    public final int hashCode() {
        return this.f256847c.hashCode() + ((this.f256846b.hashCode() + (this.f256845a.hashCode() * 31)) * 31);
    }
}
