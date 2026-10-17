package ldk;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class x implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f194181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundType f194182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f194183c;

    public x(j header, AnimatedBackgroundType animatedBackgroundType, List items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f194181a = header;
        this.f194182b = animatedBackgroundType;
        this.f194183c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f194183c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f194181a, xVar.f194181a) && Intrinsics.f(this.f194182b, xVar.f194182b) && Intrinsics.f(this.f194183c, xVar.f194183c);
    }

    public final int hashCode() {
        int iHashCode = this.f194181a.hashCode() * 31;
        AnimatedBackgroundType animatedBackgroundType = this.f194182b;
        return this.f194183c.hashCode() + ((iHashCode + (animatedBackgroundType == null ? 0 : animatedBackgroundType.hashCode())) * 31);
    }
}
