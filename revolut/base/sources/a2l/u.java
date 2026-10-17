package a2l;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f929b;

    public u(ArrayList items, j jVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f928a = items;
        this.f929b = jVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f928a.equals(uVar.f928a) && Intrinsics.f(this.f929b, uVar.f929b);
    }

    public final int hashCode() {
        int iHashCode = this.f928a.hashCode() * 31;
        j jVar = this.f929b;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }
}
