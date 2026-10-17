package lm0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f196838a;

    public c(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f196838a = content;
    }

    @Override // lm0.p
    public final String a() {
        return this.f196838a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f196838a, ((c) obj2).f196838a);
    }

    public final int hashCode() {
        return this.f196838a.hashCode();
    }
}
