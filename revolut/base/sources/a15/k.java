package a15;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f538a;

    public k(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f538a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f538a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f538a.equals(((k) obj2).f538a);
    }

    public final int hashCode() {
        return this.f538a.hashCode();
    }
}
