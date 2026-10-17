package dx4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s2 implements y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f120763b;

    public s2(String str, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f120762a = str;
        this.f120763b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj2;
        return Intrinsics.f(this.f120762a, s2Var.f120762a) && Intrinsics.f(this.f120763b, s2Var.f120763b);
    }

    public final int hashCode() {
        String str = this.f120762a;
        return this.f120763b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
