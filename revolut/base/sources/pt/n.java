package pt;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f239564a;

    public n(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f239564a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f239564a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f239564a.equals(((n) obj2).f239564a);
    }

    public final int hashCode() {
        return this.f239564a.hashCode();
    }
}
