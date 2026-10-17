package ux0;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimatedBackgroundType f283738a;

    public b0(AnimatedBackgroundType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f283738a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && Intrinsics.f(this.f283738a, ((b0) obj2).f283738a);
    }

    public final int hashCode() {
        return this.f283738a.hashCode();
    }
}
