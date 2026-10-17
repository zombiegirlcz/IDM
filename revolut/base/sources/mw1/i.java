package mw1;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f209307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw0.a f209308b;

    public i(ArrayList items, lw0.a headerModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        this.f209307a = items;
        this.f209308b = headerModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f209307a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f209307a.equals(iVar.f209307a) && this.f209308b.equals(iVar.f209308b);
    }

    public final int hashCode() {
        return this.f209308b.hashCode() + (this.f209307a.hashCode() * 31);
    }
}
