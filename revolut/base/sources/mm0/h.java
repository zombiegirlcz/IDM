package mm0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f207108a;

    public h(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f207108a = value;
    }

    public final String a() {
        return this.f207108a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f207108a, ((h) obj2).f207108a);
    }

    public final int hashCode() {
        return this.f207108a.hashCode();
    }
}
