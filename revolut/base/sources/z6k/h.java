package z6k;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f319790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f319791b;

    public h(List items, f model) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f319790a = items;
        this.f319791b = model;
    }

    @Override // cli.p
    public final List c() {
        return this.f319790a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f319790a, hVar.f319790a) && Intrinsics.f(this.f319791b, hVar.f319791b);
    }

    public final int hashCode() {
        return this.f319791b.hashCode() + (this.f319790a.hashCode() * 31);
    }
}
