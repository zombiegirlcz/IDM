package zph;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f324306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f324307b;

    public i(List values, b selectionState) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(selectionState, "selectionState");
        this.f324306a = values;
        this.f324307b = selectionState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f324306a, iVar.f324306a) && this.f324307b == iVar.f324307b;
    }

    public final int hashCode() {
        return this.f324307b.hashCode() + (this.f324306a.hashCode() * 31);
    }
}
