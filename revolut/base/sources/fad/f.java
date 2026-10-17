package fad;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f133282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f133283b;

    public f(e header, ArrayList items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f133282a = header;
        this.f133283b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f133283b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f133282a.equals(fVar.f133282a) && this.f133283b.equals(fVar.f133283b);
    }

    public final int hashCode() {
        return this.f133283b.hashCode() + (this.f133282a.hashCode() * 31);
    }
}
