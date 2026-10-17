package cw1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109527b;

    public c(String keyValue, String ownerAgent) {
        Intrinsics.checkNotNullParameter(keyValue, "keyValue");
        Intrinsics.checkNotNullParameter(ownerAgent, "ownerAgent");
        this.f109526a = keyValue;
        this.f109527b = ownerAgent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f109526a, cVar.f109526a) && Intrinsics.f(this.f109527b, cVar.f109527b);
    }

    public final int hashCode() {
        return this.f109527b.hashCode() + (this.f109526a.hashCode() * 31);
    }
}
