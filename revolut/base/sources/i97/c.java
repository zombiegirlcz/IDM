package i97;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f159586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f159587c;

    public c(String query, Set types, String context) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f159585a = query;
        this.f159586b = types;
        this.f159587c = context;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f159585a, cVar.f159585a) && Intrinsics.f(this.f159586b, cVar.f159586b) && Intrinsics.f(this.f159587c, cVar.f159587c);
    }

    public final int hashCode() {
        return this.f159587c.hashCode() + p.a.f(this.f159585a.hashCode() * 31, 31, this.f159586b);
    }
}
