package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class qq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final or f166038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final or f166039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166040c;
    public final boolean d;

    public qq(or inputTextPayload1, or inputTextPayload2, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(inputTextPayload1, "inputTextPayload1");
        Intrinsics.checkNotNullParameter(inputTextPayload2, "inputTextPayload2");
        this.f166038a = inputTextPayload1;
        this.f166039b = inputTextPayload2;
        this.f166040c = z;
        this.d = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qq)) {
            return false;
        }
        qq qqVar = (qq) obj2;
        return Intrinsics.f(this.f166038a, qqVar.f166038a) && Intrinsics.f(this.f166039b, qqVar.f166039b) && this.f166040c == qqVar.f166040c && this.d == qqVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c((this.f166039b.hashCode() + (this.f166038a.hashCode() * 31)) * 31, 31, this.f166040c);
    }
}
