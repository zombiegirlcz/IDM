package cnk;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f25458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundType f25459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f25460c;

    public k(lw0.a header, AnimatedBackgroundType animatedBackgroundType, aw0.i iVar) {
        Intrinsics.checkNotNullParameter(header, "header");
        this.f25458a = header;
        this.f25459b = animatedBackgroundType;
        this.f25460c = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f25458a, kVar.f25458a) && Intrinsics.f(this.f25459b, kVar.f25459b) && Intrinsics.f(this.f25460c, kVar.f25460c);
    }

    public final int hashCode() {
        int iHashCode = this.f25458a.hashCode() * 31;
        AnimatedBackgroundType animatedBackgroundType = this.f25459b;
        int iHashCode2 = (iHashCode + (animatedBackgroundType == null ? 0 : animatedBackgroundType.hashCode())) * 31;
        aw0.i iVar = this.f25460c;
        return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }
}
