package js4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f178128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f178129b;

    public h(List items, g buttonModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonModel, "buttonModel");
        this.f178128a = items;
        this.f178129b = buttonModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f178128a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f178128a, hVar.f178128a) && Intrinsics.f(this.f178129b, hVar.f178129b);
    }

    public final int hashCode() {
        return this.f178129b.hashCode() + (this.f178128a.hashCode() * 31);
    }
}
