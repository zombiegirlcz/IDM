package lm0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f196849a;

    public n(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f196849a = content;
    }

    @Override // lm0.p
    public final String a() {
        return this.f196849a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f196849a, ((n) obj2).f196849a);
    }

    public final int hashCode() {
        return this.f196849a.hashCode();
    }
}
