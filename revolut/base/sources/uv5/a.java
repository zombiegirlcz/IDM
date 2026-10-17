package uv5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f283302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f283303c;
    public final String d;
    public final long e;

    public a(long j2, String id10, String title, String body, String prompt) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        this.f283301a = id10;
        this.f283302b = title;
        this.f283303c = body;
        this.d = prompt;
        this.e = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f283301a, aVar.f283301a) && Intrinsics.f(this.f283302b, aVar.f283302b) && Intrinsics.f(this.f283303c, aVar.f283303c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + p.a.c(p.a.c(p.a.c(this.f283301a.hashCode() * 31, 31, this.f283302b), 31, this.f283303c), 31, this.d);
    }
}
