package amk;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f6470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f6471b;

    public f(ArrayList items, lw0.a aVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f6470a = aVar;
        this.f6471b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f6471b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f6470a, fVar.f6470a) && this.f6471b.equals(fVar.f6471b);
    }

    public final int hashCode() {
        lw0.a aVar = this.f6470a;
        return this.f6471b.hashCode() + ((aVar == null ? 0 : aVar.hashCode()) * 31);
    }
}
