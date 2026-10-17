package t4a;

import kotlin.jvm.internal.Intrinsics;
import zm3.p;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f267964a;

    public k(p contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f267964a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f267964a, ((k) obj2).f267964a);
    }

    public final int hashCode() {
        return this.f267964a.hashCode();
    }
}
