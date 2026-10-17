package lm0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f196843a;

    public h(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f196843a = content;
    }

    @Override // lm0.p
    public final String a() {
        return this.f196843a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f196843a, ((h) obj2).f196843a);
    }

    public final int hashCode() {
        return this.f196843a.hashCode();
    }
}
