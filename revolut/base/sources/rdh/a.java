package rdh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f253457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f253458b;

    public a(b scope, String content) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f253457a = scope;
        this.f253458b = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f253457a == aVar.f253457a && Intrinsics.f(this.f253458b, aVar.f253458b);
    }

    public final int hashCode() {
        return this.f253458b.hashCode() + (this.f253457a.hashCode() * 31);
    }
}
