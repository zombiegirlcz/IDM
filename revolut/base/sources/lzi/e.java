package lzi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f200977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f200978b;

    public e(f weekDay, d behaviour) {
        Intrinsics.checkNotNullParameter(weekDay, "weekDay");
        Intrinsics.checkNotNullParameter(behaviour, "behaviour");
        this.f200977a = weekDay;
        this.f200978b = behaviour;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f200977a == eVar.f200977a && this.f200978b == eVar.f200978b;
    }

    public final int hashCode() {
        return this.f200978b.hashCode() + (this.f200977a.hashCode() * 31);
    }

    public /* synthetic */ e(d dVar) {
        this(f.MONDAY, dVar);
    }
}
