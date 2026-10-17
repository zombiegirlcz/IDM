package s28;

import kotlin.jvm.internal.Intrinsics;
import rzj.k;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f259255a;

    public a(k news) {
        Intrinsics.checkNotNullParameter(news, "news");
        this.f259255a = news;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f259255a, ((a) obj2).f259255a);
    }

    public final int hashCode() {
        return this.f259255a.hashCode();
    }
}
