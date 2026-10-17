package lm0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f196846a;

    public k(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f196846a = content;
    }

    @Override // lm0.p
    public final String a() {
        return this.f196846a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f196846a, ((k) obj2).f196846a);
    }

    public final int hashCode() {
        return this.f196846a.hashCode();
    }
}
