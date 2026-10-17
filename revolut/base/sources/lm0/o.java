package lm0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f196850a;

    public o(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f196850a = content;
    }

    @Override // lm0.p
    public final String a() {
        return this.f196850a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f196850a, ((o) obj2).f196850a);
    }

    public final int hashCode() {
        return this.f196850a.hashCode();
    }
}
