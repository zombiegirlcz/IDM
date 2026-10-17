package oy9;

import kotlin.jvm.internal.Intrinsics;
import zm3.l;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f230921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f230922b;

    public g(l contact, boolean z) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f230921a = contact;
        this.f230922b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f230921a, gVar.f230921a) && this.f230922b == gVar.f230922b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f230922b) + (this.f230921a.hashCode() * 31);
    }
}
