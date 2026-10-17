package qjk;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f246898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundType f246899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f246900c;

    public d(lw0.a aVar, AnimatedBackgroundType animatedBackgroundType, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f246898a = aVar;
        this.f246899b = animatedBackgroundType;
        this.f246900c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f246900c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f246898a, dVar.f246898a) && Intrinsics.f(this.f246899b, dVar.f246899b) && Intrinsics.f(this.f246900c, dVar.f246900c);
    }

    public final int hashCode() {
        lw0.a aVar = this.f246898a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        AnimatedBackgroundType animatedBackgroundType = this.f246899b;
        return this.f246900c.hashCode() + ((iHashCode + (animatedBackgroundType != null ? animatedBackgroundType.hashCode() : 0)) * 31);
    }
}
