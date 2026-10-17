package ty8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f275523a;

    public k(e error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f275523a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f275523a == ((k) obj2).f275523a;
    }

    public final int hashCode() {
        return this.f275523a.hashCode();
    }
}
