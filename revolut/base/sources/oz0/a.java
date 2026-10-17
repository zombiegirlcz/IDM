package oz0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f231097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f231098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f231099c;

    public a(int i, String message, Throwable th10) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f231097a = i;
        this.f231098b = message;
        this.f231099c = th10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f231097a == aVar.f231097a && Intrinsics.f(this.f231098b, aVar.f231098b) && Intrinsics.f(this.f231099c, aVar.f231099c);
    }

    public final int hashCode() {
        int iC = p.a.c(Integer.hashCode(this.f231097a) * 31, 31, this.f231098b);
        Throwable th10 = this.f231099c;
        return iC + (th10 == null ? 0 : th10.hashCode());
    }
}
