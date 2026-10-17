package gra;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f145959c;
    public final boolean d;

    public c(String listId, String rawValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        this.f145957a = listId;
        this.f145958b = rawValue;
        this.f145959c = formattedValue;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f145957a, cVar.f145957a) && Intrinsics.f(this.f145958b, cVar.f145958b) && Intrinsics.f(this.f145959c, cVar.f145959c) && this.d == cVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.c(p.a.c(this.f145957a.hashCode() * 31, 31, this.f145958b), 31, this.f145959c);
    }
}
