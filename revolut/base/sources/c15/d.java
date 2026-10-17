package c15;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20380a;

    public d(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f20380a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f20380a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f20380a.equals(((d) obj2).f20380a);
    }

    public final int hashCode() {
        return this.f20380a.hashCode();
    }
}
