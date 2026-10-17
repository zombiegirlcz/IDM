package lm0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f196840a;

    public e(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f196840a = content;
    }

    @Override // lm0.p
    public final String a() {
        return this.f196840a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f196840a, ((e) obj2).f196840a);
    }

    public final int hashCode() {
        return this.f196840a.hashCode();
    }
}
