package mwk;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f209515a;

    public j(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f209515a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f209515a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f209515a.equals(((j) obj2).f209515a);
    }

    public final int hashCode() {
        return this.f209515a.hashCode();
    }
}
