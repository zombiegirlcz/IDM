package p5f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f233121a;

    public f(String str) {
        this.f233121a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f233121a, ((f) obj2).f233121a);
    }

    public final int hashCode() {
        String str = this.f233121a;
        return (str == null ? 0 : str.hashCode()) * 31;
    }
}
