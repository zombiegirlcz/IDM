package jjj;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f175002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f175003b;

    public i(ArrayList items, e navBarConfig) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        this.f175002a = items;
        this.f175003b = navBarConfig;
    }

    @Override // cli.p
    public final List c() {
        return this.f175002a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f175002a.equals(iVar.f175002a) && this.f175003b.equals(iVar.f175003b);
    }

    public final int hashCode() {
        return this.f175003b.hashCode() + (this.f175002a.hashCode() * 31);
    }
}
