package rzj;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f258693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f258694b;

    public e(int i, ArrayList articles) {
        Intrinsics.checkNotNullParameter(articles, "articles");
        this.f258693a = articles;
        this.f258694b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f258693a.equals(eVar.f258693a) && this.f258694b == eVar.f258694b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f258694b) + (this.f258693a.hashCode() * 31);
    }
}
