package lm0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f196842a;

    public g(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f196842a = content;
    }

    @Override // lm0.p
    public final String a() {
        return this.f196842a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f196842a, ((g) obj2).f196842a);
    }

    public final int hashCode() {
        return this.f196842a.hashCode();
    }
}
