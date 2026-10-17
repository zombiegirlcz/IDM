package pt4;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f239602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f239603b;

    public b(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f239602a = items;
        this.f239603b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f239602a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f239602a.equals(bVar.f239602a) && this.f239603b == bVar.f239603b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f239603b) + (this.f239602a.hashCode() * 31);
    }
}
