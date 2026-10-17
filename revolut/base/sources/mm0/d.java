package mm0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f207106a;

    public d(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f207106a = value;
    }

    @Override // mm0.c
    public final String a() {
        return this.f207106a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f207106a, ((d) obj2).f207106a);
    }

    public final int hashCode() {
        return this.f207106a.hashCode();
    }
}
