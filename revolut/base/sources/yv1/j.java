package yv1;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f317090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw0.a f317091b;

    public j(ArrayList items, lw0.a headerModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        this.f317090a = items;
        this.f317091b = headerModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f317090a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f317090a.equals(jVar.f317090a) && this.f317091b.equals(jVar.f317091b);
    }

    public final int hashCode() {
        return this.f317091b.hashCode() + (this.f317090a.hashCode() * 31);
    }
}
