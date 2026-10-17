package muk;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f209046a;

    public k(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f209046a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f209046a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f209046a.equals(((k) obj2).f209046a);
    }

    public final int hashCode() {
        return this.f209046a.hashCode();
    }
}
