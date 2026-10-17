package bxf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f19682c;

    public f(String key, String name, List tickets) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tickets, "tickets");
        this.f19680a = key;
        this.f19681b = name;
        this.f19682c = tickets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f19680a, fVar.f19680a) && Intrinsics.f(this.f19681b, fVar.f19681b) && Intrinsics.f(this.f19682c, fVar.f19682c);
    }

    public final int hashCode() {
        return this.f19682c.hashCode() + p.a.c(this.f19680a.hashCode() * 31, 31, this.f19681b);
    }
}
