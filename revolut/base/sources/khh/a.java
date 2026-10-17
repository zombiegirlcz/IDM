package khh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hel.b f184142a;

    public a(hel.b tradingContext) {
        Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
        this.f184142a = tradingContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f184142a == ((a) obj2).f184142a;
    }

    public final int hashCode() {
        return this.f184142a.hashCode();
    }
}
