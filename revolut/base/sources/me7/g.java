package me7;

import cli.p;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f204623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundType f204624b;

    public g(f0 items, AnimatedBackgroundType animatedBackgroundType) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f204623a = items;
        this.f204624b = animatedBackgroundType;
    }

    @Override // cli.p
    public final List c() {
        return this.f204623a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f204623a, gVar.f204623a) && Intrinsics.f(this.f204624b, gVar.f204624b);
    }

    public final int hashCode() {
        int iHashCode = this.f204623a.hashCode() * 31;
        AnimatedBackgroundType animatedBackgroundType = this.f204624b;
        return iHashCode + (animatedBackgroundType == null ? 0 : animatedBackgroundType.hashCode());
    }
}
