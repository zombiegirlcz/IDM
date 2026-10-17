package axh;

import axh.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10938a;

    public a(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f10938a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f10938a, ((a) obj2).f10938a);
    }

    public final int hashCode() {
        return this.f10938a.hashCode();
    }
}
