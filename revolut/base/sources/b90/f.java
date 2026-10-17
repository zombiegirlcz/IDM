package b90;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f13525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13527c;

    public f(b destination, String str, List buttonActions) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(buttonActions, "buttonActions");
        this.f13525a = destination;
        this.f13526b = str;
        this.f13527c = buttonActions;
    }

    public final List a() {
        return this.f13527c;
    }

    public final String b() {
        return this.f13526b;
    }

    public final b c() {
        return this.f13525a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f13525a == fVar.f13525a && Intrinsics.f(this.f13526b, fVar.f13526b) && Intrinsics.f(this.f13527c, fVar.f13527c);
    }

    public final int hashCode() {
        int iHashCode = this.f13525a.hashCode() * 31;
        String str = this.f13526b;
        return this.f13527c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public f(b bVar, String str, int i) {
        this(bVar, (i & 2) != 0 ? null : str, f0.f322471a);
    }
}
