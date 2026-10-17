package adb;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3319a;

    public l(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f3319a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f3319a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f3319a.equals(((l) obj2).f3319a);
    }

    public final int hashCode() {
        return this.f3319a.hashCode();
    }
}
