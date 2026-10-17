package xy3;

import kotlin.jvm.internal.Intrinsics;
import xy3.a;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f309566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f309567c;

    public e(String id10, d confirmation, c change) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(confirmation, "confirmation");
        Intrinsics.checkNotNullParameter(change, "change");
        this.f309565a = id10;
        this.f309566b = confirmation;
        this.f309567c = change;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f309565a, eVar.f309565a) && Intrinsics.f(this.f309566b, eVar.f309566b) && Intrinsics.f(this.f309567c, eVar.f309567c);
    }

    public final int hashCode() {
        return this.f309567c.hashCode() + ((this.f309566b.hashCode() + (this.f309565a.hashCode() * 31)) * 31);
    }
}
