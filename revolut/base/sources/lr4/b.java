package lr4;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yw4.a f199392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f199393b;

    public b(yw4.a selected, ArrayList options) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f199392a = selected;
        this.f199393b = options;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f199392a == bVar.f199392a && this.f199393b.equals(bVar.f199393b);
    }

    public final int hashCode() {
        return this.f199393b.hashCode() + (this.f199392a.hashCode() * 31);
    }
}
