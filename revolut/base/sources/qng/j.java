package qng;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f247945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f247946b;

    public j(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f247945a = items;
        this.f247946b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f247945a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f247945a.equals(jVar.f247945a) && this.f247946b == jVar.f247946b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f247946b) + (this.f247945a.hashCode() * 31);
    }
}
