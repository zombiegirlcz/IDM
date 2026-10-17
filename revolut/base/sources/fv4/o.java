package fv4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f138337b;

    public o(String str, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f138336a = str;
        this.f138337b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f138336a, oVar.f138336a) && Intrinsics.f(this.f138337b, oVar.f138337b);
    }

    public final int hashCode() {
        String str = this.f138336a;
        return this.f138337b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
