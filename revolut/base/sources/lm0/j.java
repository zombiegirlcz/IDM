package lm0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f196845a;

    public j(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f196845a = content;
    }

    @Override // lm0.p
    public final String a() {
        return this.f196845a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f196845a, ((j) obj2).f196845a);
    }

    public final int hashCode() {
        return this.f196845a.hashCode();
    }
}
