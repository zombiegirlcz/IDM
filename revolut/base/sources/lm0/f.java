package lm0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f196841a;

    public f(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f196841a = content;
    }

    @Override // lm0.p
    public final String a() {
        return this.f196841a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f196841a, ((f) obj2).f196841a);
    }

    public final int hashCode() {
        return this.f196841a.hashCode();
    }
}
