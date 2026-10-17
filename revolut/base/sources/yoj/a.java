package yoj;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f315682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f315683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f315684c;
    public final Map d;

    public a(c name, d state, List invites, Map properties) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(invites, "invites");
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.f315682a = name;
        this.f315683b = state;
        this.f315684c = invites;
        this.d = properties;
    }

    public final c a() {
        return this.f315682a;
    }

    public final d b() {
        return this.f315683b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f315682a == aVar.f315682a && this.f315683b == aVar.f315683b && Intrinsics.f(this.f315684c, aVar.f315684c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d((this.f315683b.hashCode() + (this.f315682a.hashCode() * 31)) * 31, 31, this.f315684c);
    }
}
