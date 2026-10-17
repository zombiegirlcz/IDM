package ith;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f168388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f168389b;

    public i(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f168388a = items;
        this.f168389b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f168388a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f168388a.equals(iVar.f168388a) && this.f168389b == iVar.f168389b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f168389b) + (this.f168388a.hashCode() * 31);
    }
}
