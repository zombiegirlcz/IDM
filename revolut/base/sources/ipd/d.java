package ipd;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimatedBackgroundType.Base f167735a;

    public d(AnimatedBackgroundType.Base type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f167735a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f167735a == ((d) obj2).f167735a;
    }

    public final int hashCode() {
        return this.f167735a.hashCode();
    }
}
