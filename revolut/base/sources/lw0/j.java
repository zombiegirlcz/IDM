package lw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fw0.b f200399b;

    public j(String id10, fw0.b model) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f200398a = id10;
        this.f200399b = model;
    }

    @Override // lw0.l
    public final String a() {
        return this.f200398a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f200398a, jVar.f200398a) && Intrinsics.f(this.f200399b, jVar.f200399b);
    }

    public final int hashCode() {
        return this.f200399b.hashCode() + (this.f200398a.hashCode() * 31);
    }
}
