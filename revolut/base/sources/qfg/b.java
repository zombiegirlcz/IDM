package qfg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f245301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f245302c;
    public final List d;

    public b(String id10, String externalId, h provider, List list) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f245300a = id10;
        this.f245301b = externalId;
        this.f245302c = provider;
        this.d = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f245300a, bVar.f245300a) && Intrinsics.f(this.f245301b, bVar.f245301b) && Intrinsics.f(this.f245302c, bVar.f245302c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f245302c.hashCode() + p.a.c(this.f245300a.hashCode() * 31, 31, this.f245301b)) * 31;
        List list = this.d;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
