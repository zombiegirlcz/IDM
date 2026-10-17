package cfi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f23697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23698b;

    public c(b type, String description) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f23697a = type;
        this.f23698b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f23697a == cVar.f23697a && Intrinsics.f(this.f23698b, cVar.f23698b);
    }

    public final int hashCode() {
        return this.f23698b.hashCode() + (this.f23697a.hashCode() * 31);
    }
}
