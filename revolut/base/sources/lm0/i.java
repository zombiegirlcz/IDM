package lm0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f196844a;

    public i(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f196844a = content;
    }

    @Override // lm0.p
    public final String a() {
        return this.f196844a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f196844a, ((i) obj2).f196844a);
    }

    public final int hashCode() {
        return this.f196844a.hashCode();
    }
}
