package t2a;

import cli.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.core.ui_kit.views.navbar.d f267522a;

    public g(com.revolut.core.ui_kit.views.navbar.d navBarHeaderContent) {
        Intrinsics.checkNotNullParameter(navBarHeaderContent, "navBarHeaderContent");
        this.f267522a = navBarHeaderContent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f267522a.equals(((g) obj2).f267522a);
    }

    public final int hashCode() {
        return this.f267522a.hashCode();
    }
}
