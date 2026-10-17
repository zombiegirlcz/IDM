package u4e;

import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SmallActionButtonDelegate f277320a;

    public c(SmallActionButtonDelegate buttonDelegate) {
        Intrinsics.checkNotNullParameter(buttonDelegate, "buttonDelegate");
        this.f277320a = buttonDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f277320a, ((c) obj2).f277320a);
    }

    public final int hashCode() {
        return this.f277320a.hashCode();
    }
}
