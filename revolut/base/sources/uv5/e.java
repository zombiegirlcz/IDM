package uv5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f283312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f283313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f283314c;
    public final String d;
    public final long e;

    public e(f id10, c sentiment, String title, String description, long j2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(sentiment, "sentiment");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f283312a = id10;
        this.f283313b = sentiment;
        this.f283314c = title;
        this.d = description;
        this.e = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f283312a == eVar.f283312a && this.f283313b == eVar.f283313b && Intrinsics.f(this.f283314c, eVar.f283314c) && Intrinsics.f(this.d, eVar.d) && this.e == eVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + p.a.c(p.a.c((this.f283313b.hashCode() + (this.f283312a.hashCode() * 31)) * 31, 31, this.f283314c), 31, this.d);
    }
}
