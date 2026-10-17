package vc2;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f287616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f287617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f287618c;

    public b(Map settings, List aliases, List availableAliases) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(aliases, "aliases");
        Intrinsics.checkNotNullParameter(availableAliases, "availableAliases");
        this.f287616a = settings;
        this.f287617b = aliases;
        this.f287618c = availableAliases;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f287616a, bVar.f287616a) && Intrinsics.f(this.f287617b, bVar.f287617b) && Intrinsics.f(this.f287618c, bVar.f287618c);
    }

    public final int hashCode() {
        return this.f287618c.hashCode() + p.a.d(this.f287616a.hashCode() * 31, 31, this.f287617b);
    }
}
