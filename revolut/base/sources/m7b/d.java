package m7b;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f203368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw0.a f203369b;

    public d(ArrayList items, lw0.a headerModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        this.f203368a = items;
        this.f203369b = headerModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f203368a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f203368a.equals(dVar.f203368a) && this.f203369b.equals(dVar.f203369b);
    }

    public final int hashCode() {
        return this.f203369b.hashCode() + (this.f203368a.hashCode() * 31);
    }
}
