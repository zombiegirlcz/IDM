package fij;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f135465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f135466b;

    public y(List tabs, o oVar) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f135465a = tabs;
        this.f135466b = oVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f135465a, yVar.f135465a) && Intrinsics.f(this.f135466b, yVar.f135466b);
    }

    public final int hashCode() {
        int iHashCode = this.f135465a.hashCode() * 31;
        o oVar = this.f135466b;
        return iHashCode + (oVar == null ? 0 : oVar.hashCode());
    }
}
