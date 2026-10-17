package nme;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class y extends com.revolut.feature.tab.lifestyle.impl.ui.screen.b {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f217320a;

    public y(boolean z) {
        this.f217320a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && this.f217320a == ((y) obj2).f217320a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f217320a);
    }
}
