package r6g;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f251846a;

    public k(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f251846a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f251846a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f251846a.equals(((k) obj2).f251846a);
    }

    public final int hashCode() {
        return this.f251846a.hashCode();
    }
}
