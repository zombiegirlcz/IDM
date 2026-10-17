package cfd;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f23682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f23683b;

    public f(ArrayList items, lw0.a header) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f23682a = header;
        this.f23683b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f23683b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f23682a.equals(fVar.f23682a) && this.f23683b.equals(fVar.f23683b);
    }

    public final int hashCode() {
        return this.f23683b.hashCode() + (this.f23682a.hashCode() * 31);
    }
}
