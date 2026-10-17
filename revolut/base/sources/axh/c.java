package axh;

import axh.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10942a;

    public c(String html) {
        Intrinsics.checkNotNullParameter(html, "html");
        this.f10942a = html;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f10942a, ((c) obj2).f10942a);
    }

    public final int hashCode() {
        return this.f10942a.hashCode();
    }
}
