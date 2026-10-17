package sxa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f266386b;

    public c(String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f266385a = title;
        this.f266386b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f266385a, cVar.f266385a) && Intrinsics.f(this.f266386b, cVar.f266386b);
    }

    public final int hashCode() {
        return this.f266386b.hashCode() + (this.f266385a.hashCode() * 31);
    }
}
