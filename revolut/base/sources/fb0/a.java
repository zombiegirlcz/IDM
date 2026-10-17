package fb0;

import kotlin.jvm.internal.Intrinsics;
import lk0.f;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f133424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f133425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fc0.a f133426c;

    public a(long j2, String searchQuery, fc0.a mode) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f133424a = j2;
        this.f133425b = searchQuery;
        this.f133426c = mode;
    }

    @Override // lk0.f
    /* JADX INFO: renamed from: a */
    public final int getF84104a() {
        throw new IllegalStateException("Use `createdSince` instead");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f133424a == aVar.f133424a && Intrinsics.f(this.f133425b, aVar.f133425b) && this.f133426c == aVar.f133426c;
    }

    public final int hashCode() {
        return this.f133426c.hashCode() + p.a.c(Long.hashCode(this.f133424a) * 31, 31, this.f133425b);
    }
}
