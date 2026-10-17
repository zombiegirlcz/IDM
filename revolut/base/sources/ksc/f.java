package ksc;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f189416a;

    public f(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f189416a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f189416a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f189416a.equals(((f) obj2).f189416a);
    }

    public final int hashCode() {
        return this.f189416a.hashCode();
    }
}
