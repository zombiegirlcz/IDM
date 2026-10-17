package ytj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f316826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.e f316827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f316828c;
    public final List d;

    public r(q toolbarState, aw0.e footerModel, boolean z, List items) {
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        Intrinsics.checkNotNullParameter(footerModel, "footerModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f316826a = toolbarState;
        this.f316827b = footerModel;
        this.f316828c = z;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f316826a.equals(rVar.f316826a) && this.f316827b.equals(rVar.f316827b) && this.f316828c == rVar.f316828c && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(ehe.n.c(this.f316827b, this.f316826a.hashCode() * 31, 31), 31, this.f316828c);
    }
}
