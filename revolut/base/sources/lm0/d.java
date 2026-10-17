package lm0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f196839a;

    public d(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f196839a = content;
    }

    @Override // lm0.p
    public final String a() {
        return this.f196839a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f196839a, ((d) obj2).f196839a);
    }

    public final int hashCode() {
        return this.f196839a.hashCode();
    }
}
