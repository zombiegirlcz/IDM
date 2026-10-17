package ft4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class v implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f137929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f137930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f137931c;
    public final boolean d;

    public v(u toolbarModel, List items, t buttonModel, boolean z) {
        Intrinsics.checkNotNullParameter(toolbarModel, "toolbarModel");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonModel, "buttonModel");
        this.f137929a = toolbarModel;
        this.f137930b = items;
        this.f137931c = buttonModel;
        this.d = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f137930b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f137929a, vVar.f137929a) && Intrinsics.f(this.f137930b, vVar.f137930b) && Intrinsics.f(this.f137931c, vVar.f137931c) && this.d == vVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f137931c.hashCode() + p.a.d(this.f137929a.hashCode() * 31, 31, this.f137930b)) * 31);
    }
}
