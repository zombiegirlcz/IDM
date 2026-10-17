package yn;

import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import uo.s;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f315072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f315073b;

    public a(s analyticsSessionIdProvider) {
        Intrinsics.checkNotNullParameter(analyticsSessionIdProvider, "analyticsSessionIdProvider");
        this.f315072a = analyticsSessionIdProvider;
        this.f315073b = new HashSet();
    }

    public final boolean a(String hash) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        String strA = this.f315072a.a();
        return !this.f315073b.contains(strA + hash);
    }

    public final void b(String hash) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        this.f315073b.add(this.f315072a.a() + hash);
    }
}
