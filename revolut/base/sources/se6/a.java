package se6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f262119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f262120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f262121c;

    public a(String title, String message, String summary) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(summary, "summary");
        this.f262119a = title;
        this.f262120b = message;
        this.f262121c = summary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f262119a, aVar.f262119a) && Intrinsics.f(this.f262120b, aVar.f262120b) && Intrinsics.f(this.f262121c, aVar.f262121c);
    }

    public final int hashCode() {
        return this.f262121c.hashCode() + p.a.c(this.f262119a.hashCode() * 31, 31, this.f262120b);
    }
}
