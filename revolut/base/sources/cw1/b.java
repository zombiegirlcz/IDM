package cw1;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109525b;

    public b(String keyValue, String ownerAgent) {
        Intrinsics.checkNotNullParameter(keyValue, "keyValue");
        Intrinsics.checkNotNullParameter(ownerAgent, "ownerAgent");
        this.f109524a = keyValue;
        this.f109525b = ownerAgent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f109524a, bVar.f109524a) && Intrinsics.f(this.f109525b, bVar.f109525b);
    }

    public final int hashCode() {
        return this.f109525b.hashCode() + (this.f109524a.hashCode() * 31);
    }
}
