package wbi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296222a;

    public c(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f296222a = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f296222a, ((c) obj2).f296222a);
    }

    public final int hashCode() {
        return this.f296222a.hashCode();
    }
}
