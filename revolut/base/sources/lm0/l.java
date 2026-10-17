package lm0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f196847a;

    public l(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f196847a = content;
    }

    @Override // lm0.p
    public final String a() {
        return this.f196847a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f196847a, ((l) obj2).f196847a);
    }

    public final int hashCode() {
        return this.f196847a.hashCode();
    }
}
