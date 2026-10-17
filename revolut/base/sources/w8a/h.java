package w8a;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f295630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw0.a f295631b;

    public h(ArrayList items, lw0.a headerModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        this.f295630a = items;
        this.f295631b = headerModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f295630a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f295630a.equals(hVar.f295630a) && this.f295631b.equals(hVar.f295631b);
    }

    public final int hashCode() {
        return this.f295631b.hashCode() + (this.f295630a.hashCode() * 31);
    }
}
