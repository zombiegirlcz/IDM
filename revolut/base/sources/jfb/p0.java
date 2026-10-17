package jfb;

import com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebResourceException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p0 extends com.revolut.feature.retail.reverywhere.impl.web_app.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReverywhereWebResourceException f173831a;

    public p0(ReverywhereWebResourceException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f173831a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p0) && Intrinsics.f(this.f173831a, ((p0) obj2).f173831a);
    }

    public final int hashCode() {
        return this.f173831a.hashCode();
    }
}
